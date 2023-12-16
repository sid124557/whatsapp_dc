package X;

import com.whatsapp.util.Log;

/* renamed from: X.2W9  reason: invalid class name */
public class AnonymousClass2W9 {
    public final AnonymousClass1RF A00;

    public synchronized boolean A00(int i, long j) {
        String str;
        C69833Yo Axl;
        boolean z;
        if (i == 0) {
            str = "poll_votes";
        } else if (i == 1) {
            str = "poll_votes_changed";
        } else if (i == 2) {
            str = "poll_vote_deletes";
        } else if (i != 3) {
            str = "users_participated";
        } else {
            str = "option_count";
        }
        C85284Fq A0C = this.A00.A0C();
        try {
            Axl = A0C.Axl();
            C56862sg r2 = ((AnonymousClass3H0) A0C).A03;
            z = false;
            if (!(!C626235v.A04(r2, "poll_event_logging"))) {
                Log.e("PollDailyActionLoggingStore/incrementCount: table does not exist");
            } else {
                StringBuilder A0p = C18300x5.A0p("poll_event_logging");
                C18300x5.A1O(A0p, str);
                A0p.append(str);
                AnonymousClass0x2.A1P(A0p, " + ?");
                A0p.append("poll_id");
                C56702sQ A0G = r2.A0G(AnonymousClass000.A0X(" = ?", A0p), "update_poll_action");
                A0G.A06(1, 1);
                A0G.A06(2, j);
                int A002 = A0G.A00();
                Axl.A00();
                if (A002 != 0) {
                    z = true;
                }
            }
            Axl.close();
            A0C.close();
        } catch (Throwable th) {
            try {
                A0C.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        return z;
        throw th;
    }

    public AnonymousClass2W9(AnonymousClass1RF r1) {
        this.A00 = r1;
    }
}
