package X;

/* renamed from: X.5nu  reason: invalid class name and case insensitive filesystem */
public final class C114975nu implements AnonymousClass4DE {
    public final /* synthetic */ AnonymousClass1RL A00;
    public final /* synthetic */ C103665Nw A01;
    public final /* synthetic */ C84814Du A02;

    public C114975nu(AnonymousClass1RL r1, C103665Nw r2, C84814Du r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void BLy(C95804uY r3, AnonymousClass21F r4, Throwable th) {
        if (!C162457s7.A0P(r3, this.A00.A05())) {
            return;
        }
        if (r4 == AnonymousClass21F.FOLLOW || r4 == AnonymousClass21F.UNFOLLOW) {
            this.A01.A00.A07(this);
            this.A02.BkD(new C988353k(r4, th));
        }
    }

    public void BM1(C95804uY r4, AnonymousClass21F r5) {
        C372821q r2;
        if (C162457s7.A0P(r4, this.A00.A05())) {
            if (r5 == AnonymousClass21F.FOLLOW) {
                r2 = C372821q.SUBSCRIBED;
            } else if (r5 == AnonymousClass21F.UNFOLLOW) {
                r2 = C372821q.GUEST;
            } else {
                return;
            }
            this.A01.A00.A07(this);
            this.A02.BkD(new C988253j(r2));
        }
    }
}
