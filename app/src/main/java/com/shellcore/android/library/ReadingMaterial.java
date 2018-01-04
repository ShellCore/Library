package com.shellcore.android.library;

import android.util.Log;

/**
 * Created by MOGC on 04/01/2018.
 */

public abstract class ReadingMaterial {

    private static final String TAG = "ReadingMaterial";

    Document d;

    public void fetchDocument() {
        init();
        title();
        genre();
        id();
        date();
        edition();
    }

    protected void init() {
        d = new Document();
    }

    protected void title() {
        Log.d(TAG, "Title: " + d.title);
    }

    protected void genre() {
        Log.d(TAG, "Genre: " + d.genre);
    }

    protected abstract void id();

    protected abstract void date();

    protected void edition() {
        Log.d(TAG, "Edition: " + d.edition);
    }
}
