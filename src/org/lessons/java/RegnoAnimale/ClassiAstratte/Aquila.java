package org.lessons.java.RegnoAnimale.ClassiAstratte;

import org.lessons.java.RegnoAnimale.Animale;
import org.lessons.java.RegnoAnimale.Interfacce.Volante;

public class Aquila extends Animale implements Volante {

    public Aquila(String nome, String tipologia, String caratteristica) {
        super(nome, tipologia, caratteristica);
    }

    @Override
    public void verso() {
        System.out.println("!!!Stridio!!!");

    }

    @Override
    public void mangia() {
        System.out.println("Mangia marmotte, conigli o lepri, dunque piccoli e medi mammiferi");
    }

    @Override
    public String toString() {
        return getNome().toUpperCase();
    }

    @Override
    public void vola() {
        System.out.println(".. Sto volando .. ");
    }

}
