package X;

import android.view.Choreographer;

/* renamed from: X.7zA  reason: invalid class name and case insensitive filesystem */
public class C166727zA implements Choreographer.FrameCallback {
    public final /* synthetic */ Choreographer A00;
    public final /* synthetic */ AnonymousClass82X A01;

    public C166727zA(Choreographer choreographer, AnonymousClass82X r2) {
        this.A01 = r2;
        this.A00 = choreographer;
    }

    public void doFrame(long j) {
        Choreographer choreographer;
        AnonymousClass82X r5 = this.A01;
        if (!r5.A02) {
            r5.A04.removeFrameCallback(this);
            return;
        }
        if (r5.A00 == -1) {
            r5.A00 = j;
            r5.A01 = j;
            choreographer = r5.A04;
        } else {
            r5.A01 = j;
            AnonymousClass82U r8 = r5.A05.A00;
            double d = r8.A04;
            long max = Math.max(Math.round(((double) (j - r5.A01)) / d), 1);
            long min = Math.min(max - 1, 100);
            double d2 = (double) min;
            r8.A01 += d2;
            if (min > 4) {
                r8.A00 += d2 / 4.0d;
            }
            r8.A02 = (long) (((double) r8.A02) + (d * ((double) max)));
            choreographer = this.A00;
        }
        choreographer.postFrameCallback(this);
    }
}
