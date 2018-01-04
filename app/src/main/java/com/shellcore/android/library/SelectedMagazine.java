package com.shellcore.android.library;

import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.GregorianCalendar;
import android.util.Log;

/**
 * Created by MOGC on 04/01/2018.
 */

public class SelectedMagazine extends Magazine {

    private static final String TAG = "SelectedMagazine";

    @Override
    protected void date() {
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat format = new SimpleDateFormat("d MMMM yyyy");

        format.setTimeZone(calendar.getTimeZone());

        Log.d(TAG, "Date: " + format.format(calendar.getTime()));
    }
}
