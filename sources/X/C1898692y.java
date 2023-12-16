package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.92y  reason: invalid class name and case insensitive filesystem */
public class C1898692y implements AnonymousClass4CM {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C1898692y(AnonymousClass3XA r1, AnonymousClass5T7 r2, UserJid userJid, int i) {
        this.A03 = i;
        this.A00 = r2;
        this.A01 = userJid;
        this.A02 = r1;
    }

    public void BU1() {
        Object valueOf;
        int i = this.A03;
        AnonymousClass3XA r2 = (AnonymousClass3XA) this.A02;
        C105035Th r1 = ((AnonymousClass5T7) this.A00).A03;
        if (i != 0) {
            valueOf = r1.A00((C108985dt) null);
        } else {
            valueOf = Boolean.valueOf(r1.A03((C108985dt) null));
        }
        r2.AwB(valueOf);
    }

    public void BU2() {
        int i;
        int i2 = this.A03;
        C620433g r4 = ((AnonymousClass5T7) this.A00).A04;
        UserJid userJid = (UserJid) this.A01;
        Object obj = this.A02;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        r4.A06(new C1898392v(obj, i, this), userJid);
    }
}
