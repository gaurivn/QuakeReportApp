package com.example.android.quakereport;

public class Earthquake {
    private Double mmag;
    private String mplace;

    private long mtimeinms;

    /** Website URL of the earthquake */
    private String mUrl;


    public Earthquake(Double mag, String place, long timeinms, String Url){
        mmag = mag;
        mplace = place;
        mtimeinms = timeinms;
        mUrl = Url;
    }

    public Double getMmag() {
        return mmag;
    }

    public String getMplace() {
        return mplace;
    }

    public long getMtimeinms() {
        return mtimeinms;
    }

    public String getmUrl() {
        return mUrl;
    }
}
