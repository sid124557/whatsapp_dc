package X;

import android.content.Context;
import android.view.Choreographer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7hP  reason: invalid class name and case insensitive filesystem */
public class C156907hP {
    public static final long A07 = TimeUnit.MINUTES.toNanos(1);
    public double A00;
    public double A01;
    public long A02;
    public boolean A03 = false;
    public final double A04;
    public final AnonymousClass7OJ A05;
    public final AnonymousClass7IA A06;

    public C156907hP(Context context, AnonymousClass5WR r6, AnonymousClass7IA r7) {
        C626936e.A06(r7);
        this.A06 = r7;
        this.A05 = new AnonymousClass7OJ(Choreographer.getInstance(), new AnonymousClass7AG(this));
        this.A04 = (double) r6.A00(context);
        this.A01 = 0.0d;
        this.A00 = 0.0d;
        this.A02 = 0;
    }
}
