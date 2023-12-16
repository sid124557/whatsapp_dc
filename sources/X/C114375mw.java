package X;

import android.view.View;

/* renamed from: X.5mw  reason: invalid class name and case insensitive filesystem */
public class C114375mw implements AnonymousClass4AK {
    public C182388oK A00;
    public C103885Ou A01;
    public C149037Kr A02;
    public AnonymousClass123 A03;
    public C115975pX A04;
    public final AnonymousClass5LY A05;
    public final C106095Xp A06;
    public final C55922r8 A07;
    public final C109665ez A08 = new C989553w(this, 15);

    public void A00() {
        View view = this.A01.A02;
        if (view != null && view.getVisibility() == 0) {
            AnonymousClass123 r1 = this.A03;
            if (r1 == null) {
                r1 = new C95404tb(this);
                this.A03 = r1;
            }
            this.A01.A00(r1);
            this.A03.A0K(this.A07.A01());
        }
    }

    public void BU5(C166177yG r3) {
        this.A00.Bk0();
        C149037Kr r1 = this.A02;
        if (r1 != null) {
            C162457s7.A0J(r3, 0);
            C182488oU r0 = r1.A02.A00;
            if (r0 != null) {
                r0.BU5(r3);
            }
        }
    }

    public C114375mw(AnonymousClass5LY r3, C106095Xp r4, C55922r8 r5) {
        this.A06 = r4;
        this.A07 = r5;
        this.A05 = r3;
    }
}
