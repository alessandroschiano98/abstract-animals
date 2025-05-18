package org.lessons.java.RegnoAnimale;

import org.lessons.java.RegnoAnimale.ClassiAstratte.Aquila;
import org.lessons.java.RegnoAnimale.ClassiAstratte.Cane;
import org.lessons.java.RegnoAnimale.ClassiAstratte.Delfino;
import org.lessons.java.RegnoAnimale.ClassiAstratte.Passerotto;

public class Main {

    public static void main(String[] args) {

        Animale aquilaReale = new Aquila("AquilaReale", "Volatile", "Velocità sopra la media");

        aquilaReale.mangia();
        aquilaReale.verso();
        aquilaReale.dorme();

        Animale caneMaremmano = new Cane("PastoreMaremmano", "Canide", "Resiste alle temperature basse");
        caneMaremmano.mangia();
        caneMaremmano.verso();
        aquilaReale.dorme();

        Animale delfinoGrampo = new Delfino("DelfinoGrampo", "Cetaceo", "Vive sott'acqua");
        delfinoGrampo.mangia();
        delfinoGrampo.verso();
        aquilaReale.dorme();

        Animale passerottoGiallo = new Passerotto("Fringuello alpino", "Volatile",
                "Può raggiungere fino a 3500m d'altezza");
        passerottoGiallo.mangia();
        passerottoGiallo.verso();
        aquilaReale.dorme();
    }

}
