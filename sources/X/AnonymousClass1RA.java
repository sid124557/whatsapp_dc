package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.1RA  reason: invalid class name */
public class AnonymousClass1RA extends C18630y0 {
    public final Context A00;
    public final C60972zT A01;
    public final C45932ao A02;

    public AnonymousClass1RA(Context context, C55682qk r4, C60972zT r5, C45932ao r6) {
        super(context, r4, "hsmpacks.db", 2);
        this.A00 = context;
        this.A02 = r6;
        this.A01 = r5;
    }

    public C56862sg A0F() {
        try {
            String databaseName = getDatabaseName();
            return C626135u.A00(super.A0A(), this.A01, this.A02, databaseName);
        } catch (SQLiteException e) {
            Log.e("failed to open pack store", e);
            A0D();
            String databaseName2 = getDatabaseName();
            return C626135u.A00(super.A0A(), this.A01, this.A02, databaseName2);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C626235v.A01(sQLiteDatabase, "packs");
        sQLiteDatabase.execSQL("CREATE TABLE packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, lg TEXT NOT NULL, lc TEXT NOT NULL, hash TEXT NOT NULL, namespace TEXT NOT NULL, timestamp INTEGER NOT NULL, data BLOB NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS pack_index ON packs (lg, lc, namespace)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("language-pack-store/downgrade from ");
        A0o.append(i);
        C18260x0.A0y(" to ", A0o, i2);
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("language-pack-store/upgrade from ");
        A0o.append(i);
        C18260x0.A0y(" to ", A0o, i2);
        if (i != 1) {
            Log.e("language-pack-store/upgrade unknown old version");
        }
        onCreate(sQLiteDatabase);
    }
}
