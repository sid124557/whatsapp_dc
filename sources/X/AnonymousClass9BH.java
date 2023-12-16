package X;

import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.9BH  reason: invalid class name */
public final class AnonymousClass9BH extends AnonymousClass9TV {
    public View A00;
    public final AnonymousClass9C3 A01;
    public final boolean A02;

    public void A03(List list) {
        C162457s7.A0J(list, 0);
        super.A03(list);
        if (this.A02) {
            this.A00.setOnClickListener(this.A01);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C166587yw r5, boolean r6) {
        /*
            r4 = this;
            boolean r0 = r4.A02
            java.lang.String r3 = "defaultPaymentMethodSubTextView"
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.data.payments.PaymentBankAccount"
            X.C162457s7.A0K(r5, r0)
            X.6hx r1 = r5.A08
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData"
            X.C162457s7.A0K(r1, r0)
            X.99H r1 = (X.AnonymousClass99H) r1
            boolean r2 = r1.A0H
            android.widget.ImageView r1 = r4.A01
            int r0 = r4.A03
            X.C107335b8.A0E(r1, r0)
            android.widget.TextView r1 = r4.A02
            if (r2 == 0) goto L_0x003c
            if (r1 == 0) goto L_0x0029
            r0 = 2131888479(0x7f12095f, float:1.9411594E38)
            r1.setText(r0)
        L_0x0029:
            android.widget.ImageView r1 = r4.A01
            if (r1 == 0) goto L_0x0033
            r0 = 2131232711(0x7f0807c7, float:1.8081539E38)
        L_0x0030:
            r1.setImageResource(r0)
        L_0x0033:
            android.view.View r1 = r4.A00
            if (r1 != 0) goto L_0x004c
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x003c:
            if (r1 == 0) goto L_0x0044
            r0 = 2131888480(0x7f120960, float:1.9411597E38)
            r1.setText(r0)
        L_0x0044:
            android.widget.ImageView r1 = r4.A01
            if (r1 == 0) goto L_0x0033
            r0 = 2131232721(0x7f0807d1, float:1.808156E38)
            goto L_0x0030
        L_0x004c:
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r1 = r4.A00
            X.9C3 r0 = r4.A01
            r1.setOnClickListener(r0)
            return
        L_0x0058:
            super.A02(r5, r6)
            android.view.View r1 = r4.A00
            if (r1 != 0) goto L_0x0064
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x0064:
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9BH.A02(X.7yw, boolean):void");
    }

    public AnonymousClass9BH(AnonymousClass9C3 r1, boolean z) {
        super(r1);
        this.A01 = r1;
        this.A02 = z;
    }

    public void A01() {
        super.A01();
        this.A00 = C18280x3.A0E(this.A01.A00, R.id.default_payment_method_business_payments);
    }
}
