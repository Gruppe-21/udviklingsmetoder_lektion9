package com.gruppe21;

import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;
import java.util.ArrayList;
import java.util.List;

public class Medarbejder extends Bruger{

    private List opgaver;

    public Medarbejder(int id, String navn) {
        super(id, navn);
        opgaver = new ArrayList<Opgave>();
    }

    public void setNavn(String navn){
        this.navn=navn;
    }

    public String getNavn(){
        return navn;
    }

    public List getOpgaver(){
        return opgaver;
    }

    public void tilføjOpgave(Opgave opgave){
        opgaver.add(opgave);
    }

    public void fjernOpgave(Opgave opgave){}

    public Opgave[] markerOpgaveFærdig(Opgave opgave){}

}
