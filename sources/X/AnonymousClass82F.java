package X;

import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.util.Pair;
import com.facebook.avatar.autogen.presenter.AECapturePresenter$saveImage$1;
import java.nio.ByteBuffer;

/* renamed from: X.82F  reason: invalid class name */
public final class AnonymousClass82F implements C202289li {
    public final /* synthetic */ C159147lC A00;

    public AnonymousClass82F(C159147lC r1) {
        this.A00 = r1;
    }

    public final void BYq(AnonymousClass9U3 r28) {
        C142566xP r0;
        byte[] A0A;
        float[] A0B;
        Pair A05;
        Long A08;
        Float A06;
        Long A07;
        int i;
        C159147lC r1 = this.A00;
        AnonymousClass9U3 r26 = r28;
        if (r1.A05) {
            AnonymousClass82E r4 = r1.A01;
            if (r4 != null && !r4.A01) {
                r4.A01 = true;
                boolean z = r4.A03.A01;
                C159147lC r12 = r4.A04;
                if (z) {
                    r0 = C142566xP.AUTOGEN_FINISHED;
                } else {
                    r0 = C142566xP.HOLD_STILL;
                }
                r12.A02(r0);
                C203269nP[] A0C = r26.A0C();
                int A01 = r26.A01();
                if (A01 != 35 || A0C == null) {
                    A0A = r26.A0A();
                    if (A0A == null) {
                        if (A0C == null || A0C.length != 3) {
                            A0A = null;
                        } else {
                            int A03 = r26.A03();
                            int A002 = r26.A00();
                            C203269nP r23 = A0C[0];
                            C203269nP r22 = A0C[1];
                            C203269nP r21 = A0C[2];
                            C162457s7.A0A(r23);
                            C162457s7.A0A(r22);
                            C162457s7.A0A(r21);
                            ByteBuffer B6j = r23.B6j();
                            C162457s7.A0D(B6j);
                            ByteBuffer B6j2 = r22.B6j();
                            C162457s7.A0D(B6j2);
                            ByteBuffer B6j3 = r21.B6j();
                            C162457s7.A0D(B6j3);
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(A01);
                            int i2 = bitsPerPixel / 8;
                            int i3 = A03 * A002;
                            A0A = new byte[((bitsPerPixel * i3) / 8)];
                            int BCN = r22.BCN();
                            byte[] bArr = new byte[BCN];
                            byte[] bArr2 = new byte[r21.BCN()];
                            int i4 = i3 * i2;
                            int i5 = i4 / 4;
                            int i6 = 0;
                            for (int i7 = 0; i7 < A002; i7++) {
                                int i8 = i2 * A03;
                                B6j.get(A0A, i6, i8);
                                if (A002 - i7 != 1) {
                                    B6j.position((B6j.position() + r23.BCN()) - i8);
                                }
                                i6 += i8;
                                int i9 = A002 / 2;
                                if (i7 < i9) {
                                    if (i9 - i7 == 1) {
                                        i = ((A03 / 2) - r22.BBN()) + 1;
                                    } else {
                                        i = BCN;
                                    }
                                    B6j2.get(bArr, 0, i);
                                    B6j3.get(bArr2, 0, i);
                                    int i10 = A03 / 2;
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        int i12 = (i7 * A03) / 2;
                                        AnonymousClass6CA.A0g(bArr, A0A, r22.BBN() * i11, i4 + i12 + i11);
                                        AnonymousClass6CA.A0g(bArr2, A0A, r21.BBN() * i11, i4 + i5 + i12 + i11);
                                    }
                                }
                            }
                        }
                    }
                    A0B = r26.A0B();
                    A05 = r26.A05();
                    A08 = r26.A08();
                    A06 = r26.A06();
                    A07 = r26.A07();
                } else {
                    ByteBuffer B6j4 = A0C[0].B6j();
                    C162457s7.A0D(B6j4);
                    ByteBuffer B6j5 = A0C[2].B6j();
                    C162457s7.A0D(B6j5);
                    int remaining = B6j4.remaining();
                    int remaining2 = B6j5.remaining();
                    A0A = new byte[(remaining + remaining2)];
                    B6j4.get(A0A, 0, remaining);
                    B6j5.get(A0A, remaining, remaining2);
                    A0B = r26.A0B();
                    A05 = r26.A05();
                    A08 = r26.A08();
                    A06 = r26.A06();
                    A07 = r26.A07();
                    A01 = 17;
                }
                long A04 = r26.A04();
                boolean A09 = r26.A09();
                int A032 = r26.A03();
                int A003 = r26.A00();
                int A02 = r26.A02();
                byte[] A0A2 = new AnonymousClass9U3(A05, A06, A08, A07, A0A, A0B, A0C, A01, A032, A003, A02, A04, A09).A0A();
                if (A0A2 != null) {
                    Rect rect = new Rect(0, 0, A032, A003);
                    C616131n.A02((C85494Gl) null, new AECapturePresenter$saveImage$1(rect, r4, (C84814Du) null, A0A2, A032, A003, A02), AnonymousClass349.A02(AnonymousClass34M.A01), (AnonymousClass20D) null, 3);
                    return;
                }
                return;
            }
            return;
        }
        C202289li r13 = r1.A04;
        if (r13 != null) {
            r13.BYq(r26);
        }
    }
}
