package com.gruppe21;

import java.util.Date;

public class Opgave {
    private Date deadline;
    private Facilitet facilitet;
    private Boolean erFærdig;
    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Facilitet getFacilitet() { return facilitet; }

    public void setFacilitet(Facilitet facilitet) { this.facilitet = facilitet;}

    public void markerOpgaveFærdig(){
        erFærdig = true;
    }
    public Opgave(Facilitet facilitet, Date deadline) {
        this.erFærdig = false;
        this.deadline = deadline;
        this.facilitet = facilitet;
    }

}
