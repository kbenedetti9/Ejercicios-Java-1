package com.company;

public class Televisor extends Electrodomestico {
    private int resolucion;
    private boolean tdt;

    public final static int RESOLUCION = 20;

    public Televisor() {
        this.precioBase = PRECIO_BASE;
        this.color = COLOR;
        this.consumo = CONSUMO_ENERGETICO;
        this.peso = PESO;
        resolucion = RESOLUCION;
        tdt = false;
    }

    public Televisor(int precioBase, double peso) {
        super(precioBase, peso);
        this.color = COLOR;
        this.consumo = CONSUMO_ENERGETICO;
        resolucion = RESOLUCION;
        tdt = false;
    }

    public Televisor(int resolucion, boolean tdt, int precioBase, String color, char consumo, double peso) {
        super(precioBase, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    @Override
    public double precioFinal() {
        double total = 0;
        total += super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
        if (resolucion > 40) {
            total += total * 0.3;
        }

        if (tdt) {
            total += 50;
        }

        return total;
    }
}
