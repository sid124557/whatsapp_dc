package X;

import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.7bg  reason: invalid class name and case insensitive filesystem */
public class C153627bg {
    public char A00;
    public char A01;
    public int A02;
    public int A03 = -1;
    public RandomAccessFile A04;
    public boolean A05 = true;
    public boolean A06 = false;
    public final String A07;
    public final byte[] A08;

    public void A02() {
        this.A05 = true;
        RandomAccessFile randomAccessFile = this.A04;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.seek(0);
            } catch (IOException unused) {
                A01();
            }
        }
        if (this.A04 == null) {
            try {
                this.A04 = new RandomAccessFile(this.A07, "r");
            } catch (IOException unused2) {
                this.A05 = false;
                A01();
            }
        }
        if (this.A05) {
            this.A03 = -1;
            this.A02 = 0;
            this.A00 = 0;
            this.A01 = 0;
            this.A06 = false;
        }
    }

    public C153627bg(String str) {
        this.A07 = str;
        this.A08 = new byte[512];
    }

    public long A00() {
        long j = 1;
        long j2 = 0;
        boolean z = true;
        while (true) {
            if (A07()) {
                A05();
                if (!Character.isDigit(this.A00)) {
                    if (!z) {
                        A06();
                        break;
                    } else if (this.A00 == '-') {
                        j = -1;
                    } else {
                        throw new AnonymousClass8RC("Couldn't read number!");
                    }
                } else {
                    j2 = (j2 * 10) + ((long) (this.A00 - '0'));
                }
                z = false;
            } else if (z) {
                throw new AnonymousClass8RC("Couldn't read number because the file ended!");
            }
        }
        return j * j2;
    }

    public void A01() {
        RandomAccessFile randomAccessFile = this.A04;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.A04 = null;
                throw th;
            }
            this.A04 = null;
        }
    }

    public void A03() {
        boolean z = false;
        while (A07()) {
            A05();
            if (this.A00 == 10) {
                z = true;
            } else if (z) {
                A06();
                return;
            }
        }
    }

    public void A04() {
        boolean z = false;
        while (A07()) {
            A05();
            if (this.A00 == ' ') {
                z = true;
            } else if (z) {
                A06();
                return;
            }
        }
    }

    public final void A06() {
        if (!this.A06) {
            this.A03--;
            this.A00 = this.A01;
            this.A06 = true;
            return;
        }
        throw new AnonymousClass8RC("Can only rewind one step!");
    }

    public boolean A07() {
        RandomAccessFile randomAccessFile;
        if (this.A05 && (randomAccessFile = this.A04) != null) {
            int i = this.A03;
            int i2 = this.A02;
            if (i <= i2 - 1) {
                if (i < i2 - 1) {
                    return true;
                }
                try {
                    this.A02 = randomAccessFile.read(this.A08);
                    this.A03 = -1;
                } catch (IOException unused) {
                    this.A05 = false;
                    A01();
                }
                return A07();
            }
        }
        return false;
    }

    public final void A05() {
        if (A07()) {
            int i = this.A03 + 1;
            this.A03 = i;
            this.A01 = this.A00;
            this.A00 = (char) this.A08[i];
            this.A06 = false;
            return;
        }
        throw AnonymousClass6CA.A0c();
    }

    public void finalize() {
        A01();
    }
}
