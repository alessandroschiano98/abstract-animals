package org.lessons.java.RegnoAnimale.ClassiAstratte;

import org.lessons.java.RegnoAnimale.Animale;

public class Cane extends Animale{

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
        return getNome().toUpperCase();
    }

}
