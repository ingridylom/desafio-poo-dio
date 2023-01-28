package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    public Curso() {
    }

    // region Properties
    private int cargaHoraria;
    // endregion

    // region Getters and setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    // endregion

    // region Methods
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    // endregion
}
