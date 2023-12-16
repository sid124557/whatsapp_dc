package com.whatsapp.payments.ui.widget;

import X.AnonymousClass0x9;
import X.AnonymousClass94P;
import X.AnonymousClass9U4;
import X.C18280x3;
import X.C1899593h;
import X.C196419ao;
import X.C203239nL;
import X.C204249p3;
import X.C624034w;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class PaymentInteropShimmerRow extends AnonymousClass94P implements C203239nL {
    public View A00;
    public View A01;
    public C624034w A02;
    public AnonymousClass9U4 A03;
    public C196419ao A04;

    /* renamed from: A02 */
    public void Axw(C624034w r5) {
        this.A02 = r5;
        boolean A08 = this.A04.A08(r5.A0K);
        View view = this.A00;
        if (A08) {
            view.setVisibility(8);
            this.A01.setVisibility(0);
            return;
        }
        view.setVisibility(0);
        this.A01.setVisibility(8);
    }

    public void Biz() {
        C624034w r0 = this.A02;
        if (r0 != null) {
            Axw(r0);
        }
    }

    public PaymentInteropShimmerRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public final void A01() {
        C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this);
        setOrientation(1);
        this.A00 = findViewById(R.id.payment_shimmer);
        this.A01 = findViewById(R.id.static_shimmer);
        C1899593h.A0i(getContext(), AnonymousClass0x9.A0F(this, R.id.transaction_loading_error), R.color.f5nameremoved);
        setOnClickListener(C204249p3.A00(this, 150));
    }

    public PaymentInteropShimmerRow(Context context) {
        super(context);
        A01();
    }

    public PaymentInteropShimmerRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }
}
