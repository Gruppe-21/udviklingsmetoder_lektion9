package com.gruppe21;

import java.util.Date;

public class Opgave {
   private Date deadline;
    private Facilitet facilitet;
    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Facilitet getFacilitet() { return facilitet; }

    public void setFacilitet(Facilitet facilitet) { this.facilitet = facilitet;}

    public Opgave(Facilitet facilitet, Date deadline) {
        this.deadline = deadline;
        this.facilitet = facilitet;
    }

}
