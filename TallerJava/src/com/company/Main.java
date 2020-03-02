package com.company;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.prefs.Preferences;

public class Main {

    public static void main(String[] args) {
        int num1 = 2, num2 = 9;//Declarando variables ejercicio2
        double radio;//Declarando variables ejercicio 3
        double precio;//Declarando variables ejercicio 4
        int numero;//Declarando variables ejercicio 7
        String dia = "";//Declarando variables ejercicio 8
        String fraseAgregada;//Declarando variables ejercicio 9
        String miFrase = "";//Declarando variables ejercicio 10
        String palabra1, palabra2;//Declarando variables ejercicio 12
        int miNumero = 0;//Declarando variables ejercico 14

        //Ejercicio 1
        System.out.println(comparacion(num1, num2));

        //Ejercicio 2
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num1 = teclado.nextInt();
        System.out.println("Ingrese un numero");
        num2 = teclado.nextInt();
        System.out.println(comparacion(num1, num2));

        //Ejercicio 3
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del radio del circulo"));
        System.out.println("El area del circulo es de " + calcularArea(radio));

        //Ejercicio 4
        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
        System.out.println("El precio final del producto es de: " + precioFinal(precio));

        //Ejercicio 5
        parImparWhile();

        //Ejercicio 6
        parImparFor();

        //Ejercicio 7
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        } while (numero < 0);
        System.out.println(numero);

        //Ejercicio 8
        dia = JOptionPane.showInputDialog("Ingrese un dia de la semana en minusculas");
        System.out.println("El " + dia + " " + verificarDia(dia));

        //Ejercicio 9
        fraseAgregada = JOptionPane.showInputDialog("Ingrese frase a agregar");
        System.out.println("Su nueva frase es: " + modificarFrase(fraseAgregada));

        //Ejercico10
        miFrase = JOptionPane.showInputDialog("Ingrese frase para eliminar sus espacios en blanco");
        System.out.println("La frase sin espacios es: " + quitarEspacios(miFrase));

        //Ejericio 11
        miFrase = JOptionPane.showInputDialog("Ingrese frase para calcular su logitud y numero de vocales");
        System.out.println("La longitud de la frase es de: " + longitudFrase(miFrase));
        System.out.println("La frase tiene " + contarVocales(miFrase) + " vocales");

        //Ejercicio 12 (TERMINAR EJERCICIO)
        palabra1 = JOptionPane.showInputDialog("Ingrese una palabra");
        palabra2 = JOptionPane.showInputDialog("Ingrese otra palabra");
        diferenciaDePalabras(palabra1, palabra2);

        //Ejercicio 13
        System.out.println(obtenerFecha());

        //Ejercicio 14
        miNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        contarDeADos(miNumero);

        //Ejercicio 15
        mostrarMenu();
    }

    //Metodo ejercicios 1 y 2
    static String comparacion(int n1, int n2) {
        String result = "";
        if (n1 > n2) {
            result = "El numero mayor es el primero: " + n1;
        } else if (n1 < n2) {
            result = "El numero mayor es el segundo: " + n2;
        } else if (n1 == n2) {
            result = "Los numeros son iguales";
        }
        return result;
    }

    //Metodo de ejercicio 3
    static double calcularArea(double radio) {
        double area;
        return area = Math.PI * (Math.pow(radio, 2));
    }

    //Metodo ejercicio 4
    static double precioFinal(double precio) {
        double precioFinal;
        final double IVA = 0.21;
        return precioFinal = precio + (precio * IVA);
    }

    //Metodo ejercicio 5
    static void parImparWhile() {
        int contador = 0;
        while (contador <= 100) {
            if (contador % 2 == 0) {
                System.out.println("El numero " + contador + " es par");
            } else {
                System.out.println("El numero " + contador + " es impar");
            }
            contador++;
        }
    }

    //Metodo ejercicio 6
    static void parImparFor() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("El numero " + i + " es par");
            } else {
                System.out.println("El numero " + i + " es impar");
            }
        }
    }

    //Metodo ejercicio 8
    static String verificarDia(String dia) {
        String diaVerificado = "";
        switch (dia) {
            case "lunes":
                diaVerificado = "Es dia habil";
                break;
            case "martes":
                diaVerificado = "Es dia habil";
                break;
            case "miercoles":
                diaVerificado = "Es dia habil";
                break;
            case "jueves":
                diaVerificado = "Es dia habil";
                break;
            case "viernes":
                diaVerificado = "Es dia habil";
                break;
            case "sabado":
                diaVerificado = "No es dia habil";
                break;
            case "domingo":
                diaVerificado = "No es dia habil";
                break;
        }
        return diaVerificado;
    }

    //Metodo ejercicio 9
    static String modificarFrase(String fraseAgregada) {
        String frase = "“La sonrisa sera la mejor arma contra la tristeza";
        String nuevaFrase = "";
        frase = frase.replace("a", "e");
        nuevaFrase = frase + " " + fraseAgregada;
        return nuevaFrase;
    }

    //Metodo ejercicio 10
    static String quitarEspacios(String miFrase) {
        String nuevaFrase = "";
        nuevaFrase = miFrase.replace(" ", "");
        return nuevaFrase;
    }

    //Metodos ejercicio 11
    static int longitudFrase(String miFrase) {
        int longitud;
        longitud = miFrase.length();
        return longitud;
    }

    static int contarVocales(String miFrase) {
        int contadorVocales = 0;
        for (int i = 0; i < miFrase.length(); i++) {
            if (miFrase.charAt(i) == 'a' || miFrase.charAt(i) == 'e' || miFrase.charAt(i) == 'i' || miFrase.charAt(i) == 'o' || miFrase.charAt(i) == 'u') {
                contadorVocales++;
            }
        }
        return contadorVocales;
    }

    //Metodo ejercicio 12
    static void diferenciaDePalabras(String palabra1, String palabra2) {
        int longitudPalabra = 0;
        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales");//CHECK
        } else {
            if (palabra1.length() <= palabra2.length()) {
                for (int i = 0; i < palabra2.length(); i++) {
                    if (i < palabra1.length()) {
                        if (palabra1.charAt(i) == palabra2.charAt(i)) {
                            System.out.println("El caracter numero " + i + " es igual y es una letra " + palabra1.charAt(i));
                        } else {
                            System.out.println("El caracter numero " + i + " es diferente. La letra en esta posicion para la 1RA PALABRA es: " + palabra1.charAt(i) +
                                    " mientras que para la 2DA PALABRA es: " + palabra2.charAt(i));
                        }//CIERRA ELSE
                    } else {
                        System.out.println("El caracter numero " + i + " es diferente. La letra en esta posicion para la 2DA PALABRA es: " + palabra2.charAt(i) +
                                " mientras que la 1RA PALABRA no tiene letra en esta posicion");

                    }
                }
            } else {
                for (int i = 0; i < palabra1.length(); i++) {
                    if (i < palabra2.length()) {
                        if (palabra2.charAt(i) == palabra1.charAt(i)) {
                            System.out.println("El caracter numero " + i + " es igual y es una letra " + palabra1.charAt(i));
                        } else {
                            System.out.println("El caracter numero " + i + " es diferente. La letra en esta posicion para la 1RA PALABRA es: " + palabra1.charAt(i) +
                                    " mientras que para la 2DA PALABRA es: " + palabra2.charAt(i));
                        }//CIERRA ELSE
                    } else {
                        System.out.println("El caracter numero " + i + " es diferente. La letra en esta posicion para la 1RA PALABRA es: " + palabra1.charAt(i) +
                                " mientras que la 2DA PALABRA no tiene letra en esta posicion");
                    }
                }
            }
        }
    }

    //Metodo ejercicio 13
    static String obtenerFecha() {
        String fechaActual, horaActual;
        Date fecha = new Date();
        DateFormat formatoFecha = new SimpleDateFormat("YYYY/MM/dd");
        DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        fechaActual = formatoFecha.format(fecha);
        horaActual = formatoHora.format(fecha);
        return "La fecha es :" + fechaActual + " y la hora: " + horaActual;
    }

    //Metodo ejercicio 14
    static void contarDeADos(int numero) {

        for (int i = numero; numero <= 1000; numero = numero + 2) {
            System.out.println(numero);
        }
    }

    //Metodos ejecicio 15
    static void mostrarMenu() {
        int seleccion;
        do {
            seleccion = Integer.parseInt(JOptionPane.showInputDialog("******GESTION CINEMATOGRAFICA******\n1-NUEVO ACTOR\n2-BUSCAR ACTOR\n3-ELIMINAR ACTOR\n4-MODIFICAR ACTOR\n5-VER TODOS LOS ACTORES\n" +
                    "6-VER PELICULAS DE LOS ACTORES\n7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n8-SALIR"));
            if (seleccion > 8 || seleccion < 1) {
                JOptionPane.showMessageDialog(null, "OPCION INCORRECTA");
            }
        } while (seleccion != 8);

    }
}
