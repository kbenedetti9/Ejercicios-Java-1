package com.company;

public class Videojuego implements Entregable {

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;
    private final static int HORAS_ESTIMADAS = 10;

    public Videojuego() {
        titulo = "";
        horasEstimadas = HORAS_ESTIMADAS;
        entregado = false;
        genero = "";
        compania = "";
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        entregado = false;
        genero = "";
        compania = "";
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
        entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
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
        Videojuego videojuegoAComparar = (Videojuego) x;

        if (horasEstimadas > videojuegoAComparar.getHorasEstimadas()) {
            comparacion = "Es mayor";
        } else if (horasEstimadas < videojuegoAComparar.getHorasEstimadas()) {
            comparacion = "Es menor";
        } else {
            comparacion = "Son iguales";
        }
        return comparacion;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }
}
