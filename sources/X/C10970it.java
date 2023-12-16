package X;

import android.view.ViewGroup;

/* renamed from: X.0it  reason: invalid class name and case insensitive filesystem */
public class C10970it implements Runnable {
    public final /* synthetic */ C08310eF A00;

    public C10970it(C08310eF r1) {
        this.A00 = r1;
    }

    public void run() {
        ViewGroup viewGroup;
        C08310eF r2 = this.A00;
        C04050Mp r1 = r2.A0D;
        if (r1 != null) {
            r1.A0E = false;
        }
        if (r2.A0B != null && (viewGroup = r2.A0C) != null && r2.A0I != null) {
            AnonymousClass0UN A01 = AnonymousClass0UN.A01(viewGroup);
            A01.A04();
            A01.A02();
        }
    }
}
