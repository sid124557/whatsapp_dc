package X;

import android.content.Context;
import com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2;
import java.util.HashMap;

/* renamed from: X.9bq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C196849bq implements AnonymousClass65R {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PaymentCheckoutOrderDetailsViewV2 A01;
    public final /* synthetic */ C194069Rl A02;
    public final /* synthetic */ AnonymousClass9QL A03;
    public final /* synthetic */ String A04;

    public final void BLv(String str, boolean z, String str2) {
        PaymentCheckoutOrderDetailsViewV2 paymentCheckoutOrderDetailsViewV2 = this.A01;
        Context context = this.A00;
        AnonymousClass9QL r0 = this.A03;
        C194069Rl r5 = this.A02;
        String str3 = this.A04;
        if (z) {
            AnonymousClass5SZ r1 = paymentCheckoutOrderDetailsViewV2.A0V;
            C626936e.A06(str);
            C626936e.A06(str2);
            r1.A01(context, (Runnable) null, str, str2);
            return;
        }
        C203479nl r12 = r0.A0A;
        AnonymousClass4DV r6 = r0.A0B;
        C95814uZ r3 = r0.A08;
        AnonymousClass39L r2 = r0.A06;
        String str4 = r0.A0L;
        AnonymousClass9XZ r4 = r0.A09;
        String str5 = r0.A0D;
        HashMap hashMap = r0.A0M;
        if (str3 == null) {
            str3 = "order_details";
        }
        r12.BOs(r2, r3, r4, r5, r6, str4, str5, str3, hashMap);
    }

    public /* synthetic */ C196849bq(Context context, PaymentCheckoutOrderDetailsViewV2 paymentCheckoutOrderDetailsViewV2, C194069Rl r3, AnonymousClass9QL r4, String str) {
        this.A01 = paymentCheckoutOrderDetailsViewV2;
        this.A00 = context;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = str;
    }
}
