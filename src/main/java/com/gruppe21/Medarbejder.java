package com.gruppe21;

public class Medarbejder extends Bruger{

    public Medarbejder(int id, String navn) {
        super(id, navn);
    }

    public void setNavn(String navn){
        this.navn=navn;
    }

    public String getNavn(){
        return navn;
    }

    public ArrayList getOpgaver(){
        return opgave;
    }

    public void tilføjOpgave(){}

    public void fjernOpgave(Opgave opgave){}

    public Opgave markerOpgaveFærdig(Opgave opgave){}

}
