package X;

/* renamed from: X.3P9  reason: invalid class name */
public final class AnonymousClass3P9 implements AnonymousClass4G3 {
    public final AnonymousClass32U A00;
    public final C183538qC A01;

    public AnonymousClass3P9(AnonymousClass32U r2, C183538qC r3) {
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public void AyB(C52952mJ r3, AnonymousClass1A3 r4, C624134x r5) {
        C30341mI r52;
        C18270x1.A14(r5, r4);
        if (!(r5 instanceof C30341mI) || (r52 = (C30341mI) r5) == null) {
            throw AnonymousClass24A.A00(0);
        }
        AnonymousClass1ET r0 = ((AnonymousClass1ES) r4.A00).key_;
        if (r0 == null) {
            r0 = AnonymousClass1ET.DEFAULT_INSTANCE;
        }
        AnonymousClass1A1 A0X = AnonymousClass0x9.A0X(r0);
        A0X.A09();
        r4.A0B((AnonymousClass1ET) A0X.A06());
        r4.A09();
        C54192oK A012 = ((C66403Lh) this.A01.get()).A01(r52);
        if (A012 != null) {
            AnonymousClass1A3 A0D = A012.A0D();
            if (A0D != null) {
                r4.A08(A0D.A06());
                return;
            }
            throw AnonymousClass24A.A00(69);
        }
        throw AnonymousClass24A.A00(69);
    }

    public AnonymousClass21E B88() {
        return AnonymousClass21E.CUSTOM_MESSAGE;
    }
}
