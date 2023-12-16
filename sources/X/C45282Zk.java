package X;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2Zk  reason: invalid class name and case insensitive filesystem */
public final class C45282Zk {
    public final C56612sH A00;
    public final AnonymousClass2OK A01;
    public final C60692yy A02;

    public final long A00() {
        long A06 = C56952sp.A06(this.A01.A01, 3302);
        if (A06 <= -1) {
            return 0;
        }
        return new Date().getTime() - TimeUnit.MILLISECONDS.convert(A06, TimeUnit.DAYS);
    }

    public C45282Zk(C56612sH r1, AnonymousClass2OK r2, C60692yy r3) {
        C18260x0.A0V(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
