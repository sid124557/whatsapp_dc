package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.1tv  reason: invalid class name and case insensitive filesystem */
public class C33931tv extends AnonymousClass5ZM {
    public long A00;
    public ProgressDialog A01;
    public C54322oX A02;
    public String A03;
    public String A04;
    public final C56492s4 A05;
    public final C85014Ep A06 = new AnonymousClass93N(this, 0);
    public final C56512s6 A07;
    public final AnonymousClass33p A08;
    public final C620733j A09;
    public final C61072zf A0A;
    public final C631938h A0B;
    public final C53202mi A0C;
    public final C184418rl A0D;
    public final C27991fJ A0E;
    public final C47362d8 A0F;
    public final C66433Lk A0G;
    public final C622734j A0H;
    public final C106675Zy A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final WeakReference A0M;
    public final List A0N;
    public final Uri[] A0O;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0180, code lost:
        r2 = new org.json.JSONArray(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r34) {
        /*
            r33 = this;
            r9 = r33
            java.lang.ref.WeakReference r0 = r9.A0M
            java.lang.Object r12 = r0.get()
            android.content.Context r12 = (android.content.Context) r12
            if (r12 == 0) goto L_0x022a
            X.2zf r2 = r9.A0A
            long r29 = r2.A03()
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            r9.A04 = r0
            X.2s6 r1 = r9.A07
            X.4Ep r0 = r9.A06
            boolean r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x0028
            long r0 = r2.A02()
            r9.A00 = r0
        L_0x0028:
            X.2oX r0 = r9.A02
            android.util.Pair r5 = r0.A00()
            X.34j r11 = r9.A0H
            java.lang.String r10 = r9.A0J
            java.lang.String r7 = r9.A0L
            r1 = 0
            r4 = 1
            long r2 = r9.A00
            java.lang.String r6 = r9.A04
            java.util.List r8 = r9.A0N
            X.38h r0 = r9.A0B
            java.util.List r25 = X.AnonymousClass27R.A00(r0)
            X.1fJ r0 = r9.A0E
            r15 = r1
            r32 = r4
            r22 = r1
            r23 = r6
            r24 = r8
            r26 = r1
            r27 = r2
            r31 = r4
            r16 = r11
            r17 = r12
            r18 = r5
            r19 = r0
            r20 = r10
            r21 = r7
            java.lang.String r3 = r16.A04(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r32)
            r9.A03 = r3
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "searchSupportTask/doInBackground/debugInfo: "
            X.C18260x0.A0s(r0, r3, r2)
            X.3Lk r0 = r9.A0G     // Catch:{ IOException | JSONException -> 0x0218 }
            android.net.Uri$Builder r3 = r0.A01()     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.String r0 = "client_search.php"
            r3.appendPath(r0)     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.String r2 = "platform"
            java.lang.String r0 = "android"
            r3.appendQueryParameter(r2, r0)     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.String r2 = "lg"
            X.33j r6 = r9.A09     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.String r0 = r6.A07()     // Catch:{ IOException | JSONException -> 0x0218 }
            r3.appendQueryParameter(r2, r0)     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.String r2 = "lc"
            java.lang.String r0 = r6.A06()     // Catch:{ IOException | JSONException -> 0x0218 }
            r3.appendQueryParameter(r2, r0)     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.String r2 = "eea"
            X.5Zy r0 = r9.A0I     // Catch:{ IOException | JSONException -> 0x0218 }
            boolean r0 = r0.A04()     // Catch:{ IOException | JSONException -> 0x0218 }
            if (r0 == 0) goto L_0x0110
            java.lang.String r0 = "1"
        L_0x00a2:
            r3.appendQueryParameter(r2, r0)     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.String r0 = "query"
            java.lang.String r11 = r9.A0K     // Catch:{ IOException | JSONException -> 0x0218 }
            r3.appendQueryParameter(r0, r11)     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.String r2 = "manufacturer"
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ IOException | JSONException -> 0x0218 }
            r3.appendQueryParameter(r2, r0)     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.String r2 = "os_version"
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ IOException | JSONException -> 0x0218 }
            r3.appendQueryParameter(r2, r0)     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.String r2 = "ccode"
            X.33p r0 = r9.A08     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.String r0 = r0.A0Z()     // Catch:{ IOException | JSONException -> 0x0218 }
            r3.appendQueryParameter(r2, r0)     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.String r2 = "app_version"
            java.lang.String r0 = "2.23.26.14"
            r3.appendQueryParameter(r2, r0)     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.Object r2 = r5.first     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.Object r0 = r5.second     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException | JSONException -> 0x0218 }
            r3.appendQueryParameter(r2, r0)     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException | JSONException -> 0x0218 }
            java.net.URLConnection r6 = X.C18300x5.A0q(r0)     // Catch:{ IOException | JSONException -> 0x0218 }
            r0 = 30000(0x7530, float:4.2039E-41)
            r6.setConnectTimeout(r0)     // Catch:{ IOException | JSONException -> 0x0218 }
            r6.setReadTimeout(r0)     // Catch:{ IOException | JSONException -> 0x0218 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.String r0 = "POST"
            r6.setRequestMethod(r0)     // Catch:{ IOException | JSONException -> 0x0218 }
            r6.setDoOutput(r4)     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.String r7 = X.C18280x3.A0Y()     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.String r3 = "Content-Type"
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ IOException | JSONException -> 0x0218 }
            java.lang.String r0 = "multipart/form-data; boundary="
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r7, r2)     // Catch:{ IOException | JSONException -> 0x0218 }
            r6.setRequestProperty(r3, r0)     // Catch:{ IOException | JSONException -> 0x0218 }
            X.2s4 r5 = r9.A05     // Catch:{ IOException | JSONException -> 0x0218 }
            r0 = 20
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException | JSONException -> 0x0218 }
            goto L_0x0113
        L_0x0110:
            java.lang.String r0 = "0"
            goto L_0x00a2
        L_0x0113:
            X.203 r0 = X.AnonymousClass203.A00(r5, r1, r4, r6)     // Catch:{ IOException | JSONException -> 0x021a }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException | JSONException -> 0x021a }
            r3.<init>(r0)     // Catch:{ IOException | JSONException -> 0x021a }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x020e }
            java.lang.String r0 = "--"
            r2.append(r0)     // Catch:{ all -> 0x020e }
            r2.append(r7)     // Catch:{ all -> 0x020e }
            java.lang.String r0 = "\r\n"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)     // Catch:{ all -> 0x020e }
            X.AnonymousClass0x2.A1L(r0, r3)     // Catch:{ all -> 0x020e }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"debug_info\"\r\n\r\n"
            X.AnonymousClass0x2.A1L(r0, r3)     // Catch:{ all -> 0x020e }
            java.lang.String r0 = r9.A03     // Catch:{ all -> 0x020e }
            X.AnonymousClass0x2.A1L(r0, r3)     // Catch:{ all -> 0x020e }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x020e }
            java.lang.String r0 = "\r\n--"
            r2.append(r0)     // Catch:{ all -> 0x020e }
            r2.append(r7)     // Catch:{ all -> 0x020e }
            java.lang.String r0 = "--\r\n"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)     // Catch:{ all -> 0x020e }
            X.AnonymousClass0x2.A1L(r0, r3)     // Catch:{ all -> 0x020e }
            r3.flush()     // Catch:{ all -> 0x020e }
            r3.close()     // Catch:{ IOException | JSONException -> 0x021a }
            X.1zz r14 = X.C36851zz.A00(r5, r1, r4, r6)     // Catch:{ IOException | JSONException -> 0x021a }
            java.io.BufferedReader r13 = X.C18310x6.A0Z(r14)     // Catch:{ all -> 0x0209 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01ff }
        L_0x0162:
            java.lang.String r0 = r13.readLine()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x016c
            r2.append(r0)     // Catch:{ all -> 0x01ff }
            goto L_0x0162
        L_0x016c:
            java.lang.String r3 = r2.toString()     // Catch:{ all -> 0x01ff }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = "searchSupportTask/doInBackground/result: "
            X.C18260x0.A0q(r0, r3, r2)     // Catch:{ all -> 0x01ff }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x01f8
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ all -> 0x01ff }
            r2.<init>(r3)     // Catch:{ all -> 0x01ff }
            int r10 = r2.length()     // Catch:{ all -> 0x01ff }
            if (r10 == 0) goto L_0x01f8
            java.util.ArrayList r7 = X.AnonymousClass002.A0I(r10)     // Catch:{ all -> 0x01ff }
            java.util.ArrayList r6 = X.AnonymousClass002.A0I(r10)     // Catch:{ all -> 0x01ff }
            java.util.ArrayList r5 = X.AnonymousClass002.A0I(r10)     // Catch:{ all -> 0x01ff }
            java.util.ArrayList r4 = X.AnonymousClass002.A0I(r10)     // Catch:{ all -> 0x01ff }
            r12 = 0
            r1 = 0
        L_0x019d:
            if (r1 >= r10) goto L_0x01cc
            org.json.JSONObject r3 = r2.optJSONObject(r1)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = "title"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x01ff }
            r7.add(r0)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = "description"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x01ff }
            r6.add(r0)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = "url"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x01ff }
            r5.add(r0)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = "id"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x01ff }
            r4.add(r0)     // Catch:{ all -> 0x01ff }
            int r1 = r1 + 1
            goto L_0x019d
        L_0x01cc:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x01ff }
            android.net.Uri[] r2 = r9.A0O     // Catch:{ all -> 0x01ff }
            int r1 = r2.length     // Catch:{ all -> 0x01ff }
        L_0x01d3:
            if (r12 >= r1) goto L_0x01df
            r0 = r2[r12]     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x01dc
            r3.add(r0)     // Catch:{ all -> 0x01ff }
        L_0x01dc:
            int r12 = r12 + 1
            goto L_0x01d3
        L_0x01df:
            java.lang.String r0 = r9.A03     // Catch:{ all -> 0x01ff }
            X.5Ku r1 = new X.5Ku     // Catch:{ all -> 0x01ff }
            r16 = r1
            r17 = r11
            r18 = r0
            r19 = r7
            r20 = r6
            r21 = r5
            r22 = r4
            r23 = r3
            r25 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x01ff }
        L_0x01f8:
            r13.close()     // Catch:{ all -> 0x0209 }
            r14.close()     // Catch:{ IOException | JSONException -> 0x021a }
            return r1
        L_0x01ff:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0204 }
            goto L_0x0208
        L_0x0204:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0209 }
        L_0x0208:
            throw r1     // Catch:{ all -> 0x0209 }
        L_0x0209:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x0213 }
            goto L_0x0217
        L_0x020e:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0213 }
            goto L_0x0217
        L_0x0213:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException | JSONException -> 0x021a }
        L_0x0217:
            throw r1     // Catch:{ IOException | JSONException -> 0x021a }
        L_0x0218:
            r2 = move-exception
            goto L_0x021b
        L_0x021a:
            r2 = move-exception
        L_0x021b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "searchSupportTask/doInBackground/error: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r2, r0, r1)
            com.whatsapp.util.Log.e(r0, r2)
            return r15
        L_0x022a:
            r15 = 0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33931tv.A08(java.lang.Object[]):java.lang.Object");
    }

    public void A0A() {
        Context context = (Context) this.A0M.get();
        if (context != null) {
            if (this.A01 == null) {
                ProgressDialog progressDialog = new ProgressDialog(context);
                this.A01 = progressDialog;
                progressDialog.setOnCancelListener(new C1235568w(this, 9));
                this.A01.setCancelable(false);
            }
            if (!this.A01.isShowing()) {
                ProgressDialog progressDialog2 = this.A01;
                boolean A002 = this.A0C.A00();
                int i = R.string.f11nameremoved;
                if (A002) {
                    i = R.string.f11nameremoved;
                }
                C18320x8.A0w(progressDialog2, context, i);
                this.A01.setIndeterminate(true);
                this.A01.show();
            }
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C102925Ku r4 = (C102925Ku) obj;
        if (this.A0M.get() != null) {
            if (r4 != null) {
                try {
                    int i = r4.A00;
                    C18260x0.A0y("searchSupportTask/onPostExecute/result/count: ", AnonymousClass001.A0o(), i);
                    if (i > 0) {
                        C184418rl r0 = this.A0D;
                        if (r0 != null) {
                            r0.Baz(r4);
                        }
                        ProgressDialog progressDialog = this.A01;
                        if (progressDialog != null && progressDialog.isShowing()) {
                            this.A01.cancel();
                            return;
                        }
                        return;
                    }
                } catch (Exception e) {
                    Log.e(AnonymousClass000.A0P(e, "searchSupportTask/onPostExecute/error: ", AnonymousClass001.A0o()), e);
                }
            }
            C184418rl r02 = this.A0D;
            if (r02 != null) {
                r02.BRr();
            }
            ProgressDialog progressDialog2 = this.A01;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.A01.cancel();
            }
        }
    }

    public C33931tv(C89654ea r3, C56492s4 r4, C56512s6 r5, AnonymousClass33p r6, C620733j r7, C61072zf r8, C631938h r9, C53202mi r10, C54322oX r11, C184418rl r12, C27991fJ r13, C47362d8 r14, C66433Lk r15, C622734j r16, C106675Zy r17, String str, String str2, String str3, List list, Uri[] uriArr) {
        this.A0M = AnonymousClass0x9.A14(r3);
        this.A05 = r4;
        this.A0I = r17;
        this.A0A = r8;
        this.A0G = r15;
        this.A09 = r7;
        this.A0H = r16;
        this.A07 = r5;
        this.A0C = r10;
        this.A08 = r6;
        this.A0F = r14;
        this.A0D = r12;
        this.A0J = str;
        this.A0L = str2;
        this.A0N = list;
        this.A0K = str3;
        this.A0O = uriArr;
        this.A0B = r9;
        this.A0E = r13;
        this.A02 = r11;
    }
}
