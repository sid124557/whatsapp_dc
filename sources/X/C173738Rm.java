package X;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8Rm  reason: invalid class name and case insensitive filesystem */
public final class C173738Rm extends Thread {
    public final /* synthetic */ Map A00;

    public C173738Rm(Map map) {
        this.A00 = map;
    }

    public final void run() {
        HttpURLConnection httpURLConnection;
        Map map = this.A00;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        Iterator A0i = C18280x3.A0i(map);
        while (A0i.hasNext()) {
            String A0m = AnonymousClass001.A0m(A0i);
            buildUpon.appendQueryParameter(A0m, C18310x6.A0o(A0m, map));
        }
        String obj = buildUpon.build().toString();
        try {
            httpURLConnection = (HttpURLConnection) new URL(obj).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder A0Y = AnonymousClass6CA.A0Y(AnonymousClass6C7.A06(obj) + 65);
                A0Y.append("Received non-success response code ");
                A0Y.append(responseCode);
                AnonymousClass6C7.A1F(" from pinging URL: ", obj, "HttpUrlPinger", A0Y);
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            StringBuilder A0q = AnonymousClass6C7.A0q(message, AnonymousClass6C7.A06(obj) + 32);
            C18260x0.A0p("Error while parsing ping URL: ", obj, ". ", message, A0q);
            Log.w("HttpUrlPinger", A0q.toString(), e);
        } catch (IOException | RuntimeException e2) {
            String message2 = e2.getMessage();
            StringBuilder A0q2 = AnonymousClass6C7.A0q(message2, AnonymousClass6C7.A06(obj) + 27);
            C18260x0.A0p("Error while pinging URL: ", obj, ". ", message2, A0q2);
            Log.w("HttpUrlPinger", A0q2.toString(), e2);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
