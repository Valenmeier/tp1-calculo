package controlador;

import cuentas.Cuentas;

import java.util.Scanner;

public class Controlador {

    public Controlador() {
    }

    public void realizarOperaciones() {
        float constante = 0;
        float fraccionPoblacion = 0;
        int peridosAnalizar = 0;
        int poblacionMaxima = 0;

        System.out.println("Bienvenido ingresa los datos a calcular\n" +
                "--------------------------------------------------------\n");
        Scanner input = new Scanner(System.in);

        System.out.println(" Ingresa la constante\n");

        constante = input.nextFloat();
        input.nextLine();

        System.out.println(" Ingresa la fracción de población\n");
        fraccionPoblacion = input.nextFloat();
        input.nextLine();

        System.out.println(" Ingresa la cantidad de periodos a analizar analizar n\n");
        peridosAnalizar = input.nextInt();
        input.nextLine();

        System.out.println(" Ingresa la población máxima\n");
        poblacionMaxima = input.nextInt();
        input.nextLine();

        Cuentas cuentas= new Cuentas();

        cuentas.realizarCuentas(constante,fraccionPoblacion,peridosAnalizar,poblacionMaxima);
    }
}
