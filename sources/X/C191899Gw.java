package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9Gw  reason: invalid class name and case insensitive filesystem */
public class C191899Gw extends AnonymousClass5ZM {
    public int A00;
    public final C56612sH A01;
    public final C66543Lv A02;
    public final C50012hU A03;
    public final C624034w A04;
    public final UserJid A05;
    public final AnonymousClass9U5 A06;
    public final AnonymousClass9U4 A07;
    public final AnonymousClass35J A08;
    public final Runnable A09;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C624034w r7;
        C56612sH r4;
        C30291mD r6;
        C160757oG r2;
        String str;
        int i = this.A00;
        if (i == 15) {
            AnonymousClass35J r1 = this.A08;
            r7 = this.A04;
            AnonymousClass2z0 A012 = AnonymousClass35J.A01(r7.A0C, r1);
            r4 = this.A01;
            r6 = new C30831nH(A012, r4.A0H());
        } else if (i == 18) {
            AnonymousClass35J r12 = this.A08;
            r7 = this.A04;
            AnonymousClass2z0 A013 = AnonymousClass35J.A01(r7.A0C, r12);
            r4 = this.A01;
            r6 = new AnonymousClass1nG(A013, r4.A0H());
        } else {
            throw AnonymousClass001.A0e(C160757oG.A01("PaymentsMessageHandler", AnonymousClass000.A0Y("Transaction status is not cancelled or rejected, status: ", AnonymousClass001.A0o(), i)));
        }
        r6.A00 = r7.A0L;
        r6.A1J(this.A05);
        AnonymousClass9U5 r5 = this.A06;
        if (!C1899693i.A0x(r5.A0E)) {
            r2 = r5.A0H;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("decline/cancelPaymentRequest is not enabled for country: ");
            str = AnonymousClass000.A0R(r5.A0D.A02(), A0o);
        } else if (r6.A1J.A00 == null) {
            r2 = r5.A0H;
            str = "requestPayment found null or empty args jid";
        } else {
            r5.A05.A08(r6);
            int i2 = r7.A02;
            r7.A02 = i;
            r7.A06 = r4.A0H();
            return Boolean.valueOf(AnonymousClass9U4.A01(this.A07).A0g(r7, C1899593h.A0R(r7), i2, 0, -1));
        }
        r2.A06(str);
        int i22 = r7.A02;
        r7.A02 = i;
        r7.A06 = r4.A0H();
        return Boolean.valueOf(AnonymousClass9U4.A01(this.A07).A0g(r7, C1899593h.A0R(r7), i22, 0, -1));
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C624134x A0E = this.A02.A0E(this.A04);
        if (A0E != null) {
            C624034w r2 = A0E.A0P;
            r2.A02 = this.A00;
            r2.A06 = this.A01.A0H();
            this.A03.A01(A0E, 16);
        }
        this.A09.run();
    }

    public C191899Gw(C56612sH r1, C66543Lv r2, C50012hU r3, C624034w r4, UserJid userJid, AnonymousClass9U5 r6, AnonymousClass9U4 r7, AnonymousClass35J r8, Runnable runnable, int i) {
        this.A01 = r1;
        this.A03 = r3;
        this.A08 = r8;
        this.A07 = r7;
        this.A02 = r2;
        this.A06 = r6;
        this.A04 = r4;
        this.A05 = userJid;
        this.A00 = i;
        this.A09 = runnable;
    }
}
