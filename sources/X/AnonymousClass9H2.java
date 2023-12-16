package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.9H2  reason: invalid class name */
public class AnonymousClass9H2 extends AnonymousClass5ZM {
    public ProgressDialog A00;
    public final Bundle A01;
    public final AnonymousClass5WY A02;
    public final C66663Mh A03;
    public final C56492s4 A04;
    public final C620733j A05;
    public final C166587yw A06;
    public final C624034w A07;
    public final AnonymousClass33K A08;
    public final C153087ae A09;
    public final C160757oG A0A = C160757oG.A00("PaymentSupportTask", "payment-settings", "COMMON");
    public final String A0B;
    public final WeakReference A0C;

    /* JADX WARNING: Removed duplicated region for block: B:50:0x017a A[Catch:{ all -> 0x01c9, all -> 0x01ce, all -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018a A[Catch:{ all -> 0x01c9, all -> 0x01ce, all -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c0 A[Catch:{ all -> 0x01c9, all -> 0x01ce, all -> 0x01d3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r28) {
        /*
            r27 = this;
            r2 = r27
            java.lang.ref.WeakReference r0 = r2.A0C
            java.lang.Object r0 = r0.get()
            r17 = 0
            if (r0 == 0) goto L_0x01ef
            org.json.JSONObject r5 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            java.lang.String r9 = "platform"
            java.lang.String r0 = "android"
            r5.put(r9, r0)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            X.7ae r1 = r2.A09     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            X.7pU r0 = r1.A02()     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            if (r0 == 0) goto L_0x00d2
            X.7pU r0 = r1.A02()     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            java.lang.String r1 = r0.A03     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
        L_0x0025:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "country"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
        L_0x0030:
            X.33j r0 = r2.A05     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            java.lang.String r0 = r0.A07()     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            java.lang.String r8 = "lang"
            r5.put(r8, r0)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            java.lang.String r1 = "context"
            java.lang.String r0 = r2.A0B     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            java.lang.String r4 = "version"
            java.lang.String r0 = "v2"
            org.json.JSONObject r3 = X.C18300x5.A0z(r0, r4, r5)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            X.34w r6 = r2.A07     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            if (r6 == 0) goto L_0x0093
            java.lang.String r0 = r6.A0J     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            if (r0 != 0) goto L_0x005d
            java.lang.String r1 = r6.A0J     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            java.lang.String r0 = "error_code"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
        L_0x005d:
            int r0 = r6.A03     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            java.lang.String r1 = X.AnonymousClass36S.A02(r0)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            java.lang.String r0 = "type"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            int r1 = r6.A03     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            int r0 = r6.A02     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            java.lang.String r1 = X.AnonymousClass36S.A03(r1, r0)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "transaction_status"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
        L_0x007b:
            X.7yw r1 = r2.A06     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            if (r1 == 0) goto L_0x008e
            java.lang.String r0 = r1.A0B     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            if (r0 != 0) goto L_0x008e
            java.lang.String r1 = r1.A0B     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            java.lang.String r0 = "bank_name"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
        L_0x008e:
            java.lang.String r0 = "transaction_info"
            r5.put(r0, r3)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
        L_0x0093:
            android.net.Uri$Builder r3 = new android.net.Uri$Builder     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            r3.<init>()     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            java.lang.String r0 = "https"
            r3.scheme(r0)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            java.lang.String r0 = "faq.whatsapp.com"
            r3.authority(r0)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            java.lang.String r0 = "inappsupport"
            r3.appendPath(r0)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            java.lang.String r0 = "payments"
            r3.appendPath(r0)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            X.33K r1 = r2.A08     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            android.net.Uri r0 = r3.build()     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            java.lang.String r20 = r0.toString()     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            java.lang.String r21 = r5.toString()     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            java.lang.Integer r19 = X.C18320x8.A0W()     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            r11 = 0
            r16 = 1
            r26 = r11
            r22 = r17
            r24 = r16
            r25 = r11
            r23 = r17
            r18 = r1
            X.4GL r3 = r18.A02(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            goto L_0x00d5
        L_0x00d2:
            r1 = 0
            goto L_0x0025
        L_0x00d5:
            X.2s4 r5 = r2.A04     // Catch:{ all -> 0x01d3 }
            r0 = 20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01d3 }
            r0 = r17
            java.io.InputStream r1 = r3.B47(r5, r0, r1)     // Catch:{ all -> 0x01d3 }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x01d3 }
            r0.<init>(r1)     // Catch:{ all -> 0x01d3 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x01d3 }
            r5.<init>(r0)     // Catch:{ all -> 0x01d3 }
            r10 = 2048(0x800, float:2.87E-42)
            char[] r7 = new char[r10]     // Catch:{ all -> 0x01c9 }
            int r6 = r5.read(r7, r11, r10)     // Catch:{ all -> 0x01c9 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01c9 }
        L_0x00f9:
            r0 = -1
            if (r6 == r0) goto L_0x0104
            r1.append(r7, r11, r6)     // Catch:{ all -> 0x01c9 }
            int r6 = r5.read(r7, r11, r10)     // Catch:{ all -> 0x01c9 }
            goto L_0x00f9
        L_0x0104:
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x01c9 }
            X.7oG r6 = r2.A0A     // Catch:{ all -> 0x01c9 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01c9 }
            java.lang.String r0 = "result="
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r10, r1)     // Catch:{ all -> 0x01c9 }
            r6.A07(r0)     // Catch:{ all -> 0x01c9 }
            r7 = 0
            if (r10 != 0) goto L_0x011d
            r0 = r7
            goto L_0x01c2
        L_0x011d:
            org.json.JSONObject r10 = X.AnonymousClass0x9.A1H(r10)     // Catch:{ all -> 0x01c9 }
            boolean r0 = r10.has(r4)     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x016f
            int r12 = r10.getInt(r4)     // Catch:{ all -> 0x01c9 }
        L_0x012b:
            java.lang.String r1 = "payment_faqs"
            boolean r0 = r10.has(r1)     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x0171
            org.json.JSONArray r15 = r10.getJSONArray(r1)     // Catch:{ all -> 0x01c9 }
            int r0 = r15.length()     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x0171
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x01c9 }
            r14 = 0
        L_0x0142:
            int r0 = r15.length()     // Catch:{ all -> 0x01c9 }
            if (r14 >= r0) goto L_0x0172
            org.json.JSONObject r1 = r15.getJSONObject(r14)     // Catch:{ all -> 0x01c9 }
            java.lang.String r0 = "title"
            java.lang.String r13 = r1.getString(r0)     // Catch:{ all -> 0x01c9 }
            java.lang.String r0 = "description"
            java.lang.String r11 = r1.getString(r0)     // Catch:{ all -> 0x01c9 }
            java.lang.String r0 = "url"
            java.lang.String r4 = r1.getString(r0)     // Catch:{ all -> 0x01c9 }
            java.lang.String r0 = "id"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ all -> 0x01c9 }
            X.7yF r0 = new X.7yF     // Catch:{ all -> 0x01c9 }
            r0.<init>(r13, r11, r4, r1)     // Catch:{ all -> 0x01c9 }
            r6.add(r0)     // Catch:{ all -> 0x01c9 }
            int r14 = r14 + 1
            goto L_0x0142
        L_0x016f:
            r12 = 1
            goto L_0x012b
        L_0x0171:
            r6 = r7
        L_0x0172:
            java.lang.String r1 = "topics"
            boolean r0 = r10.has(r1)     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x01c0
            org.json.JSONArray r0 = r10.getJSONArray(r1)     // Catch:{ all -> 0x01c9 }
            java.util.ArrayList r4 = r2.A0G(r0, r12)     // Catch:{ all -> 0x01c9 }
        L_0x0182:
            java.lang.String r1 = "mapped_faq"
            boolean r0 = r10.has(r1)     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x01ba
            org.json.JSONObject r7 = r10.getJSONObject(r1)     // Catch:{ all -> 0x01c9 }
            java.lang.String r0 = "title"
            java.lang.String r10 = r7.optString(r0)     // Catch:{ all -> 0x01c9 }
            r7.optString(r9)     // Catch:{ all -> 0x01c9 }
            r7.optString(r8)     // Catch:{ all -> 0x01c9 }
            java.lang.String r0 = "url"
            java.lang.String r11 = r7.optString(r0)     // Catch:{ all -> 0x01c9 }
            java.lang.String r0 = "id"
            java.lang.String r12 = r7.optString(r0)     // Catch:{ all -> 0x01c9 }
            java.lang.String r0 = "description"
            java.lang.String r13 = r7.optString(r0)     // Catch:{ all -> 0x01c9 }
            java.lang.String r1 = "open_flow"
            r0 = r16
            boolean r14 = r7.optBoolean(r1, r0)     // Catch:{ all -> 0x01c9 }
            X.9Pd r7 = new X.9Pd     // Catch:{ all -> 0x01c9 }
            r9 = r7
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01c9 }
        L_0x01ba:
            X.9P0 r0 = new X.9P0     // Catch:{ all -> 0x01c9 }
            r0.<init>(r7, r6, r4)     // Catch:{ all -> 0x01c9 }
            goto L_0x01c2
        L_0x01c0:
            r4 = r7
            goto L_0x0182
        L_0x01c2:
            r5.close()     // Catch:{ all -> 0x01d3 }
            r3.close()     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
            return r0
        L_0x01c9:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x01ce }
            goto L_0x01d2
        L_0x01ce:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01d3 }
        L_0x01d2:
            throw r1     // Catch:{ all -> 0x01d3 }
        L_0x01d3:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x01d8 }
            goto L_0x01dc
        L_0x01d8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
        L_0x01dc:
            throw r1     // Catch:{ JSONException -> 0x01dd, IOException -> 0x01df }
        L_0x01dd:
            r3 = move-exception
            goto L_0x01e0
        L_0x01df:
            r3 = move-exception
        L_0x01e0:
            X.7oG r2 = r2.A0A
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "error e="
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r3)
            r2.A0A(r0, r3)
        L_0x01ef:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9H2.A08(java.lang.Object[]):java.lang.Object");
    }

    public void A0A() {
        Context context = (Context) this.A0C.get();
        if (context != null) {
            if (this.A00 == null) {
                ProgressDialog progressDialog = new ProgressDialog(context);
                this.A00 = progressDialog;
                progressDialog.setOnCancelListener(new C204279p6(this, 1));
                this.A00.setCanceledOnTouchOutside(false);
            }
            if (!this.A00.isShowing()) {
                this.A00.setMessage(context.getString(R.string.f11nameremoved));
                this.A00.setIndeterminate(true);
                this.A00.show();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r23) {
        /*
            r22 = this;
            r3 = r23
            X.9P0 r3 = (X.AnonymousClass9P0) r3
            r2 = r22
            java.lang.ref.WeakReference r0 = r2.A0C
            java.lang.Object r13 = r0.get()
            X.4ea r13 = (X.C89654ea) r13
            if (r13 == 0) goto L_0x0080
            if (r3 == 0) goto L_0x00d8
            X.9Pd r4 = r3.A00
            r5 = 48
            if (r4 == 0) goto L_0x0081
            android.os.Bundle r7 = r2.A01
            java.lang.String r1 = "com.whatsapp.support.DescribeProblemActivity.type"
            r0 = 3
            r7.putInt(r1, r0)
            java.lang.String r12 = r4.A02
            java.lang.String r11 = r4.A00
            java.lang.String r10 = r4.A03
            java.lang.String r9 = r4.A01
            boolean r6 = r4.A04
            java.lang.String r8 = r2.A0B
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.support.faq.FaqItemActivity"
            r4.setClassName(r1, r0)
            java.lang.String r0 = "title"
            r4.putExtra(r0, r12)
            java.lang.String r0 = "content"
            r4.putExtra(r0, r11)
            java.lang.String r0 = "url"
            r4.putExtra(r0, r10)
            java.lang.String r0 = "article_id"
            r4.putExtra(r0, r9)
            java.lang.String r0 = "show_contact_support_button"
            r4.putExtra(r0, r6)
            java.lang.String r0 = "contact_us_context"
            r4.putExtra(r0, r8)
            java.lang.String r0 = "describe_problem_fields"
            r4.putExtra(r0, r7)
            if (r6 == 0) goto L_0x0065
            java.lang.String r1 = "payments_support_topics"
            java.util.ArrayList r0 = r3.A02
            r4.putParcelableArrayListExtra(r1, r0)
        L_0x0065:
            r13.BpY(r4, r5)
            r1 = 2130772051(0x7f010053, float:1.714721E38)
            r0 = 2130772053(0x7f010055, float:1.7147214E38)
            r13.overridePendingTransition(r1, r0)
        L_0x0071:
            android.app.ProgressDialog r0 = r2.A00
            if (r0 == 0) goto L_0x0080
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0080
            android.app.ProgressDialog r0 = r2.A00
            r0.cancel()
        L_0x0080:
            return
        L_0x0081:
            java.util.ArrayList r8 = r3.A01
            if (r8 == 0) goto L_0x00c5
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x00c5
            java.lang.String r7 = r2.A0B
            android.os.Bundle r6 = r2.A01
            java.util.ArrayList r4 = r3.A02
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.support.faq.SearchFAQ"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "com.whatsapp.support.faq.SearchFAQ.from"
            r3.putExtra(r0, r7)
            int r1 = r8.size()
            java.lang.String r0 = "com.whatsapp.support.faq.SearchFAQ.count"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "describe_problem_bundle"
            r3.putExtra(r0, r6)
            java.lang.String r0 = "payments_support_faqs"
            r3.putExtra(r0, r8)
            java.lang.String r0 = "payments_support_topics"
            r3.putExtra(r0, r4)
            java.lang.String r1 = "com.whatsapp.support.faq.SearchFAQ.usePaymentsFlow"
            r0 = 1
            r3.putExtra(r1, r0)
        L_0x00c1:
            r13.BpY(r3, r5)
            goto L_0x0071
        L_0x00c5:
            java.util.ArrayList r4 = r3.A02
            if (r4 == 0) goto L_0x00d8
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00d8
            android.os.Bundle r3 = r2.A01
            r1 = 1
            r0 = 3
            android.content.Intent r3 = X.C627736r.A0K(r13, r3, r4, r1, r0)
            goto L_0x00c1
        L_0x00d8:
            X.3Mh r1 = r2.A03
            X.1Ei r0 = X.C66663Mh.A0d
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x00e9
            r0 = 2131891914(0x7f1216ca, float:1.9418561E38)
            r13.Bot(r0)
            goto L_0x0071
        L_0x00e9:
            X.5WY r12 = r2.A02
            r21 = 0
            java.lang.String r0 = r2.A0B
            r15 = 0
            java.lang.Integer r16 = X.C18290x4.A0a()
            android.os.Bundle r14 = r2.A01
            r19 = r15
            r20 = r15
            r17 = r0
            r18 = r15
            android.content.Intent r1 = r12.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1.putExtras(r14)
            r0 = 48
            r13.BpY(r1, r0)
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9H2.A0C(java.lang.Object):void");
    }

    public AnonymousClass9H2(Bundle bundle, C89654ea r5, AnonymousClass5WY r6, C66663Mh r7, C56492s4 r8, C620733j r9, C166587yw r10, C624034w r11, AnonymousClass33K r12, C153087ae r13, String str) {
        this.A0C = AnonymousClass0x9.A14(r5);
        this.A04 = r8;
        this.A03 = r7;
        this.A02 = r6;
        this.A05 = r9;
        this.A08 = r12;
        this.A09 = r13;
        this.A0B = str;
        this.A06 = r10;
        this.A07 = r11;
        this.A01 = bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (r2.getBoolean("children_skippable") == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        if (r15 == 2) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A0G(org.json.JSONArray r14, int r15) {
        /*
            r13 = this;
            int r0 = r14.length()
            r10 = 0
            if (r0 != 0) goto L_0x0008
            return r10
        L_0x0008:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            r3 = 0
        L_0x000d:
            int r0 = r14.length()
            if (r3 >= r0) goto L_0x00a4
            org.json.JSONObject r2 = r14.getJSONObject(r3)
            java.lang.String r0 = "id"
            java.lang.String r7 = r2.getString(r0)
            java.lang.String r0 = "title"
            java.lang.String r8 = r2.getString(r0)
            java.lang.String r1 = "children"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x00a2
            org.json.JSONArray r0 = r2.getJSONArray(r1)
            java.util.ArrayList r11 = r13.A0G(r0, r15)
        L_0x0033:
            java.lang.String r1 = "children_skippable"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x0042
            boolean r0 = r2.getBoolean(r1)
            r12 = 1
            if (r0 != 0) goto L_0x0043
        L_0x0042:
            r12 = 0
        L_0x0043:
            r5 = 2
            if (r15 != r5) goto L_0x008b
            java.lang.String r1 = "description"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x008b
            java.lang.String r9 = r2.getString(r1)
        L_0x0052:
            java.lang.String r1 = "chat_support"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x008f
            org.json.JSONObject r6 = r2.getJSONObject(r1)
            java.lang.String r0 = "auth_required"
            boolean r5 = r6.getBoolean(r0)
            java.lang.String r1 = "required_data"
            boolean r0 = r6.has(r1)
            if (r0 == 0) goto L_0x0085
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            org.json.JSONArray r6 = r6.getJSONArray(r1)
            r1 = 0
        L_0x0075:
            int r0 = r6.length()
            if (r1 >= r0) goto L_0x0091
            java.lang.String r0 = r6.getString(r1)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x0075
        L_0x0085:
            X.7yQ r6 = new X.7yQ
            r6.<init>(r10, r5)
            goto L_0x0096
        L_0x008b:
            r9 = r10
            if (r15 != r5) goto L_0x008f
            goto L_0x0052
        L_0x008f:
            r6 = r10
            goto L_0x0096
        L_0x0091:
            X.7yQ r6 = new X.7yQ
            r6.<init>(r2, r5)
        L_0x0096:
            X.5dq r5 = new X.5dq
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r4.add(r5)
            int r3 = r3 + 1
            goto L_0x000d
        L_0x00a2:
            r11 = r10
            goto L_0x0033
        L_0x00a4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9H2.A0G(org.json.JSONArray, int):java.util.ArrayList");
    }
}
