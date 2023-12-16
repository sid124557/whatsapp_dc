package X;

/* renamed from: X.3Fq  reason: invalid class name and case insensitive filesystem */
public final class C64953Fq implements AnonymousClass664 {
    public final C183538qC A00;
    public final C183538qC A01;
    public final C183538qC A02;

    public void BQV() {
        boolean A002 = ((C104745Se) this.A02.get()).A00();
        C183538qC r4 = this.A00;
        if (!A002) {
            AnonymousClass21S r2 = AnonymousClass21S.A0H;
            if (((C56042rK) r4.get()).A05(r2)) {
                ((C56042rK) r4.get()).A03(r2, false);
                return;
            }
            return;
        }
        AnonymousClass21S r22 = AnonymousClass21S.A0H;
        C18260x0.A1N(AnonymousClass001.A0o(), "FbAccountManager/hasUserConsented called by ", r22);
        if (C18280x3.A1W(((C56042rK) r4.get()).A01.A03.A01(), "pref_xfamily_fb_account_user_consented")) {
            C24481Xo r1 = new C24481Xo();
            r1.A00 = Boolean.valueOf(((C56042rK) r4.get()).A05(r22));
            r1.A01 = ((C56042rK) r4.get()).A01(r22);
            ((AnonymousClass4FV) this.A01.get()).BhD(r1);
        }
    }

    public C64953Fq(C183538qC r1, C183538qC r2, C183538qC r3) {
        C18260x0.A0V(r1, r2, r3);
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public String BDW() {
        return "XFamilyCrosspostingDailyStatsCron";
    }
}
