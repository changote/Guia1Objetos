package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int op=0;
        Scanner input = new Scanner(System.in);

        while(op==0){
            System.out.println("Ingrese el ejercicio a ejecutar:");
            System.out.println("1 - Rectangulo");
            System.out.println("2 - Empleado");
            System.out.println("3 - Item Venta");
            System.out.println("4 - Cuenta de Banco");
            System.out.println("5 - Hora");
            op=input.nextInt();
            if (op<1 || op>5) {
               System.out.println("Ingrese un numero valido...");
                op=0;
            }

        }




        switch (op){
            case 1:
                Rectangulo rectangulo = new Rectangulo(5,10);
                rectangulo.mostrar();

                System.out.println("-----------Nuevo Rectangulo-----------");

                Rectangulo rectanguloNuevo = new Rectangulo(10,20);
                rectanguloNuevo.mostrar();

                break;
            case 2:
                Employe empleado = new Employe(23456345, "Carlos", "Gutierrez",25000);
                Employe empleado2 = new Employe(34234123, "Ana", "Sanchez",27500);
                System.out.println("--------Empleado 1------------");
                empleado.mostrar();
                System.out.println("--------Empleado 2------------");
                empleado2.mostrar();
                float anual=empleado.salarioAnual();
                System.out.println(anual);

                break;
            case 3:
                ItemVenta item = new ItemVenta(30,"Sanguche de miga",3,300);
                item.mostrar();
                break;
            case 4:
                System.out.println("Ingrese su nombre");
                String nombreBanco=input.next();
                Banco bank = new Banco(144, nombreBanco);
                bank.operacionBalance();

                break;

            case 5:
                System.out.println("Ingrese la hora");
                int hora=input.nextInt();
                System.out.println("Ingrese los minutos");
                int minuto=input.nextInt();
                System.out.println("Ingrese los segundos");
                int segundo=input.nextInt();
                Hora reloj = new Hora(hora,minuto,segundo);
                reloj.pedirHora();
                //reloj.Reloj();
                break;

            default:

                break;
        }

    }



}
