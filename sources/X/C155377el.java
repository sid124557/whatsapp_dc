package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: X.7el  reason: invalid class name and case insensitive filesystem */
public final class C155377el {
    public static Context A00;
    public static C187198wk A01;

    public static Context A00(Context context) {
        Context context2 = A00;
        if (context2 == null) {
            try {
                context2 = C162227rU.A04(context, C162227rU.A0A, "com.google.android.gms.maps_dynamite").A00;
            } catch (Exception e) {
                Log.e("zzca", "Failed to load maps module, use legacy", e);
                try {
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
            }
            A00 = context2;
        }
        return context2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C187198wk A01(android.content.Context r4) {
        /*
            X.C162177rO.A02(r4)
            X.8wk r0 = A01
            if (r0 != 0) goto L_0x00b4
            r0 = 13400000(0xcc77c0, float:1.87774E-38)
            int r0 = X.C162117rH.A00(r4, r0)
            if (r0 != 0) goto L_0x00ac
            java.lang.String r1 = "zzca"
            java.lang.String r0 = "Making Creator dynamically"
            android.util.Log.i(r1, r0)
            android.content.Context r0 = A00(r4)
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.String r0 = "com.google.android.gms.maps.internal.CreatorImpl"
            X.C162177rO.A02(r1)     // Catch:{ ClassNotFoundException -> 0x00a5 }
            java.lang.Class r0 = r1.loadClass(r0)     // Catch:{ ClassNotFoundException -> 0x00a5 }
            java.lang.Object r1 = r0.newInstance()     // Catch:{ InstantiationException -> 0x008a, IllegalAccessException -> 0x006f }
            android.os.IBinder r1 = (android.os.IBinder) r1
            if (r1 != 0) goto L_0x0034
            r3 = 0
        L_0x0031:
            A01 = r3
            goto L_0x0047
        L_0x0034:
            java.lang.String r0 = "com.google.android.gms.maps.internal.ICreator"
            android.os.IInterface r3 = r1.queryLocalInterface(r0)
            boolean r0 = r3 instanceof X.C187198wk
            if (r0 == 0) goto L_0x0041
            X.8wk r3 = (X.C187198wk) r3
            goto L_0x0031
        L_0x0041:
            X.6X3 r3 = new X.6X3
            r3.<init>(r1)
            goto L_0x0031
        L_0x0047:
            android.content.Context r0 = A00(r4)     // Catch:{ RemoteException -> 0x0068 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ RemoteException -> 0x0068 }
            X.6UT r2 = new X.6UT     // Catch:{ RemoteException -> 0x0068 }
            r2.<init>(r0)     // Catch:{ RemoteException -> 0x0068 }
            X.7tO r3 = (X.C163177tO) r3     // Catch:{ RemoteException -> 0x0068 }
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            android.os.Parcel r1 = r3.A00()     // Catch:{ RemoteException -> 0x0068 }
            X.C161087oy.A00(r2, r1)     // Catch:{ RemoteException -> 0x0068 }
            r1.writeInt(r0)     // Catch:{ RemoteException -> 0x0068 }
            r0 = 6
            r3.A02(r0, r1)     // Catch:{ RemoteException -> 0x0068 }
            goto L_0x00b2
        L_0x0068:
            r0 = move-exception
            X.8RJ r1 = new X.8RJ
            r1.<init>(r0)
            throw r1
        L_0x006f:
            java.lang.String r2 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x00a5 }
            int r0 = r2.length()     // Catch:{ ClassNotFoundException -> 0x00a5 }
            java.lang.String r1 = "Unable to call the default constructor of "
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = r1.concat(r2)     // Catch:{ ClassNotFoundException -> 0x00a5 }
        L_0x007f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ ClassNotFoundException -> 0x00a5 }
            goto L_0x009e
        L_0x0084:
            java.lang.String r0 = new java.lang.String     // Catch:{ ClassNotFoundException -> 0x00a5 }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x00a5 }
            goto L_0x007f
        L_0x008a:
            java.lang.String r2 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x00a5 }
            int r0 = r2.length()     // Catch:{ ClassNotFoundException -> 0x00a5 }
            java.lang.String r1 = "Unable to instantiate the dynamic class "
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = r1.concat(r2)     // Catch:{ ClassNotFoundException -> 0x00a5 }
        L_0x009a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ ClassNotFoundException -> 0x00a5 }
        L_0x009e:
            throw r0     // Catch:{ ClassNotFoundException -> 0x00a5 }
        L_0x009f:
            java.lang.String r0 = new java.lang.String     // Catch:{ ClassNotFoundException -> 0x00a5 }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x00a5 }
            goto L_0x009a
        L_0x00a5:
            java.lang.String r0 = "Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl"
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0e(r0)
            throw r1
        L_0x00ac:
            X.6yw r1 = new X.6yw
            r1.<init>(r0)
            throw r1
        L_0x00b2:
            X.8wk r0 = A01
        L_0x00b4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C155377el.A01(android.content.Context):X.8wk");
    }
}
