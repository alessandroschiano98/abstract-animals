package org.lessons.java.RegnoAnimale.ClassiAstratte;

import org.lessons.java.RegnoAnimale.AnimaleAstratto;

public class Cane extends AnimaleAstratto{

    public Cane(String nome, String tipologia, String caratteristica){
        super(nome, tipologia,caratteristica);
    }

    @Override
    public void verso() {
        System.out.println("!!!Abbaia!!!");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia pesce azzurro");
    }


    @Override
    public String toString(){
        return "Cane: " + getNome().toUpperCase() + " - " + getTipologia() + " - " + getCaratteristica();
    }

}
