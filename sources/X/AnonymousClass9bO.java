package X;

/* renamed from: X.9bO  reason: invalid class name */
public class AnonymousClass9bO implements AnonymousClass4EY {
    public int A00;
    public int A01;
    public final C56612sH A02;
    public final AnonymousClass36F A03;
    public final C1906899l A04;
    public final C620933l A05;
    public final C1907099n A06;
    public final AnonymousClass9U4 A07;
    public final C160757oG A08 = C160757oG.A00("PaymentUnfinishedTransactionsSyncer", "network", "COMMON");
    public final AnonymousClass4FS A09;

    public synchronized void A00(C202519m9 r3) {
        if (!C1899693i.A0x(this.A06) || !this.A04.A0E()) {
            this.A08.A06("skipped as account setup is incomplete.");
        } else {
            this.A09.BkM(new C200009hd(r3, this));
        }
    }

    public void Ba4(AnonymousClass34V r4) {
        C1899593h.A1G(this.A08, r4, "onRequestError: ", AnonymousClass001.A0o());
        C203499no A062 = AnonymousClass9U4.A06(this.A07);
        if (A062 != null) {
            A062.BK0(r4, 10);
        }
    }

    public void BaB(AnonymousClass34V r4) {
        C1899593h.A1G(this.A08, r4, "onResponseError: ", AnonymousClass001.A0o());
        C203499no A062 = AnonymousClass9U4.A06(this.A07);
        if (A062 != null) {
            A062.BK0(r4, 10);
        }
    }

    public void BaC(AnonymousClass2Oi r6) {
        C203499no A062 = AnonymousClass9U4.A06(this.A07);
        if (A062 != null) {
            A062.BK0((AnonymousClass34V) null, 10);
        }
        if (r6.A02) {
            int i = this.A00 + 1;
            this.A00 = i;
            C160757oG r4 = this.A08;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("finished syncing ");
            A0o.append(i);
            A0o.append(" transactions; total to sync: ");
            C1899593h.A1K(r4, A0o, this.A01);
            if (this.A01 == this.A00) {
                long A0H = this.A02.A0H();
                C18270x1.A0i(C620933l.A00(this.A05), "payments_pending_transactions_last_sync_time", A0H);
                r4.A06(AnonymousClass000.A0Z("updatePendingTransactionsLastSyncTimeMilli to: ", AnonymousClass001.A0o(), A0H));
            }
        }
    }

    public AnonymousClass9bO(C56612sH r4, AnonymousClass36F r5, C1906899l r6, C620933l r7, C1907099n r8, AnonymousClass9U4 r9, AnonymousClass4FS r10) {
        this.A02 = r4;
        this.A09 = r10;
        this.A07 = r9;
        this.A05 = r7;
        this.A04 = r6;
        this.A06 = r8;
        this.A03 = r5;
    }
}
