package X;

import android.database.sqlite.SQLiteTransactionListener;
import java.util.AbstractMap;
import java.util.Iterator;

/* renamed from: X.37P  reason: invalid class name */
public class AnonymousClass37P implements SQLiteTransactionListener {
    public final String A00;
    public final ThreadLocal A01 = new C73243fA(this);
    public final ThreadLocal A02 = new C73233f9(this);

    public void onCommit() {
        Object obj = this.A02.get();
        C626936e.A06(obj);
        AbstractMap abstractMap = (AbstractMap) obj;
        try {
            Iterator A10 = C18290x4.A10(abstractMap);
            while (A10.hasNext()) {
                ((SQLiteTransactionListener) A10.next()).onCommit();
            }
        } finally {
            abstractMap.clear();
            this.A01.set(Boolean.FALSE);
        }
    }

    public void onRollback() {
        Object obj = this.A02.get();
        C626936e.A06(obj);
        AbstractMap abstractMap = (AbstractMap) obj;
        try {
            Iterator A10 = C18290x4.A10(abstractMap);
            while (A10.hasNext()) {
                ((SQLiteTransactionListener) A10.next()).onRollback();
            }
        } finally {
            abstractMap.clear();
            this.A01.set(Boolean.FALSE);
        }
    }

    public AnonymousClass37P(String str) {
        this.A00 = str;
    }

    public void onBegin() {
    }
}
