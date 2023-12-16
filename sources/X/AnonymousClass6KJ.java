package X;

import android.net.Uri;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.6KJ  reason: invalid class name */
public final class AnonymousClass6KJ extends C1675681o implements C185788uF {
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public AnonymousClass6KJ() {
        super(false);
    }

    public void close() {
        this.A01 = null;
        try {
            RandomAccessFile randomAccessFile = this.A02;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A00();
            }
        } catch (IOException e) {
            throw new C140416th(e);
        } catch (Throwable th) {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A00();
            }
            throw th;
        }
    }

    public Uri BE6() {
        return this.A01;
    }

    public long Bfw(C161387pX r8) {
        try {
            C153827c5.A01("fileSrcReadOpen");
            Uri uri = r8.A04;
            this.A01 = uri;
            A01();
            RandomAccessFile randomAccessFile = new RandomAccessFile(uri.getPath(), "r");
            this.A02 = randomAccessFile;
            long j = r8.A03;
            randomAccessFile.seek(j);
            long j2 = r8.A02;
            if (j2 == -1) {
                j2 = this.A02.length() - j;
            }
            this.A00 = j2;
            if (j2 >= 0) {
                C153827c5.A00();
                this.A03 = true;
                A03(r8);
                return this.A00;
            }
            throw AnonymousClass6CA.A0M();
        } catch (IOException e) {
            throw new C140416th(e);
        } catch (Throwable th) {
            C153827c5.A00();
            throw th;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        try {
            C153827c5.A01("fileSrcReadRAF");
            int read = this.A02.read(bArr, i, AnonymousClass6CA.A02(this.A00, (long) i2));
            C153827c5.A00();
            if (read <= 0) {
                return read;
            }
            this.A00 -= (long) read;
            A02(read);
            return read;
        } catch (IOException e) {
            throw new C140416th(e);
        } catch (Throwable th) {
            C153827c5.A00();
            throw th;
        }
    }
}
