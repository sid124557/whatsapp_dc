package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.List;
import javax.crypto.Mac;

/* renamed from: X.6ta  reason: invalid class name and case insensitive filesystem */
public abstract class C140346ta extends FilterInputStream {
    public int A00 = 0;
    public Mac A01;
    public boolean A02 = false;
    public final int A03 = 10;
    public final C150527Rc A04;
    public final C148987Km A05 = new C148987Km();
    public final C42162Na A06;
    public final List A07;
    public final byte[] A08;

    public int A00() {
        return ((C133636hh) this).A00;
    }

    public C140346ta(C42162Na r3, InputStream inputStream) {
        super(inputStream);
        this.A06 = r3;
        this.A07 = AnonymousClass001.A0s();
        this.A01 = AnonymousClass31R.A02(r3.A01, r3.A02);
        this.A08 = new byte[DefaultCrypto.BUFFER_SIZE];
        this.A04 = new C150527Rc(this);
    }

    public void A01() {
    }

    public boolean A02() {
        return false;
    }

    public final byte[] A03(byte[] bArr, int i) {
        byte[] bArr2 = new byte[16];
        if (i < 16) {
            C148987Km r5 = this.A05;
            int i2 = 16 - i;
            C626936e.A0C(AnonymousClass6C8.A1P(i2, r5.A00));
            byte[] bArr3 = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = (r5.A01 - i2) + i3;
                if (i4 < 0) {
                    i4 += 16;
                }
                AnonymousClass6CA.A0g(r5.A02, bArr3, i4, i3);
            }
            System.arraycopy(bArr3, 0, bArr2, 0, i2);
            System.arraycopy(bArr, 0, bArr2, i2, i);
            return bArr2;
        }
        System.arraycopy(bArr, i - 16, bArr2, 0, 16);
        return bArr2;
    }

    public long skip(long j) {
        byte[] bArr = this.A08;
        return (long) AnonymousClass6CA.A03(this, bArr, AnonymousClass6CA.A02((long) bArr.length, j));
    }

    public void close() {
        super.close();
        if (this.A00 > 0) {
            byte[] doFinal = this.A01.doFinal();
            int i = this.A03;
            byte[] bArr = new byte[i];
            System.arraycopy(doFinal, 0, bArr, 0, i);
            this.A07.add(bArr);
        }
        this.A02 = true;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            if (A02()) {
                this.A00 += read;
                this.A01.update(bArr, 0, read);
            } else {
                int A002 = A00();
                int i3 = this.A00;
                int i4 = i3 + read;
                if (i4 <= A002) {
                    this.A00 = i4;
                    this.A01.update(bArr, 0, read);
                    if (this.A00 == A002) {
                        this.A00 = 0;
                        byte[] doFinal = this.A01.doFinal();
                        int i5 = this.A03;
                        byte[] bArr2 = new byte[i5];
                        System.arraycopy(doFinal, 0, bArr2, 0, i5);
                        this.A07.add(bArr2);
                        this.A01 = AnonymousClass31R.A02(A03(bArr, read), this.A06.A02);
                        A01();
                    }
                } else if (i4 > A002) {
                    this.A01.update(bArr, 0, A002 - i3);
                    byte[] doFinal2 = this.A01.doFinal();
                    int i6 = this.A03;
                    byte[] bArr3 = new byte[i6];
                    System.arraycopy(doFinal2, 0, bArr3, 0, i6);
                    List list = this.A07;
                    list.add(bArr3);
                    byte[] A032 = A03(bArr, A002 - this.A00);
                    byte[] bArr4 = this.A06.A02;
                    this.A01 = AnonymousClass31R.A02(A032, bArr4);
                    int i7 = this.A00;
                    int i8 = (i7 + read) - A002;
                    int i9 = A002 - i7;
                    this.A00 = 0;
                    while (true) {
                        A01();
                        if (i8 <= 0) {
                            break;
                        }
                        int A003 = A00();
                        if (A02() || i8 < A003) {
                            this.A01.update(bArr, i9, i8);
                            this.A00 = i8;
                        } else {
                            this.A01.update(bArr, i9, A003);
                            byte[] bArr5 = new byte[i6];
                            System.arraycopy(this.A01.doFinal(), 0, bArr5, 0, i6);
                            list.add(bArr5);
                            i9 += A003;
                            this.A01 = AnonymousClass31R.A02(A03(bArr, i9), bArr4);
                            i8 -= A003;
                        }
                    }
                    this.A01.update(bArr, i9, i8);
                    this.A00 = i8;
                }
            }
            for (int max = Math.max(0, read - 16); max < read; max++) {
                C148987Km r4 = this.A05;
                byte b = bArr[max];
                int i10 = r4.A01;
                if (i10 >= 16) {
                    r4.A01 = 0;
                    i10 = 0;
                }
                r4.A02[i10] = b;
                r4.A01 = i10 + 1;
                int i11 = r4.A00;
                if (i11 < 16) {
                    r4.A00 = i11 + 1;
                }
            }
        }
        return read;
    }

    public int read() {
        int read;
        byte[] bArr = new byte[1];
        do {
            read = read(bArr, 0, 1);
            if (read == -1) {
                return -1;
            }
        } while (read == 0);
        return bArr[0];
    }

    public int read(byte[] bArr) {
        return AnonymousClass6CA.A03(this, bArr, bArr.length);
    }
}
