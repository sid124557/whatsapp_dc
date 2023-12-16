package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3bZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71103bZ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C46592bt A04;
    public final /* synthetic */ UserJid A05;
    public final /* synthetic */ AnonymousClass3ZC A06;
    public final /* synthetic */ AnonymousClass3ZC A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public final void run() {
        C46592bt r3 = this.A04;
        UserJid userJid = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        String str = this.A08;
        String str2 = this.A09;
        AnonymousClass3ZC r5 = this.A06;
        AnonymousClass3ZC r6 = this.A07;
        int i3 = this.A02;
        int i4 = this.A03;
        C64773Ex r0 = r3.A02;
        r0.A0A(userJid);
        r0.A0K();
        r3.A04.A0P(userJid, new AnonymousClass35K(r5, r6, str, str2, i, i2, i3, i4).A02());
    }

    public /* synthetic */ C71103bZ(C46592bt r1, UserJid userJid, AnonymousClass3ZC r3, AnonymousClass3ZC r4, String str, String str2, int i, int i2, int i3, int i4) {
        this.A04 = r1;
        this.A05 = userJid;
        this.A00 = i;
        this.A01 = i2;
        this.A08 = str;
        this.A09 = str2;
        this.A06 = r3;
        this.A07 = r4;
        this.A02 = i3;
        this.A03 = i4;
    }
}
