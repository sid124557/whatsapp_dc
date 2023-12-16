package X;

import android.net.TrafficStats;
import android.text.TextUtils;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* renamed from: X.2xN  reason: invalid class name and case insensitive filesystem */
public class C59722xN {
    public final C56492s4 A00;
    public final C29441ip A01;
    public final C56612sH A02;
    public final C133616hf A03;
    public final C55132pq A04;
    public final AnonymousClass3FI A05;
    public final AnonymousClass4FS A06;

    public C156437gc A01(AnonymousClass8E7 r19, String str, String str2, String str3, JSONObject jSONObject, int i, int i2) {
        InputStream inflaterInputStream;
        if (!this.A01.A0F()) {
            return new C156437gc(-1, 2);
        }
        TrafficStats.setThreadStatsTag(i);
        String str4 = str;
        URL A002 = A00(str2, str3, str4);
        URLConnection openConnection = A002.openConnection();
        if (openConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setSSLSocketFactory(this.A04.A00());
            httpsURLConnection.setRequestMethod("POST");
            C18270x1.A1J(httpsURLConnection);
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setRequestProperty("Content-Type", "application/json");
            httpsURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            httpsURLConnection.setRequestProperty("User-Agent", this.A05.A02());
            C56492s4 r8 = this.A00;
            Integer valueOf = Integer.valueOf(i2);
            JSONObject jSONObject2 = null;
            AnonymousClass203 A003 = AnonymousClass203.A00(r8, (Integer) null, valueOf, httpsURLConnection);
            String obj = jSONObject.toString();
            if (TextUtils.isEmpty(obj)) {
                return new C156437gc(3, 1);
            }
            AnonymousClass0x7.A1C(A003, obj, C58152un.A0B);
            A003.flush();
            long currentTimeMillis = System.currentTimeMillis();
            httpsURLConnection.connect();
            int responseCode = httpsURLConnection.getResponseCode();
            httpsURLConnection.getResponseMessage();
            r19.A0J(Integer.valueOf(responseCode), C18310x6.A0f(System.currentTimeMillis(), currentTimeMillis), (String) null, (String) null, "HttpsUrlConnection", str4);
            if (responseCode / 100 == 2) {
                String contentEncoding = httpsURLConnection.getContentEncoding();
                InputStream A004 = C36851zz.A00(r8, (Integer) null, valueOf, httpsURLConnection);
                if ("gzip".equalsIgnoreCase(contentEncoding)) {
                    inflaterInputStream = new GZIPInputStream(A004);
                } else {
                    if ("deflate".equalsIgnoreCase(contentEncoding)) {
                        inflaterInputStream = new InflaterInputStream(A004);
                    }
                    jSONObject2 = C624535b.A02(A004);
                }
                A004 = inflaterInputStream;
                jSONObject2 = C624535b.A02(A004);
            }
            httpsURLConnection.disconnect();
            return new C156437gc(jSONObject2, responseCode);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C18270x1.A1H(A0o, "Failed to create a HTTPS connection with ", A002);
        throw AnonymousClass002.A0C(A0o.toString());
    }

    public static final URL A00(String str, String str2, String str3) {
        if (!str.startsWith("https://")) {
            str = AnonymousClass000.A0T("https://", str);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass001.A1K(str, str2, str3, A0o);
        A0o.append("?");
        A0o.append("access_token");
        A0o.append("=");
        A0o.append(C58172up.A0B);
        A0o.append("|");
        return C18330xA.A0B(AnonymousClass000.A0X(C58172up.A0P, A0o));
    }

    public C59722xN(C56492s4 r1, C29441ip r2, C56612sH r3, C133616hf r4, C55132pq r5, AnonymousClass3FI r6, AnonymousClass4FS r7) {
        this.A02 = r3;
        this.A06 = r7;
        this.A05 = r6;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
    }
}
