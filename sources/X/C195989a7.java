package X;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9a7  reason: invalid class name and case insensitive filesystem */
public class C195989a7 implements AnonymousClass4F2, AnonymousClass49Y {
    public boolean A00;
    public boolean A01;
    public final C69263Wi A02;
    public final C29411im A03;
    public final C29441ip A04;
    public final C1906899l A05;
    public final C49622gp A06;
    public final C620933l A07;
    public final AnonymousClass9bO A08;
    public final AnonymousClass9b0 A09;
    public final C160757oG A0A = C160757oG.A00("PaymentsConnectivityManager", "network", "COMMON");

    public synchronized void A01() {
        this.A01 = true;
    }

    public synchronized boolean A02() {
        return this.A01;
    }

    public synchronized void BPq(C59622xD r5) {
        C160757oG r3 = this.A0A;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Connectivity connected: ");
        boolean z = r5.A01;
        C1899593h.A1L(r3, A0o, z);
        if (this.A00 && !z) {
            A00();
        }
    }

    public synchronized void BUB() {
        C1906899l r0;
        this.A0A.A06("ChatConnectivity connected");
        if (this.A00 && (r0 = this.A05) != null && r0.A0E()) {
            C620933l r1 = this.A07;
            if (r1.A01.A0H() - AnonymousClass0x2.A0B(r1.A03(), "payments_pending_transactions_last_sync_time") > C86654Ky.A09(TimeUnit.DAYS)) {
                this.A08.A00(new AnonymousClass9M0(this, 0));
            }
        }
    }

    public synchronized void BUD() {
        this.A0A.A06("ChatConnectivity disconnected");
        if (this.A00) {
            A00();
        }
    }

    public final void A00() {
        Map map;
        Set keySet;
        AnonymousClass4EY r2;
        C49622gp r6 = this.A06;
        synchronized (r6) {
            map = r6.A00;
            keySet = map.keySet();
        }
        for (Object next : keySet) {
            synchronized (r6) {
                r2 = (AnonymousClass4EY) map.get(next);
            }
            AnonymousClass34V r1 = new AnonymousClass34V(7);
            synchronized (r6) {
                r6.A02.remove(next);
            }
            r2.BaB(r1);
        }
        r6.A00();
        this.A01 = false;
    }

    public C195989a7(C69263Wi r4, C29411im r5, C29441ip r6, C1906899l r7, C49622gp r8, C620933l r9, AnonymousClass9bO r10, AnonymousClass9b0 r11) {
        this.A02 = r4;
        this.A03 = r5;
        this.A07 = r9;
        this.A05 = r7;
        this.A06 = r8;
        this.A09 = r11;
        this.A04 = r6;
        this.A08 = r10;
    }

    public /* synthetic */ void BUC() {
    }

    public /* synthetic */ void BUE() {
    }

    public /* synthetic */ void BUF() {
    }
}
