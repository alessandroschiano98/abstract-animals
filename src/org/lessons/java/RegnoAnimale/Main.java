package org.lessons.java.RegnoAnimale;

import org.lessons.java.RegnoAnimale.ClassiAstratte.Aquila;
import org.lessons.java.RegnoAnimale.ClassiAstratte.Cane;
import org.lessons.java.RegnoAnimale.ClassiAstratte.Delfino;
import org.lessons.java.RegnoAnimale.ClassiAstratte.Passerotto;

public class Main {

    public static void main(String[] args) {

        Aquila aquilaReale = new Aquila("Aquila Reale", "Volatile", "Velocità sopra la media");
        System.out.println(aquilaReale.toString());
        System.out.println(aquilaReale.getTipologia());
        System.out.println(aquilaReale.getCaratteristica());
        aquilaReale.mangia();
        aquilaReale.verso();
        aquilaReale.dorme();

        Cane caneMaremmano = new Cane("Pastore Maremmano", "Canide", "Resiste alle basse temperature");
        System.out.println(caneMaremmano.toString());
        System.out.println(caneMaremmano.getTipologia());
        System.out.println(caneMaremmano.getCaratteristica());
        caneMaremmano.mangia();
        caneMaremmano.verso();
        caneMaremmano.dorme();

        Delfino delfinoGrampo = new Delfino("Delfino Grampo", "Cetaceo", "Vive sott'acqua");
        System.out.println(delfinoGrampo.toString());
        System.out.println(delfinoGrampo.getTipologia());
        System.out.println(delfinoGrampo.getCaratteristica());
        delfinoGrampo.mangia();
        delfinoGrampo.verso();
        delfinoGrampo.dorme();

        Passerotto passerottoAlpino = new Passerotto("Fringuello Alpino", "Volatile",
                "Può raggiungere fino a 3500m d'altezza");
        System.out.println(passerottoAlpino.toString());
        System.out.println(passerottoAlpino.getTipologia());
        System.out.println(passerottoAlpino.getCaratteristica());
        passerottoAlpino.mangia();
        passerottoAlpino.verso();
        passerottoAlpino.dorme();

    }

}
