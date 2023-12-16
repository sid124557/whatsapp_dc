package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.1RG  reason: invalid class name */
public class AnonymousClass1RG extends C18630y0 {
    public final C54292oU A00;
    public final C60972zT A01;
    public final C45932ao A02;
    public final AnonymousClass3ZU A03 = new AnonymousClass3ZU(C72333dY.A02());
    public final String A04;

    public synchronized C56862sg A0F() {
        C56862sg r0;
        try {
            String databaseName = getDatabaseName();
            r0 = C626135u.A00(A0A(), this.A01, this.A02, databaseName);
        } catch (SQLiteDatabaseCorruptException e) {
            Log.w("chat-settings-store/corrupt/removing", e);
            A0D();
            String databaseName2 = getDatabaseName();
            r0 = C626135u.A00(super.A0A(), this.A01, this.A02, databaseName2);
        } catch (SQLiteException e2) {
            e = e2;
            if (e.toString().contains("file is encrypted")) {
                Log.w("chat-settings-store/encrypted/removing", e);
                A0D();
                String databaseName3 = getDatabaseName();
                r0 = C626135u.A00(super.A0A(), this.A01, this.A02, databaseName3);
            }
            throw e;
        } catch (StackOverflowError e3) {
            e = e3;
            Log.w("chat-settings-store/stackoverflowerror", e);
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                if (stackTrace[i].getMethodName().equals("onCorruption")) {
                    Log.w("chat-settings-store/stackoverflowerror/corrupt/removing");
                    A0D();
                    String databaseName4 = getDatabaseName();
                    r0 = C626135u.A00(super.A0A(), this.A01, this.A02, databaseName4);
                } else {
                    i++;
                }
            }
            throw e;
        }
        return r0;
    }

    public AnonymousClass1RG(C55682qk r3, C54292oU r4, C60972zT r5, C45932ao r6, String str) {
        super(r4.A00, r3, str, 1);
        this.A04 = str;
        this.A00 = r4;
        this.A02 = r6;
        this.A01 = r5;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("chat-settings-store/create");
        C626235v.A01(sQLiteDatabase, "settings");
        sQLiteDatabase.execSQL("CREATE TABLE settings (_id INTEGER PRIMARY KEY AUTOINCREMENT,jid TEXT,deleted INTEGER,mute_end INTEGER,muted_notifications BOOLEAN,use_custom_notifications BOOLEAN,message_tone TEXT,message_vibrate INTEGER,message_popup INTEGER,message_light INTEGER,call_tone TEXT,call_vibrate INTEGER,status_muted INTEGER,pinned BOOLEAN,pinned_time INTEGER,low_pri_notifications BOOLEAN,media_visibility INTEGER,mute_reactions INTEGER,wallpaper_light_type TEXT,wallpaper_light_value TEXT,wallpaper_dark_type TEXT,wallpaper_dark_value TEXT,wallpaper_dark_opacity INTEGER,notifications_auto_muted INTEGER NOT NULL DEFAULT 0,push_recording_button_mode INTEGER);");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS jid_index ON settings(jid);");
    }

    public void A0D() {
        super.A0D();
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((AnonymousClass35T) it.next()).A0A();
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("chat-settings-store/downgrade from ");
        A0o.append(i);
        C18260x0.A0y(" to ", A0o, i2);
        onCreate(sQLiteDatabase);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        String databaseName = getDatabaseName();
        C56862sg A002 = C626135u.A00(sQLiteDatabase, this.A01, this.A02, databaseName);
        String A003 = C626235v.A00(A002, "table", "settings");
        if (!TextUtils.isEmpty(A003)) {
            C626235v.A05(A002, A003, "settings", "status_muted", "INTEGER", "ChatSettingsDatabaseHelper");
            C56862sg r8 = A002;
            String str = A003;
            String str2 = "settings";
            String str3 = "ChatSettingsDatabaseHelper";
            C626235v.A05(r8, str, str2, "pinned", "BOOLEAN", str3);
            C626235v.A05(A002, A003, "settings", "pinned_time", "INTEGER", "ChatSettingsDatabaseHelper");
            C626235v.A05(r8, str, str2, "low_pri_notifications", "BOOLEAN", str3);
            C626235v.A05(A002, A003, "settings", "media_visibility", "INTEGER", "ChatSettingsDatabaseHelper");
            C626235v.A05(A002, A003, "settings", "mute_reactions", "INTEGER", "ChatSettingsDatabaseHelper");
            C626235v.A05(r8, str, str2, "notifications_auto_muted", "INTEGER NOT NULL DEFAULT 0", str3);
            C626235v.A05(A002, A003, "settings", "push_recording_button_mode", "INTEGER", "ChatSettingsDatabaseHelper");
            C626235v.A05(r8, str, str2, "wallpaper_light_type", "TEXT", str3);
            C626235v.A05(r8, str, str2, "wallpaper_light_value", "TEXT", str3);
            C626235v.A05(r8, str, str2, "wallpaper_dark_type", "TEXT", str3);
            C626235v.A05(r8, str, str2, "wallpaper_dark_value", "TEXT", str3);
            C626235v.A05(A002, A003, "settings", "wallpaper_dark_opacity", "INTEGER", "ChatSettingsDatabaseHelper");
        }
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((AnonymousClass35T) it.next()).A0G(A002);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("chat-settings-store/upgrade from ");
        A0o.append(i);
        C18260x0.A0y(" to ", A0o, i2);
        onCreate(sQLiteDatabase);
    }
}
