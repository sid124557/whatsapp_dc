package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.5WG  reason: invalid class name */
public final class AnonymousClass5WG {
    public static final long A07 = TimeUnit.HOURS.toMillis(708);
    public static final long[] A08;
    public final C56642sK A00;
    public final C56612sH A01;
    public final AnonymousClass33p A02;
    public final C56762sW A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass4FV A05;
    public final C56572sD A06;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A08 = new long[]{timeUnit.toMillis(30), timeUnit.toMillis(60), timeUnit.toMillis(90), timeUnit.toMillis(180), timeUnit.toMillis(360)};
    }

    public AnonymousClass5WG(C56642sK r1, C56612sH r2, AnonymousClass33p r3, C56762sW r4, AnonymousClass1VX r5, AnonymousClass4FV r6, C56572sD r7) {
        C18260x0.A0f(r2, r5, r6, r7, r4);
        C18260x0.A0U(r1, r3);
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
    }
}
