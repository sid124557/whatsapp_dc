package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.7e3  reason: invalid class name and case insensitive filesystem */
public final class C154967e3 {
    public static final C157897j6 A00 = new C157897j6("PhoneskyVerificationUtils");

    public static boolean A00(Context context) {
        int length;
        String str;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (length = signatureArr.length) == 0) {
                    C157897j6 r4 = A00;
                    Object[] objArr = new Object[0];
                    if (Log.isLoggable("PlayCore", 5)) {
                        Log.w("PlayCore", C157897j6.A00(r4.A00, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                    }
                } else {
                    int i = 0;
                    do {
                        byte[] byteArray = signatureArr[i].toByteArray();
                        try {
                            MessageDigest instance = MessageDigest.getInstance("SHA-256");
                            instance.update(byteArray);
                            str = Base64.encodeToString(instance.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            str = "";
                        }
                        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                            return true;
                        }
                        String str2 = Build.TAGS;
                        if ((str2.contains("dev-keys") || str2.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                            return true;
                        }
                        i++;
                    } while (i < length);
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return false;
    }
}
