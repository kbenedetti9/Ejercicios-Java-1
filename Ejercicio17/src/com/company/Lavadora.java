package com.company;

public class Lavadora extends Electrodomestico{
    private double carga;
    public final static double CARGA = 5;

    public Lavadora() {
        carga = CARGA;
        precioBase = PRECIO_BASE;
        color = COLOR;
        consumo = CONSUMO_ENERGETICO;
        peso = PESO;
    }

    public Lavadora(int precioBase, double peso) {
        super(precioBase, peso);
        this.color = COLOR;
        this.consumo = CONSUMO_ENERGETICO;
        carga = CARGA;

    }

    public Lavadora(double carga, int precioBase, String color, char consumo, double peso) {
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double total = 0;
        total += super.precioFinal();
        if (carga > 30) {
            total += 50;
        }
        return total;
    }

}
