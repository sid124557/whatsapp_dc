package X;

import sun.misc.Unsafe;

/* renamed from: X.6YF  reason: invalid class name */
public final class AnonymousClass6YF extends C153677bl {
    public final byte A01(Object obj, long j) {
        return this.A00.getByte(obj, j);
    }

    public final double A02(Object obj, long j) {
        return this.A00.getDouble(obj, j);
    }

    public final float A03(Object obj, long j) {
        return this.A00.getFloat(obj, j);
    }

    public final void A06(Object obj, long j, byte b) {
        this.A00.putByte(obj, j, b);
    }

    public final void A07(Object obj, long j, double d) {
        this.A00.putDouble(obj, j, d);
    }

    public final void A08(Object obj, long j, float f) {
        this.A00.putFloat(obj, j, f);
    }

    public final void A0B(Object obj, long j, boolean z) {
        this.A00.putBoolean(obj, j, z);
    }

    public final boolean A0C(Object obj, long j) {
        return this.A00.getBoolean(obj, j);
    }

    public AnonymousClass6YF(Unsafe unsafe) {
        super(unsafe);
    }
}
