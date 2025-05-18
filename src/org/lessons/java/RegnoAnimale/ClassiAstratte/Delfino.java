package org.lessons.java.RegnoAnimale.ClassiAstratte;
import org.lessons.java.RegnoAnimale.Animale;
import org.lessons.java.RegnoAnimale.Interfacce.Verso;

public class Delfino extends Animale implements Verso {

    public Delfino(String nome, String tipologia, String caratteristica){
        super(nome, tipologia,caratteristica);
    }


    @Override
    public void verso() {
        System.out.println("wHOOFWhooof");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia seppie e crostacei");
    }

}
