package com.company;

public class Rectangulo {
    private float alto;
    private float ancho;
    private float perimetro;
    private float area;


    public Rectangulo( float ancho, float alto){
        this.alto=alto;
        this.ancho=ancho;
    }
    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getArea() {
        return area = ancho*alto;
    }

    public float getPerimetro() {
        return perimetro = alto*2 + ancho *2;
    }

    public void mostrar()
    {
        System.out.println("Alto:"+ this.getAlto());
        System.out.println("Ancho:"+ this.getAncho());
        System.out.println("Area:"+ this.getArea());
        System.out.println("Perimetro:"+ this.getPerimetro());
    }
}
