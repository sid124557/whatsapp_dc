package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.33K  reason: invalid class name */
public class AnonymousClass33K {
    public final C56492s4 A00;
    public final AnonymousClass3FI A01;

    public AnonymousClass4GL A01(C55132pq r5, String str, String str2) {
        try {
            try {
                URLConnection openConnection = C18330xA.A0B(Uri.parse(str).toString()).openConnection();
                if (openConnection instanceof HttpsURLConnection) {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setSSLSocketFactory(r5.A02());
                    C18270x1.A1J(httpsURLConnection);
                    if (str2 != null) {
                        httpsURLConnection.addRequestProperty("If-None-Match", str2);
                    }
                    C18280x3.A0z(this.A01, httpsURLConnection);
                    return new AnonymousClass3PZ((Boolean) null, httpsURLConnection);
                }
                throw AnonymousClass002.A0C("WaHttpUrlConnectionClient/createDownloadableFilesConnection/failed to open http url connection");
            } catch (IOException e) {
                throw new IOException("WaHttpUrlConnectionClient/createDownloadableFilesConnection/failed to open http url connection", e);
            }
        } catch (MalformedURLException e2) {
            Log.e("WaHttpUrlConnectionClient/createDownloadableFilesConnection/malformed-url : ", e2);
            throw e2;
        }
    }

    public final AnonymousClass4GL A02(Integer num, String str, String str2, String str3, Map map, boolean z, boolean z2, boolean z3) {
        GZIPOutputStream gZIPOutputStream;
        HttpURLConnection httpURLConnection = (HttpURLConnection) C18300x5.A0q(str);
        C18270x1.A1J(httpURLConnection);
        if (str3 == null) {
            str3 = this.A01.A00();
        }
        httpURLConnection.setRequestProperty("User-Agent", str3);
        if (z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        }
        if (str2 != null) {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            if (z2) {
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
        } else if (z3) {
            httpURLConnection.setRequestMethod("DELETE");
        }
        if (map != null) {
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                httpURLConnection.setRequestProperty(C18310x6.A0q(A0w), AnonymousClass0x9.A12(A0w));
            }
        }
        if (str2 != null) {
            AnonymousClass203 A002 = AnonymousClass203.A00(this.A00, (Integer) null, num, httpURLConnection);
            if (z2) {
                try {
                    gZIPOutputStream = new GZIPOutputStream(A002);
                    AnonymousClass0x7.A1C(gZIPOutputStream, str2, C58152un.A0B);
                    gZIPOutputStream.close();
                } catch (Throwable th) {
                    try {
                        A002.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                AnonymousClass0x7.A1C(A002, str2, C58152un.A0B);
            }
            A002.close();
        }
        httpURLConnection.connect();
        return new AnonymousClass3PZ((Boolean) null, httpURLConnection);
        throw th;
    }

    public AnonymousClass33K(C56492s4 r1, AnonymousClass3FI r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public AnonymousClass4GL A00(C55132pq r2, String str, String str2) {
        return A01(r2, str, str2);
    }

    public AnonymousClass4GL A03(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) C18300x5.A0q(str);
        C18270x1.A1J(httpURLConnection);
        httpURLConnection.connect();
        return new AnonymousClass3PZ((Boolean) null, httpURLConnection);
    }

    public AnonymousClass4GL A04(String str) {
        return A02(C18290x4.A0c(), str, (String) null, (String) null, (Map) null, false, false, false);
    }

    public AnonymousClass33K() {
    }
}
