package X;

import android.content.Context;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1RD  reason: invalid class name */
public class AnonymousClass1RD extends C18630y0 {
    public final C60972zT A00;
    public final C45932ao A01;
    public final AnonymousClass3ZU A02;

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("PAY: creating payments database version 4");
        sQLiteDatabase.execSQL("CREATE TABLE methods (credential_id TEXT NOT NULL PRIMARY KEY, country TEXT, readable_name TEXT, issuer_name TEXT, type INTEGER NOT NULL, subtype INTEGER, creation_ts INTEGER, updated_ts INTEGER, debit_mode INTEGER NOT NULL, credit_mode INTEGER NOT NULL, balance_1000 INTEGER, balance_ts INTEGER, country_data TEXT, icon BLOB, p2m_debit_mode INTEGER NOT NULL DEFAULT 0, p2m_credit_mode INTEGER NOT NULL DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS payment_methods_index ON methods (credential_id)");
        sQLiteDatabase.execSQL("CREATE TABLE tmp_transactions (tmp_id TEXT NOT NULL, tmp_metadata TEXT, tmp_ts INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_payment_transactions_index ON tmp_transactions (tmp_id)");
        sQLiteDatabase.execSQL("CREATE TABLE contacts (jid NOT NULL, country_data TEXT, merchant INTEGER, consumer_status INTEGER, default_payment_type INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS payment_constacts_index ON contacts (jid)");
    }

    public AnonymousClass1RD(Context context, C55682qk r4, C60972zT r5, C45932ao r6, Set set) {
        super(context, r4, "payments.db", 4);
        this.A01 = r6;
        this.A00 = r5;
        this.A02 = new AnonymousClass3ZU(new C72333dY(set, (AnonymousClass4C1) null));
    }

    public C56862sg A0F() {
        try {
            String databaseName = getDatabaseName();
            return C626135u.A00(super.A0A(), this.A00, this.A01, databaseName);
        } catch (SQLiteException e) {
            Log.e("failed to open payment store", e);
            new SQLiteCantOpenDatabaseException();
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                ((AnonymousClass2G3) it.next()).A00.A0F();
            }
            String databaseName2 = getDatabaseName();
            return C626135u.A00(super.A0A(), this.A00, this.A01, databaseName2);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PaymentDbHelper/onDowngrade/oldVersion:");
        A0o.append(i);
        C18260x0.A0y(", newVersion:", A0o, i2);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS methods");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS tmp_transactions");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(sQLiteDatabase);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        String A012 = AnonymousClass350.A01(sQLiteDatabase, "methods");
        if (!TextUtils.isEmpty(A012)) {
            AnonymousClass350.A03(sQLiteDatabase, A012, "methods", PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "BLOB");
        }
        String A013 = AnonymousClass350.A01(sQLiteDatabase, "contacts");
        if (!TextUtils.isEmpty(A013)) {
            AnonymousClass350.A03(sQLiteDatabase, A013, "contacts", "merchant", "INTEGER");
            AnonymousClass350.A03(sQLiteDatabase, A013, "contacts", "default_payment_type", "INTEGER");
            AnonymousClass350.A03(sQLiteDatabase, A013, "contacts", "consumer_status", "INTEGER");
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PaymentDbHelper/onUpgrade/old version: ");
        A0o.append(i);
        C18260x0.A0y(", new version: ", A0o, i2);
        if (i == 1 || i == 2) {
            sQLiteDatabase.execSQL("ALTER TABLE methods ADD p2m_debit_mode  INTEGER NOT NULL DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE methods ADD p2m_credit_mode  INTEGER NOT NULL DEFAULT 0");
        } else if (i != 3) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("PaymentDbHelper/onUpgrade/Unknown upgrade from ");
            A0o2.append(i);
            throw new SQLiteException(AnonymousClass000.A0Y(" to ", A0o2, i2));
        }
    }
}
