package X;

/* renamed from: X.2on  reason: invalid class name and case insensitive filesystem */
public class C54482on {
    public final AnonymousClass1VX A00;
    public final AnonymousClass4FV A01;

    public void A00(int i) {
        AnonymousClass1VX r3 = this.A00;
        C58422vE r2 = C58422vE.A02;
        if (r3.A0Y(r2, 4472)) {
            AnonymousClass1XX r1 = new AnonymousClass1XX();
            r1.A00 = Integer.valueOf(i);
            r1.A01 = Integer.valueOf(r3.A0Y(r2, 4023) ? 1 : 0);
            this.A01.BhD(r1);
        }
    }

    public void A01(int i) {
        if (this.A00.A0Y(C58422vE.A02, 4472)) {
            C24111Wd r1 = new C24111Wd();
            r1.A00 = Integer.valueOf(i);
            this.A01.BhD(r1);
        }
    }

    public void A02(int i) {
        if (this.A00.A0Y(C58422vE.A02, 4472)) {
            C24121We r1 = new C24121We();
            r1.A00 = Integer.valueOf(i);
            this.A01.BhD(r1);
        }
    }

    public final void A03(int i, int i2) {
        AnonymousClass1VX r3 = this.A00;
        C58422vE r2 = C58422vE.A02;
        if (r3.A0Y(r2, 4472)) {
            AnonymousClass1YJ r1 = new AnonymousClass1YJ();
            r1.A00 = Integer.valueOf(i2);
            r1.A01 = Integer.valueOf(i);
            r1.A02 = Integer.valueOf(r3.A0Y(r2, 4023) ? 1 : 0);
            this.A01.BhD(r1);
        }
    }

    public C54482on(AnonymousClass1VX r1, AnonymousClass4FV r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
