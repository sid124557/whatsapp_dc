package X;

/* renamed from: X.2nC  reason: invalid class name and case insensitive filesystem */
public final class C53502nC {
    public final AnonymousClass3XH A00;
    public final C620133d A01;
    public final C50572iO A02;
    public final AnonymousClass5UP A03;
    public final AnonymousClass4FS A04;
    public final AnonymousClass66R A05 = C154517dI.A01(new C78803vb(this));

    public final void A00() {
        if (this.A03.A01.A0Y(C58422vE.A02, 6508)) {
            ((C72173dI) this.A05.getValue()).A02();
        }
    }

    public final void A01(AnonymousClass2LL r5) {
        C80783yn r3 = new C80783yn(this, r5);
        if (this.A03.A01.A0Y(C58422vE.A02, 6508)) {
            C72173dI r2 = (C72173dI) this.A05.getValue();
            r2.A02();
            r2.execute(new C71533cG((Object) r3, 34));
            return;
        }
        r3.invoke();
    }

    public final void A02(C624134x r3) {
        if (r3 instanceof C30471mV) {
            C30471mV r1 = (C30471mV) r3;
            if (C383227b.A00(r1)) {
                this.A00.A01(r1);
                return;
            }
        }
        C55592qb r0 = r3.A0l;
        if (r0 != null && !r0.A09) {
            this.A02.A01(r3, 1);
        }
    }

    public C53502nC(AnonymousClass3XH r2, C620133d r3, C50572iO r4, AnonymousClass5UP r5, AnonymousClass4FS r6) {
        C18260x0.A0f(r5, r6, r2, r3, r4);
        this.A03 = r5;
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }
}
