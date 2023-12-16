package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import com.whatsapp.util.Log;
import java.io.Closeable;
import java.util.AbstractMap;

/* renamed from: X.3Yo  reason: invalid class name and case insensitive filesystem */
public class C69833Yo implements Closeable {
    public boolean A00 = false;
    public boolean A01;
    public final C56862sg A02;

    public void A00() {
        this.A01 = true;
        this.A02.A00.setTransactionSuccessful();
    }

    public boolean A01() {
        if (!this.A02.A00.inTransaction() || this.A00 || this.A01) {
            return false;
        }
        return true;
    }

    public void close() {
        if (!this.A00) {
            if (!this.A01) {
                Log.w("DatabaseTransaction/close/was not set successful");
            }
            this.A02.A00.endTransaction();
            this.A00 = true;
        }
    }

    public C69833Yo(SQLiteTransactionListener sQLiteTransactionListener, AnonymousClass37P r6, C56862sg r7) {
        this.A02 = r7;
        ThreadLocal threadLocal = r6.A01;
        Object obj = threadLocal.get();
        C626936e.A06(obj);
        if (!AnonymousClass001.A1Z(obj)) {
            SQLiteDatabase sQLiteDatabase = r7.A00;
            C626936e.A0D(!sQLiteDatabase.inTransaction(), "OuterTransactionManager/already-in-transaction");
            sQLiteDatabase.beginTransactionWithListener(r6);
            threadLocal.set(Boolean.TRUE);
        } else {
            r7.A00.beginTransaction();
        }
        if (sQLiteTransactionListener != null) {
            Object A0D = AnonymousClass002.A0D();
            Object obj2 = r6.A02.get();
            C626936e.A06(obj2);
            ((AbstractMap) obj2).put(A0D, sQLiteTransactionListener);
            sQLiteTransactionListener.onBegin();
        }
    }
}
