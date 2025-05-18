package org.lessons.java.RegnoAnimale.ClassiAstratte;

import org.lessons.java.RegnoAnimale.Animale;
import org.lessons.java.RegnoAnimale.Interfacce.Verso;

public class Aquila extends Animale implements Verso {


    public Aquila(String nome, String tipologia, String caratteristica){
        super(nome, tipologia,caratteristica);
    }

    @Override
    public void verso() {
        System.out.println("Stridio");

    }

    @Override
    public void mangia() {
        System.out.println("Mangia carne");
    }


}
