package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: X.2z8  reason: invalid class name and case insensitive filesystem */
public class C60772z8 {
    public static String A03;
    public static C60772z8 A04;
    public Context A00;
    public SecretKey A01;
    public AnonymousClass36B A02 = new AnonymousClass36B();

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|(1:4)(1:5)|6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0050 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A03(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            android.content.Context r2 = r9.A00     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "VAULT"
            r0 = 0
            android.content.SharedPreferences r7 = r2.getSharedPreferences(r1, r0)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = A03     // Catch:{ all -> 0x0094 }
            r3 = 0
            java.lang.String r2 = r7.getString(r0, r3)     // Catch:{ all -> 0x0094 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = A03     // Catch:{ all -> 0x0094 }
            r1.append(r0)     // Catch:{ all -> 0x0094 }
            java.lang.String r5 = "IV"
            java.lang.String r0 = X.AnonymousClass000.A0X(r5, r1)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = r7.getString(r0, r3)     // Catch:{ all -> 0x0094 }
            r4 = 2
            if (r2 == 0) goto L_0x0048
            byte[] r8 = android.util.Base64.decode(r2, r4)     // Catch:{ all -> 0x0094 }
            byte[] r6 = android.util.Base64.decode(r0, r4)     // Catch:{ all -> 0x0094 }
            javax.crypto.Cipher r3 = X.C18320x8.A0v()     // Catch:{ all -> 0x0094 }
            javax.crypto.SecretKey r2 = r9.A01     // Catch:{ all -> 0x0094 }
            r1 = 128(0x80, float:1.794E-43)
            javax.crypto.spec.GCMParameterSpec r0 = new javax.crypto.spec.GCMParameterSpec     // Catch:{ all -> 0x0094 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0094 }
            byte[] r2 = X.C18310x6.A1Y(r2, r0, r3, r8, r4)     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "UTF-8"
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0094 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0094 }
            goto L_0x004b
        L_0x0048:
            java.lang.String r0 = "{}"
        L_0x004b:
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1G()     // Catch:{ all -> 0x0094 }
        L_0x0054:
            java.lang.String r1 = X.AnonymousClass0x9.A0y(r10, r11, r0)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "UTF-8"
            byte[] r6 = r1.getBytes(r0)     // Catch:{ all -> 0x0094 }
            javax.crypto.Cipher r2 = X.C18320x8.A0v()     // Catch:{ all -> 0x0094 }
            javax.crypto.SecretKey r1 = r9.A01     // Catch:{ all -> 0x0094 }
            r0 = 1
            r2.init(r0, r1)     // Catch:{ all -> 0x0094 }
            byte[] r3 = r2.getIV()     // Catch:{ all -> 0x0094 }
            byte[] r0 = r2.doFinal(r6)     // Catch:{ all -> 0x0094 }
            android.content.SharedPreferences$Editor r2 = r7.edit()     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = A03     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r4)     // Catch:{ all -> 0x0094 }
            X.C18270x1.A0j(r2, r1, r0)     // Catch:{ all -> 0x0094 }
            android.content.SharedPreferences$Editor r2 = r7.edit()     // Catch:{ all -> 0x0094 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = A03     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r5, r1)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = android.util.Base64.encodeToString(r3, r4)     // Catch:{ all -> 0x0094 }
            X.C18270x1.A0j(r2, r1, r0)     // Catch:{ all -> 0x0094 }
            monitor-exit(r9)
            return
        L_0x0094:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60772z8.A03(java.lang.String, java.lang.String):void");
    }

    public static C60772z8 A00(Context context, String str) {
        C60772z8 r3 = A04;
        if (!AnonymousClass000.A1X(r3) && !(true ^ str.equals(A03))) {
            return r3;
        }
        C60772z8 r32 = new C60772z8(context, str);
        A04 = r32;
        return r32;
    }

    public String A01(String str) {
        try {
            SharedPreferences sharedPreferences = this.A00.getSharedPreferences("VAULT", 0);
            String string = sharedPreferences.getString(A03, (String) null);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(A03);
            String string2 = sharedPreferences.getString(AnonymousClass000.A0X("IV", A0o), (String) null);
            if (string != null) {
                byte[] decode = Base64.decode(string, 2);
                byte[] decode2 = Base64.decode(string2, 2);
                return AnonymousClass0x7.A12(DefaultCrypto.UTF_8, C18310x6.A1Y(this.A01, new GCMParameterSpec(128, decode2), C18320x8.A0v(), decode, 2)).optString(str, "");
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public C60772z8(Context context, String str) {
        A03 = str;
        this.A00 = context;
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            this.A01 = (SecretKey) instance.getKey(AnonymousClass000.A0X("-NPCI-Vault", AnonymousClass000.A0l(str)), (char[]) null);
            Cipher.getInstance("AES/GCM/NoPadding").init(1, this.A01);
        } catch (InvalidKeyException unused) {
            A02();
        }
    }

    public void A02() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(A03);
        this.A01 = AnonymousClass36B.A03(AnonymousClass000.A0X("-NPCI-Vault", A0o));
        Cipher A0v = C18320x8.A0v();
        A0v.init(1, this.A01);
        byte[] iv = A0v.getIV();
        byte[] doFinal = A0v.doFinal("{}".getBytes(DefaultCrypto.UTF_8));
        SharedPreferences sharedPreferences = this.A00.getSharedPreferences("VAULT", 0);
        C18270x1.A0j(sharedPreferences.edit(), A03, Base64.encodeToString(doFinal, 2));
        SharedPreferences.Editor edit = sharedPreferences.edit();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append(A03);
        C18270x1.A0j(edit, AnonymousClass000.A0X("IV", A0o2), Base64.encodeToString(iv, 2));
    }
}
