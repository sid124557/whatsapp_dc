package X;

import android.net.Uri;
import com.google.android.exoplayer2.Timeline;

/* renamed from: X.6OP  reason: invalid class name */
public final class AnonymousClass6OP extends Timeline {
    public static final C151877Wq A05;
    public static final Object A06 = AnonymousClass002.A0D();
    public final long A00;
    public final long A01;
    public final C151387Uo A02;
    public final C151877Wq A03;
    public final boolean A04;

    public C158647kK A0B(C158647kK r9, int i, long j) {
        C161487pm.A00(i, 1);
        Object obj = C158647kK.A0F;
        C158647kK r0 = r9;
        r0.A00(this.A02, this.A03, obj, this.A01, this.A04, false);
        return r9;
    }

    public AnonymousClass6OP(C151877Wq r2, long j, boolean z, boolean z2) {
        C151387Uo r0;
        if (z2) {
            r0 = r2.A01;
        } else {
            r0 = null;
        }
        this.A00 = j;
        this.A01 = j;
        this.A04 = z;
        this.A03 = r2;
        this.A02 = r0;
    }

    static {
        AnonymousClass7UC r1 = new AnonymousClass7UC();
        r1.A02 = "SinglePeriodTimeline";
        r1.A00 = Uri.EMPTY;
        A05 = r1.A00();
    }
}
