package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7il  reason: invalid class name and case insensitive filesystem */
public class C157717il {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C142346x3 A04;
    public final C161397pY A05;
    public final AnonymousClass8L5 A06;
    public final AtomicBoolean A07;
    public final AtomicBoolean A08;
    public final boolean A09;

    public long A00(long j) {
        int i;
        float f;
        C161397pY r1;
        AnonymousClass8L5 r4 = this.A06;
        if (r4 == null) {
            return 0;
        }
        try {
            C153827c5.A01("getIntentBasedLowWatermarkUs");
            int i2 = r4.cellMinLowWaterMarkMs;
            if (!this.A09 || (r1 = this.A05) == null) {
                i = r4.cellMaxLowWaterMarkMs;
            } else {
                i = r1.A01(11);
            }
            float f2 = r4.cellLowWaterMarkMultiplier;
            C142346x3 r12 = this.A04;
            if (r12 == C142346x3.MODERATE) {
                f = r4.waterMarkLowMultiplier;
            } else if (r12 == C142346x3.AGGRESSIVE) {
                f = r4.waterMarkHighMultiplier;
            } else {
                f = 1.0f;
            }
            return (long) (f * Math.min(((float) (((long) i2) * 1000)) + (f2 * ((float) j)), (float) (((long) i) * 1000)));
        } finally {
            C153827c5.A00();
        }
    }

    public C157717il(C142346x3 r5, C161397pY r6, AnonymousClass8L5 r7, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, int i, int i2, int i3, int i4, boolean z) {
        this.A06 = r7;
        this.A08 = atomicBoolean;
        this.A07 = atomicBoolean2;
        this.A02 = ((long) i) * 1000;
        this.A03 = ((long) i2) * 1000;
        this.A01 = ((long) i3) * 1000;
        this.A00 = ((long) i4) * 1000;
        this.A04 = r5;
        this.A05 = r6;
        this.A09 = z;
    }

    public C157717il() {
        this(C142346x3.DEFAULT, (C161397pY) null, (AnonymousClass8L5) null, new AtomicBoolean(false), new AtomicBoolean(false), 1000, -1, 15000, 30000, false);
    }
}
