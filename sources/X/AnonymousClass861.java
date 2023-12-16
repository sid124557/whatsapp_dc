package X;

import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;

/* renamed from: X.861  reason: invalid class name */
public abstract class AnonymousClass861 implements C187588xU, C184858sf {
    public int A00;
    public int A01;
    public long A02 = Long.MIN_VALUE;
    public long A03;
    public C157957jC A04;
    public C185338tU A05;
    public boolean A06;
    public boolean A07;
    public C166527yp[] A08;
    public final int A09;
    public final C147807Fu A0A = new C147807Fu();

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C143886zd A06(X.C166527yp r10, java.lang.Throwable r11, boolean r12) {
        /*
            r9 = this;
            r2 = r10
            if (r10 == 0) goto L_0x001a
            boolean r0 = r9.A07
            if (r0 != 0) goto L_0x001a
            r0 = 1
            r9.A07 = r0
            r1 = 0
            int r0 = r9.BqO(r10)     // Catch:{ 6zd -> 0x0018, all -> 0x0014 }
            r7 = r0 & 7
            r9.A07 = r1
            goto L_0x001b
        L_0x0014:
            r0 = move-exception
            r9.A07 = r1
            throw r0
        L_0x0018:
            r9.A07 = r1
        L_0x001a:
            r7 = 4
        L_0x001b:
            java.lang.String r3 = r9.getName()
            int r6 = r9.A00
            r5 = 1
            if (r10 != 0) goto L_0x0025
            r7 = 4
        L_0x0025:
            X.6zd r1 = new X.6zd
            r4 = r11
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass861.A06(X.7yp, java.lang.Throwable, boolean):X.6zd");
    }

    public abstract void A0B();

    public abstract void A0C(long j, boolean z);

    public final int A05(C147807Fu r8, C126496Oc r9, boolean z) {
        C185338tU r0 = this.A05;
        r0.getClass();
        int BiK = r0.BiK(r8, r9, z);
        if (BiK != -4) {
            if (BiK == -5) {
                C166527yp r5 = r8.A00;
                r5.getClass();
                long j = r5.A0J;
                if (j != Long.MAX_VALUE) {
                    C157057he r2 = new C157057he(r5);
                    r2.A0H = j + this.A03;
                    r8.A00 = C166527yp.A00(r2);
                }
            }
            return BiK;
        } else if (C153567bZ.A00(r9)) {
            this.A02 = Long.MIN_VALUE;
            if (!this.A06) {
                return -3;
            }
            return -4;
        } else {
            long j2 = r9.A00 + this.A03;
            r9.A00 = j2;
            this.A02 = Math.max(this.A02, j2);
            return BiK;
        }
    }

    public void A07() {
        C186418vH r2;
        if (this instanceof AnonymousClass6OI) {
            r2 = ((AnonymousClass6OI) this).A0I;
        } else if (this instanceof C126666Ov) {
            C126666Ov r22 = (C126666Ov) this;
            r22.A06 = 0;
            r22.A0D = SystemClock.elapsedRealtime();
            r22.A0H = AnonymousClass6C8.A0L();
            r22.A0I = 0;
            r22.A0C = 0;
            C158657kL r23 = r22.A0X;
            r23.A0C = true;
            r23.A04 = 0;
            r23.A05 = -1;
            r23.A07 = -1;
            r23.A03(false);
            return;
        } else if (this instanceof C126676Ow) {
            r2 = ((C126676Ow) this).A0A;
        } else {
            return;
        }
        AnonymousClass86A r24 = (AnonymousClass86A) r2;
        r24.A0S = true;
        if (r24.A0C != null) {
            AnonymousClass7U3 r1 = r24.A0b.A0M;
            r1.getClass();
            r1.A00(0);
            r24.A0C.play();
        }
    }

    public void A08() {
        C186418vH r7;
        Surface surface;
        if (this instanceof AnonymousClass6OI) {
            AnonymousClass6OI r0 = (AnonymousClass6OI) this;
            r0.A0G();
            r7 = r0.A0I;
        } else if (this instanceof C126666Ov) {
            C126666Ov r2 = (C126666Ov) this;
            r2.A0F = -9223372036854775807L;
            r2.A0c();
            int i = r2.A0C;
            if (i != 0) {
                AnonymousClass7GH r4 = r2.A0Y;
                r4.A00.post(new C70263aD(r4, i, 1, r2.A0I));
                r2.A0I = 0;
                r2.A0C = 0;
            }
            C158657kL r3 = r2.A0X;
            r3.A0C = false;
            if (C162387ry.A01 >= 30 && (surface = r3.A0B) != null && r3.A03 != 0.0f) {
                r3.A03 = 0.0f;
                C158657kL.A00(surface, 0.0f);
                return;
            }
            return;
        } else if (this instanceof C126676Ow) {
            C126676Ow r02 = (C126676Ow) this;
            r02.A0b();
            r7 = r02.A0A;
        } else {
            return;
        }
        AnonymousClass86A r72 = (AnonymousClass86A) r7;
        r72.A0S = false;
        if (r72.A0C != null) {
            AnonymousClass7XR r6 = r72.A0b;
            r6.A0I = 0;
            r6.A04 = 0;
            r6.A02 = 0;
            r6.A09 = 0;
            r6.A0C = 0;
            r6.A0G = 0;
            r6.A0S = false;
            if (r6.A0K == -9223372036854775807L) {
                AnonymousClass7U3 r03 = r6.A0M;
                r03.getClass();
                r03.A00(0);
                r72.A0C.pause();
            }
        }
    }

    public void A09(C166527yp[] r9, long j, long j2) {
        if (this instanceof AnonymousClass6OH) {
            AnonymousClass6OH r1 = (AnonymousClass6OH) this;
            r1.A03 = r9[0];
            if (r1.A04 != null) {
                r1.A00 = 1;
            } else {
                r1.A0G();
            }
        } else if (this instanceof AnonymousClass6OG) {
            AnonymousClass6OG r2 = (AnonymousClass6OG) this;
            r2.A03 = r2.A07.B0a(r9[0]);
        } else if (this instanceof AnonymousClass6OF) {
            AnonymousClass6OF r4 = (AnonymousClass6OF) this;
            boolean z = true;
            if (r4.A0D == -9223372036854775807L) {
                if (r4.A0E != -9223372036854775807L) {
                    z = false;
                }
                C161487pm.A04(z);
                r4.A0E = j;
                r4.A0D = j2;
                return;
            }
            int i = r4.A09;
            long[] jArr = r4.A0x;
            if (i == jArr.length) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Too many stream changes, so dropping offset: ");
                Log.w("MediaCodecRenderer", AnonymousClass001.A0k(A0o, jArr[i - 1]));
            } else {
                r4.A09 = i + 1;
            }
            long[] jArr2 = r4.A0y;
            int i2 = r4.A09;
            int i3 = i2 - 1;
            jArr2[i3] = j;
            jArr[i3] = j2;
            r4.A0z[i2 - 1] = r4.A0B;
        }
    }

    public void A0A() {
    }

    public final boolean BFS() {
        return AnonymousClass000.A1T((this.A02 > Long.MIN_VALUE ? 1 : (this.A02 == Long.MIN_VALUE ? 0 : -1)));
    }

    public final void reset() {
        C161487pm.A04(AnonymousClass000.A1T(this.A01));
        C147807Fu r1 = this.A0A;
        r1.A01 = null;
        r1.A00 = null;
        A0A();
    }

    public AnonymousClass861(int i) {
        this.A09 = i;
    }

    public void A0D(boolean z, boolean z2) {
    }

    public /* synthetic */ void Bmz(float f, float f2) {
    }
}
