package org.lessons.java.RegnoAnimale;

public abstract class Animale {
    private String specie;
    private String nome;


}

public Animale(String specie, String nome){
    this.specie = specie;
    this.nome = nome;

}


    public String getSpecie() {
        return this.specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void dormi(){
        System.out.println(".. Sta dormendo .. ");
    }

    public void verso(){
        System.out.println(".. Verso dell'animale .. ");
    }

    public void mangia(){
        System.out.println(".. Sta mangiando .. ");
    }

