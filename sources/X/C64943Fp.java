package X;

/* renamed from: X.3Fp  reason: invalid class name and case insensitive filesystem */
public class C64943Fp implements AnonymousClass664 {
    public final C54292oU A00;
    public final AnonymousClass4FV A01;
    public final AnonymousClass1R1 A02;

    public void BQV() {
        if (new C05540Tx(this.A00.A00).A01()) {
            C25011Zp r2 = new C25011Zp();
            AnonymousClass1R1 r0 = this.A02;
            C56802sa A0I = r0.A0I();
            C56802sa A0H = r0.A0H();
            r2.A01 = Boolean.valueOf(A0H.A09());
            int i = 1;
            r2.A00 = C18320x8.A0V(A0H.A02().A0G);
            r2.A04 = Integer.valueOf(C18280x3.A01(A0H.A02().A0C.equals(A0H.A0C) ? 1 : 0));
            r2.A03 = Boolean.valueOf(A0I.A09());
            r2.A02 = C18320x8.A0V(A0I.A02().A0G);
            if (!A0I.A02().A0C.equals(A0I.A0C)) {
                i = 2;
            }
            r2.A05 = Integer.valueOf(i);
            this.A01.BhA(r2);
        }
    }

    public C64943Fp(C54292oU r1, AnonymousClass4FV r2, AnonymousClass1R1 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public String BDW() {
        return "ChatNotificationSettingsDailyCron";
    }
}
