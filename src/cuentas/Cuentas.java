package cuentas;

import java.util.ArrayList;

public class Cuentas {
    ArrayList<Float> fraccionPoblacionPeriodo = new ArrayList<>();
    ArrayList<Float> poblacionTotalPorPeriodo = new ArrayList<>();

    public Cuentas() {
    }

    public void realizarCuentas(float constante, float fraccionPoblacion, int peridosAnalizar, int poblacionMaxima) {
        System.out.println("Fracción de población por periodo:\n");
        calcularFraccionPoblacion(constante, fraccionPoblacion, peridosAnalizar);

        System.out.println("Cambio de proporcion del periodo:\n");
        calcularCambioDeProporcion();

        System.out.println("Cantidad de población del periodo:\n");
        calcularCantidadDePoblacion(poblacionMaxima);

        System.out.println("Cambio de población del periodo:\n");
        calcularCambioDePoblacion();
    }

    public void calcularFraccionPoblacion(float constante, float fraccionPoblacion, int peridosAnalizar) {

        for (int i = 0; i < (peridosAnalizar + 1); i++) {
            if (fraccionPoblacionPeriodo.isEmpty()) {
                fraccionPoblacionPeriodo.add(fraccionPoblacion);
                System.out.println("P" + (i) + "= " + fraccionPoblacion);
            } else {
                float ultimoValor = fraccionPoblacionPeriodo.get(i - 1);
                float resultado = constante * ultimoValor * (1 - ultimoValor);
                fraccionPoblacionPeriodo.add(resultado);
                System.out.println("P" + (i) + "= " + resultado);
            }

        }
        System.out.println("\n=================================================\n");

    }

    public void calcularCambioDeProporcion() {
        for (int i = 0; i < fraccionPoblacionPeriodo.size(); i++) {
            float valorActual = fraccionPoblacionPeriodo.get(i);
            if (i == 0) {
                System.out.println("El cambio de proporción en el P0" + " es= " + (valorActual));
            } else {
                float ultimoValor = fraccionPoblacionPeriodo.get(i - 1);
                float propocionCambio = (valorActual - ultimoValor);
                System.out.println("El cambio de proporción en el P" + (i) + " es= " + propocionCambio);
            }

        }
        System.out.println("\n=================================================\n");

    }

    public void calcularCantidadDePoblacion(int poblacionMaxima) {
        for (int i = 0; i < fraccionPoblacionPeriodo.size(); i++) {
            float valorActual = fraccionPoblacionPeriodo.get(i);
            float poblacionTotalPeriodo = (valorActual * poblacionMaxima);
            System.out.println("La cantidad de población en el P" + (i) + " es= " + poblacionTotalPeriodo);
            poblacionTotalPorPeriodo.add(poblacionTotalPeriodo);
        }
        System.out.println("\n=================================================\n");

    }

    public void calcularCambioDePoblacion() {
        for (int i = 0; i < poblacionTotalPorPeriodo.size(); i++) {
            float valorActual = poblacionTotalPorPeriodo.get(i);
            if (i == 0) {
                System.out.println("El cambio de poblacion en el P0" + " es= " + (valorActual));
            } else {
                float ultimoValor = poblacionTotalPorPeriodo.get(i - 1);
                float propocionCambio = (valorActual - ultimoValor);
                System.out.println("El cambio de poblacion en el P" + (i) + " es= " + propocionCambio);
            }

        }
        System.out.println("\n=================================================\n");

    }
}