package X;

import android.content.Context;

/* renamed from: X.9Ri  reason: invalid class name and case insensitive filesystem */
public class C194039Ri {
    public Context A00;
    public AnonymousClass9U4 A01;
    public final C116985rC A02;
    public final C56972sr A03;
    public final C160757oG A04 = C160757oG.A00("PaymentMethodNotificationUtil", "notification", "COMMON");

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        if ((2 - r0) == 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        r1 = X.AnonymousClass0x9.A08(r7, com.whatsapp.payments.ui.BusinessHubActivity.class);
        r1.addFlags(335544320);
        r1.putExtra("extra_force_get_methods", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008a, code lost:
        return X.C624735e.A00(r7, 0, r1, 268435456);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
        r1 = X.C1899593h.A06(r7, r8, com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity.class);
        r1.addFlags(268435456);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.PendingIntent A00(android.content.Context r7, X.C166587yw r8, java.lang.String r9) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x000f
            X.6hx r0 = r8.A08
            if (r0 == 0) goto L_0x000f
            int r0 = r9.hashCode()
            r5 = 1
            r4 = 0
            switch(r0) {
                case -1573204880: goto L_0x0095;
                case -945151213: goto L_0x0067;
                case -863506419: goto L_0x005d;
                case -188177059: goto L_0x0053;
                case 1084491615: goto L_0x0049;
                default: goto L_0x000f;
            }
        L_0x000f:
            r5 = 335544320(0x14000000, float:6.4623485E-27)
            r4 = 0
            X.9U4 r0 = r6.A01
            X.9oC r0 = r0.A0G()
            if (r8 == 0) goto L_0x002f
            java.lang.Class r0 = r0.B42()
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r7, r0)
            r1.addFlags(r5)
            java.lang.String r0 = "extra_bank_account"
            r1.putExtra(r0, r8)
        L_0x002a:
            android.app.PendingIntent r0 = X.C624735e.A00(r7, r4, r1, r4)
            return r0
        L_0x002f:
            java.lang.Class r3 = r0.BBA()
            X.7oG r2 = r6.A04
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "getPendingIntent for "
            r1.append(r0)
            X.C1899593h.A1J(r2, r9, r1)
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r7, r3)
            r1.addFlags(r5)
            goto L_0x002a
        L_0x0049:
            java.lang.String r0 = "MERCHANT_VERIFIED"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000f
            r0 = 4
            goto L_0x0070
        L_0x0053:
            java.lang.String r0 = "MERCHANT_VERIFICATION_FAILURE"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000f
            r0 = 3
            goto L_0x0070
        L_0x005d:
            java.lang.String r0 = "PAYMENT_METHOD_VERIFIED"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000f
            r0 = 2
            goto L_0x0070
        L_0x0067:
            java.lang.String r0 = "MERCHANT_DISABLED"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000f
            r0 = 1
        L_0x0070:
            r3 = 335544320(0x14000000, float:6.4623485E-27)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            int r0 = 2 - r0
            if (r0 == 0) goto L_0x008b
            java.lang.Class<com.whatsapp.payments.ui.BusinessHubActivity> r0 = com.whatsapp.payments.ui.BusinessHubActivity.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r7, r0)
            r1.addFlags(r3)
            java.lang.String r0 = "extra_force_get_methods"
            r1.putExtra(r0, r5)
        L_0x0086:
            android.app.PendingIntent r0 = X.C624735e.A00(r7, r4, r1, r2)
            return r0
        L_0x008b:
            java.lang.Class<com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity> r0 = com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity.class
            android.content.Intent r1 = X.C1899593h.A06(r7, r8, r0)
            r1.addFlags(r2)
            goto L_0x0086
        L_0x0095:
            java.lang.String r0 = "MERCHANT_LINKED"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.5rC r0 = r6.A02
            r0.A04()
            java.lang.String r0 = "getOrdersActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194039Ri.A00(android.content.Context, X.7yw, java.lang.String):android.app.PendingIntent");
    }

    public C194039Ri(Context context, C116985rC r5, C56972sr r6, AnonymousClass9U4 r7) {
        this.A00 = context;
        this.A01 = r7;
        this.A03 = r6;
        this.A02 = r5;
    }
}
