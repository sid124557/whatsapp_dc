package com.facebook.msys.mci;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0RZ;
import X.AnonymousClass705;

public class Log {
    public static boolean sRegistered;

    public static int getWaLogLevel(int i) {
        if (i == 2) {
            return 5;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 3;
        }
        if (i != 5) {
            return AnonymousClass001.A1X(i, 7) ? 1 : 0;
        }
        return 2;
    }

    public static native void registerLoggerNative(long j, int i, boolean z);

    public static native void setLogLevel(int i);

    public static synchronized boolean registerLogger(AnonymousClass705 r3) {
        synchronized (Log.class) {
            AnonymousClass0RZ.A01("registerLogger");
            try {
                if (sRegistered) {
                    return false;
                }
                registerLoggerNative(0, 0, false);
                setLogLevel(3);
                sRegistered = true;
                AnonymousClass0RZ.A00();
                return true;
            } finally {
                AnonymousClass0RZ.A00();
            }
        }
    }

    public static void log(int i, String str) {
        com.whatsapp.util.Log.log(getWaLogLevel(i), AnonymousClass000.A0V("wamsys/", str, AnonymousClass001.A0o()));
    }
}
