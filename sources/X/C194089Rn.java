package X;

import java.util.ArrayList;

/* renamed from: X.9Rn  reason: invalid class name and case insensitive filesystem */
public class C194089Rn {
    public final C29441ip A00;
    public final C620933l A01;
    public final AnonymousClass9U5 A02;
    public final C193119Nf A03;
    public final AnonymousClass28X A04;
    public final AnonymousClass4FS A05;

    public void A00(C202989mw r12, C193849Qh r13, String str) {
        C202989mw r6 = r12;
        if ("token".equals(r13.A00.A03)) {
            ArrayList A0s = AnonymousClass001.A0s();
            AnonymousClass0x2.A1G("fbpay_pin", str, A0s);
            AnonymousClass4FS r0 = this.A05;
            C193119Nf r7 = this.A03;
            C620933l r3 = this.A01;
            AnonymousClass28X r8 = this.A04;
            AnonymousClass0x7.A1B(new C1908299z(this.A00, r3, this.A02, (AnonymousClass9RT) null, r6, r7, r8, A0s, 0), r0);
            return;
        }
        r12.BdD(str);
    }

    public C194089Rn(C29441ip r1, C620933l r2, AnonymousClass9U5 r3, C193119Nf r4, AnonymousClass28X r5, AnonymousClass4FS r6) {
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = r1;
    }
}
