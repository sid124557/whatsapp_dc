package X;

import android.net.Uri;
import java.util.Map;

/* renamed from: X.81s  reason: invalid class name and case insensitive filesystem */
public class C1676081s implements C187448xE {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C161387pX A05;
    public boolean A06;
    public byte[] A07;
    public final int A08;
    public final int A09;
    public final C187448xE A0A;

    public final int A00() {
        long j;
        long j2;
        C161387pX r9 = this.A05;
        boolean z = true;
        if (r9 != null) {
            long j3 = r9.A02;
            int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
            int i2 = this.A08;
            if (i > 0) {
                j2 = (long) i2;
                j = Math.min(j2, j3 - (this.A04 - r9.A03));
            } else {
                j = (long) i2;
                j2 = j;
            }
            Uri uri = r9.A04;
            byte[] bArr = r9.A08;
            long j4 = this.A03;
            long j5 = this.A04;
            String str = r9.A06;
            int i3 = r9.A00;
            long Bfw = this.A0A.Bfw(new C161387pX(uri, r9.A05, str, bArr, i3, j4, j5, j));
            if (Bfw < 0 || Bfw >= j2) {
                z = false;
            }
            this.A06 = z;
            return (int) Bfw;
        }
        throw new AnonymousClass6KR(new C161387pX(Uri.EMPTY), "No DataSpec when calling openInnder", 1);
    }

    public Map BCF() {
        return this.A0A.BCF();
    }

    public Uri BE6() {
        return this.A0A.BE6();
    }

    public long Bfw(C161387pX r6) {
        this.A05 = r6;
        this.A07 = new byte[this.A09];
        this.A03 = r6.A01;
        this.A04 = r6.A03;
        int A002 = A00();
        this.A02 = A002;
        this.A00 = 0;
        if (A002 >= 0 && A002 < this.A08) {
            return (long) A002;
        }
        long j = r6.A02;
        if (j < 0) {
            return -1;
        }
        return j;
    }

    public void cancel() {
        this.A0A.cancel();
    }

    public void close() {
        this.A0A.close();
        this.A05 = null;
        this.A07 = null;
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        byte[] bArr2 = this.A07;
        if (bArr2 == null || this.A00 < i2) {
            int i6 = 0;
            if (bArr2 == null || (i5 = this.A00) <= 0) {
                i3 = i2;
            } else {
                System.arraycopy(bArr2, this.A01, bArr, i, i5);
                int i7 = this.A00;
                i += i7;
                i3 = i2 - i7;
                this.A00 = 0;
            }
            do {
                int i8 = this.A02;
                if (i8 > 0) {
                    int read = this.A0A.read(bArr, i, i3);
                    if (read == -1) {
                        this.A02 = 0;
                        i8 = 0;
                    } else {
                        i += read;
                        i3 -= read;
                        this.A02 -= read;
                        long j = (long) read;
                        this.A04 += j;
                        this.A03 += j;
                    }
                }
                byte[] bArr3 = this.A07;
                if (bArr3 != null) {
                    int i9 = this.A00;
                    if (i4 + i9 <= this.A09) {
                        int i10 = this.A01;
                        if (i10 > 0) {
                            if (i9 > 0) {
                                System.arraycopy(bArr3, i10, bArr3, 0, i9);
                            }
                            this.A01 = 0;
                        }
                        while (true) {
                            i4 = this.A02;
                            if (i4 <= 0) {
                                break;
                            }
                            int read2 = this.A0A.read(this.A07, this.A00, i4);
                            if (read2 == -1) {
                                this.A02 = 0;
                                i4 = 0;
                                break;
                            }
                            this.A00 += read2;
                            this.A02 -= read2;
                            long j2 = (long) read2;
                            this.A04 += j2;
                            this.A03 += j2;
                        }
                        if (!this.A06) {
                            this.A0A.close();
                            i4 = A00();
                            this.A02 = i4;
                        }
                    }
                    if (this.A00 > 0 || i4 > 0) {
                        int read3 = read(bArr, i, i3);
                        int i11 = i2 - i3;
                        if (read3 != -1) {
                            i6 = read3;
                        }
                        return i11 + i6;
                    }
                    int i12 = i2 - i3;
                    if (i12 > 0) {
                        return i12;
                    }
                    return -1;
                }
                throw new AnonymousClass6KR(new C161387pX(Uri.EMPTY), "No internal buffer", 2);
            } while (i3 != 0);
            return i2;
        }
        System.arraycopy(bArr2, this.A01, bArr, i, i2);
        this.A01 += i2;
        this.A00 -= i2;
        return i2;
    }

    public C1676081s(C187448xE r1, int i, int i2) {
        this.A0A = r1;
        this.A09 = i;
        this.A08 = i2;
    }

    public void Awq(C184768sU r2) {
        r2.getClass();
        this.A0A.Awq(r2);
    }
}
