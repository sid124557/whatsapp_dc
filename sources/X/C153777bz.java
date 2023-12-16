package X;

import com.google.protobuf.UnsafeUtil;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: X.7bz  reason: invalid class name and case insensitive filesystem */
public abstract class C153777bz {
    public Unsafe A00;

    public static Object A00(Object obj, long j) {
        return UnsafeUtil.A01.A00.getObject(obj, j);
    }

    public byte A01(Object obj, long j) {
        int A04;
        boolean z = this instanceof C130846cd;
        boolean z2 = UnsafeUtil.A08;
        if (z) {
            long j2 = -4 & j;
            Unsafe unsafe = UnsafeUtil.A01.A00;
            if (z2) {
                A04 = AnonymousClass6C7.A04(unsafe.getInt(obj, j2), ~j);
            } else {
                A04 = AnonymousClass6C7.A04(unsafe.getInt(obj, j2), j);
            }
        } else {
            long j3 = -4 & j;
            Unsafe unsafe2 = UnsafeUtil.A01.A00;
            if (z2) {
                A04 = AnonymousClass6C7.A04(unsafe2.getInt(obj, j3), ~j);
            } else {
                A04 = AnonymousClass6C7.A04(unsafe2.getInt(obj, j3), j);
            }
        }
        return (byte) (A04 & 255);
    }

    public double A02(Object obj, long j) {
        return Double.longBitsToDouble(this.A00.getLong(obj, j));
    }

    public float A03(Object obj, long j) {
        return Float.intBitsToFloat(this.A00.getInt(obj, j));
    }

    public final int A04(Class cls) {
        return this.A00.arrayBaseOffset(cls);
    }

    public final int A05(Object obj, long j) {
        return this.A00.getInt(obj, j);
    }

    public final long A06(Object obj, long j) {
        return this.A00.getLong(obj, j);
    }

    public final Object A07(Object obj, long j) {
        return this.A00.getObject(obj, j);
    }

    public final void A08(Class cls) {
        this.A00.arrayIndexScale(cls);
    }

    public void A09(Object obj, long j, byte b) {
        boolean z = UnsafeUtil.A08;
        long j2 = -4 & j;
        int A05 = UnsafeUtil.A01.A05(obj, j2);
        int i = (int) j;
        if (z) {
            UnsafeUtil.A04(obj, j2, AnonymousClass6C7.A01(~i, A05, b));
        } else {
            UnsafeUtil.A04(obj, j2, AnonymousClass6C7.A01(i, A05, b));
        }
    }

    public final void A0C(Object obj, long j, int i) {
        this.A00.putInt(obj, j, i);
    }

    public final void A0D(Object obj, long j, long j2) {
        this.A00.putLong(obj, j, j2);
    }

    public final void A0E(Object obj, long j, Object obj2) {
        this.A00.putObject(obj, j, obj2);
    }

    public void A0F(Object obj, long j, boolean z) {
        boolean z2 = UnsafeUtil.A08;
        byte b = z ? (byte) 1 : 0;
        long j2 = -4 & j;
        int A05 = UnsafeUtil.A01.A05(obj, j2);
        int i = (int) j;
        if (z2) {
            UnsafeUtil.A04(obj, j2, AnonymousClass6C7.A01(~i, A05, b));
        } else {
            UnsafeUtil.A04(obj, j2, AnonymousClass6C7.A01(i, A05, b));
        }
    }

    public final void A0G(Field field) {
        this.A00.objectFieldOffset(field);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [int, boolean] */
    public boolean A0H() {
        Class cls = Object.class;
        try {
            Class<?> cls2 = this.A00.getClass();
            ? A1X = AnonymousClass6C7.A1X(cls2);
            Class[] clsArr = new Class[2];
            clsArr[0] = cls;
            Class cls3 = Long.TYPE;
            clsArr[A1X] = cls3;
            cls2.getMethod("getInt", clsArr);
            Class[] A1Y = AnonymousClass6C9.A1Y(cls, cls3, 3, A1X);
            A1Y[2] = Integer.TYPE;
            cls2.getMethod("putInt", A1Y);
            cls2.getMethod("getLong", AnonymousClass6C9.A1Y(cls, cls3, 2, A1X));
            Class[] A1Y2 = AnonymousClass6C9.A1Y(cls, cls3, 3, A1X);
            A1Y2[2] = cls3;
            cls2.getMethod("putLong", A1Y2);
            cls2.getMethod("getObject", AnonymousClass6C9.A1Y(cls, cls3, 2, A1X));
            Class[] A1Y3 = AnonymousClass6C9.A1Y(cls, cls3, 3, A1X);
            A1Y3[2] = cls;
            cls2.getMethod("putObject", A1Y3);
            return A1X;
        } catch (Throwable th) {
            UnsafeUtil.A06(th);
            return false;
        }
    }

    public boolean A0I() {
        try {
            Class<?> cls = this.A00.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (UnsafeUtil.A01() == null) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            UnsafeUtil.A06(th);
            return false;
        }
    }

    public boolean A0J(Object obj, long j) {
        int A04;
        int A042;
        boolean z = this instanceof C130846cd;
        boolean z2 = UnsafeUtil.A08;
        if (z) {
            long j2 = -4 & j;
            Unsafe unsafe = UnsafeUtil.A01.A00;
            if (z2) {
                A042 = AnonymousClass6C7.A04(unsafe.getInt(obj, j2), ~j);
            } else {
                A042 = AnonymousClass6C7.A04(unsafe.getInt(obj, j2), j);
            }
            return AnonymousClass000.A1S((byte) (A042 & 255));
        }
        long j3 = -4 & j;
        Unsafe unsafe2 = UnsafeUtil.A01.A00;
        if (z2) {
            A04 = AnonymousClass6C7.A04(unsafe2.getInt(obj, j3), ~j);
        } else {
            A04 = AnonymousClass6C7.A04(unsafe2.getInt(obj, j3), j);
        }
        return AnonymousClass000.A1S((byte) (A04 & 255));
    }

    public C153777bz(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public void A0A(Object obj, long j, double d) {
        A0D(obj, j, Double.doubleToLongBits(d));
    }

    public void A0B(Object obj, long j, float f) {
        A0C(obj, j, Float.floatToIntBits(f));
    }
}
