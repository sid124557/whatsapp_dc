package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: X.72O  reason: invalid class name */
public final class AnonymousClass72O {
    public static boolean A00(Context context, int i) {
        boolean z;
        try {
            AppOpsManager appOpsManager = (AppOpsManager) C159987mq.A00(context).A00.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i, "com.google.android.gms");
                z = true;
                if (z) {
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                        C160057mx A00 = C160057mx.A00(context);
                        if (packageInfo == null) {
                            return false;
                        }
                        if (C160057mx.A01(packageInfo, false)) {
                            return true;
                        }
                        if (!C160057mx.A01(packageInfo, true)) {
                            return false;
                        }
                        if (C162117rH.A04(A00.A00)) {
                            return true;
                        }
                        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        return false;
                    } catch (PackageManager.NameNotFoundException unused) {
                        if (Log.isLoggable("UidVerifier", 3)) {
                            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                        }
                    }
                }
                return false;
            }
            throw AnonymousClass001.A0g("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused2) {
            z = false;
        }
    }
}
