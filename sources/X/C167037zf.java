package X;

import android.view.FrameMetrics;
import android.view.Window;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7zf  reason: invalid class name and case insensitive filesystem */
public class C167037zf implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ AnonymousClass82V A00;

    public /* synthetic */ C167037zf(AnonymousClass82V r1) {
        this.A00 = r1;
    }

    public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        long metric = frameMetrics.getMetric(11) - frameMetrics.getMetric(10);
        if (metric > 0) {
            AnonymousClass82V r8 = this.A00;
            r8.A05 += TimeUnit.NANOSECONDS.toMillis(metric);
            r8.A01 += Math.min(((double) metric) / ((double) 16666666), 1000.0d);
        }
        AnonymousClass82V r6 = this.A00;
        if (metric >= 66666664) {
            r6.A00 += Math.min(((double) metric) / ((double) 66666664), 1000.0d);
        }
        r6.A02 += i;
    }
}
