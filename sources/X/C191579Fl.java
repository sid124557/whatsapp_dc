package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9Fl  reason: invalid class name and case insensitive filesystem */
public class C191579Fl extends AnonymousClass94s {
    public final C64773Ex A00;
    public final C620733j A01;
    public final AnonymousClass36F A02;
    public final C195219Wq A03;

    public C191579Fl(C66663Mh r9, C64773Ex r10, C56612sH r11, C620733j r12, C66543Lv r13, AnonymousClass36F r14, AnonymousClass1VX r15, C203499no r16, C195219Wq r17, C45022Yj r18) {
        super(r9, r11, r13, r15, r16, r18);
        this.A02 = r14;
        this.A03 = r17;
        this.A00 = r10;
        this.A01 = r12;
    }

    public String A0F(String str, String str2) {
        C626936e.A06(str);
        return super.A0F(str, str2);
    }

    public void A0I(String str) {
        String str2;
        super.A0I(str);
        C624034w A05 = AnonymousClass36F.A05(this.A02, (String) null, str);
        if (A05 != null) {
            AnonymousClass9OU r7 = new AnonymousClass9OU(5);
            UserJid userJid = A05.A0D;
            if (userJid == null || (str2 = this.A00.A0A(userJid).A0L()) == null) {
                str2 = "";
            }
            C620733j r4 = this.A01;
            r7.A00 = new AnonymousClass9PN(str2, AnonymousClass9UO.A01(r4, A05.A03(), A05.A08, 0, true), this.A03.A0B(A05), C195219Wq.A01(A05));
            this.A01.A0G(r7);
            AnonymousClass9PN r3 = r7.A00;
            AnonymousClass303 r2 = this.A06;
            C1899693i.A0q(A05, r2);
            r2.A03("transaction_status_name", r4.A0C(r3.A00));
            r2.A03("merchant_name", r3.A02);
        }
    }
}
