package X;

import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.9cI  reason: invalid class name and case insensitive filesystem */
public class C196999cI implements C203399nd {
    public final /* synthetic */ FingerprintBottomSheet A00;
    public final /* synthetic */ C195319Xg A01;
    public final /* synthetic */ AnonymousClass39Q A02;
    public final /* synthetic */ C166587yw A03;
    public final /* synthetic */ AnonymousClass3QO A04;
    public final /* synthetic */ BrazilPaymentActivity A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public C196999cI(FingerprintBottomSheet fingerprintBottomSheet, C195319Xg r2, AnonymousClass39Q r3, C166587yw r4, AnonymousClass3QO r5, BrazilPaymentActivity brazilPaymentActivity, String str, String str2) {
        this.A05 = brazilPaymentActivity;
        this.A03 = r4;
        this.A02 = r3;
        this.A06 = str;
        this.A07 = str2;
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = fingerprintBottomSheet;
    }

    public void BJz(AnonymousClass34V r3, Integer num) {
        this.A05.A0O.A05(r3, num, "pay-precheck");
    }

    public Integer BK3() {
        return this.A05.A0O.A00("pay-precheck");
    }

    public void BKG(AnonymousClass34V r3, Integer num) {
        this.A05.A0O.A05(r3, num, "get-provider-key");
    }

    public void BKH(Integer num) {
        this.A05.A0O.A07(num, "get-provider-key");
    }
}
