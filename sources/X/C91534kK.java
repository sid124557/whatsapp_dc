package X;

import com.whatsapp.newsletter.NewsletterInfoViewModel$fetchPendingAdmins$1;

/* renamed from: X.4kK  reason: invalid class name and case insensitive filesystem */
public final class C91534kK extends AnonymousClass10p {
    public AnonymousClass1RL A00;
    public AnonymousClass3ZH A01;
    public final C06270Wx A02;
    public final C06270Wx A03;
    public final AnonymousClass08M A04 = AnonymousClass08M.A01();
    public final AnonymousClass08M A05;
    public final AnonymousClass08M A06;
    public final C94174qF A07;
    public final C64773Ex A08;
    public final C56982ss A09;
    public final C56662sM A0A;
    public final C103605Nq A0B;
    public final C103985Pe A0C;

    public final void A0F() {
        C94174qF r3 = this.A07;
        AnonymousClass3ZH r2 = this.A01;
        C1238269x r1 = new C1238269x(this, 1);
        C86604Kt.A1R(r3.A00);
        r3.A00 = null;
        C94154pz r0 = new C94154pz(r3, r2);
        r3.A02(r1, r0);
        r3.A00 = r0;
    }

    public final void A0G() {
        C56982ss r1 = this.A09;
        AnonymousClass3ZH r5 = this.A01;
        AnonymousClass31A A002 = C56982ss.A00(r1, r5.A0H);
        C162457s7.A0K(A002, "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo");
        AnonymousClass1RL r3 = (AnonymousClass1RL) A002;
        this.A00 = r3;
        AnonymousClass08M r2 = this.A06;
        if (r3 == null) {
            throw C18270x1.A0S("newsletterInfo");
        }
        String str = r3.A0H;
        String str2 = r3.A0E;
        boolean z = r3.A0L;
        C372821q r4 = r3.A07;
        boolean A0L = r3.A0L();
        boolean A003 = this.A0C.A00(r3);
        AnonymousClass1RL r0 = this.A00;
        if (r0 == null) {
            throw C18270x1.A0S("newsletterInfo");
        }
        r2.A0G(new AnonymousClass5TC(r4, r5, str, str2, r0.A05, z, A0L, A003));
        A0F();
    }

    public final void A0I(boolean z) {
        C372821q r3;
        if (z) {
            r3 = C372821q.GUEST;
        } else {
            r3 = C372821q.SUBSCRIBED;
        }
        AnonymousClass08M r1 = this.A06;
        AnonymousClass5TC r0 = (AnonymousClass5TC) r1.A07();
        if (r0 != null) {
            AnonymousClass3ZH r4 = r0.A02;
            String str = r0.A04;
            String str2 = r0.A03;
            boolean z2 = r0.A05;
            boolean z3 = r0.A07;
            boolean z4 = r0.A06;
            long j = r0.A00;
            C162457s7.A0J(r3, 4);
            r1.A0G(new AnonymousClass5TC(r3, r4, str, str2, j, z2, z3, z4));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91534kK(C39512Cg r2, C94174qF r3, C64773Ex r4, C56982ss r5, AnonymousClass3ZH r6, C56662sM r7, C95814uZ r8, C103605Nq r9, C103985Pe r10, AnonymousClass4FS r11) {
        super(r2, r8, r11);
        C18260x0.A0d(r2, r11, r5, r10);
        C18260x0.A0W(r9, r7, r4);
        this.A07 = r3;
        this.A09 = r5;
        this.A0C = r10;
        this.A0B = r9;
        this.A0A = r7;
        this.A08 = r4;
        this.A01 = r6;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A06 = A012;
        this.A03 = A012;
        AnonymousClass08M A013 = AnonymousClass08M.A01();
        this.A05 = A013;
        this.A02 = A013;
    }

    public final void A0H(C95804uY r5) {
        C616131n.A02((C85494Gl) null, new NewsletterInfoViewModel$fetchPendingAdmins$1(r5, this, (C84814Du) null), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 3);
    }
}
