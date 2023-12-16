package X;

import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8JQ  reason: invalid class name */
public final class AnonymousClass8JQ implements C186548vX, QuickPerformanceLogger {
    public static final Set A06;
    public final C56612sH A00;
    public final AnonymousClass8JP A01;
    public final AnonymousClass4FX A02;
    public final C85144Fc A03;
    public final AnonymousClass66R A04;
    public final AnonymousClass66R A05;

    static {
        Integer[] numArr = new Integer[5];
        AnonymousClass000.A1L(numArr, 16318558);
        AnonymousClass000.A1M(numArr, 16318559);
        AnonymousClass000.A1N(numArr, 16321564);
        AnonymousClass000.A1O(numArr, 674172413);
        C18280x3.A1P(numArr, 328150699);
        A06 = C73833g9.A06(numArr);
    }

    public void endAllMarkers(short s, boolean z) {
        if (!A04((Integer) null)) {
            this.A01.endAllMarkers(s, z);
        }
    }

    public EventBuilder markEventBuilder(int i, int i2, String str) {
        int i3 = i;
        String str2 = str;
        if (A02(this, str, 2, i)) {
            return AnonymousClass848.A00;
        }
        return new AnonymousClass847(this.A02, this, Integer.valueOf(i2), str2, i3);
    }

    public void markJoinRequestForE2E(int i, int i2, String str, long j, TimeUnit timeUnit) {
        C18270x1.A11(str, 2, timeUnit);
        A04(Integer.valueOf(i));
    }

    public void markJoinResponseForE2E(int i, int i2, String str, long j, TimeUnit timeUnit) {
        C18270x1.A11(str, 2, timeUnit);
        A04(Integer.valueOf(i));
    }

    public void markerAnnotateCrucialForUserFlow(int i, int i2, String str, int i3) {
        C162457s7.A0J(str, 2);
        markerAnnotate(i, i2, str, i3);
    }

    public void markerEndAtPointForUserFlow(int i, int i2, short s, String str) {
        if (!A02(this, str, 3, i)) {
            this.A01.BKf(i, i2, s, str);
        }
    }

    public void markerEndForUserFlow(int i, int i2, short s) {
        markerEndForUserFlow(i, (String) null, i2, s);
    }

    public void markerGenerate(int i, short s, long j, TimeUnit timeUnit) {
        A00(this, timeUnit, 3, i);
    }

    public void markerGenerateWithAnnotations(int i, short s, long j, TimeUnit timeUnit, Map map) {
        A00(this, timeUnit, 3, i);
    }

    public void markerLinkPivot(int i, int i2, String str) {
        A00(this, str, 2, i);
    }

    public void markerStartForE2E(int i, int i2, String str, boolean z, long j, TimeUnit timeUnit) {
        C162457s7.A0J(str, 2);
        A00(this, timeUnit, 5, i);
    }

    public void markerStartForUserFlow(int i, int i2, long j, TimeUnit timeUnit, boolean z) {
        int i3 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A02(this, timeUnit, 3, i)) {
            boolean z2 = z;
            this.A01.markerStartWithCancelPolicy(i3, z2, i2, A03(j, timeUnit), timeUnit2);
        }
    }

    public void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit) {
        int i3 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A02(this, timeUnit, 4, i)) {
            this.A01.markerStartWithCancelPolicy(i3, z, i2, A03(j, timeUnit), timeUnit2);
        }
    }

    public void markerTag(int i, int i2, String str) {
        A00(this, str, 2, i);
    }

    public final long A03(long j, TimeUnit timeUnit) {
        if (j == -1) {
            return timeUnit.convert(currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
        }
        return j;
    }

    public final boolean A04(Integer num) {
        if (C18270x1.A1V(this.A04)) {
            return true;
        }
        if (num == null || A06.contains(num)) {
            return false;
        }
        return true;
    }

    public long currentMonotonicTimestampNanos() {
        return this.A01.A01.currentMonotonicTimestampNanos();
    }

    public boolean isMarkerOn(int i, int i2, boolean z) {
        return this.A01.A01.isMarkerOn(i, i2);
    }

    public AnonymousClass8JQ(C56612sH r3, AnonymousClass1VX r4, AnonymousClass8JP r5, AnonymousClass4FX r6, C85144Fc r7) {
        C18260x0.A0f(r4, r3, r6, r7, r5);
        this.A00 = r3;
        this.A02 = r6;
        this.A03 = r7;
        this.A01 = r5;
        AnonymousClass58H r1 = AnonymousClass58H.PUBLICATION;
        this.A04 = C154517dI.A00(r1, new C120245yH(r4));
        this.A05 = C154517dI.A00(r1, new C174878Wf(this));
    }

    public static void A00(AnonymousClass8JQ r1, Object obj, int i, int i2) {
        C162457s7.A0J(obj, i);
        r1.A04(Integer.valueOf(i2));
    }

    public static boolean A01(AnonymousClass8JQ r1, int i) {
        return r1.A04(Integer.valueOf(i));
    }

    public static boolean A02(AnonymousClass8JQ r1, Object obj, int i, int i2) {
        C162457s7.A0J(obj, i);
        return r1.A04(Integer.valueOf(i2));
    }

    public void BnT(int i, int i2, String str) {
        if (!A01(this, i)) {
            this.A01.BnT(i, i2, str);
        }
    }

    public void BnU(int i, String str) {
        if (!A01(this, i)) {
            this.A01.BnU(i, str);
        }
    }

    public long currentMonotonicTimestamp() {
        return System.currentTimeMillis();
    }

    public void endAllInstancesOfMarker(int i, short s) {
        if (!A01(this, i)) {
            this.A01.endAllInstancesOfMarker(i, s);
        }
    }

    public void markerDrop(int i, int i2) {
        if (!A01(this, i)) {
            this.A01.markerDrop(i, i2);
        }
    }

    public void markerDropForUserFlow(int i, int i2) {
        if (!A01(this, i)) {
            this.A01.markerDrop(i, i2);
        }
    }

    public void markerEnd(int i, int i2, short s) {
        if (!A01(this, i)) {
            this.A01.markerEnd(i, i2, s);
        }
    }

    public void markerStart(int i, String str, String str2) {
        C18260x0.A0Q(str, str2);
        if (!A01(this, i)) {
            this.A01.markerStart(i, str, str2);
        }
    }

    public void markerStartForUserFlowE2E(int i, int i2, long j, TimeUnit timeUnit, String str, boolean z) {
        A04(Integer.valueOf(i));
    }

    public int sampleRateForMarker(int i) {
        if (A01(this, i)) {
            return Integer.MAX_VALUE;
        }
        return (int) ((AnonymousClass3UC) this.A03).A01.A01(i).A01;
    }

    public MarkerEditor withMarker(int i, int i2) {
        if (A01(this, i)) {
            return AnonymousClass6N3.A00;
        }
        return new AnonymousClass6N2(this.A02, this, Integer.valueOf(i2), i);
    }

    public void markerAnnotate(int i, int i2, String str, double d) {
        int i3 = i;
        String str2 = str;
        if (!A02(this, str, 2, i)) {
            this.A01.markerAnnotate(i3, i2, str2, d);
        }
    }

    public void markerAnnotate(int i, int i2, String str, int i3) {
        if (!A02(this, str, 2, i)) {
            this.A01.markerAnnotate(i, i2, str, i3);
        }
    }

    public void markerAnnotate(int i, int i2, String str, long j) {
        int i3 = i;
        String str2 = str;
        if (!A02(this, str, 2, i)) {
            this.A01.markerAnnotate(i3, i2, str2, j);
        }
    }

    public void markerAnnotate(int i, int i2, String str, String str2) {
        C18260x0.A0S(str, str2);
        if (!A01(this, i)) {
            this.A01.markerAnnotate(i, i2, str, str2);
        }
    }

    public void markerAnnotate(int i, int i2, String str, boolean z) {
        if (!A02(this, str, 2, i)) {
            this.A01.markerAnnotate(i, i2, str, z);
        }
    }

    public void markerAnnotate(int i, int i2, String str, double[] dArr) {
        C18260x0.A0S(str, dArr);
        if (!A01(this, i)) {
            this.A01.markerAnnotate(i, i2, str, dArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, int[] iArr) {
        C18260x0.A0S(str, iArr);
        if (!A01(this, i)) {
            this.A01.markerAnnotate(i, i2, str, iArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, long[] jArr) {
        C18260x0.A0S(str, jArr);
        if (!A01(this, i)) {
            this.A01.markerAnnotate(i, i2, str, jArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, String[] strArr) {
        C18260x0.A0S(str, strArr);
        if (!A01(this, i)) {
            this.A01.markerAnnotate(i, i2, str, strArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        C18260x0.A0S(str, zArr);
        if (!A01(this, i)) {
            this.A01.markerAnnotate(i, i2, str, zArr);
        }
    }

    public void markerAnnotate(int i, String str, double d) {
        if (!A02(this, str, 1, i)) {
            this.A01.markerAnnotate(i, str, d);
        }
    }

    public void markerAnnotate(int i, String str, int i2) {
        if (!A02(this, str, 1, i)) {
            this.A01.markerAnnotate(i, str, i2);
        }
    }

    public void markerAnnotate(int i, String str, long j) {
        if (!A02(this, str, 1, i)) {
            this.A01.markerAnnotate(i, str, j);
        }
    }

    public void markerAnnotate(int i, String str, String str2) {
        C18260x0.A0Q(str, str2);
        if (!A01(this, i)) {
            this.A01.markerAnnotate(i, str, str2);
        }
    }

    public void markerAnnotate(int i, String str, boolean z) {
        if (!A02(this, str, 1, i)) {
            this.A01.markerAnnotate(i, str, z);
        }
    }

    public void markerAnnotate(int i, String str, double[] dArr) {
        C18260x0.A0Q(str, dArr);
        if (!A01(this, i)) {
            this.A01.markerAnnotate(i, str, dArr);
        }
    }

    public void markerAnnotate(int i, String str, int[] iArr) {
        C18260x0.A0Q(str, iArr);
        if (!A01(this, i)) {
            this.A01.markerAnnotate(i, str, iArr);
        }
    }

    public void markerAnnotate(int i, String str, long[] jArr) {
        C18260x0.A0Q(str, jArr);
        if (!A01(this, i)) {
            this.A01.markerAnnotate(i, str, jArr);
        }
    }

    public void markerAnnotate(int i, String str, String[] strArr) {
        C18260x0.A0Q(str, strArr);
        if (!A01(this, i)) {
            this.A01.markerAnnotate(i, str, strArr);
        }
    }

    public void markerAnnotate(int i, String str, boolean[] zArr) {
        C18260x0.A0Q(str, zArr);
        if (!A01(this, i)) {
            this.A01.markerAnnotate(i, str, zArr);
        }
    }

    public void markerPoint(int i, int i2, String str) {
        if (!A02(this, str, 2, i)) {
            this.A01.markerPoint(i, i2, str);
        }
    }

    public void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit) {
        String str2 = str;
        TimeUnit timeUnit2 = timeUnit;
        C18270x1.A11(str, 2, timeUnit);
        int i3 = i;
        if (!A01(this, i)) {
            this.A01.markerPoint(i3, i2, str2, A03(j, timeUnit), timeUnit2);
        }
    }

    public void markerPoint(int i, int i2, String str, String str2) {
        if (!A02(this, str, 2, i)) {
            this.A01.markerPoint(i, i2, str, str2);
        }
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        String str3 = str;
        C162457s7.A0J(str, 2);
        int i3 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A02(this, timeUnit, 5, i)) {
            this.A01.markerPoint(i3, i2, str3, str2, A03(j, timeUnit), timeUnit2);
        }
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit, int i3) {
        C162457s7.A0J(str, 2);
        C162457s7.A0J(timeUnit, 5);
        markerPoint(i, i2, str, str2, j, timeUnit);
    }

    public void markerPoint(int i, String str) {
        if (!A02(this, str, 1, i)) {
            this.A01.markerPoint(i, str);
        }
    }

    public void markerPoint(int i, String str, long j, TimeUnit timeUnit) {
        String str2 = str;
        TimeUnit timeUnit2 = timeUnit;
        C18260x0.A0R(str, timeUnit);
        int i2 = i;
        if (!A01(this, i)) {
            this.A01.markerPoint(i2, str2, A03(j, timeUnit), timeUnit2);
        }
    }

    public void markerPoint(int i, String str, String str2) {
        if (!A02(this, str, 1, i)) {
            this.A01.markerPoint(i, str, str2);
        }
    }

    public void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        String str3 = str;
        TimeUnit timeUnit2 = timeUnit;
        C18270x1.A11(str, 1, timeUnit);
        int i2 = i;
        if (!A01(this, i)) {
            this.A01.markerPoint(i2, str3, str2, A03(j, timeUnit), timeUnit2);
        }
    }

    public AnonymousClass8JQ() {
    }

    public boolean isMarkerOn(int i, int i2) {
        return this.A01.A01.isMarkerOn(i, i2);
    }

    public EventBuilder markEventBuilder(int i, String str) {
        int i2 = i;
        String str2 = str;
        if (A02(this, str, 1, i)) {
            return AnonymousClass848.A00;
        }
        return new AnonymousClass847(this.A02, this, (Integer) null, str2, i2);
    }

    public void markerAnnotateCrucialForUserFlow(int i, int i2, String str, String str2) {
        C18260x0.A0S(str, str2);
        markerAnnotate(i, i2, str, str2);
    }

    public void markerDrop(int i) {
        if (!A01(this, i)) {
            this.A01.markerDrop(i);
        }
    }

    public void markerEnd(int i, short s, long j, TimeUnit timeUnit) {
        int i2 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A02(this, timeUnit, 3, i)) {
            this.A01.markerEnd(i2, s, A03(j, timeUnit), timeUnit2);
        }
    }

    public void markerEndForUserFlow(int i, String str, int i2, short s) {
        if (str == null) {
            markerEnd(i, i2, s);
        } else {
            markerEndAtPointForUserFlow(i, i2, s, str);
        }
    }

    public void markerStart(int i, int i2, long j, TimeUnit timeUnit) {
        int i3 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A02(this, timeUnit, 3, i)) {
            this.A01.markerStartWithCancelPolicy(i3, true, i2, A03(j, timeUnit), timeUnit2);
        }
    }

    public void markerStartForUserFlow(int i, int i2, boolean z, long j) {
        if (!A01(this, i)) {
            this.A01.BKl(i, i2, z);
        }
    }

    public void markerTag(int i, String str) {
        A00(this, str, 1, i);
    }

    public MarkerEditor withMarker(int i) {
        if (A01(this, i)) {
            return AnonymousClass6N3.A00;
        }
        return new AnonymousClass6N2(this.A02, this, (Integer) null, i);
    }

    public boolean isMarkerOn(int i, boolean z) {
        return this.A01.A01.BI5(i);
    }

    public void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit) {
        int i3 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A02(this, timeUnit, 4, i)) {
            this.A01.markerEnd(i3, i2, s, A03(j, timeUnit), timeUnit2);
        }
    }

    public void markerStart(int i) {
        if (!A01(this, i)) {
            this.A01.markerStart(i);
        }
    }

    public void markerStartForUserFlow(int i, int i2, String str, boolean z, long j) {
        if (!A01(this, i)) {
            this.A01.BKl(i, i2, z);
        }
    }

    public void markerEnd(int i, short s) {
        if (!A01(this, i)) {
            this.A01.markerEnd(i, s);
        }
    }

    public void markerStart(int i, int i2) {
        if (!A01(this, i)) {
            this.A01.markerStart(i, i2);
        }
    }

    public void markerStart(int i, int i2, long j, TimeUnit timeUnit, int i3) {
        C162457s7.A0J(timeUnit, 3);
        markerStart(i, i2, j, timeUnit);
    }

    public void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        String str3 = str;
        String str4 = str2;
        C18260x0.A0S(str, str2);
        int i3 = i;
        TimeUnit timeUnit2 = timeUnit;
        if (!A02(this, timeUnit, 5, i)) {
            this.A01.markerStart(i3, i2, str3, str4, A03(j, timeUnit), timeUnit2);
        }
    }

    public void markerStart(int i, int i2, String str, String str2) {
        C18260x0.A0S(str, str2);
        if (!A01(this, i)) {
            this.A01.markerStart(i, i2, str, str2);
        }
    }
}
