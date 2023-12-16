package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1nV  reason: invalid class name and case insensitive filesystem */
public class C30961nV extends C30441mS {
    public UserJid A00;
    public transient C55682qk A01;

    public C30961nV(C624134x r3, AnonymousClass2z0 r4, long j) {
        this(r4, r3.A0K);
        this.A00 = j;
        this.A01 = r3.A1J.A01;
        this.A0Q = r3.A0n();
        this.A19 = r3.A19();
        this.A0r = r3.A0r;
        this.A07 = 0;
    }

    public void A1v(UserJid userJid) {
        this.A00 = userJid;
        A1w("setAdminJid");
    }

    public final void A1w(String str) {
        C55682qk r3 = this.A01;
        if (r3 != null && this.A00 == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("source=");
            A0o.append(str);
            A0o.append(" build=");
            r3.A0A("FMessageAdminRevoke/nullAdminJid", true, AnonymousClass000.A0X("beta", A0o));
        }
    }

    public C30961nV(AnonymousClass2z0 r7, long j) {
        super(r7, (byte) 64, 8, j);
    }

    public C30961nV(AnonymousClass2z0 r2, C30961nV r3, long j) {
        super(r2, r3, j);
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        A1w("constructor");
    }
}
