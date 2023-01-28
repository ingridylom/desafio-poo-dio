package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    // region Properties
    private String nome;
    private Set<Curso> cursosInscritos = new LinkedHashSet<>();
    private Set<Curso> cursosConcluidos = new LinkedHashSet<>();
    private Set<Mentoria> mentoriasInscritas = new LinkedHashSet<>();
    private Set<Mentoria> mentoriasConcluidas = new LinkedHashSet<>();
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
        return cursosConcluidos;
    }

    public void setConteudosConcluidos(Set<Curso> cursosConcluidos) {
        this.cursosConcluidos = cursosConcluidos;
    }

    public Set<Mentoria> getMentoriasInscritas() {
        return mentoriasInscritas;
    }

    public void setMentoriasInscritas(Set<Mentoria> mentoriasInscritas) {
        this.mentoriasInscritas = mentoriasInscritas;
    }

    public Set<Mentoria> getMentoriasConcluidas() {
        return mentoriasConcluidas;
    }

    public void setMentoriasConcluidas(Set<Mentoria> mentoriasConcluidas) {
        this.mentoriasConcluidas = mentoriasConcluidas;
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
                && Objects.equals(cursosConcluidos, dev.cursosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cursosInscritos, cursosConcluidos);
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.cursosInscritos.addAll(bootcamp.getCursos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Curso> curso = this.cursosInscritos.stream().findFirst();
        if (curso.isPresent()) {
            this.cursosConcluidos.add(curso.get());
            this.cursosInscritos.remove(curso.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {
        double soma = 0;
        Iterator<Curso> iteratorCurso = this.cursosConcluidos.iterator();
        Iterator<Mentoria> iteratorMentoria = this.mentoriasConcluidas.iterator();

        while (iteratorCurso.hasNext()) {
            double next = iteratorCurso.next().calcularXp();
            soma += next;
        }

        while (iteratorMentoria.hasNext()) {
            double next = iteratorMentoria.next().calcularXp();
            soma += next;
        }

        return soma;
    }
    // endregion
}
