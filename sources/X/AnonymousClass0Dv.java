package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.0Dv  reason: invalid class name */
public class AnonymousClass0Dv extends AnonymousClass0Dx {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C05580Ub A02;
    public final /* synthetic */ C56612sH A03;

    public AnonymousClass0Dv(C05580Ub r1, C56612sH r2, long j, long j2) {
        this.A00 = j;
        this.A03 = r2;
        this.A02 = r1;
        this.A01 = j2;
    }

    public /* bridge */ /* synthetic */ Object A01(int i) {
        long j = this.A00;
        long j2 = 0;
        if (j > 0) {
            j2 = TimeUnit.MILLISECONDS.toSeconds(j - System.currentTimeMillis());
        }
        if (this.A02.A06(i, j2, this.A01)) {
            return Boolean.TRUE;
        }
        return null;
    }
}
