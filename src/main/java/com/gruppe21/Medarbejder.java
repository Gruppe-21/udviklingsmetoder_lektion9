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

    public List getOpgaver(){
        return opgaver;
    }

    public boolean tilføjOpgave(Opgave opgave){
        boolean kunneTildele = true;
        opgaver.add(opgave);
        return kunneTildele;
    }

    public void fjernOpgave(Opgave opgave){}

    public boolean markerOpgaveFærdig(Opgave opgave){}

}
