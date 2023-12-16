package X;

import com.whatsapp.util.Log;

/* renamed from: X.3FY  reason: invalid class name */
public class AnonymousClass3FY implements AnonymousClass4E8 {
    public final AnonymousClass1RF A00;
    public final AnonymousClass2W9 A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass4FV A03;

    public void BQW() {
        C71933cu r2;
        if (this.A02.A0Y(C58422vE.A02, 2321)) {
            Log.i("PollStatsLoggerDailyCron/sendPollDailyActionsLogging()");
            AnonymousClass1RF r4 = this.A00;
            AnonymousClass4GK A0B = r4.get();
            try {
                try {
                    r2 = new C71933cu(((AnonymousClass3H0) A0B).A03.A0E("SELECT poll_id, poll_votes, poll_votes_changed, poll_vote_deletes, option_count, users_participated, poll_creation_ds, group_size_bucket, is_a_group_flag FROM poll_event_logging", "get_poll_action_counts", (String[]) null), new AnonymousClass4IG(this.A01, 3));
                    if (!r2.hasNext()) {
                        r2.close();
                        A0B.close();
                        return;
                    }
                    while (r2.hasNext()) {
                        C25551ah r1 = (C25551ah) r2.next();
                        if (r1 != null) {
                            this.A03.BhA(r1);
                        }
                    }
                    r2.close();
                    A0B.close();
                    r4.A0H(r4.BEc().A00, "poll_event_logging", "DROP TABLE IF EXISTS poll_event_logging", "CREATE TABLE poll_event_logging(poll_id INTEGER PRIMARY KEY, poll_votes INTEGER NOT NULL DEFAULT 0, poll_votes_changed INTEGER NOT NULL DEFAULT 0, poll_vote_deletes INTEGER NOT NULL DEFAULT 0,option_count INTEGER NOT NULL DEFAULT 0, users_participated INTEGER NOT NULL DEFAULT 0, poll_creation_ds INTEGER NOT NULL DEFAULT 0, group_size_bucket INTEGER NOT NULL DEFAULT 0, is_a_group_flag INTEGER NOT NULL DEFAULT 0)");
                    return;
                } catch (Exception e) {
                    C18260x0.A16("PollDailyActionLoggingStore/getWamPollsDailyStats: ", AnonymousClass001.A0o(), e);
                }
            } catch (Throwable th) {
                try {
                    A0B.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public AnonymousClass3FY(AnonymousClass1RF r1, AnonymousClass2W9 r2, AnonymousClass1VX r3, AnonymousClass4FV r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String BDW() {
        return "PollStatsLoggerDailyCron";
    }

    public /* synthetic */ void BQX() {
    }
}
