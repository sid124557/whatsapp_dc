package X;

import java.lang.ref.WeakReference;

/* renamed from: X.1t2  reason: invalid class name */
public class AnonymousClass1t2 extends AnonymousClass5ZM {
    public final C84894Ed A00;
    public final C369320h A01;
    public final WeakReference A02;

    public AnonymousClass1t2(C89654ea r2, C84894Ed r3, C369320h r4) {
        super(r2, true);
        this.A02 = AnonymousClass0x9.A14(r2);
        this.A00 = r3;
        this.A01 = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0093 A[SYNTHETIC, Splitter:B:17:0x0093] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r15) {
        /*
            r14 = this;
            X.4Ed r1 = r14.A00
            X.20h r3 = r14.A01
            com.whatsapp.report.ReportActivity r1 = (com.whatsapp.report.ReportActivity) r1
            X.20h r0 = X.C369320h.ACCOUNT
            if (r3 != r0) goto L_0x0089
            X.8qC r0 = r1.A0E
        L_0x000c:
            java.lang.Object r0 = r0.get()
            X.3Lm r0 = (X.C66453Lm) r0
            if (r0 == 0) goto L_0x0091
            X.5Hn r5 = r1.A06
            X.5Hp r4 = new X.5Hp
            r4.<init>(r0, r1)
            X.31C r7 = r5.A01
            java.lang.String r10 = r7.A03()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GdprXmppMethods/sendGetGdprReport; iq="
            X.C18260x0.A0s(r0, r10, r1)
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.lang.String r1 = "action"
            java.lang.String r0 = "status"
            X.AnonymousClass39V.A03(r1, r0, r2)
            X.20h r0 = X.C369320h.NEWSLETTER
            if (r3 != r0) goto L_0x0043
            java.lang.String r1 = "report_type"
            java.lang.String r0 = "newsletters"
            X.AnonymousClass39V.A03(r1, r0, r2)
        L_0x0043:
            r6 = 0
            X.39V[] r1 = X.C18300x5.A1Z(r2, r6)
            java.lang.String r0 = "gdpr"
            X.36K r3 = X.AnonymousClass36K.A0I(r0, r1)
            X.39V[] r2 = X.AnonymousClass0x9.A1W()
            X.AnonymousClass39V.A0E(r2, r6)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "urn:xmpp:whatsapp:account"
            X.AnonymousClass39V.A05(r1, r0, r2)
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.AnonymousClass39V.A06(r1, r0, r2)
            java.lang.String r0 = "id"
            X.36K r9 = X.AnonymousClass36K.A0E(r3, r0, r10, r2)
            X.6bK r6 = new X.6bK
            r6.<init>()
            r0 = 17
            X.4KX r8 = new X.4KX
            r8.<init>(r6, r5, r4, r0)
            r11 = 168(0xa8, float:2.35E-43)
            r12 = 32000(0x7d00, double:1.581E-319)
            r7.A0D(r8, r9, r10, r11, r12)
        L_0x007f:
            r3 = 0
            if (r6 != 0) goto L_0x0093
            java.lang.String r0 = "send-get-gdpr-report/failed/callback is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        L_0x0089:
            X.20h r0 = X.C369320h.NEWSLETTER
            if (r3 != r0) goto L_0x0091
            X.8qC r0 = r1.A0F
            goto L_0x000c
        L_0x0091:
            r6 = 0
            goto L_0x007f
        L_0x0093:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x009b }
            r0 = 32000(0x7d00, double:1.581E-319)
            r6.get(r0, r2)     // Catch:{ Exception -> 0x009b }
            return r3
        L_0x009b:
            r1 = move-exception
            java.lang.String r0 = "send-get-gdpr-report/timeout"
            com.whatsapp.util.Log.w(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1t2.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C89654ea A0F = C18320x8.A0F(this.A02);
        if (A0F != null && !A0F.BHW()) {
            this.A00.BiY(this.A01);
        }
    }
}
