package X;

import android.os.Handler;

/* renamed from: X.2c8  reason: invalid class name and case insensitive filesystem */
public final class C46742c8 {
    public final AnonymousClass1VX A00;
    public final C56732sT A01;
    public final C64173Cl A02;
    public final AnonymousClass2X6 A03;
    public final AnonymousClass66R A04 = C154517dI.A01(new C78813vc(this));
    public final AnonymousClass66R A05 = C154517dI.A01(new C78823vd(this));

    public final void A00() {
        AnonymousClass1VX r6 = this.A00;
        C58422vE r4 = C58422vE.A02;
        int A0O = r6.A0O(r4, 5668);
        if (1 <= A0O && A0O < 1801) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("PreacksPingManager/schedulePingToClearPreacks/scheduling ping after ");
            A0o.append(r6.A0O(r4, 5668));
            C18260x0.A1J(A0o, " sec");
            AnonymousClass66R r3 = this.A04;
            Handler A0A = AnonymousClass0x9.A0A(r3);
            AnonymousClass66R r1 = this.A05;
            A0A.removeCallbacks((Runnable) r1.getValue());
            AnonymousClass0x9.A0A(r3).postDelayed((Runnable) r1.getValue(), AnonymousClass3ZP.A00(AnonymousClass2AC.A00(C373321v.SECONDS, r6.A0O(r4, 5668))));
        }
    }

    public C46742c8(AnonymousClass1VX r2, C56732sT r3, C64173Cl r4, AnonymousClass2X6 r5) {
        C18260x0.A0c(r2, r4, r3, r5);
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
    }
}
