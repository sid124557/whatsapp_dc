package X;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8JP  reason: invalid class name */
public class AnonymousClass8JP implements C186568vZ {
    public final AnonymousClass1VX A00;
    public final C186568vZ A01;
    public volatile Boolean A02;

    public final boolean A00() {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A02 = Boolean.valueOf(this.A00.A0X(433));
                }
            }
        }
        return this.A02.booleanValue();
    }

    public void B2S(int i, short s) {
        this.A01.B2S(300000, 113);
    }

    public Collection B4R() {
        return this.A01.B4R();
    }

    public boolean BFG() {
        return this.A01.BFG();
    }

    public boolean BI5(int i) {
        return this.A01.BI5(i);
    }

    public void BKm(int i, String str, String str2, long j, TimeUnit timeUnit) {
        if (!A00()) {
            this.A01.BKm(i, "perf_origin", str2, j, timeUnit);
        }
    }

    public void BKo(String str, String str2, int i, int i2, boolean z) {
        if (!A00()) {
            this.A01.BKo("perf_origin", str2, i, i2, z);
        }
    }

    public Long Bgb() {
        return this.A01.Bgb();
    }

    public Integer Bgc() {
        return this.A01.Bgc();
    }

    public String Bgy() {
        return this.A01.Bgy();
    }

    public void Bko() {
        this.A01.Bko();
    }

    public void Bsf() {
        this.A01.Bsf();
    }

    public long currentMonotonicTimestampNanos() {
        return this.A01.currentMonotonicTimestampNanos();
    }

    public void endAllInstancesOfMarker(int i, short s) {
        this.A01.endAllInstancesOfMarker(i, s);
    }

    public void endAllMarkers(short s, boolean z) {
        this.A01.endAllMarkers(s, z);
    }

    public boolean isMarkerOn(int i, int i2) {
        return this.A01.isMarkerOn(i, i2);
    }

    public AnonymousClass8JP(AnonymousClass1VX r1, C186568vZ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BKd(AnonymousClass66C r2, int i) {
        if (!A00()) {
            this.A01.BKd(r2, i);
        }
    }

    public void BKf(int i, int i2, short s, String str) {
        if (!A00()) {
            this.A01.BKf(i, i2, s, str);
        }
    }

    public void BKg(String str, int i, short s) {
        if (!A00()) {
            this.A01.BKg(str, i, s);
        }
    }

    public boolean BKi(int i) {
        return this.A01.BKi(689639794);
    }

    public void BKl(int i, int i2, boolean z) {
        if (!A00()) {
            this.A01.BKl(i, i2, z);
        }
    }

    public void BKn(int i, boolean z) {
        if (!A00()) {
            this.A01.BKn(551497305, false);
        }
    }

    public void BnT(int i, int i2, String str) {
        if (!A00()) {
            this.A01.BnT(i, i2, str);
        }
    }

    public void BnU(int i, String str) {
        if (!A00()) {
            this.A01.BnU(i, str);
        }
    }

    public void markerDrop(int i, int i2) {
        if (!A00()) {
            this.A01.markerDrop(i, i2);
        }
    }

    public void markerEnd(int i, int i2, short s) {
        if (!A00()) {
            this.A01.markerEnd(i, i2, s);
        }
    }

    public void markerPoint(int i, int i2, String str) {
        if (!A00()) {
            this.A01.markerPoint(i, i2, str);
        }
    }

    public void markerStart(int i, String str, String str2) {
        if (!A00()) {
            this.A01.markerStart(i, str, str2);
        }
    }

    public void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit) {
        if (!A00()) {
            this.A01.markerStartWithCancelPolicy(i, z, i2, j, timeUnit);
        }
    }

    public void markerAnnotate(int i, int i2, String str, double d) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, d);
        }
    }

    public void markerAnnotate(int i, int i2, String str, int i3) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, i3);
        }
    }

    public void markerAnnotate(int i, int i2, String str, long j) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, j);
        }
    }

    public void markerAnnotate(int i, int i2, String str, String str2) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, str2);
        }
    }

    public void markerAnnotate(int i, int i2, String str, boolean z) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, z);
        }
    }

    public void markerAnnotate(int i, int i2, String str, double[] dArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, dArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, int[] iArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, iArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, long[] jArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, jArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, String[] strArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, strArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, zArr);
        }
    }

    public void markerAnnotate(int i, String str, double d) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, d);
        }
    }

    public void markerAnnotate(int i, String str, int i2) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, i2);
        }
    }

    public void markerAnnotate(int i, String str, long j) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, j);
        }
    }

    public void markerAnnotate(int i, String str, String str2) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, str2);
        }
    }

    public void markerAnnotate(int i, String str, boolean z) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, z);
        }
    }

    public void markerAnnotate(int i, String str, double[] dArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, dArr);
        }
    }

    public void markerAnnotate(int i, String str, int[] iArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, iArr);
        }
    }

    public void markerAnnotate(int i, String str, long[] jArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, jArr);
        }
    }

    public void markerAnnotate(int i, String str, String[] strArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, strArr);
        }
    }

    public void markerAnnotate(int i, String str, boolean[] zArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, zArr);
        }
    }

    public void markerDrop(int i) {
        this.A01.markerDrop(i);
    }

    public void markerEnd(int i, short s, long j, TimeUnit timeUnit) {
        if (!A00()) {
            this.A01.markerEnd(i, s, j, timeUnit);
        }
    }

    public void markerPoint(int i, String str, long j, TimeUnit timeUnit) {
        if (!A00()) {
            this.A01.markerPoint(i, str, j, timeUnit);
        }
    }

    public void markerStart(int i, int i2, String str, String str2) {
        if (!A00()) {
            this.A01.markerStart(i, i2, str, str2);
        }
    }

    public void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit) {
        if (!A00()) {
            this.A01.markerEnd(i, i2, s, j, timeUnit);
        }
    }

    public void markerPoint(int i, String str, String str2) {
        if (!A00()) {
            this.A01.markerPoint(i, str, str2);
        }
    }

    public void markerStart(int i) {
        if (!A00()) {
            this.A01.markerStart(i);
        }
    }

    public void markerEnd(int i, short s) {
        if (!A00()) {
            this.A01.markerEnd(i, s);
        }
    }

    public void markerPoint(int i, String str) {
        if (!A00()) {
            this.A01.markerPoint(i, str);
        }
    }

    public void markerStart(int i, int i2) {
        if (!A00()) {
            this.A01.markerStart(i, i2);
        }
    }

    public void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit) {
        if (!A00()) {
            this.A01.markerPoint(i, i2, str, j, timeUnit);
        }
    }

    public void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        if (!A00()) {
            this.A01.markerStart(i, i2, str, str2, j, timeUnit);
        }
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        if (!A00()) {
            this.A01.markerPoint(i, i2, str, str2, j, timeUnit);
        }
    }

    public void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        if (!A00()) {
            this.A01.markerPoint(i, str, str2, j, timeUnit);
        }
    }

    public void markerPoint(int i, int i2, String str, String str2) {
        if (!A00()) {
            this.A01.markerPoint(i, i2, str, str2);
        }
    }
}
