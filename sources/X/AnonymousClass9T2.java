package X;

import android.content.Context;

/* renamed from: X.9T2  reason: invalid class name */
public class AnonymousClass9T2 {
    public final C195909Zz A00;
    public final C1907099n A01;

    public void A00(Context context, C95814uZ r11, AnonymousClass39S r12, AnonymousClass2z0 r13, String str, int i) {
        A01(context, r11, r12, r13, r12.A0D, str, r12.A0E, i);
    }

    public void A02(Context context, C95814uZ r11, AnonymousClass2z0 r12, String str) {
        A01(context, r11, (AnonymousClass39S) null, r12, (String) null, (String) null, str, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (r0 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r2 != null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r0 == null) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Context r8, X.C95814uZ r9, X.AnonymousClass39S r10, X.AnonymousClass2z0 r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15) {
        /*
            r7 = this;
            java.lang.String r3 = "chat"
            X.99n r5 = r7.A01
            boolean r0 = r5.A01()
            if (r0 == 0) goto L_0x002b
            boolean r0 = r5.A0K(r12)
            if (r0 == 0) goto L_0x002b
            X.9Zz r0 = r7.A00
            X.9U4 r4 = r0.A0B
            java.lang.String r0 = "P2M_LITE"
            X.9oC r0 = r4.A0H(r0)
            if (r0 != 0) goto L_0x0043
        L_0x001c:
            java.lang.String r0 = "GLOBAL_ORDER"
            X.9oC r0 = r4.A0H(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Class r0 = r0.BAk()
            if (r0 != 0) goto L_0x004a
        L_0x002a:
            return
        L_0x002b:
            r2 = 1
            if (r15 == r2) goto L_0x005b
            r0 = 2
            r1 = 0
            if (r15 == r0) goto L_0x0057
            r0 = 3
            if (r15 == r0) goto L_0x0054
            r0 = 4
            if (r15 == r0) goto L_0x004f
            r1 = 5
            X.9Zz r0 = r7.A00
            if (r15 == r1) goto L_0x0076
            X.9U4 r4 = r0.A0B
            X.9oC r0 = r4.A0G()
        L_0x0043:
            java.lang.Class r0 = r0.BAk()
            if (r0 != 0) goto L_0x004a
            goto L_0x001c
        L_0x004a:
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r8, r0)
            goto L_0x0093
        L_0x004f:
            X.9Zz r0 = r7.A00
            java.lang.String r1 = "canceled"
            goto L_0x0078
        L_0x0054:
            X.9Zz r0 = r7.A00
            goto L_0x0078
        L_0x0057:
            X.9Zz r0 = r7.A00
            r6 = -1
            goto L_0x0079
        L_0x005b:
            X.9Zz r0 = r7.A00
            X.9U4 r4 = r0.A0B
            X.9oC r0 = r4.A0G()
            java.lang.Class r0 = r0.BB7()
            if (r0 == 0) goto L_0x001c
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r8, r0)
            java.lang.String r0 = "extra_is_quick_buy"
            android.content.Intent r2 = r1.putExtra(r0, r2)
            if (r2 != 0) goto L_0x0093
            goto L_0x001c
        L_0x0076:
            java.lang.String r1 = "completed"
        L_0x0078:
            r6 = 6
        L_0x0079:
            X.9U4 r4 = r0.A0B
            X.9oC r0 = r4.A0G()
            java.lang.Class r0 = r0.BAk()
            if (r0 == 0) goto L_0x001c
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r8, r0)
            java.lang.String r0 = "extra_quick_launch_option"
            r2.putExtra(r0, r6)
            java.lang.String r0 = "extra_quick_launch_action"
            r2.putExtra(r0, r1)
        L_0x0093:
            X.C107395bF.A00(r2, r11)
            java.lang.String r0 = "extra_order_id"
            r2.putExtra(r0, r14)
            if (r10 == 0) goto L_0x00ce
            X.39H r4 = r10.A07
            java.lang.String r1 = r4.A07
            java.lang.String r0 = "extra_order_discount_program_name"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "extra_order_type"
            java.lang.String r0 = r10.A0G
            r2.putExtra(r1, r0)
            java.util.List r6 = r10.A0K
            if (r6 == 0) goto L_0x00ba
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r6)
            java.lang.String r0 = "extra_payment_settings"
            r2.putParcelableArrayListExtra(r0, r1)
        L_0x00ba:
            X.393 r0 = r4.A02
            if (r0 == 0) goto L_0x00c5
            java.lang.String r4 = "extra_order_expiry_ts_in_sec"
            long r0 = r0.A00
            r2.putExtra(r4, r0)
        L_0x00c5:
            boolean r1 = r5.A0M(r6)
            java.lang.String r0 = "extra_checkout_lite_enabled"
            r2.putExtra(r0, r1)
        L_0x00ce:
            java.lang.String r1 = "extra_transaction_type"
            java.lang.String r0 = "p2m"
            r2.putExtra(r1, r0)
            java.lang.String r0 = "extra_payment_config_id"
            r2.putExtra(r0, r13)
            java.lang.String r0 = "referral_screen"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "extra_payment_type"
            r2.putExtra(r0, r12)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r2.setFlags(r0)
            java.lang.String r0 = "extra_jid"
            X.AnonymousClass0x2.A0u(r2, r9, r0)
            r8.startActivity(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9T2.A01(android.content.Context, X.4uZ, X.39S, X.2z0, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public AnonymousClass9T2(C195909Zz r1, C1907099n r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
