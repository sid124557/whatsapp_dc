package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Vv  reason: invalid class name and case insensitive filesystem */
public class C195089Vv {
    public final C54292oU A00;

    public static JSONArray A00(List list) {
        String str;
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass99G r3 = (AnonymousClass99G) it.next();
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.put("bank_code", r3.A02);
                A1G.put("bank_name", r3.A01);
                A1G.put("short_name", r3.A03);
                if (r3.A04) {
                    str = "1";
                } else {
                    str = "0";
                }
                A1G.put("accept_savings", str);
                jSONArray.put(A1G);
            }
            return jSONArray;
        } catch (JSONException e) {
            Log.e(AnonymousClass000.A0P(e, "PAY: BrazilPayBloksActivity payoutBanksToJsonArrayException: ", AnonymousClass001.A0o()), e);
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0057, code lost:
        if (r0 == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00df, code lost:
        r0 = X.AnonymousClass002.A0F(r3, r8.A04, new java.lang.Object[1], 0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f9, code lost:
        r0 = X.AnonymousClass0x9.A0G(r4, r0);
        r7 = (java.lang.String) r0.A00;
        r4 = r0.A01;
        r5.put("card_verify_otp_type", r2);
        r1 = r8.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010e, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0110, code lost:
        r5.put("card_verify_otp_receiver_info", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0115, code lost:
        r5.put("card_verify_otp_resend_interval_sec", java.lang.String.valueOf(r8.A01));
        r9 = r8.A00;
        r5.put("otp_length", java.lang.String.valueOf(r9));
        r2 = X.AnonymousClass001.A0o();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0135, code lost:
        if (r1 >= r9) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0137, code lost:
        r2.append("#  ");
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013f, code lost:
        r5.put("otp_mask", r2.toString().trim());
        r5.put("card_verify_method_disabled_state", r8.A0C);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONArray A02(java.util.List r17) {
        /*
            r16 = this;
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x01d2 }
            r6.<init>()     // Catch:{ JSONException -> 0x01d2 }
            java.util.Iterator r15 = r17.iterator()     // Catch:{ JSONException -> 0x01d2 }
        L_0x0009:
            boolean r0 = r15.hasNext()     // Catch:{ JSONException -> 0x01d2 }
            if (r0 == 0) goto L_0x01d1
            java.lang.Object r8 = r15.next()     // Catch:{ JSONException -> 0x01d2 }
            X.9eV r8 = (X.C198179eV) r8     // Catch:{ JSONException -> 0x01d2 }
            org.json.JSONObject r5 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r1 = "card_verify_identifier"
            java.lang.String r0 = r8.A03     // Catch:{ JSONException -> 0x01d2 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r0 = "card_verify_type"
            java.lang.String r3 = r8.A0B     // Catch:{ JSONException -> 0x01d2 }
            r5.put(r0, r3)     // Catch:{ JSONException -> 0x01d2 }
            X.C626936e.A06(r3)     // Catch:{ JSONException -> 0x01d2 }
            int r1 = r3.hashCode()     // Catch:{ JSONException -> 0x01d2 }
            r0 = -1302107194(0xffffffffb2636bc6, float:-1.3237644E-8)
            r2 = 2
            r9 = 0
            r11 = 1
            if (r1 == r0) goto L_0x0050
            r0 = -119226117(0xfffffffff8e4c0fb, float:-3.711743E34)
            if (r1 == r0) goto L_0x0048
            r0 = 110379(0x1af2b, float:1.54674E-40)
            if (r1 != r0) goto L_0x0059
            java.lang.String r0 = "otp"
            boolean r0 = r3.equals(r0)     // Catch:{ JSONException -> 0x01d2 }
            r1 = 0
            goto L_0x0057
        L_0x0048:
            java.lang.String r0 = "app-to-app"
            boolean r0 = r3.equals(r0)     // Catch:{ JSONException -> 0x01d2 }
            r1 = 2
            goto L_0x0057
        L_0x0050:
            java.lang.String r0 = "customer-service"
            boolean r0 = r3.equals(r0)     // Catch:{ JSONException -> 0x01d2 }
            r1 = 1
        L_0x0057:
            if (r0 != 0) goto L_0x005a
        L_0x0059:
            r1 = -1
        L_0x005a:
            java.lang.String r10 = "card_verify_method_disabled_state"
            r0 = r16
            if (r1 == 0) goto L_0x0092
            if (r1 == r11) goto L_0x0069
            if (r1 == r2) goto L_0x0150
            java.lang.String r7 = ""
            r4 = r7
            goto L_0x01a5
        L_0x0069:
            X.2oU r4 = r0.A00     // Catch:{ JSONException -> 0x01d2 }
            r1 = 2131887042(0x7f1203c2, float:1.940868E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r4)     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r7 = r0.getString(r1)     // Catch:{ JSONException -> 0x01d2 }
            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r2 = r8.A0A     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r0 = X.C192789Lo.A00(r2)     // Catch:{ JSONException -> 0x01d2 }
            r3[r9] = r0     // Catch:{ JSONException -> 0x01d2 }
            r1 = 2131887041(0x7f1203c1, float:1.9408678E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r4)     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r4 = r0.getString(r1, r3)     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r0 = "support_phone_number"
            r5.put(r0, r2)     // Catch:{ JSONException -> 0x01d2 }
            goto L_0x01a5
        L_0x0092:
            X.2oU r0 = r0.A00     // Catch:{ JSONException -> 0x01d2 }
            android.content.Context r3 = r0.A00     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r4 = ""
            java.lang.String r2 = r8.A05     // Catch:{ JSONException -> 0x01d2 }
            int r0 = r2.hashCode()     // Catch:{ JSONException -> 0x01d2 }
            switch(r0) {
                case 82233: goto L_0x00a3;
                case 2467610: goto L_0x00b6;
                case 66081660: goto L_0x00cd;
                case 81425707: goto L_0x00e8;
                default: goto L_0x00a1;
            }     // Catch:{ JSONException -> 0x01d2 }
        L_0x00a1:
            goto L_0x0133
        L_0x00a3:
            java.lang.String r0 = "SMS"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x01d2 }
            if (r0 == 0) goto L_0x0133
            r0 = 2131887048(0x7f1203c8, float:1.9408692E38)
            java.lang.String r4 = r3.getString(r0)     // Catch:{ JSONException -> 0x01d2 }
            r7 = 2131887047(0x7f1203c7, float:1.940869E38)
            goto L_0x00df
        L_0x00b6:
            java.lang.String r0 = "PUSH"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x01d2 }
            if (r0 == 0) goto L_0x0133
            r0 = 2131887044(0x7f1203c4, float:1.9408684E38)
            java.lang.String r4 = r3.getString(r0)     // Catch:{ JSONException -> 0x01d2 }
            r0 = 2131887043(0x7f1203c3, float:1.9408682E38)
            java.lang.String r0 = r3.getString(r0)     // Catch:{ JSONException -> 0x01d2 }
            goto L_0x00f9
        L_0x00cd:
            java.lang.String r0 = "EMAIL"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x01d2 }
            if (r0 == 0) goto L_0x0133
            r0 = 2131887046(0x7f1203c6, float:1.9408688E38)
            java.lang.String r4 = r3.getString(r0)     // Catch:{ JSONException -> 0x01d2 }
            r7 = 2131887045(0x7f1203c5, float:1.9408686E38)
        L_0x00df:
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r0 = r8.A04     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r0 = X.AnonymousClass002.A0F(r3, r0, r1, r9, r7)     // Catch:{ JSONException -> 0x01d2 }
            goto L_0x00f9
        L_0x00e8:
            java.lang.String r0 = "VACAT"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x01d2 }
            if (r0 == 0) goto L_0x0133
            r0 = 2131887048(0x7f1203c8, float:1.9408692E38)
            java.lang.String r1 = r3.getString(r0)     // Catch:{ JSONException -> 0x01d2 }
            r0 = r4
            r4 = r1
        L_0x00f9:
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r4, r0)     // Catch:{ JSONException -> 0x01d2 }
            java.lang.Object r7 = r0.A00     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ JSONException -> 0x01d2 }
            java.lang.Object r4 = r0.A01     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r0 = "card_verify_otp_type"
            r5.put(r0, r2)     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r1 = r8.A04     // Catch:{ JSONException -> 0x01d2 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x01d2 }
            if (r0 != 0) goto L_0x0115
            java.lang.String r0 = "card_verify_otp_receiver_info"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x01d2 }
        L_0x0115:
            java.lang.String r1 = "card_verify_otp_resend_interval_sec"
            int r0 = r8.A01     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x01d2 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r1 = "otp_length"
            int r9 = r8.A00     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ JSONException -> 0x01d2 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r3 = "otp_mask"
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ JSONException -> 0x01d2 }
            r1 = 0
            goto L_0x0135
        L_0x0133:
            r0 = r4
            goto L_0x00f9
        L_0x0135:
            if (r1 >= r9) goto L_0x013f
            java.lang.String r0 = "#  "
            r2.append(r0)     // Catch:{ JSONException -> 0x01d2 }
            int r1 = r1 + 1
            goto L_0x0135
        L_0x013f:
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r0 = r0.trim()     // Catch:{ JSONException -> 0x01d2 }
            r5.put(r3, r0)     // Catch:{ JSONException -> 0x01d2 }
            boolean r0 = r8.A0C     // Catch:{ JSONException -> 0x01d2 }
            r5.put(r10, r0)     // Catch:{ JSONException -> 0x01d2 }
            goto L_0x01a5
        L_0x0150:
            java.lang.String r12 = r8.A07     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r2 = r8.A08     // Catch:{ JSONException -> 0x01d2 }
            X.0PJ r3 = X.AnonymousClass9UN.A00(r12, r2)     // Catch:{ JSONException -> 0x01d2 }
            X.2oU r13 = r0.A00     // Catch:{ JSONException -> 0x01d2 }
            r1 = 2131887040(0x7f1203c0, float:1.9408676E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r13)     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r7 = r0.getString(r1)     // Catch:{ JSONException -> 0x01d2 }
            if (r3 == 0) goto L_0x01ba
            java.lang.Object r14 = r3.A00     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ JSONException -> 0x01d2 }
            java.lang.Object r4 = r3.A01     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r3 = r8.A09     // Catch:{ JSONException -> 0x01d2 }
            android.content.Intent r1 = X.C18320x8.A07()     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r0 = "android.intent.extra.TEXT"
            r1.putExtra(r0, r3)     // Catch:{ JSONException -> 0x01d2 }
            r1.setPackage(r14)     // Catch:{ JSONException -> 0x01d2 }
            r1.setAction(r4)     // Catch:{ JSONException -> 0x01d2 }
            android.content.Context r0 = r13.A00     // Catch:{ JSONException -> 0x01d2 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ JSONException -> 0x01d2 }
            android.content.ComponentName r0 = r1.resolveActivity(r0)     // Catch:{ JSONException -> 0x01d2 }
            if (r0 == 0) goto L_0x01ba
            java.lang.String r4 = r8.A06     // Catch:{ JSONException -> 0x01d2 }
            r3 = r4
        L_0x018f:
            java.lang.String r1 = "app_to_app_request_payload"
            java.lang.String r0 = r8.A09     // Catch:{ JSONException -> 0x01d2 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r0 = "app_to_app_partner_app_package"
            r5.put(r0, r12)     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r0 = "app_to_app_partner_app_name"
            r5.put(r0, r3)     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r0 = "app_to_app_partner_intent_action"
            r5.put(r0, r2)     // Catch:{ JSONException -> 0x01d2 }
        L_0x01a5:
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x01d2 }
            if (r0 != 0) goto L_0x01b5
            java.lang.String r0 = "card_verify_method_title"
            r5.put(r0, r7)     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r0 = "card_verify_method_description"
            r5.put(r0, r4)     // Catch:{ JSONException -> 0x01d2 }
        L_0x01b5:
            r6.put(r5)     // Catch:{ JSONException -> 0x01d2 }
            goto L_0x0009
        L_0x01ba:
            r5.put(r10, r11)     // Catch:{ JSONException -> 0x01d2 }
            r8.A0C = r11     // Catch:{ JSONException -> 0x01d2 }
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r3 = r8.A06     // Catch:{ JSONException -> 0x01d2 }
            r4[r9] = r3     // Catch:{ JSONException -> 0x01d2 }
            r1 = 2131887039(0x7f1203bf, float:1.9408674E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r13)     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r4 = r0.getString(r1, r4)     // Catch:{ JSONException -> 0x01d2 }
            goto L_0x018f
        L_0x01d1:
            return r6
        L_0x01d2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: BrazilPayBloksActivity cardVerifyMethodsToJsonArray: "
            X.C18260x0.A1Q(r1, r0, r2)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195089Vv.A02(java.util.List):org.json.JSONArray");
    }

    public C195089Vv(C54292oU r1) {
        this.A00 = r1;
    }

    public static boolean A01(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((C198179eV) it.next()).A0C) {
                return false;
            }
        }
        return true;
    }

    public JSONObject A03(List list) {
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C133786hw r5 = (C133786hw) it.next();
                C133736hr r6 = (C133736hr) r5.A07();
                JSONObject A1G2 = AnonymousClass0x9.A1G();
                A1G2.put("credential_id", r5.A0H);
                if (r6 != null) {
                    A1G2.put("network_name", C133736hr.A02(r6.A01));
                }
                if (!TextUtils.isEmpty(r5.A0E)) {
                    A1G2.put("card_image_url", r5.A0E);
                }
                A1G2.put("last4", r5.A0J);
                A1G2.put("readable_name", C195169Wk.A02(this.A00.A00, r6));
                A1G2.put("verified_state", r5.A0a);
                jSONArray.put(A1G2);
            }
            A1G.put("card_list", jSONArray);
            return A1G;
        } catch (JSONException e) {
            Log.e("PAY: BrazilPayBloksActivity BrazilCardsToJsonArrayException: ", e);
            return null;
        }
    }
}
