package X;

import java.text.ParseException;

/* renamed from: X.3eu  reason: invalid class name and case insensitive filesystem */
public class C73083eu implements C84844Dx {
    public final int A00;
    public final int A01;
    public final byte[] A02;
    public final byte[] A03;

    public void A00(AnonymousClass3ZK r5) {
        try {
            byte[] bArr = this.A03;
            byte[][] A012 = C616531r.A01(bArr, bArr.length - 64, 64);
            if (!C158317jm.A00().A01(r5.A00, A012[0], A012[1])) {
                throw new AnonymousClass24X("Invalid signature!");
            }
        } catch (AnonymousClass24R e) {
            throw new AnonymousClass24X((Throwable) e);
        }
    }

    public C73083eu(byte[] bArr) {
        Throwable th;
        try {
            byte[][] A022 = C616531r.A02(bArr, 1, (bArr.length - 1) - 64, 64);
            byte b = A022[0][0];
            byte[] bArr2 = A022[1];
            int i = (b & 255) >> 4;
            if (i < 3) {
                th = new C377323u(AnonymousClass000.A0Y("Legacy message: ", AnonymousClass001.A0o(), i));
            } else if (i <= 3) {
                AnonymousClass1CX r2 = (AnonymousClass1CX) C130786cX.A05(AnonymousClass1CX.DEFAULT_INSTANCE, bArr2);
                int i2 = r2.bitField0_;
                if ((i2 & 1) == 0 || (i2 & 2) == 0 || (i2 & 4) == 0) {
                    th = new AnonymousClass24X("Incomplete message.");
                } else {
                    this.A03 = bArr;
                    this.A01 = r2.id_;
                    this.A00 = r2.iteration_;
                    this.A02 = r2.ciphertext_.A07();
                    return;
                }
            } else {
                th = new AnonymousClass24X(AnonymousClass000.A0Y("Unknown version: ", AnonymousClass001.A0o(), i));
            }
            throw th;
        } catch (AnonymousClass6u5 | ParseException e) {
            throw new AnonymousClass24X(e);
        }
    }

    public byte[] Blc() {
        return this.A03;
    }

    public int getType() {
        return 4;
    }

    public C73083eu(AnonymousClass2JA r10, byte[] bArr, int i, int i2) {
        byte[] bArr2 = {(byte) 51};
        C130546c9 A0K = C18300x5.A0K(AnonymousClass1CX.DEFAULT_INSTANCE);
        AnonymousClass1CX r1 = (AnonymousClass1CX) A0K.A00;
        r1.bitField0_ |= 1;
        r1.id_ = i;
        AnonymousClass1CX r12 = (AnonymousClass1CX) C18320x8.A0C(A0K);
        r12.bitField0_ |= 2;
        r12.iteration_ = i2;
        C172548Lq A0H = C18280x3.A0H(A0K, bArr);
        AnonymousClass1CX r13 = (AnonymousClass1CX) A0K.A00;
        r13.bitField0_ |= 4;
        r13.ciphertext_ = A0H;
        byte[] A1Z = C18290x4.A1Z(A0K);
        try {
            this.A03 = C616531r.A00(bArr2, A1Z, C158317jm.A00().A03(r10.A00, C616531r.A00(bArr2, A1Z)));
            this.A01 = i;
            this.A00 = i2;
            this.A02 = bArr;
        } catch (AnonymousClass24R e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }
}
