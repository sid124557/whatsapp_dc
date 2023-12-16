package com.whatsapp.payments.ui.widget;

import X.AnonymousClass4GJ;
import X.AnonymousClass94H;
import X.AnonymousClass9P5;
import X.C116855qy;
import X.C202509m8;
import android.content.Context;
import android.util.AttributeSet;

public class TransactionsExpandableView extends AnonymousClass94H implements AnonymousClass4GJ {
    public AnonymousClass9P5 A00;
    public C116855qy A01;
    public boolean A02;

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setPaymentRequestActionCallback(C202509m8 r2) {
        this.A00.A02 = r2;
    }

    public TransactionsExpandableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        this.A00 = new AnonymousClass9P5(context);
    }

    public void setAdapter(AnonymousClass9P5 r1) {
        this.A00 = r1;
    }

    public TransactionsExpandableView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public TransactionsExpandableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        this.A00 = new AnonymousClass9P5(context);
    }

    public TransactionsExpandableView(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        this.A00 = new AnonymousClass9P5(context);
    }
}
