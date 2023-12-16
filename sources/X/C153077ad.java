package X;

import android.os.SystemClock;

/* renamed from: X.7ad  reason: invalid class name and case insensitive filesystem */
public final class C153077ad {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public C134076iP A04;
    public String A05;
    public final C56612sH A06;
    public final AnonymousClass4FV A07;

    public final C134076iP A00(C55842r0 r6, AnonymousClass4GQ r7, int i) {
        int i2 = r6.A01;
        if (i2 == 12) {
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        C134076iP r4 = new C134076iP();
        A01(r4, i, uptimeMillis);
        r4.A02 = r6.A01();
        r4.A03 = AnonymousClass33N.A00(i2);
        r4.A04 = Integer.valueOf(r6.A00());
        Boolean bool = r6.A00;
        if (bool != null) {
            r4.A01 = bool;
        }
        r7.invoke(r4);
        this.A03 = uptimeMillis;
        this.A02++;
        this.A01++;
        return r4;
    }

    public final void A02(C55842r0 r3, int i) {
        C134076iP A002 = A00(r3, AnonymousClass8ZD.A00, i);
        if (A002 != null) {
            this.A07.BhD(A002);
        }
    }

    public final void A03(C55842r0 r3, Integer num, int i) {
        C134076iP A002 = A00(r3, new AnonymousClass8YG(num), i);
        if (A002 != null) {
            this.A07.BhD(A002);
        }
    }

    public C153077ad(C56612sH r1, AnonymousClass4FV r2) {
        C18260x0.A0Q(r1, r2);
        this.A06 = r1;
        this.A07 = r2;
    }

    public final void A01(C134076iP r3, int i, long j) {
        r3.A05 = Integer.valueOf(i);
        r3.A07 = C18310x6.A0f(j, this.A00);
        r3.A0A = C18310x6.A0f(j, this.A03);
        r3.A08 = Long.valueOf(this.A01);
        r3.A0B = this.A05;
        r3.A09 = Long.valueOf(this.A02);
    }
}
