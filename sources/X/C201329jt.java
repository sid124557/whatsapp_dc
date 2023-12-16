package X;

import java.util.Arrays;

/* renamed from: X.9jt  reason: invalid class name and case insensitive filesystem */
public class C201329jt implements Runnable {
    public final /* synthetic */ C195639Yw A00;
    public final /* synthetic */ C202879mj A01;
    public final /* synthetic */ C195349Xk A02;
    public final /* synthetic */ AnonymousClass9KQ A03;
    public final /* synthetic */ AnonymousClass32L A04;

    public C201329jt(C195639Yw r1, C202879mj r2, C195349Xk r3, AnonymousClass9KQ r4, AnonymousClass32L r5) {
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
    }

    public void run() {
        C195639Yw r5 = this.A00;
        C195349Xk r3 = this.A02;
        AnonymousClass32L r1 = this.A04;
        AnonymousClass9KQ r2 = this.A03;
        r5.A06.A01(r3, r2, r1, false);
        C89984fb r52 = r5.A07;
        C162457s7.A0J(r2, 1);
        if (!r52.A07(r1)) {
            long A06 = r52.A06(r1);
            int ordinal = r2.mType.ordinal();
            String format = String.format("Effect fetch failed, reason: %s", Arrays.copyOf(new Object[]{String.valueOf(r2.getMessage())}, 1));
            C162457s7.A0D(format);
            r52.A02(A06, "ar_delivery", ordinal, format);
        }
        this.A01.BSl(r2);
    }
}
