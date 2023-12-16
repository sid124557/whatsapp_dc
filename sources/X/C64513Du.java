package X;

import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.3Du  reason: invalid class name and case insensitive filesystem */
public final class C64513Du implements AnonymousClass4CN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C60922zO A01;
    public final /* synthetic */ AnonymousClass4EG A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ SecretKey A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ byte[] A07;

    public void BTw(UserJid userJid) {
        String str;
        String str2;
        String str3;
        C162457s7.A0J(userJid, 0);
        C55512qT r7 = this.A01.A00;
        AnonymousClass4EG r6 = this.A02;
        boolean z = this.A05;
        boolean z2 = this.A06;
        int i = this.A00;
        r7.A03.A1O(userJid.user);
        Log.w("ExtensionsLogger/ExtensionsDataCryptoProcessor/loadGalaxyBizPublicKey()/onGetBusinessPublicKeyError()");
        if (z) {
            AnonymousClass1Uc r1 = r7.A07;
            if (z2) {
                str = "fetch_key_network_1_end";
            } else {
                str = "fetch_key_network_end";
            }
            C56672sN.A01(r1, str, i);
            if (z2) {
                str2 = "fetch_key_1_end";
            } else {
                str2 = "fetch_key_end";
            }
            C56672sN.A01(r1, str2, i);
            if (z2) {
                str3 = "encryption_1_end";
            } else {
                str3 = "encryption_end";
            }
            C56672sN.A01(r1, str3, i);
            r1.A0C(i, "extensions-public-key-error-response", (String) null);
        }
        if (r6 != null) {
            r6.BQb("extensions-public-key-error-response");
            r6.BUw(false, "extensions-public-key-error-response");
        }
        r7.A00.A0A("extensions-public-key-error-response", false, "");
    }

    public C64513Du(C60922zO r1, AnonymousClass4EG r2, String str, SecretKey secretKey, byte[] bArr, int i, boolean z, boolean z2) {
        this.A05 = z;
        this.A01 = r1;
        this.A06 = z2;
        this.A00 = i;
        this.A02 = r2;
        this.A03 = str;
        this.A04 = secretKey;
        this.A07 = bArr;
    }

    public void BTx(UserJid userJid, String str, String str2, String str3) {
        String str4;
        String str5;
        UserJid userJid2 = userJid;
        String str6 = str;
        C18260x0.A0O(userJid2, str6);
        if (this.A05) {
            AnonymousClass1Uc r3 = this.A01.A02;
            boolean z = this.A06;
            int i = this.A00;
            if (z) {
                str5 = "fetch_key_network_1_end";
            } else {
                str5 = "fetch_key_network_end";
            }
            C56672sN.A01(r3, str5, i);
        }
        C55512qT r4 = this.A01.A00;
        AnonymousClass4EG r32 = this.A02;
        String str7 = this.A03;
        SecretKey secretKey = this.A04;
        byte[] bArr = this.A07;
        boolean z2 = this.A06;
        int i2 = this.A00;
        String str8 = str2;
        if (!(str2 == null || str8.length() == 0)) {
            String str9 = str3;
            if (!(str3 == null || str9.length() == 0)) {
                if (r4.A08.A0Y(C58422vE.A02, 5994)) {
                    AnonymousClass2Y9 r9 = r4.A06;
                    C55512qT r14 = r4;
                    C47212ct r13 = new C47212ct(r14, r32, userJid2, str8, str7, secretKey, bArr, i2, z2);
                    if (r9.A00(userJid2, str8, str9)) {
                        r13.A00(true);
                        return;
                    }
                    AnonymousClass2SC r42 = r9.A01;
                    AnonymousClass3L7 r6 = new AnonymousClass3L7(r9, r13, userJid2, str8, str9);
                    Map map = r42.A04;
                    synchronized (map) {
                        List A0s = C18320x8.A0s(userJid2, map);
                        if (A0s == null) {
                            map.put(userJid2, AnonymousClass8UF.A0p(r6));
                            C130066bK r7 = new C130066bK();
                            C64093Cb r33 = new C64093Cb(r7, userJid2);
                            r42.A01.A06(r33);
                            r42.A02.A06(r33);
                            ((C66463Ln) r42.A05.getValue()).A01(C18290x4.A12(userJid2.getPrimaryDevice()));
                            r42.A03.BkM(new C71593cM((Object) r7, (Object) r42, (Object) r33, (Object) userJid2, 48));
                        } else {
                            A0s.add(r6);
                        }
                    }
                    return;
                }
                LinkedHashMap A0r = C18320x8.A0r();
                A0r.put(AnonymousClass36G.A03(userJid2), userJid2);
                Iterator A0q = AnonymousClass000.A0q(r4.A04.A0G(A0r.keySet()));
                while (A0q.hasNext()) {
                    if (AnonymousClass36G.A07(((C47932e4) AnonymousClass0x2.A0W(A0q)).A00, Base64.decode(str8, 2), Base64.decode(str9, 2))) {
                        int i3 = i2;
                        boolean z3 = z2;
                        C55512qT r92 = r4;
                        r92.A02(r32, userJid2, str8, str7, secretKey, bArr, i3, z3);
                        return;
                    }
                }
                r4.A01(r32, userJid2, i2, z2);
                return;
            }
        }
        if (r32 != null) {
            r32.BUw(false, "extensions-invalid-public-key");
        }
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            String str10 = C58152un.A0B;
            C162457s7.A0F(str10);
            Charset forName = Charset.forName(str10);
            C162457s7.A0D(forName);
            Collection<? extends Certificate> generateCertificates = instance.generateCertificates(AnonymousClass0x9.A0d(C18320x8.A1a(str6, forName)));
            C162457s7.A0H(generateCertificates);
            ArrayList A0c = C73783g4.A0c(generateCertificates);
            for (Certificate certificate : generateCertificates) {
                C162457s7.A0K(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                A0c.add(certificate);
            }
            X509Certificate[] x509CertificateArr = (X509Certificate[]) A0c.toArray(new X509Certificate[0]);
            if (!r4.A05(userJid2)) {
                C162457s7.A0J(x509CertificateArr, 0);
                TrustManagerFactory instance2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance2.init((KeyStore) null);
                TrustManager trustManager = instance2.getTrustManagers()[0];
                C162457s7.A0K(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, "RSA");
            }
            X509Certificate x509Certificate = x509CertificateArr[0];
            String A0t = C18290x4.A0t(x509Certificate.getEncoded());
            if (r4.A01.A0H() > x509Certificate.getNotAfter().getTime()) {
                Log.e("ExtensionsLogger/ExtensionsDataCryptoProcessor/loadGalaxyBizPublicKey()/onGetBusinessPublicKeySuccess() - business public key expired");
                r4.A00.A0A("extensions-expired-certificate-exception", false, "");
                if (r32 != null) {
                    r32.BQb("extensions-expired-certificate-exception");
                    return;
                }
                return;
            }
            AnonymousClass33p r0 = r4.A03;
            C18260x0.A0F(C18270x1.A03(r0), "galaxy_biz_public_key_", userJid2.user, A0t, AnonymousClass001.A0o());
            if (!r4.A05(userJid2)) {
                String name = x509Certificate.getSubjectX500Principal().getName();
                C162457s7.A0D(name);
                String A002 = C57262tM.A00(name);
                String name2 = x509CertificateArr[x509CertificateArr.length - 1].getIssuerX500Principal().getName();
                C162457s7.A0D(name2);
                String A003 = C57262tM.A00(name2);
                AnonymousClass3TK r1 = new AnonymousClass3TK(userJid2, r4.A09);
                r1.A00 = new C43602St(r4, r32, A002, A003, str7, secretKey, bArr);
                AnonymousClass31C r11 = r1.A02;
                String A032 = r11.A03();
                AnonymousClass39V[] r132 = new AnonymousClass39V[1];
                AnonymousClass39V.A0B("biz_jid", r1.A01.getRawString(), r132, 0);
                AnonymousClass36K A0I = AnonymousClass36K.A0I("business_cert_info", r132);
                AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
                AnonymousClass39V.A0E(A1W, 0);
                AnonymousClass39V.A09("xmlns", "w:biz:catalog", A1W);
                r11.A0D(r1, AnonymousClass36K.A0E(A0I, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W), A032, 338, 32000);
            }
            if (str7 != null && r32 != null && secretKey != null && bArr != null) {
                r4.A03(r32, userJid2, str7, secretKey, bArr, 1, false, false);
            }
        } catch (Exception e) {
            Log.e("ExtensionsLogger/ExtensionsDataCryptoProcessor/loadGalaxyBizPublicKey - exception in parsing public key", e);
            boolean z4 = e instanceof NoSuchAlgorithmException;
            C55682qk r2 = r4.A00;
            String A004 = C55512qT.A00(r4, e);
            if (z4) {
                str4 = "extensions-certificate-exception-no-such-algorithm";
            } else {
                str4 = "extensions-certificate-exception";
            }
            r2.A0A(str4, true, A004);
            if (r32 != null) {
                r32.BQb(str4);
            }
        }
    }
}
