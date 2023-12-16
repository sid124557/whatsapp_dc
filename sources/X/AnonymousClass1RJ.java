package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Iterator;

/* renamed from: X.1RJ  reason: invalid class name */
public class AnonymousClass1RJ extends C18630y0 {
    public C40332Fk A00;
    public final C56612sH A01;
    public final C60972zT A02;
    public final C45932ao A03;
    public final boolean A04 = true;

    public AnonymousClass1RJ(C55682qk r5, C56612sH r6, C54292oU r7, C60972zT r8, C45932ao r9) {
        super(r7.A00, r5, "axolotl.db", 16);
        this.A01 = r6;
        this.A03 = r9;
        this.A02 = r8;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C40332Fk r0;
        Log.i("creating axolotl database version 16");
        sQLiteDatabase.execSQL("CREATE TABLE identities (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, recipient_type INTEGER NOT NULL DEFAULT 0, device_id INTEGER, registration_id INTEGER, public_key BLOB, private_key BLOB, next_prekey_id INTEGER, timestamp INTEGER, recipient_lid_identifier INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS identities_idx ON identities (recipient_id, recipient_type, device_id)");
        sQLiteDatabase.execSQL("CREATE TABLE prekeys (_id INTEGER PRIMARY KEY AUTOINCREMENT, prekey_id INTEGER UNIQUE, sent_to_server BOOLEAN, record BLOB, direct_distribution BOOLEAN, upload_timestamp INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE prekey_uploads (_id INTEGER PRIMARY KEY AUTOINCREMENT, upload_timestamp INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE sessions (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, recipient_type INTEGER NOT NULL DEFAULT 0, device_id INTEGER, record BLOB, timestamp INTEGER, recipient_lid_identifier INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sessions_idx ON sessions (recipient_id, recipient_type, device_id )");
        sQLiteDatabase.execSQL("CREATE TABLE signed_prekeys (_id INTEGER PRIMARY KEY AUTOINCREMENT, prekey_id INTEGER UNIQUE, timestamp INTEGER, record BLOB)");
        sQLiteDatabase.execSQL("CREATE TABLE message_base_key (_id INTEGER PRIMARY KEY AUTOINCREMENT, msg_key_remote_jid TEXT NOT NULL, msg_key_from_me BOOLEAN NOT NULL, msg_key_id TEXT NOT NULL, recipient_id INTEGER, recipient_type INTEGER NOT NULL DEFAULT 0, device_id INTEGER NOT NULL DEFAULT 0, last_alice_base_key BLOB NOT NULL, timestamp INTEGER, recipient_lid_identifier INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id, recipient_id, recipient_type, device_id)");
        sQLiteDatabase.execSQL("CREATE TABLE sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id INTEGER NOT NULL, sender_type INTEGER NOT NULL DEFAULT 0, device_id INTEGER NOT NULL DEFAULT 0, record BLOB NOT NULL, timestamp INTEGER, sender_lid_identifier INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id, sender_type, device_id)");
        sQLiteDatabase.execSQL("CREATE TABLE fast_ratchet_sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id  INTEGER NOT NULL, sender_type INTEGER NOT NULL DEFAULT 0, device_id INTEGER NOT NULL DEFAULT 0, record BLOB NOT NULL, sender_lid_identifier INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id, sender_type, device_id)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS decryption_journal (msg_key_id TEXT NOT NULL, sender_id TEXT NOT NULL, device_id TEXT NOT NULL, plain_text BLOB NOT NULL, receive_timestamp INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS decryption_journal_idx ON decryption_journal(msg_key_id, sender_id, device_id)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS\n            preacks (\n              _id INTEGER PRIMARY KEY AUTOINCREMENT,\n              ptn BLOB NOT NULL\n            )\n        ");
        Log.i("created axolotl database version 16");
        if (this.A04 && (r0 = this.A00) != null) {
            C621133n r3 = r0.A00;
            long A002 = C56612sH.A00(r3.A0D);
            AnonymousClass2KI A003 = AnonymousClass36G.A00();
            AnonymousClass2KK r1 = new AnonymousClass2KK(A003.A00, new C47932e4(A003.A01));
            C55372qF r10 = r3.A07;
            byte[] A004 = r1.A01.A00.A00();
            C48462ew r2 = r1.A00;
            byte[] bArr = r2.A01;
            try {
                int nextInt = SecureRandom.getInstance("SHA1PRNG").nextInt(2147483646) + 1;
                ContentValues A06 = AnonymousClass0x9.A06();
                Integer A0f = AnonymousClass0x7.A0f();
                A06.put("recipient_id", A0f);
                Integer A0Z = C18290x4.A0Z();
                A06.put("recipient_type", A0Z);
                A06.put("device_id", A0Z);
                C18270x1.A0b(A06, "registration_id", nextInt);
                A06.put("public_key", A004);
                A06.put("private_key", bArr);
                try {
                    A06.put("next_prekey_id", Integer.valueOf(SecureRandom.getInstance("SHA1PRNG").nextInt(16777214) + 1));
                    Long valueOf = Long.valueOf(A002);
                    A06.put("timestamp", valueOf);
                    if (r10.A03.A03.A0Y(C58422vE.A02, 6542)) {
                        A06.put("recipient_lid_identifier", A0f);
                    }
                    sQLiteDatabase.insertOrThrow("identities", (String) null, A06);
                    Log.i("axolotl inserted identity key pair");
                    r10.A01 = new AnonymousClass2JN(A004, bArr);
                    r10.A00 = nextInt;
                    C625535n r8 = r3.A00;
                    try {
                        AnonymousClass2KI A005 = AnonymousClass36G.A00();
                        C51502jv r12 = A005.A01;
                        byte[] A09 = AnonymousClass36G.A09(r2, r12.A00());
                        AnonymousClass1A2 r22 = (AnonymousClass1A2) AnonymousClass1DQ.DEFAULT_INSTANCE.A0G();
                        r22.A09(0);
                        byte[] A006 = r12.A00();
                        r22.A0C(C172548Lq.A02(A006, 0, A006.length));
                        byte[] bArr2 = A005.A00.A01;
                        r22.A0B(C172548Lq.A02(bArr2, 0, bArr2.length));
                        r22.A0D(C172548Lq.A02(A09, 0, A09.length));
                        r22.A0A(r8.A03.A0H());
                        byte[] A1Z = C18290x4.A1Z(r22);
                        ContentValues A062 = AnonymousClass0x9.A06();
                        A062.put("prekey_id", A0Z);
                        A062.put("timestamp", valueOf);
                        A062.put("record", A1Z);
                        sQLiteDatabase.insertOrThrow("signed_prekeys", (String) null, A062);
                        Log.i("axolotl inserted signed prekey");
                        C48972fm r23 = r3.A0J;
                        r23.A00.submit(C69983Zk.A00(r3, 9));
                        r3.A0F.A21(true);
                        Iterator A032 = C61102zi.A03(r3.A0I);
                        if (A032.hasNext()) {
                            A032.next();
                            throw AnonymousClass001.A0g("onSignalStoreCreated");
                        }
                    } catch (AnonymousClass23X e) {
                        throw C18330xA.A09(e);
                    }
                } catch (NoSuchAlgorithmException e2) {
                    throw AnonymousClass0x9.A0i(e2);
                }
            } catch (NoSuchAlgorithmException e3) {
                throw AnonymousClass0x9.A0i(e3);
            }
        }
    }

    public static final void A09(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ALTER TABLE ");
        A0o.append(str);
        A0o.append(" RENAME TO old_");
        A0o.append(str);
        sQLiteDatabase.execSQL(AnonymousClass000.A0X(";", A0o));
        sQLiteDatabase.execSQL(str2);
        String join = TextUtils.join(", ", strArr);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("INSERT INTO ");
        A0o2.append(str);
        A0o2.append(" (");
        A0o2.append(join);
        A0o2.append(") SELECT ");
        A0o2.append(join);
        sQLiteDatabase.execSQL(AnonymousClass000.A0V(" FROM old_", str, A0o2));
        C626235v.A01(sQLiteDatabase, AnonymousClass000.A0V("old_", str, AnonymousClass001.A0o()));
    }

    public C56862sg A0F() {
        try {
            String databaseName = getDatabaseName();
            return C626135u.A00(super.A0A(), this.A02, this.A03, databaseName);
        } catch (SQLiteException e) {
            Log.e("failed to open axolotl store", e);
            C40332Fk r0 = this.A00;
            if (r0 != null) {
                r0.A00.A0I();
            }
            String databaseName2 = getDatabaseName();
            return C626135u.A00(super.A0A(), this.A02, this.A03, databaseName2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0069, code lost:
        X.C626235v.A01(r11, "fast_ratchet_sender_keys");
        r11.execSQL("CREATE TABLE fast_ratchet_sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id INTEGER NOT NULL, record BLOB NOT NULL)");
        r11.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0078, code lost:
        r11.execSQL("ALTER TABLE sender_keys ADD COLUMN timestamp INTEGER");
        r4 = X.AnonymousClass0x9.A06();
        X.C18270x1.A0c(r4, "timestamp", r0);
        r11.update("sender_keys", r4, (java.lang.String) null, (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008e, code lost:
        r11.execSQL("ALTER TABLE prekeys ADD COLUMN direct_distribution BOOLEAN");
        r4 = X.AnonymousClass0x9.A06();
        r4.put("direct_distribution", java.lang.Boolean.FALSE);
        r11.update("prekeys", r4, (java.lang.String) null, (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a5, code lost:
        r11.execSQL("ALTER TABLE prekeys ADD COLUMN upload_timestamp INTEGER");
        r5 = X.AnonymousClass0x9.A06();
        r4 = java.lang.Long.valueOf(r0);
        r5.put("upload_timestamp", r4);
        r11.update("prekeys", r5, "sent_to_server != 0", (java.lang.String[]) null);
        r11.execSQL("CREATE TABLE prekey_uploads (_id INTEGER PRIMARY KEY AUTOINCREMENT, upload_timestamp INTEGER)");
        r1 = X.AnonymousClass0x9.A06();
        r1.put("upload_timestamp", r4);
        r11.insert("prekey_uploads", (java.lang.String) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00d4, code lost:
        A09(r11, "identities", "CREATE TABLE identities (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, device_id INTEGER, registration_id INTEGER, public_key BLOB, private_key BLOB, next_prekey_id INTEGER, timestamp INTEGER)", new java.lang.String[]{"recipient_id", "registration_id", "public_key", "private_key", "next_prekey_id", "timestamp"});
        r11.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS identities_idx ON identities (recipient_id, device_id)");
        r1 = X.C18300x5.A0p("identities");
        X.C18300x5.A1O(r1, "device_id");
        r11.execSQL(X.AnonymousClass000.A0h(r1, 0));
        A09(r11, "sessions", "CREATE TABLE sessions (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, device_id INTEGER, record BLOB, timestamp INTEGER)", new java.lang.String[]{"recipient_id", "record", "timestamp"});
        r11.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sessions_idx ON sessions (recipient_id, device_id)");
        r1 = X.C18300x5.A0p("sessions");
        X.C18300x5.A1O(r1, "device_id");
        r11.execSQL(X.AnonymousClass000.A0h(r1, 0));
        r11.execSQL("ALTER TABLE sender_keys ADD COLUMN device_id INTEGER NOT NULL DEFAULT 0");
        r11.execSQL("DROP INDEX IF EXISTS sender_keys_idx");
        r11.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id, device_id)");
        r11.execSQL("ALTER TABLE fast_ratchet_sender_keys ADD COLUMN device_id INTEGER NOT NULL DEFAULT 0");
        r11.execSQL("DROP INDEX IF EXISTS fast_ratchet_sender_keys_idx");
        r11.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id, device_id)");
        r11.execSQL("ALTER TABLE message_base_key ADD COLUMN recipient_id INTEGER ");
        r11.execSQL("ALTER TABLE message_base_key ADD COLUMN device_id INTEGER NOT NULL DEFAULT 0");
        r11.execSQL("DELETE FROM message_base_key WHERE msg_key_remote_jid NOT GLOB '[0-9]*@s.whatsapp.net'");
        r11.execSQL("UPDATE message_base_key SET recipient_id = CAST(REPLACE(msg_key_remote_jid, '@s.whatsapp.net', '') AS INTEGER)");
        r11.execSQL("DROP INDEX IF EXISTS message_base_key_idx");
        r11.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id, recipient_id, device_id)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0166, code lost:
        r11.execSQL("ALTER TABLE identities ADD COLUMN recipient_type INTEGER NOT NULL DEFAULT 0");
        r11.execSQL("DROP INDEX IF EXISTS identities_idx");
        r11.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS identities_idx ON identities (recipient_id, recipient_type, device_id)");
        r11.execSQL("ALTER TABLE sessions ADD COLUMN recipient_type INTEGER NOT NULL DEFAULT 0");
        r11.execSQL("DROP INDEX IF EXISTS sessions_idx");
        r11.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sessions_idx ON sessions (recipient_id, recipient_type, device_id )");
        r11.execSQL("ALTER TABLE message_base_key ADD COLUMN recipient_type INTEGER NOT NULL DEFAULT 0");
        r11.execSQL("DROP INDEX IF EXISTS message_base_key_idx");
        r11.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id, recipient_id, recipient_type, device_id)");
        r11.execSQL("ALTER TABLE sender_keys ADD COLUMN sender_type INTEGER NOT NULL DEFAULT 0");
        r11.execSQL("DROP INDEX IF EXISTS sender_keys_idx");
        r11.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id, sender_type, device_id)");
        r11.execSQL("ALTER TABLE fast_ratchet_sender_keys ADD COLUMN sender_type INTEGER NOT NULL DEFAULT 0");
        r11.execSQL("DROP INDEX IF EXISTS fast_ratchet_sender_keys_idx");
        r11.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id, sender_type, device_id)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x01b1, code lost:
        r11.execSQL("CREATE TABLE IF NOT EXISTS decryption_journal (msg_key_id TEXT NOT NULL, sender_id TEXT NOT NULL, device_id TEXT NOT NULL, plain_text BLOB NOT NULL, receive_timestamp INTEGER NOT NULL)");
        r11.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS decryption_journal_idx ON decryption_journal(msg_key_id, sender_id, device_id)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x01bb, code lost:
        r11.execSQL("CREATE TABLE IF NOT EXISTS\n            preacks (\n              _id INTEGER PRIMARY KEY AUTOINCREMENT,\n              ptn BLOB NOT NULL\n            )\n        ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x01c0, code lost:
        r11.execSQL("ALTER TABLE fast_ratchet_sender_keys ADD COLUMN sender_lid_identifier INTEGER");
        r11.execSQL("ALTER TABLE identities ADD COLUMN recipient_lid_identifier INTEGER");
        r11.execSQL("ALTER TABLE message_base_key ADD COLUMN recipient_lid_identifier INTEGER");
        r11.execSQL("ALTER TABLE sender_keys ADD COLUMN sender_lid_identifier INTEGER");
        r11.execSQL("ALTER TABLE sessions ADD COLUMN recipient_lid_identifier INTEGER");
        com.whatsapp.util.Log.i("axolotl upgraded successfully");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x01de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004a, code lost:
        r11.execSQL("CREATE TABLE message_base_key (_id INTEGER PRIMARY KEY AUTOINCREMENT, msg_key_remote_jid TEXT NOT NULL, msg_key_from_me BOOLEAN NOT NULL, msg_key_id TEXT NOT NULL, last_alice_base_key BLOB NOT NULL, timestamp INTEGER)");
        r11.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0054, code lost:
        X.C626235v.A01(r11, "sender_keys");
        r11.execSQL("CREATE TABLE sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id INTEGER NOT NULL, record BLOB NOT NULL)");
        r11.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0064, code lost:
        r11.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id)");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r11, int r12, int r13) {
        /*
            r10 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "axolotl upgrading db from "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r2 = " to "
            X.C18260x0.A0y(r2, r1, r13)
            r0 = 16
            if (r13 != r0) goto L_0x01df
            X.2sH r0 = r10.A01
            long r0 = X.C56612sH.A00(r0)
            switch(r12) {
                case 1: goto L_0x0034;
                case 2: goto L_0x004a;
                case 3: goto L_0x0054;
                case 4: goto L_0x0054;
                case 5: goto L_0x0064;
                case 6: goto L_0x0069;
                case 7: goto L_0x0078;
                case 8: goto L_0x008e;
                case 9: goto L_0x00a5;
                case 10: goto L_0x00d4;
                case 11: goto L_0x0166;
                case 12: goto L_0x01b1;
                case 13: goto L_0x01bb;
                case 14: goto L_0x01c0;
                case 15: goto L_0x01c0;
                default: goto L_0x001e;
            }
        L_0x001e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown upgrade from "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r1 = X.AnonymousClass000.A0Y(r2, r1, r13)
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        L_0x0034:
            java.lang.String r2 = "ALTER TABLE sessions ADD COLUMN timestamp INTEGER"
            r11.execSQL(r2)
            android.content.ContentValues r4 = X.AnonymousClass0x9.A06()
            java.lang.String r2 = "timestamp"
            X.C18270x1.A0c(r4, r2, r0)
            java.lang.String r3 = "sessions"
            r2 = 0
            r11.update(r3, r4, r2, r2)
        L_0x004a:
            java.lang.String r2 = "CREATE TABLE message_base_key (_id INTEGER PRIMARY KEY AUTOINCREMENT, msg_key_remote_jid TEXT NOT NULL, msg_key_from_me BOOLEAN NOT NULL, msg_key_id TEXT NOT NULL, last_alice_base_key BLOB NOT NULL, timestamp INTEGER)"
            r11.execSQL(r2)
            java.lang.String r2 = "CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id)"
            r11.execSQL(r2)
        L_0x0054:
            java.lang.String r2 = "sender_keys"
            X.C626235v.A01(r11, r2)
            java.lang.String r2 = "CREATE TABLE sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id INTEGER NOT NULL, record BLOB NOT NULL)"
            r11.execSQL(r2)
            java.lang.String r2 = "CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id)"
            r11.execSQL(r2)
        L_0x0064:
            java.lang.String r2 = "CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id)"
            r11.execSQL(r2)
        L_0x0069:
            java.lang.String r2 = "fast_ratchet_sender_keys"
            X.C626235v.A01(r11, r2)
            java.lang.String r2 = "CREATE TABLE fast_ratchet_sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id INTEGER NOT NULL, record BLOB NOT NULL)"
            r11.execSQL(r2)
            java.lang.String r2 = "CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id)"
            r11.execSQL(r2)
        L_0x0078:
            java.lang.String r2 = "ALTER TABLE sender_keys ADD COLUMN timestamp INTEGER"
            r11.execSQL(r2)
            android.content.ContentValues r4 = X.AnonymousClass0x9.A06()
            java.lang.String r2 = "timestamp"
            X.C18270x1.A0c(r4, r2, r0)
            java.lang.String r3 = "sender_keys"
            r2 = 0
            r11.update(r3, r4, r2, r2)
        L_0x008e:
            java.lang.String r2 = "ALTER TABLE prekeys ADD COLUMN direct_distribution BOOLEAN"
            r11.execSQL(r2)
            android.content.ContentValues r4 = X.AnonymousClass0x9.A06()
            java.lang.String r3 = "direct_distribution"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r4.put(r3, r2)
            java.lang.String r3 = "prekeys"
            r2 = 0
            r11.update(r3, r4, r2, r2)
        L_0x00a5:
            java.lang.String r2 = "ALTER TABLE prekeys ADD COLUMN upload_timestamp INTEGER"
            r11.execSQL(r2)
            android.content.ContentValues r5 = X.AnonymousClass0x9.A06()
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            java.lang.String r3 = "upload_timestamp"
            r5.put(r3, r4)
            java.lang.String r1 = "prekeys"
            java.lang.String r0 = "sent_to_server != 0"
            r2 = 0
            r11.update(r1, r5, r0, r2)
            java.lang.String r0 = "CREATE TABLE prekey_uploads (_id INTEGER PRIMARY KEY AUTOINCREMENT, upload_timestamp INTEGER)"
            r11.execSQL(r0)
            android.content.ContentValues r1 = X.AnonymousClass0x9.A06()
            r1.put(r3, r4)
            java.lang.String r0 = "prekey_uploads"
            r11.insert(r0, r2, r1)
        L_0x00d4:
            java.lang.String r4 = "recipient_id"
            java.lang.String r5 = "registration_id"
            java.lang.String r6 = "public_key"
            java.lang.String r7 = "private_key"
            java.lang.String r8 = "next_prekey_id"
            java.lang.String r9 = "timestamp"
            java.lang.String[] r2 = new java.lang.String[]{r4, r5, r6, r7, r8, r9}
            java.lang.String r1 = "identities"
            java.lang.String r0 = "CREATE TABLE identities (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, device_id INTEGER, registration_id INTEGER, public_key BLOB, private_key BLOB, next_prekey_id INTEGER, timestamp INTEGER)"
            A09(r11, r1, r0, r2)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS identities_idx ON identities (recipient_id, device_id)"
            r11.execSQL(r0)
            java.lang.String r3 = "device_id"
            java.lang.StringBuilder r1 = X.C18300x5.A0p(r1)
            X.C18300x5.A1O(r1, r3)
            r0 = 0
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            r11.execSQL(r0)
            java.lang.String r0 = "record"
            java.lang.String[] r2 = new java.lang.String[]{r4, r0, r9}
            java.lang.String r1 = "sessions"
            java.lang.String r0 = "CREATE TABLE sessions (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, device_id INTEGER, record BLOB, timestamp INTEGER)"
            A09(r11, r1, r0, r2)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS sessions_idx ON sessions (recipient_id, device_id)"
            r11.execSQL(r0)
            java.lang.StringBuilder r1 = X.C18300x5.A0p(r1)
            X.C18300x5.A1O(r1, r3)
            r0 = 0
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            r11.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE sender_keys ADD COLUMN device_id INTEGER NOT NULL DEFAULT 0"
            r11.execSQL(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS sender_keys_idx"
            r11.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id, device_id)"
            r11.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE fast_ratchet_sender_keys ADD COLUMN device_id INTEGER NOT NULL DEFAULT 0"
            r11.execSQL(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS fast_ratchet_sender_keys_idx"
            r11.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id, device_id)"
            r11.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE message_base_key ADD COLUMN recipient_id INTEGER "
            r11.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE message_base_key ADD COLUMN device_id INTEGER NOT NULL DEFAULT 0"
            r11.execSQL(r0)
            java.lang.String r0 = "DELETE FROM message_base_key WHERE msg_key_remote_jid NOT GLOB '[0-9]*@s.whatsapp.net'"
            r11.execSQL(r0)
            java.lang.String r0 = "UPDATE message_base_key SET recipient_id = CAST(REPLACE(msg_key_remote_jid, '@s.whatsapp.net', '') AS INTEGER)"
            r11.execSQL(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS message_base_key_idx"
            r11.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id, recipient_id, device_id)"
            r11.execSQL(r0)
        L_0x0166:
            java.lang.String r0 = "ALTER TABLE identities ADD COLUMN recipient_type INTEGER NOT NULL DEFAULT 0"
            r11.execSQL(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS identities_idx"
            r11.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS identities_idx ON identities (recipient_id, recipient_type, device_id)"
            r11.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE sessions ADD COLUMN recipient_type INTEGER NOT NULL DEFAULT 0"
            r11.execSQL(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS sessions_idx"
            r11.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS sessions_idx ON sessions (recipient_id, recipient_type, device_id )"
            r11.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE message_base_key ADD COLUMN recipient_type INTEGER NOT NULL DEFAULT 0"
            r11.execSQL(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS message_base_key_idx"
            r11.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id, recipient_id, recipient_type, device_id)"
            r11.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE sender_keys ADD COLUMN sender_type INTEGER NOT NULL DEFAULT 0"
            r11.execSQL(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS sender_keys_idx"
            r11.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id, sender_type, device_id)"
            r11.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE fast_ratchet_sender_keys ADD COLUMN sender_type INTEGER NOT NULL DEFAULT 0"
            r11.execSQL(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS fast_ratchet_sender_keys_idx"
            r11.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id, sender_type, device_id)"
            r11.execSQL(r0)
        L_0x01b1:
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS decryption_journal (msg_key_id TEXT NOT NULL, sender_id TEXT NOT NULL, device_id TEXT NOT NULL, plain_text BLOB NOT NULL, receive_timestamp INTEGER NOT NULL)"
            r11.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS decryption_journal_idx ON decryption_journal(msg_key_id, sender_id, device_id)"
            r11.execSQL(r0)
        L_0x01bb:
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS\n            preacks (\n              _id INTEGER PRIMARY KEY AUTOINCREMENT,\n              ptn BLOB NOT NULL\n            )\n        "
            r11.execSQL(r0)
        L_0x01c0:
            java.lang.String r0 = "ALTER TABLE fast_ratchet_sender_keys ADD COLUMN sender_lid_identifier INTEGER"
            r11.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE identities ADD COLUMN recipient_lid_identifier INTEGER"
            r11.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE message_base_key ADD COLUMN recipient_lid_identifier INTEGER"
            r11.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE sender_keys ADD COLUMN sender_lid_identifier INTEGER"
            r11.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE sessions ADD COLUMN recipient_lid_identifier INTEGER"
            r11.execSQL(r0)
            java.lang.String r0 = "axolotl upgraded successfully"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x01df:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown upgrade destination version: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " -> "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r13)
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RJ.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
