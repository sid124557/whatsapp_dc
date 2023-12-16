package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.9A4  reason: invalid class name */
public class AnonymousClass9A4 extends AnonymousClass9TL {
    public final Context A00;
    public final C617332a A01;
    public final AnonymousClass31C A02;
    public final C194929Vc A03;
    public final AnonymousClass9R5 A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9A4(android.content.Context r13, X.C69263Wi r14, X.C56972sr r15, X.C56612sH r16, X.C617332a r17, X.AnonymousClass8EA r18, X.AnonymousClass31C r19, X.C194929Vc r20, X.C40602Ha r21, X.AnonymousClass9U5 r22, X.AnonymousClass9U4 r23, X.AnonymousClass9VU r24, X.AnonymousClass9SD r25, X.AnonymousClass9R5 r26, java.lang.String r27, java.lang.String r28, java.lang.String r29) {
        /*
            r12 = this;
            r10 = r24
            r9 = r23
            r8 = r22
            r7 = r21
            r5 = r16
            r4 = r15
            r3 = r14
            r2 = r13
            r11 = r25
            r1 = r12
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A00 = r13
            r0 = r19
            r12.A02 = r0
            r0 = r17
            r12.A01 = r0
            r0 = r20
            r12.A03 = r0
            r0 = r27
            r12.A05 = r0
            r0 = r28
            r12.A07 = r0
            r0 = r29
            r12.A06 = r0
            r0 = r26
            r12.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9A4.<init>(android.content.Context, X.3Wi, X.2sr, X.2sH, X.32a, X.8EA, X.31C, X.9Vc, X.2Ha, X.9U5, X.9U4, X.9VU, X.9SD, X.9R5, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void A03(String str) {
        Log.i("PAY: BrazilVerifyCardSendAuthCodeAction sendAuthCode");
        AnonymousClass31C r11 = this.A02;
        String A032 = r11.A03();
        String str2 = this.A06;
        String str3 = this.A07;
        C35351wj A0W = C1899693i.A0W(A032);
        C56052rL A012 = C56052rL.A01();
        C1899593h.A1M(A012);
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "br-verify-send-auth-code");
        if (C1899593h.A1b(str2, false)) {
            C56052rL.A0D(A0U, "credential-id", str2);
        }
        C1899593h.A1N(A0U, str3);
        String str4 = str;
        if (C1899693i.A10(str4, 1, false)) {
            C56052rL.A0D(A0U, "auth-code", str4);
        }
        r11.A0D(new C203889oT(this.A00, this.A05, this.A01, this, 10), C41032Ir.A03(A0U, A012, A0W), A032, 204, 0);
    }
}
