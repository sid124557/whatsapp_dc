package X;

import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.1RE  reason: invalid class name */
public class AnonymousClass1RE extends C18630y0 {
    public final C60972zT A00;
    public final C45932ao A01;
    public final AnonymousClass3ZU A02;

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE syncd_mutations(_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, mutation_index TEXT UNIQUE NOT NULL, mutation_value BLOB, mutation_version INTEGER NOT NULL, collection_name TEXT NOT NULL, are_dependencies_missing BOOLEAN NOT NULL, mutation_mac BLOB, device_id INTEGER NOT NULL DEFAULT 0, epoch INTEGER NOT NULL DEFAULT 0, chat_jid TEXT, mutation_name TEXT )");
        sQLiteDatabase.execSQL("CREATE TABLE collection_versions (collection_name TEXT PRIMARY KEY, version INTEGER NOT NULL, lt_hash BLOB, dirty_version INTEGER NOT NULL DEFAULT -1 ) ");
        sQLiteDatabase.execSQL("CREATE TABLE pending_mutations(_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, mutation_index TEXT UNIQUE NOT NULL, mutation_value BLOB, mutation_version INTEGER NOT NULL, operation BLOB NOT NULL, is_ready_to_sync BOOLEAN NOT NULL DEFAULT 1, collection_name TEXT, device_id INTEGER, epoch INTEGER, are_dependencies_missing BOOLEAN NOT NULL DEFAULT 0, mutation_name TEXT NOT NULL DEFAULT '', chat_jid TEXT )");
        sQLiteDatabase.execSQL("CREATE TABLE peer_messages(_id INTEGER PRIMARY KEY AUTOINCREMENT,message_type INTEGER NOT NULL, key_remote_jid TEXT NOT NULL, key_from_me INTEGER, key_id TEXT NOT NULL, device_id TEXT, timestamp INTEGER, data TEXT, acked BOOLEAN )");
        sQLiteDatabase.execSQL("CREATE TABLE msg_history_sync(_id INTEGER PRIMARY KEY AUTOINCREMENT, device_id TEXT NOT NULL, sync_type INTEGER NOT NULL, last_processed_msg_row_id INTEGER, oldest_msg_row_id INTEGER, sent_msgs_count INTEGER, chunk_order INTEGER, sent_bytes INTEGER, last_chunk_timestamp INTEGER, status INTEGER, peer_msg_row_id INTEGER, oldest_message_to_sync_row_id INTEGER, session_id TEXT, md_reg_attempt_id TEXT, size_limit_bytes INTEGER )");
        sQLiteDatabase.execSQL("CREATE TABLE crypto_info (device_id INTEGER NOT NULL, epoch INTEGER NOT NULL, key_data BLOB NOT NULL, timestamp INTEGER NOT NULL, fingerprint BLOB NOT NULL, stale_timestamp INTEGER NOT NULL DEFAULT 0, PRIMARY KEY ( device_id , epoch ) )");
        sQLiteDatabase.execSQL("CREATE TABLE missing_keys (device_id INTEGER NOT NULL, epoch INTEGER NOT NULL, collection_name TEXT NOT NULL, PRIMARY KEY ( device_id , epoch , collection_name ) )");
        sQLiteDatabase.execSQL("CREATE TRIGGER crypto_info_bi_for_missing_keys_trigger AFTER INSERT ON crypto_info BEGIN DELETE FROM missing_keys WHERE device_id=new.device_id AND epoch=new.epoch; END");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_index ON syncd_mutations (are_dependencies_missing)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_chat_jid_index ON syncd_mutations (chat_jid, are_dependencies_missing)");
        sQLiteDatabase.execSQL("CREATE TABLE history_sync_companion (message_id TEXT PRIMARY KEY NOT NULL, sync_type INTEGER NOT NULL, chunk_order INTEGER NOT NULL, media_key BLOB, media_hash TEXT NOT NULL, media_enc_hash TEXT NOT NULL, file_size INTEGER NOT NULL, direct_path TEXT NOT NULL, local_path TEXT, start_time INTEGER, inline_payload BLOB )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS history_sync_companion_index ON history_sync_companion (sync_type,chunk_order)");
        sQLiteDatabase.execSQL("CREATE TABLE rmr_response_error (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, file_key TEXT NOT NULL, rmr_source INTEGER NOT NULL, failure_count INTEGER NOT NULL, response_device_id INTEGER NOT NULL, last_fetch_timestamp INTEGER NOT NULL  ) ");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source ON rmr_response_error (file_key, rmr_source)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source_device_id ON rmr_response_error (file_key, rmr_source, response_device_id)");
    }

    public AnonymousClass1RE(C55682qk r4, C54292oU r5, C60972zT r6, C45932ao r7, C183538qC r8) {
        super(r5.A00, r4, "sync.db", 48);
        this.A01 = r7;
        this.A00 = r6;
        this.A02 = new AnonymousClass3ZU(r8);
    }

    public C56862sg A0F() {
        String databaseName = getDatabaseName();
        return C626135u.A00(super.A0A(), this.A00, this.A01, databaseName);
    }

    public void A0G(SQLiteDatabase sQLiteDatabase) {
        Log.i("sync-db-helper/reset");
        C626235v.A01(sQLiteDatabase, "syncd_mutations");
        C626235v.A01(sQLiteDatabase, "collection_versions");
        C626235v.A01(sQLiteDatabase, "pending_mutations");
        C626235v.A01(sQLiteDatabase, "peer_messages");
        C626235v.A01(sQLiteDatabase, "msg_history_sync");
        C626235v.A01(sQLiteDatabase, "crypto_info");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS peer_messages_bi_for_fanout_backfill_messages_trigger");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS peer_messages_message_key_index");
        C626235v.A01(sQLiteDatabase, "fanout_backfill_messages");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS crypto_info_bi_for_missing_keys_trigger");
        C626235v.A01(sQLiteDatabase, "missing_keys");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS syncd_mutations_active_mutations_index");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS syncd_mutations_active_mutations_chat_jid_index");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS history_sync_companion_index");
        C626235v.A01(sQLiteDatabase, "history_sync_companion");
        C626235v.A01(sQLiteDatabase, "rmr_response_error");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS rmr_response_error_file_key_rmr_source");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS rmr_response_error_file_key_rmr_source_device_id");
        onCreate(sQLiteDatabase);
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            Log.i("sync-db-observer/onDbReset");
            ((C41472Kj) it.next()).A01.A04(5);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("sync-db-helper/onDowngrade oldVersion:");
        A0o.append(i);
        C18260x0.A0y(", newVersion:", A0o, i2);
        A0G(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0078, code lost:
        r5.execSQL("DROP TRIGGER IF EXISTS peer_messages_bi_for_fanout_backfill_messages_trigger");
        r5.execSQL("DROP INDEX IF EXISTS peer_messages_message_key_index");
        X.C626235v.A01(r5, "fanout_backfill_messages");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0087, code lost:
        r5.execSQL("ALTER TABLE collection_versions ADD lt_hash BLOB");
        r5.execSQL("ALTER TABLE syncd_mutations ADD mutation_mac BLOB");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0091, code lost:
        r5.execSQL("ALTER TABLE msg_history_sync ADD oldest_message_to_sync_row_id INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0096, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD is_ready_to_sync BOOLEAN NOT NULL DEFAULT 1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009b, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD collection_name TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a0, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD device_id INTEGER");
        r5.execSQL("ALTER TABLE pending_mutations ADD epoch INTEGER");
        r5.execSQL("ALTER TABLE syncd_mutations ADD device_id INTEGER NOT NULL DEFAULT 0");
        r5.execSQL("ALTER TABLE syncd_mutations ADD epoch INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b4, code lost:
        r5.execSQL("ALTER TABLE crypto_info ADD stale_timestamp INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b9, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD are_dependencies_missing BOOLEAN NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00be, code lost:
        r5.execSQL("ALTER TABLE syncd_mutations ADD chat_jid TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c3, code lost:
        r5.execSQL("CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_index ON syncd_mutations (are_dependencies_missing)");
        r5.execSQL("CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_chat_jid_index ON syncd_mutations (chat_jid, are_dependencies_missing)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00cd, code lost:
        r5.execSQL("ALTER TABLE collection_versions ADD dirty_version INTEGER NOT NULL DEFAULT -1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d2, code lost:
        r5.execSQL("ALTER TABLE peer_messages ADD acked BOOLEAN ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d7, code lost:
        X.C626235v.A01(r5, "encrypted_mutations");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00dc, code lost:
        r5.execSQL("ALTER TABLE syncd_mutations ADD mutation_name TEXT");
        r5.execSQL("ALTER TABLE pending_mutations ADD mutation_name TEXT NOT NULL DEFAULT ''");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e6, code lost:
        r5.execSQL("ALTER TABLE msg_history_sync ADD session_id TEXT");
        r5.execSQL("ALTER TABLE msg_history_sync ADD md_reg_attempt_id TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f0, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD chat_jid TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f5, code lost:
        r5.execSQL("CREATE TABLE history_sync_companion (message_id TEXT PRIMARY KEY NOT NULL, sync_type INTEGER NOT NULL, chunk_order INTEGER NOT NULL, media_key BLOB, media_hash TEXT NOT NULL, media_enc_hash TEXT NOT NULL, file_size INTEGER NOT NULL, direct_path TEXT NOT NULL, local_path TEXT, start_time INTEGER, inline_payload BLOB )");
        r5.execSQL("CREATE INDEX IF NOT EXISTS history_sync_companion_index ON history_sync_companion (sync_type,chunk_order)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ff, code lost:
        r5.execSQL("CREATE TABLE rmr_response_error (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, file_key TEXT NOT NULL, rmr_source INTEGER NOT NULL, failure_count INTEGER NOT NULL, response_device_id INTEGER NOT NULL, last_fetch_timestamp INTEGER NOT NULL  ) ");
        r5.execSQL("CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source ON rmr_response_error (file_key, rmr_source)");
        r5.execSQL("CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source_device_id ON rmr_response_error (file_key, rmr_source, response_device_id)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x010e, code lost:
        r5.execSQL("ALTER TABLE msg_history_sync ADD size_limit_bytes INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0115, code lost:
        if (r6 < 44) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        r3 = r4.A02.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0032, code lost:
        if (r3.hasNext() == false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
        r2 = (X.C41472Kj) r3.next();
        r1 = X.AnonymousClass001.A0o();
        r1.append("sync-db-observer/onDbReset(");
        r1.append(r6);
        X.AnonymousClass001.A1M(r1);
        r1.append(r7);
        X.C18260x0.A1L(r1, ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0054, code lost:
        if (r6 >= 43) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0056, code lost:
        if (43 > r7) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0058, code lost:
        r2.A00.A02(new com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r5, int r6, int r7) {
        /*
            r4 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sync-db-helper/onUpgrade oldVersion:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r2 = ", newVersion:"
            X.C18260x0.A0y(r2, r1, r7)
            switch(r6) {
                case 23: goto L_0x0063;
                case 24: goto L_0x0078;
                case 25: goto L_0x0087;
                case 26: goto L_0x0091;
                case 27: goto L_0x0096;
                case 28: goto L_0x009b;
                case 29: goto L_0x00a0;
                case 30: goto L_0x00b4;
                case 31: goto L_0x00b9;
                case 32: goto L_0x00be;
                case 33: goto L_0x00c3;
                case 34: goto L_0x00cd;
                case 35: goto L_0x00d2;
                case 36: goto L_0x00d7;
                case 37: goto L_0x00dc;
                case 38: goto L_0x00e6;
                case 39: goto L_0x00e6;
                case 40: goto L_0x00e6;
                case 41: goto L_0x00f0;
                case 42: goto L_0x00f5;
                case 43: goto L_0x00f5;
                case 44: goto L_0x00ff;
                case 45: goto L_0x00ff;
                case 46: goto L_0x010e;
                case 47: goto L_0x0117;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sync-db-helper/onUpgrade unknown oldVersion:"
            r1.append(r0)
            r1.append(r6)
            X.C18260x0.A0x(r2, r1, r7)
            r4.A0G(r5)
        L_0x0028:
            X.3ZU r0 = r4.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x002e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x011e
            java.lang.Object r2 = r3.next()
            X.2Kj r2 = (X.C41472Kj) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sync-db-observer/onDbReset("
            r1.append(r0)
            r1.append(r6)
            X.AnonymousClass001.A1M(r1)
            r1.append(r7)
            java.lang.String r0 = ")"
            X.C18260x0.A1L(r1, r0)
            r0 = 43
            if (r6 >= r0) goto L_0x002e
            if (r0 > r7) goto L_0x002e
            X.2gy r1 = r2.A00
            com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob r0 = new com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob
            r0.<init>()
            r1.A02(r0)
            goto L_0x002e
        L_0x0063:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS crypto_info_bi_for_missing_keys_trigger"
            r5.execSQL(r0)
            java.lang.String r0 = "missing_keys"
            X.C626235v.A01(r5, r0)
            java.lang.String r0 = "CREATE TABLE missing_keys (device_id INTEGER NOT NULL, epoch INTEGER NOT NULL, collection_name TEXT NOT NULL, PRIMARY KEY ( device_id , epoch , collection_name ) )"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE TRIGGER crypto_info_bi_for_missing_keys_trigger AFTER INSERT ON crypto_info BEGIN DELETE FROM missing_keys WHERE device_id=new.device_id AND epoch=new.epoch; END"
            r5.execSQL(r0)
        L_0x0078:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS peer_messages_bi_for_fanout_backfill_messages_trigger"
            r5.execSQL(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS peer_messages_message_key_index"
            r5.execSQL(r0)
            java.lang.String r0 = "fanout_backfill_messages"
            X.C626235v.A01(r5, r0)
        L_0x0087:
            java.lang.String r0 = "ALTER TABLE collection_versions ADD lt_hash BLOB"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD mutation_mac BLOB"
            r5.execSQL(r0)
        L_0x0091:
            java.lang.String r0 = "ALTER TABLE msg_history_sync ADD oldest_message_to_sync_row_id INTEGER"
            r5.execSQL(r0)
        L_0x0096:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD is_ready_to_sync BOOLEAN NOT NULL DEFAULT 1"
            r5.execSQL(r0)
        L_0x009b:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD collection_name TEXT"
            r5.execSQL(r0)
        L_0x00a0:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD device_id INTEGER"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD epoch INTEGER"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD device_id INTEGER NOT NULL DEFAULT 0"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD epoch INTEGER NOT NULL DEFAULT 0"
            r5.execSQL(r0)
        L_0x00b4:
            java.lang.String r0 = "ALTER TABLE crypto_info ADD stale_timestamp INTEGER NOT NULL DEFAULT 0"
            r5.execSQL(r0)
        L_0x00b9:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD are_dependencies_missing BOOLEAN NOT NULL DEFAULT 0"
            r5.execSQL(r0)
        L_0x00be:
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD chat_jid TEXT"
            r5.execSQL(r0)
        L_0x00c3:
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_index ON syncd_mutations (are_dependencies_missing)"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_chat_jid_index ON syncd_mutations (chat_jid, are_dependencies_missing)"
            r5.execSQL(r0)
        L_0x00cd:
            java.lang.String r0 = "ALTER TABLE collection_versions ADD dirty_version INTEGER NOT NULL DEFAULT -1"
            r5.execSQL(r0)
        L_0x00d2:
            java.lang.String r0 = "ALTER TABLE peer_messages ADD acked BOOLEAN "
            r5.execSQL(r0)
        L_0x00d7:
            java.lang.String r0 = "encrypted_mutations"
            X.C626235v.A01(r5, r0)
        L_0x00dc:
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD mutation_name TEXT"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD mutation_name TEXT NOT NULL DEFAULT ''"
            r5.execSQL(r0)
        L_0x00e6:
            java.lang.String r0 = "ALTER TABLE msg_history_sync ADD session_id TEXT"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE msg_history_sync ADD md_reg_attempt_id TEXT"
            r5.execSQL(r0)
        L_0x00f0:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD chat_jid TEXT"
            r5.execSQL(r0)
        L_0x00f5:
            java.lang.String r0 = "CREATE TABLE history_sync_companion (message_id TEXT PRIMARY KEY NOT NULL, sync_type INTEGER NOT NULL, chunk_order INTEGER NOT NULL, media_key BLOB, media_hash TEXT NOT NULL, media_enc_hash TEXT NOT NULL, file_size INTEGER NOT NULL, direct_path TEXT NOT NULL, local_path TEXT, start_time INTEGER, inline_payload BLOB )"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS history_sync_companion_index ON history_sync_companion (sync_type,chunk_order)"
            r5.execSQL(r0)
        L_0x00ff:
            java.lang.String r0 = "CREATE TABLE rmr_response_error (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, file_key TEXT NOT NULL, rmr_source INTEGER NOT NULL, failure_count INTEGER NOT NULL, response_device_id INTEGER NOT NULL, last_fetch_timestamp INTEGER NOT NULL  ) "
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source ON rmr_response_error (file_key, rmr_source)"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source_device_id ON rmr_response_error (file_key, rmr_source, response_device_id)"
            r5.execSQL(r0)
        L_0x010e:
            java.lang.String r0 = "ALTER TABLE msg_history_sync ADD size_limit_bytes INTEGER"
            r5.execSQL(r0)
            r0 = 44
            if (r6 < r0) goto L_0x0028
        L_0x0117:
            java.lang.String r0 = "ALTER TABLE history_sync_companion ADD inline_payload BLOB"
            r5.execSQL(r0)
            goto L_0x0028
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RE.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
