package X;

import com.whatsapp.cron.daily.RandomizedDailyCronWorker;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3DH  reason: invalid class name */
public class AnonymousClass3DH implements AnonymousClass66U {
    public final C56612sH A00;
    public final AnonymousClass33p A01;
    public final C72303dV A02;
    public final C34171uL A03;
    public final C183538qC A04;

    public synchronized void A00(boolean z) {
        long j;
        AnonymousClass33p r6 = this.A01;
        long j2 = AnonymousClass0x2.A0F(r6).getLong("next_randomized_daily_cron", 0);
        long A0H = this.A00.A0H();
        if (j2 <= 0 || j2 - A0H > 86400000) {
            j = (long) AnonymousClass0x9.A1C().nextInt(43200000);
        } else if (j2 > A0H) {
            C107175ap.A03(j2);
            if (z) {
                C18260x0.A0M(r6, "next_randomized_daily_cron", j2);
                AnonymousClass0Aw r3 = new AnonymousClass0Aw(RandomizedDailyCronWorker.class);
                r3.A02(Math.abs(j2 - A0H), TimeUnit.MILLISECONDS);
                r3.A06("tag.whatsapp.cron.daily.randomized");
                C72333dY.A07(AnonymousClass0x9.A0I(r3), this.A03, "tag.whatsapp.cron.daily.randomized");
            }
        } else {
            if (C72303dV.A00(this.A02)) {
                Iterator A0j = AnonymousClass0x2.A0j(this.A04);
                while (A0j.hasNext()) {
                    AnonymousClass664 r4 = (AnonymousClass664) A0j.next();
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("RandomizedDailyCronExecutor/executeDailyCron: ");
                    C18260x0.A1J(A0o, r4.BDW());
                    r4.BQV();
                }
            }
            j2 += 86400000;
            if (j2 < A0H) {
                j = j2 % 86400000;
            }
            C107175ap.A03(j2);
            C18260x0.A0M(r6, "next_randomized_daily_cron", j2);
            AnonymousClass0Aw r32 = new AnonymousClass0Aw(RandomizedDailyCronWorker.class);
            r32.A02(Math.abs(j2 - A0H), TimeUnit.MILLISECONDS);
            r32.A06("tag.whatsapp.cron.daily.randomized");
            C72333dY.A07(AnonymousClass0x9.A0I(r32), this.A03, "tag.whatsapp.cron.daily.randomized");
        }
        j2 = j + A0H;
        C107175ap.A03(j2);
        C18260x0.A0M(r6, "next_randomized_daily_cron", j2);
        AnonymousClass0Aw r322 = new AnonymousClass0Aw(RandomizedDailyCronWorker.class);
        r322.A02(Math.abs(j2 - A0H), TimeUnit.MILLISECONDS);
        r322.A06("tag.whatsapp.cron.daily.randomized");
        C72333dY.A07(AnonymousClass0x9.A0I(r322), this.A03, "tag.whatsapp.cron.daily.randomized");
    }

    public void BMd() {
        A00(false);
    }

    public AnonymousClass3DH(C56612sH r1, AnonymousClass33p r2, C72303dV r3, C34171uL r4, C183538qC r5) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
    }

    public String BDW() {
        return "RandomizedDailyCronExecutor";
    }

    public /* synthetic */ void BMe() {
    }
}
