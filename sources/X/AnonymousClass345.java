package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.whatsapp.payments.receiver.IndiaUpiPayIntentReceiverActivity;
import com.whatsapp.util.Log;

/* renamed from: X.345  reason: invalid class name */
public class AnonymousClass345 {
    public static void A02(Context context, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, IndiaUpiPayIntentReceiverActivity.class), C18280x3.A01(z ? 1 : 0), 1);
        } catch (Exception e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "PackageManagerUtils/setActivityRegisteredState/error: ", e);
        }
    }

    public static long A00(Context context, String str) {
        PackageInfo A01 = A01(context, str);
        if (A01 == null) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return A01.getLongVersionCode();
        }
        return (long) A01.versionCode;
    }

    public static PackageInfo A01(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getPackageInfo(str, 0);
            }
            return null;
        } catch (PackageManager.NameNotFoundException | RuntimeException e) {
            Log.e("Failed to get package info", e);
            return null;
        }
    }

    public static Signature[] A03(Context context) {
        String packageName = context.getPackageName();
        if (context.getPackageManager() == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(packageName, 64).signatures;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
