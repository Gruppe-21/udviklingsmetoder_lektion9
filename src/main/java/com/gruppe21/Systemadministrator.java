package com.gruppe21;

public class Systemadministrator extends Bruger {

    public Systemadministrator(int id, String navn){
        super(id,navn);
    }

    public boolean opretMedarbejder(int id, int medarbejderType) { return true;
    }

    public boolean fjernMedarbejder(int id) {
        return true;
    }

    public void OpretFacilitet(int nummer, Facilitet overFacilitet) { //overFacilitet : Facilitet=null
    }

    public void flytFacilitet() {
    }
}
