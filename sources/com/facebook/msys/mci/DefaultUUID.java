package com.facebook.msys.mci;

import X.C18280x3;

public class DefaultUUID implements UUID {
    public static final UUID mUUID = new DefaultUUID();

    public static UUID get() {
        return mUUID;
    }

    public String createString() {
        return C18280x3.A0Y();
    }
}
