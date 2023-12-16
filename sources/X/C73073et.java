package X;

/* renamed from: X.3et  reason: invalid class name and case insensitive filesystem */
public class C73073et implements C84844Dx {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C59892xf A03;
    public final AnonymousClass3ZK A04;
    public final C73093ev A05;
    public final AnonymousClass3Z4 A06;
    public final byte[] A07;

    public C73073et(byte[] bArr) {
        Throwable th;
        AnonymousClass3Z4 r1;
        int i;
        try {
            int i2 = (bArr[0] & 255) >> 4;
            this.A02 = i2;
            if (i2 > 3) {
                th = new C377223t(AnonymousClass000.A0Y("Unknown version: ", AnonymousClass001.A0o(), i2));
            } else if (i2 >= 3) {
                AnonymousClass1DY r2 = (AnonymousClass1DY) C130786cX.A02(C172548Lq.A02(bArr, 1, bArr.length - 1), AnonymousClass1DY.DEFAULT_INSTANCE);
                int i3 = r2.bitField0_;
                if ((i3 & 4) == 0 || (i3 & 8) == 0 || (i3 & 16) == 0 || (i3 & 32) == 0) {
                    th = new AnonymousClass24X("Incomplete message.");
                } else {
                    this.A07 = bArr;
                    this.A00 = r2.registrationId_;
                    if ((i3 & 2) != 0) {
                        Integer valueOf = Integer.valueOf(r2.preKeyId_);
                        valueOf.getClass();
                        r1 = new AnonymousClass47r(valueOf);
                    } else {
                        r1 = AnonymousClass47s.A00;
                    }
                    this.A06 = r1;
                    if ((r2.bitField0_ & 4) != 0) {
                        i = r2.signedPreKeyId_;
                    } else {
                        i = -1;
                    }
                    this.A01 = i;
                    this.A04 = C616431q.A00(r2.baseKey_);
                    this.A03 = new C59892xf(C616431q.A00(r2.identityKey_));
                    this.A05 = new C73093ev(r2.message_.A07());
                    return;
                }
            } else {
                th = new C377323u(AnonymousClass000.A0Y("Legacy version: ", AnonymousClass001.A0o(), i2));
            }
            throw th;
        } catch (C377323u | AnonymousClass24R | AnonymousClass6u5 e) {
            throw new AnonymousClass24X(e);
        }
    }

    public byte[] Blc() {
        return this.A07;
    }

    public int getType() {
        return 3;
    }

    public C73073et(C59892xf r6, AnonymousClass3ZK r7, C73093ev r8, AnonymousClass3Z4 r9, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A06 = r9;
        this.A01 = i3;
        this.A04 = r7;
        this.A03 = r6;
        this.A05 = r8;
        C130546c9 A0K = C18300x5.A0K(AnonymousClass1DY.DEFAULT_INSTANCE);
        AnonymousClass1DY r2 = (AnonymousClass1DY) A0K.A00;
        r2.bitField0_ |= 4;
        r2.signedPreKeyId_ = i3;
        byte[] A002 = r7.A00();
        C172548Lq A0J = C18300x5.A0J(A0K, A002, A002.length);
        AnonymousClass1DY r22 = (AnonymousClass1DY) A0K.A00;
        r22.bitField0_ |= 8;
        r22.baseKey_ = A0J;
        C172548Lq A0H = C18280x3.A0H(A0K, r6.A00.A00());
        AnonymousClass1DY r23 = (AnonymousClass1DY) A0K.A00;
        r23.bitField0_ |= 16;
        r23.identityKey_ = A0H;
        C172548Lq A0H2 = C18280x3.A0H(A0K, r8.A04);
        AnonymousClass1DY r24 = (AnonymousClass1DY) A0K.A00;
        r24.bitField0_ |= 32;
        r24.message_ = A0H2;
        AnonymousClass1DY r25 = (AnonymousClass1DY) C18320x8.A0C(A0K);
        r25.bitField0_ |= 1;
        r25.registrationId_ = i2;
        if (r9 instanceof AnonymousClass47r) {
            int A0K2 = AnonymousClass001.A0K(r9.A00());
            AnonymousClass1DY r26 = (AnonymousClass1DY) C18320x8.A0C(A0K);
            r26.bitField0_ |= 2;
            r26.preKeyId_ = A0K2;
        }
        this.A07 = C616531r.A00(new byte[]{(byte) (((i << 4) | 3) & 255)}, C18290x4.A1Z(A0K));
    }
}
