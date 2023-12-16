package X;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;

/* renamed from: X.9Sc  reason: invalid class name and case insensitive filesystem */
public class C194239Sc {
    public KeyStore A00;
    public final C160757oG A01;
    public final C193189Nm A02;

    public final void A00(Context context, String str) {
        try {
            this.A01.A09("onboarding", "generate rsa key pairs for", new AnonymousClass7I3[]{new AnonymousClass7I3("alias", str)});
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(2, 1);
            KeyPairGeneratorSpec A04 = C1899693i.A04(new KeyPairGeneratorSpec.Builder(context).setAlias(str), AnonymousClass000.A0V("CN=", str, AnonymousClass001.A0o()), instance, instance2);
            KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            instance3.initialize(A04);
            instance3.generateKeyPair();
        } catch (Exception e) {
            this.A01.A08("onboarding", (String) null, e);
            throw new RuntimeException(e);
        }
    }

    public final void A01(String str, String str2) {
        String str3;
        C160757oG r6 = this.A01;
        r6.A09("onboarding", "generate and store aes key", new AnonymousClass7I3[]{new AnonymousClass7I3("alias", str2)});
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        try {
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) this.A00.getEntry(str2, (KeyStore.ProtectionParameter) null);
            if (Build.VERSION.SDK_INT >= 23) {
                str3 = "RSA/ECB/OAEPPadding";
            } else {
                str3 = "RSA/ECB/PKCS1Padding";
            }
            Cipher instance = Cipher.getInstance(str3);
            instance.init(1, privateKeyEntry.getCertificate().getPublicKey());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, instance);
            cipherOutputStream.write(bArr);
            cipherOutputStream.close();
            C18270x1.A0j(this.A02.A00.edit(), str, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        } catch (Exception e) {
            r6.A08("onboarding", (String) null, e);
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0081, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        r8.A01.A08("onboarding", (java.lang.String) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
        throw new java.lang.RuntimeException(r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C194239Sc(android.content.Context r9, X.C56612sH r10, X.C60152y5 r11) {
        /*
            r8 = this;
            r8.<init>()
            java.lang.String r1 = "IN"
            java.lang.String r0 = "CLKeyStorageManager"
            java.lang.String r4 = "onboarding"
            X.7oG r3 = X.C160757oG.A00(r0, r4, r1)
            r8.A01 = r3
            X.9Nm r0 = new X.9Nm
            r0.<init>(r11)
            r8.A02 = r0
            X.33l r0 = new X.33l
            r0.<init>(r10, r11)
            android.content.SharedPreferences r2 = r0.A03()
            java.lang.String r0 = "psp_test_tool_enabled"
            r1 = 0
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 != 0) goto L_0x008d
            r5 = 0
            java.lang.String r0 = "initializing KS"
            r3.A06(r0)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ Exception -> 0x0081 }
            r8.A00 = r0     // Catch:{ Exception -> 0x0081 }
            r0.load(r5)     // Catch:{ Exception -> 0x0081 }
            r7 = r8
            monitor-enter(r7)     // Catch:{ Exception -> 0x0081 }
            X.9Nm r0 = r8.A02     // Catch:{ all -> 0x007e }
            java.lang.String r6 = "use_ks"
            android.content.SharedPreferences r3 = r0.A00     // Catch:{ all -> 0x007e }
            boolean r0 = r3.getBoolean(r6, r1)     // Catch:{ all -> 0x007e }
            if (r0 != 0) goto L_0x007c
            java.security.KeyStore r0 = r8.A00     // Catch:{ Exception -> 0x0069 }
            r0.load(r5)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r2 = "k0"
            r8.A00(r9, r2)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r1 = "token"
            r8.A00(r9, r1)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r0 = "aes_k0"
            r8.A01(r0, r2)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r0 = "aes_token"
            r8.A01(r0, r1)     // Catch:{ Exception -> 0x0069 }
            r1 = 1
            android.content.SharedPreferences$Editor r0 = r3.edit()     // Catch:{ Exception -> 0x0069 }
            X.C18270x1.A0l(r0, r6, r1)     // Catch:{ Exception -> 0x0069 }
            goto L_0x007c
        L_0x0069:
            r3 = move-exception
            X.7oG r2 = r8.A01     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x007e }
            java.lang.String r0 = " Skip Android KeyStore setup because: "
            X.C18270x1.A1H(r1, r0, r3)     // Catch:{ all -> 0x007e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x007e }
            r2.A08(r4, r0, r3)     // Catch:{ all -> 0x007e }
        L_0x007c:
            monitor-exit(r7)     // Catch:{ Exception -> 0x0081 }
            return
        L_0x007e:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ Exception -> 0x0081 }
            throw r0     // Catch:{ Exception -> 0x0081 }
        L_0x0081:
            r1 = move-exception
            X.7oG r0 = r8.A01
            r0.A08(r4, r5, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194239Sc.<init>(android.content.Context, X.2sH, X.2y5):void");
    }
}
