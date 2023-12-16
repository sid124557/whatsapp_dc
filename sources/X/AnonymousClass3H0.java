package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteTransactionListener;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.3H0  reason: invalid class name */
public class AnonymousClass3H0 implements C85284Fq {
    public boolean A00 = false;
    public final C10550i7 A01;
    public final AnonymousClass37P A02;
    public final C56862sg A03;
    public final ReentrantReadWriteLock.ReadLock A04;

    public static C56862sg A04(Object obj, Object obj2, Object[] objArr, int i) {
        objArr[i] = obj;
        return ((AnonymousClass3H0) obj2).A03;
    }

    @Deprecated
    public C69833Yo Axm() {
        return new C69833Yo((SQLiteTransactionListener) null, this.A02, this.A03);
    }

    public void B25(Runnable runnable) {
        C626936e.A0C(this.A03.A00.inTransaction());
        AnonymousClass37P r3 = this.A02;
        Object A0D = AnonymousClass002.A0D();
        AnonymousClass31L r1 = new AnonymousClass31L(r3, 0, runnable);
        Object obj = r3.A02.get();
        C626936e.A06(obj);
        ((AbstractMap) obj).put(A0D, r1);
    }

    public void close() {
        if (!this.A00) {
            ReentrantReadWriteLock.ReadLock readLock = this.A04;
            if (readLock != null) {
                A05(false);
                readLock.unlock();
            }
            this.A00 = true;
        }
    }

    public AnonymousClass3H0(C10550i7 r3, AnonymousClass4E9 r4, ReentrantReadWriteLock.ReadLock readLock, boolean z) {
        this.A04 = readLock;
        this.A01 = r3;
        this.A02 = r4.BAE();
        if (readLock != null) {
            readLock.lock();
            A05(true);
        }
        if (z) {
            try {
                this.A03 = r4.BEc();
            } catch (Throwable th) {
                Log.e("DatabaseSession/failed to get database", th);
                close();
                throw th;
            }
        } else {
            this.A03 = r4.BBw();
        }
    }

    public static C56862sg A00(ContentValues contentValues, Long l, Object obj, String str) {
        contentValues.put(str, l);
        return ((AnonymousClass3H0) obj).A03;
    }

    public static C56862sg A01(ContentValues contentValues, Object obj, String str, int i) {
        contentValues.put(str, Integer.valueOf(i));
        return ((AnonymousClass3H0) obj).A03;
    }

    public static C56862sg A02(ContentValues contentValues, Object obj, String str, long j) {
        contentValues.put(str, Long.valueOf(j));
        return ((AnonymousClass3H0) obj).A03;
    }

    public static C56862sg A03(ContentValues contentValues, Object obj, String str, String str2) {
        contentValues.put(str, str2);
        return ((AnonymousClass3H0) obj).A03;
    }

    public final void A05(boolean z) {
        long id = Thread.currentThread().getId();
        C10550i7 r4 = this.A01;
        if (r4 != null) {
            synchronized (r4) {
                int A05 = AnonymousClass0x7.A05(r4.A05(id, C18290x4.A0Z()));
                int i = -1;
                if (z) {
                    i = 1;
                }
                int i2 = A05 + i;
                if (i2 > 0) {
                    r4.A0A(id, Integer.valueOf(i2));
                } else {
                    r4.A08(id);
                }
            }
        }
    }

    public C69833Yo Axl() {
        C626936e.A00();
        return new C69833Yo((SQLiteTransactionListener) null, this.A02, this.A03);
    }
}
