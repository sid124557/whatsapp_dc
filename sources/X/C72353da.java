package X;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* renamed from: X.3da  reason: invalid class name and case insensitive filesystem */
public final class C72353da implements HostnameVerifier {
    public final String A00;
    public final HostnameVerifier A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C72353da.class == obj.getClass()) {
            C72353da r4 = (C72353da) obj;
            if (this.A00.equals(r4.A00)) {
                return this.A01.equals(r4.A01);
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18310x6.A09(this.A00));
    }

    public boolean verify(String str, SSLSession sSLSession) {
        return this.A01.verify(this.A00, sSLSession);
    }

    public C72353da(String str, HostnameVerifier hostnameVerifier) {
        this.A00 = str;
        this.A01 = hostnameVerifier;
    }

    public static void A00(String str, HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setHostnameVerifier(new C72353da(str, HttpsURLConnection.getDefaultHostnameVerifier()));
    }
}
