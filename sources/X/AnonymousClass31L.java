package X;

import android.database.sqlite.SQLiteTransactionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.31L  reason: invalid class name */
public class AnonymousClass31L implements SQLiteTransactionListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass31L(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void onBegin() {
        if (1 - this.A02 == 0) {
            ((AtomicBoolean) this.A01).set(false);
        }
    }

    public void onCommit() {
        switch (this.A02) {
            case 0:
                AnonymousClass0x9.A1K(this.A01);
                return;
            case 1:
                ((AtomicBoolean) this.A01).set(true);
                return;
            default:
                return;
        }
    }

    public void onRollback() {
        if (this.A02 != 0) {
            ((AtomicBoolean) this.A01).set(false);
        }
    }
}
