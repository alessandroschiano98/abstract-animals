package org.lessons.java.RegnoAnimale.ClassiAstratte;

import org.lessons.java.RegnoAnimale.AnimaleAstratto;
import org.lessons.java.RegnoAnimale.Interfacce.Volante;


public class Passerotto extends AnimaleAstratto implements Volante{

    public Passerotto(String nome, String tipologia, String caratteristica){
        super(nome, tipologia,caratteristica);
    }



    @Override
    public void verso() {
        System.out.println("!!!Cinguettio!!!!");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia semi e cereali");
    }


    @Override
    public String toString(){
        return "Passerotto: " + getNome().toUpperCase() + " - " + getTipologia() + " - " + getCaratteristica();
    }

    @Override
    public void vola() {
        System.out.println(".. Sta volando .. ");
    }

}
