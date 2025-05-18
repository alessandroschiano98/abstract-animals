package org.lessons.java.RegnoAnimale.ClassiAstratte;

import org.lessons.java.RegnoAnimale.Animale;
import org.lessons.java.RegnoAnimale.Interfacce.Verso;

public class Cane extends Animale implements Verso {

    public Cane(String nome, String tipologia, String caratteristica){
        super(nome, tipologia,caratteristica);
    }

    @Override
    public void verso() {
        System.out.println("Abbaia");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia croccantini");
    }

}
