package X;

/* renamed from: X.19u  reason: invalid class name and case insensitive filesystem */
public final class C209119u extends C130546c9 implements C181378mf {
    public C209119u() {
        super(AnonymousClass1AL.DEFAULT_INSTANCE);
    }

    public AnonymousClass1EU A09() {
        AnonymousClass1EU r0 = ((AnonymousClass1AL) this.A00).message_;
        if (r0 == null) {
            return AnonymousClass1EU.DEFAULT_INSTANCE;
        }
        return r0;
    }

    public static AnonymousClass1AL A00(C130546c9 r0, C209119u r1) {
        r1.A0A((AnonymousClass1EU) r0.A06());
        return (AnonymousClass1AL) r1.A06();
    }

    public void A0A(AnonymousClass1EU r3) {
        AnonymousClass1AL r1 = (AnonymousClass1AL) C18320x8.A0C(this);
        r3.getClass();
        r1.message_ = r3;
        r1.bitField0_ |= 1;
    }
}
