package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Random;

/* renamed from: X.2qE  reason: invalid class name and case insensitive filesystem */
public class C55362qE {
    public final C49112g0 A00;
    public final C59112wN A01;
    public final C183538qC A02;
    public final ThreadLocal A03 = new ThreadLocal();

    public long A00() {
        Cursor A0E;
        AnonymousClass4GK A012 = this.A01.A00.A01();
        try {
            A0E = ((AnonymousClass3H0) A012).A03.A0E("SELECT  f.file_size AS exported_file_size FROM exported_files_metadata AS f WHERE f.exported_path = ?", "XPM_EXPORT_DB_SIZE", C18270x1.A1b("migration/messages_export.zip"));
            if (!A0E.moveToFirst()) {
                A0E.close();
                A012.close();
                return 0;
            }
            long A0C = AnonymousClass0x2.A0C(A0E, "exported_file_size");
            A0E.close();
            A012.close();
            return A0C;
        } catch (Throwable th) {
            try {
                A012.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public long A02(File file, String str, boolean z) {
        C59112wN r3 = this.A01;
        String canonicalPath = file.getCanonicalPath();
        long length = file.length();
        ThreadLocal threadLocal = this.A03;
        byte[] bArr = (byte[]) threadLocal.get();
        if (bArr == null) {
            bArr = new byte[16];
            threadLocal.set(bArr);
        }
        ((Random) this.A02.get()).nextBytes(bArr);
        return r3.A01(canonicalPath, str, C18290x4.A0t(bArr), length, z);
    }

    public void A04() {
        AnonymousClass1R5 r0;
        C49112g0 r1 = this.A01.A00;
        synchronized (r1) {
            r0 = r1.A00;
            if (r0 == null) {
                r0 = (AnonymousClass1R5) r1.A02.get();
                r1.A00 = r0;
            }
        }
        C85284Fq A0C = r0.A0C();
        try {
            ((AnonymousClass3H0) A0C).A03.A07("exported_files_metadata", (String) null, "XPM_EXPORT_METADATA_DELETE_ALL", (String[]) null);
            A0C.close();
            C49112g0 r2 = this.A00;
            synchronized (r2) {
                AnonymousClass1R5 r02 = r2.A00;
                if (r02 != null) {
                    r02.close();
                    r2.A00 = null;
                }
                r2.A01.deleteDatabase("migration_export_metadata.db");
                Log.i("ExportMetadata/removeDatabase/deleted");
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C55362qE(C49112g0 r2, C59112wN r3, C183538qC r4) {
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }

    public long A01() {
        Cursor A012;
        AnonymousClass4GK A002 = C49112g0.A00(this);
        try {
            A012 = C56862sg.A01(((AnonymousClass3H0) A002).A03, "SELECT  SUM(files.file_size) AS total_size FROM exported_files_metadata AS files", "XPM_EXPORT_TOTAL_SIZE");
            if (!A012.moveToFirst()) {
                A012.close();
                A002.close();
                return 0;
            }
            long A0C = AnonymousClass0x2.A0C(A012, "total_size");
            A012.close();
            A002.close();
            return A0C;
        } catch (Throwable th) {
            try {
                A002.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C71933cu A03() {
        AnonymousClass4GK A002 = C49112g0.A00(this);
        try {
            C71933cu r0 = new C71933cu(C56862sg.A01(((AnonymousClass3H0) A002).A03, "SELECT   f._id, f.local_path, f.exported_path, f.file_size, f.required, f.encryption_iv FROM exported_files_metadata AS f ORDER BY   f.required DESC , f._id ASC ", "XPM_EXPORT_FILE_METADATA_SELECT_INTERNAL_ALL"), new AnonymousClass3L4());
            A002.close();
            return r0;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
