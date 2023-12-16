package X;

import android.content.Context;

/* renamed from: X.9AH  reason: invalid class name */
public class AnonymousClass9AH extends AnonymousClass9OC {
    public final Context A00;
    public final C69263Wi A01;
    public final AnonymousClass31C A02;
    public final C196629bS A03;
    public final C40602Ha A04;
    public final C194389Sr A05;
    public final C197109ca A06;
    public final C194259Se A07;

    public AnonymousClass9AH(Context context, C69263Wi r3, AnonymousClass31C r4, AnonymousClass9U1 r5, C196629bS r6, C40602Ha r7, AnonymousClass9U5 r8, C194389Sr r9, C197109ca r10, C194259Se r11) {
        super(r5.A04, r8);
        this.A00 = context;
        this.A01 = r3;
        this.A02 = r4;
        this.A07 = r11;
        this.A05 = r9;
        this.A06 = r10;
        this.A04 = r7;
        this.A03 = r6;
    }

    public final void A00(C166557yt r23, C166557yt r24, AnonymousClass99H r25, C202599mH r26, String str, String str2) {
        C153607bd r11 = this.A00;
        r11.A03("upi-generate-otp");
        AnonymousClass31C r15 = this.A02;
        String A032 = r15.A03();
        String A072 = this.A03.A07();
        C192189In r2 = new C192189In(new AnonymousClass9IP(A032), C1899693i.A0e(r23), str, this.A07.A01(), (String) C1899593h.A0X(r25.A06), (String) C1899593h.A0X(r24), A072, str2);
        r15.A0D(new C203939oY(this.A00, this.A01, this.A04, r11, r26, this, r2), r2.A00, A032, 204, 0);
    }

    public void A01(C166557yt r11, AnonymousClass99H r12, C202599mH r13, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PAY: IndiaUpiOtpAction requestOtp withCallback: ");
        A0o.append(true);
        C18280x3.A14(A0o);
        this.A06.Bq0();
        AnonymousClass99H r6 = r12;
        String str2 = r12.A0F;
        C166557yt r5 = r11;
        C202599mH r7 = r13;
        String str3 = str;
        if (C161527pr.A02(r12.A09)) {
            this.A05.A01(this.A00, (C153607bd) null, new C196949c3(r5, r6, r7, this, str3));
        } else {
            A00(r12.A09, r5, r6, r7, str2, str3);
        }
    }
}
