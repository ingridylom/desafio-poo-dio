package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    // region Properties
    private String nome;
    private Set<Curso> cursosInscritos = new LinkedHashSet<>();
    private Set<Curso> conteudosConcluidos = new LinkedHashSet<>();
    // endregion

    // region Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Curso> getConteudosInscritos() {
        return cursosInscritos;
    }

    public void setConteudosInscritos(Set<Curso> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }

    public Set<Curso> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Curso> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
    // endregion

    // region Methods
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(cursosInscritos, dev.cursosInscritos)
                && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cursosInscritos, conteudosConcluidos);
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.cursosInscritos.addAll(bootcamp.getCursos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Curso> conteudo = this.cursosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.cursosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {
        Iterator<Curso> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while (iterator.hasNext()) {
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;

        /*
         * return this.conteudosConcluidos
         * .stream()
         * .mapToDouble(Curso::calcularXp)
         * .sum();
         */
    }
    // endregion
}
