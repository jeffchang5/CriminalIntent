package com.example.jeffrey.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by jeffrey on 12/14/15.
 */
public class CrimeLab {
    private List<Crime> mCrimes;
    private static CrimeLab sCrimeLab;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
        for (int i = 0; i <100; i++) {
            Crime crime = new Crime();
            crime.setmTitle("Crime #" + i);
            crime.setmSolved(1 % 2==0);
            mCrimes.add(crime);
        }


    }
    public List<Crime>getCrimes() {
        return mCrimes;
    }
    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getmID().equals(id)) {
                return crime;
            }
        }
        return null;
    }
}
