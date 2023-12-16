package X;

import android.os.Process;
import android.os.UserManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.2yD  reason: invalid class name and case insensitive filesystem */
public class C60232yD {
    public Boolean A00;
    public final C66663Mh A01;
    public final C620633i A02;
    public final C54292oU A03;
    public final AnonymousClass33p A04;
    public final C45472a4 A05;
    public final C187958y5 A06;

    public boolean A01() {
        boolean booleanValue;
        C66663Mh r1 = this.A01;
        boolean z = true;
        if (!r1.A08(C66663Mh.A0L)) {
            z = false;
        }
        boolean A08 = r1.A08(C66663Mh.A0K);
        synchronized (this) {
            Boolean bool = this.A00;
            if (bool == null) {
                C620633i r2 = this.A02;
                UserManager userManager = r2.A0F;
                if (userManager == null) {
                    userManager = (UserManager) C620633i.A03(r2, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                    r2.A0F = userManager;
                }
                boolean z2 = true;
                if (userManager != null) {
                    try {
                        if (userManager.getSerialNumberForUser(Process.myUserHandle()) != 0) {
                            z2 = false;
                        }
                    } catch (Exception e) {
                        Log.e("FbnsTokenManager/isAdminUser", e);
                    }
                }
                bool = Boolean.valueOf(z2);
                this.A00 = bool;
            }
            booleanValue = bool.booleanValue();
        }
        if (!z) {
            return false;
        }
        if (!A08 || booleanValue) {
            return true;
        }
        return false;
    }

    public C60232yD(C66663Mh r1, C620633i r2, C54292oU r3, AnonymousClass33p r4, C45472a4 r5, C187958y5 r6) {
        this.A03 = r3;
        this.A01 = r1;
        this.A06 = r6;
        this.A02 = r2;
        this.A05 = r5;
        this.A04 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r3 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b5, code lost:
        if ((r2.getCause() instanceof android.os.DeadObjectException) == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bd, code lost:
        if (android.os.Build.VERSION.SDK_INT < 26) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c2, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (232614005 != r3) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = r7.A01()
            if (r0 == 0) goto L_0x0092
            X.33p r4 = r7.A04
            X.8qC r3 = r4.A01
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r3)
            java.lang.String r0 = "fbns_token"
            java.lang.String r2 = X.C18280x3.A0Z(r1, r0)
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r3)
            java.lang.String r0 = "fbns_app_vers"
            int r3 = X.C18280x3.A02(r1, r0)
            r1 = 232614005(0xddd6875, float:1.3645324E-30)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0030
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto L_0x0030
            r2 = 0
            if (r1 == r3) goto L_0x0031
        L_0x0030:
            r2 = 1
        L_0x0031:
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r4)
            java.lang.String r0 = "last_server_fbns_token"
            X.C18270x1.A0j(r1, r0, r8)
            if (r2 == 0) goto L_0x00c3
            X.2oU r0 = r7.A03
            android.content.Context r4 = r0.A00
            java.lang.String r6 = X.C58172up.A0B
            java.util.List r5 = X.AnonymousClass78J.A00
            java.util.Iterator r1 = r5.iterator()
        L_0x0048:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.String r3 = X.AnonymousClass001.A0m(r1)
            boolean r0 = X.C56992st.A01(r4, r3)
            if (r0 == 0) goto L_0x0048
            r2 = 1
            if (r3 != 0) goto L_0x005c
        L_0x005b:
            r2 = 0
        L_0x005c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FbnsTokenManager/requestFbnsToken fbns-enabled:"
            X.C18260x0.A1E(r0, r1, r2)
            if (r2 == 0) goto L_0x0092
            if (r3 == 0) goto L_0x0092
            java.lang.String r0 = "com.facebook.rti.fbns.intent.REGISTER"
            android.content.Intent r2 = X.AnonymousClass0x9.A09(r0)
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "pkg_name"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "appid"
            r2.putExtra(r0, r6)
            boolean r0 = r5.contains(r3)
            if (r0 != 0) goto L_0x0093
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FBNSPreloadIPC/Unknown package "
            X.C18260x0.A0r(r0, r3, r1)
        L_0x008d:
            java.lang.String r0 = "FBNSPreloadClient/register failed"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0092:
            return
        L_0x0093:
            java.lang.String r0 = "com.oculus.horizon"
            boolean r0 = r3.equals(r0)     // Catch:{ IllegalStateException -> 0x00b8, SecurityException -> 0x008d, RuntimeException -> 0x00ae }
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = "com.oculus.horizon.push.HorizonFbnsService"
        L_0x009d:
            X.C18320x8.A10(r2, r3, r0)     // Catch:{ IllegalStateException -> 0x00b8, SecurityException -> 0x008d, RuntimeException -> 0x00ae }
            X.C56992st.A00(r4, r2)     // Catch:{ IllegalStateException -> 0x00b8, SecurityException -> 0x008d, RuntimeException -> 0x00ae }
            android.content.ComponentName r0 = r4.startService(r2)     // Catch:{ IllegalStateException -> 0x00b8, SecurityException -> 0x008d, RuntimeException -> 0x00ae }
            goto L_0x00ab
        L_0x00a8:
            java.lang.String r0 = "com.facebook.oxygen.services.fbns.PreloadedFbnsService"
            goto L_0x009d
        L_0x00ab:
            if (r0 != 0) goto L_0x0092
            goto L_0x008d
        L_0x00ae:
            r2 = move-exception
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x00c2
            goto L_0x008d
        L_0x00b8:
            r2 = move-exception
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x00c2
            goto L_0x008d
        L_0x00c0:
            r3 = 0
            goto L_0x005b
        L_0x00c2:
            throw r2
        L_0x00c3:
            java.lang.String r0 = "FbnsTokenManager/verifyFbnsToken no-need-to-refresh"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60232yD.A00(java.lang.String):void");
    }
}
