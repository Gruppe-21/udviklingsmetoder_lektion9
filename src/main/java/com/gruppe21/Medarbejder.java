package com.gruppe21;

import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;

import java.util.ArrayList;

public class Medarbejder extends Bruger{

    private Opgave[] opgave;

    public Medarbejder(int id, String navn) {
        super(id, navn);
        opgave = new Opgave[0];
    }

    public void setNavn(String navn){
        this.navn=navn;
    }

    public String getNavn(){
        return navn;
    }

    public Opgave[] getOpgaver(){
        return opgave;
    }

    public void tilføjOpgave(){}

    public void fjernOpgave(Opgave opgave){}

    public Opgave[] markerOpgaveFærdig(Opgave opgave){}

}
