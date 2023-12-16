package X;

import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;

/* renamed from: X.113  reason: invalid class name */
public final class AnonymousClass113 extends C05550Ty {
    public AnonymousClass2Rk A00;
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final AnonymousClass2CP A03;
    public final AnonymousClass33T A04;
    public final AnonymousClass4FW A05 = new C86164Jb(this, 4);
    public final C27991fJ A06;
    public final RtaXmppClient A07;

    public AnonymousClass113(AnonymousClass2CP r3, AnonymousClass33T r4, C27991fJ r5, RtaXmppClient rtaXmppClient) {
        C18260x0.A0a(r4, r3, r5, 2);
        this.A07 = rtaXmppClient;
        this.A04 = r4;
        this.A03 = r3;
        this.A06 = r5;
    }

    public final boolean A0D(C624134x r3) {
        String str;
        AnonymousClass2z0 r0;
        C42602Ou A11 = r3.A11();
        if (A11 == null || (r0 = A11.A02) == null || (str = r0.A01) == null) {
            str = r3.A1J.A01;
        }
        C162457s7.A0H(str);
        AnonymousClass2Rk r02 = this.A00;
        if (r02 != null) {
            return r02.A04.contains(str);
        }
        return false;
    }
}
