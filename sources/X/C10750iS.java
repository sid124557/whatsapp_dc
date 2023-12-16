package X;

import android.view.View;

/* renamed from: X.0iS  reason: invalid class name and case insensitive filesystem */
public class C10750iS implements Runnable {
    public final /* synthetic */ C07540bC A00;

    public C10750iS(C07540bC r1) {
        this.A00 = r1;
    }

    public void run() {
        C07540bC r1 = this.A00;
        View view = r1.A07;
        if (view != null && view.getWindowToken() != null) {
            r1.Bod();
        }
    }
}
