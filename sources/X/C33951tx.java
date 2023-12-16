package X;

import android.app.ProgressDialog;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.profile.WebImagePicker;

/* renamed from: X.1tx  reason: invalid class name and case insensitive filesystem */
public class C33951tx extends AnonymousClass5ZM {
    public ProgressDialog A00;
    public final AnonymousClass7X8 A01;
    public final /* synthetic */ WebImagePicker A02;

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13, types: [java.io.OutputStream, java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0182, code lost:
        if (r3 != 0) goto L_0x0184;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0176 A[Catch:{ all -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x017b A[Catch:{ all -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x014e A[Catch:{ all -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x015a A[Catch:{ all -> 0x018e }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:84:0x0148=Splitter:B:84:0x0148, B:93:0x015e=Splitter:B:93:0x015e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r14) {
        /*
            r13 = this;
            r4 = 1
            r3 = 0
            X.7X8 r10 = r13.A01     // Catch:{ IOException -> 0x015b, Exception -> 0x0145, all -> 0x0141 }
            java.lang.String r2 = r10.A05     // Catch:{ IOException -> 0x015b, Exception -> 0x0145, all -> 0x0141 }
            java.lang.String r1 = " "
            java.lang.String r0 = "%20"
            java.lang.String r0 = r2.replace(r1, r0)     // Catch:{ IOException -> 0x015b, Exception -> 0x0145, all -> 0x0141 }
            java.net.URL r2 = X.C18330xA.A0B(r0)     // Catch:{ IOException -> 0x015b, Exception -> 0x0145, all -> 0x0141 }
            java.lang.String r11 = ""
            r9 = 0
            r8 = r3
            r7 = 0
        L_0x0017:
            r0 = 20
            if (r7 >= r0) goto L_0x00c4
            java.net.URLConnection r5 = r2.openConnection()     // Catch:{ IOException -> 0x013c, Exception -> 0x0137, all -> 0x0190 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x013c, Exception -> 0x0137, all -> 0x0190 }
            r0 = 15000(0x3a98, float:2.102E-41)
            r5.setConnectTimeout(r0)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            r0 = 30000(0x7530, float:4.2039E-41)
            r5.setReadTimeout(r0)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            java.lang.String r1 = "User-Agent"
            com.whatsapp.profile.WebImagePicker r0 = r13.A02     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            X.3FI r0 = r0.A0G     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            java.lang.String r0 = r0.A00()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            r5.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "Cookie"
            r5.setRequestProperty(r0, r11)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
        L_0x0043:
            int r1 = r5.getResponseCode()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 == r0) goto L_0x004c
            goto L_0x0096
        L_0x004c:
            java.lang.String r0 = "Location"
            java.lang.String r0 = r5.getHeaderField(r0)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            if (r0 == 0) goto L_0x00aa
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            r6.<init>(r2, r0)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            java.lang.String r0 = "webimage/download/bg redirected from "
            r1.append(r0)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            r1.append(r2)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            java.lang.String r0 = " to "
            X.C18260x0.A1R(r1, r0, r6)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            java.lang.String r0 = "Set-Cookie"
            java.lang.String r2 = r5.getHeaderField(r0)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            if (r2 == 0) goto L_0x0092
            java.lang.String r0 = ";"
            java.lang.String[] r1 = r2.split(r0)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            int r0 = r1.length     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            if (r0 <= 0) goto L_0x007e
            r2 = r1[r9]     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
        L_0x007e:
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            if (r0 != 0) goto L_0x008e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            java.lang.String r0 = "; "
            java.lang.String r11 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
        L_0x008e:
            java.lang.String r11 = X.AnonymousClass000.A0T(r11, r2)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
        L_0x0092:
            r5.disconnect()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            goto L_0x00ac
        L_0x0096:
            r0 = 301(0x12d, float:4.22E-43)
            if (r1 == r0) goto L_0x004c
            r0 = 302(0x12e, float:4.23E-43)
            if (r1 == r0) goto L_0x004c
            r0 = 303(0x12f, float:4.25E-43)
            if (r1 == r0) goto L_0x004c
            r0 = 307(0x133, float:4.3E-43)
            if (r1 == r0) goto L_0x004c
            r0 = 308(0x134, float:4.32E-43)
            if (r1 == r0) goto L_0x004c
        L_0x00aa:
            r8 = r5
            goto L_0x00c4
        L_0x00ac:
            int r7 = r7 + 1
            r8 = r5
            r2 = r6
            goto L_0x0017
        L_0x00b2:
            r0 = move-exception
            r2 = r3
            r6 = r3
            r3 = r5
            goto L_0x0194
        L_0x00b8:
            r1 = move-exception
            r6 = r3
            r2 = r3
            r3 = r5
            goto L_0x0148
        L_0x00be:
            r1 = move-exception
            r6 = r3
            r2 = r3
            r3 = r5
            goto L_0x015e
        L_0x00c4:
            com.whatsapp.profile.WebImagePicker r5 = r13.A02     // Catch:{ IOException -> 0x013c, Exception -> 0x0137, all -> 0x0190 }
            X.2s4 r1 = r5.A08     // Catch:{ IOException -> 0x013c, Exception -> 0x0137, all -> 0x0190 }
            r0 = 25
            X.1zz r2 = X.C36851zz.A01(r1, r8, r0)     // Catch:{ IOException -> 0x013c, Exception -> 0x0137, all -> 0x0190 }
            X.33i r0 = r5.A08     // Catch:{ IOException -> 0x0134, Exception -> 0x0131, all -> 0x012f }
            X.5UR r1 = r0.A0R()     // Catch:{ IOException -> 0x0134, Exception -> 0x0131, all -> 0x012f }
            if (r1 != 0) goto L_0x00dd
            java.lang.String r0 = "webimage/download/bg cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0134, Exception -> 0x0131, all -> 0x012f }
            goto L_0x00e3
        L_0x00dd:
            android.net.Uri r0 = r5.A02     // Catch:{ IOException -> 0x0134, Exception -> 0x0131, all -> 0x012f }
            java.io.OutputStream r3 = r1.A07(r0)     // Catch:{ IOException -> 0x0134, Exception -> 0x0131, all -> 0x012f }
        L_0x00e3:
            if (r3 != 0) goto L_0x00f0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x0134, Exception -> 0x0131, all -> 0x012f }
            r8.disconnect()
            X.C624535b.A03(r2)
            return r0
        L_0x00f0:
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r7]     // Catch:{ IOException -> 0x0134, Exception -> 0x0131, all -> 0x012f }
            r12 = 0
            r11 = 0
        L_0x00f6:
            X.4MC r5 = r13.A02     // Catch:{ IOException -> 0x0134, Exception -> 0x0131, all -> 0x012f }
            boolean r0 = r5.isCancelled()     // Catch:{ IOException -> 0x0134, Exception -> 0x0131, all -> 0x012f }
            if (r0 != 0) goto L_0x011d
            int r1 = r2.read(r6, r9, r7)     // Catch:{ IOException -> 0x0134, Exception -> 0x0131, all -> 0x012f }
            r0 = -1
            if (r1 == r0) goto L_0x011d
            r3.write(r6, r9, r1)     // Catch:{ IOException -> 0x0134, Exception -> 0x0131, all -> 0x012f }
            int r12 = r12 + r1
            int r0 = r10.A02     // Catch:{ IOException -> 0x0134, Exception -> 0x0131, all -> 0x012f }
            r1 = 0
            if (r0 == 0) goto L_0x0111
            int r1 = r12 * 100
            int r1 = r1 / r0
        L_0x0111:
            if (r1 == r11) goto L_0x00f6
            java.lang.Integer[] r0 = new java.lang.Integer[r4]     // Catch:{ IOException -> 0x0134, Exception -> 0x0131, all -> 0x012f }
            X.AnonymousClass000.A1P(r0, r1, r9)     // Catch:{ IOException -> 0x0134, Exception -> 0x0131, all -> 0x012f }
            r13.A0F(r0)     // Catch:{ IOException -> 0x0134, Exception -> 0x0131, all -> 0x012f }
            r11 = r1
            goto L_0x00f6
        L_0x011d:
            r8.disconnect()
            X.C624535b.A03(r2)
            X.C624535b.A03(r3)
            boolean r0 = r5.isCancelled()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x012f:
            r0 = move-exception
            goto L_0x0192
        L_0x0131:
            r1 = move-exception
            r6 = r3
            goto L_0x013a
        L_0x0134:
            r1 = move-exception
            r6 = r3
            goto L_0x013f
        L_0x0137:
            r1 = move-exception
            r6 = r3
            r2 = r3
        L_0x013a:
            r3 = r8
            goto L_0x0148
        L_0x013c:
            r1 = move-exception
            r6 = r3
            r2 = r3
        L_0x013f:
            r3 = r8
            goto L_0x015e
        L_0x0141:
            r0 = move-exception
            r2 = r3
            r6 = r3
            goto L_0x0194
        L_0x0145:
            r1 = move-exception
            r6 = r3
            r2 = r3
        L_0x0148:
            boolean r0 = X.C18320x8.A1T(r13)     // Catch:{ all -> 0x018e }
            if (r0 != 0) goto L_0x0154
            java.lang.String r0 = "webimage/download/bg/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x018e }
        L_0x0154:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x018e }
            if (r3 == 0) goto L_0x0187
            goto L_0x0184
        L_0x015b:
            r1 = move-exception
            r6 = r3
            r2 = r3
        L_0x015e:
            boolean r0 = X.C18320x8.A1T(r13)     // Catch:{ all -> 0x018e }
            if (r0 != 0) goto L_0x017b
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x018e }
            if (r0 == 0) goto L_0x017b
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x018e }
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x018e }
            if (r0 == 0) goto L_0x017b
            java.lang.Integer r0 = X.C18280x3.A0S()     // Catch:{ all -> 0x018e }
            goto L_0x0182
        L_0x017b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x018e }
            if (r3 == 0) goto L_0x0187
            goto L_0x0184
        L_0x0182:
            if (r3 == 0) goto L_0x0187
        L_0x0184:
            r3.disconnect()
        L_0x0187:
            X.C624535b.A03(r2)
            X.C624535b.A03(r6)
            return r0
        L_0x018e:
            r0 = move-exception
            goto L_0x0194
        L_0x0190:
            r0 = move-exception
            r2 = r3
        L_0x0192:
            r6 = r3
            r3 = r8
        L_0x0194:
            if (r3 == 0) goto L_0x0199
            r3.disconnect()
        L_0x0199:
            X.C624535b.A03(r2)
            X.C624535b.A03(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33951tx.A08(java.lang.Object[]):java.lang.Object");
    }

    public C33951tx(AnonymousClass7X8 r1, WebImagePicker webImagePicker) {
        this.A02 = webImagePicker;
        this.A01 = r1;
    }

    public void A0A() {
        WebImagePicker webImagePicker = this.A02;
        ProgressDialog progressDialog = new ProgressDialog(webImagePicker);
        this.A00 = progressDialog;
        progressDialog.setProgressStyle(1);
        C18320x8.A0w(this.A00, webImagePicker, R.string.f11nameremoved);
        this.A00.setCancelable(true);
        this.A00.setOnCancelListener(new C1891590f(this, 8));
        this.A00.show();
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Number number = (Number) obj;
        ProgressDialog progressDialog = this.A00;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.A00 = null;
        WebImagePicker webImagePicker = this.A02;
        if (webImagePicker.A0C == this) {
            webImagePicker.A0C = null;
        }
        int intValue = number.intValue();
        if (intValue == 0) {
            Intent A07 = C18320x8.A07();
            A07.putExtra("webImageSource", this.A01.A06);
            AnonymousClass0x2.A0m(webImagePicker, A07);
        } else if (!C18320x8.A1T(this)) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "webimage/download/error ", number);
            if (intValue == 2) {
                boolean A012 = C61072zf.A01();
                int i = R.string.f11nameremoved;
                if (A012) {
                    i = R.string.f11nameremoved;
                }
                webImagePicker.Bot(i);
                return;
            }
            webImagePicker.A05.A0H(R.string.f11nameremoved, 1);
        }
    }

    public /* bridge */ /* synthetic */ void A0E(Object[] objArr) {
        Integer[] numArr = (Integer[]) objArr;
        ProgressDialog progressDialog = this.A00;
        if (progressDialog != null) {
            progressDialog.setProgress(numArr[0].intValue());
        }
    }
}
