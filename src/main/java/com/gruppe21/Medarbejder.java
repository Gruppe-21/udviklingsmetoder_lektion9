package com.gruppe21;

public class Medarbejder extends Bruger{

    public void setNavn(String navn){
        this.navn=navn;
    }

    public String getNavn(){
        return navn;
    }

    public Opgave getOpgaver(){
        return opgave;
    }

    public void tilføjOpgave(){}

    public void fjernOpgave(Opgave opgave){}

    public Opgave markerOpgaveFærdig(Opgave opgave){}

}
