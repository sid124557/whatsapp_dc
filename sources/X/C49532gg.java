package X;

/* renamed from: X.2gg  reason: invalid class name and case insensitive filesystem */
public class C49532gg {
    public final C29171iO A00;
    public final C29411im A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass4FV A03;

    public final void A00(int i, int i2, int i3, int i4, long j, boolean z, boolean z2) {
        C25641aq r3 = new C25641aq();
        r3.A08 = Long.valueOf(j);
        r3.A04 = Integer.valueOf(i);
        r3.A07 = AnonymousClass0x9.A0m(i3);
        r3.A05 = Integer.valueOf(i2);
        if (this.A00.A00) {
            r3.A03 = 1;
        } else {
            r3.A03 = C18280x3.A0S();
        }
        r3.A02 = Boolean.valueOf(AnonymousClass000.A1U(this.A01.A04, 2));
        r3.A01 = Boolean.valueOf(z);
        r3.A09 = AnonymousClass0x9.A0m(i4);
        if (z2) {
            r3.A06 = C18290x4.A0Z();
        } else {
            r3.A06 = 1;
        }
        if (this.A02.A0Y(C58422vE.A02, 3157)) {
            r3.A00 = Boolean.TRUE;
            C18280x3.A0t(r3, this.A03, true);
            return;
        }
        this.A03.BhD(r3);
    }

    public void A01(int i, long j, long j2, long j3) {
        C25291aH r3 = new C25291aH();
        r3.A03 = Integer.valueOf(i);
        r3.A04 = Long.valueOf(j);
        r3.A06 = Long.valueOf(j2);
        r3.A05 = Long.valueOf(j3);
        boolean z = this.A00.A00;
        Integer A0f = AnonymousClass001.A0f();
        if (z) {
            r3.A01 = A0f;
        } else {
            r3.A01 = C18280x3.A0S();
        }
        r3.A00 = Boolean.valueOf(AnonymousClass000.A1U(this.A01.A04, 2));
        r3.A02 = A0f;
        this.A03.BhD(r3);
    }

    public C49532gg(C29171iO r1, C29411im r2, AnonymousClass1VX r3, AnonymousClass4FV r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
