package com.example.jeffrey.criminalintent;

import java.util.UUID;

/**
 * Created by jeffrey on 12/12/15.
 */
public class Crime {
    private UUID mID;
    private String mTitle;
    public Crime() {
        mID = UUID.randomUUID();
    }

    public UUID getmID() {
        return mID;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
