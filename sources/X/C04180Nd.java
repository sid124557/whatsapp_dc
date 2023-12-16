package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.0Nd  reason: invalid class name and case insensitive filesystem */
public final class C04180Nd {
    public List A00;
    public final Activity A01;
    public final C15790rw A02;
    public final Executor A03;

    public C04180Nd(Activity activity, C15790rw r2, Executor executor) {
        this.A01 = activity;
        this.A03 = executor;
        this.A02 = r2;
    }

    public final void A00(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : list) {
            AnonymousClass0PV r2 = (AnonymousClass0PV) next;
            Activity activity = this.A01;
            if (r2.A01.A00(activity) || r2.A02.A00(activity)) {
                A0s.add(next);
            }
        }
        if (!A0s.equals(this.A00)) {
            this.A00 = A0s;
            this.A03.execute(new C11980km(this, A0s));
        }
    }
}
