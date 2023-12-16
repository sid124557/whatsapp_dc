package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.1R5  reason: invalid class name */
public class AnonymousClass1R5 extends C18630y0 {
    public final C60972zT A00;
    public final C45932ao A01;

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE exported_files_metadata(_id INTEGER PRIMARY KEY AUTOINCREMENT, local_path TEXT NOT NULL, exported_path TEXT UNIQUE NOT NULL, file_size INTEGER, required INTEGER, encryption_iv TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS exported_files_metadata_local_path_index ON exported_files_metadata (local_path)");
    }

    public AnonymousClass1R5(Context context, C55682qk r4, C60972zT r5, C45932ao r6) {
        super(context, r4, "migration_export_metadata.db", 1);
        this.A01 = r6;
        this.A00 = r5;
    }

    public C56862sg A0F() {
        try {
            String databaseName = getDatabaseName();
            return C626135u.A00(super.A0A(), this.A00, this.A01, databaseName);
        } catch (SQLiteException e) {
            Log.e("Failed to open writable export metadata db.", e);
            String databaseName2 = getDatabaseName();
            return C626135u.A00(super.A0A(), this.A00, this.A01, databaseName2);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
