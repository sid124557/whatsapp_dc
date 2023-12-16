package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.6uO  reason: invalid class name and case insensitive filesystem */
public class C140726uO extends InputStream implements C182788oz {
    public int A00 = -1;
    public int A01 = 0;
    public int A02 = 0;
    public byte[] A03 = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];

    public synchronized void A00() {
        this.A00 = this.A02;
    }

    public void Ax5(byte[] bArr, int i, int i2) {
        int i3;
        byte[] bArr2 = this.A03;
        if (bArr2 == null) {
            throw AnonymousClass002.A0C("Stream is closed.");
        } else if (i2 == 0) {
        } else {
            if (i2 <= bArr.length) {
                int i4 = this.A02;
                int i5 = this.A01;
                if (i4 == i5 && this.A00 == -1) {
                    this.A01 = 0;
                    i5 = 0;
                    this.A02 = 0;
                    i4 = 0;
                }
                int i6 = i3 + i2;
                int length = bArr2.length;
                if (i6 > length) {
                    int i7 = this.A00;
                    int i8 = i3 - i7;
                    int i9 = i8;
                    if (i7 == -1) {
                        i8 = i3 - i4;
                    }
                    int i10 = length - i8;
                    if (i10 < i2) {
                        length += ((int) Math.ceil(((double) (i2 - i10)) / 1024.0d)) * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                    }
                    byte[] bArr3 = new byte[length];
                    if (i7 == -1) {
                        i3 -= i4;
                        System.arraycopy(bArr2, i4, bArr3, 0, i3);
                        this.A02 = 0;
                        this.A01 = i3;
                        this.A00 = -1;
                    } else {
                        System.arraycopy(bArr2, i7, bArr3, 0, i9);
                        int i11 = this.A02;
                        int i12 = this.A00;
                        this.A02 = i11 - i12;
                        i3 = this.A01 - i12;
                        this.A01 = i3;
                        this.A00 = 0;
                    }
                    this.A03 = bArr3;
                    bArr2 = bArr3;
                }
                System.arraycopy(bArr, 0, bArr2, i3, i2);
                this.A01 += i2;
                return;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Len ");
            A0o.append(i2);
            throw AnonymousClass002.A0C(AnonymousClass000.A0X(" exceeds supplied buffer limits.", A0o));
        }
    }

    public synchronized void mark(int i) {
        A00();
    }

    public synchronized void reset() {
        IOException iOException;
        if (this.A03 != null) {
            int i = this.A00;
            if (i != -1) {
                this.A02 = i;
                this.A00 = -1;
            } else {
                iOException = AnonymousClass002.A0C("No marked position found.");
            }
        } else {
            iOException = AnonymousClass002.A0C("Stream is closed.");
        }
        throw iOException;
    }

    public int available() {
        if (this.A03 == null) {
            return -1;
        }
        return this.A01 - this.A02;
    }

    public void close() {
        if (this.A03 != null) {
            super.close();
            this.A03 = null;
            this.A01 = 0;
            this.A02 = 0;
            this.A00 = -1;
            return;
        }
        throw AnonymousClass002.A0C("Stream is already closed.");
    }

    public boolean markSupported() {
        return true;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw AnonymousClass002.A0C("Dst buffer is null");
        } else if (i2 == 0) {
            return i2;
        } else {
            if (i + i2 <= bArr.length) {
                int available = available();
                if (available < 1) {
                    return available;
                }
                int min = Math.min(available, i2);
                System.arraycopy(this.A03, this.A02, bArr, i, min);
                this.A02 += min;
                return min;
            }
            throw AnonymousClass002.A0C("Not enough space in destination buffer.");
        }
    }

    public long skip(long j) {
        if (this.A03 == null) {
            throw AnonymousClass002.A0C("Stream is closed.");
        } else if (j <= 0) {
            return 0;
        } else {
            long j2 = ((long) this.A02) + j;
            int i = this.A01;
            if (j2 >= ((long) i)) {
                int available = available();
                this.A02 = i;
                return (long) available;
            }
            this.A02 = (int) j2;
            return j;
        }
    }

    public int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr);
        if (read > 1) {
            throw AnonymousClass002.A0C("Read returned more than 1 byte");
        } else if (read == 1) {
            return (short) ((short) (bArr[0] & 255));
        } else {
            return -1;
        }
    }

    public int read(byte[] bArr) {
        if (bArr != null) {
            return read(bArr, 0, bArr.length);
        }
        throw AnonymousClass002.A0C("Dst buffer is null");
    }
}
