package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;

/* renamed from: X.2Ul  reason: invalid class name and case insensitive filesystem */
public class C44042Ul {
    public final PackageManager A00;

    public AnonymousClass2JE A00() {
        Bundle bundle;
        try {
            PackageInfo packageInfo = this.A00.getPackageInfo(AnonymousClass78K.A00, 192);
            if (packageInfo.applicationInfo == null) {
                return null;
            }
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null && signatureArr.length == 1) {
                Signature signature = signatureArr[0];
                if (!AnonymousClass2C0.A01.equals(signature) && !AnonymousClass2C0.A00.equals(signature)) {
                    AnonymousClass2C0.A02.equals(signature);
                }
            }
            int i = -1;
            if (packageInfo.versionCode >= 20297189) {
                i = 1;
            }
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                i = bundle.getInt("com.facebook.appmanager.api.level", i);
            }
            return new AnonymousClass2JE(i, packageInfo.applicationInfo.enabled);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public C44042Ul(PackageManager packageManager) {
        this.A00 = packageManager;
    }
}
