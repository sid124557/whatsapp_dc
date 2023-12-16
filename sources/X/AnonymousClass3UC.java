package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* renamed from: X.3UC  reason: invalid class name */
public class AnonymousClass3UC implements C85144Fc {
    public final int A00;
    public final AnonymousClass337 A01;
    public final C45492a6 A02;
    public final Random A03 = AnonymousClass0x9.A1C();
    public final Set A04;

    public final boolean A00(int i) {
        AnonymousClass337 r10 = this.A01;
        long j = r10.A01(i).A01;
        if (j == 0 || ((j != 1 && Math.abs((this.A02.A00() ^ C56952sp.A06(r10.A00, 225)) ^ ((long) i)) % j != 0) || (C18300x5.A1X(this.A04, i) && this.A03.nextInt(this.A00) != 0))) {
            return false;
        }
        return true;
    }

    public boolean BIn(int i) {
        long nextLong;
        AnonymousClass337 r1 = this.A01;
        if (r1.A01(i).A03) {
            return A00(i);
        }
        long j = r1.A01(i).A01;
        if (j == 0) {
            return false;
        }
        if (C18300x5.A1X(this.A04, i)) {
            nextLong = this.A03.nextLong();
            j = Math.max(j, (long) this.A00);
        } else if (j == 1) {
            return true;
        } else {
            nextLong = this.A03.nextLong();
        }
        if (nextLong % j == 0) {
            return true;
        }
        return false;
    }

    public AnonymousClass3UC(AnonymousClass337 r6, C45492a6 r7) {
        this.A01 = r6;
        this.A02 = r7;
        HashSet A0K = AnonymousClass002.A0K();
        for (int A1K : C85144Fc.A00) {
            C18270x1.A1K(A0K, A1K);
        }
        this.A04 = Collections.unmodifiableSet(A0K);
        this.A00 = this.A03.nextInt(901) + 100;
    }
}
