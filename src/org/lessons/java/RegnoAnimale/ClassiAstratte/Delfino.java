package org.lessons.java.RegnoAnimale.ClassiAstratte;
import org.lessons.java.RegnoAnimale.Animale;
import org.lessons.java.RegnoAnimale.Interfacce.Verso;

public class Delfino extends Animale implements Verso {


    @Override
    public void verso() {
        System.out.println("wHOOFWhooof");
    }

}
