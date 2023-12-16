package X;

import com.whatsapp.infra.graphql.BaseMexCallback;

/* renamed from: X.7UH  reason: invalid class name */
public final class AnonymousClass7UH {
    public final AnonymousClass7J9 A00;
    public final C158587kE A01;
    public final C188028yC A02;
    public final AnonymousClass8JG A03;
    public final AnonymousClass7T5 A04;
    public final C45272Zj A05;
    public final AnonymousClass31C A06;

    public void A00() {
        C188028yC r5 = this.A02;
        if (r5 instanceof BaseMexCallback) {
            BaseMexCallback baseMexCallback = (BaseMexCallback) r5;
            C158587kE r3 = this.A01;
            AnonymousClass7T5 r2 = this.A04;
            baseMexCallback.A02 = Long.valueOf(r2.A00.A0H());
            baseMexCallback.A00 = r3;
            baseMexCallback.A01 = r2;
        }
        AnonymousClass7J9 r22 = this.A00;
        C158587kE r1 = this.A01;
        if (r1.A05 == null) {
            r5.BSt(new C135046k2(r22));
            return;
        }
        AnonymousClass31C r0 = this.A06;
        String str = r1.A03;
        r0.A0K(this.A03, r1.A01, str, 341, 32000);
    }

    public AnonymousClass7UH(AnonymousClass7J9 r4, C188028yC r5, C150437Qs r6, AnonymousClass7T5 r7, C45272Zj r8, AnonymousClass31C r9) {
        this.A00 = r4;
        this.A02 = r5;
        this.A05 = r8;
        this.A04 = r7;
        this.A06 = r9;
        this.A01 = new C158587kE(r4, r9.A03(), this.A05.A00(this.A00.A02));
        this.A03 = new AnonymousClass8JG(this, r5, r6);
    }
}
