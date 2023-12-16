package X;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.88b  reason: invalid class name and case insensitive filesystem */
public final class C1691188b implements C187668xc {
    public long A00;
    public Uri A01 = Uri.EMPTY;
    public Map A02 = Collections.emptyMap();
    public final C187668xc A03;

    public Map BCF() {
        return this.A03.BCF();
    }

    public Uri BE6() {
        return this.A03.BE6();
    }

    public long Bfx(C157677ih r5) {
        this.A01 = r5.A04;
        this.A02 = Collections.emptyMap();
        C187668xc r3 = this.A03;
        long Bfx = r3.Bfx(r5);
        Uri BE6 = r3.BE6();
        BE6.getClass();
        this.A01 = BE6;
        this.A02 = r3.BCF();
        return Bfx;
    }

    public void close() {
        this.A03.close();
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.A03.read(bArr, i, i2);
        if (read != -1) {
            this.A00 += (long) read;
        }
        return read;
    }

    public C1691188b(C187668xc r2) {
        r2.getClass();
        this.A03 = r2;
    }

    public void Awr(C178288hI r2) {
        r2.getClass();
        this.A03.Awr(r2);
    }
}
