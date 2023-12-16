package X;

import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.7nh  reason: invalid class name and case insensitive filesystem */
public final class C160477nh {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Timeline A03;
    public final AnonymousClass7Z2 A04;
    public final C166607yy A05;
    public final AnonymousClass7NU A06;
    public final C142576xQ A07;
    public final Object A08;
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    public C160477nh(Timeline timeline, C166607yy r19, AnonymousClass7NU r20, long j) {
        this(timeline, new AnonymousClass7Z2(0, -1, -1, -1), r19, r20, C142576xQ.UNKNOWN, (Object) null, 1, j, -9223372036854775807L, false, false);
    }

    public static void A00(C160477nh r2, C160477nh r3) {
        r3.A0D = r2.A0D;
        r3.A0C = r2.A0C;
        r3.A0B = r2.A0B;
    }

    public C160477nh A01(AnonymousClass7Z2 r16, long j, long j2) {
        long j3 = j2;
        Timeline timeline = this.A03;
        Object obj = this.A08;
        AnonymousClass7Z2 r3 = r16;
        if (r3.A00 == -1) {
            j3 = -9223372036854775807L;
        }
        return new C160477nh(timeline, r3, this.A05, this.A06, this.A07, obj, this.A00, j, j3, this.A0A, this.A09);
    }

    public C160477nh A02(C166607yy r15, AnonymousClass7NU r16) {
        Timeline timeline = this.A03;
        Object obj = this.A08;
        AnonymousClass7Z2 r2 = this.A04;
        long j = this.A02;
        long j2 = this.A01;
        C166607yy r3 = r15;
        AnonymousClass7NU r4 = r16;
        C160477nh r0 = new C160477nh(timeline, r2, r3, r4, this.A07, obj, this.A00, j, j2, this.A0A, this.A09);
        A00(this, r0);
        return r0;
    }

    public C160477nh(Timeline timeline, AnonymousClass7Z2 r2, C166607yy r3, AnonymousClass7NU r4, C142576xQ r5, Object obj, int i, long j, long j2, boolean z, boolean z2) {
        this.A03 = timeline;
        this.A08 = obj;
        this.A04 = r2;
        this.A02 = j;
        this.A01 = j2;
        this.A0D = j;
        this.A0C = j;
        this.A00 = i;
        this.A0A = z;
        this.A05 = r3;
        this.A06 = r4;
        this.A07 = r5;
        this.A09 = z2;
    }
}
