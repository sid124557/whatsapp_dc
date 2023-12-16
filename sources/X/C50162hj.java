package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2hj  reason: invalid class name and case insensitive filesystem */
public class C50162hj {
    public final C56422rx A00;
    public final C56152rV A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass3LP A03;
    public final AnonymousClass4FV A04;
    public final C69183Wa A05;
    public final C72173dI A06;

    public final Integer A00(C95814uZ r6) {
        int i;
        AnonymousClass1VX r4 = this.A02;
        C56422rx r3 = this.A00;
        UserJid A032 = AnonymousClass32Y.A03(r6);
        AnonymousClass3LP r1 = this.A03;
        if (C57172tD.A00(r3, r4, r1, A032)) {
            i = 2;
        } else if (!C615431g.A00(r3, r4, r1, A032, this.A05)) {
            return null;
        } else {
            i = 1;
        }
        return Integer.valueOf(i);
    }

    public void A01(int i) {
        AnonymousClass1WG r1 = new AnonymousClass1WG();
        r1.A00 = Integer.valueOf(i);
        this.A04.BhD(r1);
    }

    public C50162hj(C56422rx r2, C56152rV r3, AnonymousClass1VX r4, AnonymousClass3LP r5, AnonymousClass4FV r6, C69183Wa r7, AnonymousClass4FS r8) {
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        this.A01 = r3;
        this.A05 = r7;
        this.A00 = r2;
        this.A06 = C72173dI.A00(r8);
    }
}
