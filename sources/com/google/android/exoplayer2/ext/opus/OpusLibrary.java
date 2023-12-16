package com.google.android.exoplayer2.ext.opus;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C155297ed;

public final class OpusLibrary {
    public static native String opusGetVersion();

    static {
        synchronized (C155297ed.class) {
            if (C155297ed.A01.add("goog.exo.opus")) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(C155297ed.A00);
                C155297ed.A00 = AnonymousClass000.A0V(", ", "goog.exo.opus", A0o);
            }
        }
    }
}
