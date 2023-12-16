package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0xz  reason: invalid class name and case insensitive filesystem */
public class C18620xz extends SQLiteOpenHelper implements AnonymousClass4E9 {
    public static final String[] A0C = {"messages", "messages_fts", "messages_links", "quoted_message_order", "quoted_message_product", "messages_quotes", "messages_vcards", "messages_vcards_jids", "pay_transactions", "messages_quotes_payment_invite_legacy", "message_quoted_ui_elements_reply_legacy", "message_quoted_group_invite_legacy", "receipts"};
    public C56862sg A00;
    public Boolean A01;
    public Integer A02;
    public boolean A03;
    public final AnonymousClass37P A04;
    public final C45912am A05;
    public final C60972zT A06;
    public final C45932ao A07;
    public final AnonymousClass3ZU A08;
    public final C183538qC A09;
    public final File A0A;
    public final Object A0B = AnonymousClass002.A0D();

    public C18620xz(Context context, AnonymousClass37P r5, C45912am r6, C60972zT r7, C45932ao r8, AnonymousClass2G4 r9, File file, Set set) {
        super(context, "msgstore.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.A07 = r8;
        this.A06 = r7;
        this.A04 = r5;
        this.A0A = file;
        this.A05 = r6;
        this.A09 = r9.A00;
        this.A08 = new AnonymousClass3ZU(new C72333dY(set, (AnonymousClass4C1) null));
    }

    public synchronized C56862sg BBw() {
        return BEc();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fa, code lost:
        if (r9 != false) goto L_0x00fc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C56862sg BEc() {
        /*
            r11 = this;
            r10 = r11
            monitor-enter(r10)     // Catch:{ all -> 0x0308 }
            boolean r0 = r11.A03     // Catch:{ all -> 0x0305 }
            if (r0 != 0) goto L_0x0016
            X.2sg r0 = r11.A00     // Catch:{ all -> 0x0305 }
            if (r0 == 0) goto L_0x001c
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0305 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0305 }
            if (r0 == 0) goto L_0x001c
            X.2sg r0 = r11.A00     // Catch:{ all -> 0x0305 }
            goto L_0x02fc
        L_0x0016:
            X.3ey r1 = new X.3ey     // Catch:{ all -> 0x0305 }
            r1.<init>()     // Catch:{ all -> 0x0305 }
            goto L_0x0059
        L_0x001c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = "databasehelper/open-existing-db"
            r1.append(r0)     // Catch:{ all -> 0x0305 }
            java.io.File r3 = r11.A0A     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ all -> 0x0305 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0305 }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x0305 }
            r9 = 0
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = "databasehelper/open-existing-db/no-file"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0305 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = "Message store missing, no message store file"
            X.C18270x1.A0y(r3, r0, r1)     // Catch:{ all -> 0x0305 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0305 }
            android.database.sqlite.SQLiteCantOpenDatabaseException r0 = new android.database.sqlite.SQLiteCantOpenDatabaseException     // Catch:{ all -> 0x0305 }
            r0.<init>(r1)     // Catch:{ all -> 0x0305 }
            r11.A02(r0)     // Catch:{ all -> 0x0305 }
        L_0x004f:
            r11.close()     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = "Unable to open writable db: failed to open db"
            android.database.sqlite.SQLiteException r1 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0305 }
            r1.<init>(r0)     // Catch:{ all -> 0x0305 }
        L_0x0059:
            throw r1     // Catch:{ all -> 0x0305 }
        L_0x005a:
            r8 = 0
            r5 = -1
            r7 = 0
        L_0x005d:
            r2 = 0
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8, SQLiteException -> 0x008f }
            r0 = 536870928(0x20000010, float:1.0842042E-19)
            android.database.sqlite.SQLiteDatabase r6 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r2, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8, SQLiteException -> 0x008f }
            X.C626936e.A06(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8, SQLiteException -> 0x008f }
            java.lang.String r4 = r11.getDatabaseName()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8, SQLiteException -> 0x008f }
            X.2ao r1 = r11.A07     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8, SQLiteException -> 0x008f }
            X.2zT r0 = r11.A06     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8, SQLiteException -> 0x008f }
            X.2sg r0 = X.C626135u.A00(r6, r0, r1, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8, SQLiteException -> 0x008f }
            r11.A00 = r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8, SQLiteException -> 0x008f }
            X.C626936e.A06(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8, SQLiteException -> 0x008f }
            X.2sg r0 = r11.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8, SQLiteException -> 0x008f }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8, SQLiteException -> 0x008f }
            int r5 = r0.getVersion()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8, SQLiteException -> 0x008f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8, SQLiteException -> 0x008f }
            java.lang.String r0 = "databasehelper/open-existing-db/version "
            X.C18260x0.A0y(r0, r1, r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a8, SQLiteException -> 0x008f }
            goto L_0x00af
        L_0x008f:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = "databasehelper/open-existing-db/nodb/sqlerror"
            r1.append(r0)     // Catch:{ all -> 0x0305 }
            if (r8 != 0) goto L_0x009e
            java.lang.String r0 = "/will-retry "
            goto L_0x00a0
        L_0x009e:
            java.lang.String r0 = " "
        L_0x00a0:
            X.C18260x0.A14(r0, r1, r4)     // Catch:{ all -> 0x0305 }
            if (r8 <= 0) goto L_0x00a6
            goto L_0x00b7
        L_0x00a6:
            r7 = 1
            goto L_0x00b1
        L_0x00a8:
            r1 = move-exception
            java.lang.String r0 = "databasehelper/open-existing-db/corrupt"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0305 }
            r5 = -1
        L_0x00af:
            if (r7 == 0) goto L_0x00bf
        L_0x00b1:
            int r0 = r8 + 1
            if (r8 != 0) goto L_0x00bf
            r8 = r0
            goto L_0x005d
        L_0x00b7:
            java.lang.String r0 = "databasehelper/open-existing-db/stack"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0305 }
            X.C615631i.A01()     // Catch:{ all -> 0x0305 }
        L_0x00bf:
            X.2sg r0 = r11.A00     // Catch:{ all -> 0x0305 }
            if (r0 == 0) goto L_0x00c7
            if (r5 <= 0) goto L_0x00c7
            r9 = 1
            goto L_0x00dc
        L_0x00c7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = "Can't open message store file "
            X.C18270x1.A0y(r3, r0, r1)     // Catch:{ all -> 0x0305 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0305 }
            android.database.sqlite.SQLiteCantOpenDatabaseException r0 = new android.database.sqlite.SQLiteCantOpenDatabaseException     // Catch:{ all -> 0x0305 }
            r0.<init>(r1)     // Catch:{ all -> 0x0305 }
            r11.A02(r0)     // Catch:{ all -> 0x0305 }
        L_0x00dc:
            X.2sg r0 = r11.A00     // Catch:{ all -> 0x0305 }
            if (r0 == 0) goto L_0x00fa
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0305 }
            boolean r0 = r0.isReadOnly()     // Catch:{ all -> 0x0305 }
            if (r0 == 0) goto L_0x00ed
            java.lang.String r0 = "databasehelper/open-existing-db/ is read only"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0305 }
        L_0x00ed:
            if (r9 != 0) goto L_0x00fc
            X.2sg r0 = r11.A00     // Catch:{ all -> 0x0305 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0305 }
            r0.close()     // Catch:{ all -> 0x0305 }
            r11.A00 = r2     // Catch:{ all -> 0x0305 }
            goto L_0x004f
        L_0x00fa:
            if (r9 == 0) goto L_0x004f
        L_0x00fc:
            java.lang.String r1 = "databasehelper/canQueryDb"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0305 }
            X.2sg r0 = r11.A00     // Catch:{ all -> 0x0305 }
            if (r0 == 0) goto L_0x02fe
            X.33M r4 = X.AnonymousClass33M.A01(r1)     // Catch:{ all -> 0x0305 }
            X.2sg r0 = r11.A00     // Catch:{ all -> 0x0305 }
            java.lang.String r6 = "messages"
            java.lang.String r5 = "table"
            java.lang.String r0 = X.C626235v.A00(r0, r5, r6)     // Catch:{ all -> 0x0305 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0305 }
            if (r0 == 0) goto L_0x011e
            java.lang.String r1 = "SELECT EXISTS (SELECT 1 FROM message LIMIT 1)"
            goto L_0x0120
        L_0x011e:
            java.lang.String r1 = "SELECT EXISTS (SELECT 1 FROM messages LIMIT 1)"
        L_0x0120:
            X.2sg r0 = r11.A00     // Catch:{ SQLiteDoneException -> 0x0183, SQLiteFullException -> 0x02f2, SQLiteDatabaseCorruptException -> 0x015b, SQLiteException -> 0x0148 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteDoneException -> 0x0183, SQLiteFullException -> 0x02f2, SQLiteDatabaseCorruptException -> 0x015b, SQLiteException -> 0x0148 }
            android.database.sqlite.SQLiteStatement r0 = r0.compileStatement(r1)     // Catch:{ SQLiteDoneException -> 0x0183, SQLiteFullException -> 0x02f2, SQLiteDatabaseCorruptException -> 0x015b, SQLiteException -> 0x0148 }
            long r7 = r0.simpleQueryForLong()     // Catch:{ SQLiteDoneException -> 0x0183, SQLiteFullException -> 0x02f2, SQLiteDatabaseCorruptException -> 0x015b, SQLiteException -> 0x0148 }
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            boolean r2 = X.AnonymousClass001.A1U(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SQLiteDoneException -> 0x0183, SQLiteFullException -> 0x02f2, SQLiteDatabaseCorruptException -> 0x015b, SQLiteException -> 0x0148 }
            java.lang.String r0 = "databasehelper/canQueryDb "
            r1.append(r0)     // Catch:{ SQLiteDoneException -> 0x0183, SQLiteFullException -> 0x02f2, SQLiteDatabaseCorruptException -> 0x015b, SQLiteException -> 0x0148 }
            r1.append(r2)     // Catch:{ SQLiteDoneException -> 0x0183, SQLiteFullException -> 0x02f2, SQLiteDatabaseCorruptException -> 0x015b, SQLiteException -> 0x0148 }
            java.lang.String r0 = " | time spent:"
            X.AnonymousClass33M.A05(r4, r0, r1)     // Catch:{ SQLiteDoneException -> 0x0183, SQLiteFullException -> 0x02f2, SQLiteDatabaseCorruptException -> 0x015b, SQLiteException -> 0x0148 }
            if (r2 == 0) goto L_0x0177
            goto L_0x018c
        L_0x0148:
            r2 = move-exception
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = "file is encrypted"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0305 }
            if (r0 == 0) goto L_0x0304
            java.lang.String r0 = "databasehelper/canQueryDb/cursor/encrypted-file-error"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0305 }
            goto L_0x0161
        L_0x015b:
            r1 = move-exception
            java.lang.String r0 = "databasehelper/canQueryDb/dbcorrupt"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0305 }
        L_0x0161:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = "databasehelper/canQueryDb/nocursor | time spent:"
            X.AnonymousClass33M.A05(r4, r0, r1)     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = "databasehelper/canQueryDb/deletedb"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0305 }
            r3.delete()     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = "databasehelper"
            X.C626135u.A06(r3, r0)     // Catch:{ all -> 0x0305 }
        L_0x0177:
            r11.close()     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = "Unable to open writable db: failed to query db"
            android.database.sqlite.SQLiteException r1 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0305 }
            r1.<init>(r0)     // Catch:{ all -> 0x0305 }
            goto L_0x0059
        L_0x0183:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = "databasehelper/canQueryDb/noRow | time spent:"
            X.AnonymousClass33M.A05(r4, r0, r1)     // Catch:{ all -> 0x0305 }
        L_0x018c:
            X.2am r0 = r11.A05     // Catch:{ all -> 0x0305 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0305 }
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = "databasehelper/canUpdateDb skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0305 }
            goto L_0x01d6
        L_0x0198:
            java.lang.String r0 = "databasehelper/canUpdateDb"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0305 }
            X.33M r4 = X.AnonymousClass33M.A01(r0)     // Catch:{ all -> 0x0305 }
            X.2sg r0 = r11.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x02cf, SQLiteFullException -> 0x02ca, SQLiteException -> 0x02c5 }
            if (r0 == 0) goto L_0x02be
            java.lang.String r0 = X.C626235v.A00(r0, r5, r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x02cf, SQLiteFullException -> 0x02ca, SQLiteException -> 0x02c5 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x02cf, SQLiteFullException -> 0x02ca, SQLiteException -> 0x02c5 }
            if (r0 == 0) goto L_0x01d0
            java.lang.String r2 = "UPDATE message SET receipt_server_timestamp = -1 WHERE _id = 1"
        L_0x01b1:
            X.2sg r0 = r11.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x02cf, SQLiteFullException -> 0x02ca, SQLiteException -> 0x02c5 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x02cf, SQLiteFullException -> 0x02ca, SQLiteException -> 0x02c5 }
            r0.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x02cf, SQLiteFullException -> 0x02ca, SQLiteException -> 0x02c5 }
            X.2sg r1 = r11.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x02cf, SQLiteFullException -> 0x02ca, SQLiteException -> 0x02c5 }
            java.lang.String r0 = "DB_HELPER_CAN_UPDATE_DB"
            r1.A0H(r2, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x02cf, SQLiteFullException -> 0x02ca, SQLiteException -> 0x02c5 }
            X.2sg r0 = r11.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x02cf, SQLiteFullException -> 0x02ca, SQLiteException -> 0x02c5 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x02cf, SQLiteFullException -> 0x02ca, SQLiteException -> 0x02c5 }
            r0.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x02cf, SQLiteFullException -> 0x02ca, SQLiteException -> 0x02c5 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SQLiteDatabaseCorruptException -> 0x02cf, SQLiteFullException -> 0x02ca, SQLiteException -> 0x02c5 }
            java.lang.String r0 = "databasehelper/canUpdateDb | time spent:"
            X.AnonymousClass33M.A05(r4, r0, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x02cf, SQLiteFullException -> 0x02ca, SQLiteException -> 0x02c5 }
            goto L_0x01d3
        L_0x01d0:
            java.lang.String r2 = "UPDATE messages SET send_timestamp = -1 WHERE _id = 1"
            goto L_0x01b1
        L_0x01d3:
            A00(r11)     // Catch:{ all -> 0x0305 }
        L_0x01d6:
            java.lang.String r5 = "databasehelper/prepareWritableDatabase/done applying transactions; elapsed="
            X.2sg r0 = r11.A00     // Catch:{ SQLiteException -> 0x02b5 }
            if (r0 == 0) goto L_0x02ae
            java.lang.String r0 = "databasehelper/prepareWritableDatabase"
            X.33M r4 = X.AnonymousClass33M.A01(r0)     // Catch:{ SQLiteException -> 0x02b5 }
            X.2sg r0 = r11.A00     // Catch:{ SQLiteException -> 0x02b5 }
            java.lang.String r3 = "msgtore_db_schema_version"
            boolean r0 = r11.A09(r0, r3)     // Catch:{ SQLiteException -> 0x02b5 }
            if (r0 != 0) goto L_0x027e
            X.2sg r0 = r11.A00     // Catch:{ SQLiteException -> 0x02b5 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteException -> 0x02b5 }
            r0.beginTransaction()     // Catch:{ SQLiteException -> 0x02b5 }
            X.2Kk r0 = r11.A01()     // Catch:{ all -> 0x0258 }
            X.2Kl r2 = new X.2Kl     // Catch:{ all -> 0x0258 }
            r2.<init>(r0)     // Catch:{ all -> 0x0258 }
            X.2sg r0 = r11.A00     // Catch:{ all -> 0x0258 }
            r11.A08(r0, r2)     // Catch:{ all -> 0x0258 }
            X.2sg r0 = r11.A00     // Catch:{ all -> 0x0258 }
            r11.A05(r0, r2)     // Catch:{ all -> 0x0258 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = "databasehelper/prepareWritableDatabase/done creating tables; elapsed="
            X.AnonymousClass33M.A04(r4, r0, r1)     // Catch:{ all -> 0x0258 }
            X.2sg r0 = r11.A00     // Catch:{ all -> 0x0258 }
            r11.A04(r0)     // Catch:{ all -> 0x0258 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = "databasehelper/prepareWritableDatabase/done creating message views; elapsed="
            X.AnonymousClass33M.A04(r4, r0, r1)     // Catch:{ all -> 0x0258 }
            X.2sg r0 = r11.A00     // Catch:{ all -> 0x0258 }
            r11.A06(r0, r2)     // Catch:{ all -> 0x0258 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = "databasehelper/prepareWritableDatabase/done creating triggers; elapsed="
            X.AnonymousClass33M.A04(r4, r0, r1)     // Catch:{ all -> 0x0258 }
            X.2sg r2 = r11.A00     // Catch:{ all -> 0x0258 }
            java.lang.String r1 = "Consumer-f393ea6dd3e32d7d27203def913af369"
            java.lang.String r0 = "DatabaseHelper"
            X.C622033z.A03(r2, r3, r1, r0)     // Catch:{ all -> 0x0258 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = "databasehelper/prepareWritableDatabase/done schema version update; elapsed="
            X.AnonymousClass33M.A04(r4, r0, r1)     // Catch:{ all -> 0x0258 }
            X.2sg r0 = r11.A00     // Catch:{ all -> 0x0258 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0258 }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x0258 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = "databasehelper/prepareWritableDatabase/done setting transaction successful; elapsed="
            X.AnonymousClass33M.A04(r4, r0, r1)     // Catch:{ all -> 0x0258 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0258 }
            java.lang.String r0 = "databasehelper/prepareWritableDatabase/begin applying transactions; elapsed="
            X.AnonymousClass33M.A04(r4, r0, r1)     // Catch:{ all -> 0x0258 }
            goto L_0x026c
        L_0x0258:
            r3 = move-exception
            X.2sg r0 = r11.A00     // Catch:{ SQLiteException -> 0x02b5 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteException -> 0x02b5 }
            r0.endTransaction()     // Catch:{ SQLiteException -> 0x02b5 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r5)     // Catch:{ SQLiteException -> 0x02b5 }
            long r0 = r4.A07()     // Catch:{ SQLiteException -> 0x02b5 }
            X.C18260x0.A1H(r2, r0)     // Catch:{ SQLiteException -> 0x02b5 }
            throw r3     // Catch:{ SQLiteException -> 0x02b5 }
        L_0x026c:
            X.2sg r0 = r11.A00     // Catch:{ SQLiteException -> 0x02b5 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteException -> 0x02b5 }
            r0.endTransaction()     // Catch:{ SQLiteException -> 0x02b5 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r5)     // Catch:{ SQLiteException -> 0x02b5 }
            long r0 = r4.A07()     // Catch:{ SQLiteException -> 0x02b5 }
            X.C18260x0.A1H(r2, r0)     // Catch:{ SQLiteException -> 0x02b5 }
        L_0x027e:
            X.3ZU r0 = r11.A08     // Catch:{ SQLiteException -> 0x02b5 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ SQLiteException -> 0x02b5 }
        L_0x0284:
            boolean r0 = r3.hasNext()     // Catch:{ SQLiteException -> 0x02b5 }
            if (r0 == 0) goto L_0x029d
            java.lang.Object r0 = r3.next()     // Catch:{ SQLiteException -> 0x02b5 }
            X.2R6 r0 = (X.AnonymousClass2R6) r0     // Catch:{ SQLiteException -> 0x02b5 }
            X.2og r0 = r0.A00     // Catch:{ SQLiteException -> 0x02b5 }
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C54412og.A00(r0)     // Catch:{ SQLiteException -> 0x02b5 }
            java.lang.String r0 = "force_db_check"
            X.C18270x1.A0l(r1, r0, r2)     // Catch:{ SQLiteException -> 0x02b5 }
            goto L_0x0284
        L_0x029d:
            X.2sg r0 = r11.A00     // Catch:{ SQLiteException -> 0x02a5 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteException -> 0x02a5 }
            r11.onOpen(r0)     // Catch:{ SQLiteException -> 0x02a5 }
            goto L_0x02f7
        L_0x02a5:
            r1 = move-exception
            java.lang.String r0 = "msgstore/getWritableLoggableDatabase/onopen"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0305 }
            goto L_0x0059
        L_0x02ae:
            java.lang.String r0 = "databasehelper/prepareWritableDatabase/database is not initialized"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ SQLiteException -> 0x02b5 }
            throw r0     // Catch:{ SQLiteException -> 0x02b5 }
        L_0x02b5:
            r1 = move-exception
            java.lang.String r0 = "msgstore/getWritableLoggableDatabase/prepare"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0305 }
            goto L_0x0059
        L_0x02be:
            java.lang.String r0 = "databasehelper/canUpdateDb/database is not initialized"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x02cf, SQLiteFullException -> 0x02ca, SQLiteException -> 0x02c5 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x02cf, SQLiteFullException -> 0x02ca, SQLiteException -> 0x02c5 }
        L_0x02c5:
            r0 = move-exception
            r11.A02(r0)     // Catch:{ all -> 0x02ec }
            goto L_0x02ce
        L_0x02ca:
            r0 = move-exception
            r11.A02(r0)     // Catch:{ all -> 0x02ec }
        L_0x02ce:
            throw r0     // Catch:{ all -> 0x02ec }
        L_0x02cf:
            r1 = move-exception
            java.lang.String r0 = "databasehelper/canUpdateDb/dbcorrupt"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x02ec }
            r3.delete()     // Catch:{ all -> 0x02ec }
            java.lang.String r0 = "databasehelper"
            X.C626135u.A06(r3, r0)     // Catch:{ all -> 0x02ec }
            A00(r11)     // Catch:{ all -> 0x0305 }
            r11.close()     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = "Unable to open writable db: failed to update db"
            android.database.sqlite.SQLiteException r1 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0305 }
            r1.<init>(r0)     // Catch:{ all -> 0x0305 }
            goto L_0x0059
        L_0x02ec:
            r1 = move-exception
            A00(r11)     // Catch:{ all -> 0x0305 }
            goto L_0x0059
        L_0x02f2:
            r0 = move-exception
            r11.A02(r0)     // Catch:{ all -> 0x0305 }
            throw r0     // Catch:{ all -> 0x0305 }
        L_0x02f7:
            X.2sg r0 = r11.A00     // Catch:{ all -> 0x0305 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x0305 }
        L_0x02fc:
            monitor-exit(r10)     // Catch:{ all -> 0x0308 }
            return r0
        L_0x02fe:
            java.lang.String r0 = "databasehelper/canQueryDb/database is not initialized"
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x0305 }
        L_0x0304:
            throw r2     // Catch:{ all -> 0x0305 }
        L_0x0305:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0308 }
            throw r0     // Catch:{ all -> 0x0308 }
        L_0x0308:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18620xz.BEc():X.2sg");
    }

    public synchronized void close() {
        C56862sg r0 = this.A00;
        if (r0 != null && r0.A00.isOpen()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("msgstore/close, ");
            C18260x0.A0o(this.A00.A00, A0o);
            this.A00.A00.close();
        }
        this.A00 = null;
        this.A02 = null;
    }

    @Deprecated
    public synchronized SQLiteDatabase getReadableDatabase() {
        C626936e.A0D(false, "Use getReadableLoggableDatabase instead");
        return BBw().A00;
    }

    @Deprecated
    public synchronized SQLiteDatabase getWritableDatabase() {
        C626936e.A0D(false, "Use getWritableLoggableDatabase instead");
        return BEc().A00;
    }

    public static void A00(C18620xz r1) {
        C56862sg r0 = r1.A00;
        if (r0 != null && r0.A00.inTransaction()) {
            r1.A00.A00.endTransaction();
        }
    }

    public final C41482Kk A01() {
        boolean z;
        C41482Kk r2 = new C41482Kk();
        C45912am r1 = this.A05;
        r2.A01 = r1.A03;
        synchronized (r1) {
            z = r1.A01;
        }
        r2.A00 = z;
        return r2;
    }

    public final void A02(SQLiteException sQLiteException) {
        C28761hj r1;
        int i;
        Iterator it = this.A08.iterator();
        while (it.hasNext()) {
            AnonymousClass2R6 r2 = (AnonymousClass2R6) it.next();
            if (sQLiteException instanceof SQLiteFullException) {
                r1 = r2.A01;
                i = 0;
            } else if (sQLiteException instanceof SQLiteCantOpenDatabaseException) {
                if (r2.A03.A02()) {
                    r1 = r2.A01;
                    i = 2;
                }
            } else if (sQLiteException.toString().contains("unable to open")) {
                r1 = r2.A01;
                i = 3;
            } else if (sQLiteException.toString().contains("attempt to write a readonly database")) {
                r1 = r2.A01;
                i = 4;
            }
            r1.A08(i);
        }
    }

    public void A03(C85284Fq r9) {
        if (this.A00 != null) {
            C69833Yo Axl = r9.Axl();
            try {
                for (String A0V : AnonymousClass3L1.A00) {
                    String A0V2 = AnonymousClass000.A0V("message_fts", A0V, AnonymousClass001.A0o());
                    C626235v.A03(this.A00, "DatabaseHelper", A0V2);
                    Object[] A0M = AnonymousClass002.A0M();
                    AnonymousClass000.A16("message", A0V2, A0M);
                    this.A00.A0H(AnonymousClass000.A0V("DROP TRIGGER IF EXISTS ", String.format("%s_bd_for_%s_trigger", A0M).toLowerCase(Locale.getDefault()), AnonymousClass001.A0o()), "DROP_OLD_FTS_TABLES_TRIGGERS");
                }
                Axl.A00();
                Axl.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } else {
            throw AnonymousClass001.A0e("databasehelper/dropOldFtsTables/database is not initialized");
        }
    }

    public void A04(C56862sg r4) {
        SQLiteDatabase sQLiteDatabase = r4.A00;
        sQLiteDatabase.beginTransaction();
        try {
            r4.A0H("DROP VIEW IF EXISTS available_messages_view", "DROP_DEPRECATED_AVAILABLE_MESSAGES_VIEW");
            r4.A0H("DROP VIEW IF EXISTS legacy_available_messages_view", "DROP_VIEW_AVAILABLE_MESSAGES_LEGACY");
            r4.A0H("DROP VIEW IF EXISTS message_view", "DROP_VIEW_MESSAGE");
            r4.A0H("DROP VIEW IF EXISTS available_message_view", "DROP_VIEW_AVAILABLE_MESSAGE");
            r4.A0H("DROP VIEW IF EXISTS deleted_messages_view", "DROP_VIEW_DELETED_MESSAGES");
            r4.A0H("DROP VIEW IF EXISTS deleted_messages_ids_view", "DROP_VIEW_DELETED_MESSAGES_IDS");
            r4.A0H("CREATE VIEW message_view AS SELECT message._id AS _id, message.sort_id AS sort_id, message.chat_row_id AS chat_row_id, from_me, key_id, sender_jid_row_id, NULL AS sender_jid_raw_string, status, broadcast, recipient_count, participant_hash, origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, message_type, text_data, starred, lookup_tables, message_add_on_flags, view_mode, NULL AS data, NULL AS media_url, NULL AS media_mime_type, NULL AS media_size, NULL AS media_name, NULL AS media_caption, NULL AS media_hash, NULL AS media_duration, NULL AS latitude, NULL AS longitude, NULL AS thumb_image, NULL AS raw_data, NULL AS quoted_row_id, NULL AS mentioned_jids, NULL AS multicast_id, NULL AS edit_version, NULL AS media_enc_hash, NULL AS payment_transaction_id, NULL AS preview_type, NULL AS receipt_device_timestamp, NULL AS read_device_timestamp, NULL AS played_device_timestamp, NULL AS future_message_type, 2 AS table_version FROM message", "CREATE_MESSAGE_VIEW_FROM_V2");
            r4.A0H("CREATE VIEW available_message_view AS  SELECT message._id AS _id, message.sort_id AS sort_id, message.chat_row_id AS chat_row_id, from_me, key_id, sender_jid_row_id, NULL AS sender_jid_raw_string, status, broadcast, recipient_count, participant_hash, origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, message_type, text_data, starred, lookup_tables, message_add_on_flags, view_mode, NULL AS data, NULL AS media_url, NULL AS media_mime_type, NULL AS media_size, NULL AS media_name, NULL AS media_caption, NULL AS media_hash, NULL AS media_duration, NULL AS latitude, NULL AS longitude, NULL AS thumb_image, NULL AS raw_data, NULL AS quoted_row_id, NULL AS mentioned_jids, NULL AS multicast_id, NULL AS edit_version, NULL AS media_enc_hash, NULL AS payment_transaction_id, NULL AS preview_type, NULL AS receipt_device_timestamp, NULL AS read_device_timestamp, NULL AS played_device_timestamp, NULL AS future_message_type, 2 AS table_version, expire_timestamp, keep_in_chat FROM message LEFT JOIN deleted_chat_job AS job ON job.chat_row_id = message.chat_row_id LEFT JOIN message_ephemeral AS message_ephemeral ON message._id = message_ephemeral.message_row_id WHERE  IFNULL(NOT((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_starred_message_row_id, -9223372036854775808)) OR ( (job.deleted_message_categories IS NOT NULL) AND (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_categories_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_categories_starred_message_row_id, -9223372036854775808)))) OR ((job.singular_message_delete_rows_id IS NOT NULL) AND (job.singular_message_delete_rows_id LIKE '%\"' || message._id || '\"%'))), 0)", "CREATE_AVAILABLE_MESSAGE_VIEW_FROM_V2");
            r4.A0H("CREATE VIEW IF NOT EXISTS deleted_messages_view AS   SELECT message._id AS _id, message.sort_id AS sort_id, message.chat_row_id AS chat_row_id, from_me, key_id, sender_jid_row_id, NULL AS sender_jid_raw_string, status, broadcast, recipient_count, participant_hash, origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, message_type, text_data, starred, lookup_tables, message_add_on_flags, view_mode, NULL AS data, NULL AS media_url, NULL AS media_mime_type, NULL AS media_size, NULL AS media_name, NULL AS media_caption, NULL AS media_hash, NULL AS media_duration, NULL AS latitude, NULL AS longitude, NULL AS thumb_image, NULL AS raw_data, NULL AS quoted_row_id, NULL AS mentioned_jids, NULL AS multicast_id, NULL AS edit_version, NULL AS media_enc_hash, NULL AS payment_transaction_id, NULL AS preview_type, NULL AS receipt_device_timestamp, NULL AS read_device_timestamp, NULL AS played_device_timestamp, NULL AS future_message_type, 2 AS table_version, ((((job.singular_message_delete_rows_id LIKE '%\"' || message._id || '\"%') AND (job.delete_files_singular_delete== 1)) OR ((job.deleted_messages_remove_files == 1) AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_starred_message_row_id, -9223372036854775808)))) OR ((job.deleted_categories_remove_files == 1) AND ( (job.deleted_message_categories IS NOT NULL) AND (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_categories_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_categories_starred_message_row_id, -9223372036854775808))))))) as remove_files FROM  deleted_chat_job AS job JOIN message AS message  ON job.chat_row_id = message.chat_row_id   WHERE  IFNULL((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_starred_message_row_id, -9223372036854775808)) OR ( (job.deleted_message_categories IS NOT NULL) AND (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_categories_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_categories_starred_message_row_id, -9223372036854775808)))) OR ((job.singular_message_delete_rows_id IS NOT NULL) AND (job.singular_message_delete_rows_id LIKE '%\"' || message._id || '\"%')), 0) ORDER BY message._id", "CREATE_DELETED_MESSAGES_VIEW_FROM_V2");
            r4.A0H("CREATE VIEW IF NOT EXISTS deleted_messages_ids_view AS  SELECT message._id, message.sort_id, message.chat_row_id, message.message_type FROM deleted_chat_job AS job  JOIN message AS message  ON job.chat_row_id = message.chat_row_id WHERE  IFNULL((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_starred_message_row_id, -9223372036854775808)) OR ( (job.deleted_message_categories IS NOT NULL) AND (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_categories_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_categories_starred_message_row_id, -9223372036854775808)))) OR ((job.singular_message_delete_rows_id IS NOT NULL) AND (job.singular_message_delete_rows_id LIKE '%\"' || message._id || '\"%')), 0)", "CREATE_DELETED_MESSAGES_IDS_VIEW_FROM_V2");
            r4.A0H("DROP VIEW IF EXISTS chat_view", "DROP_VIEW_CHAT");
            r4.A0H("CREATE VIEW chat_view AS SELECT chat._id AS _id, jid.raw_string AS raw_string_jid, hidden AS hidden, subject AS subject, created_timestamp AS created_timestamp, display_message_row_id AS display_message_row_id, last_message_row_id AS last_message_row_id, last_read_message_row_id AS last_read_message_row_id, last_read_receipt_sent_message_row_id AS last_read_receipt_sent_message_row_id, last_important_message_row_id AS last_important_message_row_id, archived AS archived, sort_timestamp AS sort_timestamp, mod_tag AS mod_tag, gen AS gen, spam_detection AS spam_detection, unseen_earliest_message_received_time AS unseen_earliest_message_received_time, unseen_message_count AS unseen_message_count, unseen_missed_calls_count AS unseen_missed_calls_count, unseen_row_count AS unseen_row_count, unseen_message_reaction_count AS unseen_message_reaction_count, unseen_comment_message_count AS unseen_comment_message_count, last_message_reaction_row_id AS last_message_reaction_row_id, last_seen_message_reaction_row_id AS last_seen_message_reaction_row_id, plaintext_disabled AS plaintext_disabled, vcard_ui_dismissed AS vcard_ui_dismissed, change_number_notified_message_row_id AS change_number_notified_message_row_id, show_group_description AS show_group_description, ephemeral_expiration AS ephemeral_expiration, last_read_ephemeral_message_row_id AS last_read_ephemeral_message_row_id, ephemeral_setting_timestamp AS ephemeral_setting_timestamp, ephemeral_displayed_exemptions AS ephemeral_displayed_exemptions, ephemeral_disappearing_messages_initiator AS ephemeral_disappearing_messages_initiator, unseen_important_message_count AS unseen_important_message_count, group_type AS group_type, growth_lock_level AS growth_lock_level, growth_lock_expiration_ts AS growth_lock_expiration_ts, last_read_message_sort_id AS last_read_message_sort_id, display_message_sort_id AS display_message_sort_id, last_message_sort_id AS last_message_sort_id, last_read_receipt_sent_message_sort_id AS last_read_receipt_sent_message_sort_id, has_new_community_admin_dialog_been_acknowledged AS has_new_community_admin_dialog_been_acknowledged, history_sync_progress AS history_sync_progress, chat_lock AS chat_lock, chat_origin AS chat_origin FROM chat chat LEFT JOIN jid jid ON chat.jid_row_id = jid._id", "CREATE_VIEW_CHAT_V2");
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public void A06(C56862sg r4, C41492Kl r5) {
        C56622sI r2 = new C56622sI();
        Iterator A0j = AnonymousClass0x2.A0j(this.A09);
        while (A0j.hasNext()) {
            ((AnonymousClass4ED) A0j.next()).B3l(r4, r5, r2);
        }
        r2.A08(r4, "DatabaseHelper");
    }

    public final void A07(C56862sg r4, C41492Kl r5) {
        C56622sI r2 = new C56622sI();
        Iterator A0j = AnonymousClass0x2.A0j(this.A09);
        while (A0j.hasNext()) {
            ((AnonymousClass4ED) A0j.next()).B3g(r4, r5, r2);
        }
        r2.A07(r4, "DatabaseHelper");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a7, code lost:
        if (java.lang.Integer.parseInt(X.C622033z.A00(r7, "links_ready", java.lang.String.valueOf(0))) == 0) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.C622033z.A02(r7, "links_ready", "DatabaseHelper", 1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x00a9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.C56862sg r7, X.C41492Kl r8) {
        /*
            r6 = this;
            java.lang.String r0 = "databasehelper/createDatabaseTables"
            X.33M r5 = X.AnonymousClass33M.A01(r0)     // Catch:{ all -> 0x00b0 }
            android.database.sqlite.SQLiteDatabase r1 = r7.A00     // Catch:{ all -> 0x00b0 }
            r0 = 1
            r1.setVersion(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = X.C39072Ao.A00     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "DROP_MEDIA_STREAMING_SIDECAR_DEPRECATED"
            r7.A0H(r1, r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "messages_dehydrated_hsm"
            java.lang.String r4 = "DatabaseHelper"
            X.C626235v.A03(r7, r4, r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = "DROP INDEX IF EXISTS message_view_once_index"
            java.lang.String r0 = "DROP_DEPRECATED_INDEX"
            r7.A0H(r1, r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = "DROP TABLE IF EXISTS message_view_once"
            java.lang.String r0 = "DROP_DEPRECATED_TABLE"
            r7.A0H(r1, r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "jid_key_index"
            java.lang.String r1 = "MessagesDBHelper"
            X.C626235v.A02(r7, r1, r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "message_comment_parent_message_row_id_index"
            X.C626235v.A02(r7, r1, r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "message_quoted_view_once_media"
            java.lang.String r1 = "MessageViewOnceTable"
            X.C626235v.A03(r7, r1, r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "message_quoted_view_once_media_legacy"
            X.C626235v.A03(r7, r1, r0)     // Catch:{ all -> 0x00b0 }
            X.2sI r2 = new X.2sI     // Catch:{ all -> 0x00b0 }
            r2.<init>()     // Catch:{ all -> 0x00b0 }
            X.8qC r0 = r6.A09     // Catch:{ all -> 0x00b0 }
            java.util.Iterator r1 = X.AnonymousClass0x2.A0j(r0)     // Catch:{ all -> 0x00b0 }
        L_0x004e:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00b0 }
            X.4ED r0 = (X.AnonymousClass4ED) r0     // Catch:{ all -> 0x00b0 }
            r0.B3j(r8, r2)     // Catch:{ all -> 0x00b0 }
            goto L_0x004e
        L_0x005e:
            r2.A06(r7, r8)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "call_logs"
            java.lang.String r3 = "table"
            java.lang.String r0 = X.C626235v.A00(r7, r3, r0)     // Catch:{ all -> 0x00b0 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00b0 }
            r1 = 1
            if (r0 == 0) goto L_0x0087
            java.lang.String r3 = "call_log_ready"
            java.lang.String r0 = "CallLogTable"
            X.C622033z.A02(r7, r3, r0, r1)     // Catch:{ all -> 0x00b0 }
        L_0x0079:
            java.lang.String r0 = "jid_ready"
            X.C622033z.A02(r7, r0, r4, r1)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "jid_map_ready"
            X.C622033z.A02(r7, r0, r4, r1)     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "links_ready"
            r0 = 0
            goto L_0x009b
        L_0x0087:
            java.lang.String r0 = "call_log_participant"
            java.lang.String r0 = X.C626235v.A00(r7, r3, r0)     // Catch:{ all -> 0x00b0 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0079
            java.lang.String r3 = "CREATE TABLE call_log_participant (_id INTEGER PRIMARY KEY AUTOINCREMENT, call_logs_row_id INTEGER, jid TEXT, call_result INTEGER)"
            java.lang.String r0 = "CREATE_CALL_LOG_PARTICIPANTS_TABLE_DEPRECATED"
            r7.A0H(r3, r0)     // Catch:{ all -> 0x00b0 }
            goto L_0x0079
        L_0x009b:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00a9 }
            java.lang.String r0 = X.C622033z.A00(r7, r3, r0)     // Catch:{ NumberFormatException -> 0x00a9 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00a9 }
            if (r0 != 0) goto L_0x00ac
        L_0x00a9:
            X.C622033z.A02(r7, r3, r4, r1)     // Catch:{ all -> 0x00b0 }
        L_0x00ac:
            r5.A07()     // Catch:{ all -> 0x00b0 }
            return
        L_0x00b0:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18620xz.A08(X.2sg, X.2Kl):void");
    }

    public boolean A09(C56862sg r3, String str) {
        boolean z;
        C45912am r1 = this.A05;
        synchronized (r1) {
            z = r1.A00;
        }
        if (z) {
            return false;
        }
        String str2 = "";
        if (!C626235v.A04(r3, "props")) {
            str2 = C622033z.A00(r3, str, str2);
        }
        return str2.equals("Consumer-f393ea6dd3e32d7d27203def913af369");
    }

    public void A05(C56862sg r4, C41492Kl r5) {
        if (!A09(r4, "msgtore_db_schema_indexes_version")) {
            synchronized (this) {
                A07(r4, r5);
                C622033z.A03(r4, "msgtore_db_schema_indexes_version", "Consumer-f393ea6dd3e32d7d27203def913af369", "DatabaseHelper");
            }
        }
    }

    public AnonymousClass37P BAE() {
        return this.A04;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        AtomicBoolean A0l = C18280x3.A0l();
        synchronized (this) {
            String databaseName = getDatabaseName();
            C56862sg A002 = C626135u.A00(sQLiteDatabase, this.A06, this.A07, databaseName);
            try {
                AnonymousClass31L r0 = new AnonymousClass31L(this, 1, A0l);
                SQLiteDatabase sQLiteDatabase2 = A002.A00;
                sQLiteDatabase2.beginTransactionWithListener(r0);
                Log.i("msgstore/create");
                C41492Kl r4 = new C41492Kl(A01());
                C56622sI r2 = new C56622sI();
                Iterator A0j = AnonymousClass0x2.A0j(this.A09);
                while (A0j.hasNext()) {
                    ((AnonymousClass4ED) A0j.next()).B3j(r4, r2);
                }
                Iterator A0i = C18280x3.A0i(r2.A03);
                while (A0i.hasNext()) {
                    C626235v.A03(A002, "DatabaseHelper", AnonymousClass001.A0m(A0i));
                }
                if (C626235v.A04(A002, "props")) {
                    A002.A0H("CREATE TABLE props (_id INTEGER PRIMARY KEY AUTOINCREMENT, key TEXT UNIQUE, value TEXT)", "CREATE_PROPS_TABLE");
                }
                C622033z.A02(A002, "fts_ready", "DatabaseHelper", 5);
                C622033z.A02(A002, "call_log_ready", "DatabaseHelper", 1);
                C622033z.A02(A002, "chat_ready", "DatabaseHelper", 2);
                C622033z.A02(A002, "blank_me_jid_ready", "DatabaseHelper", 1);
                C622033z.A02(A002, "participant_user_ready", "DatabaseHelper", 2);
                C622033z.A02(A002, "broadcast_me_jid_ready", "DatabaseHelper", 2);
                C622033z.A02(A002, "receipt_user_ready", "DatabaseHelper", 2);
                C622033z.A02(A002, "receipt_device_migration_complete", "DatabaseHelper", 1);
                C622033z.A02(A002, "status_list_ready", "DatabaseHelper", 1);
                C622033z.A01(A002, "message_streaming_sidecar_timestamp");
                C622033z.A02(A002, "media_message_ready", "DatabaseHelper", 2);
                C622033z.A02(A002, "media_message_fixer_ready", "DatabaseHelper", 3);
                C622033z.A02(A002, "new_pay_transaction_ready", "DatabaseHelper", 1);
                Log.i("DatabaseHelper/using migrated DB");
                Iterator A0q = AnonymousClass000.A0q(C38962Ad.A00);
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    C622033z.A02(A002, C18310x6.A0q(A0w), "DatabaseHelper", (long) AnonymousClass0x7.A05(A0w.getValue()));
                }
                C622033z.A02(A002, "participant_user_ready", "DatabaseHelper", 2);
                C622033z.A02(A002, "migration_completed", "DatabaseHelper", 1);
                C622033z.A02(A002, "write_to_old_schema_disabled", "DatabaseHelper", 1);
                C622033z.A02(A002, "drop_deprecated_tables_status", "DatabaseHelper", 1);
                A08(A002, r4);
                A05(A002, r4);
                A04(A002);
                A06(A002, r4);
                C622033z.A03(A002, "msgtore_db_schema_version", "Consumer-f393ea6dd3e32d7d27203def913af369", "DatabaseHelper");
                sQLiteDatabase2.setTransactionSuccessful();
                Iterator it = this.A08.iterator();
                while (it.hasNext()) {
                    AnonymousClass2R6 r22 = (AnonymousClass2R6) it.next();
                    C18270x1.A0l(C18300x5.A0A(r22.A04), "md_messaging_enabled", true);
                    C18270x1.A0l(C54412og.A00(r22.A00), "force_db_check", false);
                }
                sQLiteDatabase2.endTransaction();
                this.A00 = A002;
            } catch (Throwable th) {
                A002.A00.endTransaction();
                throw th;
            }
        }
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("msgstore/open; version=");
        C18260x0.A1F(A0o, sQLiteDatabase.getVersion());
        sQLiteDatabase.execSQL("PRAGMA synchronous=NORMAL;");
        try {
            rawQuery = sQLiteDatabase.rawQuery("PRAGMA secure_delete=1", (String[]) null);
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    C18260x0.A0w("msgstore/enable_secure_delete result: ", AnonymousClass001.A0o(), rawQuery.getInt(0));
                }
                rawQuery.close();
                return;
            }
            return;
        } catch (SQLiteDiskIOException e) {
            Log.e("msgstore/enable_secure_delete", e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("msgstore/upgrade version ");
        A0o.append(i);
        C18260x0.A0y(" to ", A0o, i2);
        onCreate(sQLiteDatabase);
    }
}
