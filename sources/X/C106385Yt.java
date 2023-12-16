package X;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: X.5Yt  reason: invalid class name and case insensitive filesystem */
public final class C106385Yt {
    public static final long A05 = A00(2100, 11);
    public static final long A06 = A00(1900, 0);
    public int A00;
    public long A01 = A05;
    public long A02 = A06;
    public C187358x4 A03 = new C170018Bn(Long.MIN_VALUE);
    public Long A04;

    public static long A00(int i, int i2) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.clear();
        instance.set(1, i);
        instance.set(2, i2);
        long j = new C117045rI(instance).A05;
        Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance2.clear();
        instance2.setTimeInMillis(j);
        return C161097oz.A01(instance2).getTimeInMillis();
    }

    public C106385Yt(C108625dI r4) {
        this.A02 = r4.A06.A05;
        this.A01 = r4.A05.A05;
        this.A04 = Long.valueOf(r4.A00.A05);
        this.A00 = r4.A01;
        this.A03 = r4.A04;
    }

    public C106385Yt() {
    }
}
