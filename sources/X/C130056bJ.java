package X;

import sun.misc.Unsafe;

/* renamed from: X.6bJ  reason: invalid class name and case insensitive filesystem */
public final class C130056bJ extends C153187ao {
    public static final long A00;
    public static final long A01;
    public static final long A02;
    public static final long A03;
    public static final long A04;
    public static final Unsafe A05;

    public boolean A04(C130076bL r8, Object obj, Object obj2) {
        Unsafe unsafe = A05;
        long j = A01;
        while (!unsafe.compareAndSwapObject(r8, j, (Object) null, obj2)) {
            if (unsafe.getObject(r8, j) != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|5|(3:6|7|8)) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        throw X.AnonymousClass6CA.A0Q("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    static {
        /*
            java.lang.Class<X.7my> r3 = X.C160067my.class
            sun.misc.Unsafe r2 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
            goto L_0x0012
        L_0x0007:
            X.8N1 r0 = new X.8N1     // Catch:{ PrivilegedActionException -> 0x0062 }
            r0.<init>()     // Catch:{ PrivilegedActionException -> 0x0062 }
            java.lang.Object r2 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x0062 }
            sun.misc.Unsafe r2 = (sun.misc.Unsafe) r2     // Catch:{ PrivilegedActionException -> 0x0062 }
        L_0x0012:
            java.lang.Class<X.6bL> r4 = X.C130076bL.class
            java.lang.String r0 = "waiters"
            java.lang.reflect.Field r0 = r4.getDeclaredField(r0)     // Catch:{ Exception -> 0x0053 }
            long r0 = r2.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
            A02 = r0     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = "listeners"
            java.lang.reflect.Field r0 = r4.getDeclaredField(r0)     // Catch:{ Exception -> 0x0053 }
            long r0 = r2.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
            A00 = r0     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = "value"
            java.lang.reflect.Field r0 = r4.getDeclaredField(r0)     // Catch:{ Exception -> 0x0053 }
            long r0 = r2.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
            A01 = r0     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = "thread"
            java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch:{ Exception -> 0x0053 }
            long r0 = r2.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
            A04 = r0     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = "next"
            java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch:{ Exception -> 0x0053 }
            long r0 = r2.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
            A03 = r0     // Catch:{ Exception -> 0x0053 }
            A05 = r2     // Catch:{ Exception -> 0x0053 }
            return
        L_0x0053:
            r1 = move-exception
            boolean r0 = r1 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L_0x0061
            boolean r0 = r1 instanceof java.lang.Error
            if (r0 != 0) goto L_0x0061
            java.lang.RuntimeException r0 = X.C18330xA.A09(r1)
            throw r0
        L_0x0061:
            throw r1
        L_0x0062:
            r0 = move-exception
            java.lang.String r1 = "Could not initialize intrinsics"
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = X.AnonymousClass6CA.A0Q(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130056bJ.<clinit>():void");
    }

    public void A00(C160067my r4, C160067my r5) {
        A05.putObject(r4, A03, r5);
    }

    public void A01(C160067my r4, Thread thread) {
        A05.putObject(r4, A04, thread);
    }

    public boolean A02(C160107n3 r8, C160107n3 r9, C130076bL r10) {
        Unsafe unsafe = A05;
        long j = A00;
        do {
            if (unsafe.compareAndSwapObject(r10, j, r8, r9)) {
                return true;
            }
        } while (unsafe.getObject(r10, j) == r8);
        return false;
    }

    public boolean A03(C160067my r8, C160067my r9, C130076bL r10) {
        Unsafe unsafe = A05;
        long j = A02;
        do {
            if (unsafe.compareAndSwapObject(r10, j, r8, r9)) {
                return true;
            }
        } while (unsafe.getObject(r10, j) == r8);
        return false;
    }
}
