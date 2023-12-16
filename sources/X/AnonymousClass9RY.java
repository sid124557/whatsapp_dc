package X;

import com.whatsapp.util.Log;

/* renamed from: X.9RY  reason: invalid class name */
public class AnonymousClass9RY {
    public final /* synthetic */ AnonymousClass9RJ A00;
    public final /* synthetic */ C194969Vi A01;
    public final /* synthetic */ C59942xk A02;
    public final /* synthetic */ String A03;

    public AnonymousClass9RY(AnonymousClass9RJ r1, C194969Vi r2, C59942xk r3, String str) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
    }

    public void A00(AnonymousClass34V r3) {
        C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: PaymentIncentiveManager/getIncentiveOfferInfo/getOfferDetails/onError : ", r3);
        AnonymousClass9RJ r1 = this.A00;
        if (r1 != null) {
            Log.e("PAY: PaymentIncentiveManager/syncIncentiveData/refreshGetIncentiveOfferInfo failed");
            r1.A00.BRy();
        }
    }
}
