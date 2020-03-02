package com.company;

public class Main {

    public static void main(String[] args) {
        Electrodomestico listaElectrodomesticos[] = new Electrodomestico[10];
        double precioElectrodomesticos = 0;
        double precioLavadoras = 0;
        double precioTelevisores = 0;

        listaElectrodomesticos[0] = new Lavadora(862, 45);
        listaElectrodomesticos[1] = new Televisor(450, true, 0, "gris", 'B', 30);
        listaElectrodomesticos[2] = new Electrodomestico(200, "rojo", 'F', 28);
        listaElectrodomesticos[3] = new Electrodomestico(376, "verde", 'D', 17);
        listaElectrodomesticos[4] = new Televisor(1700, 45);
        listaElectrodomesticos[5] = new Lavadora(340, 78, "blanco", 'A', 56);
        listaElectrodomesticos[6] = new Electrodomestico(60, 14);
        listaElectrodomesticos[7] = new Televisor(450, true, 0, "gris", 'B', 30);
        listaElectrodomesticos[8] = new Lavadora(560, 58, "negro", 'C', 34);
        listaElectrodomesticos[9] = new Televisor(200, false, 67, "naranja", 'B', 80);

        for (int i = 0; i < listaElectrodomesticos.length; i++) {

            System.out.println("El precio final del electrodomestico "
                    + i + " es :" + listaElectrodomesticos[i].precioFinal());
            if (listaElectrodomesticos[i] instanceof Electrodomestico) {
                precioElectrodomesticos += listaElectrodomesticos[i].precioFinal();
            }
            if (listaElectrodomesticos[i] instanceof Lavadora) {
                precioLavadoras += listaElectrodomesticos[i].precioFinal();
            } else {
                precioTelevisores += listaElectrodomesticos[i].precioFinal();
            }
        }

        System.out.println("El precio total para los electrodomesticos es de: " + precioElectrodomesticos
                + ", el precio para las lavadoras es de: " + precioLavadoras
                + " y el precio para los televisores es de: " + precioTelevisores);


}
}
