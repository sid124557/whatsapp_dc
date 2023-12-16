package X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.85F  reason: invalid class name */
public class AnonymousClass85F implements C186008ub {
    public final /* synthetic */ C162987t5 A00;

    public void BYN(int i, boolean z, boolean z2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C162987t5 r5 = this.A00;
        Handler handler = r5.A0l;
        Object[] objArr = new Object[4];
        AnonymousClass000.A1P(objArr, z ? 1 : 0, 0);
        AnonymousClass000.A1P(objArr, i, 1);
        AnonymousClass000.A1Q(objArr, 2, elapsedRealtime);
        AnonymousClass6C7.A1V(objArr, 3, false);
        C162987t5.A01(handler, r5, objArr, 9);
    }

    public AnonymousClass85F(C162987t5 r1) {
        this.A00 = r1;
    }

    public void BYB() {
        this.A00.A0o.BYB();
    }

    public void BYL(C143946zk r2, C142846xt r3) {
        this.A00.A0I(r2, r3);
    }

    public void BYS(int i) {
        C162987t5 r5 = this.A00;
        if (r5.A0p.improveLooping && i == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Handler handler = r5.A0l;
            Object[] A0M = AnonymousClass002.A0M();
            C18270x1.A1Q(A0M, i);
            AnonymousClass000.A1Q(A0M, 1, elapsedRealtime);
            C162987t5.A01(handler, r5, A0M, 38);
        }
    }

    public void Bfi(C142846xt r4, String str) {
        this.A00.A0o.Bfh(r4.name(), "UNKNOWN", str);
    }

    public void BeR(C166607yy r1, AnonymousClass7VV r2) {
    }

    public void Be4(Timeline timeline, Object obj, int i) {
    }
}
