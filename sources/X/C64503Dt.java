package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.3Dt  reason: invalid class name and case insensitive filesystem */
public class C64503Dt implements AnonymousClass4CN {
    public final /* synthetic */ C56192ra A00;
    public final /* synthetic */ C108985dt A01;

    public C64503Dt(C56192ra r1, C108985dt r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BTx(UserJid userJid, String str, String str2, String str3) {
        String str4;
        Log.i("DirectConnectionManager/onGetBusinessPublicKeySuccess");
        try {
            X509Certificate[] x509CertificateArr = (X509Certificate[]) AnonymousClass0x7.A0v(str, C58152un.A0B, CertificateFactory.getInstance("X.509")).toArray(new X509Certificate[0]);
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            ((X509TrustManager) instance.getTrustManagers()[0]).checkServerTrusted(x509CertificateArr, "RSA");
            String A0t = C18290x4.A0t(x509CertificateArr[0].getEncoded());
            C56192ra r4 = this.A00;
            AnonymousClass33p r0 = r4.A0A;
            C18260x0.A0F(C18270x1.A03(r0), "smb_business_direct_connection_public_key_", userJid.getRawString(), A0t, AnonymousClass001.A0o());
            r4.A03(this.A01, userJid);
        } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e) {
            Log.e("DirectConnectionManager/generateEncryptionStringFromSignedInfo/", e);
            C56192ra r42 = this.A00;
            r42.A04(userJid);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Business JID: ");
            C18280x3.A0u(userJid, A0o);
            String A0P = AnonymousClass000.A0P(e, "\nException: ", A0o);
            boolean z = e instanceof NoSuchAlgorithmException;
            C55682qk r1 = r42.A04;
            if (z) {
                str4 = "direct-connection-certificate-exception-no-such-algorithm";
            } else {
                str4 = "direct-connection-certificate-exception";
            }
            r1.A0A(str4, true, A0P);
        }
    }

    public void BTw(UserJid userJid) {
        String A03 = C18260x0.A03(userJid, "Business JID: ", AnonymousClass001.A0o());
        C56192ra r2 = this.A00;
        r2.A0A.A1N(userJid.getRawString());
        r2.A04(userJid);
        r2.A04.A0A("direct-connection-public-key-error-response", false, A03);
    }
}
