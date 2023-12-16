package X;

import android.animation.Animator;

/* renamed from: X.0d4  reason: invalid class name and case insensitive filesystem */
public class C07940d4 implements C15760rt {
    public final /* synthetic */ Animator A00;
    public final /* synthetic */ C010107z A01;
    public final /* synthetic */ AnonymousClass0QW A02;

    public C07940d4(Animator animator, C010107z r2, AnonymousClass0QW r3) {
        this.A01 = r2;
        this.A00 = animator;
        this.A02 = r3;
    }

    public void BOO() {
        this.A00.end();
        if (C08270df.A04()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Animator from operation ");
            A0o.append(this.A02);
            AnonymousClass000.A1I(A0o, " has been canceled.");
        }
    }
}
