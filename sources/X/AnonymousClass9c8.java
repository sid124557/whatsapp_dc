package X;

import android.text.TextUtils;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.9c8  reason: invalid class name */
public class AnonymousClass9c8 implements C184518rx {
    public final /* synthetic */ C202749mW A00;
    public final /* synthetic */ C202759mX A01;
    public final /* synthetic */ AnonymousClass9Ct A02;
    public final /* synthetic */ PaymentBottomSheet A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ Runnable A05;

    public AnonymousClass9c8(C202749mW r1, C202759mX r2, AnonymousClass9Ct r3, PaymentBottomSheet paymentBottomSheet, Runnable runnable, Runnable runnable2) {
        this.A02 = r3;
        this.A05 = runnable;
        this.A04 = runnable2;
        this.A03 = paymentBottomSheet;
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BS6(AnonymousClass34V r4) {
        AnonymousClass9Ct r2 = this.A02;
        int i = r4.A00;
        if (i == 10752 || i == 10756 || i == 10755) {
            this.A04.run();
            AnonymousClass9Ct.A0C(r4, this.A00, r2, this.A03);
            return;
        }
        this.A01.BS6(r4);
    }

    public void BaO(C139766sa r7) {
        C138756qw r5 = r7.A02;
        if (r5 != null) {
            AnonymousClass9Ct r4 = this.A02;
            r4.A05 = r5.A05;
            r4.A0Z = r5.A01;
            r4.A0c = r5.A03;
            Class<String> cls = String.class;
            r4.A0I = C1899693i.A0F(AnonymousClass3QD.A00(), cls, r5.A04, "upiHandle");
            String str = r5.A02;
            if (!TextUtils.isEmpty(str)) {
                r4.A0G = C1899693i.A0F(AnonymousClass3QD.A00(), cls, str, "accountHolderName");
            }
            r4.A0j = r5.A00;
        }
        this.A05.run();
    }
}
