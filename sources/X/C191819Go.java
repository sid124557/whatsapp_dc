package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Go  reason: invalid class name and case insensitive filesystem */
public abstract class C191819Go extends AnonymousClass5ZM {
    public final C29441ip A00;
    public final C620933l A01;
    public final AnonymousClass9U5 A02;
    public final C193119Nf A03;
    public final AnonymousClass28X A04;

    public List A0G() {
        String str;
        String str2;
        if (this instanceof AnonymousClass9A1) {
            ArrayList A0s = AnonymousClass001.A0s();
            AnonymousClass0x2.A1G("bank_account_number", ((AnonymousClass9A1) this).A0A, A0s);
            return A0s;
        } else if (this instanceof AnonymousClass9A0) {
            ArrayList A0s2 = AnonymousClass001.A0s();
            AnonymousClass0x2.A1G("csc", ((AnonymousClass9A0) this).A0C, A0s2);
            return A0s2;
        } else if (this instanceof AnonymousClass9A2) {
            AnonymousClass9A2 r3 = (AnonymousClass9A2) this;
            ArrayList A0s3 = AnonymousClass001.A0s();
            String str3 = r3.A0F;
            if ("BANK".equals(str3)) {
                str = "bank_account_number";
                str2 = r3.A09;
            } else {
                if ("PREPAID".equals(str3)) {
                    str = "creditCardNumber";
                    str2 = r3.A0D;
                }
                return A0s3;
            }
            AnonymousClass0x2.A1G(str, str2, A0s3);
            return A0s3;
        } else if (!(this instanceof AnonymousClass9A3)) {
            return ((C1908299z) this).A03;
        } else {
            AnonymousClass9A3 r32 = (AnonymousClass9A3) this;
            ArrayList A0s4 = AnonymousClass001.A0s();
            AnonymousClass0x2.A1G("creditCardNumber", r32.A0M, A0s4);
            AnonymousClass0x2.A1G("csc", r32.A0N, A0s4);
            return A0s4;
        }
    }

    public C191819Go(C29441ip r1, C620933l r2, AnonymousClass9U5 r3, C193119Nf r4, AnonymousClass28X r5) {
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01b2, code lost:
        if (r5 == null) goto L_0x01b7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r12) {
        /*
            r11 = this;
            X.34V r4 = X.C1899693i.A0M()
            X.1ip r0 = r11.A00
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0018
            r0 = 6
            X.34V r1 = new X.34V
            r1.<init>((int) r0)
            r0 = 0
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r0, r1)
            return r0
        L_0x0018:
            java.util.List r2 = r11.A0G()
            X.33l r0 = r11.A01
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "payments_sandbox"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 == 0) goto L_0x0035
            java.lang.String r1 = "payment_dev_cycle"
            java.lang.String r0 = "dev"
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r1, r0)
            r2.add(r0)
        L_0x0035:
            X.9U5 r6 = r11.A02
            X.C626936e.A06(r2)
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.util.Iterator r3 = r2.iterator()
        L_0x0042:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r1 = r3.next()
            X.0PJ r1 = (X.AnonymousClass0PJ) r1
            java.lang.Object r0 = r1.A00     // Catch:{ UnsupportedEncodingException -> 0x006d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ UnsupportedEncodingException -> 0x006d }
            r5.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x006d }
            java.lang.String r0 = "="
            r5.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x006d }
            java.lang.Object r1 = r1.A01     // Catch:{ UnsupportedEncodingException -> 0x006d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ UnsupportedEncodingException -> 0x006d }
            java.lang.String r0 = X.C58152un.A0B     // Catch:{ UnsupportedEncodingException -> 0x006d }
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x006d }
            r5.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x006d }
            java.lang.String r0 = "&"
            r5.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x006d }
            goto L_0x0042
        L_0x006d:
            r2 = move-exception
            X.7oG r1 = r6.A0H
            java.lang.String r0 = "httpRequestFBToken threw while encoding query: "
            r1.A0A(r0, r2)
            goto L_0x0042
        L_0x0076:
            java.lang.String r2 = r5.toString()
            r3 = 0
            java.lang.String r1 = "https://secure.facebook.com/payments/generate_token"
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01a0 }
            r0.<init>(r1)     // Catch:{ MalformedURLException -> 0x01a0 }
            java.net.URLConnection r5 = r0.openConnection()     // Catch:{ IOException -> 0x0185, all -> 0x0183 }
            boolean r0 = r5 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x0185, all -> 0x0183 }
            if (r0 == 0) goto L_0x0174
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch:{ IOException -> 0x0185, all -> 0x0183 }
            java.lang.String r0 = "POST"
            r5.setRequestMethod(r0)     // Catch:{ IOException -> 0x0172 }
            X.2pq r0 = r6.A0M     // Catch:{ IOException -> 0x0172 }
            X.1r9 r0 = r0.A00()     // Catch:{ IOException -> 0x0172 }
            r5.setSSLSocketFactory(r0)     // Catch:{ IOException -> 0x0172 }
            r0 = 15000(0x3a98, float:2.102E-41)
            r5.setConnectTimeout(r0)     // Catch:{ IOException -> 0x0172 }
            r0 = 30000(0x7530, float:4.2039E-41)
            r5.setReadTimeout(r0)     // Catch:{ IOException -> 0x0172 }
            java.lang.String r1 = "Content-Length"
            int r0 = r2.length()     // Catch:{ IOException -> 0x0172 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0172 }
            r5.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x0172 }
            java.lang.String r1 = "Content-Type"
            java.lang.String r0 = "application/x-www-form-urlencoded"
            r5.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x0172 }
            java.lang.String r1 = "User-Agent"
            java.lang.String r0 = "curl/7.49.1"
            r5.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x0172 }
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r0 = "identity"
            r5.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x0172 }
            r0 = 1
            r5.setDoInput(r0)     // Catch:{ IOException -> 0x0172 }
            r5.setDoOutput(r0)     // Catch:{ IOException -> 0x0172 }
            r5.connect()     // Catch:{ IOException -> 0x0172 }
            X.2s4 r10 = r6.A02     // Catch:{ IOException -> 0x0172 }
            java.lang.Integer r9 = X.C18320x8.A0W()     // Catch:{ IOException -> 0x0172 }
            java.io.OutputStream r0 = r5.getOutputStream()     // Catch:{ IOException -> 0x0172 }
            X.203 r1 = new X.203     // Catch:{ IOException -> 0x0172 }
            r1.<init>(r10, r0, r3, r9)     // Catch:{ IOException -> 0x0172 }
            java.lang.String r7 = X.C58152un.A0B     // Catch:{ IOException -> 0x0172 }
            byte[] r0 = r2.getBytes(r7)     // Catch:{ IOException -> 0x0172 }
            r1.write(r0)     // Catch:{ IOException -> 0x0172 }
            r1.flush()     // Catch:{ IOException -> 0x0172 }
            X.7oG r2 = r6.A0H     // Catch:{ IOException -> 0x0172 }
            java.lang.String r0 = "httpRequestFBToken connecting to URL: https://secure.facebook.com/payments/generate_token"
            r2.A06(r0)     // Catch:{ IOException -> 0x0172 }
            int r8 = r5.getResponseCode()     // Catch:{ IOException -> 0x0172 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r8 != r0) goto L_0x0156
            java.io.InputStream r0 = r5.getInputStream()     // Catch:{ IOException -> 0x0172 }
            X.1zz r1 = new X.1zz     // Catch:{ IOException -> 0x0172 }
            r1.<init>(r10, r0, r3, r9)     // Catch:{ IOException -> 0x0172 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0172 }
            r0.<init>(r1, r7)     // Catch:{ IOException -> 0x0172 }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0172 }
            r7.<init>(r0)     // Catch:{ IOException -> 0x0172 }
            r0 = 1024(0x400, float:1.435E-42)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0172 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0172 }
            java.lang.String r0 = r7.readLine()     // Catch:{ IOException -> 0x0172 }
        L_0x0118:
            if (r0 == 0) goto L_0x0122
            r1.append(r0)     // Catch:{ IOException -> 0x0172 }
            java.lang.String r0 = r7.readLine()     // Catch:{ IOException -> 0x0172 }
            goto L_0x0118
        L_0x0122:
            java.lang.String r7 = r1.toString()     // Catch:{ IOException -> 0x0172 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0172 }
            java.lang.String r0 = "httpRequestFBToken got response code: "
            r1.append(r0)     // Catch:{ IOException -> 0x0172 }
            r1.append(r8)     // Catch:{ IOException -> 0x0172 }
            java.lang.String r0 = " response: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r7, r1)     // Catch:{ IOException -> 0x0172 }
            r2.A04(r0)     // Catch:{ IOException -> 0x0172 }
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r7)     // Catch:{ JSONException -> 0x0146 }
            java.lang.String r0 = "token"
            java.lang.String r3 = r1.optString(r0, r3)     // Catch:{ JSONException -> 0x0146 }
            goto L_0x01b4
        L_0x0146:
            r1 = move-exception
            java.lang.String r0 = "httpRequestFBToken threw json exception in response: "
            r2.A0A(r0, r1)     // Catch:{ IOException -> 0x0172 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0172 }
            r0 = 2
            r4.A00 = r0     // Catch:{ IOException -> 0x0172 }
            r4.A08 = r1     // Catch:{ IOException -> 0x0172 }
            goto L_0x01b4
        L_0x0156:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0172 }
            java.lang.String r0 = "httpRequestFBToken got unsuccessful http response code while getting token: "
            r1.append(r0)     // Catch:{ IOException -> 0x0172 }
            X.C1899593h.A1K(r2, r1, r8)     // Catch:{ IOException -> 0x0172 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0172 }
            java.lang.String r0 = "Unsuccessful HTTP response code"
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r8)     // Catch:{ IOException -> 0x0172 }
            r0 = 2
            r4.A00 = r0     // Catch:{ IOException -> 0x0172 }
            r4.A08 = r1     // Catch:{ IOException -> 0x0172 }
            goto L_0x01b4
        L_0x0172:
            r2 = move-exception
            goto L_0x0187
        L_0x0174:
            X.7oG r1 = r6.A0H     // Catch:{ IOException -> 0x0185, all -> 0x0183 }
            java.lang.String r0 = "httpRequestFBToken failed to connect with a https connection: https://secure.facebook.com/payments/generate_token"
            r1.A06(r0)     // Catch:{ IOException -> 0x0185, all -> 0x0183 }
            java.lang.String r1 = ""
            r0 = 4
            r4.A00 = r0     // Catch:{ IOException -> 0x0185, all -> 0x0183 }
            r4.A08 = r1     // Catch:{ IOException -> 0x0185, all -> 0x0183 }
            goto L_0x01b7
        L_0x0183:
            r0 = move-exception
            goto L_0x019a
        L_0x0185:
            r2 = move-exception
            r5 = r3
        L_0x0187:
            X.7oG r1 = r6.A0H     // Catch:{ all -> 0x0198 }
            java.lang.String r0 = "httpRequestFBToken connection response threw: "
            r1.A0A(r0, r2)     // Catch:{ all -> 0x0198 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0198 }
            r0 = 2
            r4.A00 = r0     // Catch:{ all -> 0x0198 }
            r4.A08 = r1     // Catch:{ all -> 0x0198 }
            goto L_0x01b2
        L_0x0198:
            r0 = move-exception
            r3 = r5
        L_0x019a:
            if (r3 == 0) goto L_0x019f
            r3.disconnect()
        L_0x019f:
            throw r0
        L_0x01a0:
            r2 = move-exception
            X.7oG r1 = r6.A0H
            java.lang.String r0 = "httpRequestFBToken threw while building url "
            r1.A0A(r0, r2)
            java.lang.String r1 = r2.toString()
            r0 = 3
            r4.A00 = r0
            r4.A08 = r1
            goto L_0x01b7
        L_0x01b2:
            if (r5 == 0) goto L_0x01b7
        L_0x01b4:
            r5.disconnect()
        L_0x01b7:
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191819Go.A08(java.lang.Object[]):java.lang.Object");
    }
}
