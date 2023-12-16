package X;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7rH  reason: invalid class name and case insensitive filesystem */
public class C162117rH {
    public static boolean A00;
    public static boolean A01;
    public static final AtomicBoolean A02 = new AtomicBoolean();
    public static final AtomicBoolean A03 = new AtomicBoolean();

    @Deprecated
    public static Dialog A01(Activity activity, DialogInterface.OnCancelListener onCancelListener, int i, int i2) {
        if (i == 18 || (i == 1 && true == A05(activity))) {
            i = 18;
        }
        return AnonymousClass6Q8.A00(activity, onCancelListener, new AnonymousClass6UF(activity, AnonymousClass6Q8.A00.A05(activity, "d", i), i2), i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a8, code lost:
        if (r0.booleanValue() != false) goto L_0x00aa;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(android.content.Context r10, int r11) {
        /*
            java.lang.String r3 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r10.getResources()     // Catch:{ all -> 0x000d }
            r0 = 2131895762(0x7f1225d2, float:1.9426366E38)
            r1.getString(r0)     // Catch:{ all -> 0x000d }
            goto L_0x0012
        L_0x000d:
            java.lang.String r0 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r3, r0)
        L_0x0012:
            java.lang.String r0 = r10.getPackageName()
            java.lang.String r8 = "com.google.android.gms"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0077
            java.util.concurrent.atomic.AtomicBoolean r0 = A03
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0077
            java.lang.Object r4 = X.AnonymousClass793.A02
            monitor-enter(r4)
            boolean r0 = X.AnonymousClass793.A01     // Catch:{ all -> 0x0074 }
            if (r0 != 0) goto L_0x005e
            r0 = 1
            X.AnonymousClass793.A01 = r0     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = r10.getPackageName()     // Catch:{ all -> 0x0074 }
            X.7BQ r0 = X.C159987mq.A00(r10)     // Catch:{ all -> 0x0074 }
            r1 = 128(0x80, float:1.794E-43)
            android.content.Context r0 = r0.A00     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r2, r1)     // Catch:{ NameNotFoundException -> 0x0056 }
            android.os.Bundle r1 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r1 == 0) goto L_0x005e
            java.lang.String r0 = "com.google.app.id"
            r1.getString(r0)     // Catch:{ NameNotFoundException -> 0x0056 }
            java.lang.String r0 = "com.google.android.gms.version"
            int r0 = r1.getInt(r0)     // Catch:{ NameNotFoundException -> 0x0056 }
            X.AnonymousClass793.A00 = r0     // Catch:{ NameNotFoundException -> 0x0056 }
            goto L_0x005e
        L_0x0056:
            r2 = move-exception
            java.lang.String r1 = "MetadataValueReader"
            java.lang.String r0 = "This should never happen."
            android.util.Log.wtf(r1, r0, r2)     // Catch:{ all -> 0x0074 }
        L_0x005e:
            monitor-exit(r4)     // Catch:{ all -> 0x0074 }
            int r1 = X.AnonymousClass793.A00
            if (r1 == 0) goto L_0x006e
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            if (r1 == r0) goto L_0x0077
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r0 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r0.<init>(r1)
            throw r0
        L_0x006e:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r0 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r0.<init>()
            throw r0
        L_0x0074:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0074 }
            throw r0
        L_0x0077:
            boolean r0 = X.C155557f6.A00(r10)
            r4 = 1
            r7 = 0
            if (r0 != 0) goto L_0x00aa
            java.lang.Boolean r0 = X.C155557f6.A02
            if (r0 != 0) goto L_0x00a3
            android.content.pm.PackageManager r1 = r10.getPackageManager()
            java.lang.String r0 = "android.hardware.type.iot"
            boolean r0 = r1.hasSystemFeature(r0)
            r2 = 1
            if (r0 != 0) goto L_0x009d
            android.content.pm.PackageManager r1 = r10.getPackageManager()
            java.lang.String r0 = "android.hardware.type.embedded"
            boolean r0 = r1.hasSystemFeature(r0)
            if (r0 != 0) goto L_0x009d
            r2 = 0
        L_0x009d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            X.C155557f6.A02 = r0
        L_0x00a3:
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L_0x00ab
        L_0x00aa:
            r2 = 0
        L_0x00ab:
            boolean r0 = X.AnonymousClass001.A1U(r11)
            if (r0 == 0) goto L_0x0166
            java.lang.String r5 = r10.getPackageName()
            android.content.pm.PackageManager r6 = r10.getPackageManager()
            if (r2 == 0) goto L_0x00ce
            java.lang.String r1 = "com.android.vending"
            r0 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r1 = r6.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x00c4 }
            goto L_0x00cf
        L_0x00c4:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = " requires the Google Play Store, but it is missing."
            X.AnonymousClass6C9.A13(r1, r0, r3)
            goto L_0x00e7
        L_0x00ce:
            r1 = 0
        L_0x00cf:
            r0 = 64
            android.content.pm.PackageInfo r9 = r6.getPackageInfo(r8, r0)     // Catch:{ NameNotFoundException -> 0x015c }
            X.C160057mx.A00(r10)
            boolean r0 = X.C160057mx.A01(r9, r4)
            if (r0 != 0) goto L_0x00ea
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = " requires Google Play services, but their signature is invalid."
        L_0x00e4:
            X.AnonymousClass6C9.A13(r1, r0, r3)
        L_0x00e7:
            r4 = 9
            return r4
        L_0x00ea:
            if (r2 == 0) goto L_0x0113
            X.C162177rO.A02(r1)
            boolean r0 = X.C160057mx.A01(r1, r4)
            if (r0 != 0) goto L_0x00fc
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = " requires Google Play Store, but its signature is invalid."
            goto L_0x00e4
        L_0x00fc:
            if (r1 == 0) goto L_0x0113
            android.content.pm.Signature[] r0 = r1.signatures
            r1 = r0[r7]
            android.content.pm.Signature[] r0 = r9.signatures
            r0 = r0[r7]
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0113
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            goto L_0x00e4
        L_0x0113:
            int r2 = r9.versionCode
            r1 = -1
            if (r2 != r1) goto L_0x013a
            r0 = -1
        L_0x0119:
            if (r11 == r1) goto L_0x011d
            int r1 = r11 / 1000
        L_0x011d:
            if (r0 >= r1) goto L_0x013d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Google Play services out of date for "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ".  Requires "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " but found "
            X.AnonymousClass6C7.A1I(r0, r3, r1, r2)
            r4 = 2
            return r4
        L_0x013a:
            int r0 = r2 / 1000
            goto L_0x0119
        L_0x013d:
            android.content.pm.ApplicationInfo r0 = r9.applicationInfo
            if (r0 != 0) goto L_0x0155
            android.content.pm.ApplicationInfo r0 = r6.getApplicationInfo(r8, r7)     // Catch:{ NameNotFoundException -> 0x0146 }
            goto L_0x0155
        L_0x0146:
            r2 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.wtf(r3, r0, r2)
            return r4
        L_0x0155:
            boolean r0 = r0.enabled
            if (r0 != 0) goto L_0x015b
            r4 = 3
            return r4
        L_0x015b:
            return r7
        L_0x015c:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = " requires Google Play services, but they are missing."
            X.AnonymousClass6C9.A13(r1, r0, r3)
            return r4
        L_0x0166:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6CA.A0N()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162117rH.A00(android.content.Context, int):int");
    }

    @Deprecated
    public static PendingIntent A02(Context context, int i, int i2) {
        Intent A05 = C158267jh.A00.A05(context, (String) null, i);
        if (A05 != null) {
            return PendingIntent.getActivity(context, i2, A05, C1456876w.A00 | 134217728);
        }
        return null;
    }

    @Deprecated
    public static void A03(Context context, int i) {
        C158267jh r1 = C158267jh.A00;
        int A04 = r1.A04(context, i);
        if (A04 != 0) {
            Intent A05 = r1.A05(context, "e", A04);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GooglePlayServices not available due to error ");
            A0o.append(A04);
            Log.e("GooglePlayServicesUtil", A0o.toString());
            if (A05 == null) {
                throw new C143476yw(A04);
            }
            throw new AnonymousClass6QB(A05, "Google Play Services not available", A04);
        }
    }

    public static boolean A04(Context context) {
        if (!A00) {
            try {
                PackageInfo packageInfo = C159987mq.A00(context).A00.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                C160057mx.A00(context);
                if (packageInfo == null || C160057mx.A01(packageInfo, false) || !C160057mx.A01(packageInfo, true)) {
                    A01 = false;
                } else {
                    A01 = true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
            } catch (Throwable th) {
                A00 = true;
                throw th;
            }
            A00 = true;
        }
        if (A01 || !PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(Build.TYPE)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(android.content.Context r5) {
        /*
            java.lang.String r4 = "com.google.android.gms"
            r3 = 1
            r2 = 0
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ Exception -> 0x0038 }
            android.content.pm.PackageInstaller r0 = r0.getPackageInstaller()     // Catch:{ Exception -> 0x0038 }
            java.util.List r0 = r0.getAllSessions()     // Catch:{ Exception -> 0x0038 }
            java.util.Iterator r1 = r0.iterator()
        L_0x0014:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r1.next()
            android.content.pm.PackageInstaller$SessionInfo r0 = (android.content.pm.PackageInstaller.SessionInfo) r0
            java.lang.String r0 = r0.getAppPackageName()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0014
            return r3
        L_0x002b:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            r0 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r4, r0)     // Catch:{  }
            boolean r0 = r0.enabled     // Catch:{  }
            return r0
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162117rH.A05(android.content.Context):boolean");
    }
}
