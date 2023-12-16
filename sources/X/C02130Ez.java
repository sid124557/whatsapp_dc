package X;

import java.util.List;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.0Ez  reason: invalid class name and case insensitive filesystem */
public class C02130Ez extends AnonymousClass3PZ implements C17390vS {
    public final HttpsURLConnection A00;

    public String B5t() {
        return C624535b.A00(this.A00.getInputStream());
    }

    public String B7O() {
        return C624535b.A00(this.A00.getErrorStream());
    }

    public String BCG() {
        return this.A01.getResponseMessage();
    }

    public List BFa(String str) {
        return this.A01.getHeaderFields().get(str);
    }

    public C02130Ez(HttpsURLConnection httpsURLConnection) {
        super(httpsURLConnection);
        this.A00 = httpsURLConnection;
    }
}
