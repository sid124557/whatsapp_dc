package X;

import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0R5  reason: invalid class name */
public abstract class AnonymousClass0R5 {
    public C17400vT A00;
    public List A01;
    public Map A02 = new LinkedHashMap();
    public Executor A03;
    public Executor A04;
    public boolean A05;
    public final C05490Tn A06 = new C05490Tn(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    public final ThreadLocal A07 = new ThreadLocal();
    public final Map A08;
    public final Map A09;
    public final ReentrantReadWriteLock A0A = new ReentrantReadWriteLock();
    public volatile C17430vW A0B;

    public C17320vK A01(String str) {
        C162457s7.A0J(str, 0);
        A08();
        A09();
        return ((C08660eq) A00()).A00().A05().AzF(str);
    }

    public C17400vT A00() {
        C17400vT r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C162457s7.A0M("internalOpenHelper");
        throw AnonymousClass000.A0L();
    }

    public Executor A06() {
        Executor executor = this.A03;
        if (executor != null) {
            return executor;
        }
        C162457s7.A0M("internalQueryExecutor");
        throw AnonymousClass000.A0L();
    }

    public final Lock A07() {
        ReentrantReadWriteLock.ReadLock readLock = this.A0A.readLock();
        C162457s7.A0D(readLock);
        return readLock;
    }

    public void A08() {
        if (!this.A05 && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw AnonymousClass001.A0e("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public boolean A0D() {
        Boolean bool;
        C17430vW r0 = this.A0B;
        if (r0 != null) {
            bool = Boolean.valueOf(((C08630en) r0).A00.isOpen());
        } else {
            bool = null;
        }
        return C162457s7.A0P(bool, Boolean.TRUE);
    }

    public AnonymousClass0R5() {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        C162457s7.A0D(synchronizedMap);
        this.A08 = synchronizedMap;
        this.A09 = new LinkedHashMap();
    }

    public Object A02(Callable callable) {
        A0A();
        try {
            Object call = callable.call();
            A0B();
            return call;
        } finally {
            A0C();
        }
    }

    public List A03(Map map) {
        return AnonymousClass8UF.A0n();
    }

    public Map A04() {
        return C73813g7.A0A();
    }

    public Set A05() {
        return C73833g9.A04();
    }

    public void A09() {
        if (!((C08630en) C001000s.A00(this)).A00.inTransaction() && this.A07.get() != null) {
            throw AnonymousClass001.A0e("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void A0A() {
        A08();
        A08();
        C17430vW A002 = C001000s.A00(this);
        this.A06.A00(A002);
        SQLiteDatabase sQLiteDatabase = ((C08630en) A002).A00;
        if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
            sQLiteDatabase.beginTransactionNonExclusive();
        } else {
            sQLiteDatabase.beginTransaction();
        }
    }

    public void A0B() {
        ((C08630en) ((C08660eq) A00()).A00().A05()).A00.setTransactionSuccessful();
    }

    public final void A0C() {
        ((C08630en) C001000s.A00(this)).A00.endTransaction();
        if (!((C08630en) C001000s.A00(this)).A00.inTransaction()) {
            C05490Tn r3 = this.A06;
            if (r3.A0A.compareAndSet(false, true)) {
                r3.A03.A06().execute(r3.A06);
            }
        }
    }
}
