package com.company;

import org.w3c.dom.ls.LSOutput;

public class ItemVenta {
    private int id;
    private String descripcion;
    private int cantidad;
    private float pUnitario;

    public ItemVenta(int id, String descripcion, int cantidad, float pUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.pUnitario = pUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getpUnitario() {
        return pUnitario;
    }

    public void setpUnitario(float pUnitario) {
        this.pUnitario = pUnitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void mostrar(){
        System.out.println("Id "+this.getId());
        System.out.println("Descripcion "+this.getDescripcion());
        System.out.println("Cantidad "+this.getCantidad());
        System.out.println("Precio por unidad $"+this.getpUnitario());
    }


}

