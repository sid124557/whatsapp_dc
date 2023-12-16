package X;

import android.content.Context;
import android.view.WindowManager;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5WR  reason: invalid class name */
public class AnonymousClass5WR {
    public static final long A01 = TimeUnit.SECONDS.toNanos(1);
    public long A00 = 0;

    public long A00(Context context) {
        double d;
        long j = this.A00;
        if (j > 0) {
            return j;
        }
        WindowManager A012 = C620633i.A01(context);
        C626936e.A06(A012);
        double refreshRate = (double) A012.getDefaultDisplay().getRefreshRate();
        if (refreshRate < 0.0d) {
            d = 60.0d;
        } else {
            d = 30.0d;
            if (refreshRate >= 30.0d) {
                d = 80.0d;
                if (refreshRate <= 80.0d) {
                    d = refreshRate;
                }
            }
        }
        long round = Math.round(((double) A01) / d);
        this.A00 = round;
        return round;
    }
}
