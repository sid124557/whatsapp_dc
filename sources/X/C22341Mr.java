package X;

/* renamed from: X.1Mr  reason: invalid class name and case insensitive filesystem */
public final class C22341Mr extends C33131sU {
    public final AnonymousClass4FS A00;
    public final Runnable A01 = new C117125rQ(this, 37);
    public volatile Runnable A02;

    public final void A0A() {
        if (this.A02.A01() > 0 && this.A02 == null) {
            this.A02 = this.A00.Bkn(this.A01, "TrackedBitmapCache/clean", 60000);
        }
    }

    public C22341Mr(C380625j r3, AnonymousClass2MO r4, AnonymousClass4FS r5, String str, int i) {
        super(r3, r4, str, i);
        this.A00 = r5;
        A04();
    }
}
