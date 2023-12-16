package X;

/* renamed from: X.9WE  reason: invalid class name */
public final class AnonymousClass9WE {
    public final int A00;
    public final Object A01;
    public final Throwable A02;

    public static AnonymousClass9WE A00(Object obj) {
        return new AnonymousClass9WE(obj, (Throwable) null, 2);
    }

    public static AnonymousClass9WE A01(Object obj) {
        return new AnonymousClass9WE(obj, (Throwable) null, 0);
    }

    public static AnonymousClass9WE A02(Object obj, Throwable th) {
        return new AnonymousClass9WE(obj, th, 1);
    }

    public AnonymousClass9WE(Object obj, Throwable th, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = th;
    }
}
