package com.mx.curso.Unidad2.practicas_poo;

public class Empleado {
    private int id;
    private float salario;
    int porcentaje;

    Empleado(int id, float salario){
        this.id = id;
        this.salario = salario;
    }

    public void aumentarSalario(int porcentaje){
       float aumento = salario * porcentaje / 100;
        System.out.println("Salario actual: " + salario);
        System.out.println("Su salario ha aumentado: " + aumento);
       salario += aumento;
    }

    public float getSalario() {
        System.out.println("Salario actualizado: " + salario);
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public static void main(String[] args) {
        Empleado rodrigo = new Empleado(1, 2000);
        rodrigo.aumentarSalario(30);
        rodrigo.getSalario();
    }
}
