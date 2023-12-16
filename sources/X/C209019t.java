package X;

/* renamed from: X.19t  reason: invalid class name and case insensitive filesystem */
public final class C209019t extends C130546c9 implements C181378mf {
    public C209019t() {
        super(AnonymousClass1EP.DEFAULT_INSTANCE);
    }

    @Deprecated
    public void A09(C374922v r3) {
        AnonymousClass1EP r1 = (AnonymousClass1EP) C18320x8.A0C(this);
        r1.initiator_ = r3.value;
        r1.bitField0_ |= 1;
    }

    public void A0A(C375022w r3) {
        AnonymousClass1EP r1 = (AnonymousClass1EP) C18320x8.A0C(this);
        r1.trigger_ = r3.value;
        r1.bitField0_ |= 2;
    }

    public void A0B(boolean z) {
        AnonymousClass1EP r1 = (AnonymousClass1EP) C18320x8.A0C(this);
        r1.bitField0_ |= 8;
        r1.initiatedByMe_ = z;
    }
}
