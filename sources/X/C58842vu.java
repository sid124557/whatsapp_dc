package X;

import android.util.Base64;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.2vu  reason: invalid class name and case insensitive filesystem */
public class C58842vu {
    public final int A00;
    public final long A01;
    public final Integer A02;
    public final String A03;
    public final X509Certificate A04;
    public final X509Certificate A05;

    public C58842vu(String str) {
        JSONObject A1H = AnonymousClass0x9.A1H(str);
        byte[] decode = Base64.decode(A1H.getString("e_cert"), 3);
        byte[] A1S = AnonymousClass0x9.A1S("s_cert", A1H, 3);
        CertificateFactory instance = CertificateFactory.getInstance("X.509");
        this.A04 = (X509Certificate) instance.generateCertificate(AnonymousClass0x9.A0d(decode));
        this.A05 = (X509Certificate) instance.generateCertificate(AnonymousClass0x9.A0d(A1S));
        this.A00 = A1H.optInt("ttl");
        this.A01 = A1H.optLong("ts");
        this.A03 = A1H.optString("ppk");
        this.A02 = Integer.valueOf(A1H.optInt("ppk_id"));
    }

    public C58842vu(Integer num, String str, X509Certificate x509Certificate, X509Certificate x509Certificate2, int i, long j) {
        this.A04 = x509Certificate;
        this.A05 = x509Certificate2;
        this.A00 = i;
        this.A01 = j;
        this.A03 = str;
        this.A02 = num;
    }
}
