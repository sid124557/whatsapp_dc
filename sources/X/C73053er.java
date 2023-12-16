package X;

/* renamed from: X.3er  reason: invalid class name and case insensitive filesystem */
public class C73053er implements C84844Dx {
    public final int A00;
    public final int A01;
    public final AnonymousClass3ZK A02;
    public final byte[] A03;
    public final byte[][] A04;

    public C73053er(byte[] bArr) {
        Throwable th;
        try {
            byte[][] A012 = C616531r.A01(bArr, 1, bArr.length - 1);
            int i = 0;
            byte b = A012[0][0];
            byte[] bArr2 = A012[1];
            int i2 = (b & 255) >> 4;
            if (i2 < 3) {
                th = new C377323u(AnonymousClass000.A0Y("Legacy message: ", AnonymousClass001.A0o(), i2));
            } else if (i2 <= 3) {
                C21691Cu r2 = (C21691Cu) C130786cX.A05(C21691Cu.DEFAULT_INSTANCE, bArr2);
                int i3 = r2.bitField0_;
                if ((i3 & 1) == 0 || (i3 & 2) == 0 || r2.chainKeys_.size() <= 0 || (r2.bitField0_ & 4) == 0) {
                    th = new AnonymousClass24X("Incomplete message.");
                } else {
                    this.A03 = bArr;
                    this.A00 = r2.id_;
                    this.A01 = r2.iteration_;
                    this.A02 = C616431q.A00(r2.signingKey_);
                    C188248ya r22 = r2.chainKeys_;
                    this.A04 = new byte[r22.size()][];
                    while (true) {
                        byte[][] bArr3 = this.A04;
                        if (i < bArr3.length) {
                            bArr3[i] = ((C172548Lq) r22.get(i)).A07();
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                th = new AnonymousClass24X(AnonymousClass000.A0Y("Unknown version: ", AnonymousClass001.A0o(), i2));
            }
            throw th;
        } catch (AnonymousClass24R | AnonymousClass6u5 e) {
            throw new AnonymousClass24X(e);
        }
    }

    public byte[] Blc() {
        return this.A03;
    }

    public int getType() {
        return 6;
    }

    public C73053er(AnonymousClass3ZK r11, byte[][] bArr, int i, int i2) {
        byte[] bArr2 = {(byte) 51};
        C130546c9 A0K = C18300x5.A0K(C21691Cu.DEFAULT_INSTANCE);
        C21691Cu r1 = (C21691Cu) A0K.A00;
        r1.bitField0_ |= 1;
        r1.id_ = i;
        C21691Cu r12 = (C21691Cu) C18320x8.A0C(A0K);
        r12.bitField0_ |= 2;
        r12.iteration_ = i2;
        C172548Lq A0H = C18280x3.A0H(A0K, r11.A00());
        C21691Cu r13 = (C21691Cu) A0K.A00;
        r13.bitField0_ |= 4;
        r13.signingKey_ = A0H;
        for (byte[] A0H2 : bArr) {
            C172548Lq A0H3 = C18280x3.A0H(A0K, A0H2);
            C21691Cu r2 = (C21691Cu) A0K.A00;
            C188248ya r14 = r2.chainKeys_;
            if (!((AnonymousClass8T6) r14).A00) {
                r14 = C130786cX.A07(r14);
                r2.chainKeys_ = r14;
            }
            r14.add(A0H3);
        }
        byte[] A1Z = C18290x4.A1Z(A0K);
        this.A00 = i;
        this.A01 = i2;
        this.A04 = bArr;
        this.A02 = r11;
        this.A03 = C616531r.A00(bArr2, A1Z);
    }
}
