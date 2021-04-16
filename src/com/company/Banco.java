package com.company;

import java.util.Scanner;

public class Banco {
    Scanner input = new Scanner(System.in);

    private int id;
    private String nombre;
    private float balance;

    public Banco(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void credito(float deposito) {

        this.balance += deposito;
        System.out.println("$" + deposito + " agregados correctamente");
        System.out.println("Balance actual: $" + this.balance);
    }

    public void debito(float retiro) {

            if (!((this.balance - retiro) < 0)) {

                this.balance -= retiro;
                System.out.println("$" + retiro + " retirado con exito!");
                System.out.println("Balance actual: $" + this.balance);

            } else {
                System.out.println("Balance insuficiente para retirar ese monto!");
            }

    }

    public void mostrar() {
        System.out.println("-------------------------------------------------------");
        System.out.println("Id Nro " + this.getId());
        System.out.println("Nombre "+this.getNombre());
        System.out.println("Balance de la cuenta $" + this.getBalance());
        System.out.println("-------------------------------------------------------");
    }


    public void menu(){
        System.out.println("Ingrese la operacion a ejecutar:");
        System.out.println("1 - Credito");
        System.out.println("2 - Debito");
        System.out.println("3 - Estado de la cuenta");
        System.out.println("4 - Salir");
    }


    public void operacionBalance() {
        int op = 0;
        char flag = 's';
        float deposito;
        float retiro;


        do {
            menu();
            op=input.nextInt();
            switch (op) {

                case 1:
                    System.out.println("Ingrese el dinero a depositar de su cuenta");
                    deposito = input.nextFloat();
                    credito(deposito);

                    break;
                case 2:
                    System.out.println("Ingrese el dinero a retirar de su cuenta");
                    retiro = input.nextFloat();
                    debito(retiro);

                    break;
                case 3:
                    mostrar();
                    break;
                case 4:
                    op = 4;
                    break;
                default:
                    if (op < 1 || op > 5) {
                        System.out.println("Ingrese un numero valido...");
                    }
                break;

            }if(op!=4) {
                System.out.println("Desea realizar otra operacion? s/n");
                flag = input.next().charAt(0);
            }
        }while ((op != 4) && (flag == 's'));

    }

}
