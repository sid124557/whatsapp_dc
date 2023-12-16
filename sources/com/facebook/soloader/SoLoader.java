package com.facebook.soloader;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass6NP;
import X.AnonymousClass6NQ;
import X.AnonymousClass7Uk;
import X.C1443571f;
import X.C159587m8;
import X.C18310x6;
import X.C183788qe;
import android.content.Context;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SoLoader {
    public static boolean A00 = true;
    public static int A01;
    public static int A02;
    public static AnonymousClass6NQ A03;
    public static C183788qe A04;
    public static AnonymousClass6NP[] A05;
    public static final HashSet A06 = AnonymousClass002.A0K();
    public static final Map A07 = AnonymousClass001.A0t();
    public static final Set A08 = Collections.newSetFromMap(AnonymousClass0x9.A1D());
    public static final AtomicInteger A09 = new AtomicInteger(0);
    public static final ReentrantReadWriteLock A0A = new ReentrantReadWriteLock();
    public static final String[] A0B = {System.mapLibraryName("breakpad")};
    public static volatile AnonymousClass7Uk[] A0C;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087 A[LOOP:0: B:1:0x0001->B:20:0x0087, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(android.os.StrictMode.ThreadPolicy r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16) {
        /*
            r4 = 0
        L_0x0001:
            r0 = r16
            boolean r4 = A05(r12, r13, r14, r15, r0)     // Catch:{ UnsatisfiedLinkError -> 0x0008 }
            return r4
        L_0x0008:
            r11 = move-exception
            java.util.concurrent.atomic.AtomicInteger r10 = A09
            int r3 = r10.get()
            java.util.concurrent.locks.ReentrantReadWriteLock r9 = A0A
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r9.writeLock()
            r0.lock()
            X.6NQ r7 = A03     // Catch:{ IOException -> 0x0091 }
            if (r7 == 0) goto L_0x007d
            X.6NR r0 = r7.A02     // Catch:{ IOException -> 0x0091 }
            java.io.File r2 = r0.A01     // Catch:{ IOException -> 0x0091 }
            android.content.Context r1 = r7.A01     // Catch:{ NameNotFoundException -> 0x008a }
            java.lang.String r0 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x008a }
            android.content.Context r6 = r1.createPackageContext(r0, r4)     // Catch:{ NameNotFoundException -> 0x008a }
            android.content.pm.ApplicationInfo r0 = r6.getApplicationInfo()     // Catch:{ IOException -> 0x0091 }
            java.lang.String r0 = r0.nativeLibraryDir     // Catch:{ IOException -> 0x0091 }
            java.io.File r8 = X.AnonymousClass002.A0B(r0)     // Catch:{ IOException -> 0x0091 }
            boolean r0 = r2.equals(r8)     // Catch:{ IOException -> 0x0091 }
            if (r0 != 0) goto L_0x007d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0091 }
            java.lang.String r0 = "Native library directory updated from "
            r1.append(r0)     // Catch:{ IOException -> 0x0091 }
            r1.append(r2)     // Catch:{ IOException -> 0x0091 }
            java.lang.String r0 = " to "
            java.lang.String r0 = X.AnonymousClass000.A0P(r8, r0, r1)     // Catch:{ IOException -> 0x0091 }
            java.lang.String r5 = "SoLoader"
            android.util.Log.d(r5, r0)     // Catch:{ IOException -> 0x0091 }
            int r0 = r7.A00     // Catch:{ IOException -> 0x0091 }
            r2 = r0 | 1
            r7.A00 = r2     // Catch:{ IOException -> 0x0091 }
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ IOException -> 0x0091 }
            X.6NR r1 = new X.6NR     // Catch:{ IOException -> 0x0091 }
            r1.<init>(r8, r0, r2)     // Catch:{ IOException -> 0x0091 }
            r7.A02 = r1     // Catch:{ IOException -> 0x0091 }
            int r0 = r7.A00     // Catch:{ IOException -> 0x0091 }
            r1.A03(r0)     // Catch:{ IOException -> 0x0091 }
            r7.A01 = r6     // Catch:{ IOException -> 0x0091 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0091 }
            java.lang.String r0 = "sApplicationSoSource updated during load: "
            r1.append(r0)     // Catch:{ IOException -> 0x0091 }
            r1.append(r13)     // Catch:{ IOException -> 0x0091 }
            java.lang.String r0 = ", attempting load again."
            X.AnonymousClass000.A1F(r0, r5, r1)     // Catch:{ IOException -> 0x0091 }
            r10.getAndIncrement()     // Catch:{ IOException -> 0x0091 }
            r1 = 1
            goto L_0x007e
        L_0x007d:
            r1 = 0
        L_0x007e:
            X.AnonymousClass0x7.A1M(r9)
            int r0 = r10.get()
            if (r0 == r3) goto L_0x0090
            if (r1 != 0) goto L_0x0001
            return r4
        L_0x008a:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)     // Catch:{ IOException -> 0x0091 }
            throw r0     // Catch:{ IOException -> 0x0091 }
        L_0x0090:
            throw r11
        L_0x0091:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)     // Catch:{ all -> 0x0097 }
            throw r0     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r0 = move-exception
            X.AnonymousClass0x7.A1M(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.A04(android.os.StrictMode$ThreadPolicy, java.lang.String, java.lang.String, java.lang.String, int):boolean");
    }

    public static void init(Context context, int i) {
        A01(context, (C183788qe) null, A0B, i);
    }

    public static int A00() {
        ReentrantReadWriteLock reentrantReadWriteLock = A0A;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i = A02;
            boolean A1S = AnonymousClass000.A1S(i & 2);
            if ((i & 256) != 0) {
                A1S |= true;
            }
            return A1S ? 1 : 0;
        } finally {
            AnonymousClass0x7.A1M(reentrantReadWriteLock);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x017e A[Catch:{ Exception -> 0x013a, all -> 0x0398 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01a4 A[Catch:{ Exception -> 0x013a, all -> 0x0398 }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0345 A[Catch:{ Exception -> 0x013a, all -> 0x0398 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x037f A[Catch:{ Exception -> 0x013a, all -> 0x0398 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0372 A[EDGE_INSN: B:243:0x0372->B:176:0x0372 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Context r19, X.C183788qe r20, java.lang.String[] r21, int r22) {
        /*
            r15 = r20
            r5 = r22
            boolean r0 = A03()
            if (r0 != 0) goto L_0x0402
            android.os.StrictMode$ThreadPolicy r14 = android.os.StrictMode.allowThreadDiskWrites()
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x03fd }
            r0 = 23
            r3 = 1
            r7 = r19
            if (r1 < r0) goto L_0x004a
            r4 = 0
            java.lang.String r4 = r7.getPackageName()     // Catch:{ Exception -> 0x0034 }
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch:{ Exception -> 0x0034 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r4, r0)     // Catch:{ Exception -> 0x0034 }
            android.os.Bundle r1 = r0.metaData     // Catch:{ Exception -> 0x0034 }
            if (r1 == 0) goto L_0x004a
            java.lang.String r0 = "com.facebook.soloader.enabled"
            boolean r0 = r1.getBoolean(r0, r3)     // Catch:{ all -> 0x03fd }
            if (r0 != 0) goto L_0x004a
            r3 = 0
            goto L_0x004a
        L_0x0034:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03fd }
            java.lang.String r0 = "Unexpected issue with package manager ("
            r1.append(r0)     // Catch:{ all -> 0x03fd }
            r1.append(r4)     // Catch:{ all -> 0x03fd }
            java.lang.String r1 = X.AnonymousClass000.A0e(r1)     // Catch:{ all -> 0x03fd }
            java.lang.String r0 = "SoLoader"
            android.util.Log.w(r0, r1, r2)     // Catch:{ all -> 0x03fd }
        L_0x004a:
            A00 = r3     // Catch:{ all -> 0x03fd }
            java.lang.String r2 = "SoLoader"
            if (r3 == 0) goto L_0x039d
            int r3 = A01     // Catch:{ all -> 0x03fd }
            if (r3 != 0) goto L_0x0089
            r0 = r22 & 32
            r3 = 1
            if (r0 != 0) goto L_0x0089
            if (r19 == 0) goto L_0x0089
            android.content.pm.ApplicationInfo r6 = r7.getApplicationInfo()     // Catch:{ all -> 0x03fd }
            int r4 = r6.flags     // Catch:{ all -> 0x03fd }
            r0 = r4 & 1
            r1 = 3
            if (r0 == 0) goto L_0x006c
            r0 = r4 & 128(0x80, float:1.794E-43)
            r3 = 2
            if (r0 == 0) goto L_0x006c
            r3 = 3
        L_0x006c:
            boolean r0 = android.util.Log.isLoggable(r2, r1)     // Catch:{ all -> 0x03fd }
            if (r0 == 0) goto L_0x0089
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03fd }
            java.lang.String r0 = "ApplicationInfo.flags is: "
            r1.append(r0)     // Catch:{ all -> 0x03fd }
            int r0 = r6.flags     // Catch:{ all -> 0x03fd }
            r1.append(r0)     // Catch:{ all -> 0x03fd }
            java.lang.String r0 = " appType is: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)     // Catch:{ all -> 0x03fd }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x03fd }
        L_0x0089:
            A01 = r3     // Catch:{ all -> 0x03fd }
            r0 = r5 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x009d
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x03fd }
            r0 = 23
            if (r1 < r0) goto L_0x009d
            boolean r0 = com.facebook.soloader.SysUtil$MarshmallowSysdeps.A02(r7, r3)     // Catch:{ all -> 0x03fd }
            if (r0 == 0) goto L_0x009d
            r5 = r22 | 72
        L_0x009d:
            java.lang.Class<com.facebook.soloader.SoLoader> r11 = com.facebook.soloader.SoLoader.class
            monitor-enter(r11)     // Catch:{ all -> 0x03fd }
            if (r20 != 0) goto L_0x010e
            X.8qe r0 = A04     // Catch:{ all -> 0x03fa }
            if (r0 != 0) goto L_0x0110
            java.lang.Runtime r16 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x03fa }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x03fa }
            r0 = 23
            r19 = 0
            if (r1 < r0) goto L_0x00fd
            r0 = 27
            if (r1 > r0) goto L_0x00fd
            java.lang.Class<java.lang.Runtime> r6 = java.lang.Runtime.class
            java.lang.String r4 = "nativeLoad"
            r0 = 3
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException | SecurityException -> 0x00f7 }
            r0 = 0
            r3[r0] = r8     // Catch:{ NoSuchMethodException | SecurityException -> 0x00f7 }
            java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
            r1 = 1
            X.C18300x5.A1K(r0, r8, r3)     // Catch:{ NoSuchMethodException | SecurityException -> 0x00f7 }
            java.lang.reflect.Method r0 = r6.getDeclaredMethod(r4, r3)     // Catch:{ NoSuchMethodException | SecurityException -> 0x00f7 }
            r0.setAccessible(r1)     // Catch:{ NoSuchMethodException | SecurityException -> 0x00f7 }
            r19 = r0
            r20 = 1
            java.lang.String r9 = com.facebook.soloader.SysUtil$Api14Utils.A00()     // Catch:{ all -> 0x03fa }
            if (r9 == 0) goto L_0x0100
            java.lang.String r10 = ":"
            java.lang.String[] r8 = r9.split(r10)     // Catch:{ all -> 0x03fa }
            int r6 = r8.length     // Catch:{ all -> 0x03fa }
            java.util.ArrayList r4 = X.AnonymousClass002.A0I(r6)     // Catch:{ all -> 0x03fa }
            r3 = 0
        L_0x00e5:
            if (r3 >= r6) goto L_0x0103
            r1 = r8[r3]     // Catch:{ all -> 0x03fa }
            java.lang.String r0 = "!"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x03fa }
            if (r0 != 0) goto L_0x00f4
            r4.add(r1)     // Catch:{ all -> 0x03fa }
        L_0x00f4:
            int r3 = r3 + 1
            goto L_0x00e5
        L_0x00f7:
            r1 = move-exception
            java.lang.String r0 = "Cannot get nativeLoad method"
            android.util.Log.w(r2, r0, r1)     // Catch:{ all -> 0x03fa }
        L_0x00fd:
            r20 = 0
            r9 = 0
        L_0x0100:
            r18 = 0
            goto L_0x0107
        L_0x0103:
            java.lang.String r18 = android.text.TextUtils.join(r10, r4)     // Catch:{ all -> 0x03fa }
        L_0x0107:
            X.84u r15 = new X.84u     // Catch:{ all -> 0x03fa }
            r17 = r9
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x03fa }
        L_0x010e:
            A04 = r15     // Catch:{ all -> 0x03fa }
        L_0x0110:
            monitor-exit(r11)     // Catch:{ all -> 0x03fd }
            X.7Uk[] r0 = A0C     // Catch:{ all -> 0x03fd }
            if (r0 != 0) goto L_0x03ca
            java.util.concurrent.locks.ReentrantReadWriteLock r13 = A0A     // Catch:{ all -> 0x03fd }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r13.writeLock()     // Catch:{ all -> 0x03fd }
            r0.lock()     // Catch:{ all -> 0x03fd }
            X.7Uk[] r0 = A0C     // Catch:{ all -> 0x0398 }
            if (r0 != 0) goto L_0x03c7
            A02 = r5     // Catch:{ all -> 0x0398 }
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0398 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0398 }
            r0 = 23
            if (r1 < r0) goto L_0x0133
            boolean r0 = com.facebook.soloader.SysUtil$MarshmallowSysdeps.is64Bit()     // Catch:{ all -> 0x0398 }
            goto L_0x0137
        L_0x0133:
            boolean r0 = com.facebook.soloader.SysUtil$LollipopSysdeps.is64Bit()     // Catch:{ Exception -> 0x013a }
        L_0x0137:
            if (r0 == 0) goto L_0x0151
            goto L_0x0154
        L_0x013a:
            r0 = move-exception
            java.lang.Object[] r3 = X.AnonymousClass002.A0L()     // Catch:{ all -> 0x0398 }
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0398 }
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = "Could not read /proc/self/exe. Err msg: %s"
            java.lang.String r1 = java.lang.String.format(r0, r3)     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = "SysUtil"
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x0398 }
        L_0x0151:
            java.lang.String r6 = "/system/lib:/vendor/lib"
            goto L_0x0156
        L_0x0154:
            java.lang.String r6 = "/system/lib64:/vendor/lib64"
        L_0x0156:
            java.lang.String r0 = "LD_LIBRARY_PATH"
            java.lang.String r3 = java.lang.System.getenv(r0)     // Catch:{ all -> 0x0398 }
            java.lang.String r1 = ":"
            if (r3 == 0) goto L_0x016c
            java.lang.String r0 = ""
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0398 }
            if (r0 != 0) goto L_0x016c
            java.lang.String r6 = X.C18260x0.A06(r6, r1, r3)     // Catch:{ all -> 0x0398 }
        L_0x016c:
            java.lang.String[] r0 = r6.split(r1)     // Catch:{ all -> 0x0398 }
            java.util.HashSet r0 = X.C18280x3.A0h(r0)     // Catch:{ all -> 0x0398 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0398 }
        L_0x0178:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0398 }
            if (r0 == 0) goto L_0x01a1
            java.lang.String r3 = X.AnonymousClass001.A0m(r6)     // Catch:{ all -> 0x0398 }
            boolean r0 = X.AnonymousClass6C9.A1Q(r2)     // Catch:{ all -> 0x0398 }
            if (r0 == 0) goto L_0x0191
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = "adding system library source: "
            X.AnonymousClass6C7.A1G(r0, r3, r2, r1)     // Catch:{ all -> 0x0398 }
        L_0x0191:
            java.io.File r3 = X.AnonymousClass002.A0B(r3)     // Catch:{ all -> 0x0398 }
            r1 = 2
            X.6NR r0 = new X.6NR     // Catch:{ all -> 0x0398 }
            r8 = r21
            r0.<init>(r3, r8, r1)     // Catch:{ all -> 0x0398 }
            r4.add(r0)     // Catch:{ all -> 0x0398 }
            goto L_0x0178
        L_0x01a1:
            r6 = 3
            if (r7 == 0) goto L_0x0330
            r0 = r5 & 1
            if (r0 == 0) goto L_0x01be
            int r3 = A01     // Catch:{ all -> 0x0398 }
            r1 = 1
            r0 = 0
            if (r3 == r1) goto L_0x0316
            r0 = 2
            if (r3 == r0) goto L_0x01bb
            if (r3 == r6) goto L_0x01bb
            java.lang.String r0 = "Unsupported app type, we should not reach here"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)     // Catch:{ all -> 0x0398 }
            goto L_0x023f
        L_0x01bb:
            r0 = 1
            goto L_0x0316
        L_0x01be:
            r0 = r5 & 64
            if (r0 == 0) goto L_0x022e
            android.content.pm.ApplicationInfo r0 = r7.getApplicationInfo()     // Catch:{ all -> 0x0398 }
            java.lang.String[] r0 = r0.splitSourceDirs     // Catch:{ all -> 0x0398 }
            r5 = 0
            if (r0 == 0) goto L_0x0206
            android.content.pm.ApplicationInfo r0 = r7.getApplicationInfo()     // Catch:{ all -> 0x0398 }
            java.lang.String[] r10 = r0.splitSourceDirs     // Catch:{ all -> 0x0398 }
            int r9 = r10.length     // Catch:{ all -> 0x0398 }
            r8 = 0
        L_0x01d3:
            if (r8 >= r9) goto L_0x0206
            r0 = r10[r8]     // Catch:{ all -> 0x0398 }
            java.io.File r0 = X.AnonymousClass002.A0B(r0)     // Catch:{ all -> 0x0398 }
            X.6NS r3 = new X.6NS     // Catch:{ all -> 0x0398 }
            r3.<init>((java.io.File) r0)     // Catch:{ all -> 0x0398 }
            boolean r0 = android.util.Log.isLoggable(r2, r6)     // Catch:{ all -> 0x0398 }
            if (r0 == 0) goto L_0x01f6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = "validating/adding directApk source from splitApk: "
            X.C18270x1.A1H(r1, r0, r3)     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0398 }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x0398 }
        L_0x01f6:
            java.util.Set r0 = r3.A02     // Catch:{ all -> 0x0398 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0398 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0203
            r4.add(r5, r3)     // Catch:{ all -> 0x0398 }
        L_0x0203:
            int r8 = r8 + 1
            goto L_0x01d3
        L_0x0206:
            X.6NS r3 = new X.6NS     // Catch:{ all -> 0x0398 }
            r3.<init>((android.content.Context) r7)     // Catch:{ all -> 0x0398 }
            boolean r0 = android.util.Log.isLoggable(r2, r6)     // Catch:{ all -> 0x0398 }
            if (r0 == 0) goto L_0x0221
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = "validating/adding directApk source: "
            X.C18270x1.A1H(r1, r0, r3)     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0398 }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x0398 }
        L_0x0221:
            java.util.Set r0 = r3.A02     // Catch:{ all -> 0x0398 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0398 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x022e
            r4.add(r5, r3)     // Catch:{ all -> 0x0398 }
        L_0x022e:
            int r3 = A01     // Catch:{ all -> 0x0398 }
            r1 = 1
            r0 = 0
            if (r3 == r1) goto L_0x0241
            r0 = 2
            if (r3 == r0) goto L_0x0240
            if (r3 == r6) goto L_0x0240
            java.lang.String r0 = "Unsupported app type, we should not reach here"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)     // Catch:{ all -> 0x0398 }
        L_0x023f:
            throw r0     // Catch:{ all -> 0x0398 }
        L_0x0240:
            r0 = 1
        L_0x0241:
            A02(r7, r4, r0)     // Catch:{ all -> 0x0398 }
            int r0 = A02     // Catch:{ all -> 0x0398 }
            r0 = r0 & 8
            java.lang.String r5 = "lib-main"
            if (r0 == 0) goto L_0x0282
            r0 = 0
            A05 = r0     // Catch:{ all -> 0x0398 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0398 }
            android.content.pm.ApplicationInfo r0 = r7.getApplicationInfo()     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = r0.dataDir     // Catch:{ all -> 0x0398 }
            r1.append(r0)     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = "/"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r5, r1)     // Catch:{ all -> 0x0398 }
            java.io.File r5 = X.AnonymousClass002.A0B(r0)     // Catch:{ all -> 0x0398 }
            X.C159237lU.A00(r5)     // Catch:{ IOException -> 0x026b }
            goto L_0x0330
        L_0x026b:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = "Failed to delete "
            r1.append(r0)     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = r5.getCanonicalPath()     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0398 }
            android.util.Log.w(r2, r0, r3)     // Catch:{ all -> 0x0398 }
            goto L_0x0330
        L_0x0282:
            android.content.pm.ApplicationInfo r0 = r7.getApplicationInfo()     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = r0.sourceDir     // Catch:{ all -> 0x0398 }
            java.io.File r0 = X.AnonymousClass002.A0B(r0)     // Catch:{ all -> 0x0398 }
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0398 }
            X.6Na r3 = new X.6Na     // Catch:{ all -> 0x0398 }
            r3.<init>(r7, r0, r5)     // Catch:{ all -> 0x0398 }
            r8.add(r3)     // Catch:{ all -> 0x0398 }
            boolean r0 = android.util.Log.isLoggable(r2, r6)     // Catch:{ all -> 0x0398 }
            if (r0 == 0) goto L_0x02ae
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = "adding backup source from : "
            X.C18270x1.A1H(r1, r0, r3)     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0398 }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x0398 }
        L_0x02ae:
            android.content.pm.ApplicationInfo r0 = r7.getApplicationInfo()     // Catch:{ all -> 0x0398 }
            java.lang.String[] r0 = r0.splitSourceDirs     // Catch:{ all -> 0x0398 }
            if (r0 == 0) goto L_0x0303
            boolean r0 = android.util.Log.isLoggable(r2, r6)     // Catch:{ all -> 0x0398 }
            if (r0 == 0) goto L_0x02c1
            java.lang.String r0 = "adding backup sources from split apks"
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x0398 }
        L_0x02c1:
            android.content.pm.ApplicationInfo r0 = r7.getApplicationInfo()     // Catch:{ all -> 0x0398 }
            java.lang.String[] r11 = r0.splitSourceDirs     // Catch:{ all -> 0x0398 }
            int r10 = r11.length     // Catch:{ all -> 0x0398 }
            r9 = 0
            r3 = 0
        L_0x02ca:
            if (r9 >= r10) goto L_0x0303
            r0 = r11[r9]     // Catch:{ all -> 0x0398 }
            java.io.File r12 = X.AnonymousClass002.A0B(r0)     // Catch:{ all -> 0x0398 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = "lib-"
            r1.append(r0)     // Catch:{ all -> 0x0398 }
            int r5 = r3 + 1
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r3)     // Catch:{ all -> 0x0398 }
            X.6Na r3 = new X.6Na     // Catch:{ all -> 0x0398 }
            r3.<init>(r7, r12, r0)     // Catch:{ all -> 0x0398 }
            boolean r0 = android.util.Log.isLoggable(r2, r6)     // Catch:{ all -> 0x0398 }
            if (r0 == 0) goto L_0x02fc
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = "adding backup source: "
            X.C18270x1.A1H(r1, r0, r3)     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0398 }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x0398 }
        L_0x02fc:
            r8.add(r3)     // Catch:{ all -> 0x0398 }
            int r9 = r9 + 1
            r3 = r5
            goto L_0x02ca
        L_0x0303:
            int r0 = r8.size()     // Catch:{ all -> 0x0398 }
            X.6NP[] r0 = new X.AnonymousClass6NP[r0]     // Catch:{ all -> 0x0398 }
            java.lang.Object[] r0 = r8.toArray(r0)     // Catch:{ all -> 0x0398 }
            X.6NP[] r0 = (X.AnonymousClass6NP[]) r0     // Catch:{ all -> 0x0398 }
            A05 = r0     // Catch:{ all -> 0x0398 }
            r0 = 0
            r4.addAll(r0, r8)     // Catch:{ all -> 0x0398 }
            goto L_0x0330
        L_0x0316:
            A02(r7, r4, r0)     // Catch:{ all -> 0x0398 }
            r0 = 0
            A05 = r0     // Catch:{ all -> 0x0398 }
            boolean r0 = android.util.Log.isLoggable(r2, r6)     // Catch:{ all -> 0x0398 }
            if (r0 == 0) goto L_0x0327
            java.lang.String r0 = "adding exo package source: lib-main"
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x0398 }
        L_0x0327:
            X.6NZ r1 = new X.6NZ     // Catch:{ all -> 0x0398 }
            r1.<init>(r7)     // Catch:{ all -> 0x0398 }
            r0 = 0
            r4.add(r0, r1)     // Catch:{ all -> 0x0398 }
        L_0x0330:
            int r0 = r4.size()     // Catch:{ all -> 0x0398 }
            X.7Uk[] r0 = new X.AnonymousClass7Uk[r0]     // Catch:{ all -> 0x0398 }
            java.lang.Object[] r5 = r4.toArray(r0)     // Catch:{ all -> 0x0398 }
            X.7Uk[] r5 = (X.AnonymousClass7Uk[]) r5     // Catch:{ all -> 0x0398 }
            int r4 = A00()     // Catch:{ all -> 0x0398 }
            int r0 = r5.length     // Catch:{ all -> 0x0398 }
        L_0x0341:
            int r3 = r0 + -1
            if (r0 <= 0) goto L_0x0372
            boolean r0 = android.util.Log.isLoggable(r2, r6)     // Catch:{ all -> 0x0398 }
            if (r0 == 0) goto L_0x035d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = "Preparing SO source: "
            r1.append(r0)     // Catch:{ all -> 0x0398 }
            r0 = r5[r3]     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)     // Catch:{ all -> 0x0398 }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x0398 }
        L_0x035d:
            java.lang.String r1 = "_"
            r0 = r5[r3]     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = X.C18310x6.A0n(r0)     // Catch:{ all -> 0x0398 }
            com.facebook.soloader.Api18TraceUtils.A01(r2, r1, r0)     // Catch:{ all -> 0x0398 }
            r0 = r5[r3]     // Catch:{ all -> 0x0398 }
            r0.A03(r4)     // Catch:{ all -> 0x0398 }
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x0398 }
            r0 = r3
            goto L_0x0341
        L_0x0372:
            A0C = r5     // Catch:{ all -> 0x0398 }
            java.util.concurrent.atomic.AtomicInteger r0 = A09     // Catch:{ all -> 0x0398 }
            r0.getAndIncrement()     // Catch:{ all -> 0x0398 }
            boolean r0 = android.util.Log.isLoggable(r2, r6)     // Catch:{ all -> 0x0398 }
            if (r0 == 0) goto L_0x03c7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = "init finish: "
            r1.append(r0)     // Catch:{ all -> 0x0398 }
            X.7Uk[] r0 = A0C     // Catch:{ all -> 0x0398 }
            int r0 = r0.length     // Catch:{ all -> 0x0398 }
            r1.append(r0)     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = " SO sources prepared"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0398 }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x0398 }
            goto L_0x03c7
        L_0x0398:
            r0 = move-exception
            X.AnonymousClass0x7.A1M(r13)     // Catch:{ all -> 0x03fd }
            goto L_0x03fc
        L_0x039d:
            X.7Uk[] r0 = A0C     // Catch:{ all -> 0x03fd }
            if (r0 != 0) goto L_0x03bc
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = A0A     // Catch:{ all -> 0x03fd }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r1.writeLock()     // Catch:{ all -> 0x03fd }
            r0.lock()     // Catch:{ all -> 0x03fd }
            X.7Uk[] r0 = A0C     // Catch:{ all -> 0x03b4 }
            if (r0 != 0) goto L_0x03b9
            r0 = 0
            X.7Uk[] r0 = new X.AnonymousClass7Uk[r0]     // Catch:{ all -> 0x03b4 }
            A0C = r0     // Catch:{ all -> 0x03b4 }
            goto L_0x03b9
        L_0x03b4:
            r0 = move-exception
            X.AnonymousClass0x7.A1M(r1)     // Catch:{ all -> 0x03fd }
            goto L_0x03fc
        L_0x03b9:
            X.AnonymousClass0x7.A1M(r1)     // Catch:{ all -> 0x03fd }
        L_0x03bc:
            java.lang.String r0 = "Init System Loader delegate"
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x03fd }
            X.84w r2 = new X.84w     // Catch:{ all -> 0x03fd }
            r2.<init>()     // Catch:{ all -> 0x03fd }
            goto L_0x03d4
        L_0x03c7:
            X.AnonymousClass0x7.A1M(r13)     // Catch:{ all -> 0x03fd }
        L_0x03ca:
            java.lang.String r0 = "Init SoLoader delegate"
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x03fd }
            X.84v r2 = new X.84v     // Catch:{ all -> 0x03fd }
            r2.<init>()     // Catch:{ all -> 0x03fd }
        L_0x03d4:
            java.lang.Class<X.7m8> r1 = X.C159587m8.class
            monitor-enter(r1)     // Catch:{ all -> 0x03fd }
            X.8qf r0 = X.C159587m8.A00     // Catch:{ all -> 0x03f7 }
            boolean r0 = X.AnonymousClass000.A1W(r0)
            monitor-exit(r1)     // Catch:{ all -> 0x03f7 }
            if (r0 != 0) goto L_0x03f3
            monitor-enter(r1)     // Catch:{ all -> 0x03fd }
            X.8qf r0 = X.C159587m8.A00     // Catch:{ all -> 0x03f0 }
            if (r0 != 0) goto L_0x03e9
            X.C159587m8.A00 = r2     // Catch:{ all -> 0x03f0 }
            monitor-exit(r1)     // Catch:{ all -> 0x03f0 }
            goto L_0x03f3
        L_0x03e9:
            java.lang.String r0 = "Cannot re-initialize NativeLoader."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x03f0 }
            throw r0     // Catch:{ all -> 0x03f0 }
        L_0x03f0:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03f0 }
            goto L_0x03fc
        L_0x03f3:
            android.os.StrictMode.setThreadPolicy(r14)
            return
        L_0x03f7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03f7 }
            goto L_0x03fc
        L_0x03fa:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x03fd }
        L_0x03fc:
            throw r0     // Catch:{ all -> 0x03fd }
        L_0x03fd:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r14)
            throw r0
        L_0x0402:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.A01(android.content.Context, X.8qe, java.lang.String[], int):void");
    }

    public static void A02(Context context, ArrayList arrayList, int i) {
        A03 = new AnonymousClass6NQ(context, i);
        if (Log.isLoggable("SoLoader", 3)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("adding application source: ");
            AnonymousClass000.A1B(A03, A0o);
            Log.d("SoLoader", A0o.toString());
        }
        arrayList.add(0, A03);
    }

    public static boolean A03() {
        boolean z = true;
        if (A0C != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = A0A;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (A0C == null) {
                z = false;
            }
            return z;
        } finally {
            C18310x6.A1S(reentrantReadWriteLock);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0106, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        X.C18310x6.A1S(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0112, code lost:
        if (r16 == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0114, code lost:
        android.os.StrictMode.setThreadPolicy(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0117, code lost:
        if (r4 == 0) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0119, code lost:
        if (r4 != 3) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x011b, code lost:
        r2 = X.AnonymousClass000.A0m("couldn't find DSO to load: ", r13);
        r18.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0129, code lost:
        if (r5 >= A0C.length) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x012b, code lost:
        r2.append("\n\tSoSource ");
        r2.append(r5);
        r2.append(": ");
        X.AnonymousClass000.A1B(A0C[r5], r2);
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0142, code lost:
        r0 = A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0144, code lost:
        if (r0 == null) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r1 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0152, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0157, code lost:
        throw X.C18330xA.A09(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0158, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0159, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x015b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x015c, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        X.C18310x6.A1S(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0160, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0161, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0165, code lost:
        if (r16 != false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0167, code lost:
        android.os.StrictMode.setThreadPolicy(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x016a, code lost:
        if (r5 != 0) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x016c, code lost:
        if (r5 == 3) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0173, code lost:
        if (android.util.Log.isLoggable("SoLoader", 3) != false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0175, code lost:
        X.AnonymousClass6C7.A1G("Loaded: ", r13, "SoLoader", X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x017e, code lost:
        monitor-enter(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r10.add(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0185, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
        r3 = X.AnonymousClass000.A0m("couldn't find DSO to load: ", r13);
        r2 = r1.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0191, code lost:
        if (r2 == null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0193, code lost:
        r2 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0197, code lost:
        r3.append(" caused by: ");
        r3.append(r2);
        r1.printStackTrace();
        r0 = X.AnonymousClass000.A0Y(" result: ", r3, r5);
        android.util.Log.e("SoLoader", r0);
        r2 = new java.lang.UnsatisfiedLinkError(r0);
        r2.initCause(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Could not load: ");
        r1.append(r13);
        X.AnonymousClass000.A1D(" because no SO source exists", "SoLoader", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x01ce, code lost:
        throw new java.lang.UnsatisfiedLinkError(X.AnonymousClass000.A0T("couldn't find DSO to load: ", r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x01cf, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        X.C18310x6.A1S(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x01d4, code lost:
        X.AnonymousClass000.A10(X.AnonymousClass002.A0B(r1.createPackageContext(r1.getPackageName(), 0).getApplicationInfo().nativeLibraryDir), "\n\tNative lib dir: ", r2);
        r2.append("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x01e8, code lost:
        X.C18310x6.A1S(r18);
        r0 = X.AnonymousClass000.A0Y(" result: ", r2, r4);
        android.util.Log.e("SoLoader", r0);
        r2 = new java.lang.UnsatisfiedLinkError(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x01f9, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x01fa, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        r2 = r3.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0216, code lost:
        throw new X.AnonymousClass8SG(r2.substring(r2.lastIndexOf("unexpected e_machine:")), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0217, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x021d, code lost:
        if ((r24 & 16) == 0) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x022d, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0232, code lost:
        com.facebook.soloader.Api18TraceUtils.A01("MergedSoMapping.invokeJniOnload[", r12, "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x023f, code lost:
        if (android.util.Log.isLoggable("SoLoader", 3) != false) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0241, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("About to merge: ");
        r1.append(r12);
        X.AnonymousClass6C7.A1G(" / ", r13, "SoLoader", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0256, code lost:
        switch(r12.hashCode()) {
            case -2132109298: goto L_0x0267;
            case -2112908723: goto L_0x0275;
            case -2084134425: goto L_0x0283;
            case -1924924588: goto L_0x0291;
            case -1916805629: goto L_0x029f;
            case -1861793634: goto L_0x02ad;
            case -1776425186: goto L_0x02bb;
            case -1721640191: goto L_0x02c9;
            case -1606294708: goto L_0x02d7;
            case -1484045932: goto L_0x02e5;
            case -1389936073: goto L_0x02f3;
            case -1347925350: goto L_0x0301;
            case -1293854543: goto L_0x030f;
            case -1290530873: goto L_0x031d;
            case -1148924054: goto L_0x032b;
            case -1117731165: goto L_0x0339;
            case -1098209777: goto L_0x0347;
            case -1059361352: goto L_0x0355;
            case -1053039321: goto L_0x0363;
            case -902468257: goto L_0x0371;
            case -747990041: goto L_0x037f;
            case -449618447: goto L_0x038d;
            case -439414708: goto L_0x039b;
            case -381653348: goto L_0x03a9;
            case -378888163: goto L_0x03b7;
            case -327000206: goto L_0x03c5;
            case -253106228: goto L_0x03d3;
            case -194623424: goto L_0x03e1;
            case -120202075: goto L_0x03ef;
            case -61423793: goto L_0x03fd;
            case 101517: goto L_0x040b;
            case 64916380: goto L_0x0419;
            case 92309290: goto L_0x0427;
            case 322449263: goto L_0x0435;
            case 395167905: goto L_0x0443;
            case 451661819: goto L_0x0451;
            case 469371245: goto L_0x045f;
            case 627805909: goto L_0x046d;
            case 656562322: goto L_0x047b;
            case 681123117: goto L_0x0489;
            case 777959537: goto L_0x0497;
            case 1047472087: goto L_0x04a5;
            case 1250385981: goto L_0x04b2;
            case 1270408060: goto L_0x04bf;
            case 1540136281: goto L_0x04cc;
            case 1584936478: goto L_0x04d9;
            case 1737184630: goto L_0x04e6;
            case 1780520651: goto L_0x04f3;
            case 1825980878: goto L_0x0500;
            case 1995804693: goto L_0x050d;
            case 2045224032: goto L_0x051a;
            default: goto L_0x0259;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0259, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Unknown library: ");
        r1 = X.AnonymousClass000.A0F(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0266, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x026d, code lost:
        if (r12.equals("spark-qpluserflow-native") != false) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x026f, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libspark_qpluserflow_native_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x027b, code lost:
        if (r12.equals("stash-jni") != false) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x027d, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libstash_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0289, code lost:
        if (r12.equals("ardcache-jni") != false) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x028b, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libardcache_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0297, code lost:
        if (r12.equals("fbsystrace") != false) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0299, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfbsystrace_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x02a5, code lost:
        if (r12.equals("roi-align-ops-xplat") != false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x02a7, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libroi_align_ops_xplat_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        r18 = A0A;
        r18.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x02b3, code lost:
        if (r12.equals("versioned-model-cache-native-android") != false) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x02b5, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libversioned_model_cache_native_android_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x02c1, code lost:
        if (r12.equals("jniperflogger") != false) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x02c3, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libjniperflogger_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x02cf, code lost:
        if (r12.equals("arfx-engine-plugin-avatars") != false) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x02d1, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarfx_engine_plugin_avatars_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x02dd, code lost:
        if (r12.equals("dynamic_pytorch_impl") != false) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x02df, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libdynamic_pytorch_impl_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x02eb, code lost:
        if (r12.equals("ard-android-network-consent-manager-interf") != false) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x02ed, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_network_consent_manager_interf_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x02f9, code lost:
        if (r12.equals("ardcache-stash") != false) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x02fb, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libardcache_stash_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0307, code lost:
        if (r12.equals("flatbuffers") != false) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0309, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libflatbuffers_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0315, code lost:
        if (r12.equals("native_bridge") != false) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0317, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libnative_bridge_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0323, code lost:
        if (r12.equals("opus_mlow") != false) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0325, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libopus_mlow_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0331, code lost:
        if (r12.equals("hybridlogsinkjni") != false) goto L_0x0333;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0333, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libhybridlogsinkjni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        r21 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x033f, code lost:
        if (r12.equals("arfx-engine-plugin-touch_gestures") != false) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0341, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarfx_engine_plugin_touch_gestures_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x034d, code lost:
        if (r12.equals("yogacore") != false) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x034f, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libyogacore_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x035b, code lost:
        if (r12.equals("featureconfig") != false) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x035d, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfeatureconfig_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0369, code lost:
        if (r12.equals("arpersistenceservice") != false) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        if (r19 != false) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x036b, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarpersistenceservice_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0377, code lost:
        if (r12.equals("sigmux") != false) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0379, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libsigmux_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0385, code lost:
        if (r12.equals("arclass") != false) goto L_0x0387;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0387, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarclass_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0393, code lost:
        if (r12.equals("gputimer-jni") != false) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0395, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libgputimer_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x03a1, code lost:
        if (r12.equals("audiograph-native") != false) goto L_0x03a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x03a3, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libaudiograph_native_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x03af, code lost:
        if (r12.equals("fbacore-jni") != false) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x03b1, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfbacore_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x03bd, code lost:
        if (r12.equals("target-recognition-android") != false) goto L_0x03bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x03bf, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libtarget_recognition_android_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        monitor-enter(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x03cb, code lost:
        if (r12.equals("graphicsengine-whatsapp-native") != false) goto L_0x03cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x03cd, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libgraphicsengine_whatsapp_native_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x03d9, code lost:
        if (r12.equals("profiloextapi") != false) goto L_0x03db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x03db, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libprofiloextapi_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x03e7, code lost:
        if (r12.equals("arengineservicesutils") != false) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x03e9, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarengineservicesutils_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x03f5, code lost:
        if (r12.equals("xplat_hermes_lib_Platform_Unicode_UnicodeAndroid") != false) goto L_0x03f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x03f7, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_hermes_lib_Platform_Unicode_UnicodeAndroid_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0403, code lost:
        if (r12.equals("asyncexecutor") != false) goto L_0x0405;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0405, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libasyncexecutor_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0411, code lost:
        if (r12.equals("fmt") != false) goto L_0x0413;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0413, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfmt_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x041f, code lost:
        if (r12.equals("maskrcnn-ops-xplat") != false) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0421, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmaskrcnn_ops_xplat_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x042d, code lost:
        if (r12.equals("ard-android-network-consent-manager-impl") != false) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x042f, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_network_consent_manager_impl_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x043b, code lost:
        if (r12.equals("camera-xplat-spars-jni") != false) goto L_0x043d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x043d, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libcamera_xplat_spars_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0449, code lost:
        if (r12.equals("ard-android-async-asset-fetcher") != false) goto L_0x044b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x044b, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_async_asset_fetcher_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        if (r10.contains(r13) == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0457, code lost:
        if (r12.equals("jniexecutors") != false) goto L_0x0459;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0459, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libjniexecutors_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0465, code lost:
        if (r12.equals("xplat_arfx_services_interfaces_interfacesAndroid") != false) goto L_0x0467;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0467, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_arfx_services_interfaces_interfacesAndroid_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0473, code lost:
        if (r12.equals("avatarsdataprovider") != false) goto L_0x0475;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0475, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libavatarsdataprovider_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0481, code lost:
        if (r12.equals("double-conversion") != false) goto L_0x0483;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0056, code lost:
        if (r23 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0483, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libdouble_conversion_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x048f, code lost:
        if (r12.equals("single-model-cache-native-android") != false) goto L_0x0491;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0491, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libsingle_model_cache_native_android_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x049d, code lost:
        if (r12.equals("unet-106-ops-xplat") != false) goto L_0x049f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x049f, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libunet_106_ops_xplat_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x04ab, code lost:
        if (r12.equals("cryptox") != false) goto L_0x04ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x04ad, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libcryptox_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0058, code lost:
        monitor-exit(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x04b8, code lost:
        if (r12.equals("gltfholdernew") != false) goto L_0x04ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x04ba, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libgltfholdernew_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x04c5, code lost:
        if (r12.equals("xplat_arfx_services_impl_avatars_avatarsAndroid") != false) goto L_0x04c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x04c7, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_arfx_services_impl_avatars_avatarsAndroid_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x04d2, code lost:
        if (r12.equals("xanalyticsadapter-jni") != false) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x04d4, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxanalyticsadapter_jni_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x04df, code lost:
        if (r12.equals("jniuserflow") != false) goto L_0x04e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x04e1, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libjniuserflow_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x04ec, code lost:
        if (r12.equals("batch-box-cox-ops-xplat") != false) goto L_0x04ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x04ee, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libbatch_box_cox_ops_xplat_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x04f9, code lost:
        if (r12.equals("filters-native-android") != false) goto L_0x04fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x04fb, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfilters_native_android_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0506, code lost:
        if (r12.equals("musiceffect-native") != false) goto L_0x0508;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0508, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmusiceffect_native_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0513, code lost:
        if (r12.equals("tar-brotli-archive-native") != false) goto L_0x0515;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0515, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libtar_brotli_archive_native_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0520, code lost:
        if (r12.equals("ard-android-async-asset-fetcher-listener") != false) goto L_0x0522;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0522, code lost:
        r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_async_asset_fetcher_listener_so();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0526, code lost:
        if (r0 != 0) goto L_0x0529;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0529, code lost:
        r1 = new java.lang.UnsatisfiedLinkError("Failed to invoke native library JNI_OnLoad");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0532, code lost:
        A08.add(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0538, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:?, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Failed to call JNI_OnLoad from '");
        r1.append(r12);
        r1.append("', which has been merged into '");
        r1.append(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0557, code lost:
        throw X.AnonymousClass6CA.A0Q(X.AnonymousClass000.A0X("'.  See comment for details.", r1), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0558, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x055c, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x055d, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0560, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0561, code lost:
        X.C18310x6.A1S(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0566, code lost:
        return !r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x056a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x056b, code lost:
        X.C18310x6.A1S(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005e, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x056e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        monitor-exit(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0061, code lost:
        if (r19 != false) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0069, code lost:
        if (android.util.Log.isLoggable("SoLoader", 3) == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x006b, code lost:
        X.AnonymousClass6C7.A1G("About to load: ", r13, "SoLoader", X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0074, code lost:
        r18.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0081, code lost:
        if (A0C == null) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        X.C18310x6.A1S(r18);
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0087, code lost:
        if (r14 != null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008a, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x008d, code lost:
        r14 = android.os.StrictMode.allowThreadDiskReads();
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0093, code lost:
        com.facebook.soloader.Api18TraceUtils.A01("SoLoader.loadLibrary[", r13, "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r18.readLock().lock();
        r4 = 0;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a6, code lost:
        if (r2 >= A0C.length) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00a8, code lost:
        r4 = A0C[r2].A02(r14, r13, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b2, code lost:
        if (r4 != 3) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00b6, code lost:
        if (A05 == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00bc, code lost:
        if (android.util.Log.isLoggable("SoLoader", 3) == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00be, code lost:
        X.AnonymousClass6C7.A1G("Trying backup SoSource for ", r13, "SoLoader", X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c7, code lost:
        r15 = A05;
        r22 = r15.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ce, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d0, code lost:
        if (r4 != 0) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00d5, code lost:
        if (r3 >= r22) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d7, code lost:
        r2 = r15[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d9, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r1 = r2.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00dc, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r0 = r1.get(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00e1, code lost:
        if (r0 != null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00e3, code lost:
        r0 = X.AnonymousClass002.A0D();
        r1.put(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x00ea, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r2.A01 = r13;
        r2.A03(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x00f2, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x00fb, code lost:
        if (r2.A02(r14, r13, r21) != 1) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x00fe, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0101, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0103, code lost:
        r3 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:125:0x0146, B:139:0x0162] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0167 A[Catch:{ NameNotFoundException -> 0x0152, UnsatisfiedLinkError -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x016c A[Catch:{ NameNotFoundException -> 0x0152, UnsatisfiedLinkError -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0193 A[Catch:{ NameNotFoundException -> 0x0152, UnsatisfiedLinkError -> 0x01fa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(android.os.StrictMode.ThreadPolicy r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24) {
        /*
            r12 = r22
            r14 = r20
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r11 = 0
            if (r0 != 0) goto L_0x0014
            java.util.Set r0 = A08
            boolean r0 = r0.contains(r12)
            if (r0 == 0) goto L_0x0014
            return r11
        L_0x0014:
            java.lang.Class<com.facebook.soloader.SoLoader> r20 = com.facebook.soloader.SoLoader.class
            monitor-enter(r20)
            java.util.HashSet r10 = A06     // Catch:{ all -> 0x056f }
            r13 = r21
            boolean r0 = r10.contains(r13)     // Catch:{ all -> 0x056f }
            if (r0 == 0) goto L_0x0028
            if (r23 != 0) goto L_0x0025
            monitor-exit(r20)     // Catch:{ all -> 0x056f }
            return r11
        L_0x0025:
            r19 = 1
            goto L_0x002a
        L_0x0028:
            r19 = 0
        L_0x002a:
            java.util.Map r1 = A07     // Catch:{ all -> 0x056f }
            boolean r0 = r1.containsKey(r13)     // Catch:{ all -> 0x056f }
            if (r0 == 0) goto L_0x0038
            java.lang.Object r9 = r1.get(r13)     // Catch:{ all -> 0x056f }
        L_0x0036:
            monitor-exit(r20)     // Catch:{ all -> 0x056f }
            goto L_0x0040
        L_0x0038:
            java.lang.Object r9 = X.AnonymousClass002.A0D()     // Catch:{ all -> 0x056f }
            r1.put(r13, r9)     // Catch:{ all -> 0x056f }
            goto L_0x0036
        L_0x0040:
            java.util.concurrent.locks.ReentrantReadWriteLock r18 = A0A
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()
            r0.lock()
            monitor-enter(r9)     // Catch:{ all -> 0x056a }
            r8 = 3
            r21 = r24
            if (r19 != 0) goto L_0x021b
            monitor-enter(r20)     // Catch:{ all -> 0x0567 }
            boolean r0 = r10.contains(r13)     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x0060
            if (r23 != 0) goto L_0x005e
            monitor-exit(r20)     // Catch:{ all -> 0x0217 }
            monitor-exit(r9)     // Catch:{ all -> 0x0567 }
            X.C18310x6.A1S(r18)
            return r11
        L_0x005e:
            r19 = 1
        L_0x0060:
            monitor-exit(r20)     // Catch:{ all -> 0x0217 }
            if (r19 != 0) goto L_0x021b
            java.lang.String r7 = "SoLoader"
            boolean r0 = android.util.Log.isLoggable(r7, r8)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            if (r0 == 0) goto L_0x0074
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            java.lang.String r0 = "About to load: "
            X.AnonymousClass6C7.A1G(r0, r13, r7, r1)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
        L_0x0074:
            java.lang.String r17 = " result: "
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            r0.lock()     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            X.7Uk[] r0 = A0C     // Catch:{ all -> 0x01cf }
            java.lang.String r6 = "couldn't find DSO to load: "
            if (r0 == 0) goto L_0x01b4
            X.C18310x6.A1S(r18)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            r5 = 0
            if (r14 != 0) goto L_0x008a
            goto L_0x008d
        L_0x008a:
            r16 = 0
            goto L_0x0093
        L_0x008d:
            android.os.StrictMode$ThreadPolicy r14 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            r16 = 1
        L_0x0093:
            java.lang.String r1 = "SoLoader.loadLibrary["
            java.lang.String r0 = "]"
            com.facebook.soloader.Api18TraceUtils.A01(r1, r13, r0)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()     // Catch:{ all -> 0x0161 }
            r0.lock()     // Catch:{ all -> 0x0161 }
            r4 = 0
            r2 = 0
        L_0x00a3:
            X.7Uk[] r0 = A0C     // Catch:{ all -> 0x015b }
            int r0 = r0.length     // Catch:{ all -> 0x015b }
            if (r2 >= r0) goto L_0x010c
            X.7Uk[] r0 = A0C     // Catch:{ all -> 0x015b }
            r1 = r0[r2]     // Catch:{ all -> 0x015b }
            r0 = r21
            int r4 = r1.A02(r14, r13, r0)     // Catch:{ all -> 0x015b }
            if (r4 != r8) goto L_0x00ce
            X.6NP[] r0 = A05     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x010c
            boolean r0 = android.util.Log.isLoggable(r7, r8)     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x00c7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x015b }
            java.lang.String r0 = "Trying backup SoSource for "
            X.AnonymousClass6C7.A1G(r0, r13, r7, r1)     // Catch:{ all -> 0x015b }
        L_0x00c7:
            X.6NP[] r15 = A05     // Catch:{ all -> 0x015b }
            int r0 = r15.length     // Catch:{ all -> 0x015b }
            r22 = r0
            r3 = 0
            goto L_0x00d3
        L_0x00ce:
            int r2 = r2 + 1
            if (r4 != 0) goto L_0x010c
            goto L_0x00a3
        L_0x00d3:
            r0 = r22
            if (r3 >= r0) goto L_0x010c
            r2 = r15[r3]     // Catch:{ all -> 0x015b }
            monitor-enter(r2)     // Catch:{ all -> 0x015b }
            java.util.Map r1 = r2.A04     // Catch:{ all -> 0x0109 }
            monitor-enter(r1)     // Catch:{ all -> 0x0109 }
            java.lang.Object r0 = r1.get(r13)     // Catch:{ all -> 0x0106 }
            if (r0 != 0) goto L_0x00ea
            java.lang.Object r0 = X.AnonymousClass002.A0D()     // Catch:{ all -> 0x0106 }
            r1.put(r13, r0)     // Catch:{ all -> 0x0106 }
        L_0x00ea:
            monitor-exit(r1)     // Catch:{ all -> 0x0106 }
            monitor-enter(r0)     // Catch:{ all -> 0x0109 }
            r2.A01 = r13     // Catch:{ all -> 0x0103 }
            r1 = 2
            r2.A03(r1)     // Catch:{ all -> 0x0103 }
            monitor-exit(r0)     // Catch:{ all -> 0x0103 }
            monitor-exit(r2)     // Catch:{ all -> 0x015b }
            r0 = r21
            int r1 = r2.A02(r14, r13, r0)     // Catch:{ all -> 0x015b }
            r0 = 1
            if (r1 != r0) goto L_0x00fe
            goto L_0x0101
        L_0x00fe:
            int r3 = r3 + 1
            goto L_0x00d3
        L_0x0101:
            r4 = 1
            goto L_0x010c
        L_0x0103:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0103 }
            goto L_0x0108
        L_0x0106:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0106 }
        L_0x0108:
            throw r3     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x015b }
            throw r0     // Catch:{ all -> 0x015b }
        L_0x010c:
            X.C18310x6.A1S(r18)     // Catch:{ all -> 0x0158 }
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            if (r16 == 0) goto L_0x0117
            android.os.StrictMode.setThreadPolicy(r14)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
        L_0x0117:
            if (r4 == 0) goto L_0x011b
            if (r4 != r8) goto L_0x016f
        L_0x011b:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0m(r6, r13)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            r0.lock()     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
        L_0x0126:
            X.7Uk[] r0 = A0C     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            int r0 = r0.length     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            if (r5 >= r0) goto L_0x0142
            java.lang.String r0 = "\n\tSoSource "
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            r2.append(r5)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            java.lang.String r0 = ": "
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            X.7Uk[] r0 = A0C     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            r0 = r0[r5]     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            X.AnonymousClass000.A1B(r0, r2)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            int r5 = r5 + 1
            goto L_0x0126
        L_0x0142:
            X.6NQ r0 = A03     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            if (r0 == 0) goto L_0x01e8
            android.content.Context r1 = r0.A01     // Catch:{ NameNotFoundException -> 0x0152 }
            java.lang.String r0 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x0152 }
            android.content.Context r0 = r1.createPackageContext(r0, r11)     // Catch:{ NameNotFoundException -> 0x0152 }
            goto L_0x01d4
        L_0x0152:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            throw r0     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
        L_0x0158:
            r1 = move-exception
            r5 = r4
            goto L_0x0162
        L_0x015b:
            r0 = move-exception
            r5 = r4
            X.C18310x6.A1S(r18)     // Catch:{ all -> 0x0161 }
            throw r0     // Catch:{ all -> 0x0161 }
        L_0x0161:
            r1 = move-exception
        L_0x0162:
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            if (r16 == 0) goto L_0x016a
            android.os.StrictMode.setThreadPolicy(r14)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
        L_0x016a:
            if (r5 == 0) goto L_0x0189
            if (r5 != r8) goto L_0x016f
            goto L_0x0189
        L_0x016f:
            boolean r0 = android.util.Log.isLoggable(r7, r8)     // Catch:{ all -> 0x0567 }
            if (r0 == 0) goto L_0x017e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = "Loaded: "
            X.AnonymousClass6C7.A1G(r0, r13, r7, r1)     // Catch:{ all -> 0x0567 }
        L_0x017e:
            monitor-enter(r20)     // Catch:{ all -> 0x0567 }
            r10.add(r13)     // Catch:{ all -> 0x0185 }
            monitor-exit(r20)     // Catch:{ all -> 0x0185 }
            goto L_0x021b
        L_0x0185:
            r3 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x0185 }
            goto L_0x055c
        L_0x0189:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0m(r6, r13)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            java.lang.String r2 = r1.getMessage()     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            if (r2 != 0) goto L_0x0197
            java.lang.String r2 = r1.toString()     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
        L_0x0197:
            java.lang.String r0 = " caused by: "
            r3.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            r3.append(r2)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            r1.printStackTrace()     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            r0 = r17
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r3, r5)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            android.util.Log.e(r7, r0)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            java.lang.UnsatisfiedLinkError r2 = new java.lang.UnsatisfiedLinkError     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            r2.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            r2.initCause(r1)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            goto L_0x01f9
        L_0x01b4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01cf }
            java.lang.String r0 = "Could not load: "
            r1.append(r0)     // Catch:{ all -> 0x01cf }
            r1.append(r13)     // Catch:{ all -> 0x01cf }
            java.lang.String r0 = " because no SO source exists"
            X.AnonymousClass000.A1D(r0, r7, r1)     // Catch:{ all -> 0x01cf }
            java.lang.String r1 = X.AnonymousClass000.A0T(r6, r13)     // Catch:{ all -> 0x01cf }
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x01cf }
            r0.<init>(r1)     // Catch:{ all -> 0x01cf }
            throw r0     // Catch:{ all -> 0x01cf }
        L_0x01cf:
            r2 = move-exception
            X.C18310x6.A1S(r18)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            goto L_0x01f9
        L_0x01d4:
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            java.lang.String r0 = r0.nativeLibraryDir     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            java.io.File r1 = X.AnonymousClass002.A0B(r0)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            java.lang.String r0 = "\n\tNative lib dir: "
            X.AnonymousClass000.A10(r1, r0, r2)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            java.lang.String r0 = "\n"
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
        L_0x01e8:
            X.C18310x6.A1S(r18)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            r0 = r17
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r2, r4)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            android.util.Log.e(r7, r0)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            java.lang.UnsatisfiedLinkError r2 = new java.lang.UnsatisfiedLinkError     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
            r2.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
        L_0x01f9:
            throw r2     // Catch:{ UnsatisfiedLinkError -> 0x01fa }
        L_0x01fa:
            r3 = move-exception
            java.lang.String r2 = r3.getMessage()     // Catch:{ all -> 0x0567 }
            if (r2 == 0) goto L_0x055c
            java.lang.String r1 = "unexpected e_machine:"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x0567 }
            if (r0 == 0) goto L_0x055c
            int r0 = r2.lastIndexOf(r1)     // Catch:{ all -> 0x0567 }
            java.lang.String r1 = r2.substring(r0)     // Catch:{ all -> 0x0567 }
            X.8SG r0 = new X.8SG     // Catch:{ all -> 0x0567 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0567 }
            throw r0     // Catch:{ all -> 0x0567 }
        L_0x0217:
            r3 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x0217 }
            goto L_0x055c
        L_0x021b:
            r0 = r24 & 16
            if (r0 != 0) goto L_0x0560
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0567 }
            if (r0 != 0) goto L_0x022e
            java.util.Set r0 = A08     // Catch:{ all -> 0x0567 }
            boolean r0 = r0.contains(r12)     // Catch:{ all -> 0x0567 }
            if (r0 == 0) goto L_0x022e
            r11 = 1
        L_0x022e:
            if (r23 == 0) goto L_0x0560
            if (r11 != 0) goto L_0x0560
            java.lang.String r1 = "MergedSoMapping.invokeJniOnload["
            java.lang.String r0 = "]"
            com.facebook.soloader.Api18TraceUtils.A01(r1, r12, r0)     // Catch:{ all -> 0x0567 }
            java.lang.String r2 = "SoLoader"
            boolean r0 = android.util.Log.isLoggable(r2, r8)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0252
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            java.lang.String r0 = "About to merge: "
            r1.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            r1.append(r12)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            java.lang.String r0 = " / "
            X.AnonymousClass6C7.A1G(r0, r13, r2, r1)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
        L_0x0252:
            int r0 = r12.hashCode()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            switch(r0) {
                case -2132109298: goto L_0x0267;
                case -2112908723: goto L_0x0275;
                case -2084134425: goto L_0x0283;
                case -1924924588: goto L_0x0291;
                case -1916805629: goto L_0x029f;
                case -1861793634: goto L_0x02ad;
                case -1776425186: goto L_0x02bb;
                case -1721640191: goto L_0x02c9;
                case -1606294708: goto L_0x02d7;
                case -1484045932: goto L_0x02e5;
                case -1389936073: goto L_0x02f3;
                case -1347925350: goto L_0x0301;
                case -1293854543: goto L_0x030f;
                case -1290530873: goto L_0x031d;
                case -1148924054: goto L_0x032b;
                case -1117731165: goto L_0x0339;
                case -1098209777: goto L_0x0347;
                case -1059361352: goto L_0x0355;
                case -1053039321: goto L_0x0363;
                case -902468257: goto L_0x0371;
                case -747990041: goto L_0x037f;
                case -449618447: goto L_0x038d;
                case -439414708: goto L_0x039b;
                case -381653348: goto L_0x03a9;
                case -378888163: goto L_0x03b7;
                case -327000206: goto L_0x03c5;
                case -253106228: goto L_0x03d3;
                case -194623424: goto L_0x03e1;
                case -120202075: goto L_0x03ef;
                case -61423793: goto L_0x03fd;
                case 101517: goto L_0x040b;
                case 64916380: goto L_0x0419;
                case 92309290: goto L_0x0427;
                case 322449263: goto L_0x0435;
                case 395167905: goto L_0x0443;
                case 451661819: goto L_0x0451;
                case 469371245: goto L_0x045f;
                case 627805909: goto L_0x046d;
                case 656562322: goto L_0x047b;
                case 681123117: goto L_0x0489;
                case 777959537: goto L_0x0497;
                case 1047472087: goto L_0x04a5;
                case 1250385981: goto L_0x04b2;
                case 1270408060: goto L_0x04bf;
                case 1540136281: goto L_0x04cc;
                case 1584936478: goto L_0x04d9;
                case 1737184630: goto L_0x04e6;
                case 1780520651: goto L_0x04f3;
                case 1825980878: goto L_0x0500;
                case 1995804693: goto L_0x050d;
                case 2045224032: goto L_0x051a;
                default: goto L_0x0259;
            }     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
        L_0x0259:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            java.lang.String r0 = "Unknown library: "
            r1.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0F(r12, r1)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
        L_0x0266:
            throw r1     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
        L_0x0267:
            java.lang.String r0 = "spark-qpluserflow-native"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libspark_qpluserflow_native_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x0275:
            java.lang.String r0 = "stash-jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libstash_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x0283:
            java.lang.String r0 = "ardcache-jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libardcache_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x0291:
            java.lang.String r0 = "fbsystrace"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfbsystrace_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x029f:
            java.lang.String r0 = "roi-align-ops-xplat"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libroi_align_ops_xplat_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x02ad:
            java.lang.String r0 = "versioned-model-cache-native-android"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libversioned_model_cache_native_android_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x02bb:
            java.lang.String r0 = "jniperflogger"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libjniperflogger_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x02c9:
            java.lang.String r0 = "arfx-engine-plugin-avatars"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarfx_engine_plugin_avatars_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x02d7:
            java.lang.String r0 = "dynamic_pytorch_impl"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libdynamic_pytorch_impl_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x02e5:
            java.lang.String r0 = "ard-android-network-consent-manager-interf"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_network_consent_manager_interf_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x02f3:
            java.lang.String r0 = "ardcache-stash"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libardcache_stash_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x0301:
            java.lang.String r0 = "flatbuffers"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libflatbuffers_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x030f:
            java.lang.String r0 = "native_bridge"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libnative_bridge_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x031d:
            java.lang.String r0 = "opus_mlow"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libopus_mlow_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x032b:
            java.lang.String r0 = "hybridlogsinkjni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libhybridlogsinkjni_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x0339:
            java.lang.String r0 = "arfx-engine-plugin-touch_gestures"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarfx_engine_plugin_touch_gestures_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x0347:
            java.lang.String r0 = "yogacore"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libyogacore_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x0355:
            java.lang.String r0 = "featureconfig"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfeatureconfig_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x0363:
            java.lang.String r0 = "arpersistenceservice"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarpersistenceservice_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x0371:
            java.lang.String r0 = "sigmux"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libsigmux_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x037f:
            java.lang.String r0 = "arclass"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarclass_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x038d:
            java.lang.String r0 = "gputimer-jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libgputimer_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x039b:
            java.lang.String r0 = "audiograph-native"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libaudiograph_native_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x03a9:
            java.lang.String r0 = "fbacore-jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfbacore_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x03b7:
            java.lang.String r0 = "target-recognition-android"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libtarget_recognition_android_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x03c5:
            java.lang.String r0 = "graphicsengine-whatsapp-native"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libgraphicsengine_whatsapp_native_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x03d3:
            java.lang.String r0 = "profiloextapi"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libprofiloextapi_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x03e1:
            java.lang.String r0 = "arengineservicesutils"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libarengineservicesutils_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x03ef:
            java.lang.String r0 = "xplat_hermes_lib_Platform_Unicode_UnicodeAndroid"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_hermes_lib_Platform_Unicode_UnicodeAndroid_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x03fd:
            java.lang.String r0 = "asyncexecutor"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libasyncexecutor_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x040b:
            java.lang.String r0 = "fmt"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfmt_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x0419:
            java.lang.String r0 = "maskrcnn-ops-xplat"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmaskrcnn_ops_xplat_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x0427:
            java.lang.String r0 = "ard-android-network-consent-manager-impl"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_network_consent_manager_impl_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x0435:
            java.lang.String r0 = "camera-xplat-spars-jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libcamera_xplat_spars_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x0443:
            java.lang.String r0 = "ard-android-async-asset-fetcher"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_async_asset_fetcher_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x0451:
            java.lang.String r0 = "jniexecutors"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libjniexecutors_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x045f:
            java.lang.String r0 = "xplat_arfx_services_interfaces_interfacesAndroid"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_arfx_services_interfaces_interfacesAndroid_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x046d:
            java.lang.String r0 = "avatarsdataprovider"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libavatarsdataprovider_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x047b:
            java.lang.String r0 = "double-conversion"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libdouble_conversion_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x0489:
            java.lang.String r0 = "single-model-cache-native-android"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libsingle_model_cache_native_android_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x0497:
            java.lang.String r0 = "unet-106-ops-xplat"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libunet_106_ops_xplat_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x04a5:
            java.lang.String r0 = "cryptox"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libcryptox_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x04b2:
            java.lang.String r0 = "gltfholdernew"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libgltfholdernew_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x04bf:
            java.lang.String r0 = "xplat_arfx_services_impl_avatars_avatarsAndroid"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxplat_arfx_services_impl_avatars_avatarsAndroid_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x04cc:
            java.lang.String r0 = "xanalyticsadapter-jni"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libxanalyticsadapter_jni_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x04d9:
            java.lang.String r0 = "jniuserflow"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libjniuserflow_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x04e6:
            java.lang.String r0 = "batch-box-cox-ops-xplat"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libbatch_box_cox_ops_xplat_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x04f3:
            java.lang.String r0 = "filters-native-android"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libfilters_native_android_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x0500:
            java.lang.String r0 = "musiceffect-native"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libmusiceffect_native_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x050d:
            java.lang.String r0 = "tar-brotli-archive-native"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libtar_brotli_archive_native_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0526
        L_0x051a:
            java.lang.String r0 = "ard-android-async-asset-fetcher-listener"
            boolean r0 = r12.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            if (r0 == 0) goto L_0x0259
            int r0 = com.facebook.soloader.MergedSoMapping$Invoke_JNI_OnLoad.libard_android_async_asset_fetcher_listener_so()     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
        L_0x0526:
            if (r0 != 0) goto L_0x0529
            goto L_0x0532
        L_0x0529:
            java.lang.String r0 = "Failed to invoke native library JNI_OnLoad"
            java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            r1.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x0266
        L_0x0532:
            java.util.Set r0 = A08     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            r0.add(r12)     // Catch:{ UnsatisfiedLinkError -> 0x0538 }
            goto L_0x055d
        L_0x0538:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0558 }
            java.lang.String r0 = "Failed to call JNI_OnLoad from '"
            r1.append(r0)     // Catch:{ all -> 0x0558 }
            r1.append(r12)     // Catch:{ all -> 0x0558 }
            java.lang.String r0 = "', which has been merged into '"
            r1.append(r0)     // Catch:{ all -> 0x0558 }
            r1.append(r13)     // Catch:{ all -> 0x0558 }
            java.lang.String r0 = "'.  See comment for details."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0558 }
            java.lang.RuntimeException r0 = X.AnonymousClass6CA.A0Q(r0, r2)     // Catch:{ all -> 0x0558 }
            throw r0     // Catch:{ all -> 0x0558 }
        L_0x0558:
            r3 = move-exception
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x0567 }
        L_0x055c:
            throw r3     // Catch:{ all -> 0x0567 }
        L_0x055d:
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x0567 }
        L_0x0560:
            monitor-exit(r9)     // Catch:{ all -> 0x0567 }
            X.C18310x6.A1S(r18)
            r0 = r19 ^ 1
            return r0
        L_0x0567:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0567 }
            throw r0     // Catch:{ all -> 0x056a }
        L_0x056a:
            r0 = move-exception
            X.C18310x6.A1S(r18)
            throw r0
        L_0x056f:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x056f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.A05(android.os.StrictMode$ThreadPolicy, java.lang.String, java.lang.String, java.lang.String, int):boolean");
    }

    public static boolean A06(String str) {
        if (A00) {
            return A07(str, 0);
        }
        return C159587m8.A01(str);
    }

    public static boolean A07(String str, int i) {
        boolean z;
        Boolean valueOf;
        if (A0C == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = A0A;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (A0C == null) {
                    if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        synchronized (SoLoader.class) {
                            try {
                                z = !A06.contains(str);
                                if (z) {
                                    System.loadLibrary(str);
                                }
                                valueOf = Boolean.valueOf(z);
                            } catch (Throwable th) {
                                while (true) {
                                    th = th;
                                    break;
                                }
                            }
                        }
                        C18310x6.A1S(reentrantReadWriteLock);
                        if (valueOf != null) {
                            return z;
                        }
                    } else if (!A03()) {
                        th = AnonymousClass001.A0e("SoLoader.init() not yet called");
                    }
                    throw th;
                }
            } finally {
                C18310x6.A1S(reentrantReadWriteLock);
            }
        }
        if (!A00) {
            return C159587m8.A01(str);
        }
        String A002 = C1443571f.A00(str);
        String str2 = str;
        if (A002 != null) {
            str2 = A002;
        }
        return A04((StrictMode.ThreadPolicy) null, System.mapLibraryName(str2), str, A002, i);
    }
}
