package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.1RF  reason: invalid class name */
public class AnonymousClass1RF extends C18630y0 {
    public final C60972zT A00;
    public final C45932ao A01;

    public AnonymousClass1RF(C55682qk r4, C54292oU r5, C60972zT r6, C45932ao r7) {
        super(r5.A00, r4, "daily_metrics.db", 6);
        this.A01 = r7;
        this.A00 = r6;
    }

    public C56862sg A0F() {
        Log.i("DailyMetricsDbHelper/initDatabase");
        try {
            String databaseName = getDatabaseName();
            return C626135u.A00(super.A0A(), this.A00, this.A01, databaseName);
        } catch (SQLiteException e) {
            Log.e("failed to open writable daily metrics store", e);
            String databaseName2 = getDatabaseName();
            return C626135u.A00(super.A0A(), this.A00, this.A01, databaseName2);
        }
    }

    public final void A0G(SQLiteDatabase sQLiteDatabase) {
        Log.i("DailyMetricsDbHelper/createDB");
        A0H(sQLiteDatabase, "community_home_action_logging", "DROP TABLE IF EXISTS community_home_action_logging", "CREATE TABLE community_home_action_logging(jid_row_id INTEGER PRIMARY KEY, home_view_count INTEGER NOT NULL DEFAULT 0, home_group_navigation_count INTEGER NOT NULL DEFAULT 0, home_group_discovery_count INTEGER NOT NULL DEFAULT 0, home_group_join_count INTEGER NOT NULL DEFAULT 0)");
        A0H(sQLiteDatabase, "poll_event_logging", "DROP TABLE IF EXISTS poll_event_logging", "CREATE TABLE poll_event_logging(poll_id INTEGER PRIMARY KEY, poll_votes INTEGER NOT NULL DEFAULT 0, poll_votes_changed INTEGER NOT NULL DEFAULT 0, poll_vote_deletes INTEGER NOT NULL DEFAULT 0,option_count INTEGER NOT NULL DEFAULT 0, users_participated INTEGER NOT NULL DEFAULT 0, poll_creation_ds INTEGER NOT NULL DEFAULT 0, group_size_bucket INTEGER NOT NULL DEFAULT 0, is_a_group_flag INTEGER NOT NULL DEFAULT 0)");
        A0H(sQLiteDatabase, "pnh_daily_event_logging", "DROP TABLE IF EXISTS pnh_daily_event_logging", "CREATE TABLE pnh_daily_event_logging(community_id TEXT NOT NULL, type_of_subgroup INTEGER NOT NULL, reaction_open_tray_count INTEGER NOT NULL DEFAULT 0, reaction_delete_count INTEGER NOT NULL DEFAULT 0, pnh_indicator_clicks_chat INTEGER NOT NULL DEFAULT 0, pnh_indicator_clicks_info_screen INTEGER NOT NULL DEFAULT 0, PRIMARY KEY (community_id, type_of_subgroup))");
        A0H(sQLiteDatabase, "comments_event_logging", "DROP TABLE IF EXISTS comments_event_logging", "CREATE TABLE comments_event_logging (comment_space_id TEXT PRIMARY KEY, comment_parent_group_id TEXT NOT NULL, comments INTEGER NOT NULL DEFAULT 0, comment_deletes INTEGER NOT NULL DEFAULT 0, accumulated_comments INTEGER NOT NULL DEFAULT 0, group_size_bucket INTEGER NOT NULL DEFAULT 0, cag_message_sent_ds INTEGER NOT NULL DEFAULT 0)");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("DailyMetricsDbHelper/onCreate; version=6");
        A0G(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.i("DailyMetricsDbHelper/onUpgrade");
        A0G(sQLiteDatabase);
    }

    public final void A0H(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        try {
            sQLiteDatabase.execSQL(str2);
            sQLiteDatabase.execSQL(str3);
        } catch (SQLiteException e) {
            C55682qk r2 = this.A02;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Issue recreating ");
            A0o.append(str);
            r2.A09("DailyMetricsDbHelper/recreateActionTable", AnonymousClass000.A0X(" table", A0o), e);
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("DailyMetricsDbHelper/failed to recreate ");
            A0o2.append(str);
            C18260x0.A15(" logging table", A0o2, e);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DailyMetricsDbHelper/downgrade from ");
        A0o.append(i);
        C18260x0.A0y(" to ", A0o, i2);
        onCreate(sQLiteDatabase);
    }
}
