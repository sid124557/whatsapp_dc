package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.3ev  reason: invalid class name and case insensitive filesystem */
public class C73093ev implements C84844Dx {
    public final int A00;
    public final int A01;
    public final AnonymousClass3ZK A02;
    public final byte[] A03;
    public final byte[] A04;

    public static final byte[] A00(SecretKeySpec secretKeySpec, C59892xf r3, C59892xf r4, byte[] bArr, int i) {
        try {
            Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
            instance.init(secretKeySpec);
            if (i >= 3) {
                instance.update(r3.A00.A00());
                instance.update(r4.A00.A00());
            }
            return C18320x8.A1Z(instance.doFinal(bArr), 8);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public C73093ev(byte[] bArr) {
        Throwable th;
        try {
            byte[][] A022 = C616531r.A02(bArr, 1, (bArr.length - 1) - 8, 8);
            byte b = A022[0][0];
            byte[] bArr2 = A022[1];
            int i = (b & 255) >> 4;
            if (i <= 1) {
                th = new C377323u(AnonymousClass000.A0Y("Legacy message: ", AnonymousClass001.A0o(), i));
            } else if (i <= 3) {
                C21711Cw r2 = (C21711Cw) C130786cX.A05(C21711Cw.DEFAULT_INSTANCE, bArr2);
                int i2 = r2.bitField0_;
                if ((i2 & 8) == 0 || (i2 & 2) == 0 || (i2 & 1) == 0) {
                    th = new AnonymousClass24X("Incomplete message.");
                } else {
                    this.A04 = bArr;
                    this.A02 = C616431q.A00(r2.ratchetKey_);
                    this.A01 = (b & 255) >> 4;
                    this.A00 = r2.counter_;
                    this.A03 = r2.ciphertext_.A07();
                    return;
                }
            } else {
                th = new AnonymousClass24X(AnonymousClass000.A0Y("Unknown version: ", AnonymousClass001.A0o(), i));
            }
            throw th;
        } catch (AnonymousClass24R | AnonymousClass6u5 | ParseException e) {
            throw new AnonymousClass24X(e);
        }
    }

    public byte[] Blc() {
        return this.A04;
    }

    public int getType() {
        return 2;
    }

    public C73093ev(SecretKeySpec secretKeySpec, C59892xf r10, C59892xf r11, AnonymousClass3ZK r12, byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2 = {(byte) (((i << 4) | 3) & 255)};
        C130546c9 A0G = C21711Cw.DEFAULT_INSTANCE.A0G();
        C172548Lq A0H = C18280x3.A0H(A0G, r12.A00());
        C21711Cw r1 = (C21711Cw) A0G.A00;
        r1.bitField0_ |= 1;
        r1.ratchetKey_ = A0H;
        C21711Cw r13 = (C21711Cw) C18320x8.A0C(A0G);
        r13.bitField0_ |= 2;
        r13.counter_ = i2;
        C21711Cw r14 = (C21711Cw) C18320x8.A0C(A0G);
        r14.bitField0_ |= 4;
        r14.previousCounter_ = i3;
        C172548Lq A0H2 = C18280x3.A0H(A0G, bArr);
        C21711Cw r15 = (C21711Cw) A0G.A00;
        r15.bitField0_ |= 8;
        r15.ciphertext_ = A0H2;
        byte[] A1Z = C18290x4.A1Z(A0G);
        this.A04 = C616531r.A00(bArr2, A1Z, A00(secretKeySpec, r10, r11, C616531r.A00(bArr2, A1Z), i));
        this.A02 = r12;
        this.A00 = i2;
        this.A03 = bArr;
        this.A01 = i;
    }
}
