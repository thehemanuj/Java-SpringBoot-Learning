package org.ayushshukla;

import jakarta.persistence.Embeddable;

@Embeddable
public class Job {

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getCtc() {
        return ctc;
    }

    public void setCtc(int ctc) {
        this.ctc = ctc;
    }

    public boolean isIs_internship() {
        return is_internship;
    }

    public void setIs_internship(boolean is_internship) {
        this.is_internship = is_internship;
    }

    private String company_name;
    private int ctc;
    private boolean is_internship;



}
