package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Tu  reason: invalid class name and case insensitive filesystem */
public class C68603Tu implements C85084Ew {
    public final C69263Wi A00;
    public final C65203Gp A01;
    public final C64773Ex A02;
    public final C29421in A03;
    public final AnonymousClass4FS A04;

    public void BcP(UserJid userJid, String str, long j) {
        AnonymousClass3ZH A07 = this.A02.A07(userJid);
        if (A07 != null) {
            A07.A0X = str;
            A07.A0D = j;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("getstatus/received  jid=");
            A0o.append(userJid);
            A0o.append(" status=");
            A0o.append(A07.A0X);
            A0o.append(" timestamp=");
            C18260x0.A1I(A0o, A07.A0D);
            C70203a7.A00(this.A04, this, A07, 40);
        }
    }

    public C68603Tu(C69263Wi r1, C65203Gp r2, C64773Ex r3, C29421in r4, AnonymousClass4FS r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public void BQk(UserJid userJid) {
        C18260x0.A1R(AnonymousClass001.A0o(), "getstatus/delete jid=", userJid);
        AnonymousClass3ZH A07 = this.A02.A07(userJid);
        if (A07 != null) {
            A07.A0X = null;
            A07.A0D = 0;
            C70203a7.A00(this.A04, this, A07, 40);
        }
    }

    public void BS3(UserJid userJid, int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("getstatus/failed jid=");
        A0o.append(userJid);
        C18260x0.A0z(" code=", A0o, i);
    }

    public void BX9(UserJid userJid) {
        C18260x0.A1R(AnonymousClass001.A0o(), "getstatus/nochange jid=", userJid);
    }
}
