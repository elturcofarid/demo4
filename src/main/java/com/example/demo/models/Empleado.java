package com.example.demo.models;

public class Empleado extends Personas{

    private String horario;

    private int salario;



    /*---*/
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
