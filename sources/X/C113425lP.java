package X;

import android.os.SystemClock;
import java.util.List;

/* renamed from: X.5lP  reason: invalid class name and case insensitive filesystem */
public final class C113425lP implements C836349e {
    public long A00;
    public long A01;
    public final C56972sr A02;
    public final C64773Ex A03;
    public final AnonymousClass5ZU A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public boolean B3H(C95814uZ r9) {
        long j;
        AnonymousClass3ZH A09;
        long j2;
        long j3;
        long j4;
        long j5;
        C162457s7.A0J(r9, 0);
        C626936e.A00();
        boolean z = this.A08;
        if (z) {
            j = SystemClock.elapsedRealtimeNanos();
        } else {
            j = 0;
        }
        C56972sr r2 = this.A02;
        if (r2.A0a(r9)) {
            A09 = C56972sr.A01(r2);
        } else {
            A09 = this.A03.A09(r9);
        }
        long j6 = this.A00;
        if (z) {
            j2 = SystemClock.elapsedRealtimeNanos();
        } else {
            j2 = 0;
        }
        this.A00 = j6 + (j2 - j);
        if (A09 == null) {
            return false;
        }
        if (z) {
            j3 = SystemClock.elapsedRealtimeNanos();
        } else {
            j3 = 0;
        }
        C95814uZ r1 = A09.A0H;
        boolean z2 = false;
        if (!C627336j.A0L(r1) || this.A06 || this.A07) {
            if (!(r1 instanceof C28001fK) && AnonymousClass5ZU.A04(this.A04, A09, this.A05)) {
                z2 = true;
            }
            j4 = this.A01;
            if (!z) {
                j5 = 0;
                this.A01 = j4 + (j5 - j3);
                return z2;
            }
        } else {
            j4 = this.A01;
        }
        j5 = SystemClock.elapsedRealtimeNanos();
        this.A01 = j4 + (j5 - j3);
        return z2;
    }

    public C113425lP(C56972sr r3, C64773Ex r4, AnonymousClass5ZU r5, AnonymousClass1VX r6, AnonymousClass2ML r7, List list) {
        C18260x0.A0f(r6, r7, r4, r3, r5);
        C162457s7.A0J(list, 6);
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = list;
        this.A06 = r7.A01.A0X(3751);
        this.A07 = r6.A0X(4748);
        this.A08 = r6.A0X(1777);
    }
}
