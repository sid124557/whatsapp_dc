package X;

/* renamed from: X.3dW  reason: invalid class name and case insensitive filesystem */
public final class C72313dW implements AnonymousClass4C1 {
    public static final Object A02 = AnonymousClass002.A0D();
    public volatile Object A00 = A02;
    public volatile AnonymousClass4C1 A01;

    public static AnonymousClass4C1 A00(AnonymousClass4C1 r1) {
        if ((r1 instanceof C72313dW) || (r1 instanceof C72343dZ)) {
            return r1;
        }
        r1.getClass();
        return new C72313dW(r1);
    }

    public Object get() {
        Object obj = this.A00;
        if (obj != A02) {
            return obj;
        }
        AnonymousClass4C1 r0 = this.A01;
        if (r0 == null) {
            return this.A00;
        }
        Object obj2 = r0.get();
        this.A00 = obj2;
        this.A01 = null;
        return obj2;
    }

    public C72313dW(AnonymousClass4C1 r2) {
        this.A01 = r2;
    }
}
