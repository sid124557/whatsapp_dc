package X;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: X.7bt  reason: invalid class name and case insensitive filesystem */
public abstract class C153747bt {
    public Unsafe A00;

    public abstract void A07(long j, byte b);

    public abstract void A0E(byte[] bArr, long j, long j2, long j3);

    public static int A00(Object obj, long j) {
        return C162337rj.A02.A00.getInt(obj, -4 & j);
    }

    public byte A01(Object obj, long j) {
        int A04;
        boolean z = this instanceof AnonymousClass6W5;
        boolean z2 = C162337rj.A08;
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

    public final long A06(Field field) {
        return this.A00.objectFieldOffset(field);
    }

    public void A08(Object obj, long j, byte b) {
        boolean z = C162337rj.A08;
        long j2 = -4 & j;
        C153747bt r4 = C162337rj.A02;
        int A04 = r4.A04(obj, j2);
        int i = (int) j;
        if (z) {
            r4.A0B(obj, j2, AnonymousClass6C7.A01(~i, A04, b));
        } else {
            r4.A0B(obj, j2, AnonymousClass6C7.A01(i, A04, b));
        }
    }

    public final void A0B(Object obj, long j, int i) {
        this.A00.putInt(obj, j, i);
    }

    public final void A0C(Object obj, long j, long j2) {
        this.A00.putLong(obj, j, j2);
    }

    public void A0D(Object obj, long j, boolean z) {
        boolean z2 = C162337rj.A08;
        byte b = z ? (byte) 1 : 0;
        long j2 = -4 & j;
        C153747bt r4 = C162337rj.A02;
        int A04 = r4.A04(obj, j2);
        int i = (int) j;
        if (z2) {
            r4.A0B(obj, j2, AnonymousClass6C7.A01(~i, A04, b));
        } else {
            r4.A0B(obj, j2, AnonymousClass6C7.A01(i, A04, b));
        }
    }

    public boolean A0F(Object obj, long j) {
        int A04;
        int A042;
        boolean z = this instanceof AnonymousClass6W5;
        boolean z2 = C162337rj.A08;
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

    public C153747bt(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public void A09(Object obj, long j, double d) {
        A0C(obj, j, Double.doubleToLongBits(d));
    }

    public void A0A(Object obj, long j, float f) {
        A0B(obj, j, Float.floatToIntBits(f));
    }
}
