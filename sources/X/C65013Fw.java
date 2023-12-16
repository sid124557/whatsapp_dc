package X;

import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.3Fw  reason: invalid class name and case insensitive filesystem */
public class C65013Fw implements AnonymousClass664 {
    public final C55682qk A00;
    public final AnonymousClass1RF A01;
    public final C48592f9 A02;
    public final C41412Kd A03;
    public final AnonymousClass4FV A04;

    public void BQV() {
        C71933cu r3;
        Log.i("CommunityEventLoggerDailyCron/sendCommunityHomeActionLogging()");
        try {
            AnonymousClass1RF r4 = this.A01;
            AnonymousClass4GK A0B = r4.get();
            try {
                r3 = new C71933cu(((AnonymousClass3H0) A0B).A03.A0E("SELECT jid_row_id, home_view_count, home_group_navigation_count, home_group_discovery_count, home_group_join_count FROM community_home_action_logging", "get_community_action_counts", (String[]) null), new AnonymousClass4IG(this.A03, 1));
                boolean z = false;
                while (r3.hasNext()) {
                    AnonymousClass1ZQ r1 = (AnonymousClass1ZQ) r3.next();
                    if (r1 != null) {
                        this.A04.BhA(r1);
                        z = true;
                    }
                }
                r3.close();
                A0B.close();
                if (z) {
                    Log.i("DailyMetricsDbHelper/recreating community table");
                    r4.A0H(r4.BEc().A00, "community_home_action_logging", "DROP TABLE IF EXISTS community_home_action_logging", "CREATE TABLE community_home_action_logging(jid_row_id INTEGER PRIMARY KEY, home_view_count INTEGER NOT NULL DEFAULT 0, home_group_navigation_count INTEGER NOT NULL DEFAULT 0, home_group_discovery_count INTEGER NOT NULL DEFAULT 0, home_group_join_count INTEGER NOT NULL DEFAULT 0)");
                }
                C48592f9 r19 = this.A02;
                long min = (long) Math.min(r19.A00().getInt("community_tab_no_action_view", 0), r19.A00().getInt("community_tab_daily_views", 0) + r19.A00().getInt("community_tab_views_via_context_menu", 0));
                long j = (long) r19.A00().getInt("community_tab_group_navigation", 0);
                long j2 = (long) r19.A00().getInt("community_tab_daily_views", 0);
                long j3 = (long) r19.A00().getInt("community_tab_to_home_views", 0);
                long j4 = (long) r19.A00().getInt("community_tab_views_via_context_menu", 0);
                if (min != 0 || j != 0 || j2 != 0 || j4 != 0 || j3 != 0) {
                    AnonymousClass1ZR r0 = new AnonymousClass1ZR();
                    Long valueOf = Long.valueOf(min);
                    r0.A00 = valueOf;
                    r0.A01 = Long.valueOf(j);
                    r0.A03 = Long.valueOf(j2);
                    r0.A02 = Long.valueOf(j3);
                    r0.A04 = Long.valueOf(j4);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("CommunityEventLoggerDailyCron/sendCommunityTabLogging/no action views = ");
                    A0o.append(valueOf);
                    A0o.append("/navigation = ");
                    A0o.append(r0.A01);
                    A0o.append("/ view count = ");
                    A0o.append(r0.A03);
                    A0o.append("/ tab to home = ");
                    A0o.append(r0.A02);
                    A0o.append("/ view count from context menu = ");
                    C18260x0.A0m(r0.A04, A0o);
                    this.A04.BhA(r0);
                    C18310x6.A0E(r19.A00(), "community_tab_daily_views").remove("community_tab_views_via_context_menu").remove("community_tab_to_home_views").remove("community_tab_group_navigation").remove("community_tab_no_action_view").commit();
                    return;
                }
                return;
            } catch (Throwable th) {
                A0B.close();
                throw th;
            }
            throw th;
        } catch (SQLiteException e) {
            this.A00.A09("CommunityEventLoggerDailyCron/send", "Issue sending community action logs", e);
            Log.e("CommunityEventLoggerDailyCron/failed to send home actions", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public C65013Fw(C55682qk r1, AnonymousClass1RF r2, C48592f9 r3, C41412Kd r4, AnonymousClass4FV r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public String BDW() {
        return "CommunityEventLoggerDailyCron";
    }
}
