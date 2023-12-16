package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.1R8  reason: invalid class name */
public class AnonymousClass1R8 extends C18630y0 {
    public final C60972zT A00;
    public final C45932ao A01;

    public AnonymousClass1R8(Context context, C55682qk r4, C60972zT r5, C45932ao r6) {
        super(context, r4, "emojidictionary.db", 1);
        this.A01 = r6;
        this.A00 = r5;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE emoji_search_tag (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, type INTEGER NOT NULL, symbol TEXT NOT NULL, tag TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS emoji_search_pack_index ON emoji_search_tag (type, symbol, tag)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS emoji_search_tag");
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS emoji_search_tag");
        onCreate(sQLiteDatabase);
    }

    public C56862sg A0F() {
        String databaseName = getDatabaseName();
        return C626135u.A00(super.A0A(), this.A00, this.A01, databaseName);
    }
}
