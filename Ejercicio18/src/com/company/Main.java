package com.company;

public class Main {

    public static void main(String[] args) {

        Serie arraySeries[] = new Serie[5];
        Videojuego arrayVideojuegos[] = new Videojuego[5];
        int numSeriesEntregadas = 0, numVideojuegosEntregados = 0;

        arraySeries[0] = new Serie("YOU", "Greg Berlanti");
        arraySeries[1] = new Serie("Elite", 2, "Suspenso", "Carlos Montero");
        arraySeries[2] = new Serie("Stranger things", "Hermanos Duffer");
        arraySeries[3] = new Serie("La casa de papel", 3, "Accion", "Álex Pina");
        arraySeries[4] = new Serie("Riverdale", "Roberto Aguirre-Sacasa");

        arrayVideojuegos[0] = new Videojuego("Overcooked", 3, "Simulacion", "Ghost Town Games Ltd.");
        arrayVideojuegos[1] = new Videojuego("Just dance", 6, "Musica", "Ubisoft");
        arrayVideojuegos[2] = new Videojuego("Crash Bash", 8);
        arrayVideojuegos[3] = new Videojuego("Spyro the dragon", 6, "Plataformas", "Insomniac games");
        arrayVideojuegos[4] = new Videojuego("Guitar hero world tour", 5);

        arraySeries[2].entregar();
        arraySeries[4].entregar();
        arrayVideojuegos[0].entregar();
        arrayVideojuegos[3].entregar();
        arrayVideojuegos[4].entregar();

        for (int i = 0; i < 5; i++) {
            if (arraySeries[i].entregado()) {
                numSeriesEntregadas += 1;
                arraySeries[i].devolver();
            }
            if (arrayVideojuegos[i].entregado()) {
                numVideojuegosEntregados += 1;
                arrayVideojuegos[i].devolver();
            }
        }

        System.out.println("Hay " + numSeriesEntregadas + " numero de series entregadas y " + numVideojuegosEntregados + " videojuegos");

        Serie serieComparacion = arraySeries[0];
        Videojuego videojuegoComparacion = arrayVideojuegos[0];

        for (int i = 0; i < 5; i++) {
            if (arraySeries[i].compararCon(serieComparacion) == "Es mayor" || arraySeries[i].compararCon(serieComparacion) == "Son iguales") {
                serieComparacion = arraySeries[i];
            }
        }

        for (int i = 0; i < 5; i++) {
            if (arrayVideojuegos[i].compararCon(videojuegoComparacion) == "Es mayor" || arrayVideojuegos[i].compararCon(videojuegoComparacion) == "Son iguales") {
                videojuegoComparacion = arrayVideojuegos[i];
            }
        }

        System.out.println(serieComparacion);
        System.out.println(videojuegoComparacion);
    }
}
