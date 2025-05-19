package org.lessons.java.RegnoAnimale.ClassiAstratte;
import org.lessons.java.RegnoAnimale.Animale;
import org.lessons.java.RegnoAnimale.Interfacce.Nuotante;


public class Delfino extends Animale implements Nuotante{

    public Delfino(String nome, String tipologia, String caratteristica){
        super(nome, tipologia,caratteristica);
    }


    @Override
    public void verso() {
        System.out.println("!!!Frigge!!!");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia seppie e crostacei");
    }

    @Override
    public String toString(){
        return getNome().toUpperCase();
    }

    @Override
    public void nuota() {
        System.out.println(".. Sto nuotando .. ");
    }
}
