package X;

import android.database.sqlite.SQLiteBlobTooBigException;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1Ru  reason: invalid class name and case insensitive filesystem */
public class C23231Ru extends AnonymousClass31D {
    public final C66533Lu A00;
    public final Map A01 = AnonymousClass001.A0t();

    public boolean A0U(Throwable th, int i) {
        if (i != 1 || !(th instanceof SQLiteBlobTooBigException)) {
            return super.A0U(th, i);
        }
        Log.e("FtsDatabaseMigration/skipping BlobTooBigException single row");
        return true;
    }

    public C23231Ru(C66533Lu r3, AnonymousClass2U4 r4) {
        super(r4, "message_fts", Integer.MIN_VALUE);
        this.A00 = r3;
    }

    public void A0I() {
        super.A0I();
        this.A06.A04("fts_ready", 5);
    }
}
