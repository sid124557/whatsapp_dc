package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;

/* renamed from: X.7o2  reason: invalid class name and case insensitive filesystem */
public final class C160637o2 {
    public int A00;
    public int A01 = 0;
    public String A02;
    public String A03;
    public final Context A04;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006f, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int A02() {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.A01     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x006e
            android.content.Context r0 = r6.A04     // Catch:{ all -> 0x0070 }
            android.content.pm.PackageManager r5 = r0.getPackageManager()     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r4 = "com.google.android.gms"
            int r1 = r5.checkPermission(r0, r4)     // Catch:{ all -> 0x0070 }
            r0 = -1
            r3 = 0
            if (r1 != r0) goto L_0x001f
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r0 = "Google Play services missing or without correct permission."
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x0070 }
            goto L_0x0057
        L_0x001f:
            boolean r0 = X.C154017cR.A00()     // Catch:{ all -> 0x0070 }
            r2 = 1
            if (r0 != 0) goto L_0x003f
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            android.content.Intent r0 = X.AnonymousClass0x9.A09(r0)     // Catch:{ all -> 0x0070 }
            r0.setPackage(r4)     // Catch:{ all -> 0x0070 }
            java.util.List r0 = r5.queryIntentServices(r0, r3)     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x003f
            int r0 = r0.size()     // Catch:{ all -> 0x0070 }
            if (r0 <= 0) goto L_0x003f
            r6.A01 = r2     // Catch:{ all -> 0x0070 }
            monitor-exit(r6)
            return r2
        L_0x003f:
            java.lang.String r0 = "com.google.iid.TOKEN_REQUEST"
            android.content.Intent r0 = X.AnonymousClass0x9.A09(r0)     // Catch:{ all -> 0x0070 }
            r0.setPackage(r4)     // Catch:{ all -> 0x0070 }
            java.util.List r0 = r5.queryBroadcastReceivers(r0, r3)     // Catch:{ all -> 0x0070 }
            r3 = 2
            if (r0 == 0) goto L_0x0059
            int r0 = r0.size()     // Catch:{ all -> 0x0070 }
            if (r0 <= 0) goto L_0x0059
            r6.A01 = r3     // Catch:{ all -> 0x0070 }
        L_0x0057:
            monitor-exit(r6)
            return r3
        L_0x0059:
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r0 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0070 }
            boolean r0 = X.C154017cR.A00()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0069
            r6.A01 = r3     // Catch:{ all -> 0x0070 }
            goto L_0x006d
        L_0x0069:
            r6.A01 = r2     // Catch:{ all -> 0x0070 }
            r0 = 1
            goto L_0x006e
        L_0x006d:
            r0 = 2
        L_0x006e:
            monitor-exit(r6)
            return r0
        L_0x0070:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160637o2.A02():int");
    }

    public final synchronized int A03() {
        PackageInfo A042;
        if (this.A00 == 0 && (A042 = A04("com.google.android.gms")) != null) {
            this.A00 = A042.versionCode;
        }
        return this.A00;
    }

    public final synchronized String A05() {
        if (this.A02 == null) {
            A06();
        }
        return this.A02;
    }

    public final synchronized void A06() {
        PackageInfo A042 = A04(this.A04.getPackageName());
        if (A042 != null) {
            this.A02 = Integer.toString(A042.versionCode);
            this.A03 = A042.versionName;
        }
    }

    public final PackageInfo A04(String str) {
        try {
            return this.A04.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            Log.w("FirebaseInstanceId", AnonymousClass000.A0V("Failed to find package ", valueOf, AnonymousClass6CA.A0Y(valueOf.length() + 23)));
            return null;
        }
    }

    public C160637o2(Context context) {
        this.A04 = context;
    }

    public static String A00(C161757qO r3) {
        r3.A02();
        C152617Zo r1 = r3.A01;
        String str = r1.A04;
        if (str != null) {
            return str;
        }
        r3.A02();
        String str2 = r1.A01;
        if (str2.startsWith("1:")) {
            String[] split = str2.split(":");
            if (split.length >= 2) {
                str2 = split[1];
                if (str2.isEmpty()) {
                    return null;
                }
            }
            return null;
        }
        return str2;
    }

    public static String A01(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }
}
