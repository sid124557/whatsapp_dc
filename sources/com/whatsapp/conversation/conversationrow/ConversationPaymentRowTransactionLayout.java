package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.C116855qy;
import X.C86644Kx;
import X.C86664Kz;
import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.util.Log;

public class ConversationPaymentRowTransactionLayout extends LinearLayout implements AnonymousClass4GJ {
    public ViewGroup A00;
    public C116855qy A01;
    public boolean A02;

    public ConversationPaymentRowTransactionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        A00();
    }

    public void A00() {
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i, int i2) {
        int measuredWidth;
        int A04;
        TextView textView = (TextView) C86644Kx.A0G(this);
        TextView textView2 = (TextView) getChildAt(1);
        if (textView2.getVisibility() != 0) {
            if (textView.getVisibility() != 0) {
                textView = null;
            }
            textView2 = textView;
        }
        super.onMeasure(i, i2);
        if (textView2 != null && this.A00 != null) {
            boolean A1X = AnonymousClass000.A1X(textView2.getLayout());
            int measuredWidth2 = getMeasuredWidth();
            Layout layout = textView2.getLayout();
            if (layout == null) {
                Log.e("ConversationRowTransactionPill/onMeasure/error getting textView layout");
                return;
            }
            if (layout.getLineCount() > 1) {
                int desiredWidth = (int) Layout.getDesiredWidth(textView2.getText().subSequence(layout.getLineStart(layout.getLineCount() - 1), layout.getLineEnd(layout.getLineCount() - 1)), textView2.getPaint());
                int measuredWidth3 = textView2.getMeasuredWidth();
                if (!A1X && textView2.getText() != null && TextUtils.indexOf(textView2.getText(), 10) >= 0) {
                    measuredWidth3 = Math.min(measuredWidth3, C86664Kz.A0F(textView2, ((int) Math.ceil((double) Layout.getDesiredWidth(textView2.getText(), textView2.getPaint()))) + textView2.getPaddingRight()));
                }
                if (AnonymousClass000.A06(this, measuredWidth2) >= this.A00.getMeasuredWidth() + measuredWidth3) {
                    setMeasuredDimension(C86664Kz.A0F(this, C86664Kz.A0G(this.A00, measuredWidth3)) + getPaddingRight(), getMeasuredHeight());
                    return;
                }
                if (AnonymousClass000.A06(textView2, measuredWidth3) >= C86664Kz.A0G(this.A00, desiredWidth)) {
                    return;
                }
                measuredWidth = getMeasuredWidth();
                A04 = AnonymousClass4L0.A04(this.A00, getMeasuredHeight());
            } else {
                if (AnonymousClass000.A06(this, measuredWidth2) >= C86664Kz.A0G(this.A00, textView2.getMeasuredWidth())) {
                    measuredWidth = C86664Kz.A0F(this, C86664Kz.A0G(this.A00, textView2.getMeasuredWidth())) + getPaddingRight();
                    if (measuredWidth > getMeasuredWidth()) {
                        A04 = getMeasuredHeight();
                    } else {
                        return;
                    }
                }
                measuredWidth = getMeasuredWidth();
                A04 = AnonymousClass4L0.A04(this.A00, getMeasuredHeight());
            }
            setMeasuredDimension(measuredWidth, A04);
        }
    }

    public void setDateWrapper(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }

    public ConversationPaymentRowTransactionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        A00();
    }

    public ConversationPaymentRowTransactionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
    }

    public ConversationPaymentRowTransactionLayout(Context context) {
        super(context, (AttributeSet) null);
        A00();
    }

    public ConversationPaymentRowTransactionLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
