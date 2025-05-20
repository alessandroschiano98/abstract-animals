package org.lessons.java.RegnoAnimale;

public abstract class AnimaleAstratto {

    private String nome; // ! ES: TIGRE
    private String tipologia; // ! ES: VOLATILE
    private String caratteristica; // ! ES: VELOCE

    public AnimaleAstratto(String nome, String tipologia, String caratteristica) {
        this.nome = nome;
        this.tipologia = tipologia;
        this.caratteristica = caratteristica;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipologia() {
        return this.tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getCaratteristica() {
        return this.caratteristica;
    }

    public void setCaratteristica(String caratteristica) {
        this.caratteristica = caratteristica;
    }

    public abstract void verso();

    public abstract void mangia();
    

    public void dorme() {
        System.out.println("--ZzZzZzZzZzZ--");

    }


    

}
