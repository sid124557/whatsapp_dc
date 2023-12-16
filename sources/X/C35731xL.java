package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1xL  reason: invalid class name and case insensitive filesystem */
public final class C35731xL extends C34771vn {
    public final UserJid A00;
    public final AnonymousClass56S A01;
    public final C34821vs A02;

    public C35731xL(AnonymousClass36K r10) {
        AnonymousClass36K r2 = r10;
        String[] A0Z = AnonymousClass36K.A0Z(r10, "notification");
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r2, String.class, A0R, A0S, "psa", A0Z, false);
        this.A00 = (UserJid) C626836d.A06(r2, UserJid.class, A0R, A0S, (Object) null, AnonymousClass0x9.A1b(), false);
        this.A02 = (C34821vs) C626836d.A04(r10, C86304Jp.A00(95), new String[]{"surfaces"});
        this.A01 = (AnonymousClass56S) C626836d.A02(r10, C86304Jp.A00(96), 0);
        this.A00 = r10;
    }
}
