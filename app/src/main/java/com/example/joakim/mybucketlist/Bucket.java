package com.example.joakim.mybucketlist;

import java.util.Date;

/**
 * Created by joakim on 16-02-07.
 */
public class Bucket {
    private String namn, beskrivning;
    private Date startdatum, slutdatum;
    // private Bilder[] bilder;
    private boolean genomfort;

    public Bucket(String namn, boolean genomfort){
        this.namn = namn;
        this.genomfort = genomfort;
    }

    public String toString(){
        return this.namn;
    }
}
