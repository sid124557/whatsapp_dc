package com.facebook.jni;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass7Z4;
import X.C149207Ll;
import java.util.LinkedList;

public final class NativeSoftErrorReporterProxy {
    public static final LinkedList sSoftErrorCache = AnonymousClass0x9.A18();

    public static native void generateNativeSoftError();

    public static void softReport(int i, String str, String str2, Throwable th, int i2) {
        String str3;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[Native] ");
        if (i == 1) {
            str3 = "<level:warning> ";
        } else if (i != 2) {
            str3 = "<level:unknown> ";
        } else {
            str3 = "<level:mustfix> ";
        }
        String A0V = AnonymousClass000.A0V(str3, str, A0o);
        Class<NativeSoftErrorReporterProxy> cls = NativeSoftErrorReporterProxy.class;
        synchronized (cls) {
            LinkedList linkedList = sSoftErrorCache;
            synchronized (linkedList) {
                C149207Ll r1 = new C149207Ll();
                r1.A01 = A0V;
                r1.A02 = str2;
                r1.A03 = th;
                r1.A00 = i2;
                linkedList.addLast(new AnonymousClass7Z4(r1));
                while (linkedList.size() >= 50) {
                    linkedList.removeFirst();
                }
            }
        }
        synchronized (cls) {
        }
    }

    public static void softReport(int i, String str, String str2, int i2) {
        softReport(i, str, str2, (Throwable) null, i2);
    }
}
