package X;

/* renamed from: X.1A0  reason: invalid class name */
public final class AnonymousClass1A0 extends C130546c9 implements C181378mf {
    public AnonymousClass1A0() {
        super(AnonymousClass1E2.DEFAULT_INSTANCE);
    }

    public void A09(int i) {
        AnonymousClass1E2 r1 = (AnonymousClass1E2) C18320x8.A0C(this);
        r1.bitField0_ |= 2;
        r1.chunkOrder_ = i;
    }

    public void A0A(int i) {
        AnonymousClass1E2 r1 = (AnonymousClass1E2) C18320x8.A0C(this);
        r1.bitField0_ |= 4;
        r1.progress_ = i;
    }

    public void A0B(C209619z r5) {
        AnonymousClass1E2 r3 = (AnonymousClass1E2) C18320x8.A0C(this);
        C130786cX A06 = r5.A06();
        A06.getClass();
        C188248ya r1 = r3.conversations_;
        if (!((AnonymousClass8T6) r1).A00) {
            r1 = C130786cX.A07(r1);
            r3.conversations_ = r1;
        }
        r1.add(A06);
    }

    public void A0C(AnonymousClass1EG r4) {
        AnonymousClass1E2 r2 = (AnonymousClass1E2) C18320x8.A0C(this);
        r4.getClass();
        C188248ya r1 = r2.conversations_;
        if (!((AnonymousClass8T6) r1).A00) {
            r1 = C130786cX.A07(r1);
            r2.conversations_ = r1;
        }
        r1.add(r4);
    }

    public void A0D(AnonymousClass23J r3) {
        AnonymousClass1E2 r1 = (AnonymousClass1E2) C18320x8.A0C(this);
        r1.syncType_ = r3.value;
        r1.bitField0_ |= 1;
    }
}
