package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8Ec  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C170678Ec implements C181768nI {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C108815db A01;
    public final /* synthetic */ C181768nI A02;
    public final /* synthetic */ C152967aS A03;
    public final /* synthetic */ UserJid A04;
    public final /* synthetic */ Integer A05;

    public final void BVU(AnonymousClass8EI r9) {
        C152967aS r7 = this.A03;
        C108815db r6 = this.A01;
        int i = this.A00;
        UserJid userJid = this.A04;
        Integer num = this.A05;
        C181768nI r2 = this.A02;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("loadProductImage failed  ");
        A0o.append(r6.A04);
        C18260x0.A0w(" quality ", A0o, i);
        if (!(userJid == null || num == null)) {
            r7.A02.A00(userJid, num.intValue());
        }
        if (r2 != null) {
            r2.BVU(r9);
        }
    }

    public /* synthetic */ C170678Ec(C108815db r1, C181768nI r2, C152967aS r3, UserJid userJid, Integer num, int i) {
        this.A03 = r3;
        this.A01 = r1;
        this.A00 = i;
        this.A04 = userJid;
        this.A05 = num;
        this.A02 = r2;
    }
}
