package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Hora {
//Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.
//Tenga en cuenta el rango de valores aceptados para cada uno de estos.
//a. Hora: 0 … 23
//b. Minuto: 0 … 59
//c. Segundo: 0 … 59
//Considere el siguiente comportamiento:
//1. Un método que imprima la hora bajo el siguiente formato hh:mm:ss
//usando zero a la izquierda ejemplo 13:04:22 .
//2. Un método que avance en 1 segundo y devuelva la instancia del objeto.
//3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
//4. Instanciar el objeto y probar los métodos creados.


    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }


    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public String hora0(){
        if(this.hora<10)
            return "0"+getHora();
        else
            return ""+getHora();
    }
    public String segundo0(){
        if(this.segundo<10)
            return "0"+getSegundo();
        else
            return ""+getSegundo();
    }
    public String minuto0(){
        if(this.minuto<10)
            return "0"+getMinuto();
        else
            return ""+getMinuto();
    }

    public void menu(){
        System.out.println("Ingrese la operacion a ejecutar:");
        System.out.println("1 - Restar 1 segundo");
        System.out.println("2 - Sumar 1 segundo");
        System.out.println("3 - Salir");
    }

    public void sumarSegundo(){
        if(this.segundo==59){
            this.segundo=0;
            if(this.minuto==59){
                this.minuto=0;
                if(this.hora==23){
                    this.hora=0;
                }
                else
                    this.hora++;
            }
            else
                this.minuto++;
        }
        else
            this.segundo++;
    }

    public void restarSegundo(){
        if(this.segundo==0){
            this.segundo=59;
            if(this.minuto==0){
                this.minuto=59;
                if(this.hora==0){
                    this.hora=23;
                }
                else
                    this.hora--;
            }
            else
                this.minuto--;
        }
        else
            this.segundo--;
    }

    public void pedirHora(){
        Scanner input= new Scanner(System.in);
        int op;
        char flag='s';
        do {
            menu();
            op=input.nextInt();
            switch (op) {

                case 1:
                    restarSegundo();
                    System.out.println(hora0()+":" + minuto0()+":" +segundo0());
                    break;
                case 2:
                    sumarSegundo();
                    System.out.println(hora0()+":" + minuto0()+":" +segundo0());
                    break;
                case 3:
                    op=3;
                    break;
                default:
                    if (op < 1 || op > 3) {
                        System.out.println("Ingrese un numero valido...");
                    }
                    break;

            }if(op!=3) {
                System.out.println("Desea realizar otra operacion? s/n");
                flag = input.next().charAt(0);
            }
        }while ((op != 3) && (flag == 's'));
    }
}
