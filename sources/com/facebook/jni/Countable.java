package com.facebook.jni;

import X.C159587m8;

public class Countable {
    public long mInstance = 0;

    public native void dispose();

    static {
        C159587m8.A01("fb");
    }

    public void finalize() {
        dispose();
        super.finalize();
    }
}
