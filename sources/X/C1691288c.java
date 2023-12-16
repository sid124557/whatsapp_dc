package X;

import android.net.Uri;
import java.util.Map;

/* renamed from: X.88c  reason: invalid class name and case insensitive filesystem */
public final class C1691288c implements C187668xc {
    public int A00;
    public final int A01;
    public final C178128h1 A02;
    public final C187668xc A03;
    public final byte[] A04 = new byte[1];

    public Map BCF() {
        return this.A03.BCF();
    }

    public Uri BE6() {
        return this.A03.BE6();
    }

    public int read(byte[] bArr, int i, int i2) {
        long max;
        int i3 = this.A00;
        if (i3 == 0) {
            C187668xc r6 = this.A03;
            byte[] bArr2 = this.A04;
            if (r6.read(bArr2, 0, 1) != -1) {
                int i4 = (bArr2[0] & 255) << 4;
                if (i4 != 0) {
                    byte[] bArr3 = new byte[i4];
                    int i5 = i4;
                    int i6 = 0;
                    while (i5 > 0) {
                        int read = r6.read(bArr3, i6, i5);
                        if (read != -1) {
                            i6 += read;
                            i5 -= read;
                        }
                    }
                    while (true) {
                        if (i4 <= 0) {
                            break;
                        }
                        int i7 = i4 - 1;
                        if (bArr3[i7] == 0) {
                            i4 = i7;
                        } else {
                            C178128h1 r2 = this.A02;
                            C161467pi r62 = new C161467pi(bArr3, i4);
                            C1691988j r22 = (C1691988j) r2;
                            if (!r22.A05) {
                                max = r22.A01;
                            } else {
                                max = Math.max(r22.A0E.A00(), r22.A01);
                            }
                            int A002 = C161467pi.A00(r62);
                            C185598tw r5 = r22.A02;
                            r5.getClass();
                            r5.Bkc(r62, A002);
                            r5.Bkh((AnonymousClass7WZ) null, 1, A002, 0, max);
                            r22.A05 = true;
                        }
                    }
                }
                i3 = this.A01;
                this.A00 = i3;
            }
            return -1;
        }
        int read2 = this.A03.read(bArr, i, Math.min(i3, i2));
        if (read2 != -1) {
            this.A00 -= read2;
        }
        return read2;
    }

    public C1691288c(C178128h1 r3, C187668xc r4, int i) {
        C161487pm.A03(AnonymousClass001.A1W(i));
        this.A03 = r4;
        this.A01 = i;
        this.A02 = r3;
        this.A00 = i;
    }

    public void Awr(C178288hI r2) {
        r2.getClass();
        this.A03.Awr(r2);
    }

    public long Bfx(C157677ih r2) {
        throw C18320x8.A0m();
    }

    public void close() {
        throw C18320x8.A0m();
    }
}
