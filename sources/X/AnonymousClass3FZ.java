package X;

import java.util.Iterator;

/* renamed from: X.3FZ  reason: invalid class name */
public final class AnonymousClass3FZ implements AnonymousClass4E8 {
    public final C56972sr A00;
    public final C29441ip A01;
    public final C64723Er A02;
    public final AnonymousClass4FV A03;
    public final C183538qC A04;

    public void BQW() {
        if (C56972sr.A00(this.A00) != null) {
            this.A02.A01(this.A01.A0A());
            C134256ih r4 = new C134256ih();
            Iterator A0j = AnonymousClass0x2.A0j(this.A04);
            while (A0j.hasNext()) {
                C836849j r2 = (C836849j) A0j.next();
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("WamDailyEventDailyCron/populate WamDaily: ");
                AnonymousClass000.A1A(r2, A0o);
                AnonymousClass0x2.A18(A0o);
                r2.BYP(r4);
            }
            this.A03.BhA(r4);
        }
    }

    public AnonymousClass3FZ(C56972sr r1, C29441ip r2, C64723Er r3, AnonymousClass4FV r4, C183538qC r5) {
        C18260x0.A0f(r1, r4, r2, r3, r5);
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
    }

    public String BDW() {
        return "WamDailyEventDailyCron";
    }

    public /* synthetic */ void BQX() {
    }
}
