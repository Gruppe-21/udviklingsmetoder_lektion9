package com.gruppe21;

import java.util.ArrayList;
import java.util.Date;

public class Facilitet {
    int nummer;
    Date sidstRengjort;
    ArrayList underFacilitet;

    public Facilitet(int nummer){
        this.nummer = nummer;
        Date sidtRengjort = new Date();
        underFacilitet = new ArrayList();
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public Date getSidstRengjort() {
        return sidstRengjort;
    }

    public void setSidstRengjort(Date sidstRengjort) {
        this.sidstRengjort = sidstRengjort;
    }

    public ArrayList getUnderFacilitet() {
        return underFacilitet;
    }

    public void setUnderFacilitet(ArrayList underFacilitet) {
        this.underFacilitet = underFacilitet;
    }

}
