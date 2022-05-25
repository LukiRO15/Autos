package com.example.autos;

public class Principal {
    pubic static void main(String[] args) {
        Auto Jetta = new Auto("Volkswagen", "Bora", 2015);
        Auto Golf = new Auto("Volkswagen", "Golf", 2020);
        Auto GMC = new Auto("Chevrolet", "Ram", 2021);
        Auto Camaro = new Auto("Chevrolet", "G2", 2021);
        Auto Mustang = new Auto("Ford", "Shelby", 2019);

        Auto[] lote = new Auto[5];
        lote[0] = Jetta;
        lote[1] = Golf;
        lote[2] = GMC;
        lote[3] = Camaro;
        lote[4] = Mustang;

    }
}
