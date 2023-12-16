package X;

import android.view.View;

/* renamed from: X.0kA  reason: invalid class name and case insensitive filesystem */
public class C11760kA implements Runnable {
    public AnonymousClass04O A00;
    public final /* synthetic */ C07530bB A01;

    public C11760kA(AnonymousClass04O r1, C07530bB r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void run() {
        C16460tR r0;
        C07530bB r2 = this.A01;
        C07890cz r1 = r2.A0A;
        if (!(r1 == null || (r0 = r1.A03) == null)) {
            r0.BWR(r1);
        }
        View view = (View) r2.A0C;
        if (!(view == null || view.getWindowToken() == null)) {
            AnonymousClass04O r12 = this.A00;
            if (r12.A03()) {
                r2.A0H = r12;
            }
        }
        r2.A0F = null;
    }
}
