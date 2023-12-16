package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.1R4  reason: invalid class name */
public final class AnonymousClass1R4 extends C18630y0 {
    public final C60972zT A00;
    public final C45932ao A01;

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C162457s7.A0J(sQLiteDatabase, 0);
        sQLiteDatabase.execSQL("CREATE TABLE notifications (account_lid TEXT NOT NULL, notification_type TEXT NOT NULL, sender_jid TEXT NOT NULL, group_jid TEXT DEFAULT '' NOT NULL, call_id TEXT DEFAULT '' NOT NULL, call_status INTEGER DEFAULT 0 NOT NULL, timestamp INTEGER NOT NULL, display_name TEXT DEFAULT '' NOT NULL, PRIMARY KEY(account_lid, sender_jid, notification_type, call_id, call_status, group_jid))");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1R4(C55682qk r4, C54292oU r5, C60972zT r6, C45932ao r7) {
        super(r5.A00, r4, "account_switcher.db", 3);
        C18260x0.A0Q(r5, r4);
        C18270x1.A11(r7, 3, r6);
        this.A01 = r7;
        this.A00 = r6;
    }

    public C56862sg A0F() {
        String databaseName = getDatabaseName();
        return C626135u.A00(super.A0A(), this.A00, this.A01, databaseName);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AccountSwitcherDbHelper/upgrading db from ");
        A0o.append(i);
        C18260x0.A0y(" to ", A0o, i2);
        if (i2 == 3) {
            if (i < 2) {
                Log.i("AccountSwitcherDbHelper/processing db upgrade from 1 to 2");
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS notifications");
                    sQLiteDatabase.execSQL("CREATE TABLE notifications (account_lid TEXT NOT NULL, notification_type TEXT NOT NULL, sender_jid TEXT NOT NULL, group_jid TEXT DEFAULT '' NOT NULL, call_id TEXT DEFAULT '' NOT NULL, call_status INTEGER DEFAULT 0 NOT NULL, timestamp INTEGER NOT NULL, display_name TEXT DEFAULT '' NOT NULL, PRIMARY KEY(account_lid, sender_jid, notification_type, call_id, call_status, group_jid))");
                }
            } else if (i >= 3) {
                return;
            }
            Log.i("AccountSwitcherDbHelper/processing db upgrade from 2 to 3");
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL("ALTER TABLE notifications ADD COLUMN display_name TEXT DEFAULT '' NOT NULL");
                return;
            }
            return;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("Unknown upgrade destination version: ");
        A0o2.append(i);
        throw new SQLiteException(AnonymousClass000.A0Y(" -> ", A0o2, i2));
    }
}
