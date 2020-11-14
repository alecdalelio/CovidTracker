package com.tts.covid.models;

public class LocationStats {
    
    private String state;
    private String country;
    private int latestTotal;
    private int diffFromPrevDay;
    private int newCasesToday;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotal() {
        return latestTotal;
    }

    public void setLatestTotal(int latestTotal) {
        this.latestTotal = latestTotal;
    }

    public int getDiffFromPrevDay() {
        return diffFromPrevDay;
    }

    public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }

    public int getNewCasesToday() {
        return newCasesToday;
    }

    public void setNewCasesToday(int newCasesToday) {
        this.newCasesToday = newCasesToday;
    }

    @Override
    public String toString() {
        return "LocationStats [country=" + country + ", diffFromPrevDay=" + diffFromPrevDay + ", latestTotal="
                + latestTotal + ", newCasesToday=" + newCasesToday + ", state=" + state + "]";
    }

}
