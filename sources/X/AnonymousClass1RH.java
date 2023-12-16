package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: X.1RH  reason: invalid class name */
public class AnonymousClass1RH extends C18630y0 {
    public final C55682qk A00;
    public final C60972zT A01;
    public final C45932ao A02;

    public static final void A09(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS sticker_is_avatar_index ON stickers (is_avatar)");
        } catch (SQLiteException e) {
            C626936e.A08("StickerDBHelper/addStickerIsAvatarColumnIndex", e);
        }
    }

    public final void A0G(SQLiteDatabase sQLiteDatabase) {
        C626235v.A01(sQLiteDatabase, "downloadable_sticker_packs");
        C626235v.A01(sQLiteDatabase, "stickers");
        C626235v.A01(sQLiteDatabase, "installed_sticker_packs");
        C626235v.A01(sQLiteDatabase, "starred_stickers");
        C626235v.A01(sQLiteDatabase, "sticker_pack_order");
        C626235v.A01(sQLiteDatabase, "recent_stickers");
        C626235v.A01(sQLiteDatabase, "unseen_sticker_packs");
        C626235v.A01(sQLiteDatabase, "third_party_whitelist_packs");
        C626235v.A01(sQLiteDatabase, "new_sticker_packs");
        C626235v.A01(sQLiteDatabase, "third_party_sticker_emoji_mapping");
        C626235v.A01(sQLiteDatabase, "avatar_sticker_search_dictionary");
        C626235v.A01(sQLiteDatabase, "sticker_md_upload");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE stickers (plain_file_hash TEXT NOT NULL, encrypted_file_hash TEXT, media_key TEXT, mime_type TEXT, height INTEGER NOT NULL, width INTEGER NOT NULL, sticker_pack_id TEXT, file_path TEXT, url TEXT, file_size INTEGER, direct_path TEXT, emojis TEXT, hash_of_image_part TEXT, is_avatar INTEGER NOT NULL DEFAULT 0, avatar_template_id TEXT, is_fun_sticker INTEGER, is_lottie INTEGER, PRIMARY KEY(plain_file_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, lottie_pack INTEGER, PRIMARY KEY(id))");
        sQLiteDatabase.execSQL("CREATE TABLE installed_sticker_packs (installed_id TEXT NOT NULL, installed_name TEXT, installed_publisher TEXT, installed_description TEXT, installed_size INTEGER NOT NULL, installed_image_data_hash TEXT NOT NULL, installed_tray_image_id TEXT NOT NULL, installed_tray_image_preview_id TEXT, installed_animated_pack INTEGER NOT NULL, installed_is_avatar_pack INTEGER NOT NULL DEFAULT 0, installed_empty_favorites_avatar_template_id TEXT, installed_empty_recents_avatar_template_id TEXT, installed_lottie_pack INTEGER, PRIMARY KEY(installed_id))");
        sQLiteDatabase.execSQL("CREATE TABLE starred_stickers (plaintext_hash TEXT  NOT NULL , timestamp LONG , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avatar INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , is_fun_sticker INTEGER  , is_lottie INTEGER  , PRIMARY KEY(plaintext_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE sticker_pack_order (sticker_pack_id TEXT PRIMARY KEY NOT NULL, pack_order INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE recent_stickers (plaintext_hash TEXT  NOT NULL , entry_weight FLOAT  NOT NULL , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avocado INTEGER  NOT NULL  DEFAULT 0 , last_sticker_sent_ts INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , is_fun_sticker INTEGER  , is_lottie INTEGER  , PRIMARY KEY(plaintext_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE unseen_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE third_party_whitelist_packs (authority TEXT NOT NULL, sticker_pack_id TEXT NOT NULL, sticker_pack_name TEXT, sticker_pack_publisher TEXT, sticker_pack_image_data_hash TEXT, avoid_cache INTEGER, is_animated_pack INTEGER, PRIMARY KEY (authority,sticker_pack_id))");
        sQLiteDatabase.execSQL("CREATE TABLE new_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE third_party_sticker_emoji_mapping (plaintext_hash TEXT  NOT NULL , authority TEXT  NOT NULL , sticker_pack_id TEXT  NOT NULL , emojis TEXT , hash_of_image_part TEXT , PRIMARY KEY(plaintext_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE avatar_sticker_search_dictionary (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, sticker_id TEXT NOT NULL, tag TEXT NOT NULL, weight INTEGER NOT NULL DEFAULT 0)");
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS sticker_avatar_template_id_index ON stickers (avatar_template_id)");
        } catch (SQLiteException e) {
            C626936e.A08("StickerDBHelper/addStickerIsAvatarColumnIndex", e);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS recent_sticker_is_avocado_index ON recent_stickers (is_avocado)");
        } catch (SQLiteException e2) {
            C626936e.A08("StickersDBHelper/addRecentStickerAvocadoColumnIndex", e2);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS recent_sticker_avatar_template_index ON recent_stickers (avatar_template_id)");
        } catch (SQLiteException e3) {
            C626936e.A08("StickersDBHelper/addRecentStickerAvocadoColumnIndex", e3);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS starred_sticker_is_avatar_index ON starred_stickers (is_avatar)");
        } catch (SQLiteException e4) {
            C626936e.A08("StickersDBHelper/addStarredStickerAvocadoColumnIndex", e4);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS starred_sticker_avatar_template_id_index ON starred_stickers (avatar_template_id)");
        } catch (SQLiteException e5) {
            C626936e.A08("StickersDBHelper/addRecentStickerAvocadoColumnIndex", e5);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS installed_sticker_packs_avatar_pack_index ON installed_sticker_packs (installed_is_avatar_pack)");
        } catch (SQLiteException e6) {
            C626936e.A08("StickerDBHelper/addInstalledIsAvatarStickerPackColumnIndex", e6);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS sticker_pack_id_index ON stickers (sticker_pack_id)");
        } catch (SQLiteException e7) {
            C626936e.A08("StickerDBHelper/addStickerPackIdIndex", e7);
        }
        A09(sQLiteDatabase);
        try {
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS avatar_sticker_search_index ON avatar_sticker_search_dictionary (tag, sticker_id)");
        } catch (SQLiteException e8) {
            C626936e.A08("StickerDBHelper/addAvatarStickerSearchIndex", e8);
        }
    }

    public AnonymousClass1RH(C55682qk r4, C54292oU r5, C60972zT r6, C45932ao r7) {
        super(r5.A00, r4, "stickers.db", 45);
        this.A00 = r4;
        this.A02 = r7;
        this.A01 = r6;
    }

    public C56862sg A0F() {
        String databaseName = getDatabaseName();
        return C626135u.A00(super.A0A(), this.A01, this.A02, databaseName);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StickerDBHelper/onDowngrade/oldVersion:");
        A0o.append(i);
        C18260x0.A0y(", newVersion:", A0o, i2);
        A0G(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03c5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03c6, code lost:
        if (r11 != null) goto L_0x03c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x03cb, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03cd, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03d0, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00b1, code lost:
        X.C626235v.A01(r7, "installed_sticker_packs");
        r7.execSQL("CREATE TABLE installed_sticker_packs (installed_id TEXT NOT NULL, installed_name TEXT, installed_publisher TEXT, installed_description TEXT, installed_size INTEGER NOT NULL, installed_image_data_hash TEXT NOT NULL, installed_tray_image_id TEXT NOT NULL, installed_tray_image_preview_id TEXT, installed_animated_pack INTEGER NOT NULL, installed_is_avatar_pack INTEGER NOT NULL DEFAULT 0, installed_empty_favorites_avatar_template_id TEXT, installed_empty_recents_avatar_template_id TEXT, installed_lottie_pack INTEGER, PRIMARY KEY(installed_id))");
        X.C626235v.A01(r7, "stickers");
        r7.execSQL("CREATE TABLE stickers (plain_file_hash TEXT NOT NULL, encrypted_file_hash TEXT, media_key TEXT, mime_type TEXT, height INTEGER NOT NULL, width INTEGER NOT NULL, sticker_pack_id TEXT, file_path TEXT, url TEXT, file_size INTEGER, direct_path TEXT, emojis TEXT, hash_of_image_part TEXT, is_avatar INTEGER NOT NULL DEFAULT 0, avatar_template_id TEXT, is_fun_sticker INTEGER, is_lottie INTEGER, PRIMARY KEY(plain_file_hash))");
        X.C626235v.A01(r7, "downloadable_sticker_packs");
        r7.execSQL("CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, lottie_pack INTEGER, PRIMARY KEY(id))");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00c7, code lost:
        X.AnonymousClass350.A02(r7, "third_party_whitelist_packs", "sticker_pack_name", "TEXT");
        X.AnonymousClass350.A02(r7, "third_party_whitelist_packs", "sticker_pack_publisher", "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00d3, code lost:
        X.C626235v.A01(r7, "new_sticker_packs");
        r7.execSQL("CREATE TABLE new_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00de, code lost:
        X.AnonymousClass350.A02(r7, "stickers", "direct_path", "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00e3, code lost:
        r9 = "hash_of_image_part";
        X.AnonymousClass350.A02(r7, "recent_stickers", r9, "TEXT");
        X.AnonymousClass350.A02(r7, "starred_stickers", r9, "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00eb, code lost:
        X.AnonymousClass350.A02(r7, "third_party_whitelist_packs", "sticker_pack_image_data_hash", "TEXT");
        X.AnonymousClass350.A02(r7, "third_party_whitelist_packs", "avoid_cache", "INTEGER");
        X.AnonymousClass350.A02(r7, "third_party_whitelist_packs", "is_animated_pack", "INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00fb, code lost:
        X.AnonymousClass350.A02(r7, "downloadable_sticker_packs", "animated_pack", "INTEGER");
        X.AnonymousClass350.A02(r7, "installed_sticker_packs", "installed_animated_pack", "INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0105, code lost:
        X.AnonymousClass350.A02(r7, "recent_stickers", "url", "TEXT");
        X.AnonymousClass350.A02(r7, "recent_stickers", "enc_hash", "TEXT");
        X.AnonymousClass350.A02(r7, "recent_stickers", "direct_path", "TEXT");
        X.AnonymousClass350.A02(r7, "recent_stickers", "mimetype", "TEXT");
        X.AnonymousClass350.A02(r7, "recent_stickers", "media_key", "TEXT");
        X.AnonymousClass350.A02(r7, "recent_stickers", "file_size", "INTEGER");
        X.AnonymousClass350.A02(r7, "recent_stickers", "width", "INTEGER");
        X.AnonymousClass350.A02(r7, "recent_stickers", "height", "INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x012d, code lost:
        r10 = new java.lang.String[]{"urlTEXT", "enc_hashTEXT", "direct_pathTEXT", "mimetypeTEXT", "media_keyTEXT", "file_sizeINTEGER", "widthINTEGER", "heightINTEGER"};
        r14 = X.C18320x8.A0r();
        r14.put("plaintext_hash", "TEXT NOT NULL");
        r14.put("entry_weight", "FLOAT NOT NULL");
        r14.put("hash_of_image_part", "TEXT");
        r14.put("url", "TEXT");
        r14.put("enc_hash", "TEXT");
        r14.put("direct_path", "TEXT");
        r14.put("mimetype", "TEXT");
        r14.put("media_key", "TEXT");
        r14.put("file_size", "INTEGER");
        r14.put("width", "INTEGER");
        r14.put("height", "INTEGER");
        r11 = X.AnonymousClass001.A0o();
        r11.append("SELECT * FROM ");
        r11.append("recent_stickers");
        r11 = r7.rawQuery(X.AnonymousClass000.A0X(" LIMIT 0", r11), (java.lang.String[]) null);
        r15 = 0;
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x01aa, code lost:
        if (r15 >= r10.length) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01ac, code lost:
        if (r16 != false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01ae, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x01b6, code lost:
        if (r11.getColumnIndex(r10[r15]) == -1) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01b8, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x01ba, code lost:
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x01bd, code lost:
        if (r16 == false) goto L_0x029e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x01bf, code lost:
        r16 = r14.keySet();
        r15 = r16.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01cb, code lost:
        if (r15.hasNext() == false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01cd, code lost:
        r10 = X.AnonymousClass001.A0m(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01d5, code lost:
        if (r11.getColumnIndex(r10) != -1) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01d7, code lost:
        r17.A00.A0A("StickersDBHelper/removeUndesiredColumns", true, X.AnonymousClass000.A0V(" table migration failed due to non-existent desired column ", r10, X.AnonymousClass000.A0l("recent_stickers")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01ed, code lost:
        r10 = X.AnonymousClass000.A0X("_temp", X.AnonymousClass000.A0l("recent_stickers"));
        r18 = android.text.TextUtils.join(",", r14.keySet());
        r13 = X.AnonymousClass001.A0s();
        r16 = r16.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x020d, code lost:
        if (r16.hasNext() == false) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x020f, code lost:
        r9 = X.AnonymousClass001.A0m(r16);
        r15 = X.AnonymousClass001.A0o();
        X.AnonymousClass0x2.A1N(r15, r9);
        X.C18270x1.A1D(X.C18320x8.A0e(r9, r14), r15, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0222, code lost:
        r17 = android.text.TextUtils.join(", ", r13);
        r16 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0230, code lost:
        if (r14.containsKey("plaintext_hash") == false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0232, code lost:
        r16 = X.AnonymousClass000.A0U(", PRIMARY KEY(", "plaintext_hash", ")", X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x023c, code lost:
        r15 = X.AnonymousClass001.A0o();
        X.C18260x0.A0p("CREATE TEMPORARY TABLE ", r10, " (", r17, r15);
        r7.execSQL(X.AnonymousClass000.A0X(")", r15));
        r7.execSQL(X.AnonymousClass000.A0X("recent_stickers", X.C18260x0.A0B("INSERT INTO ", r10, " SELECT ", r18, " FROM ")));
        r7.execSQL(X.AnonymousClass000.A0T("DROP TABLE ", "recent_stickers"));
        r14 = X.AnonymousClass001.A0o();
        X.C18260x0.A0p("CREATE TABLE ", "recent_stickers", " (", r17, r14);
        r7.execSQL(X.AnonymousClass000.A0V(r16, ")", r14));
        r7.execSQL(X.AnonymousClass000.A0X(r10, X.C18260x0.A0B("INSERT INTO ", "recent_stickers", " SELECT ", r18, " FROM ")));
        r7.execSQL(X.AnonymousClass000.A0T("DROP TABLE ", r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x029e, code lost:
        if (r11 == null) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x02a0, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x02a3, code lost:
        X.AnonymousClass350.A02(r7, "starred_stickers", "url", "TEXT");
        X.AnonymousClass350.A02(r7, "starred_stickers", "enc_hash", "TEXT");
        X.AnonymousClass350.A02(r7, "starred_stickers", "direct_path", "TEXT");
        X.AnonymousClass350.A02(r7, "starred_stickers", "mimetype", "TEXT");
        X.AnonymousClass350.A02(r7, "starred_stickers", "media_key", "TEXT");
        X.AnonymousClass350.A02(r7, "starred_stickers", "file_size", "INTEGER");
        X.AnonymousClass350.A02(r7, "starred_stickers", "width", "INTEGER");
        X.AnonymousClass350.A02(r7, "starred_stickers", "height", "INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x02cb, code lost:
        X.AnonymousClass350.A02(r7, "stickers", "emojis", "TEXT");
        X.AnonymousClass350.A02(r7, "recent_stickers", "emojis", "TEXT");
        X.AnonymousClass350.A02(r7, "recent_stickers", "is_first_party", "INTEGER");
        X.AnonymousClass350.A02(r7, "starred_stickers", "emojis", "TEXT");
        X.AnonymousClass350.A02(r7, "starred_stickers", "is_first_party", "INTEGER");
        X.C626235v.A01(r7, "third_party_sticker_emoji_mapping");
        r7.execSQL("CREATE TABLE third_party_sticker_emoji_mapping (plaintext_hash TEXT  NOT NULL , authority TEXT  NOT NULL , sticker_pack_id TEXT  NOT NULL , emojis TEXT , hash_of_image_part TEXT , PRIMARY KEY(plaintext_hash))");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x02e9, code lost:
        r9 = "hash_of_image_part";
        X.AnonymousClass350.A02(r7, "stickers", r9, "TEXT");
        X.AnonymousClass350.A02(r7, "third_party_sticker_emoji_mapping", r9, "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x02f4, code lost:
        X.AnonymousClass350.A02(r7, "recent_stickers", "is_avocado", "INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r7.execSQL("CREATE INDEX IF NOT EXISTS recent_sticker_is_avocado_index ON recent_stickers (is_avocado)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x02ff, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0300, code lost:
        X.C626936e.A08("StickersDBHelper/addRecentStickerAvocadoColumnIndex", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x007f, code lost:
        X.C626235v.A01(r7, "downloadable_sticker_packs");
        r7.execSQL("CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, lottie_pack INTEGER, PRIMARY KEY(id))");
        X.C626235v.A01(r7, "sticker_pack_order");
        r7.execSQL("CREATE TABLE sticker_pack_order (sticker_pack_id TEXT PRIMARY KEY NOT NULL, pack_order INTEGER NOT NULL)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0090, code lost:
        X.C626235v.A01(r7, "recent_stickers");
        r7.execSQL("CREATE TABLE recent_stickers (plaintext_hash TEXT  NOT NULL , entry_weight FLOAT  NOT NULL , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avocado INTEGER  NOT NULL  DEFAULT 0 , last_sticker_sent_ts INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , is_fun_sticker INTEGER  , is_lottie INTEGER  , PRIMARY KEY(plaintext_hash))");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0098, code lost:
        X.C626235v.A01(r7, "downloadable_sticker_packs");
        r7.execSQL("CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, lottie_pack INTEGER, PRIMARY KEY(id))");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x009e, code lost:
        X.C626235v.A01(r7, "unseen_sticker_packs");
        r7.execSQL("CREATE TABLE unseen_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00a9, code lost:
        X.C626235v.A01(r7, "third_party_whitelist_packs");
        r7.execSQL("CREATE TABLE third_party_whitelist_packs (authority TEXT NOT NULL, sticker_pack_id TEXT NOT NULL, sticker_pack_name TEXT, sticker_pack_publisher TEXT, sticker_pack_image_data_hash TEXT, avoid_cache INTEGER, is_animated_pack INTEGER, PRIMARY KEY (authority,sticker_pack_id))");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r35, int r36, int r37) {
        /*
            r34 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StickersDBHelper/onUpgrade/old version:"
            r1.append(r0)
            r12 = r36
            r1.append(r12)
            java.lang.String r0 = ", new version: "
            r1.append(r0)
            r9 = r37
            r1.append(r9)
            java.lang.String r0 = ", stacktrace:"
            r1.append(r0)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            X.C18260x0.A1L(r1, r0)
            java.lang.String r33 = "avatar_template_id"
            java.lang.String r32 = "height"
            java.lang.String r31 = "width"
            java.lang.String r30 = "file_size"
            java.lang.String r29 = "media_key"
            java.lang.String r28 = "mimetype"
            java.lang.String r27 = "enc_hash"
            java.lang.String r26 = "url"
            java.lang.String r11 = "CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, lottie_pack INTEGER, PRIMARY KEY(id))"
            java.lang.String r25 = "direct_path"
            java.lang.String r24 = "hash_of_image_part"
            java.lang.String r8 = "downloadable_sticker_packs"
            java.lang.String r6 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r5 = "installed_sticker_packs"
            java.lang.String r10 = "third_party_whitelist_packs"
            java.lang.String r4 = "stickers"
            java.lang.String r3 = "starred_stickers"
            java.lang.String r2 = "recent_stickers"
            java.lang.String r1 = "INTEGER"
            java.lang.String r0 = "TEXT"
            r17 = r34
            r7 = r35
            switch(r36) {
                case 1: goto L_0x03d1;
                case 2: goto L_0x03d1;
                case 3: goto L_0x03d1;
                case 4: goto L_0x03d1;
                case 5: goto L_0x03d1;
                case 6: goto L_0x0077;
                case 7: goto L_0x007f;
                case 8: goto L_0x0090;
                case 9: goto L_0x0098;
                case 10: goto L_0x009e;
                case 11: goto L_0x00a9;
                case 12: goto L_0x00b1;
                case 13: goto L_0x00c7;
                case 14: goto L_0x00d3;
                case 15: goto L_0x00de;
                case 16: goto L_0x00e3;
                case 17: goto L_0x00eb;
                case 18: goto L_0x00eb;
                case 19: goto L_0x00fb;
                case 20: goto L_0x0105;
                case 21: goto L_0x0105;
                case 22: goto L_0x012d;
                case 23: goto L_0x02a3;
                case 24: goto L_0x02cb;
                case 25: goto L_0x02e9;
                case 26: goto L_0x02f4;
                case 27: goto L_0x02f4;
                case 28: goto L_0x0305;
                case 29: goto L_0x0316;
                case 30: goto L_0x0327;
                case 31: goto L_0x032f;
                case 32: goto L_0x0334;
                case 33: goto L_0x033a;
                case 34: goto L_0x033f;
                case 35: goto L_0x0350;
                case 36: goto L_0x0361;
                case 37: goto L_0x036d;
                case 38: goto L_0x0379;
                case 39: goto L_0x0383;
                case 40: goto L_0x0386;
                case 41: goto L_0x039c;
                case 42: goto L_0x03a4;
                case 43: goto L_0x03af;
                case 44: goto L_0x03ba;
                default: goto L_0x005f;
            }
        L_0x005f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown upgrade from "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " to "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r9)
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        L_0x0077:
            X.C626235v.A01(r7, r3)
            java.lang.String r9 = "CREATE TABLE starred_stickers (plaintext_hash TEXT  NOT NULL , timestamp LONG , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avatar INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , is_fun_sticker INTEGER  , is_lottie INTEGER  , PRIMARY KEY(plaintext_hash))"
            r7.execSQL(r9)
        L_0x007f:
            X.C626235v.A01(r7, r8)
            r7.execSQL(r11)
            java.lang.String r9 = "sticker_pack_order"
            X.C626235v.A01(r7, r9)
            java.lang.String r9 = "CREATE TABLE sticker_pack_order (sticker_pack_id TEXT PRIMARY KEY NOT NULL, pack_order INTEGER NOT NULL)"
            r7.execSQL(r9)
        L_0x0090:
            X.C626235v.A01(r7, r2)
            java.lang.String r9 = "CREATE TABLE recent_stickers (plaintext_hash TEXT  NOT NULL , entry_weight FLOAT  NOT NULL , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avocado INTEGER  NOT NULL  DEFAULT 0 , last_sticker_sent_ts INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , is_fun_sticker INTEGER  , is_lottie INTEGER  , PRIMARY KEY(plaintext_hash))"
            r7.execSQL(r9)
        L_0x0098:
            X.C626235v.A01(r7, r8)
            r7.execSQL(r11)
        L_0x009e:
            java.lang.String r9 = "unseen_sticker_packs"
            X.C626235v.A01(r7, r9)
            java.lang.String r9 = "CREATE TABLE unseen_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)"
            r7.execSQL(r9)
        L_0x00a9:
            X.C626235v.A01(r7, r10)
            java.lang.String r9 = "CREATE TABLE third_party_whitelist_packs (authority TEXT NOT NULL, sticker_pack_id TEXT NOT NULL, sticker_pack_name TEXT, sticker_pack_publisher TEXT, sticker_pack_image_data_hash TEXT, avoid_cache INTEGER, is_animated_pack INTEGER, PRIMARY KEY (authority,sticker_pack_id))"
            r7.execSQL(r9)
        L_0x00b1:
            X.C626235v.A01(r7, r5)
            java.lang.String r9 = "CREATE TABLE installed_sticker_packs (installed_id TEXT NOT NULL, installed_name TEXT, installed_publisher TEXT, installed_description TEXT, installed_size INTEGER NOT NULL, installed_image_data_hash TEXT NOT NULL, installed_tray_image_id TEXT NOT NULL, installed_tray_image_preview_id TEXT, installed_animated_pack INTEGER NOT NULL, installed_is_avatar_pack INTEGER NOT NULL DEFAULT 0, installed_empty_favorites_avatar_template_id TEXT, installed_empty_recents_avatar_template_id TEXT, installed_lottie_pack INTEGER, PRIMARY KEY(installed_id))"
            r7.execSQL(r9)
            X.C626235v.A01(r7, r4)
            java.lang.String r9 = "CREATE TABLE stickers (plain_file_hash TEXT NOT NULL, encrypted_file_hash TEXT, media_key TEXT, mime_type TEXT, height INTEGER NOT NULL, width INTEGER NOT NULL, sticker_pack_id TEXT, file_path TEXT, url TEXT, file_size INTEGER, direct_path TEXT, emojis TEXT, hash_of_image_part TEXT, is_avatar INTEGER NOT NULL DEFAULT 0, avatar_template_id TEXT, is_fun_sticker INTEGER, is_lottie INTEGER, PRIMARY KEY(plain_file_hash))"
            r7.execSQL(r9)
            X.C626235v.A01(r7, r8)
            r7.execSQL(r11)
        L_0x00c7:
            java.lang.String r9 = "sticker_pack_name"
            X.AnonymousClass350.A02(r7, r10, r9, r0)
            java.lang.String r9 = "sticker_pack_publisher"
            X.AnonymousClass350.A02(r7, r10, r9, r0)
        L_0x00d3:
            java.lang.String r9 = "new_sticker_packs"
            X.C626235v.A01(r7, r9)
            java.lang.String r9 = "CREATE TABLE new_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)"
            r7.execSQL(r9)
        L_0x00de:
            r9 = r25
            X.AnonymousClass350.A02(r7, r4, r9, r0)
        L_0x00e3:
            r9 = r24
            X.AnonymousClass350.A02(r7, r2, r9, r0)
            X.AnonymousClass350.A02(r7, r3, r9, r0)
        L_0x00eb:
            java.lang.String r9 = "sticker_pack_image_data_hash"
            X.AnonymousClass350.A02(r7, r10, r9, r0)
            java.lang.String r9 = "avoid_cache"
            X.AnonymousClass350.A02(r7, r10, r9, r1)
            java.lang.String r9 = "is_animated_pack"
            X.AnonymousClass350.A02(r7, r10, r9, r1)
        L_0x00fb:
            java.lang.String r9 = "animated_pack"
            X.AnonymousClass350.A02(r7, r8, r9, r1)
            java.lang.String r9 = "installed_animated_pack"
            X.AnonymousClass350.A02(r7, r5, r9, r1)
        L_0x0105:
            r9 = r26
            X.AnonymousClass350.A02(r7, r2, r9, r0)
            r9 = r27
            X.AnonymousClass350.A02(r7, r2, r9, r0)
            r9 = r25
            X.AnonymousClass350.A02(r7, r2, r9, r0)
            r9 = r28
            X.AnonymousClass350.A02(r7, r2, r9, r0)
            r9 = r29
            X.AnonymousClass350.A02(r7, r2, r9, r0)
            r9 = r30
            X.AnonymousClass350.A02(r7, r2, r9, r1)
            r9 = r31
            X.AnonymousClass350.A02(r7, r2, r9, r1)
            r9 = r32
            X.AnonymousClass350.A02(r7, r2, r9, r1)
        L_0x012d:
            java.lang.String r9 = "urlTEXT"
            java.lang.String r10 = "enc_hashTEXT"
            java.lang.String r11 = "direct_pathTEXT"
            java.lang.String r12 = "mimetypeTEXT"
            java.lang.String r13 = "media_keyTEXT"
            java.lang.String r14 = "file_sizeINTEGER"
            java.lang.String r15 = "widthINTEGER"
            java.lang.String r16 = "heightINTEGER"
            java.lang.String[] r10 = new java.lang.String[]{r9, r10, r11, r12, r13, r14, r15, r16}
            java.util.LinkedHashMap r14 = X.C18320x8.A0r()
            java.lang.String r12 = "plaintext_hash"
            java.lang.String r9 = "TEXT NOT NULL"
            r14.put(r12, r9)
            java.lang.String r11 = "entry_weight"
            java.lang.String r9 = "FLOAT NOT NULL"
            r14.put(r11, r9)
            r9 = r24
            r14.put(r9, r0)
            r9 = r26
            r14.put(r9, r0)
            r9 = r27
            r14.put(r9, r0)
            r9 = r25
            r14.put(r9, r0)
            r9 = r28
            r14.put(r9, r0)
            r9 = r29
            r14.put(r9, r0)
            r9 = r30
            r14.put(r9, r1)
            r9 = r31
            r14.put(r9, r1)
            r9 = r32
            r14.put(r9, r1)
            java.lang.String r23 = "DROP TABLE "
            java.lang.String r22 = " FROM "
            java.lang.String r21 = " SELECT "
            java.lang.String r20 = "INSERT INTO "
            java.lang.String r19 = " ("
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()
            java.lang.String r9 = "SELECT * FROM "
            r11.append(r9)
            r11.append(r2)
            java.lang.String r9 = " LIMIT 0"
            java.lang.String r11 = X.AnonymousClass000.A0X(r9, r11)
            r9 = 0
            android.database.Cursor r11 = r7.rawQuery(r11, r9)
            r15 = 0
            r16 = 0
        L_0x01a8:
            int r9 = r10.length     // Catch:{ all -> 0x03c5 }
            r13 = -1
            if (r15 >= r9) goto L_0x01bd
            if (r16 != 0) goto L_0x01b8
            r9 = r10[r15]     // Catch:{ all -> 0x03c5 }
            int r9 = r11.getColumnIndex(r9)     // Catch:{ all -> 0x03c5 }
            r16 = 0
            if (r9 == r13) goto L_0x01ba
        L_0x01b8:
            r16 = 1
        L_0x01ba:
            int r15 = r15 + 1
            goto L_0x01a8
        L_0x01bd:
            if (r16 == 0) goto L_0x029e
            java.util.Set r16 = r14.keySet()     // Catch:{ all -> 0x03c5 }
            java.util.Iterator r15 = r16.iterator()     // Catch:{ all -> 0x03c5 }
        L_0x01c7:
            boolean r9 = r15.hasNext()     // Catch:{ all -> 0x03c5 }
            if (r9 == 0) goto L_0x01ed
            java.lang.String r10 = X.AnonymousClass001.A0m(r15)     // Catch:{ all -> 0x03c5 }
            int r9 = r11.getColumnIndex(r10)     // Catch:{ all -> 0x03c5 }
            if (r9 != r13) goto L_0x01c7
            r9 = r17
            X.2qk r13 = r9.A00     // Catch:{ all -> 0x03c5 }
            java.lang.String r12 = "StickersDBHelper/removeUndesiredColumns"
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0l(r2)     // Catch:{ all -> 0x03c5 }
            java.lang.String r9 = " table migration failed due to non-existent desired column "
            java.lang.String r10 = X.AnonymousClass000.A0V(r9, r10, r14)     // Catch:{ all -> 0x03c5 }
            r9 = 1
            r13.A0A(r12, r9, r10)     // Catch:{ all -> 0x03c5 }
            goto L_0x02a0
        L_0x01ed:
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0l(r2)     // Catch:{ all -> 0x03c5 }
            java.lang.String r9 = "_temp"
            java.lang.String r10 = X.AnonymousClass000.A0X(r9, r10)     // Catch:{ all -> 0x03c5 }
            java.lang.String r13 = ","
            java.util.Set r9 = r14.keySet()     // Catch:{ all -> 0x03c5 }
            java.lang.String r18 = android.text.TextUtils.join(r13, r9)     // Catch:{ all -> 0x03c5 }
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x03c5 }
            java.util.Iterator r16 = r16.iterator()     // Catch:{ all -> 0x03c5 }
        L_0x0209:
            boolean r9 = r16.hasNext()     // Catch:{ all -> 0x03c5 }
            if (r9 == 0) goto L_0x0222
            java.lang.String r9 = X.AnonymousClass001.A0m(r16)     // Catch:{ all -> 0x03c5 }
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03c5 }
            X.AnonymousClass0x2.A1N(r15, r9)     // Catch:{ all -> 0x03c5 }
            java.lang.String r9 = X.C18320x8.A0e(r9, r14)     // Catch:{ all -> 0x03c5 }
            X.C18270x1.A1D(r9, r15, r13)     // Catch:{ all -> 0x03c5 }
            goto L_0x0209
        L_0x0222:
            java.lang.String r9 = ", "
            java.lang.String r17 = android.text.TextUtils.join(r9, r13)     // Catch:{ all -> 0x03c5 }
            java.lang.String r16 = ""
            java.lang.String r13 = ")"
            boolean r9 = r14.containsKey(r12)     // Catch:{ all -> 0x03c5 }
            if (r9 == 0) goto L_0x023c
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03c5 }
            java.lang.String r9 = ", PRIMARY KEY("
            java.lang.String r16 = X.AnonymousClass000.A0U(r9, r12, r13, r14)     // Catch:{ all -> 0x03c5 }
        L_0x023c:
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03c5 }
            java.lang.String r14 = "CREATE TEMPORARY TABLE "
            r12 = r19
            r9 = r17
            X.C18260x0.A0p(r14, r10, r12, r9, r15)     // Catch:{ all -> 0x03c5 }
            java.lang.String r9 = X.AnonymousClass000.A0X(r13, r15)     // Catch:{ all -> 0x03c5 }
            r7.execSQL(r9)     // Catch:{ all -> 0x03c5 }
            r15 = r20
            r14 = r21
            r12 = r18
            r9 = r22
            java.lang.StringBuilder r9 = X.C18260x0.A0B(r15, r10, r14, r12, r9)     // Catch:{ all -> 0x03c5 }
            java.lang.String r9 = X.AnonymousClass000.A0X(r2, r9)     // Catch:{ all -> 0x03c5 }
            r7.execSQL(r9)     // Catch:{ all -> 0x03c5 }
            r9 = r23
            java.lang.String r9 = X.AnonymousClass000.A0T(r9, r2)     // Catch:{ all -> 0x03c5 }
            r7.execSQL(r9)     // Catch:{ all -> 0x03c5 }
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03c5 }
            java.lang.String r15 = "CREATE TABLE "
            r12 = r19
            r9 = r17
            X.C18260x0.A0p(r15, r2, r12, r9, r14)     // Catch:{ all -> 0x03c5 }
            r9 = r16
            java.lang.String r9 = X.AnonymousClass000.A0V(r9, r13, r14)     // Catch:{ all -> 0x03c5 }
            r7.execSQL(r9)     // Catch:{ all -> 0x03c5 }
            r14 = r20
            r13 = r21
            r12 = r18
            r9 = r22
            java.lang.StringBuilder r9 = X.C18260x0.A0B(r14, r2, r13, r12, r9)     // Catch:{ all -> 0x03c5 }
            java.lang.String r9 = X.AnonymousClass000.A0X(r10, r9)     // Catch:{ all -> 0x03c5 }
            r7.execSQL(r9)     // Catch:{ all -> 0x03c5 }
            r9 = r23
            java.lang.String r9 = X.AnonymousClass000.A0T(r9, r10)     // Catch:{ all -> 0x03c5 }
            r7.execSQL(r9)     // Catch:{ all -> 0x03c5 }
        L_0x029e:
            if (r11 == 0) goto L_0x02a3
        L_0x02a0:
            r11.close()
        L_0x02a3:
            r9 = r26
            X.AnonymousClass350.A02(r7, r3, r9, r0)
            r9 = r27
            X.AnonymousClass350.A02(r7, r3, r9, r0)
            r9 = r25
            X.AnonymousClass350.A02(r7, r3, r9, r0)
            r9 = r28
            X.AnonymousClass350.A02(r7, r3, r9, r0)
            r9 = r29
            X.AnonymousClass350.A02(r7, r3, r9, r0)
            r9 = r30
            X.AnonymousClass350.A02(r7, r3, r9, r1)
            r9 = r31
            X.AnonymousClass350.A02(r7, r3, r9, r1)
            r9 = r32
            X.AnonymousClass350.A02(r7, r3, r9, r1)
        L_0x02cb:
            java.lang.String r10 = "emojis"
            X.AnonymousClass350.A02(r7, r4, r10, r0)
            X.AnonymousClass350.A02(r7, r2, r10, r0)
            java.lang.String r9 = "is_first_party"
            X.AnonymousClass350.A02(r7, r2, r9, r1)
            X.AnonymousClass350.A02(r7, r3, r10, r0)
            X.AnonymousClass350.A02(r7, r3, r9, r1)
            java.lang.String r9 = "third_party_sticker_emoji_mapping"
            X.C626235v.A01(r7, r9)
            java.lang.String r9 = "CREATE TABLE third_party_sticker_emoji_mapping (plaintext_hash TEXT  NOT NULL , authority TEXT  NOT NULL , sticker_pack_id TEXT  NOT NULL , emojis TEXT , hash_of_image_part TEXT , PRIMARY KEY(plaintext_hash))"
            r7.execSQL(r9)
        L_0x02e9:
            r9 = r24
            X.AnonymousClass350.A02(r7, r4, r9, r0)
            java.lang.String r10 = "third_party_sticker_emoji_mapping"
            X.AnonymousClass350.A02(r7, r10, r9, r0)
        L_0x02f4:
            java.lang.String r9 = "is_avocado"
            X.AnonymousClass350.A02(r7, r2, r9, r6)
            java.lang.String r9 = "CREATE INDEX IF NOT EXISTS recent_sticker_is_avocado_index ON recent_stickers (is_avocado)"
            r7.execSQL(r9)     // Catch:{ SQLiteException -> 0x02ff }
            goto L_0x0305
        L_0x02ff:
            r10 = move-exception
            java.lang.String r9 = "StickersDBHelper/addRecentStickerAvocadoColumnIndex"
            X.C626936e.A08(r9, r10)
        L_0x0305:
            java.lang.String r9 = "is_avatar"
            X.AnonymousClass350.A02(r7, r3, r9, r6)
            java.lang.String r9 = "CREATE INDEX IF NOT EXISTS starred_sticker_is_avatar_index ON starred_stickers (is_avatar)"
            r7.execSQL(r9)     // Catch:{ SQLiteException -> 0x0310 }
            goto L_0x0316
        L_0x0310:
            r10 = move-exception
            java.lang.String r9 = "StickersDBHelper/addStarredStickerAvocadoColumnIndex"
            X.C626936e.A08(r9, r10)
        L_0x0316:
            java.lang.String r9 = "installed_is_avatar_pack"
            X.AnonymousClass350.A02(r7, r5, r9, r6)
            java.lang.String r9 = "CREATE INDEX IF NOT EXISTS installed_sticker_packs_avatar_pack_index ON installed_sticker_packs (installed_is_avatar_pack)"
            r7.execSQL(r9)     // Catch:{ SQLiteException -> 0x0321 }
            goto L_0x0327
        L_0x0321:
            r10 = move-exception
            java.lang.String r9 = "StickerDBHelper/addInstalledIsAvatarStickerPackColumnIndex"
            X.C626936e.A08(r9, r10)
        L_0x0327:
            java.lang.String r9 = "is_avatar"
            X.AnonymousClass350.A02(r7, r4, r9, r6)
            A09(r7)
        L_0x032f:
            java.lang.String r9 = "last_sticker_sent_ts"
            X.AnonymousClass350.A02(r7, r2, r9, r6)
        L_0x0334:
            java.lang.String r9 = "sticker_md_upload"
            X.C626235v.A01(r7, r9)
        L_0x033a:
            r9 = r33
            X.AnonymousClass350.A02(r7, r4, r9, r0)
        L_0x033f:
            r9 = r33
            X.AnonymousClass350.A02(r7, r2, r9, r0)
            java.lang.String r9 = "CREATE INDEX IF NOT EXISTS recent_sticker_avatar_template_index ON recent_stickers (avatar_template_id)"
            r7.execSQL(r9)     // Catch:{ SQLiteException -> 0x034a }
            goto L_0x0350
        L_0x034a:
            r10 = move-exception
            java.lang.String r9 = "StickersDBHelper/addRecentStickerAvocadoColumnIndex"
            X.C626936e.A08(r9, r10)
        L_0x0350:
            r9 = r33
            X.AnonymousClass350.A02(r7, r3, r9, r0)
            java.lang.String r9 = "CREATE INDEX IF NOT EXISTS starred_sticker_avatar_template_id_index ON starred_stickers (avatar_template_id)"
            r7.execSQL(r9)     // Catch:{ SQLiteException -> 0x035b }
            goto L_0x0361
        L_0x035b:
            r10 = move-exception
            java.lang.String r9 = "StickersDBHelper/addRecentStickerAvocadoColumnIndex"
            X.C626936e.A08(r9, r10)
        L_0x0361:
            java.lang.String r9 = "CREATE INDEX IF NOT EXISTS sticker_avatar_template_id_index ON stickers (avatar_template_id)"
            r7.execSQL(r9)     // Catch:{ SQLiteException -> 0x0367 }
            goto L_0x036d
        L_0x0367:
            r10 = move-exception
            java.lang.String r9 = "StickerDBHelper/addStickerIsAvatarColumnIndex"
            X.C626936e.A08(r9, r10)
        L_0x036d:
            java.lang.String r9 = "CREATE INDEX IF NOT EXISTS sticker_pack_id_index ON stickers (sticker_pack_id)"
            r7.execSQL(r9)     // Catch:{ SQLiteException -> 0x0373 }
            goto L_0x0379
        L_0x0373:
            r10 = move-exception
            java.lang.String r9 = "StickerDBHelper/addStickerPackIdIndex"
            X.C626936e.A08(r9, r10)
        L_0x0379:
            java.lang.String r9 = "installed_empty_recents_avatar_template_id"
            X.AnonymousClass350.A02(r7, r5, r9, r0)
            java.lang.String r9 = "installed_empty_favorites_avatar_template_id"
            X.AnonymousClass350.A02(r7, r5, r9, r0)
        L_0x0383:
            A09(r7)
        L_0x0386:
            java.lang.String r0 = "avatar_sticker_search_dictionary"
            X.C626235v.A01(r7, r0)
            java.lang.String r0 = "CREATE TABLE avatar_sticker_search_dictionary (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, sticker_id TEXT NOT NULL, tag TEXT NOT NULL, weight INTEGER NOT NULL DEFAULT 0)"
            r7.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS avatar_sticker_search_index ON avatar_sticker_search_dictionary (tag, sticker_id)"
            r7.execSQL(r0)     // Catch:{ SQLiteException -> 0x0396 }
            goto L_0x039c
        L_0x0396:
            r9 = move-exception
            java.lang.String r0 = "StickerDBHelper/addAvatarStickerSearchIndex"
            X.C626936e.A08(r0, r9)
        L_0x039c:
            java.lang.String r9 = "avatar_sticker_search_dictionary"
            java.lang.String r0 = "weight"
            X.AnonymousClass350.A02(r7, r9, r0, r6)
        L_0x03a4:
            java.lang.String r0 = "is_fun_sticker"
            X.AnonymousClass350.A02(r7, r4, r0, r1)
            X.AnonymousClass350.A02(r7, r3, r0, r1)
            X.AnonymousClass350.A02(r7, r2, r0, r1)
        L_0x03af:
            java.lang.String r0 = "is_lottie"
            X.AnonymousClass350.A02(r7, r4, r0, r1)
            X.AnonymousClass350.A02(r7, r3, r0, r1)
            X.AnonymousClass350.A02(r7, r2, r0, r1)
        L_0x03ba:
            java.lang.String r0 = "lottie_pack"
            X.AnonymousClass350.A02(r7, r8, r0, r1)
            java.lang.String r0 = "installed_lottie_pack"
            X.AnonymousClass350.A02(r7, r5, r0, r1)
            return
        L_0x03c5:
            r1 = move-exception
            if (r11 == 0) goto L_0x03d0
            r11.close()     // Catch:{ all -> 0x03cc }
            throw r1
        L_0x03cc:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x03d0:
            throw r1
        L_0x03d1:
            r0 = r17
            r0.A0G(r7)
            r0.onCreate(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RH.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
