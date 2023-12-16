package X;

import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2;
import java.util.List;

/* renamed from: X.9ol  reason: invalid class name and case insensitive filesystem */
public class C204069ol implements C84504Cp {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C204069ol(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    public void BcU() {
        int i;
        if (this.A03 != 0) {
            ((C197419d8) this.A00).A03.BXS((AnonymousClass213) this.A01, (AnonymousClass9QL) this.A02);
            return;
        }
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = (BrazilOrderDetailsActivity) this.A00;
        AnonymousClass0R8 supportActionBar = brazilOrderDetailsActivity.getSupportActionBar();
        if (supportActionBar != null) {
            int i2 = ((AnonymousClass9QL) this.A02).A00;
            C47752dl r4 = AnonymousClass2BO.A00;
            Resources resources = brazilOrderDetailsActivity.getResources();
            AnonymousClass1VX r2 = brazilOrderDetailsActivity.A0D;
            if (i2 == 1) {
                i = R.array.f2nameremoved;
            } else {
                i = R.array.f2nameremoved;
            }
            supportActionBar.A0J(r4.A00(resources, r2, new Object[0], i));
        }
        PaymentCheckoutOrderDetailsViewV2 paymentCheckoutOrderDetailsViewV2 = brazilOrderDetailsActivity.A0A;
        AnonymousClass213 r13 = (AnonymousClass213) this.A01;
        AnonymousClass9QL r14 = (AnonymousClass9QL) this.A02;
        C194069Rl A002 = paymentCheckoutOrderDetailsViewV2.A00(r13, r14, "WhatsappPay", (List) null, 3);
        brazilOrderDetailsActivity.A0C = A002;
        PaymentCheckoutOrderDetailsViewV2 paymentCheckoutOrderDetailsViewV22 = brazilOrderDetailsActivity.A0A;
        int i3 = r14.A00;
        boolean A032 = paymentCheckoutOrderDetailsViewV22.A03(A002, r14, i3);
        C55942rA r22 = brazilOrderDetailsActivity.A0J;
        C30791n7 r3 = brazilOrderDetailsActivity.A0I;
        List A003 = brazilOrderDetailsActivity.A0C.A00();
        r22.A02(r3, brazilOrderDetailsActivity.A7T(), C195219Wq.A06(brazilOrderDetailsActivity.A0C.A01), A003, 4, true, A032, true);
        brazilOrderDetailsActivity.A0A.A02(brazilOrderDetailsActivity, brazilOrderDetailsActivity.A01, r13, r14, "WhatsappPay", (List) null, 3, i3);
    }

    public void BcX() {
        if (this.A03 != 0) {
            ((C197419d8) this.A00).A03.BXT((AnonymousClass213) this.A01, (AnonymousClass9QL) this.A02);
        }
    }
}
