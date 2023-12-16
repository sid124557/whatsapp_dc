package X;

import android.os.Handler;
import android.view.Window;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.82V  reason: invalid class name */
public class AnonymousClass82V implements C183728qW {
    public static final long A09;
    public static final long A0A;
    public double A00;
    public double A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public final Handler A06;
    public final C183738qX A07;
    public final AnonymousClass7ST A08;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A09 = timeUnit.toMillis(30);
        A0A = timeUnit.toMillis(30);
    }

    public static /* synthetic */ void A00(AnonymousClass82V r13, int i) {
        double min = Math.min(r13.A01, 10000.0d);
        double min2 = Math.min(r13.A00, 10000.0d);
        long min3 = Math.min(TimeUnit.NANOSECONDS.toMillis(r13.A03 - r13.A04), A0A);
        if (min3 < 0) {
            min3 = 0;
        }
        AnonymousClass7ST r0 = r13.A08;
        r0.A00(new AnonymousClass6L1(min, min2, min3), i);
        r0.A01.markerEnd(689639794, 2);
        Log.d("scrollperf/stop");
        r13.A05 = 0;
        r13.A01 = 0.0d;
        r13.A00 = 0.0d;
        r13.A02 = 0;
        r13.A04 = 0;
        r13.A03 = 0;
    }

    public void B2L() {
        this.A05 = 0;
        this.A01 = 0.0d;
        this.A00 = 0.0d;
        this.A02 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A04 = System.nanoTime();
        this.A07.B2L();
        Log.d("scrollperf/start");
    }

    public AnonymousClass82V(Window window, AnonymousClass7ST r5) {
        this.A08 = r5;
        Handler A0A2 = AnonymousClass000.A0A();
        this.A06 = A0A2;
        this.A07 = new AnonymousClass82W(A0A2, new C167037zf(this), window);
    }

    public void B1f(int i) {
        this.A03 = System.nanoTime();
        this.A07.B1e();
        this.A06.post(new C117705sM((Object) this, i, 0));
    }
}
