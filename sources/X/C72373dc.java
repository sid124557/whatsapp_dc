package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.3dc  reason: invalid class name and case insensitive filesystem */
public class C72373dc implements X509TrustManager {
    public final /* synthetic */ C32541r6 A00;

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (x509CertificateArr.length >= 1) {
            try {
                if (C18270x1.A0V(AnonymousClass0x7.A0t(), x509CertificateArr[0].getEncoded()).equals(this.A00.A00.A02)) {
                    Log.d("fpm/HashCheckingSSLSocketFactory/certificate hash matching");
                } else {
                    Log.e("fpm/HashCheckingSSLSocketFactory/certificate hash not matching");
                    throw new CertificateException("Certificate is not valid");
                }
            } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
                Log.e("fpm/HashCheckingSSLSocketFactory/failed to encode certificate", e);
                throw new CertificateException("Failed to encode certificate");
            }
        } else {
            throw new CertificateException("Chain have to have at least 1 certificate");
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }

    public C72373dc(C32541r6 r1) {
        this.A00 = r1;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Trust manager should not be used to checkClientTrusted");
    }
}
