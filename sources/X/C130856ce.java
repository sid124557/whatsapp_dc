package X;

import com.google.protobuf.UnsafeUtil;
import sun.misc.Unsafe;

/* renamed from: X.6ce  reason: invalid class name and case insensitive filesystem */
public final class C130856ce extends C153777bz {
    public byte A01(Object obj, long j) {
        return this.A00.getByte(obj, j);
    }

    public double A02(Object obj, long j) {
        return this.A00.getDouble(obj, j);
    }

    public float A03(Object obj, long j) {
        return this.A00.getFloat(obj, j);
    }

    public void A09(Object obj, long j, byte b) {
        this.A00.putByte(obj, j, b);
    }

    public void A0A(Object obj, long j, double d) {
        this.A00.putDouble(obj, j, d);
    }

    public void A0B(Object obj, long j, float f) {
        this.A00.putFloat(obj, j, f);
    }

    public void A0F(Object obj, long j, boolean z) {
        this.A00.putBoolean(obj, j, z);
    }

    public boolean A0H() {
        Class<Object> cls = Object.class;
        if (!super.A0H()) {
            return false;
        }
        try {
            Class<?> cls2 = this.A00.getClass();
            Class cls3 = Long.TYPE;
            cls2.getMethod("getByte", new Class[]{cls, cls3});
            Class[] A1Y = AnonymousClass6C9.A1Y(cls, cls3, 3, 1);
            A1Y[2] = Byte.TYPE;
            cls2.getMethod("putByte", A1Y);
            cls2.getMethod("getBoolean", AnonymousClass6C9.A1Y(cls, cls3, 2, 1));
            Class[] A1Y2 = AnonymousClass6C9.A1Y(cls, cls3, 3, 1);
            A1Y2[2] = Boolean.TYPE;
            cls2.getMethod("putBoolean", A1Y2);
            cls2.getMethod("getFloat", AnonymousClass6C9.A1Y(cls, cls3, 2, 1));
            Class[] A1Y3 = AnonymousClass6C9.A1Y(cls, cls3, 3, 1);
            A1Y3[2] = Float.TYPE;
            cls2.getMethod("putFloat", A1Y3);
            cls2.getMethod("getDouble", AnonymousClass6C9.A1Y(cls, cls3, 2, 1));
            Class[] A1Y4 = AnonymousClass6C9.A1Y(cls, cls3, 3, 1);
            A1Y4[2] = Double.TYPE;
            cls2.getMethod("putDouble", A1Y4);
            return true;
        } catch (Throwable th) {
            UnsafeUtil.A06(th);
            return false;
        }
    }

    public boolean A0I() {
        Class<Object> cls = Object.class;
        if (!super.A0I()) {
            return false;
        }
        try {
            Class<?> cls2 = this.A00.getClass();
            Class cls3 = Long.TYPE;
            cls2.getMethod("getByte", new Class[]{cls3});
            cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
            AnonymousClass6C8.A15(cls2, cls3);
            cls2.getMethod("getLong", new Class[]{cls3});
            cls2.getMethod("putLong", new Class[]{cls3, cls3});
            Class[] clsArr = new Class[3];
            AnonymousClass6C7.A1E(cls3, clsArr, 0, 1, 2);
            cls2.getMethod("copyMemory", clsArr);
            Class[] A1Y = AnonymousClass6C9.A1Y(cls, cls3, 5, 1);
            A1Y[2] = cls;
            A1Y[3] = cls3;
            A1Y[4] = cls3;
            cls2.getMethod("copyMemory", A1Y);
            return true;
        } catch (Throwable th) {
            UnsafeUtil.A06(th);
            return false;
        }
    }

    public boolean A0J(Object obj, long j) {
        return this.A00.getBoolean(obj, j);
    }

    public C130856ce(Unsafe unsafe) {
        super(unsafe);
    }
}
