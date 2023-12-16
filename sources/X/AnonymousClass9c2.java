package X;

import com.whatsapp.util.Log;

/* renamed from: X.9c2  reason: invalid class name */
public class AnonymousClass9c2 implements C203339nX {
    public final /* synthetic */ C166557yt A00;
    public final /* synthetic */ AnonymousClass4EY A01;
    public final /* synthetic */ AnonymousClass9AK A02;
    public final /* synthetic */ String A03;

    public AnonymousClass9c2(C166557yt r1, AnonymousClass4EY r2, AnonymousClass9AK r3, String str) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = str;
        this.A01 = r2;
    }

    public void BPu(AnonymousClass99D r7) {
        AnonymousClass9AK r0 = this.A02;
        C166557yt r1 = r7.A02;
        C626936e.A06(r1);
        String str = r7.A03;
        r0.A00(r1, this.A00, this.A01, str, this.A03);
    }

    public void BS6(AnonymousClass34V r2) {
        Log.w("PAY: IndiaUpiPaymentMethodAction: could not fetch VPA information to remove payment method");
        this.A01.Ba4(r2);
    }

    public /* synthetic */ void BXD(AnonymousClass9TG r1) {
    }
}
