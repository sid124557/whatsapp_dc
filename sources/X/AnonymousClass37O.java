package X;

import android.database.sqlite.SQLiteTransactionListener;

/* renamed from: X.37O  reason: invalid class name */
public class AnonymousClass37O implements SQLiteTransactionListener {
    public final /* synthetic */ C53222mk A00;

    public AnonymousClass37O(C53222mk r1) {
        this.A00 = r1;
    }

    public void onRollback() {
        C53222mk r1 = this.A00;
        synchronized (r1) {
            r1.A00 = null;
        }
    }

    public void onBegin() {
    }

    public void onCommit() {
    }
}
