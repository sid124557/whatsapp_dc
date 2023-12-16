package X;

import android.content.Context;
import android.view.Choreographer;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.82U  reason: invalid class name */
public class AnonymousClass82U implements C183728qW {
    public static final long A07 = TimeUnit.MINUTES.toNanos(1);
    public double A00;
    public double A01;
    public long A02;
    public boolean A03 = false;
    public final double A04;
    public final C183738qX A05;
    public final AnonymousClass7ST A06;

    public void B1f(int i) {
        if (this.A03) {
            this.A03 = false;
            this.A05.B1e();
            AnonymousClass7ST r4 = this.A06;
            r4.A00(new C150807Sh(Math.min(this.A01, 3600.0d), Math.min(this.A00, 1000.0d), TimeUnit.NANOSECONDS.toMillis(Math.min(this.A02, A07))), i);
            r4.A01.markerEnd(689639794, 2);
            Log.d("scrollperf/stop");
            this.A01 = 0.0d;
            this.A00 = 0.0d;
            this.A02 = 0;
        }
    }

    public void B2L() {
        if (!this.A03) {
            this.A03 = true;
            this.A05.B2L();
            Log.d("scrollperf/start");
        }
    }

    public AnonymousClass82U(Context context, AnonymousClass5WR r6, AnonymousClass7ST r7) {
        this.A06 = r7;
        this.A05 = new AnonymousClass82X(Choreographer.getInstance(), new AnonymousClass7AH(this));
        this.A04 = (double) r6.A00(context);
        this.A01 = 0.0d;
        this.A00 = 0.0d;
        this.A02 = 0;
    }
}
