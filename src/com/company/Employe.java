package com.company;

public class Employe {
    private int dni;
    private String nombre;
    private String apellido;
    private float salario;

    public Employe(int dni, String nombre, String apellido, float salario){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;
    }

    public void salarioExtra(float extra){
        extra=this.salario/ 100*extra;
        this.salario*=extra;
    }

    public float salarioAnual(){
        float anual=this.salario*12;
        return anual;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void mostrar(){
        System.out.println("DNI Nro "+this.getDni());
        System.out.println(this.getNombre()+ " "+ this.getApellido());
        System.out.println("Salario $"+this.getSalario());
    }

}
