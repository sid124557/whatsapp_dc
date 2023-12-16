package X;

/* renamed from: X.2kb  reason: invalid class name and case insensitive filesystem */
public class C51922kb {
    public final AnonymousClass4FV A00;
    public final C55772qt A01;

    public final void A00(C622234e r3, Integer num) {
        if (r3 != null) {
            C24871Zb r1 = new C24871Zb();
            r1.A04 = AnonymousClass0x9.A0m(r3.A01);
            r1.A03 = AnonymousClass0x9.A0m(r3.A03);
            r1.A02 = num;
            r1.A01 = Integer.valueOf(r3.A02);
            this.A00.BhD(r1);
        }
    }

    public final void A01(Integer num) {
        A00(this.A01.A02(), num);
    }

    public final void A02(Integer num) {
        C622234e A02 = this.A01.A02();
        if (A02 != null) {
            AnonymousClass1ZG r1 = new AnonymousClass1ZG();
            r1.A03 = AnonymousClass0x9.A0m(A02.A01);
            r1.A02 = AnonymousClass0x9.A0m(A02.A03);
            r1.A01 = num;
            this.A00.BhD(r1);
        }
    }

    public C51922kb(AnonymousClass4FV r1, C55772qt r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
