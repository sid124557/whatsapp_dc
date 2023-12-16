package X;

import android.database.DataSetObserver;

/* renamed from: X.00o  reason: invalid class name */
public class AnonymousClass00o extends DataSetObserver {
    public final /* synthetic */ C07540bC A00;

    public AnonymousClass00o(C07540bC r1) {
        this.A00 = r1;
    }

    public void onChanged() {
        C07540bC r1 = this.A00;
        if (r1.A0B.isShowing()) {
            r1.Bod();
        }
    }

    public void onInvalidated() {
        this.A00.dismiss();
    }
}
