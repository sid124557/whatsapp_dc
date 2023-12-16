package X;

import android.os.Handler;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.0Sp  reason: invalid class name and case insensitive filesystem */
public final class C05250Sp {
    public static final Handler A00 = AnonymousClass000.A0A();
    public static final Field A01;
    public static final Field A02;
    public static final Method A03;
    public static final Method A04;
    public static final Method A05;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r2 == 27) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.app.Activity r11) {
        /*
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            r10 = 1
            if (r2 < r0) goto L_0x000b
            r11.recreate()
            return r10
        L_0x000b:
            r0 = 26
            if (r2 == r0) goto L_0x0014
            r1 = 27
            r0 = 0
            if (r2 != r1) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            r6 = 0
            if (r0 == 0) goto L_0x001d
            java.lang.reflect.Method r0 = A05
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            return r6
        L_0x001d:
            java.lang.reflect.Method r0 = A03
            if (r0 != 0) goto L_0x0026
            java.lang.reflect.Method r0 = A04
            if (r0 != 0) goto L_0x0026
            return r6
        L_0x0026:
            java.lang.reflect.Field r0 = A02     // Catch:{ all -> 0x0091 }
            java.lang.Object r1 = r0.get(r11)     // Catch:{ all -> 0x0091 }
            if (r1 == 0) goto L_0x001c
            java.lang.reflect.Field r0 = A01     // Catch:{ all -> 0x0091 }
            java.lang.Object r8 = r0.get(r11)     // Catch:{ all -> 0x0091 }
            if (r8 == 0) goto L_0x001c
            android.app.Application r5 = r11.getApplication()     // Catch:{ all -> 0x0091 }
            X.0Yu r4 = new X.0Yu     // Catch:{ all -> 0x0091 }
            r4.<init>(r11)     // Catch:{ all -> 0x0091 }
            r5.registerActivityLifecycleCallbacks(r4)     // Catch:{ all -> 0x0091 }
            android.os.Handler r3 = A00     // Catch:{ all -> 0x0091 }
            X.0kD r0 = new X.0kD     // Catch:{ all -> 0x0091 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0091 }
            r3.post(r0)     // Catch:{ all -> 0x0091 }
            r0 = 26
            if (r2 == r0) goto L_0x0058
            r0 = 27
            if (r2 == r0) goto L_0x0058
            r11.recreate()     // Catch:{ all -> 0x0087 }
            goto L_0x007e
        L_0x0058:
            java.lang.reflect.Method r9 = A05     // Catch:{ all -> 0x0087 }
            r0 = 9
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch:{ all -> 0x0087 }
            r7[r6] = r1     // Catch:{ all -> 0x0087 }
            r2 = 0
            r7[r10] = r2     // Catch:{ all -> 0x0087 }
            r0 = 2
            r7[r0] = r2     // Catch:{ all -> 0x0087 }
            X.AnonymousClass000.A1O(r7, r6)     // Catch:{ all -> 0x0087 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0087 }
            r0 = 4
            r7[r0] = r1     // Catch:{ all -> 0x0087 }
            r0 = 5
            r7[r0] = r2     // Catch:{ all -> 0x0087 }
            r0 = 6
            r7[r0] = r2     // Catch:{ all -> 0x0087 }
            r0 = 7
            r7[r0] = r1     // Catch:{ all -> 0x0087 }
            r0 = 8
            r7[r0] = r1     // Catch:{ all -> 0x0087 }
            r9.invoke(r8, r7)     // Catch:{ all -> 0x0087 }
        L_0x007e:
            X.0kE r0 = new X.0kE     // Catch:{ all -> 0x0091 }
            r0.<init>(r5, r4)     // Catch:{ all -> 0x0091 }
            r3.post(r0)     // Catch:{ all -> 0x0091 }
            return r10
        L_0x0087:
            r1 = move-exception
            X.0kE r0 = new X.0kE     // Catch:{ all -> 0x0091 }
            r0.<init>(r5, r4)     // Catch:{ all -> 0x0091 }
            r3.post(r0)     // Catch:{ all -> 0x0091 }
            throw r1     // Catch:{ all -> 0x0091 }
        L_0x0091:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05250Sp.A00(android.app.Activity):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0070, code lost:
        if (r2 == 27) goto L_0x0072;
     */
    static {
        /*
            android.os.Handler r0 = X.AnonymousClass000.A0A()
            A00 = r0
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r5 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.String r0 = "mMainThread"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x001b }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ all -> 0x001b }
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            A01 = r1
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.String r0 = "mToken"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x002b }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ all -> 0x002b }
            goto L_0x002c
        L_0x002b:
            r1 = 0
        L_0x002c:
            A02 = r1
            r6 = 0
            if (r5 == 0) goto L_0x004b
            java.lang.String r4 = "performStopActivity"
            r0 = 3
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch:{ all -> 0x004b }
            java.lang.Class<android.os.IBinder> r1 = android.os.IBinder.class
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x004b }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x004b }
            r2 = 1
            r3[r2] = r0     // Catch:{ all -> 0x004b }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0 = 2
            java.lang.reflect.Method r0 = X.AnonymousClass002.A0H(r5, r1, r4, r3, r0)     // Catch:{ all -> 0x004b }
            r0.setAccessible(r2)     // Catch:{ all -> 0x004b }
            r6 = r0
        L_0x004b:
            A04 = r6
            r4 = 0
            if (r5 == 0) goto L_0x0065
            java.lang.String r3 = "performStopActivity"
            r0 = 2
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x0065 }
            java.lang.Class<android.os.IBinder> r1 = android.os.IBinder.class
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0065 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0065 }
            r1 = 1
            java.lang.reflect.Method r0 = X.AnonymousClass002.A0H(r5, r0, r3, r2, r1)     // Catch:{ all -> 0x0065 }
            r0.setAccessible(r1)     // Catch:{ all -> 0x0065 }
            r4 = r0
        L_0x0065:
            A03 = r4
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 == r0) goto L_0x0072
            r1 = 27
            r0 = 0
            if (r2 != r1) goto L_0x0073
        L_0x0072:
            r0 = 1
        L_0x0073:
            r7 = 0
            if (r0 == 0) goto L_0x00aa
            if (r5 == 0) goto L_0x00aa
            java.lang.String r6 = "requestRelaunchActivity"
            r0 = 9
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ all -> 0x00aa }
            java.lang.Class<android.os.IBinder> r1 = android.os.IBinder.class
            r0 = 0
            r4[r0] = r1     // Catch:{ all -> 0x00aa }
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r3 = 1
            r4[r3] = r1     // Catch:{ all -> 0x00aa }
            r0 = 2
            r4[r0] = r1     // Catch:{ all -> 0x00aa }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00aa }
            r0 = 3
            r4[r0] = r1     // Catch:{ all -> 0x00aa }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00aa }
            r0 = 4
            r4[r0] = r2     // Catch:{ all -> 0x00aa }
            java.lang.Class<android.content.res.Configuration> r1 = android.content.res.Configuration.class
            r0 = 5
            r4[r0] = r1     // Catch:{ all -> 0x00aa }
            r0 = 6
            r4[r0] = r1     // Catch:{ all -> 0x00aa }
            r0 = 7
            r4[r0] = r2     // Catch:{ all -> 0x00aa }
            r0 = 8
            java.lang.reflect.Method r0 = X.AnonymousClass002.A0H(r5, r2, r6, r4, r0)     // Catch:{ all -> 0x00aa }
            r0.setAccessible(r3)     // Catch:{ all -> 0x00aa }
            r7 = r0
        L_0x00aa:
            A05 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05250Sp.<clinit>():void");
    }
}
