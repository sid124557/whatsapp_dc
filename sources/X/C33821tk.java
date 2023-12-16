package X;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.R;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.1tk  reason: invalid class name and case insensitive filesystem */
public class C33821tk extends AnonymousClass5ZM {
    public WeakReference A00;
    public final C69263Wi A01;
    public final C56492s4 A02;
    public final AnonymousClass4FV A03;
    public final C104965Ta A04 = new C104965Ta();
    public final File A05;

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        if (r2 == null) goto L_0x00f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r11) {
        /*
            r10 = this;
            java.lang.String r8 = "\r\n"
            java.lang.String r5 = "*****"
            java.io.File r6 = r10.A05
            boolean r0 = r6.exists()
            r4 = 0
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "GoogleReverseImageSearchAsyncTask/doInBackground invalid file to search"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r4
        L_0x0013:
            X.5Ta r3 = r10.A04
            r3.A02()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r5)     // Catch:{ IOException | URISyntaxException -> 0x00ec, all -> 0x00ea }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | URISyntaxException -> 0x00ec, all -> 0x00ea }
            r2.append(r0)     // Catch:{ IOException | URISyntaxException -> 0x00ec, all -> 0x00ea }
            java.lang.String r7 = X.AnonymousClass000.A0X(r5, r2)     // Catch:{ IOException | URISyntaxException -> 0x00ec, all -> 0x00ea }
            java.lang.String r0 = "https://images.google.com/searchbyimage/upload"
            java.net.URLConnection r2 = X.C18300x5.A0q(r0)     // Catch:{ IOException | URISyntaxException -> 0x00ec, all -> 0x00ea }
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ IOException | URISyntaxException -> 0x00ec, all -> 0x00ea }
            r9 = 1
            r2.setDoInput(r9)     // Catch:{ IOException -> 0x00e8, URISyntaxException -> 0x00e6 }
            r0 = 0
            r2.setDoOutput(r0)     // Catch:{ IOException -> 0x00e8, URISyntaxException -> 0x00e6 }
            r2.setUseCaches(r0)     // Catch:{ IOException -> 0x00e8, URISyntaxException -> 0x00e6 }
            X.C18270x1.A1J(r2)     // Catch:{ IOException -> 0x00e8, URISyntaxException -> 0x00e6 }
            java.lang.String r0 = "POST"
            r2.setRequestMethod(r0)     // Catch:{ IOException -> 0x00e8, URISyntaxException -> 0x00e6 }
            java.lang.String r1 = "Connection"
            java.lang.String r0 = "Keep-Alive"
            r2.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x00e8, URISyntaxException -> 0x00e6 }
            java.lang.String r1 = "Cache-Control"
            java.lang.String r0 = "no-cache"
            r2.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x00e8, URISyntaxException -> 0x00e6 }
            java.lang.String r5 = "Content-Type"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x00e8, URISyntaxException -> 0x00e6 }
            java.lang.String r0 = "multipart/form-data; boundary="
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r7, r1)     // Catch:{ IOException -> 0x00e8, URISyntaxException -> 0x00e6 }
            r2.setRequestProperty(r5, r0)     // Catch:{ IOException -> 0x00e8, URISyntaxException -> 0x00e6 }
            X.2s4 r1 = r10.A02     // Catch:{ IOException -> 0x00e8, URISyntaxException -> 0x00e6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x00e8, URISyntaxException -> 0x00e6 }
            X.203 r0 = X.AnonymousClass203.A00(r1, r4, r0, r2)     // Catch:{ IOException -> 0x00e8, URISyntaxException -> 0x00e6 }
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x00e8, URISyntaxException -> 0x00e6 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x00e8, URISyntaxException -> 0x00e6 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "--"
            java.lang.String r0 = X.AnonymousClass000.A0U(r0, r7, r8, r1)     // Catch:{ all -> 0x00dc }
            r5.writeBytes(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"encoded_image\"\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "Content-Type: image/jpeg\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "Content-Transfer-Encoding: binary\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x00dc }
            r5.writeBytes(r8)     // Catch:{ all -> 0x00dc }
            java.io.FileInputStream r6 = X.AnonymousClass0x9.A0g(r6)     // Catch:{ all -> 0x00dc }
            X.C627536m.A0I(r6, r5)     // Catch:{ all -> 0x00d2 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "\r\n--"
            r1.append(r0)     // Catch:{ all -> 0x00d2 }
            r1.append(r7)     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "--\r\n"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x00d2 }
            r5.writeBytes(r0)     // Catch:{ all -> 0x00d2 }
            r6.close()     // Catch:{ all -> 0x00dc }
            int r1 = r2.getResponseCode()     // Catch:{ all -> 0x00dc }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x00ce
            java.net.URL r0 = r2.getURL()     // Catch:{ all -> 0x00dc }
            java.net.URI r0 = r0.toURI()     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00dc }
            r5.close()     // Catch:{ IOException -> 0x00e8, URISyntaxException -> 0x00e6 }
            r2.disconnect()
            r3.A00()
            return r0
        L_0x00ce:
            r5.close()     // Catch:{ IOException -> 0x00e8, URISyntaxException -> 0x00e6 }
            goto L_0x00f5
        L_0x00d2:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00d7 }
            goto L_0x00db
        L_0x00d7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00dc }
        L_0x00db:
            throw r1     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00e1 }
            goto L_0x00e5
        L_0x00e1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x00e8, URISyntaxException -> 0x00e6 }
        L_0x00e5:
            throw r1     // Catch:{ IOException -> 0x00e8, URISyntaxException -> 0x00e6 }
        L_0x00e6:
            r1 = move-exception
            goto L_0x00ee
        L_0x00e8:
            r1 = move-exception
            goto L_0x00ee
        L_0x00ea:
            r0 = move-exception
            goto L_0x00fe
        L_0x00ec:
            r1 = move-exception
            r2 = r4
        L_0x00ee:
            java.lang.String r0 = "GoogleReverseImageSearchAsyncTask/searchImage/malformedUrl "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00fc }
            if (r2 == 0) goto L_0x00f8
        L_0x00f5:
            r2.disconnect()
        L_0x00f8:
            r3.A00()
            return r4
        L_0x00fc:
            r0 = move-exception
            r4 = r2
        L_0x00fe:
            if (r4 == 0) goto L_0x0103
            r4.disconnect()
        L_0x0103:
            r3.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33821tk.A08(java.lang.Object[]):java.lang.Object");
    }

    public void A0A() {
        C89654ea A0F = C18320x8.A0F(this.A00);
        if (A0F != null && !A0F.BHW()) {
            A0F.BpA(0, R.string.f11nameremoved);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str = (String) obj;
        C89654ea A0F = C18320x8.A0F(this.A00);
        if (A0F != null && !A0F.BHW()) {
            A0F.BjL();
            if (TextUtils.isEmpty(str)) {
                this.A01.A0F(R.string.f11nameremoved, 0);
                return;
            }
            C24071Vz r2 = new C24071Vz();
            r2.A00 = Long.valueOf(this.A04.A00);
            this.A03.BhB(r2);
            A0F.A6T(new Intent("android.intent.action.VIEW", Uri.parse(str)), false);
        }
    }

    public C33821tk(C89654ea r2, C69263Wi r3, C56492s4 r4, AnonymousClass4FV r5, File file) {
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = AnonymousClass0x9.A14(r2);
        this.A05 = file;
    }
}
