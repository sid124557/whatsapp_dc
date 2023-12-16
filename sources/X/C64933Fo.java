package X;

import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.3Fo  reason: invalid class name and case insensitive filesystem */
public class C64933Fo implements AnonymousClass664 {
    public final AnonymousClass1RF A00;
    public final AnonymousClass2W8 A01;
    public final AnonymousClass4FV A02;

    public void BQV() {
        C71933cu r2;
        try {
            AnonymousClass1RF r4 = this.A00;
            AnonymousClass4GK A0B = r4.get();
            try {
                try {
                    r2 = new C71933cu(((AnonymousClass3H0) A0B).A03.A0E("SELECT community_id, type_of_subgroup, reaction_open_tray_count, reaction_delete_count, pnh_indicator_clicks_chat, pnh_indicator_clicks_info_screen FROM pnh_daily_event_logging", "get_pnh_daily_action_counts", (String[]) null), new AnonymousClass4IG(this.A01, 2));
                    while (r2.hasNext()) {
                        C25041Zs r1 = (C25041Zs) r2.next();
                        if (r1 != null) {
                            this.A02.BhA(r1);
                        }
                    }
                    r2.close();
                } catch (Exception e) {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "PollDailyActionLoggingStore/getWamPnhDaily failure: ", e);
                }
                A0B.close();
                Log.i("DailyMetricsDbHelper/recreating pnh_daily_event_logging table");
                r4.A0H(r4.BEc().A00, "pnh_daily_event_logging", "DROP TABLE IF EXISTS pnh_daily_event_logging", "CREATE TABLE pnh_daily_event_logging(community_id TEXT NOT NULL, type_of_subgroup INTEGER NOT NULL, reaction_open_tray_count INTEGER NOT NULL DEFAULT 0, reaction_delete_count INTEGER NOT NULL DEFAULT 0, pnh_indicator_clicks_chat INTEGER NOT NULL DEFAULT 0, pnh_indicator_clicks_info_screen INTEGER NOT NULL DEFAULT 0, PRIMARY KEY (community_id, type_of_subgroup))");
                return;
            } catch (Throwable th) {
                A0B.close();
                throw th;
            }
            throw th;
        } catch (SQLiteException e2) {
            Log.e("PnhDailyEventLoggerDailyCron/failed to send pnh daily actions", e2);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public C64933Fo(AnonymousClass1RF r1, AnonymousClass2W8 r2, AnonymousClass4FV r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String BDW() {
        return "PnhDailyEventLoggerDailyCron";
    }
}
