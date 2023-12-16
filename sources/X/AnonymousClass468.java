package X;

/* renamed from: X.468  reason: invalid class name */
public final class AnonymousClass468 extends AnonymousClass46G {
    public final C72753eE A00;

    public AnonymousClass468(C84814Du r2, C72753eE r3) {
        super(r2, 1);
        this.A00 = r3;
    }

    public Throwable A08(C85474Gj r3) {
        Throwable A02;
        Object A0A = this.A00.A0A();
        if ((A0A instanceof C72743eD) && (A02 = ((C72743eD) A0A).A02()) != null) {
            return A02;
        }
        if (A0A instanceof AnonymousClass333) {
            return ((AnonymousClass333) A0A).A00;
        }
        return r3.B5G();
    }

    public String A07() {
        return "AwaitContinuation";
    }
}
