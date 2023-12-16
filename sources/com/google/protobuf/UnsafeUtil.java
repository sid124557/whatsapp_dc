package com.google.protobuf;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass6C7;
import X.AnonymousClass6C8;
import X.AnonymousClass8N2;
import X.C130836cc;
import X.C130846cd;
import X.C130856ce;
import X.C153777bz;
import X.C155397eo;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import sun.misc.Unsafe;

public final class UnsafeUtil {
    public static final long A00;
    public static final C153777bz A01;
    public static final Class A02;
    public static final Unsafe A03 = A02();
    public static final boolean A04;
    public static final boolean A05;
    public static final boolean A06;
    public static final boolean A07;
    public static final boolean A08 = AnonymousClass000.A1Y(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN);

    public static Object A00(Class cls) {
        try {
            return A03.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (X.C155397eo.A01 != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Field A01() {
        /*
            java.lang.Class r0 = X.C155397eo.A00
            if (r0 == 0) goto L_0x0009
            boolean r1 = X.C155397eo.A01
            r0 = 1
            if (r1 == 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            if (r0 == 0) goto L_0x0019
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            if (r2 == 0) goto L_0x0019
            return r2
        L_0x0019:
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "address"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            if (r2 == 0) goto L_0x002e
            java.lang.Class r1 = r2.getType()
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L_0x002e
            return r2
        L_0x002e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.UnsafeUtil.A01():java.lang.reflect.Field");
    }

    public static Unsafe A02() {
        try {
            return (Unsafe) AccessController.doPrivileged(new AnonymousClass8N2());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A03(Class cls) {
        boolean z = A04;
        if (z) {
            A01.A04(cls);
        }
        if (z) {
            A01.A08(cls);
        }
    }

    public static void A04(Object obj, long j, int i) {
        A01.A0C(obj, j, i);
    }

    public static void A05(Object obj, long j, Object obj2) {
        A01.A0E(obj, j, obj2);
    }

    public static void A06(Throwable th) {
        AnonymousClass6C8.A0m(UnsafeUtil.class).log(Level.WARNING, AnonymousClass000.A0P(th, "platform method missing - proto runtime falling back to safer methods: ", AnonymousClass001.A0o()));
    }

    public static void A07(byte[] bArr, byte b, long j) {
        A01.A09(bArr, A00 + j, b);
    }

    static {
        boolean z;
        boolean z2;
        boolean A0I;
        boolean A0H;
        int i;
        C153777bz r0;
        Class cls = C155397eo.A00;
        A02 = cls;
        Class cls2 = Long.TYPE;
        Class<byte[]> cls3 = byte[].class;
        if (cls == null || C155397eo.A01) {
            z = false;
        } else {
            try {
                z = AnonymousClass6C7.A1Y(cls, cls2);
            } catch (Throwable unused) {
                z = false;
            }
        }
        A07 = z;
        Class cls4 = Integer.TYPE;
        if (cls == null || C155397eo.A01) {
            z2 = false;
        } else {
            try {
                z2 = AnonymousClass6C7.A1Y(A02, cls4);
            } catch (Throwable unused2) {
                z2 = false;
            }
        }
        A06 = z2;
        Unsafe unsafe = A03;
        C153777bz r1 = null;
        if (unsafe != null) {
            if (cls == null || C155397eo.A01) {
                r1 = new C130856ce(unsafe);
            } else if (A07) {
                r1 = new C130846cd(unsafe);
            } else if (z2) {
                r1 = new C130836cc(unsafe);
            }
        }
        A01 = r1;
        if (r1 == null) {
            A0I = false;
        } else {
            A0I = r1.A0I();
        }
        A05 = A0I;
        C153777bz r02 = A01;
        if (r02 == null) {
            A0H = false;
        } else {
            A0H = r02.A0H();
        }
        A04 = A0H;
        if (A0H) {
            i = A01.A04(cls3);
        } else {
            i = -1;
        }
        A00 = (long) i;
        A03(boolean[].class);
        A03(int[].class);
        A03(long[].class);
        A03(float[].class);
        A03(double[].class);
        A03(Object[].class);
        Field A012 = A01();
        if (!(A012 == null || (r0 = A01) == null)) {
            r0.A0G(A012);
        }
    }
}
