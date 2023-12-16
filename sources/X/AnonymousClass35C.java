package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.35C  reason: invalid class name */
public final class AnonymousClass35C {
    public static Set A00;

    public static String A02(Signature signature) {
        try {
            return AnonymousClass0x7.A0s(MessageDigest.getInstance("SHA-1").digest(signature.toByteArray()));
        } catch (NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public static boolean A04(PackageInfo packageInfo) {
        Set set = A00;
        if (set == null) {
            HashSet A0K = AnonymousClass002.A0K();
            A0K.add("ijxLJi1yGs1JpL-X1SExmchvork");
            A0K.add("xW-31ZG6ZwTfBH_Zj1NTcv6gAhE");
            A0K.add("Sr9mhPKOEwo6NysnYn803dZ3UiY");
            A0K.add("OKD31QX-GP7GT780Psqq8xDb15k");
            A0K.add("Dp3faO2KC6cZg6irlvtu9yL9H3E");
            set = Collections.unmodifiableSet(A0K);
            A00 = set;
        }
        return set.contains(A01(packageInfo));
    }

    public static Signature A00(PackageManager packageManager, String str) {
        Signature[] signatureArr;
        int length;
        try {
            int i = 64;
            if (C107385bE.A06()) {
                i = 134217728;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(str, i);
            String str2 = packageInfo.packageName;
            if (str.equals(str2)) {
                if (C107385bE.A06()) {
                    signatureArr = packageInfo.signingInfo.getApkContentsSigners();
                } else {
                    signatureArr = packageInfo.signatures;
                }
                if (signatureArr == null || (length = signatureArr.length) == 0) {
                    throw new SecurityException(AnonymousClass000.A0V("Signatures are missing: ", str, AnonymousClass001.A0o()));
                } else if (length <= 1) {
                    return signatureArr[0];
                } else {
                    throw new SecurityException(AnonymousClass000.A0V("Multiple signatures not supported: ", str, AnonymousClass001.A0o()));
                }
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Package name mismatch: expected=");
                A0o.append(str);
                throw new SecurityException(AnonymousClass000.A0V(", was=", str2, A0o));
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new SecurityException(AnonymousClass000.A0V("Name not found: ", str, AnonymousClass001.A0o()));
        }
    }

    public static String A01(PackageInfo packageInfo) {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        if (!C107385bE.A06() || (signingInfo = packageInfo.signingInfo) == null) {
            signatureArr = packageInfo.signatures;
        } else {
            signatureArr = signingInfo.getApkContentsSigners();
        }
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        return A02(signatureArr[0]);
    }

    public static boolean A03(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            int i = 64;
            if (C107385bE.A06()) {
                i = 134217728;
            }
            return A04(packageManager.getPackageInfo(str, i));
        } catch (PackageManager.NameNotFoundException e) {
            C18260x0.A0u("cannot find package; packageName=", str, AnonymousClass001.A0o(), e);
            return false;
        }
    }
}
