package org.lessons.java.RegnoAnimale;

public abstract class Animale {

    private String nome; // ! NOME ANIMALE(LEONE, TIGRE ECC)
    private String tipologia; // ! DI TERRA, DI MARE, VOLATILE ECC
    private String caratteristica; // ! ES: VELOCE

    public Animale(String nome, String tipologia, String caratteristica) {
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

    public String getCarrateristica() {
        return this.caratteristica;
    }

    public void setCarrateristica(String carrateristica) {
        this.caratteristica = carrateristica;
    }


    public abstract void verso();

    public abstract void mangia();



}
