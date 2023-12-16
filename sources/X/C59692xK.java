package X;

import android.content.Context;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.2xK  reason: invalid class name and case insensitive filesystem */
public class C59692xK {
    public static final String A06 = String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY, %s TEXT NOT NULL, %s INTEGER DEFAULT 0);", new Object[]{"queue", "_id", "item", "encrypted"});
    public final Context A00;
    public final C146907Cb A01;
    public final AnonymousClass73V A02;
    public final ReentrantReadWriteLock A03 = new ReentrantReadWriteLock();
    public final C103135Lr A04;
    public final AnonymousClass6Cp A05;

    public void A00(long j) {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
            reentrantReadWriteLock.readLock().lock();
            this.A05.getWritableDatabase().delete("queue", "_id = ?", C18260x0.A1b(j));
            C18310x6.A1S(reentrantReadWriteLock);
        } catch (Throwable th) {
            C18310x6.A1S(this.A03);
            throw th;
        }
    }

    public C59692xK(Context context, C146907Cb r4, AnonymousClass73V r5, String str, C103135Lr r7) {
        this.A05 = new AnonymousClass6Cp(context, AnonymousClass000.A0V("_jobqueue-", str, AnonymousClass001.A0o()));
        this.A00 = context;
        this.A02 = r5;
        this.A04 = r7;
        this.A01 = r4;
    }
}
