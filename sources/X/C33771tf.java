package X;

import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.1tf  reason: invalid class name and case insensitive filesystem */
public class C33771tf extends AnonymousClass5ZM {
    public final C69263Wi A00;
    public final C84894Ed A01;
    public final C369320h A02;
    public final WeakReference A03;

    public C33771tf(C89654ea r2, C69263Wi r3, C84894Ed r4, C369320h r5) {
        super(r2, true);
        this.A03 = AnonymousClass0x9.A14(r2);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    public void A0A() {
        C89654ea A0F = C18320x8.A0F(this.A03);
        if (A0F != null && !A0F.BHW()) {
            A0F.BpA(0, R.string.f11nameremoved);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C89654ea A0F = C18320x8.A0F(this.A03);
        if (A0F != null && !A0F.BHW()) {
            A0F.BjL();
            this.A01.BiY(this.A02);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a1 A[SYNTHETIC, Splitter:B:14:0x00a1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r23) {
        /*
            r22 = this;
            long r7 = android.os.SystemClock.elapsedRealtime()
            r2 = r22
            X.4Ed r1 = r2.A01
            X.20h r6 = r2.A02
            com.whatsapp.report.ReportActivity r1 = (com.whatsapp.report.ReportActivity) r1
            X.20h r0 = X.C369320h.ACCOUNT
            if (r6 != r0) goto L_0x00b7
            X.8qC r0 = r1.A0E
        L_0x0012:
            java.lang.Object r0 = r0.get()
            X.3Lm r0 = (X.C66453Lm) r0
            if (r0 == 0) goto L_0x00bf
            X.5Hn r11 = r1.A06
            r4 = 4
            X.3br r12 = new X.3br
            r12.<init>((java.lang.Object) r0, (int) r4)
            X.3SU r10 = new X.3SU
            r10.<init>(r0, r1)
            X.31C r15 = r11.A01
            java.lang.String r3 = r15.A03()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GdprXmppMethods/sendDeleteGdprReport; iq="
            X.C18260x0.A0s(r0, r3, r1)
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.lang.String r1 = "action"
            java.lang.String r0 = "delete"
            X.AnonymousClass39V.A03(r1, r0, r5)
            X.20h r0 = X.C369320h.NEWSLETTER
            if (r6 != r0) goto L_0x004e
            java.lang.String r1 = "report_type"
            java.lang.String r0 = "newsletters"
            X.AnonymousClass39V.A03(r1, r0, r5)
        L_0x004e:
            r6 = 0
            X.39V[] r1 = X.C18300x5.A1Z(r5, r6)
            java.lang.String r0 = "gdpr"
            X.36K r5 = X.AnonymousClass36K.A0I(r0, r1)
            X.39V[] r4 = new X.AnonymousClass39V[r4]
            X.AnonymousClass39V.A0E(r4, r6)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "urn:xmpp:whatsapp:account"
            X.AnonymousClass39V.A05(r1, r0, r4)
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.AnonymousClass39V.A06(r1, r0, r4)
            java.lang.String r0 = "id"
            X.36K r17 = X.AnonymousClass36K.A0E(r5, r0, r3, r4)
            X.6bK r13 = new X.6bK
            r13.<init>()
            r14 = 4
            X.4KY r9 = new X.4KY
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (int) r14)
            r19 = 169(0xa9, float:2.37E-43)
            r20 = 32000(0x7d00, double:1.581E-319)
            r16 = r9
            r18 = r3
            r15.A0D(r16, r17, r18, r19, r20)
        L_0x008b:
            r5 = 0
            if (r13 != 0) goto L_0x00a1
            java.lang.String r0 = "send-request-gdpr-report/failed/callback is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.3Wi r3 = r2.A00
            r1 = 8
            X.3br r0 = new X.3br
            r0.<init>((java.lang.Object) r2, (int) r1)
            r3.A0S(r0)
        L_0x00a0:
            return r5
        L_0x00a1:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x00c2 }
            r0 = 32000(0x7d00, double:1.581E-319)
            r13.get(r0, r3)     // Catch:{ Exception -> 0x00c2 }
            long r3 = X.AnonymousClass0x7.A0E(r7)
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a0
            long r1 = r1 - r3
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00a0 }
            goto L_0x00c1
        L_0x00b7:
            X.20h r0 = X.C369320h.NEWSLETTER
            if (r6 != r0) goto L_0x00bf
            X.8qC r0 = r1.A0F
            goto L_0x0012
        L_0x00bf:
            r13 = 0
            goto L_0x008b
        L_0x00c1:
            return r5
        L_0x00c2:
            r1 = move-exception
            java.lang.String r0 = "send-request-gdpr-report/timeout"
            com.whatsapp.util.Log.w(r0, r1)
            X.3Wi r3 = r2.A00
            r1 = 8
            X.3br r0 = new X.3br
            r0.<init>((java.lang.Object) r2, (int) r1)
            r3.A0S(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33771tf.A08(java.lang.Object[]):java.lang.Object");
    }
}
