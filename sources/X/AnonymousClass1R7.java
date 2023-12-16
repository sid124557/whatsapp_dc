package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.1R7  reason: invalid class name */
public class AnonymousClass1R7 extends C18630y0 {
    public final C60972zT A00;
    public final C45932ao A01;

    public AnonymousClass1R7(Context context, C55682qk r4, C60972zT r5, C45932ao r6) {
        super(context, r4, "companion_devices.db", 12);
        this.A01 = r6;
        this.A00 = r5;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C626235v.A01(sQLiteDatabase, "devices");
        sQLiteDatabase.execSQL("CREATE TABLE devices (_id INTEGER PRIMARY KEY AUTOINCREMENT,device_id TEXT,device_os TEXT,platform_type INTEGER,last_active INTEGER,login_time INTEGER,logout_time INTEGER NOT NULL DEFAULT 0,adv_key_index INTEGER NOT NULL DEFAULT 0,full_sync_required INTEGER NOT NULL DEFAULT 0,place_name TEXT,nickname TEXT,support_bot_user_agent_chat_history INTEGER NOT NULL DEFAULT 0,support_cag_reactions_and_polls_history INTEGER NOT NULL DEFAULT 0);");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS companion_device_jid_index ON devices(device_id);");
        C626235v.A01(sQLiteDatabase, "devices_history");
    }

    public C56862sg A0F() {
        String databaseName = getDatabaseName();
        return C626135u.A00(super.A0A(), this.A00, this.A01, databaseName);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CompanionDeviceDbHelper/downgrade from ");
        A0o.append(i);
        C18260x0.A0y(" to ", A0o, i2);
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        r4.execSQL("DROP TABLE IF EXISTS devices_history");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r4.execSQL("ALTER TABLE devices ADD nickname TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        X.AnonymousClass350.A02(r4, "devices", "support_bot_user_agent_chat_history", "INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        X.AnonymousClass350.A02(r4, "devices", "support_cag_reactions_and_polls_history", "INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        r4.execSQL("ALTER TABLE devices ADD login_time INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        r4.execSQL("ALTER TABLE devices ADD adv_key_index INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        r4.execSQL("ALTER TABLE devices ADD full_sync_required INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        r4.execSQL("ALTER TABLE devices ADD place_name TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r4.execSQL("ALTER TABLE devices ADD logout_time INTEGER NOT NULL DEFAULT 0");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r4, int r5, int r6) {
        /*
            r3 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CompanionDeviceDbHelper/upgrade from "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " to "
            X.C18260x0.A0y(r0, r1, r6)
            switch(r5) {
                case 1: goto L_0x001d;
                case 2: goto L_0x0022;
                case 3: goto L_0x0027;
                case 4: goto L_0x002c;
                case 5: goto L_0x0031;
                case 6: goto L_0x0036;
                case 7: goto L_0x003b;
                case 8: goto L_0x003b;
                case 9: goto L_0x0040;
                case 10: goto L_0x0045;
                case 11: goto L_0x004f;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.String r0 = "CompanionDeviceDbHelper/upgrade unknown old version"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r3.onCreate(r4)
            return
        L_0x001d:
            java.lang.String r0 = "ALTER TABLE devices ADD platform_type INTEGER"
            r4.execSQL(r0)
        L_0x0022:
            java.lang.String r0 = "ALTER TABLE devices ADD login_time INTEGER"
            r4.execSQL(r0)
        L_0x0027:
            java.lang.String r0 = "ALTER TABLE devices ADD adv_key_index INTEGER NOT NULL DEFAULT 0"
            r4.execSQL(r0)
        L_0x002c:
            java.lang.String r0 = "ALTER TABLE devices ADD full_sync_required INTEGER NOT NULL DEFAULT 0"
            r4.execSQL(r0)
        L_0x0031:
            java.lang.String r0 = "ALTER TABLE devices ADD place_name TEXT"
            r4.execSQL(r0)
        L_0x0036:
            java.lang.String r0 = "ALTER TABLE devices ADD logout_time INTEGER NOT NULL DEFAULT 0"
            r4.execSQL(r0)
        L_0x003b:
            java.lang.String r0 = "DROP TABLE IF EXISTS devices_history"
            r4.execSQL(r0)
        L_0x0040:
            java.lang.String r0 = "ALTER TABLE devices ADD nickname TEXT"
            r4.execSQL(r0)
        L_0x0045:
            java.lang.String r2 = "support_bot_user_agent_chat_history"
            java.lang.String r1 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r0 = "devices"
            X.AnonymousClass350.A02(r4, r0, r2, r1)
        L_0x004f:
            java.lang.String r2 = "support_cag_reactions_and_polls_history"
            java.lang.String r1 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r0 = "devices"
            X.AnonymousClass350.A02(r4, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R7.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
