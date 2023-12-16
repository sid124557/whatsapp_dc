package com.facebook.soloader;

import X.AnonymousClass000;
import X.AnonymousClass0x7;
import X.C18260x0;
import android.os.Trace;

public class Api18TraceUtils {
    public static void A00() {
        Trace.endSection();
    }

    public static void A01(String str, String str2, String str3) {
        String A06 = C18260x0.A06(str, str2, str3);
        if (A06.length() > 127 && str2 != null) {
            A06 = AnonymousClass000.A0V(AnonymousClass0x7.A0r(str2, (127 - str.length()) - str3.length()), str3, AnonymousClass000.A0l(str));
        }
        Trace.beginSection(A06);
    }
}
