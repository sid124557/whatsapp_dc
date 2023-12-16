package X;

/* renamed from: X.3O3  reason: invalid class name */
public final class AnonymousClass3O3 implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C56972sr A00;
    public final AnonymousClass1VX A01;

    public void AyD(C55032pg r11, C624134x r12) {
        C18270x1.A14(r12, r11);
        if (r12 instanceof C30381mM) {
            C30381mM r122 = (C30381mM) r12;
            C95804uY r9 = r122.A01;
            if (r9 != null) {
                long j = r122.A00;
                String str = r122.A03;
                String str2 = r122.A02;
                AnonymousClass1A4 r4 = r11.A00;
                AnonymousClass1DD r2 = ((AnonymousClass1EU) r4.A00).newsletterAdminInviteMessage_;
                if (r2 == null) {
                    r2 = AnonymousClass1DD.DEFAULT_INSTANCE;
                }
                C130546c9 A0H = r2.A0H();
                AnonymousClass1DD r6 = (AnonymousClass1DD) C18320x8.A0C(A0H);
                r6.bitField0_ |= 16;
                r6.inviteExpiration_ = j / ((long) 1000);
                if (str != null) {
                    AnonymousClass1DD r1 = (AnonymousClass1DD) C18320x8.A0C(A0H);
                    r1.bitField0_ |= 2;
                    r1.newsletterName_ = str;
                }
                String A0g = C18300x5.A0g(A0H, r9);
                AnonymousClass1DD r13 = (AnonymousClass1DD) A0H.A00;
                A0g.getClass();
                r13.bitField0_ |= 1;
                r13.newsletterJid_ = A0g;
                if (!(str2 == null || str2.length() == 0)) {
                    AnonymousClass1DD r14 = (AnonymousClass1DD) C18320x8.A0C(A0H);
                    r14.bitField0_ |= 8;
                    r14.caption_ = str2;
                }
                C614630w A0y = r122.A0y();
                if (!(A0y == null || A0y.A09() == null)) {
                    C172548Lq A09 = C18270x1.A09(A0H, A0y.A09());
                    AnonymousClass1DD r15 = (AnonymousClass1DD) A0H.A00;
                    r15.bitField0_ |= 4;
                    r15.jpegThumbnail_ = A09;
                }
                AnonymousClass1EU A0T = C18290x4.A0T(r4);
                AnonymousClass1DD r0 = (AnonymousClass1DD) A0H.A06();
                r0.getClass();
                A0T.newsletterAdminInviteMessage_ = r0;
                A0T.bitField1_ |= Integer.MIN_VALUE;
                return;
            }
            throw AnonymousClass24A.A00(0);
        }
        throw AnonymousClass001.A0c("FMessageNewsletterAdminInviteProtobuf/not supported message");
    }

    public C624134x BgW(C55962rC r15) {
        C162457s7.A0J(r15, 0);
        AnonymousClass1EU r2 = r15.A0B;
        if ((r2.bitField1_ & Integer.MIN_VALUE) == 0) {
            return null;
        }
        AnonymousClass1DD r4 = r2.newsletterAdminInviteMessage_;
        if (r4 == null) {
            r4 = AnonymousClass1DD.DEFAULT_INSTANCE;
        }
        C30381mM r5 = new C30381mM((C95804uY) null, r15.A0D, (String) null, (String) null, r15.A05, 0);
        C95804uY A012 = C95804uY.A03.A01(r4.newsletterJid_);
        if (A012 != null) {
            r5.A01 = A012;
            r5.A03 = r4.newsletterName_;
            r5.A00 = r4.inviteExpiration_ * ((long) 1000);
            r5.A02 = r4.caption_;
            byte[] A07 = r4.jpegThumbnail_.A07();
            C162457s7.A0H(A07);
            if (A07.length != 0) {
                r5.A1D(1);
                C614630w A0y = r5.A0y();
                if (A0y != null) {
                    A0y.A04(A07, r15.A0O);
                }
            }
            return r5;
        }
        throw AnonymousClass24W.A01(0, "FMessageNewsletterAdminInviteProtobuf/unexpected empty newsletterJid");
    }

    public AnonymousClass3O3(C56972sr r1, AnonymousClass1VX r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
