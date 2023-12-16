package X;

/* renamed from: X.0lr  reason: invalid class name and case insensitive filesystem */
public class C12630lr implements Runnable {
    public final /* synthetic */ C009307g A00;
    public final /* synthetic */ C010107z A01;
    public final /* synthetic */ AnonymousClass0QW A02;

    public C12630lr(C009307g r1, C010107z r2, AnonymousClass0QW r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void run() {
        this.A00.A00();
        if (C08270df.A04()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Transition for operation ");
            A0o.append(this.A02);
            AnonymousClass000.A1I(A0o, "has completed");
        }
    }
}
