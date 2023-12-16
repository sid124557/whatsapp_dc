package X;

/* renamed from: X.5pw  reason: invalid class name and case insensitive filesystem */
public class C116225pw implements C85104Ey {
    public final /* synthetic */ AnonymousClass4UA A00;

    public C116225pw(AnonymousClass4UA r1) {
        this.A00 = r1;
    }

    public long BDi() {
        return 3000;
    }

    public void BWZ(C624134x r4) {
        AnonymousClass4UA r0 = this.A00;
        String str = r0.A07;
        C149437Ml r1 = r0.A03;
        if (r1 != null && str != null && str.equals(r1.A02)) {
            r1.A00 = r4;
        }
    }

    public void BWa(C624134x r5) {
        AnonymousClass4UA r3 = this.A00;
        C149437Ml r0 = r3.A03;
        if (r0 != null && r0.A00 == r5) {
            r3.A0M((C55592qb) null, true, false);
        }
    }

    public boolean Bo7() {
        AnonymousClass4UA r1 = this.A00;
        C55592qb r0 = r1.A05;
        if (r0 == null || r0.A01() || r1.A00 != 3) {
            return false;
        }
        return true;
    }
}
