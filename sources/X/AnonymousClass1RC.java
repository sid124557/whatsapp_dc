package X;

import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;

/* renamed from: X.1RC  reason: invalid class name */
public class AnonymousClass1RC extends C18630y0 {
    public final C60972zT A00;
    public final C45932ao A01;

    public AnonymousClass1RC(C55682qk r4, C54292oU r5, C60972zT r6, C45932ao r7) {
        super(r5.A00, r4, "media.db", 26);
        this.A01 = r7;
        this.A00 = r6;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.d("MediaDbHelper/onCreate");
        C626235v.A01(sQLiteDatabase, "media_job");
        C626235v.A01(sQLiteDatabase, "media_experiments");
        C626235v.A01(sQLiteDatabase, "web_upload_media_data_store");
        C626235v.A01(sQLiteDatabase, "draft_voice_note_metadata");
        C626235v.A01(sQLiteDatabase, "express_path_download_data");
        sQLiteDatabase.execSQL("CREATE TABLE media_job (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,uuid TEXT NOT NULL, job_type INTEGER, create_time TIMESTAMP, transfer_start_time TIMESTAMP, last_update_time TIMESTAMP, user_initiated_attempt_count INTEGER, overall_cumulative_time TIMESTAMP, overall_cumulative_user_visible_time TIMESTAMP, streaming_playback_count INTEGER, media_key_reuse_type INTEGER, doodle_id TEXT, transferred_bytes INTEGER,reupload_attempt_count INTEGER,last_reupload_attempt_timestamp TIMESTAMP,last_reupload_success_timestamp TIMESTAMP)");
        sQLiteDatabase.execSQL("CREATE TABLE shared_media_ids (item_uuid TEXT PRIMARY KEY NOT NULL, file_name TEXT NOT NULL, mime_type TEXT NOT NULL, display_name TEXT, expiration_timestamp INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE draft_voice_note_metadata (chat_jid TEXT PRIMARY KEY NOT NULL, page_number INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE express_path_download_data (enc_file_hash TEXT PRIMARY KEY NOT NULL, ep_saved_time_ms INTEGER, ep_saved_bytes INTEGER, last_update_time TIMESTAMP)");
    }

    public C56862sg A0F() {
        String databaseName = getDatabaseName();
        return C626135u.A00(super.A0A(), this.A00, this.A01, databaseName);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MediaDbHelper/onDowngrade oldVersion=");
        A0o.append(i);
        C18260x0.A0w(" newVersion=", A0o, i2);
        C626235v.A01(sQLiteDatabase, "media_job");
        C626235v.A01(sQLiteDatabase, "media_experiments");
        C626235v.A01(sQLiteDatabase, "web_upload_media_key_store");
        C626235v.A01(sQLiteDatabase, "web_upload_media_data_store");
        C626235v.A01(sQLiteDatabase, "shared_media_ids");
        C626235v.A01(sQLiteDatabase, "draft_voice_note_metadata");
        C626235v.A01(sQLiteDatabase, "express_path_download_data");
        onCreate(sQLiteDatabase);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        sQLiteDatabase.execSQL("PRAGMA synchronous=NORMAL;");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MediaDbHelper/onUpgrade oldVersion=");
        A0o.append(i);
        C18260x0.A0w(" newVersion=", A0o, i2);
        C626235v.A01(sQLiteDatabase, "media_job");
        C626235v.A01(sQLiteDatabase, "media_experiments");
        C626235v.A01(sQLiteDatabase, "web_upload_media_data_store");
        C626235v.A01(sQLiteDatabase, "shared_media_ids");
        C626235v.A01(sQLiteDatabase, "draft_voice_note_metadata");
        C626235v.A01(sQLiteDatabase, "express_path_download_data");
        if (i < 16) {
            C626235v.A01(sQLiteDatabase, "web_upload_media_key_store");
        }
        sQLiteDatabase.execSQL("CREATE TABLE media_job (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,uuid TEXT NOT NULL, job_type INTEGER, create_time TIMESTAMP, transfer_start_time TIMESTAMP, last_update_time TIMESTAMP, user_initiated_attempt_count INTEGER, overall_cumulative_time TIMESTAMP, overall_cumulative_user_visible_time TIMESTAMP, streaming_playback_count INTEGER, media_key_reuse_type INTEGER, doodle_id TEXT, transferred_bytes INTEGER,reupload_attempt_count INTEGER,last_reupload_attempt_timestamp TIMESTAMP,last_reupload_success_timestamp TIMESTAMP)");
        sQLiteDatabase.execSQL("CREATE TABLE shared_media_ids (item_uuid TEXT PRIMARY KEY NOT NULL, file_name TEXT NOT NULL, mime_type TEXT NOT NULL, display_name TEXT, expiration_timestamp INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE draft_voice_note_metadata (chat_jid TEXT PRIMARY KEY NOT NULL, page_number INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE express_path_download_data (enc_file_hash TEXT PRIMARY KEY NOT NULL, ep_saved_time_ms INTEGER, ep_saved_bytes INTEGER, last_update_time TIMESTAMP)");
    }
}
