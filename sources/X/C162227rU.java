package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.7rU  reason: invalid class name and case insensitive filesystem */
public final class C162227rU {
    public static int A01 = -1;
    public static AnonymousClass6WF A02;
    public static AnonymousClass6WG A03;
    public static Boolean A04;
    public static Boolean A05;
    public static String A06;
    public static boolean A07;
    public static final C183928qt A08 = new C1696189z();
    public static final C180928lr A09 = new AnonymousClass8A2();
    public static final C180928lr A0A = new AnonymousClass8A1();
    public static final ThreadLocal A0B = new ThreadLocal();
    public static final ThreadLocal A0C = new C173858Ry();
    public final Context A00;

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00be A[Catch:{ all -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bf A[Catch:{ all -> 0x00c7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(android.content.Context r9, java.lang.String r10, boolean r11, boolean r12) {
        /*
            r8 = 0
            java.lang.ThreadLocal r0 = A0C     // Catch:{ Exception -> 0x00b8, all -> 0x00ce }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00b8, all -> 0x00ce }
            long r4 = X.C18320x8.A05(r0)     // Catch:{ Exception -> 0x00b8, all -> 0x00ce }
            android.content.ContentResolver r6 = r9.getContentResolver()     // Catch:{ Exception -> 0x00b8, all -> 0x00ce }
            java.lang.String r3 = "api_force_staging"
            java.lang.String r0 = "api"
            r1 = 1
            if (r1 == r11) goto L_0x0017
            r3 = r0
        L_0x0017:
            android.net.Uri$Builder r2 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00b8, all -> 0x00ce }
            r2.<init>()     // Catch:{ Exception -> 0x00b8, all -> 0x00ce }
            java.lang.String r0 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r0)     // Catch:{ Exception -> 0x00b8, all -> 0x00ce }
            java.lang.String r0 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r0 = r2.authority(r0)     // Catch:{ Exception -> 0x00b8, all -> 0x00ce }
            android.net.Uri$Builder r0 = r0.path(r3)     // Catch:{ Exception -> 0x00b8, all -> 0x00ce }
            android.net.Uri$Builder r3 = r0.appendPath(r10)     // Catch:{ Exception -> 0x00b8, all -> 0x00ce }
            java.lang.String r2 = "requestStartTime"
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x00b8, all -> 0x00ce }
            android.net.Uri$Builder r0 = r3.appendQueryParameter(r2, r0)     // Catch:{ Exception -> 0x00b8, all -> 0x00ce }
            android.net.Uri r7 = r0.build()     // Catch:{ Exception -> 0x00b8, all -> 0x00ce }
            r10 = r8
            r11 = r8
            r9 = r8
            android.database.Cursor r3 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00b8, all -> 0x00ce }
            if (r3 == 0) goto L_0x009f
            boolean r0 = r3.moveToFirst()     // Catch:{ Exception -> 0x00b6 }
            if (r0 == 0) goto L_0x009f
            r4 = 0
            int r5 = r3.getInt(r4)     // Catch:{ Exception -> 0x00b6 }
            if (r5 <= 0) goto L_0x0094
            java.lang.Class<X.7rU> r2 = X.C162227rU.class
            monitor-enter(r2)     // Catch:{ Exception -> 0x00b6 }
            r0 = 2
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0090 }
            A06 = r0     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = "loaderVersion"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0090 }
            if (r0 < 0) goto L_0x006c
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0090 }
            A01 = r0     // Catch:{ all -> 0x0090 }
        L_0x006c:
            java.lang.String r0 = "disableStandaloneDynamiteLoader2"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0090 }
            if (r0 < 0) goto L_0x007e
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x007b
            r1 = 0
        L_0x007b:
            A07 = r1     // Catch:{ all -> 0x0090 }
            r4 = r1
        L_0x007e:
            monitor-exit(r2)     // Catch:{ all -> 0x0090 }
            java.lang.ThreadLocal r0 = A0B     // Catch:{ Exception -> 0x00b6 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x00b6 }
            X.7fR r1 = (X.C155747fR) r1     // Catch:{ Exception -> 0x00b6 }
            if (r1 == 0) goto L_0x0094
            android.database.Cursor r0 = r1.A00     // Catch:{ Exception -> 0x00b6 }
            if (r0 != 0) goto L_0x0094
            r1.A00 = r3     // Catch:{ Exception -> 0x00b6 }
            goto L_0x0093
        L_0x0090:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0090 }
            goto L_0x00b5
        L_0x0093:
            r3 = r8
        L_0x0094:
            if (r12 == 0) goto L_0x0099
            if (r4 == 0) goto L_0x0099
            goto L_0x00ae
        L_0x0099:
            if (r3 == 0) goto L_0x009e
            r3.close()
        L_0x009e:
            return r5
        L_0x009f:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r1, r0)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r0 = "Failed to connect to dynamite module ContentResolver."
            X.6zH r1 = new X.6zH     // Catch:{ Exception -> 0x00b6 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00b5
        L_0x00ae:
            java.lang.String r0 = "forcing fallback to container DynamiteLoader impl"
            X.6zH r1 = new X.6zH     // Catch:{ Exception -> 0x00b6 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00b6 }
        L_0x00b5:
            throw r1     // Catch:{ Exception -> 0x00b6 }
        L_0x00b6:
            r2 = move-exception
            goto L_0x00ba
        L_0x00b8:
            r2 = move-exception
            r3 = r8
        L_0x00ba:
            boolean r0 = r2 instanceof X.C143666zH     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00bf
            throw r2     // Catch:{ all -> 0x00c7 }
        L_0x00bf:
            java.lang.String r1 = "V2 version check failed"
            X.6zH r0 = new X.6zH     // Catch:{ all -> 0x00c7 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00c7 }
            throw r0     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r0 = move-exception
            if (r3 == 0) goto L_0x00cf
            r3.close()
            throw r0
        L_0x00ce:
            r0 = move-exception
        L_0x00cf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162227rU.A02(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static void A07(ClassLoader classLoader) {
        AnonymousClass6WG r2 = null;
        try {
            IBinder iBinder = (IBinder) AnonymousClass6C8.A0d(classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2"));
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof AnonymousClass6WG) {
                    r2 = (AnonymousClass6WG) queryLocalInterface;
                } else {
                    r2 = new AnonymousClass6WG(iBinder);
                }
            }
            A03 = r2;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C143666zH("Failed to instantiate dynamite loader", e);
        }
    }

    public static int A00(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("com.google.android.gms.dynamite.descriptors.");
            A0o.append(str);
            Class<?> loadClass = classLoader.loadClass(AnonymousClass000.A0X(".ModuleDescriptor", A0o));
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (AnonymousClass72K.A00(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Module descriptor id '");
            A0o2.append(valueOf);
            A0o2.append("' didn't match expected id '");
            A0o2.append(str);
            AnonymousClass000.A1D("'", "DynamiteModule", A0o2);
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("Local module descriptor class for ");
            A0o3.append(str);
            AnonymousClass000.A1F(" not found.", "DynamiteModule", A0o3);
            return 0;
        } catch (Exception e) {
            AnonymousClass6C9.A14("Failed to load module descriptor class: ", AnonymousClass6CA.A0V(e), "DynamiteModule");
            return 0;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static int A01(android.content.Context r20, java.lang.String r21, boolean r22) {
        /*
            r4 = r20
            java.lang.Class<X.7rU> r20 = X.C162227rU.class
            monitor-enter(r20)     // Catch:{ all -> 0x02ae }
            java.lang.Boolean r0 = A04     // Catch:{ all -> 0x02a7 }
            r3 = 0
            r5 = 0
            r8 = r21
            r7 = r22
            if (r0 != 0) goto L_0x0197
            android.content.Context r0 = r4.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x017d, IllegalAccessException -> 0x017b, NoSuchFieldException -> 0x0179 }
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x017d, IllegalAccessException -> 0x017b, NoSuchFieldException -> 0x0179 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r0 = com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader.class
            java.lang.String r0 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x017d, IllegalAccessException -> 0x017b, NoSuchFieldException -> 0x0179 }
            java.lang.Class r1 = r1.loadClass(r0)     // Catch:{ ClassNotFoundException -> 0x017d, IllegalAccessException -> 0x017b, NoSuchFieldException -> 0x0179 }
            java.lang.String r0 = "sClassLoader"
            java.lang.reflect.Field r6 = r1.getDeclaredField(r0)     // Catch:{ ClassNotFoundException -> 0x017d, IllegalAccessException -> 0x017b, NoSuchFieldException -> 0x0179 }
            java.lang.Class r19 = r6.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x017d, IllegalAccessException -> 0x017b, NoSuchFieldException -> 0x0179 }
            monitor-enter(r19)     // Catch:{ ClassNotFoundException -> 0x017d, IllegalAccessException -> 0x017b, NoSuchFieldException -> 0x0179 }
            java.lang.Object r1 = r6.get(r3)     // Catch:{ all -> 0x0176 }
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch:{ all -> 0x0176 }
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0176 }
            if (r1 != r0) goto L_0x003d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0176 }
        L_0x003a:
            monitor-exit(r19)     // Catch:{ all -> 0x0176 }
            goto L_0x0195
        L_0x003d:
            if (r1 == 0) goto L_0x0045
            A07(r1)     // Catch:{ 6zH -> 0x0042 }
        L_0x0042:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0176 }
            goto L_0x003a
        L_0x0045:
            boolean r0 = A08(r4)     // Catch:{ all -> 0x0176 }
            if (r0 != 0) goto L_0x004e
            monitor-exit(r19)     // Catch:{ all -> 0x0176 }
            goto L_0x016f
        L_0x004e:
            boolean r0 = A07     // Catch:{ all -> 0x0176 }
            if (r0 != 0) goto L_0x0164
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0176 }
            boolean r0 = r9.equals(r3)     // Catch:{ all -> 0x0176 }
            if (r0 != 0) goto L_0x0164
            r0 = 1
            int r18 = A02(r4, r8, r7, r0)     // Catch:{ 6zH -> 0x0159 }
            java.lang.String r0 = A06     // Catch:{ 6zH -> 0x0159 }
            if (r0 == 0) goto L_0x0173
            boolean r0 = r0.isEmpty()     // Catch:{ 6zH -> 0x0159 }
            if (r0 != 0) goto L_0x0173
            java.lang.Class<X.70m> r17 = X.C1442170m.class
            monitor-enter(r17)     // Catch:{ 6zH -> 0x0159 }
            java.lang.ClassLoader r0 = X.C1442170m.A00     // Catch:{ all -> 0x0156 }
            if (r0 != 0) goto L_0x0125
            java.lang.Thread r0 = X.C1442170m.A01     // Catch:{ all -> 0x0121 }
            r16 = 0
            if (r0 != 0) goto L_0x00fc
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00f4 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x00f4 }
            java.lang.ThreadGroup r11 = r0.getThreadGroup()     // Catch:{ all -> 0x00f4 }
            if (r11 != 0) goto L_0x0086
            r10 = r3
            goto L_0x00f6
        L_0x0086:
            java.lang.Class<java.lang.Void> r15 = java.lang.Void.class
            monitor-enter(r15)     // Catch:{ all -> 0x00f4 }
            int r14 = r11.activeGroupCount()     // Catch:{ SecurityException -> 0x00d8 }
            java.lang.ThreadGroup[] r10 = new java.lang.ThreadGroup[r14]     // Catch:{ SecurityException -> 0x00d8 }
            r11.enumerate(r10)     // Catch:{ SecurityException -> 0x00d8 }
            r13 = 0
            r2 = 0
        L_0x0094:
            if (r2 >= r14) goto L_0x00a7
            r12 = r10[r2]     // Catch:{ SecurityException -> 0x00d8 }
            java.lang.String r1 = "dynamiteLoader"
            java.lang.String r0 = r12.getName()     // Catch:{ SecurityException -> 0x00d8 }
            boolean r0 = r1.equals(r0)     // Catch:{ SecurityException -> 0x00d8 }
            if (r0 != 0) goto L_0x00ae
            int r2 = r2 + 1
            goto L_0x0094
        L_0x00a7:
            java.lang.String r0 = "dynamiteLoader"
            java.lang.ThreadGroup r12 = new java.lang.ThreadGroup     // Catch:{ SecurityException -> 0x00d8 }
            r12.<init>(r11, r0)     // Catch:{ SecurityException -> 0x00d8 }
        L_0x00ae:
            int r11 = r12.activeCount()     // Catch:{ SecurityException -> 0x00d8 }
            java.lang.Thread[] r2 = new java.lang.Thread[r11]     // Catch:{ SecurityException -> 0x00d8 }
            r12.enumerate(r2)     // Catch:{ SecurityException -> 0x00d8 }
        L_0x00b7:
            if (r13 >= r11) goto L_0x00ca
            r10 = r2[r13]     // Catch:{ SecurityException -> 0x00d8 }
            java.lang.String r1 = "GmsDynamite"
            java.lang.String r0 = r10.getName()     // Catch:{ SecurityException -> 0x00d8 }
            boolean r0 = r1.equals(r0)     // Catch:{ SecurityException -> 0x00d8 }
            if (r0 != 0) goto L_0x00ef
            int r13 = r13 + 1
            goto L_0x00b7
        L_0x00ca:
            X.8Rh r10 = new X.8Rh     // Catch:{ SecurityException -> 0x00d8 }
            r10.<init>(r12)     // Catch:{ SecurityException -> 0x00d8 }
            r10.setContextClassLoader(r3)     // Catch:{ SecurityException -> 0x00d6 }
            r10.start()     // Catch:{ SecurityException -> 0x00d6 }
            goto L_0x00ef
        L_0x00d6:
            r0 = move-exception
            goto L_0x00da
        L_0x00d8:
            r0 = move-exception
            r10 = r3
        L_0x00da:
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "Failed to enumerate thread/threadgroup "
            r1.append(r0)     // Catch:{ all -> 0x00f1 }
            r1.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "DynamiteLoaderV2CL"
            X.AnonymousClass6C7.A1A(r1, r0)     // Catch:{ all -> 0x00f1 }
        L_0x00ef:
            monitor-exit(r15)     // Catch:{ all -> 0x00f1 }
            goto L_0x00f6
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            r0 = move-exception
            goto L_0x0120
        L_0x00f6:
            X.C1442170m.A01 = r10     // Catch:{ all -> 0x0121 }
            java.lang.Thread r0 = X.C1442170m.A01     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x0123
        L_0x00fc:
            java.lang.Thread r10 = X.C1442170m.A01     // Catch:{ all -> 0x0121 }
            monitor-enter(r10)     // Catch:{ all -> 0x0121 }
            java.lang.Thread r0 = X.C1442170m.A01     // Catch:{ SecurityException -> 0x0106 }
            java.lang.ClassLoader r16 = r0.getContextClassLoader()     // Catch:{ SecurityException -> 0x0106 }
            goto L_0x011c
        L_0x0106:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x011e }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x011e }
            java.lang.String r0 = "Failed to get thread context classloader "
            r1.append(r0)     // Catch:{ all -> 0x011e }
            r1.append(r2)     // Catch:{ all -> 0x011e }
            java.lang.String r0 = "DynamiteLoaderV2CL"
            X.AnonymousClass6C7.A1A(r1, r0)     // Catch:{ all -> 0x011e }
        L_0x011c:
            monitor-exit(r10)     // Catch:{ all -> 0x011e }
            goto L_0x0123
        L_0x011e:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x011e }
        L_0x0120:
            throw r0     // Catch:{ all -> 0x0121 }
        L_0x0121:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0156 }
        L_0x0123:
            X.C1442170m.A00 = r16     // Catch:{ all -> 0x0156 }
        L_0x0125:
            java.lang.ClassLoader r2 = X.C1442170m.A00     // Catch:{ all -> 0x0156 }
            monitor-exit(r17)     // Catch:{ 6zH -> 0x0159 }
            if (r2 != 0) goto L_0x013e
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ 6zH -> 0x0159 }
            r0 = 29
            if (r1 < r0) goto L_0x0147
            java.lang.String r1 = A06     // Catch:{ 6zH -> 0x0159 }
            X.C162177rO.A02(r1)     // Catch:{ 6zH -> 0x0159 }
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ 6zH -> 0x0159 }
            dalvik.system.DelegateLastClassLoader r2 = new dalvik.system.DelegateLastClassLoader     // Catch:{ 6zH -> 0x0159 }
            r2.<init>(r1, r0)     // Catch:{ 6zH -> 0x0159 }
        L_0x013e:
            A07(r2)     // Catch:{ 6zH -> 0x0159 }
            r6.set(r3, r2)     // Catch:{ 6zH -> 0x0159 }
            A04 = r9     // Catch:{ 6zH -> 0x0159 }
            goto L_0x0171
        L_0x0147:
            java.lang.String r1 = A06     // Catch:{ 6zH -> 0x0159 }
            X.C162177rO.A02(r1)     // Catch:{ 6zH -> 0x0159 }
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ 6zH -> 0x0159 }
            X.6tH r2 = new X.6tH     // Catch:{ 6zH -> 0x0159 }
            r2.<init>(r1, r0)     // Catch:{ 6zH -> 0x0159 }
            goto L_0x013e
        L_0x0156:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ 6zH -> 0x0159 }
            throw r0     // Catch:{ 6zH -> 0x0159 }
        L_0x0159:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0176 }
            r6.set(r3, r0)     // Catch:{ all -> 0x0176 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0176 }
            goto L_0x003a
        L_0x0164:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0176 }
            r6.set(r3, r0)     // Catch:{ all -> 0x0176 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0176 }
            goto L_0x003a
        L_0x016f:
            monitor-exit(r20)     // Catch:{ all -> 0x02a7 }
            return r5
        L_0x0171:
            monitor-exit(r19)     // Catch:{ all -> 0x0176 }
            goto L_0x0174
        L_0x0173:
            monitor-exit(r19)     // Catch:{ all -> 0x0176 }
        L_0x0174:
            monitor-exit(r20)     // Catch:{ all -> 0x02a7 }
            return r18
        L_0x0176:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x0176 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x017d, IllegalAccessException -> 0x017b, NoSuchFieldException -> 0x0179 }
        L_0x0179:
            r0 = move-exception
            goto L_0x017e
        L_0x017b:
            r0 = move-exception
            goto L_0x017e
        L_0x017d:
            r0 = move-exception
        L_0x017e:
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x02a7 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02a7 }
            java.lang.String r0 = "Failed to load module via V2: "
            r1.append(r0)     // Catch:{ all -> 0x02a7 }
            r1.append(r2)     // Catch:{ all -> 0x02a7 }
            java.lang.String r0 = "DynamiteModule"
            X.AnonymousClass6C7.A1A(r1, r0)     // Catch:{ all -> 0x02a7 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x02a7 }
        L_0x0195:
            A04 = r0     // Catch:{ all -> 0x02a7 }
        L_0x0197:
            monitor-exit(r20)     // Catch:{ all -> 0x02a7 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x02ae }
            if (r0 == 0) goto L_0x01ba
            int r0 = A02(r4, r8, r7, r5)     // Catch:{ 6zH -> 0x01a3 }
            return r0
        L_0x01a3:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x02ae }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02ae }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r1.append(r0)     // Catch:{ all -> 0x02ae }
            r1.append(r2)     // Catch:{ all -> 0x02ae }
            java.lang.String r0 = "DynamiteModule"
            X.AnonymousClass6C7.A1A(r1, r0)     // Catch:{ all -> 0x02ae }
            return r5
        L_0x01ba:
            X.6WF r6 = A05(r4)     // Catch:{ all -> 0x02ae }
            if (r6 == 0) goto L_0x02a6
            r1 = 6
            android.os.Parcel r0 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0286 }
            java.lang.String r2 = r6.A01     // Catch:{ RemoteException -> 0x0286 }
            r0.writeInterfaceToken(r2)     // Catch:{ RemoteException -> 0x0286 }
            android.os.Parcel r0 = r6.A00(r1, r0)     // Catch:{ RemoteException -> 0x0286 }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x0286 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0286 }
            r0 = 3
            if (r1 < r0) goto L_0x0243
            java.lang.ThreadLocal r11 = A0B     // Catch:{ RemoteException -> 0x0286 }
            java.lang.Object r0 = r11.get()     // Catch:{ RemoteException -> 0x0286 }
            X.7fR r0 = (X.C155747fR) r0     // Catch:{ RemoteException -> 0x0286 }
            if (r0 == 0) goto L_0x01eb
            android.database.Cursor r0 = r0.A00     // Catch:{ RemoteException -> 0x0286 }
            if (r0 == 0) goto L_0x01eb
            int r5 = r0.getInt(r5)     // Catch:{ RemoteException -> 0x0286 }
            return r5
        L_0x01eb:
            X.6UT r10 = new X.6UT     // Catch:{ RemoteException -> 0x0286 }
            r10.<init>(r4)     // Catch:{ RemoteException -> 0x0286 }
            java.lang.ThreadLocal r0 = A0C     // Catch:{ RemoteException -> 0x0286 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0286 }
            long r0 = X.C18320x8.A05(r0)     // Catch:{ RemoteException -> 0x0286 }
            android.os.Parcel r9 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0286 }
            A06(r9, r10, r2, r8, r7)     // Catch:{ RemoteException -> 0x0286 }
            r9.writeLong(r0)     // Catch:{ RemoteException -> 0x0286 }
            r0 = 7
            com.google.android.gms.dynamic.IObjectWrapper r0 = A03(r9, r6, r0)     // Catch:{ RemoteException -> 0x0286 }
            java.lang.Object r6 = X.AnonymousClass6UT.A01(r0)     // Catch:{ RemoteException -> 0x0286 }
            android.database.Cursor r6 = (android.database.Cursor) r6     // Catch:{ RemoteException -> 0x0286 }
            if (r6 == 0) goto L_0x0230
            boolean r0 = r6.moveToFirst()     // Catch:{ RemoteException -> 0x0240, all -> 0x023d }
            if (r0 == 0) goto L_0x0230
            int r2 = r6.getInt(r5)     // Catch:{ RemoteException -> 0x0240, all -> 0x023d }
            if (r2 <= 0) goto L_0x022c
            java.lang.Object r1 = r11.get()     // Catch:{ RemoteException -> 0x0240, all -> 0x023d }
            X.7fR r1 = (X.C155747fR) r1     // Catch:{ RemoteException -> 0x0240, all -> 0x023d }
            if (r1 == 0) goto L_0x022c
            android.database.Cursor r0 = r1.A00     // Catch:{ RemoteException -> 0x0240, all -> 0x023d }
            if (r0 != 0) goto L_0x022c
            r1.A00 = r6     // Catch:{ RemoteException -> 0x0240, all -> 0x023d }
            return r2
        L_0x022c:
            r6.close()     // Catch:{ all -> 0x02ae }
            return r2
        L_0x0230:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r1, r0)     // Catch:{ RemoteException -> 0x0240, all -> 0x023d }
            if (r6 == 0) goto L_0x02a6
            r6.close()     // Catch:{ all -> 0x02ae }
            return r5
        L_0x023d:
            r0 = move-exception
            r3 = r6
            goto L_0x02a3
        L_0x0240:
            r0 = move-exception
            r3 = r6
            goto L_0x0287
        L_0x0243:
            r0 = 2
            if (r1 != r0) goto L_0x0266
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r1, r0)     // Catch:{ RemoteException -> 0x0286 }
            X.6UT r0 = new X.6UT     // Catch:{ RemoteException -> 0x0286 }
            r0.<init>(r4)     // Catch:{ RemoteException -> 0x0286 }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0286 }
            A06(r1, r0, r2, r8, r7)     // Catch:{ RemoteException -> 0x0286 }
            r0 = 5
            android.os.Parcel r0 = r6.A00(r0, r1)     // Catch:{ RemoteException -> 0x0286 }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x0286 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0286 }
            return r1
        L_0x0266:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r1, r0)     // Catch:{ RemoteException -> 0x0286 }
            X.6UT r0 = new X.6UT     // Catch:{ RemoteException -> 0x0286 }
            r0.<init>(r4)     // Catch:{ RemoteException -> 0x0286 }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0286 }
            A06(r1, r0, r2, r8, r7)     // Catch:{ RemoteException -> 0x0286 }
            r0 = 3
            android.os.Parcel r0 = r6.A00(r0, r1)     // Catch:{ RemoteException -> 0x0286 }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x0286 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0286 }
            return r1
        L_0x0286:
            r0 = move-exception
        L_0x0287:
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x02a2 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r1.append(r0)     // Catch:{ all -> 0x02a2 }
            r1.append(r2)     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = "DynamiteModule"
            X.AnonymousClass6C7.A1A(r1, r0)     // Catch:{ all -> 0x02a2 }
            if (r3 == 0) goto L_0x02a6
            r3.close()     // Catch:{ all -> 0x02ae }
            return r5
        L_0x02a2:
            r0 = move-exception
        L_0x02a3:
            if (r3 == 0) goto L_0x02ad
            goto L_0x02aa
        L_0x02a6:
            return r5
        L_0x02a7:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x02a7 }
            goto L_0x02ad
        L_0x02aa:
            r3.close()     // Catch:{ all -> 0x02ae }
        L_0x02ad:
            throw r0     // Catch:{ all -> 0x02ae }
        L_0x02ae:
            r3 = move-exception
            X.C162177rO.A02(r4)     // Catch:{ Exception -> 0x02b3 }
            throw r3
        L_0x02b3:
            r2 = move-exception
            java.lang.String r1 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r1, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162227rU.A01(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x028e A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0295 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x029c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C162227rU A04(android.content.Context r18, X.C180928lr r19, java.lang.String r20) {
        /*
            java.lang.ThreadLocal r7 = A0B
            java.lang.Object r6 = r7.get()
            r0 = 0
            X.7fR r8 = new X.7fR
            r8.<init>(r0)
            r7.set(r8)
            java.lang.ThreadLocal r5 = A0C
            java.lang.Object r4 = r5.get()
            java.lang.Number r4 = (java.lang.Number) r4
            long r16 = r4.longValue()
            r13 = 0
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02d4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02d4 }
            r5.set(r0)     // Catch:{ all -> 0x02d4 }
            X.8qt r1 = A08     // Catch:{ all -> 0x02d4 }
            r2 = r18
            r9 = r20
            r0 = r19
            X.7Ju r12 = r0.BlA(r2, r1, r9)     // Catch:{ all -> 0x02d4 }
            int r11 = r12.A00     // Catch:{ all -> 0x02d4 }
            int r3 = r12.A01     // Catch:{ all -> 0x02d4 }
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02d4 }
            java.lang.String r0 = "Considering local module "
            r10.append(r0)     // Catch:{ all -> 0x02d4 }
            r10.append(r9)     // Catch:{ all -> 0x02d4 }
            java.lang.String r1 = ":"
            r10.append(r1)     // Catch:{ all -> 0x02d4 }
            r10.append(r11)     // Catch:{ all -> 0x02d4 }
            java.lang.String r0 = " and remote module "
            X.AnonymousClass001.A1K(r0, r9, r1, r10)     // Catch:{ all -> 0x02d4 }
            r10.append(r3)     // Catch:{ all -> 0x02d4 }
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x02d4 }
            android.util.Log.i(r3, r0)     // Catch:{ all -> 0x02d4 }
            int r1 = r12.A02     // Catch:{ all -> 0x02d4 }
            if (r1 == 0) goto L_0x02a0
            r0 = -1
            if (r1 != r0) goto L_0x0094
            int r0 = r12.A00     // Catch:{ all -> 0x02d4 }
            if (r0 == 0) goto L_0x02a0
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x02d4 }
            java.lang.String r0 = "Selected local version of "
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x02d4 }
            android.util.Log.i(r3, r0)     // Catch:{ all -> 0x02d4 }
            android.content.Context r0 = r2.getApplicationContext()     // Catch:{ all -> 0x02d4 }
            X.7rU r1 = new X.7rU     // Catch:{ all -> 0x02d4 }
            r1.<init>(r0)     // Catch:{ all -> 0x02d4 }
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0090
            r5.remove()
        L_0x0085:
            android.database.Cursor r0 = r8.A00
            if (r0 == 0) goto L_0x008c
            r0.close()
        L_0x008c:
            r7.set(r6)
            return r1
        L_0x0090:
            r5.set(r4)
            goto L_0x0085
        L_0x0094:
            int r13 = r12.A01     // Catch:{ all -> 0x02d4 }
            if (r13 == 0) goto L_0x02a0
            java.lang.Class<X.7rU> r18 = X.C162227rU.class
            monitor-enter(r18)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            boolean r0 = A08(r2)     // Catch:{ all -> 0x0225 }
            if (r0 == 0) goto L_0x021d
            java.lang.Boolean r0 = A04     // Catch:{ all -> 0x0225 }
            monitor-exit(r18)     // Catch:{ all -> 0x0225 }
            if (r0 == 0) goto L_0x0215
            boolean r0 = r0.booleanValue()     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r14 = 2
            if (r0 == 0) goto L_0x0163
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            java.lang.String r0 = "Selected remote version of "
            r1.append(r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r1.append(r9)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            java.lang.String r0 = ", version >= "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r13)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            android.util.Log.i(r3, r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            monitor-enter(r18)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            X.6WG r15 = A03     // Catch:{ all -> 0x015f }
            monitor-exit(r18)     // Catch:{ all -> 0x015f }
            if (r15 == 0) goto L_0x0156
            java.lang.Object r0 = r7.get()     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            X.7fR r0 = (X.C155747fR) r0     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            if (r0 == 0) goto L_0x0228
            android.database.Cursor r1 = r0.A00     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            if (r1 == 0) goto L_0x0228
            android.content.Context r10 = r2.getApplicationContext()     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            android.database.Cursor r1 = r0.A00     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r11 = 0
            X.6UT r0 = new X.6UT     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r0.<init>(r11)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            monitor-enter(r18)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            int r0 = A01     // Catch:{ all -> 0x0152 }
            boolean r0 = X.C18280x3.A1U(r0, r14)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0152 }
            monitor-exit(r18)     // Catch:{ all -> 0x0152 }
            boolean r0 = r0.booleanValue()     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            if (r0 == 0) goto L_0x0125
            java.lang.String r0 = "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
            android.util.Log.v(r3, r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            X.6UT r11 = new X.6UT     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r11.<init>(r10)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            X.6UT r10 = new X.6UT     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r10.<init>(r1)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            java.lang.String r0 = r15.A01     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            A06(r1, r11, r0, r9, r13)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            android.os.IBinder r0 = r10.asBinder()     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r1.writeStrongBinder(r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r0 = 3
            com.google.android.gms.dynamic.IObjectWrapper r0 = A03(r1, r15, r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
        L_0x0116:
            java.lang.Object r0 = X.AnonymousClass6UT.A01(r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            if (r0 == 0) goto L_0x0149
            X.7rU r10 = new X.7rU     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r10.<init>(r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            goto L_0x0288
        L_0x0125:
            java.lang.String r0 = "Dynamite loader version < 2, falling back to loadModule2"
            android.util.Log.w(r3, r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            X.6UT r11 = new X.6UT     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r11.<init>(r10)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            X.6UT r10 = new X.6UT     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r10.<init>(r1)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            java.lang.String r0 = r15.A01     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            A06(r1, r11, r0, r9, r13)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            android.os.IBinder r0 = r10.asBinder()     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r1.writeStrongBinder(r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = A03(r1, r15, r14)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            goto L_0x0116
        L_0x0149:
            java.lang.String r0 = "Failed to get module context"
            X.6zH r1 = new X.6zH     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            goto L_0x022f
        L_0x0152:
            r1 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x0152 }
            goto L_0x022f
        L_0x0156:
            java.lang.String r0 = "DynamiteLoaderV2 was not cached."
            X.6zH r1 = new X.6zH     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            goto L_0x022f
        L_0x015f:
            r1 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x015f }
            goto L_0x022f
        L_0x0163:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            java.lang.String r0 = "Selected remote version of "
            r1.append(r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r1.append(r9)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            java.lang.String r0 = ", version >= "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r13)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            android.util.Log.i(r3, r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            X.6WF r11 = A05(r2)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            if (r11 == 0) goto L_0x020d
            r1 = 6
            android.os.Parcel r0 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            java.lang.String r10 = r11.A01     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r0.writeInterfaceToken(r10)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            android.os.Parcel r0 = r11.A00(r1, r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r0 = 3
            if (r1 < r0) goto L_0x0197
            goto L_0x01c6
        L_0x0197:
            if (r1 != r14) goto L_0x01b0
            java.lang.String r0 = "IDynamite loader version = 2"
            android.util.Log.w(r3, r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            X.6UT r0 = new X.6UT     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r0.<init>(r2)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            A06(r1, r0, r10, r9, r13)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r0 = 4
            com.google.android.gms.dynamic.IObjectWrapper r0 = A03(r1, r11, r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            goto L_0x01ee
        L_0x01b0:
            java.lang.String r0 = "Dynamite loader version < 2, falling back to createModuleContext"
            android.util.Log.w(r3, r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            X.6UT r1 = new X.6UT     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r1.<init>(r2)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            android.os.Parcel r0 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            A06(r0, r1, r10, r9, r13)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = A03(r0, r11, r14)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            goto L_0x01ee
        L_0x01c6:
            java.lang.Object r0 = r7.get()     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            X.7fR r0 = (X.C155747fR) r0     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            if (r0 == 0) goto L_0x0205
            X.6UT r14 = new X.6UT     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r14.<init>(r2)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            android.database.Cursor r0 = r0.A00     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            X.6UT r1 = new X.6UT     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            android.os.Parcel r0 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            A06(r0, r14, r10, r9, r13)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            android.os.IBinder r1 = r1.asBinder()     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r0.writeStrongBinder(r1)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r1 = 8
            com.google.android.gms.dynamic.IObjectWrapper r0 = A03(r0, r11, r1)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
        L_0x01ee:
            java.lang.Object r0 = X.AnonymousClass6UT.A01(r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            if (r0 == 0) goto L_0x01fd
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            X.7rU r10 = new X.7rU     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r10.<init>(r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            goto L_0x0288
        L_0x01fd:
            java.lang.String r0 = "Failed to load remote module."
            X.6zH r1 = new X.6zH     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            goto L_0x022f
        L_0x0205:
            java.lang.String r0 = "No cached result cursor holder"
            X.6zH r1 = new X.6zH     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            goto L_0x022f
        L_0x020d:
            java.lang.String r0 = "Failed to create IDynamiteLoader."
            X.6zH r1 = new X.6zH     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            goto L_0x022f
        L_0x0215:
            java.lang.String r0 = "Failed to determine which loading route to use."
            X.6zH r1 = new X.6zH     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            goto L_0x022f
        L_0x021d:
            java.lang.String r1 = "Remote loading disabled"
            X.6zH r0 = new X.6zH     // Catch:{ all -> 0x0225 }
            r0.<init>(r1)     // Catch:{ all -> 0x0225 }
            throw r0     // Catch:{ all -> 0x0225 }
        L_0x0225:
            r1 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x0225 }
            goto L_0x022f
        L_0x0228:
            java.lang.String r0 = "No result cursor"
            X.6zH r1 = new X.6zH     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
        L_0x022f:
            throw r1     // Catch:{ RemoteException -> 0x0237, 6zH -> 0x0235, all -> 0x0230 }
        L_0x0230:
            r11 = move-exception
            X.C162177rO.A02(r2)     // Catch:{ Exception -> 0x0240 }
            goto L_0x0248
        L_0x0235:
            r0 = move-exception
            throw r0     // Catch:{ 6zH -> 0x0250 }
        L_0x0237:
            r1 = move-exception
            java.lang.String r0 = "Failed to load remote module."
            X.6zH r10 = new X.6zH     // Catch:{ 6zH -> 0x0250 }
            r10.<init>(r0, r1)     // Catch:{ 6zH -> 0x0250 }
            goto L_0x024f
        L_0x0240:
            r10 = move-exception
            java.lang.String r1 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r1, r0, r10)     // Catch:{ 6zH -> 0x0250 }
        L_0x0248:
            java.lang.String r0 = "Failed to load remote module."
            X.6zH r10 = new X.6zH     // Catch:{ 6zH -> 0x0250 }
            r10.<init>(r0, r11)     // Catch:{ 6zH -> 0x0250 }
        L_0x024f:
            throw r10     // Catch:{ 6zH -> 0x0250 }
        L_0x0250:
            r10 = move-exception
            java.lang.String r11 = r10.getMessage()     // Catch:{ all -> 0x02d4 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02d4 }
            java.lang.String r0 = "Failed to load remote module: "
            X.AnonymousClass6C7.A1F(r0, r11, r3, r1)     // Catch:{ all -> 0x02d4 }
            int r0 = r12.A00     // Catch:{ all -> 0x02d4 }
            if (r0 == 0) goto L_0x02cc
            X.8A0 r1 = new X.8A0     // Catch:{ all -> 0x02d4 }
            r1.<init>(r0)     // Catch:{ all -> 0x02d4 }
            r0 = r19
            X.7Ju r0 = r0.BlA(r2, r1, r9)     // Catch:{ all -> 0x02d4 }
            int r1 = r0.A02     // Catch:{ all -> 0x02d4 }
            r0 = -1
            if (r1 != r0) goto L_0x02cc
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x02d4 }
            java.lang.String r0 = "Selected local version of "
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x02d4 }
            android.util.Log.i(r3, r0)     // Catch:{ all -> 0x02d4 }
            android.content.Context r0 = r2.getApplicationContext()     // Catch:{ all -> 0x02d4 }
            X.7rU r10 = new X.7rU     // Catch:{ all -> 0x02d4 }
            r10.<init>(r0)     // Catch:{ all -> 0x02d4 }
        L_0x0288:
            r1 = 0
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x029c
            r5.remove()
        L_0x0291:
            android.database.Cursor r0 = r8.A00
            if (r0 == 0) goto L_0x0298
            r0.close()
        L_0x0298:
            r7.set(r6)
            return r10
        L_0x029c:
            r5.set(r4)
            goto L_0x0291
        L_0x02a0:
            int r3 = r12.A00     // Catch:{ all -> 0x02d4 }
            int r2 = r12.A01     // Catch:{ all -> 0x02d4 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02d4 }
            java.lang.String r0 = "No acceptable module "
            r1.append(r0)     // Catch:{ all -> 0x02d4 }
            r1.append(r9)     // Catch:{ all -> 0x02d4 }
            java.lang.String r0 = " found. Local version is "
            r1.append(r0)     // Catch:{ all -> 0x02d4 }
            r1.append(r3)     // Catch:{ all -> 0x02d4 }
            java.lang.String r0 = " and remote version is "
            r1.append(r0)     // Catch:{ all -> 0x02d4 }
            r1.append(r2)     // Catch:{ all -> 0x02d4 }
            java.lang.String r0 = "."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x02d4 }
            X.6zH r1 = new X.6zH     // Catch:{ all -> 0x02d4 }
            r1.<init>(r0)     // Catch:{ all -> 0x02d4 }
            goto L_0x02d3
        L_0x02cc:
            java.lang.String r0 = "Remote load failed. No local fallback found."
            X.6zH r1 = new X.6zH     // Catch:{ all -> 0x02d4 }
            r1.<init>(r0, r10)     // Catch:{ all -> 0x02d4 }
        L_0x02d3:
            throw r1     // Catch:{ all -> 0x02d4 }
        L_0x02d4:
            r3 = move-exception
            r1 = 0
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x02e9
            r5.remove()
        L_0x02de:
            android.database.Cursor r0 = r8.A00
            if (r0 == 0) goto L_0x02e5
            r0.close()
        L_0x02e5:
            r7.set(r6)
            throw r3
        L_0x02e9:
            r5.set(r4)
            goto L_0x02de
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162227rU.A04(android.content.Context, X.8lr, java.lang.String):X.7rU");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r1 != null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass6WF A05(android.content.Context r5) {
        /*
            java.lang.Class<X.7rU> r4 = X.C162227rU.class
            monitor-enter(r4)
            X.6WF r3 = A02     // Catch:{ all -> 0x0056 }
            if (r3 != 0) goto L_0x0054
            r3 = 0
            java.lang.String r1 = "com.google.android.gms"
            r0 = 3
            android.content.Context r0 = r5.createPackageContext(r1, r0)     // Catch:{ Exception -> 0x003a }
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch:{ Exception -> 0x003a }
            java.lang.String r0 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r0 = r1.loadClass(r0)     // Catch:{ Exception -> 0x003a }
            java.lang.Object r2 = r0.newInstance()     // Catch:{ Exception -> 0x003a }
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ Exception -> 0x003a }
            if (r2 == 0) goto L_0x0054
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r1 = r2.queryLocalInterface(r0)     // Catch:{ Exception -> 0x003a }
            boolean r0 = r1 instanceof X.AnonymousClass6WF     // Catch:{ Exception -> 0x003a }
            if (r0 == 0) goto L_0x0032
            X.6WF r1 = (X.AnonymousClass6WF) r1     // Catch:{ Exception -> 0x003a }
            if (r1 == 0) goto L_0x0054
        L_0x002f:
            A02 = r1     // Catch:{ Exception -> 0x003a }
            goto L_0x0038
        L_0x0032:
            X.6WF r1 = new X.6WF     // Catch:{ Exception -> 0x003a }
            r1.<init>(r2)     // Catch:{ Exception -> 0x003a }
            goto L_0x002f
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            return r1
        L_0x003a:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0056 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "Failed to load IDynamiteLoader from GmsCore: "
            r2.append(r0)     // Catch:{ all -> 0x0056 }
            r2.append(r1)     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0056 }
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            return r3
        L_0x0056:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162227rU.A05(android.content.Context):X.6WF");
    }

    public static boolean A08(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (!bool.equals((Object) null)) {
            Boolean bool2 = A05;
            if (!bool.equals(bool2)) {
                boolean z = false;
                if (bool2 == null) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
                    if (C158267jh.A00.A04(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        z = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    A05 = valueOf;
                    z = valueOf.booleanValue();
                    if (z) {
                        if (!(resolveContentProvider == null || (applicationInfo = resolveContentProvider.applicationInfo) == null || (applicationInfo.flags & 129) != 0)) {
                            Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                            A07 = true;
                        }
                        return z;
                    }
                }
                Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
                return z;
            }
        }
        return true;
    }

    public IBinder A09(String str) {
        try {
            return (IBinder) this.A00.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new C143666zH("Failed to instantiate module class: ".concat(String.valueOf(str)), e);
        }
    }

    public C162227rU(Context context) {
        C162177rO.A02(context);
        this.A00 = context;
    }

    public static IObjectWrapper A03(Parcel parcel, C163117tI r1, int i) {
        Parcel A002 = r1.A00(i, parcel);
        IObjectWrapper A022 = AnonymousClass6WL.A02(A002.readStrongBinder());
        A002.recycle();
        return A022;
    }

    public static void A06(Parcel parcel, AnonymousClass6DX r2, String str, String str2, int i) {
        parcel.writeInterfaceToken(str);
        parcel.writeStrongBinder(r2.asBinder());
        parcel.writeString(str2);
        parcel.writeInt(i);
    }
}
