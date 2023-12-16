package X;

/* renamed from: X.3OW  reason: invalid class name */
public class AnonymousClass3OW implements AnonymousClass4AJ, C85364Fy {
    public C54472om A00;
    public C50222hp A01;

    public void AyD(C55032pg r7, C624134x r8) {
        C130786cX r0;
        C18270x1.A16(r8, "Message type is not supported ", AnonymousClass001.A0o(), r8 instanceof C31941p8);
        C31941p8 r82 = (C31941p8) r8;
        AnonymousClass39W r1 = r82.A00;
        if (r1 != null) {
            this.A01.A00(r1).A0C(r7, r82);
            AnonymousClass1A4 r5 = r7.A00;
            C209219v r4 = (C209219v) AnonymousClass1A4.A01(r5);
            AnonymousClass1DR r02 = ((AnonymousClass1ER) r4.A00).header_;
            if (r02 == null) {
                r02 = AnonymousClass1DR.DEFAULT_INSTANCE;
            }
            C209319w r3 = (C209319w) r02.A0H();
            r3.A09();
            AnonymousClass1DR r2 = (AnonymousClass1DR) r3.A00;
            if (r2.mediaCase_ == 7) {
                r0 = (C130786cX) r2.media_;
            } else {
                r0 = AnonymousClass1ED.DEFAULT_INSTANCE;
            }
            C209519y r12 = (C209519y) r0.A0H();
            this.A00.A02(r7, r12, r82);
            C209219v.A00(r3, r5, r4, C18310x6.A0V(r3, r12), 7);
        }
    }

    public AnonymousClass3OW(C54472om r1, C50222hp r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
