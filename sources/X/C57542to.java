package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;

/* renamed from: X.2to  reason: invalid class name and case insensitive filesystem */
public final class C57542to {
    public static final Integer A00(PackageManager packageManager) {
        Bundle bundle;
        C162457s7.A0J(packageManager, 0);
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.meta.testing", 192);
            C162457s7.A0H(packageInfo);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null || signatureArr.length != 1 || !C162457s7.A0P(AnonymousClass2BE.A00, signatureArr[0])) {
                return null;
            }
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return Integer.valueOf(bundle.getInt("com.meta.testing.group", 0));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
