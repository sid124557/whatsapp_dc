package X;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.msys.mci.DefaultCrypto;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.sql.Date;
import org.json.JSONObject;

/* renamed from: X.0zK  reason: invalid class name and case insensitive filesystem */
public class C19350zK extends C009707r {
    public Context A00;
    public String A01 = "";
    public JSONObject A02;
    public AnonymousClass36B A03;
    public C48812fW A04;
    public C60772z8 A05;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006f, code lost:
        if (r0 != null) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0C() {
        /*
            java.lang.String r1 = android.os.Build.TAGS
            if (r1 == 0) goto L_0x0023
            java.lang.String r0 = "test-keys"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0023
        L_0x000d:
            r0 = 1
        L_0x000e:
            r4 = 1
            r3 = r0 ^ 1
            boolean r0 = A0L()
            r3 = r3 & r0
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r0 = 23
            boolean r0 = X.C18280x3.A1U(r2, r0)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0079
            return r4
        L_0x0023:
            java.lang.String r0 = "/system/app/Superuser.apk"
            java.lang.String r1 = "/sbin/su"
            java.lang.String r2 = "/system/bin/su"
            java.lang.String r3 = "/system/xbin/su"
            java.lang.String r4 = "/data/local/xbin/su"
            java.lang.String r5 = "/data/local/bin/su"
            java.lang.String r6 = "/system/sd/xbin/su"
            java.lang.String r7 = "/system/bin/failsafe/su"
            java.lang.String r8 = "/data/local/su"
            java.lang.String r9 = "/su/bin/su"
            java.lang.String[] r2 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            r1 = 0
        L_0x003c:
            r0 = r2[r1]
            java.io.File r0 = X.AnonymousClass002.A0B(r0)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x000d
            int r1 = r1 + 1
            r0 = 10
            if (r1 < r0) goto L_0x003c
            r3 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "/system/xbin/which"
            java.lang.String r0 = "su"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}     // Catch:{ all -> 0x0072 }
            java.lang.Process r3 = r2.exec(r0)     // Catch:{ all -> 0x0072 }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ all -> 0x0072 }
            java.io.BufferedReader r0 = X.C18310x6.A0Z(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = r0.readLine()     // Catch:{ all -> 0x0072 }
            r3.destroy()
            if (r0 == 0) goto L_0x0077
            goto L_0x000d
        L_0x0072:
            if (r3 == 0) goto L_0x0077
            r3.destroy()
        L_0x0077:
            r0 = 0
            goto L_0x000e
        L_0x0079:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19350zK.A0C():boolean");
    }

    public static boolean A0L() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            instance.initialize(new KeyGenParameterSpec.Builder("demo_key", 1).build());
            PrivateKey privateKey = instance.generateKeyPair().getPrivate();
            return ((KeyInfo) KeyFactory.getInstance(privateKey.getAlgorithm(), "AndroidKeyStore").getKeySpec(privateKey, KeyInfo.class)).isInsideSecureHardware();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void A5q(String str) {
        String A012 = this.A05.A01("ServerRiskParams");
        String A013 = this.A05.A01("ClientRiskRules");
        if (A012.equals("")) {
            this.A05.A03(str, "ServerRiskParams");
            if (A013.equals("")) {
                this.A05.A03("{\"ATC\":\"0\",\"OTC\":\"0\",\"COTA\":\"0\"}", "ClientRiskRules");
            }
        } else if (A5p(A012).booleanValue()) {
            Date date = new Date(Long.parseLong(AnonymousClass0x7.A12(DefaultCrypto.UTF_8, Base64.decode(AnonymousClass0x9.A1H(A012).getString("riskRules"), 2)).getString("timestamp")));
            JSONObject A12 = AnonymousClass0x7.A12(DefaultCrypto.UTF_8, AnonymousClass0x9.A1S("riskRules", AnonymousClass0x9.A1H(str), 2));
            this.A02 = A12;
            if (new Date(Long.parseLong(A12.getString("timestamp"))).after(date)) {
                this.A05.A03(str, "ServerRiskParams");
                if (A013.equals("")) {
                    A013 = "{\"ATC\":\"0\",\"OTC\":\"0\",\"COTA\":\"0\"}";
                }
                JSONObject A1H = AnonymousClass0x9.A1H(A013);
                A1H.put("OTC", "0");
                this.A05.A03(AnonymousClass0x9.A0y("0", "COTA", A1H), "ClientRiskRules");
            } else {
                throw new Exception("Could not update State");
            }
        } else {
            throw new Exception("Could not update State");
        }
        this.A05.A03("", "PendingTxn");
    }

    public C19350zK(Context context) {
        this.A00 = context;
        this.A04 = new C48812fW(context);
        this.A03 = new AnonymousClass36B();
    }

    public final Boolean A5p(String str) {
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(str);
            String string = A1H.getString("riskRules");
            String string2 = A1H.getString(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
            PublicKey publicKey = C154497dG.A00(new String(AnonymousClass0x7.A1X("c2lnbmVyLmNydA=="))).getPublicKey();
            byte[] bytes = string.getBytes("UTF8");
            byte[] A1X = AnonymousClass0x7.A1X(string2);
            Signature instance = Signature.getInstance("SHA512withRSA/PSS");
            instance.initVerify(publicKey);
            instance.update(bytes);
            return Boolean.valueOf(instance.verify(A1X));
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public boolean A5r(String str, String str2, String str3) {
        String A0t = C18290x4.A0t(AnonymousClass36B.A04(C18260x0.A06(str2, str, str3)));
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            instance.deleteEntry(A0t);
            C60772z8 A002 = C60772z8.A00(this.A00, A0t);
            this.A05 = A002;
            A002.A02();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
