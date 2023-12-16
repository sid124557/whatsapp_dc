package X;

import android.content.Intent;
import android.text.TextUtils;

/* renamed from: X.9WY  reason: invalid class name */
public class AnonymousClass9WY {
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        if (r1.equals(r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(X.C195179Wl r5) {
        /*
            r4 = 1
            if (r5 == 0) goto L_0x0033
            java.lang.String r0 = r5.A0O
            boolean r0 = X.C194759Uj.A00(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = r5.A0B
            java.lang.String r3 = r5.A0A
            if (r0 == 0) goto L_0x0028
            if (r3 == 0) goto L_0x0028
            r2 = 0
            java.lang.Float r0 = X.C615531h.A05(r0, r2)
            float r1 = r0.floatValue()
            java.lang.Float r0 = X.C615531h.A05(r3, r2)
            float r0 = r0.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0033
        L_0x0028:
            java.lang.String r1 = r5.A0C
            if (r1 == 0) goto L_0x005e
            int r0 = r1.hashCode()
            switch(r0) {
                case 1536: goto L_0x0034;
                case 1537: goto L_0x0037;
                case 1538: goto L_0x003a;
                case 1539: goto L_0x003d;
                case 1540: goto L_0x0040;
                case 1541: goto L_0x0043;
                case 1542: goto L_0x0046;
                case 1543: goto L_0x0049;
                case 1544: goto L_0x004c;
                case 1545: goto L_0x004f;
                case 1568: goto L_0x0052;
                case 1603: goto L_0x0055;
                default: goto L_0x0033;
            }
        L_0x0033:
            return r4
        L_0x0034:
            java.lang.String r0 = "00"
            goto L_0x0057
        L_0x0037:
            java.lang.String r0 = "01"
            goto L_0x0057
        L_0x003a:
            java.lang.String r0 = "02"
            goto L_0x0057
        L_0x003d:
            java.lang.String r0 = "03"
            goto L_0x0057
        L_0x0040:
            java.lang.String r0 = "04"
            goto L_0x0057
        L_0x0043:
            java.lang.String r0 = "05"
            goto L_0x0057
        L_0x0046:
            java.lang.String r0 = "06"
            goto L_0x0057
        L_0x0049:
            java.lang.String r0 = "07"
            goto L_0x0057
        L_0x004c:
            java.lang.String r0 = "08"
            goto L_0x0057
        L_0x004f:
            java.lang.String r0 = "09"
            goto L_0x0057
        L_0x0052:
            java.lang.String r0 = "11"
            goto L_0x0057
        L_0x0055:
            java.lang.String r0 = "25"
        L_0x0057:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005e
            return r4
        L_0x005e:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9WY.A04(X.9Wl):boolean");
    }

    public static int A00(C66663Mh r2, C195179Wl r3) {
        C22071Ek r0;
        String str;
        if (r3.A0P || (str = r3.A02) == null || (!str.equals("GALLERY_QR_CODE") && !str.equals("DEEP_LINK"))) {
            r0 = C66663Mh.A1l;
        } else {
            r0 = C66663Mh.A1k;
        }
        return r2.A03(r0);
    }

    public static void A03(Intent intent, C195179Wl r3, String str) {
        intent.putExtra("extra_new_mandate_transaction", true);
        intent.putExtra("extra_new_mandate_payee_name", r3.A09);
        intent.putExtra("extra_new_mandate_preset_amount", r3.A0A);
        intent.putExtra("extra_new_mandate_transaction_ref", r3.A0K);
        intent.putExtra("extra_new_mandate_merchant_code", r3.A06);
        intent.putExtra("extra_new_mandate_initiation_mode", r3.A04);
        intent.putExtra("extra_new_mandate_purpose_code", r3.A0C);
        intent.putExtra("extra_new_mandate_vpa", r3.A0O);
        intent.putExtra("extra_new_mandate_sign", r3.A0I);
        intent.putExtra("extra_new_mandate_amount_rule", r3.A00);
        intent.putExtra("extra_new_mandate_note", r3.A07);
        intent.putExtra("extra_new_mandate_mandate_name", r3.A05);
        intent.putExtra("extra_new_mandate_validity_start", r3.A0N);
        intent.putExtra("extra_new_mandate_validity_end", r3.A0M);
        intent.putExtra("extra_new_mandate_frequency", r3.A03);
        intent.putExtra("extra_new_mandate_recurrence_day", r3.A0D);
        intent.putExtra("extra_new_mandate_recurrence_rule", r3.A0E);
        intent.putExtra("extra_new_mandate_rev", r3.A0G);
        intent.putExtra("extra_new_mandate_share", r3.A0H);
        intent.putExtra("extra_new_mandate_block", r3.A01);
        intent.putExtra("extra_new_mandate_unique_mandate_number", r3.A0L);
        intent.putExtra("referral_screen", str);
        intent.addFlags(33554432);
    }

    public static boolean A05(String str) {
        if ("photo_received".equals(str) || "photo_received_gallery".equals(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x006e, code lost:
        if (r0 == false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Intent r4, X.C66663Mh r5, X.C95814uZ r6, X.C195179Wl r7) {
        /*
            X.3QD r2 = X.AnonymousClass3QD.A00()
            java.lang.String r1 = r7.A0O
            java.lang.String r0 = "upiHandle"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            X.7yt r1 = X.C1899693i.A0F(r2, r3, r1, r0)
            java.lang.String r0 = "extra_payment_handle"
            r4.putExtra(r0, r1)
            java.lang.String r1 = "extra_merchant_code"
            java.lang.String r0 = r7.A06
            r4.putExtra(r1, r0)
            java.lang.String r1 = "extra_transaction_ref"
            java.lang.String r0 = r7.A0K
            r4.putExtra(r1, r0)
            X.3QD r2 = X.AnonymousClass3QD.A00()
            java.lang.String r1 = r7.A09
            java.lang.String r0 = "accountHolderName"
            X.7yt r1 = X.C1899693i.A0F(r2, r3, r1, r0)
            java.lang.String r0 = "extra_payee_name"
            r4.putExtra(r0, r1)
            java.lang.String r1 = "extra_transaction_ref_url"
            java.lang.String r0 = r7.A0F
            r4.putExtra(r1, r0)
            java.lang.String r1 = "extra_initiation_mode"
            java.lang.String r0 = r7.A04
            r4.putExtra(r1, r0)
            java.lang.String r1 = "extra_purpose_code"
            java.lang.String r0 = r7.A0C
            r4.putExtra(r1, r0)
            java.lang.String r1 = "extra_payment_preset_amount"
            java.lang.String r0 = r7.A0A
            r4.putExtra(r1, r0)
            java.lang.String r1 = "extra_transaction_id"
            java.lang.String r0 = r7.A0J
            r4.putExtra(r1, r0)
            java.lang.String r1 = "extra_payment_preset_min_amount"
            java.lang.String r0 = r7.A0B
            r4.putExtra(r1, r0)
            java.lang.String r1 = "extra_skip_value_props_display"
            r0 = 0
            r4.putExtra(r1, r0)
            java.lang.String r1 = r7.A02
            if (r1 == 0) goto L_0x0070
            java.lang.String r0 = "DEEP_LINK"
            boolean r0 = r1.equals(r0)
            r1 = 9
            if (r0 != 0) goto L_0x0072
        L_0x0070:
            r1 = 8
        L_0x0072:
            java.lang.String r0 = "extra_payments_entry_type"
            r4.putExtra(r0, r1)
            int r0 = A00(r5, r7)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "extra_payment_preset_max_amount"
            r4.putExtra(r0, r1)
            java.lang.String r1 = "extra_is_first_payment_method"
            r0 = 1
            r4.putExtra(r1, r0)
            if (r6 == 0) goto L_0x0096
            java.lang.String r1 = r6.getRawString()
        L_0x0090:
            java.lang.String r0 = "extra_chat_jid"
            r4.putExtra(r0, r1)
            return
        L_0x0096:
            java.lang.String r1 = ""
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9WY.A01(android.content.Intent, X.3Mh, X.4uZ, X.9Wl):void");
    }

    public static void A02(Intent intent, C66663Mh r4, C95814uZ r5, C195179Wl r6, String str, boolean z) {
        A01(intent, r4, r5, r6);
        intent.putExtra("referral_screen", str);
        intent.putExtra("extra_is_pay_money_only", !TextUtils.isEmpty(r6.A0A));
        intent.putExtra("return-after-pay", "DEEP_LINK".equals(r6.A02));
        intent.putExtra("verify-vpa-in-background", true);
        if (A05(str)) {
            intent.putExtra("extra_payment_preset_max_amount", String.valueOf(r4.A03(C66663Mh.A1l)));
        }
        if (z) {
            intent.addFlags(33554432);
        }
    }
}
