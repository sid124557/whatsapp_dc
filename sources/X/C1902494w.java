package X;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.94w  reason: invalid class name and case insensitive filesystem */
public class C1902494w extends C05550Ty implements C202499m7 {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final AnonymousClass36F A03;
    public final AnonymousClass1VX A04;
    public final C196719bd A05;
    public final AnonymousClass9U1 A06;
    public final AnonymousClass9AI A07;
    public final AnonymousClass4FS A08;
    public final HashMap A09 = AnonymousClass001.A0t();

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        if (r17 != null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BaS(com.whatsapp.jid.UserJid r13, X.C166557yt r14, X.C166557yt r15, X.C166557yt r16, X.AnonymousClass34V r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25) {
        /*
            r12 = this;
            X.08M r1 = r12.A00
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.A0H(r0)
            X.9Ut r2 = new X.9Ut
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r18
            r8 = r19
            r9 = r20
            r11 = r22
            r10 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r17
            if (r21 == 0) goto L_0x002d
            if (r17 != 0) goto L_0x002f
            boolean r0 = X.AnonymousClass000.A1S(r23)
            r2.A07 = r0
            X.08M r1 = r12.A01
        L_0x0029:
            r1.A0H(r2)
            return
        L_0x002d:
            if (r17 == 0) goto L_0x0049
        L_0x002f:
            X.9bd r2 = r12.A05
            int r1 = r0.A00
            X.9U1 r0 = r12.A06
            X.7bd r0 = r0.A04
            X.9VW r1 = r2.A04(r0, r1)
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x0049
        L_0x0043:
            X.08M r0 = r12.A02
            r0.A0H(r1)
            return
        L_0x0049:
            X.08M r1 = r12.A02
            r0 = 2131891948(0x7f1216ec, float:1.941863E38)
            X.9VW r2 = new X.9VW
            r2.<init>(r0)
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1902494w.BaS(com.whatsapp.jid.UserJid, X.7yt, X.7yt, X.7yt, X.34V, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean):void");
    }

    public C1902494w(AnonymousClass36F r2, AnonymousClass1VX r3, C196719bd r4, AnonymousClass9U1 r5, AnonymousClass9AI r6, AnonymousClass4FS r7) {
        this.A04 = r3;
        this.A08 = r7;
        this.A05 = r4;
        this.A06 = r5;
        this.A03 = r2;
        this.A07 = r6;
    }

    public void A0D(C166557yt r4, C166557yt r5) {
        String str = (String) C1899593h.A0X(r4);
        if (!TextUtils.isEmpty(str) && C161527pr.A02(r5)) {
            C166557yt A012 = C161527pr.A01(this.A09.get(AnonymousClass0x9.A0z(str)), "accountHolderName");
            if (!C161527pr.A02(A012)) {
                this.A01.A0H(new C194859Ut(r4, A012));
                return;
            }
        }
        this.A00.A0H(Boolean.TRUE);
        this.A07.A01(r4, r5, this);
    }
}
