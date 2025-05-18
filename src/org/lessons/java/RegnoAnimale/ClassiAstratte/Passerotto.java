package org.lessons.java.RegnoAnimale.ClassiAstratte;

import org.lessons.java.RegnoAnimale.Animale;
import org.lessons.java.RegnoAnimale.Interfacce.Verso;

public class Passerotto extends Animale implements Verso {

    public Passerotto(String nome, String tipologia, String caratteristica){
        super(nome, tipologia,caratteristica);
    }



    @Override
    public void verso() {
        System.out.println("Tzuikk Tzuiik");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia semi e cereali");
    }

}
