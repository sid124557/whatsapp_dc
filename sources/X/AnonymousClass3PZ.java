package X;

import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: X.3PZ  reason: invalid class name */
public class AnonymousClass3PZ implements AnonymousClass4GL {
    public final Boolean A00;
    public final HttpURLConnection A01;

    public AnonymousClass3PZ(HttpURLConnection httpURLConnection) {
        this((Boolean) null, httpURLConnection);
    }

    public int Az6() {
        return this.A01.getResponseCode();
    }

    public InputStream B46(C56492s4 r3, Integer num, Integer num2) {
        return new C36851zz(r3, this.A01.getErrorStream(), num, num2);
    }

    public InputStream B47(C56492s4 r2, Integer num, Integer num2) {
        return C36851zz.A00(r2, num, num2, this.A01);
    }

    public String BFZ(String str) {
        return this.A01.getHeaderField(str);
    }

    public void close() {
        this.A01.disconnect();
    }

    public AnonymousClass3PZ(Boolean bool, HttpURLConnection httpURLConnection) {
        this.A01 = httpURLConnection;
        this.A00 = bool;
    }
}
