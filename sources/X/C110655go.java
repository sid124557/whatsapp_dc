package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5go  reason: invalid class name and case insensitive filesystem */
public final class C110655go implements C17190ui {
    public final C101195Dv A00;
    public final C104325Qn A01;
    public final UserJid A02;
    public final C103115Lp A03;
    public final AnonymousClass39E A04;

    public C110655go(C101195Dv r2, C104325Qn r3, UserJid userJid, C103115Lp r5, AnonymousClass39E r6) {
        C18260x0.A0b(userJid, r5, r2, 1);
        this.A02 = userJid;
        this.A04 = r6;
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
    }

    public C05550Ty Azr(Class cls) {
        C101195Dv r0 = this.A00;
        UserJid userJid = this.A02;
        AnonymousClass39E r10 = this.A04;
        C104325Qn r5 = this.A01;
        C103115Lp r9 = this.A03;
        C64333Db r1 = r0.A00.A03;
        C29441ip A24 = C64333Db.A24(r1);
        return new AnonymousClass4Tu(C69773Yi.A00(r1.AdE), new C154197cm(), (C104205Qb) r1.ARe.get(), r5, r1.Ai7(), A24, userJid, r9, r10);
    }

    public /* synthetic */ C05550Ty B09(AnonymousClass0N3 r2, Class cls) {
        return C86604Kt.A0K(this, cls);
    }
}
