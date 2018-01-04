package com.shellcore.android.library;

import android.util.Log;

/**
 * Created by MOGC on 04/01/2018.
 */

public abstract class Book extends ReadingMaterial {

    private static final String TAG = "Book";

    @Override
    public void fetchDocument() {
        super.fetchDocument();
        author();
        rating();
    }

    @Override
    protected void id() {
        Log.d(TAG, "ISBN: " + d.id);
    }

    @Override
    protected void date() {
        Log.d(TAG, "Date: " + d.date);
    }

    private void author() {
        Log.d(TAG, "Author: " + d.author);
    }

    protected abstract void rating();
}
