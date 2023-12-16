package X;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;

/* renamed from: X.2YR  reason: invalid class name */
public class AnonymousClass2YR {
    public final C56612sH A00;
    public final AnonymousClass1RC A01;

    public synchronized boolean A00(String str) {
        C69833Yo Axl;
        C626936e.A00();
        try {
            C85284Fq A0C = this.A01.A0C();
            try {
                Axl = A0C.Axl();
                ((AnonymousClass3H0) A0C).A03.A07("express_path_download_data", "enc_file_hash = ?", "ExpressPathDownloadDataStore/delete", new String[]{str});
                Axl.A00();
                Axl.close();
                A0C.close();
            } catch (Throwable th) {
                A0C.close();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("expresspathdownloaddb/delete", e);
            return false;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        return true;
        throw th;
    }

    public AnonymousClass2YR(C56612sH r1, AnonymousClass1RC r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
