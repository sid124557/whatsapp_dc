package com.whatsapp.payments.ui.widget;

import X.C06560Yg;
import X.C18280x3;
import X.C18300x5;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

public class PaymentDescriptionRow extends LinearLayout {
    public View A00;
    public TextView A01;
    public TextView A02;

    public PaymentDescriptionRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
        setOrientation(1);
        this.A00 = C06560Yg.A02(this, R.id.payment_description_row_container);
        this.A01 = C18300x5.A0G(this, R.id.payment_description_hint);
        this.A02 = C18300x5.A0G(this, R.id.payment_description_text);
    }

    public void A01(String str) {
        Context context;
        int i;
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView = this.A02;
        if (isEmpty) {
            textView.setVisibility(8);
            this.A02.setText(str);
            context = getContext();
            i = R.string.f11nameremoved;
        } else {
            textView.setVisibility(0);
            this.A02.setText(str);
            context = getContext();
            i = R.string.f11nameremoved;
        }
        this.A01.setText(context.getString(i));
    }

    public int getLayoutRes() {
        return R.layout.f8nameremoved;
    }

    public PaymentDescriptionRow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
    }

    public PaymentDescriptionRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public PaymentDescriptionRow(Context context) {
        super(context);
        A00();
    }
}
