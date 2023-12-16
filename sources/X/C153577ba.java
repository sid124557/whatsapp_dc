package X;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: X.7ba  reason: invalid class name and case insensitive filesystem */
public abstract class C153577ba {
    public final Unsafe A00;

    public final int A00(Object obj, long j) {
        return this.A00.getInt(obj, j);
    }

    public final long A01(Object obj, long j) {
        return this.A00.getLong(obj, j);
    }

    public final Object A02(Object obj, long j) {
        return this.A00.getObject(obj, j);
    }

    public final void A03(Class cls) {
        this.A00.arrayBaseOffset(cls);
    }

    public final void A04(Class cls) {
        this.A00.arrayIndexScale(cls);
    }

    public final void A05(Object obj, long j, int i) {
        this.A00.putInt(obj, j, i);
    }

    public final void A06(Object obj, long j, long j2) {
        this.A00.putLong(obj, j, j2);
    }

    public final void A07(Object obj, long j, Object obj2) {
        this.A00.putObject(obj, j, obj2);
    }

    public final void A08(Field field) {
        this.A00.objectFieldOffset(field);
    }

    public C153577ba(Unsafe unsafe) {
        this.A00 = unsafe;
    }
}
