package X;

import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.81w  reason: invalid class name and case insensitive filesystem */
public final class C1676381w implements C184768sU, C177658gE {
    public static C1676381w A0A;
    public static final C129586aY A0B = C129586aY.of(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final C129586aY A0C;
    public static final C129586aY A0D;
    public static final C129586aY A0E = C129586aY.of(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final C129586aY A0F = C129586aY.of(2800000L, 1800000L, 1400000L, 1100000L, 870000L);
    public static final C129586aY A0G = C129586aY.of(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public Map A06;
    public final AnonymousClass7A7 A07;
    public final C158197ja A08;
    public final C186588vc A09;

    public /* bridge */ /* synthetic */ void BO0(C161387pX r6, Object obj, int i, boolean z) {
        synchronized (this) {
            this.A02 += (long) i;
        }
    }

    public /* bridge */ /* synthetic */ void BeX(C161387pX r12, Object obj, boolean z) {
        synchronized (this) {
            C159197lM.A02(AnonymousClass001.A1W(this.A01));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = (int) (elapsedRealtime - this.A03);
            this.A05 += (long) i;
            long j = this.A04;
            long j2 = this.A02;
            this.A04 = j + j2;
            if (i > 0) {
                float f = (((float) j2) * 8000.0f) / ((float) i);
                C158197ja r7 = this.A08;
                r7.A01((int) Math.sqrt((double) j2), f);
                if (this.A05 >= 2000 || this.A04 >= 524288) {
                    r7.A00();
                }
                this.A00++;
            }
            int i2 = this.A01 - 1;
            this.A01 = i2;
            if (i2 > 0) {
                this.A03 = elapsedRealtime;
            }
            this.A02 = 0;
        }
    }

    public /* bridge */ /* synthetic */ void Beb(C161387pX r5, Object obj, boolean z, boolean z2) {
        synchronized (this) {
            int i = this.A01;
            if (i == 0) {
                this.A03 = SystemClock.elapsedRealtime();
            }
            this.A01 = i + 1;
        }
    }

    static {
        Long valueOf = Long.valueOf(SearchActionVerificationClientService.MS_TO_NS);
        A0C = C129586aY.of(2100000L, 1400000L, valueOf, 890000L, 640000L);
        A0D = C129586aY.of(2600000L, 1700000L, 1300000L, valueOf, 700000L);
    }

    public C1676381w(C186588vc r2, Map map) {
        this.A07 = new AnonymousClass7A7();
        this.A08 = new C158197ja();
        this.A09 = r2;
        this.A06 = map;
        this.A00 = 0;
    }

    @Deprecated
    public C1676381w() {
        this(C186588vc.A00, Collections.emptyMap());
    }
}
