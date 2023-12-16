package X;

/* renamed from: X.1A2  reason: invalid class name */
public final class AnonymousClass1A2 extends C130546c9 implements C181378mf {
    public AnonymousClass1A2() {
        super(AnonymousClass1DQ.DEFAULT_INSTANCE);
    }

    public void A09(int i) {
        AnonymousClass1DQ r1 = (AnonymousClass1DQ) C18320x8.A0C(this);
        r1.bitField0_ |= 1;
        r1.id_ = i;
    }

    public void A0A(long j) {
        AnonymousClass1DQ r1 = (AnonymousClass1DQ) C18320x8.A0C(this);
        r1.bitField0_ |= 16;
        r1.timestamp_ = j;
    }

    public void A0B(C172548Lq r3) {
        AnonymousClass1DQ r1 = (AnonymousClass1DQ) C18320x8.A0C(this);
        r1.bitField0_ |= 4;
        r1.privateKey_ = r3;
    }

    public void A0C(C172548Lq r3) {
        AnonymousClass1DQ r1 = (AnonymousClass1DQ) C18320x8.A0C(this);
        r1.bitField0_ |= 2;
        r1.publicKey_ = r3;
    }

    public void A0D(C172548Lq r3) {
        AnonymousClass1DQ r1 = (AnonymousClass1DQ) C18320x8.A0C(this);
        r1.bitField0_ |= 8;
        r1.signature_ = r3;
    }
}
