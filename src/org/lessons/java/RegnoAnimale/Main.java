package org.lessons.java.RegnoAnimale;

import java.util.Arrays;

import org.lessons.java.RegnoAnimale.ClassiAstratte.Aquila;
import org.lessons.java.RegnoAnimale.ClassiAstratte.Cane;
import org.lessons.java.RegnoAnimale.ClassiAstratte.Delfino;
import org.lessons.java.RegnoAnimale.ClassiAstratte.Passerotto;


public class Main {

    public static void main(String[] args) {

        // ! Animale esempioAnimale = new Animale("Leone"."Mammifero"ecc) || NON SI PUO
        // FARE !!!

        Aquila aquilaReale = new Aquila("Aquila Reale", "Volatile", "velocità sopra la media");
        System.out.println(aquilaReale.toString());
        aquilaReale.mangia();
        aquilaReale.verso();
        aquilaReale.dorme();
        TestingMain.faiVolare(aquilaReale);

        Cane caneMaremmano = new Cane("Pastore Maremmano", "Canide", "resiste alle basse temperature");
        System.out.println(caneMaremmano.toString());
        caneMaremmano.mangia();
        caneMaremmano.verso();
        caneMaremmano.dorme();

        Delfino delfinoGrampo = new Delfino("Delfino Grampo", "Cetaceo", "vive sott'acqua");
        System.out.println(delfinoGrampo.toString());
        delfinoGrampo.mangia();
        delfinoGrampo.verso();
        delfinoGrampo.dorme();
        TestingMain.faiNuotare(delfinoGrampo);

        Passerotto passerottoAlpino = new Passerotto("Fringuello Alpino", "Volatile",
                "può raggiungere fino a 3500m d'altezza");
        System.out.println(passerottoAlpino.toString());
        passerottoAlpino.mangia();
        passerottoAlpino.verso();
        passerottoAlpino.dorme();
        TestingMain.faiVolare(passerottoAlpino);

        // ! ARRAY
        AnimaleAstratto[] listaAnimaleAstratto = new AnimaleAstratto[4];
        listaAnimaleAstratto[0] = aquilaReale;
        listaAnimaleAstratto[1] = delfinoGrampo;
        listaAnimaleAstratto[2] = caneMaremmano;
        listaAnimaleAstratto[3] = passerottoAlpino;
        System.out.println(Arrays.toString(listaAnimaleAstratto));

        
        



    }

}
