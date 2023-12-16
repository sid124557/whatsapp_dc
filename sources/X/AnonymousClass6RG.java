package X;

/* renamed from: X.6RG  reason: invalid class name */
public final class AnonymousClass6RG extends AnonymousClass6RH {
    public final C178388hS A00;
    public final C150887Sp A01;
    public final C152017Xf A02;

    public AnonymousClass6RG(C178388hS r2, C150887Sp r3, C152017Xf r4, int i) {
        super(i);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        if (i == 2 && r3.A01) {
            throw AnonymousClass001.A0c("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }
}
