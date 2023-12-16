package X;

import sun.misc.Unsafe;

/* renamed from: X.7bl  reason: invalid class name and case insensitive filesystem */
public abstract class C153677bl {
    public Unsafe A00;

    public static int A00(Object obj, long j) {
        return C162367ro.A01.A00.getInt(obj, -4 & j);
    }

    public byte A01(Object obj, long j) {
        int A04;
        boolean z = this instanceof AnonymousClass6YG;
        boolean z2 = C162367ro.A04;
        if (z) {
            if (z2) {
                A04 = AnonymousClass6C7.A04(A00(obj, j), ~j);
            } else {
                A04 = AnonymousClass6C7.A04(A00(obj, j), j);
            }
        } else if (z2) {
            A04 = AnonymousClass6C7.A04(A00(obj, j), ~j);
        } else {
            A04 = AnonymousClass6C7.A04(A00(obj, j), j);
        }
        return (byte) A04;
    }

    public double A02(Object obj, long j) {
        return Double.longBitsToDouble(this.A00.getLong(obj, j));
    }

    public float A03(Object obj, long j) {
        return Float.intBitsToFloat(this.A00.getInt(obj, j));
    }

    public final int A04(Object obj, long j) {
        return this.A00.getInt(obj, j);
    }

    public final long A05(Object obj, long j) {
        return this.A00.getLong(obj, j);
    }

    public void A06(Object obj, long j, byte b) {
        boolean z = C162367ro.A04;
        long j2 = -4 & j;
        C153677bl r4 = C162367ro.A01;
        int A04 = r4.A04(obj, j2);
        int i = (int) j;
        if (z) {
            r4.A09(obj, j2, AnonymousClass6C7.A01(~i, A04, b));
        } else {
            r4.A09(obj, j2, AnonymousClass6C7.A01(i, A04, b));
        }
    }

    public final void A09(Object obj, long j, int i) {
        this.A00.putInt(obj, j, i);
    }

    public final void A0A(Object obj, long j, long j2) {
        this.A00.putLong(obj, j, j2);
    }

    public void A0B(Object obj, long j, boolean z) {
        boolean z2 = C162367ro.A04;
        byte b = z ? (byte) 1 : 0;
        long j2 = -4 & j;
        C153677bl r4 = C162367ro.A01;
        int A04 = r4.A04(obj, j2);
        int i = (int) j;
        if (z2) {
            r4.A09(obj, j2, AnonymousClass6C7.A01(~i, A04, b));
        } else {
            r4.A09(obj, j2, AnonymousClass6C7.A01(i, A04, b));
        }
    }

    public boolean A0C(Object obj, long j) {
        int A04;
        int A042;
        boolean z = this instanceof AnonymousClass6YG;
        boolean z2 = C162367ro.A04;
        if (z) {
            if (z2) {
                A042 = AnonymousClass6C7.A04(A00(obj, j), ~j);
            } else {
                A042 = AnonymousClass6C7.A04(A00(obj, j), j);
            }
            return AnonymousClass000.A1S((byte) A042);
        }
        if (z2) {
            A04 = AnonymousClass6C7.A04(A00(obj, j), ~j);
        } else {
            A04 = AnonymousClass6C7.A04(A00(obj, j), j);
        }
        return AnonymousClass000.A1S((byte) A04);
    }

    public C153677bl(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public void A07(Object obj, long j, double d) {
        A0A(obj, j, Double.doubleToLongBits(d));
    }

    public void A08(Object obj, long j, float f) {
        A09(obj, j, Float.floatToIntBits(f));
    }
}
