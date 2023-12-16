package X;

/* renamed from: X.501  reason: invalid class name */
public abstract class AnonymousClass501 extends C18400xH implements AnonymousClass4GJ {
    public final Object A00 = AnonymousClass002.A0D();
    public volatile AnonymousClass3YV A01;

    public abstract void A00();

    public final Object generatedComponent() {
        if (this.A01 == null) {
            synchronized (this.A00) {
                if (this.A01 == null) {
                    this.A01 = new AnonymousClass3YV(this);
                }
            }
        }
        return this.A01.generatedComponent();
    }

    public void onCreate() {
        A00();
        super.onCreate();
    }
}
