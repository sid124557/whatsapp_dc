package X;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import sun.misc.Unsafe;

/* renamed from: X.7ro  reason: invalid class name and case insensitive filesystem */
public final class C162367ro {
    public static final long A00;
    public static final C153677bl A01;
    public static final Class A02 = C155367ek.A00;
    public static final Unsafe A03;
    public static final boolean A04 = AnonymousClass000.A1Y(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN);
    public static final boolean A05;
    public static final boolean A06;

    public static byte A00(byte[] bArr, long j) {
        return A01.A01(bArr, A00 + j);
    }

    public static int A01(Class cls) {
        if (A06) {
            return A01.A00.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Object A02(Class cls) {
        try {
            return A03.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Object A03(Object obj, long j) {
        return A01.A00.getObject(obj, j);
    }

    public static Unsafe A05() {
        try {
            return (Unsafe) AccessController.doPrivileged(new AnonymousClass8N0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A06(Class cls) {
        if (A06) {
            A01.A00.arrayIndexScale(cls);
        }
    }

    public static void A07(Object obj, long j, Object obj2) {
        A01.A00.putObject(obj, j, obj2);
    }

    public static void A08(byte[] bArr, byte b, long j) {
        A01.A06(bArr, A00 + j, b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x014b A[SYNTHETIC, Splitter:B:44:0x014b] */
    static {
        /*
            sun.misc.Unsafe r3 = A05()
            A03 = r3
            java.lang.Class r0 = X.C155367ek.A00
            A02 = r0
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.Class<byte[]> r13 = byte[].class
            boolean r0 = X.C155367ek.A00()
            r6 = 0
            if (r0 != 0) goto L_0x0053
            r2 = 0
        L_0x0016:
            java.lang.Class r7 = java.lang.Integer.TYPE
            boolean r0 = X.C155367ek.A00()
            if (r0 != 0) goto L_0x004a
            r1 = 0
        L_0x001f:
            r8 = 0
            if (r3 == 0) goto L_0x002f
            boolean r0 = X.C155367ek.A00()
            if (r0 == 0) goto L_0x0044
            if (r2 == 0) goto L_0x003c
            X.6YG r8 = new X.6YG
            r8.<init>(r3)
        L_0x002f:
            A01 = r8
            java.lang.String r10 = "copyMemory"
            java.lang.String r9 = "getLong"
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            sun.misc.Unsafe r0 = A03
            if (r0 == 0) goto L_0x00ee
            goto L_0x005c
        L_0x003c:
            if (r1 == 0) goto L_0x002f
            X.6YE r8 = new X.6YE
            r8.<init>(r3)
            goto L_0x002f
        L_0x0044:
            X.6YF r8 = new X.6YF
            r8.<init>(r3)
            goto L_0x002f
        L_0x004a:
            java.lang.Class r0 = A02     // Catch:{ all -> 0x0051 }
            boolean r1 = X.AnonymousClass6C7.A1Y(r0, r7)     // Catch:{ all -> 0x0051 }
            goto L_0x001f
        L_0x0051:
            r1 = 0
            goto L_0x001f
        L_0x0053:
            java.lang.Class r0 = A02     // Catch:{ all -> 0x005a }
            boolean r2 = X.AnonymousClass6C7.A1Y(r0, r1)     // Catch:{ all -> 0x005a }
            goto L_0x0016
        L_0x005a:
            r2 = 0
            goto L_0x0016
        L_0x005c:
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x00c8 }
            java.lang.String r2 = "objectFieldOffset"
            r12 = 1
            java.lang.Class[] r1 = new java.lang.Class[r12]     // Catch:{ all -> 0x00c8 }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r1[r6] = r0     // Catch:{ all -> 0x00c8 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x00c8 }
            r11 = 2
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ all -> 0x00c8 }
            r0[r6] = r5     // Catch:{ all -> 0x00c8 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x00c8 }
            r0[r12] = r3     // Catch:{ all -> 0x00c8 }
            r4.getMethod(r9, r0)     // Catch:{ all -> 0x00c8 }
            java.lang.reflect.Field r0 = A04()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00ee
            boolean r0 = X.C155367ek.A00()     // Catch:{ all -> 0x00c8 }
            if (r0 != 0) goto L_0x00f0
            java.lang.String r1 = "getByte"
            java.lang.Class[] r0 = new java.lang.Class[r12]     // Catch:{ all -> 0x00c8 }
            r0[r6] = r3     // Catch:{ all -> 0x00c8 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x00c8 }
            java.lang.String r2 = "putByte"
            java.lang.Class[] r1 = new java.lang.Class[r11]     // Catch:{ all -> 0x00c8 }
            r1[r6] = r3     // Catch:{ all -> 0x00c8 }
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ all -> 0x00c8 }
            r1[r12] = r0     // Catch:{ all -> 0x00c8 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x00c8 }
            X.AnonymousClass6C8.A15(r4, r3)     // Catch:{ all -> 0x00c8 }
            java.lang.Class[] r0 = new java.lang.Class[r12]     // Catch:{ all -> 0x00c8 }
            r0[r6] = r3     // Catch:{ all -> 0x00c8 }
            r4.getMethod(r9, r0)     // Catch:{ all -> 0x00c8 }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ all -> 0x00c8 }
            r0[r6] = r3     // Catch:{ all -> 0x00c8 }
            r0[r12] = r3     // Catch:{ all -> 0x00c8 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x00c8 }
            r2 = 3
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x00c8 }
            X.AnonymousClass6C7.A1E(r3, r0, r6, r12, r11)     // Catch:{ all -> 0x00c8 }
            r4.getMethod(r10, r0)     // Catch:{ all -> 0x00c8 }
            r0 = 5
            java.lang.Class[] r1 = X.AnonymousClass6C9.A1Y(r5, r3, r0, r12)     // Catch:{ all -> 0x00c8 }
            r1[r11] = r5     // Catch:{ all -> 0x00c8 }
            r1[r2] = r3     // Catch:{ all -> 0x00c8 }
            r0 = 4
            r1[r0] = r3     // Catch:{ all -> 0x00c8 }
            r4.getMethod(r10, r1)     // Catch:{ all -> 0x00c8 }
            goto L_0x00f0
        L_0x00c8:
            r1 = move-exception
            java.lang.Class<X.7ro> r0 = X.C162367ro.class
            java.util.logging.Logger r4 = X.AnonymousClass6C8.A0m(r0)
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r0 = r2.length()
            int r0 = r0 + 71
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r2 = X.AnonymousClass000.A0V(r0, r2, r1)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "supportsUnsafeByteBufferOperations"
            r4.logp(r3, r1, r0, r2)
            r0 = 0
            goto L_0x00f1
        L_0x00ee:
            r0 = 0
            goto L_0x00f1
        L_0x00f0:
            r0 = 1
        L_0x00f1:
            A05 = r0
            sun.misc.Unsafe r0 = A03
            if (r0 != 0) goto L_0x014b
            r0 = 0
        L_0x00f8:
            A06 = r0
            int r0 = A01(r13)
            long r0 = (long) r0
            A00 = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            A01(r0)
            A06(r0)
            java.lang.Class<int[]> r0 = int[].class
            A01(r0)
            A06(r0)
            java.lang.Class<long[]> r0 = long[].class
            A01(r0)
            A06(r0)
            java.lang.Class<float[]> r0 = float[].class
            A01(r0)
            A06(r0)
            java.lang.Class<double[]> r0 = double[].class
            A01(r0)
            A06(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            A01(r0)
            A06(r0)
            java.lang.reflect.Field r1 = A04()
            if (r1 == 0) goto L_0x013e
            if (r8 == 0) goto L_0x013e
            sun.misc.Unsafe r0 = r8.A00
            r0.objectFieldOffset(r1)
        L_0x013e:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            A04 = r0
            return
        L_0x014b:
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x01f4 }
            boolean r10 = X.AnonymousClass6C7.A1X(r4)     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "getInt"
            r3 = 2
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x01f4 }
            r0[r6] = r5     // Catch:{ all -> 0x01f4 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x01f4 }
            r0[r10] = r11     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "putInt"
            r6 = 3
            java.lang.Class[] r0 = X.AnonymousClass6C9.A1Y(r5, r11, r6, r10)     // Catch:{ all -> 0x01f4 }
            r0[r3] = r7     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f4 }
            java.lang.Class[] r0 = X.AnonymousClass6C9.A1Y(r5, r11, r3, r10)     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r9, r0)     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r0 = X.AnonymousClass6C9.A1Y(r5, r11, r6, r10)     // Catch:{ all -> 0x01f4 }
            r0[r3] = r11     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "getObject"
            java.lang.Class[] r0 = X.AnonymousClass6C9.A1Y(r5, r11, r3, r10)     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "putObject"
            java.lang.Class[] r0 = X.AnonymousClass6C9.A1Y(r5, r11, r6, r10)     // Catch:{ all -> 0x01f4 }
            r0[r3] = r5     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f4 }
            boolean r0 = X.C155367ek.A00()     // Catch:{ all -> 0x01f4 }
            if (r0 != 0) goto L_0x01f1
            java.lang.String r1 = "getByte"
            java.lang.Class[] r0 = X.AnonymousClass6C9.A1Y(r5, r11, r3, r10)     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f4 }
            java.lang.String r2 = "putByte"
            java.lang.Class[] r1 = X.AnonymousClass6C9.A1Y(r5, r11, r6, r10)     // Catch:{ all -> 0x01f4 }
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ all -> 0x01f4 }
            r1[r3] = r0     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "getBoolean"
            java.lang.Class[] r0 = X.AnonymousClass6C9.A1Y(r5, r11, r3, r10)     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f4 }
            java.lang.String r2 = "putBoolean"
            java.lang.Class[] r1 = X.AnonymousClass6C9.A1Y(r5, r11, r6, r10)     // Catch:{ all -> 0x01f4 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x01f4 }
            r1[r3] = r0     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "getFloat"
            java.lang.Class[] r0 = X.AnonymousClass6C9.A1Y(r5, r11, r3, r10)     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f4 }
            java.lang.String r2 = "putFloat"
            java.lang.Class[] r1 = X.AnonymousClass6C9.A1Y(r5, r11, r6, r10)     // Catch:{ all -> 0x01f4 }
            java.lang.Class r0 = java.lang.Float.TYPE     // Catch:{ all -> 0x01f4 }
            r1[r3] = r0     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "getDouble"
            java.lang.Class[] r0 = X.AnonymousClass6C9.A1Y(r5, r11, r3, r10)     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f4 }
            java.lang.String r2 = "putDouble"
            java.lang.Class[] r1 = X.AnonymousClass6C9.A1Y(r5, r11, r6, r10)     // Catch:{ all -> 0x01f4 }
            java.lang.Class r0 = java.lang.Double.TYPE     // Catch:{ all -> 0x01f4 }
            r1[r3] = r0     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f4 }
        L_0x01f1:
            r0 = 1
            goto L_0x00f8
        L_0x01f4:
            r1 = move-exception
            java.lang.Class<X.7ro> r0 = X.C162367ro.class
            java.util.logging.Logger r4 = X.AnonymousClass6C8.A0m(r0)
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r0 = r2.length()
            int r0 = r0 + 71
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r2 = X.AnonymousClass000.A0V(r0, r2, r1)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "supportsUnsafeArrayOperations"
            r4.logp(r3, r1, r0, r2)
            r0 = 0
            goto L_0x00f8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162367ro.<clinit>():void");
    }

    public static Field A04() {
        Field field;
        Field field2;
        if (C155367ek.A00()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }
}
