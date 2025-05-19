package org.lessons.java.RegnoAnimale;

import org.lessons.java.RegnoAnimale.ClassiAstratte.Aquila;
import org.lessons.java.RegnoAnimale.ClassiAstratte.Cane;
import org.lessons.java.RegnoAnimale.ClassiAstratte.Delfino;
import org.lessons.java.RegnoAnimale.ClassiAstratte.Passerotto;

public class Main {

    public static void main(String[] args) {

        Animale aquilaReale = new Aquila("Aquila Reale", "Volatile", "Velocità sopra la media");
        System.out.println(aquilaReale.toString());
        aquilaReale.mangia();
        aquilaReale.verso();
        aquilaReale.dorme();

        Animale caneMaremmano = new Cane("Pastore Maremmano", "Canide", "Resiste alle basse temperature");
        System.out.println(caneMaremmano.toString());
        caneMaremmano.mangia();
        caneMaremmano.verso();
        aquilaReale.dorme();

        Animale delfinoGrampo = new Delfino("Delfino Grampo", "Cetaceo", "Vive sott'acqua");
        System.out.println(delfinoGrampo.toString());
        delfinoGrampo.mangia();
        delfinoGrampo.verso();
        aquilaReale.dorme();

        Animale passerottoAlpino = new Passerotto("Fringuello Alpino", "Volatile",
                "Può raggiungere fino a 3500m d'altezza");
        System.out.println(passerottoAlpino.toString());
        passerottoAlpino.mangia();
        passerottoAlpino.verso();
        passerottoAlpino.dorme();
    
        
    }

}
