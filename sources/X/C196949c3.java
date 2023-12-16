package X;

import com.whatsapp.util.Log;

/* renamed from: X.9c3  reason: invalid class name and case insensitive filesystem */
public class C196949c3 implements C203339nX {
    public final /* synthetic */ C166557yt A00;
    public final /* synthetic */ AnonymousClass99H A01;
    public final /* synthetic */ C202599mH A02;
    public final /* synthetic */ AnonymousClass9AH A03;
    public final /* synthetic */ String A04;

    public C196949c3(C166557yt r1, AnonymousClass99H r2, C202599mH r3, AnonymousClass9AH r4, String str) {
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = str;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void BPu(AnonymousClass99D r8) {
        AnonymousClass9AH r0 = this.A03;
        C166557yt r1 = r8.A02;
        C626936e.A06(r1);
        String str = r8.A03;
        r0.A00(r1, this.A00, this.A01, this.A02, str, this.A04);
    }

    public void BS6(AnonymousClass34V r2) {
        Log.w("PAY: IndiaUpiOtpAction: could not fetch VPA information to request OTP");
        this.A02.BXW(r2);
    }

    public /* synthetic */ void BXD(AnonymousClass9TG r1) {
    }
}
