package com.company;

public class Serie implements Entregable {
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;
    private final static int NUMERO_TEMPORADAS = 3;

    public Serie() {
        titulo = "";
        numeroTemporadas = NUMERO_TEMPORADAS;
        entregado = false;
        genero = "";
        creador = "";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        numeroTemporadas = NUMERO_TEMPORADAS;
        entregado = false;
        genero = "";
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
        entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean entregado() {
        if (entregado) {
            return true;
        }
        return false;
    }

    @Override
    public String compararCon(Object x) {
        String comparacion = "";
        Serie serieAComparar = (Serie) x;

        if (numeroTemporadas > serieAComparar.getNumeroTemporadas()) {
            comparacion = "Es mayor";
        } else if (numeroTemporadas < serieAComparar.getNumeroTemporadas()) {
            comparacion = "Es menor";
        } else {
            comparacion = "Son iguales";
        }
        return comparacion;
    }
}
