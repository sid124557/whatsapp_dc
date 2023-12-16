package X;

/* renamed from: X.45D  reason: invalid class name */
public final class AnonymousClass45D extends C829045j implements AnonymousClass4GQ {
    public static final AnonymousClass45D A00 = new AnonymousClass45D();

    public AnonymousClass45D() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C26481cC r4 = (C26481cC) obj;
        C162457s7.A0J(r4, 0);
        r4.A04 = AnonymousClass0x9.A1E(C45562aD.class);
        r4.A00 = C371020y.FULLY_INTEGRATED;
        AnonymousClass45C r1 = AnonymousClass45C.A00;
        if (r4.A03 == null) {
            Object obj2 = r4.A05.A02.get();
            C162457s7.A0D(obj2);
            C26471cB r0 = (C26471cB) obj2;
            C162457s7.A0J(r0, 0);
            r4.A03 = r0;
            r0.A04();
            r1.invoke(r0);
            C50922iz.A02(r0);
            return C59022wD.A00;
        }
        throw C50922iz.A01(r4, "Only one integrationPoint{} is allowed. Multiple detected.");
    }
}
