package com.gruppe21;

public abstract class Bruger {
    int id;
    String navn;

    public void setNavn(String navn){
        this.navn = navn;
    }

    public String getNavn(){
        return navn;
    }

    public Bruger(int id, String navn){
        this.id = id;
        this.navn = navn;
    }

}
