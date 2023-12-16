package X;

/* renamed from: X.9GI  reason: invalid class name */
public abstract class AnonymousClass9GI extends AnonymousClass5ZM {
    public final Runnable A00;

    public AnonymousClass9GI(Runnable runnable) {
        this.A00 = runnable;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Runnable runnable;
        if (AnonymousClass001.A1Z(obj) && (runnable = this.A00) != null) {
            runnable.run();
        }
    }
}
