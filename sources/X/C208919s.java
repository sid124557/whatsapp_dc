package X;

/* renamed from: X.19s  reason: invalid class name and case insensitive filesystem */
public final class C208919s extends C130546c9 implements C181378mf {
    public static C21391Bq A00(C60112y1 r1, C208919s r2, byte[] bArr, int i) {
        r2.A0A(C172548Lq.A02(bArr, 0, i));
        r2.A09(r1.A00);
        return (C21391Bq) r2.A06();
    }

    public C208919s() {
        super(C21391Bq.DEFAULT_INSTANCE);
    }

    public void A09(int i) {
        C21391Bq r1 = (C21391Bq) C18320x8.A0C(this);
        r1.bitField0_ |= 1;
        r1.index_ = i;
    }

    public void A0A(C172548Lq r3) {
        C21391Bq r1 = (C21391Bq) C18320x8.A0C(this);
        r1.bitField0_ |= 2;
        r1.key_ = r3;
    }
}
