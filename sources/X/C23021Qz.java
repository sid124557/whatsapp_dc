package X;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1Qz  reason: invalid class name and case insensitive filesystem */
public class C23021Qz extends C56772sX {
    public final C56972sr A00;
    public final C56352rq A01;
    public final C56512s6 A02;
    public final C54292oU A03;
    public final C48502f0 A04;
    public final C619632y A05;
    public final C54512oq A06;
    public final C48772fR A07;
    public final C622634i A08;
    public final C183538qC A09;

    public C60882zK A0G(AnonymousClass22O r24) {
        File A002;
        C17410vU A052;
        C56512s6 r15 = this.A02;
        if (r15.A06()) {
            Log.i("sticker-db-storage/backup/skip no media or read-only media");
            return null;
        }
        AnonymousClass22O r9 = r24;
        if (r9 == AnonymousClass22O.CRYPT13) {
            A002 = AnonymousClass002.A0A(this.A02.A02(), "stickers.db.crypt1");
        } else {
            A002 = A00(this, r9, "stickers.db.crypt", AnonymousClass001.A0o());
        }
        if (A002.exists() && A002.isDirectory()) {
            A002.delete();
        }
        File parentFile = A002.getParentFile();
        C626936e.A06(parentFile);
        C18280x3.A10(parentFile);
        Iterator it = A09(A07(r9)).iterator();
        while (it.hasNext()) {
            File A0f = AnonymousClass0x9.A0f(it);
            if (!A0f.equals(A002)) {
                C18270x1.A0x(A0f);
            }
        }
        C18260x0.A1R(AnonymousClass001.A0o(), "sticker-db-storage/backup/to ", A002);
        C183538qC r1 = this.A09;
        ReentrantReadWriteLock.WriteLock writeLock = ((C18630y0) r1.get()).A05.writeLock();
        ((C18630y0) r1.get()).A0E();
        ((SQLiteOpenHelper) r1.get()).close();
        writeLock.lock();
        try {
            C622634i r4 = this.A08;
            C56972sr r12 = this.A00;
            C48502f0 r2 = this.A04;
            AnonymousClass0UR A003 = AnonymousClass0S7.A00(r12, (C06430Xr) null, this.A01, r15, r2, this.A04, this.A07, r9, r4, A002, (Boolean) null);
            Context context = this.A03.A00;
            A052 = A003.A05(context);
            if (A052 == null) {
                writeLock.unlock();
                return null;
            }
            A052.Bsc(context.getDatabasePath("stickers.db"));
            long j = 0;
            File[] listFiles = C64393Dh.A01(C54292oU.A01(this.A01.A00), "Stickers").listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    A052.Bsc(file);
                    j += file.length();
                }
            }
            A052.close();
            C60882zK r14 = new C60882zK(A002, Long.valueOf(j), "stickers-db", A04(A07(r9)), true);
            writeLock.unlock();
            return r14;
        } catch (Exception e) {
            try {
                Log.e("sticker-db-storage/backup failed", e);
                return null;
            } finally {
                writeLock.unlock();
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public C23021Qz(C56972sr r1, C56352rq r2, C56512s6 r3, C54292oU r4, C48502f0 r5, C42822Pq r6, C619632y r7, C54512oq r8, C48772fR r9, C622634i r10, C183538qC r11) {
        super(r6);
        this.A03 = r4;
        this.A08 = r10;
        this.A00 = r1;
        this.A04 = r5;
        this.A09 = r11;
        this.A02 = r3;
        this.A06 = r8;
        this.A07 = r9;
        this.A05 = r7;
        this.A01 = r2;
    }

    public static File A00(C56772sX r3, AnonymousClass22O r4, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r4.version);
        return new File(r3.A07(r4), sb.toString());
    }
}
