package com.company;

public class Electrodomestico {


        protected int precioBase;
        protected String color;
        protected char consumo;
        protected double peso;

        protected final static int PRECIO_BASE = 100;
        protected final static String COLOR = "blanco";
        protected final static char CONSUMO_ENERGETICO = 'F';
        protected final static double PESO = 5;

        public Electrodomestico() {
            this.precioBase = PRECIO_BASE;
            this.color = COLOR;
            this.consumo = CONSUMO_ENERGETICO;
            this.peso = PESO;
        }

        public Electrodomestico(int precioBase, double peso) {
            this.precioBase = precioBase;
            this.peso = peso;
            this.color = COLOR;
            this.consumo = CONSUMO_ENERGETICO;
        }

        public Electrodomestico(int precioBase, String color, char consumo, double peso) {
            this.precioBase = precioBase;
            this.color = color;
            comprobarConsumo(consumo);
            comprobarColor(color);
        }

        public int getPrecioBase() {
            return precioBase;
        }

        public String getColor() {
            return color;
        }

        public char getConsumo() {
            return consumo;
        }

        public double getPeso() {
            return peso;
        }

        public static int getPRECIO_BASE() {
            return PRECIO_BASE;
        }

        public static String getCOLOR() {
            return COLOR;
        }

        public static char getCONSUMO_ENERGETICO() {
            return CONSUMO_ENERGETICO;
        }

        public static double getPESO() {
            return PESO;
        }

        public void comprobarConsumo(char consumo) {

            char letras[] = {'A', 'B', 'C', 'D', 'E', 'F'};
            boolean encontrado = false;

            for (int i = 0; i < letras.length && !encontrado; i++) {
                if (consumo == letras[i]) {
                    encontrado = true;
                    this.consumo = consumo;
                }
            }

            if (!encontrado) {
                this.consumo = CONSUMO_ENERGETICO;
            }
        }

        public void comprobarColor(String color) {

            String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
            boolean encontrado = false;

            for (int i = 0; i < colores.length && !encontrado; i++) {
                if (color == colores[i]) {
                    encontrado = true;
                    this.color = color;
                }
            }

            if (!encontrado) {
                this.color = COLOR;
            }
        }

        public double precioFinal() {

            double total = 0;

            switch (consumo) {

                case 'A':
                    total += 100;
                    break;
                case 'B':
                    total += 80;
                    break;
                case 'C':
                    total += 60;
                    break;
                case 'D':
                    total += 50;
                    break;
                case 'E':
                    total += 30;
                    break;
                case 'F':
                    total += 10;
                    break;
            }

            if (peso >= 0 && peso <= 19) {
                total += 10;
            } else if (peso >= 20 && peso <= 49) {
                total += 50;
            } else if (peso >= 50 && peso <= 79) {
                total += 80;
            } else if (peso >= 80) {
                total += 100;
            }

            return total;
        }
}
