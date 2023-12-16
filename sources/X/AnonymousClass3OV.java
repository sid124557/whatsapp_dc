package X;

/* renamed from: X.3OV  reason: invalid class name */
public class AnonymousClass3OV implements AnonymousClass4AJ, C85364Fy {
    public C51992ki A00;
    public C50222hp A01;

    public void AyD(C55032pg r8, C624134x r9) {
        C130786cX r0;
        C18260x0.A0l(r9, "FMessageInteractiveProtocolSerializer: message type is not supported ", AnonymousClass001.A0o(), r9 instanceof AnonymousClass1n1);
        AnonymousClass1n1 r92 = (AnonymousClass1n1) r9;
        AnonymousClass39W r1 = r92.A00;
        if (r1 != null) {
            this.A01.A00(r1).A0C(r8, r92);
            AnonymousClass1A4 r6 = r8.A00;
            C209219v r5 = (C209219v) AnonymousClass1A4.A01(r6);
            AnonymousClass1DR r02 = ((AnonymousClass1ER) r5.A00).header_;
            if (r02 == null) {
                r02 = AnonymousClass1DR.DEFAULT_INSTANCE;
            }
            C209319w r4 = (C209319w) r02.A0H();
            r4.A09();
            C51992ki r3 = this.A00;
            AnonymousClass1DR r2 = (AnonymousClass1DR) r4.A00;
            if (r2.mediaCase_ == 4) {
                r0 = (C130786cX) r2.media_;
            } else {
                r0 = AnonymousClass1EE.DEFAULT_INSTANCE;
            }
            C209219v.A00(r4, r6, r5, C18310x6.A0V(r4, r3.A01(r8, (C207219b) r0.A0H(), r92)), 4);
        }
    }

    public AnonymousClass3OV(C51992ki r1, C50222hp r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
