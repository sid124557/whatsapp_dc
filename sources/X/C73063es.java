package X;

/* renamed from: X.3es  reason: invalid class name and case insensitive filesystem */
public class C73063es implements C84844Dx {
    public final int A00;
    public final int A01;
    public final AnonymousClass3ZK A02;
    public final byte[] A03;
    public final byte[] A04;

    public C73063es(byte[] bArr) {
        Throwable th;
        try {
            byte[][] A012 = C616531r.A01(bArr, 1, bArr.length - 1);
            byte b = A012[0][0];
            byte[] bArr2 = A012[1];
            int i = (b & 255) >> 4;
            if (i < 3) {
                th = new C377323u(AnonymousClass000.A0Y("Legacy message: ", AnonymousClass001.A0o(), i));
            } else if (i <= 3) {
                C21701Cv r2 = (C21701Cv) C130786cX.A05(C21701Cv.DEFAULT_INSTANCE, bArr2);
                int i2 = r2.bitField0_;
                if ((i2 & 1) == 0 || (i2 & 2) == 0 || (i2 & 4) == 0 || (i2 & 8) == 0) {
                    th = new AnonymousClass24X("Incomplete message.");
                } else {
                    this.A04 = bArr;
                    this.A00 = r2.id_;
                    this.A01 = r2.iteration_;
                    this.A03 = r2.chainKey_.A07();
                    this.A02 = C616431q.A00(r2.signingKey_);
                    return;
                }
            } else {
                th = new AnonymousClass24X(AnonymousClass000.A0Y("Unknown version: ", AnonymousClass001.A0o(), i));
            }
            throw th;
        } catch (AnonymousClass24R | AnonymousClass6u5 e) {
            throw new AnonymousClass24X(e);
        }
    }

    public byte[] Blc() {
        return this.A04;
    }

    public int getType() {
        return 5;
    }

    public C73063es(AnonymousClass3ZK r8, byte[] bArr, int i, int i2) {
        C130546c9 A0K = C18300x5.A0K(C21701Cv.DEFAULT_INSTANCE);
        C21701Cv r1 = (C21701Cv) A0K.A00;
        r1.bitField0_ |= 1;
        r1.id_ = i;
        C21701Cv r12 = (C21701Cv) C18320x8.A0C(A0K);
        r12.bitField0_ |= 2;
        r12.iteration_ = i2;
        C172548Lq A0H = C18280x3.A0H(A0K, bArr);
        C21701Cv r13 = (C21701Cv) A0K.A00;
        r13.bitField0_ |= 4;
        r13.chainKey_ = A0H;
        C172548Lq A0H2 = C18280x3.A0H(A0K, r8.A00());
        C21701Cv r14 = (C21701Cv) A0K.A00;
        r14.bitField0_ |= 8;
        r14.signingKey_ = A0H2;
        byte[] A1Z = C18290x4.A1Z(A0K);
        this.A00 = i;
        this.A01 = i2;
        this.A03 = bArr;
        this.A02 = r8;
        this.A04 = C616531r.A00(new byte[]{(byte) 51}, A1Z);
    }
}
