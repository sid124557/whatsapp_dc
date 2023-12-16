package X;

/* renamed from: X.2wS  reason: invalid class name and case insensitive filesystem */
public class C59162wS {
    public AnonymousClass1CZ A00;

    public C42012Ml A00() {
        try {
            AnonymousClass1CZ r1 = this.A00;
            return new C42012Ml(new AnonymousClass2JA(r1.privateKey_.A07()), C616431q.A00(r1.publicKey_));
        } catch (AnonymousClass24R e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public C59162wS(byte[] bArr) {
        this.A00 = (AnonymousClass1CZ) C130786cX.A05(AnonymousClass1CZ.DEFAULT_INSTANCE, bArr);
    }

    public C59162wS(C42012Ml r5, int i) {
        C130546c9 A0K = C18300x5.A0K(AnonymousClass1CZ.DEFAULT_INSTANCE);
        AnonymousClass1CZ r1 = (AnonymousClass1CZ) A0K.A00;
        r1.bitField0_ |= 1;
        r1.id_ = i;
        byte[] A002 = r5.A01.A00();
        C172548Lq A0J = C18300x5.A0J(A0K, A002, A002.length);
        AnonymousClass1CZ r12 = (AnonymousClass1CZ) A0K.A00;
        r12.bitField0_ |= 2;
        r12.publicKey_ = A0J;
        C172548Lq A0H = C18280x3.A0H(A0K, r5.A00.A00);
        AnonymousClass1CZ r13 = (AnonymousClass1CZ) A0K.A00;
        r13.bitField0_ |= 4;
        r13.privateKey_ = A0H;
        this.A00 = (AnonymousClass1CZ) A0K.A06();
    }
}
