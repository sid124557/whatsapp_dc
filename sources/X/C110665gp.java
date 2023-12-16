package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5gp  reason: invalid class name and case insensitive filesystem */
public class C110665gp implements C17190ui {
    public final C146837Bu A00;
    public final UserJid A01;
    public final AnonymousClass2z0 A02;
    public final String A03;
    public final String A04;

    public C05550Ty Azr(Class cls) {
        C146837Bu r0 = this.A00;
        AnonymousClass2z0 r11 = this.A02;
        String str = this.A04;
        String str2 = this.A03;
        UserJid userJid = this.A01;
        C118055sv r5 = r0.A00;
        C64333Db r4 = r5.A04;
        C56612sH A2p = C64333Db.A2p(r4);
        C56972sr A06 = C64333Db.A06(r4);
        C54292oU A2q = C64333Db.A2q(r4);
        C64333Db r02 = r5.A03.A1B;
        C54292oU A0U = C86614Ku.A0U(r02);
        AnonymousClass4FS A0g = C86604Kt.A0g(r02);
        AnonymousClass5LD r19 = new AnonymousClass5LD(C86634Kw.A0W(r02), (C101675Fr) r02.A00.A8N.get(), (AnonymousClass7H0) r02.A00.A8Q.get(), new C146997Ck((AnonymousClass1VX) r02.A07.get()), A0U, (C105915Wx) r02.AG3.get(), C86614Ku.A0c(r02), (C105255Ue) r02.A2Q.get(), A0g);
        C620733j A2t = C64333Db.A2t(r4);
        C55832qz A8F = C64333Db.A8F(r4);
        return new AnonymousClass4UZ(C88744aj.A00, A06, r5.A01.ABU(), r19, A2p, A2q, A2t, userJid, r11, A8F, C64333Db.A8y(r4), str, str2);
    }

    public C110665gp(C146837Bu r1, UserJid userJid, AnonymousClass2z0 r3, String str, String str2) {
        this.A02 = r3;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = userJid;
        this.A00 = r1;
    }

    public /* synthetic */ C05550Ty B09(AnonymousClass0N3 r2, Class cls) {
        return C86604Kt.A0K(this, cls);
    }
}
