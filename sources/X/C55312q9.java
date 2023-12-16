package X;

/* renamed from: X.2q9  reason: invalid class name and case insensitive filesystem */
public final class C55312q9 {
    public final AnonymousClass1VX A00;
    public final C26161bg A01;
    public final AnonymousClass4FV A02;

    public final void A00(C95814uZ r9) {
        A04(r9, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 1);
    }

    public final void A01(C95814uZ r9, int i) {
        C162457s7.A0J(r9, 0);
        A04(r9, (Integer) null, Integer.valueOf(i), (Integer) null, (Integer) null, (Integer) null, 5);
    }

    public final void A02(C95814uZ r9, int i) {
        C162457s7.A0J(r9, 0);
        A04(r9, Integer.valueOf(i), (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2);
    }

    public final void A03(C95814uZ r9, int i, int i2) {
        C95814uZ r1 = r9;
        if (r9 != null) {
            A04(r1, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(i), Integer.valueOf(i2), 7);
        }
    }

    public final void A04(C95814uZ r5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i) {
        if (this.A00.A0Y(C58422vE.A02, 6034)) {
            C25481aa r3 = new C25481aa();
            r3.A06 = AnonymousClass001.A0f();
            r3.A01 = Integer.valueOf(i);
            C26161bg r2 = this.A01;
            r3.A08 = AnonymousClass30N.A01(r2.A06(AnonymousClass0x9.A1C()), r5.getRawString());
            r3.A05 = num;
            r3.A00 = num2;
            r3.A04 = num3;
            r3.A07 = AnonymousClass0x2.A0U();
            r3.A03 = num4;
            r3.A02 = num5;
            this.A02.BhD(r3);
        }
    }

    public C55312q9(AnonymousClass1VX r1, C26161bg r2, AnonymousClass4FV r3) {
        C18260x0.A0Q(r1, r3);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
