package org.lessons.java.RegnoAnimale.ClassiAstratte;
import org.lessons.java.RegnoAnimale.AnimaleAstratto;
import org.lessons.java.RegnoAnimale.Interfacce.Nuotante;


public class Delfino extends AnimaleAstratto implements Nuotante{

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
    public void dorme() {
        System.out.println("--Glu glu glu glu--");

    }

    @Override
    public String toString(){
        return "Delfino: " + getNome().toUpperCase() + " - " + getTipologia() + " - " + getCaratteristica();
    }

    @Override
    public void nuota() {
        System.out.println(".. Sta nuotando .. ");
    }
}
