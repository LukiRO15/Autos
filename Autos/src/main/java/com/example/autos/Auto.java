package com.example.autos;

public class Auto {
    private  String marca;
    private String  modelo;
    private int ano;

    public Auto(String marca1, String modelo1, int ano1){
        marca= marca1;
        modelo= modelo1;
        ano = ano1;
    }

    public Auto(String a, String b, Integer c){
        this.marca =a;
        this.modelo= b;
        this.ano= c;
    }

    public Auto(){
        this.marca = "A4";
        this.modelo= "BMW";
        this.ano= 2016;
    }

    public  String toString(){
        String cadena = "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\n.Año: " + this.ano;
        return cadena;
    }
}