package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.1R6  reason: invalid class name */
public class AnonymousClass1R6 extends C18630y0 {
    public final C60972zT A00;
    public final C45932ao A01;

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE prefetched_files(_id INTEGER PRIMARY KEY AUTOINCREMENT, remote_file_path TEXT UNIQUE NOT NULL, prefetched_file_path TEXT UNIQUE, file_size INTEGER, required INTEGER, prefetched INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS remote_file_path_index ON prefetched_files (remote_file_path)");
        sQLiteDatabase.execSQL("CREATE TABLE encrypted_files(_id INTEGER PRIMARY KEY AUTOINCREMENT, remote_file_path TEXT UNIQUE NOT NULL, enc_iv TEXT)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS remote_file_path_index ON encrypted_files (remote_file_path)");
        sQLiteDatabase.execSQL("CREATE TABLE properties(_id INTEGER PRIMARY KEY AUTOINCREMENT, key TEXT UNIQUE NOT NULL, value TEXT)");
    }

    public AnonymousClass1R6(Context context, C55682qk r4, C60972zT r5, C45932ao r6) {
        super(context, r4, "migration_prefetcher.db", 1);
        this.A01 = r6;
        this.A00 = r5;
    }

    public C56862sg A0F() {
        try {
            String databaseName = getDatabaseName();
            return C626135u.A00(super.A0A(), this.A00, this.A01, databaseName);
        } catch (SQLiteException e) {
            Log.e("Failed to open writable file prefetcher db.", e);
            String databaseName2 = getDatabaseName();
            return C626135u.A00(super.A0A(), this.A00, this.A01, databaseName2);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
