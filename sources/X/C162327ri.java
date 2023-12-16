package X;

import java.security.AccessController;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: X.7ri  reason: invalid class name and case insensitive filesystem */
public final class C162327ri {
    public static final C153577ba A00;
    public static final Class A01 = Memory.class;
    public static final Unsafe A02;
    public static final boolean A03;
    public static final boolean A04;

    public static Unsafe A00() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C172818My());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A01(Class cls) {
        boolean z = A04;
        if (z) {
            A00.A03(cls);
        }
        if (z) {
            A00.A04(cls);
        }
    }

    public static void A02(Class cls) {
        try {
            A02.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void A03(Object obj, long j, Object obj2) {
        A00.A07(obj, j, obj2);
    }

    public static /* synthetic */ void A04(Object obj, long j, boolean z) {
        long j2 = -4 & j;
        C153577ba r5 = A00;
        int A002 = r5.A00(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        r5.A05(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & A002));
    }

    public static /* synthetic */ void A05(Object obj, long j, boolean z) {
        long j2 = -4 & j;
        C153577ba r5 = A00;
        int A002 = r5.A00(obj, j2);
        int i = (((int) j) & 3) << 3;
        r5.A05(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & A002));
    }

    public static boolean A06(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        try {
            Class cls3 = A01;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", AnonymousClass6C9.A1Y(cls, cls4, 2, 1));
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            Class[] A1Y = AnonymousClass6C9.A1Y(cls, cls2, 4, 1);
            A1Y[2] = cls5;
            A1Y[3] = cls5;
            cls3.getMethod("pokeByteArray", A1Y);
            Class[] A1Y2 = AnonymousClass6C9.A1Y(cls, cls2, 4, 1);
            A1Y2[2] = cls5;
            A1Y2[3] = cls5;
            cls3.getMethod("peekByteArray", A1Y2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A07(Object obj, long j) {
        int A042;
        C153577ba r3 = A00;
        long j2 = -4 & j;
        if (A03) {
            A042 = AnonymousClass6C7.A04(r3.A00(obj, j2), ~j);
        } else {
            A042 = AnonymousClass6C7.A04(r3.A00(obj, j2), j);
        }
        return AnonymousClass000.A1S((byte) (A042 & 255));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        if (r1.getDeclaredField("effectiveDirectAddress") == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x012d, code lost:
        if (r2 == null) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013d, code lost:
        if (r2.getType() == java.lang.Long.TYPE) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013f, code lost:
        r0 = A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0141, code lost:
        if (r0 == null) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0143, code lost:
        r0.A08(r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014e  */
    static {
        /*
            sun.misc.Unsafe r4 = A00()
            A02 = r4
            java.lang.Class<libcore.io.Memory> r0 = libcore.io.Memory.class
            A01 = r0
            java.lang.Class r3 = java.lang.Long.TYPE
            boolean r2 = A06(r3)
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r1 = A06(r0)
            r0 = 0
            if (r4 == 0) goto L_0x0020
            if (r2 == 0) goto L_0x0030
            X.6VK r0 = new X.6VK
            r0.<init>(r4)
        L_0x0020:
            A00 = r0
            java.lang.String r9 = "getLong"
            java.lang.String r8 = "objectFieldOffset"
            r7 = 2
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r5 = 1
            r10 = 0
            if (r0 == 0) goto L_0x0076
            sun.misc.Unsafe r0 = r0.A00
            goto L_0x0038
        L_0x0030:
            if (r1 == 0) goto L_0x0020
            X.6VJ r0 = new X.6VJ
            r0.<init>(r4)
            goto L_0x0020
        L_0x0038:
            java.lang.Class r2 = r0.getClass()     // Catch:{ all -> 0x005c }
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ all -> 0x005c }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r1[r10] = r0     // Catch:{ all -> 0x005c }
            r2.getMethod(r8, r1)     // Catch:{ all -> 0x005c }
            java.lang.Class[] r0 = X.AnonymousClass6C9.A1Y(r6, r3, r7, r5)     // Catch:{ all -> 0x005c }
            r2.getMethod(r9, r0)     // Catch:{ all -> 0x005c }
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0076
        L_0x0056:
            java.lang.String r0 = "address"
            r1.getDeclaredField(r0)     // Catch:{ all -> 0x0076 }
            goto L_0x0076
        L_0x005c:
            r2 = move-exception
            java.lang.Class<X.7ri> r0 = X.C162327ri.class
            java.util.logging.Logger r4 = X.AnonymousClass6C8.A0m(r0)
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r1 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = r1.concat(r0)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "logMissingMethod"
            r4.logp(r3, r1, r0, r2)
        L_0x0076:
            X.7ba r0 = A00
            if (r0 == 0) goto L_0x00f9
            sun.misc.Unsafe r0 = r0.A00
            java.lang.Class r2 = r0.getClass()     // Catch:{ all -> 0x00df }
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ all -> 0x00df }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r1[r10] = r0     // Catch:{ all -> 0x00df }
            r2.getMethod(r8, r1)     // Catch:{ all -> 0x00df }
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ all -> 0x00df }
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            r1[r10] = r3     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "arrayBaseOffset"
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00df }
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ all -> 0x00df }
            r1[r10] = r3     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "arrayIndexScale"
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00df }
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch:{ all -> 0x00df }
            r1[r10] = r6     // Catch:{ all -> 0x00df }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x00df }
            r1[r5] = r4     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "getInt"
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00df }
            r3 = 3
            java.lang.Class[] r1 = X.AnonymousClass6C9.A1Y(r6, r4, r3, r5)     // Catch:{ all -> 0x00df }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00df }
            r1[r7] = r0     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "putInt"
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00df }
            java.lang.Class[] r0 = X.AnonymousClass6C9.A1Y(r6, r4, r7, r5)     // Catch:{ all -> 0x00df }
            r2.getMethod(r9, r0)     // Catch:{ all -> 0x00df }
            java.lang.Class[] r1 = X.AnonymousClass6C9.A1Y(r6, r4, r3, r5)     // Catch:{ all -> 0x00df }
            r1[r7] = r4     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "putLong"
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00df }
            java.lang.Class[] r1 = X.AnonymousClass6C9.A1Y(r6, r4, r7, r5)     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "getObject"
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00df }
            java.lang.Class[] r1 = X.AnonymousClass6C9.A1Y(r6, r4, r3, r5)     // Catch:{ all -> 0x00df }
            r1[r7] = r6     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "putObject"
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00df }
            goto L_0x00fb
        L_0x00df:
            r2 = move-exception
            java.lang.Class<X.7ri> r0 = X.C162327ri.class
            java.util.logging.Logger r4 = X.AnonymousClass6C8.A0m(r0)
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r1 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = r1.concat(r0)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "logMissingMethod"
            r4.logp(r3, r1, r0, r2)
        L_0x00f9:
            r0 = 0
            goto L_0x00fc
        L_0x00fb:
            r0 = 1
        L_0x00fc:
            A04 = r0
            java.lang.Class<byte[]> r1 = byte[].class
            if (r0 == 0) goto L_0x0107
            X.7ba r0 = A00
            r0.A03(r1)
        L_0x0107:
            java.lang.Class<boolean[]> r0 = boolean[].class
            A01(r0)
            java.lang.Class<int[]> r0 = int[].class
            A01(r0)
            java.lang.Class<long[]> r0 = long[].class
            A01(r0)
            java.lang.Class<float[]> r0 = float[].class
            A01(r0)
            java.lang.Class<double[]> r0 = double[].class
            A01(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            A01(r0)
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x012f }
            if (r2 != 0) goto L_0x013f
        L_0x012f:
            java.lang.String r0 = "address"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0146 }
            if (r2 == 0) goto L_0x0146
            java.lang.Class r1 = r2.getType()
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L_0x0146
        L_0x013f:
            X.7ba r0 = A00
            if (r0 == 0) goto L_0x0146
            r0.A08(r2)
        L_0x0146:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 == r0) goto L_0x014f
            r5 = 0
        L_0x014f:
            A03 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162327ri.<clinit>():void");
    }
}
