package com.facebook.xplat.fbglog;

import X.AnonymousClass0JK;
import X.C159587m8;
import X.C162477s9;

public class FbGlog {
    public static AnonymousClass0JK sCallback;

    public static native void setLogLevel(int i);

    public static native void setSkipSubscribe(boolean z);

    static {
        C159587m8.A00("fb");
    }

    public static synchronized void ensureSubscribedToBLogLevelChanges() {
        synchronized (FbGlog.class) {
            if (sCallback == null) {
                AnonymousClass0JK r0 = new AnonymousClass0JK();
                sCallback = r0;
                C162477s9.A01(r0);
                setLogLevel(C162477s9.A00());
            }
        }
    }
}
