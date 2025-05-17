package org.lessons.java.RegnoAnimale.Animali;

import org.lessons.java.RegnoAnimale.Animale;
import org.lessons.java.RegnoAnimale.Azioni.Verso;

public class Passerotto extends Animale implements Verso {

    @Override
    public void verso() {
        System.out.println("Chipchichipchip");
    }

}
