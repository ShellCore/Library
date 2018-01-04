package com.shellcore.android.library;

import android.util.Log;

/**
 * Created by MOGC on 04/01/2018.
 */

public class SelectedBook extends Book {

    private static final String TAG = "SelectedBook";
    
    @Override
    protected void rating() {
        Log.d(TAG, "rating: 4 extrellas");
    }
}
