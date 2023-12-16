package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.819  reason: invalid class name */
public final class AnonymousClass819 implements C184728sQ {
    public final int A00;
    public final int A01;
    public final C161457ph A02;

    public int B7i() {
        return this.A00;
    }

    public int BCQ() {
        return this.A01;
    }

    public int BiO() {
        int i = this.A00;
        if (i == -1) {
            return this.A02.A05();
        }
        return i;
    }

    public AnonymousClass819(C166637z1 r6, C125806Jo r7) {
        C161457ph r4 = r7.A00;
        this.A02 = r4;
        r4.A0H(12);
        int A05 = r4.A05();
        if ("audio/raw".equals(r6.A0S)) {
            int A022 = Util.A02(r6.A0B, r6.A05);
            if (A05 == 0 || A05 % A022 != 0) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Audio sample size mismatch. stsd sample size: ");
                A0o.append(A022);
                Log.w("AtomParsers", AnonymousClass000.A0Y(", stsz sample size: ", A0o, A05));
                A05 = A022;
            }
            this.A00 = A05;
            this.A01 = r4.A05();
        }
        if (A05 == 0) {
            A05 = -1;
        }
        this.A00 = A05;
        this.A01 = r4.A05();
    }
}
