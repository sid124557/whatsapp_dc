package com.google.android.material.snackbar;

import X.AnonymousClass002;
import X.AnonymousClass0YH;
import X.AnonymousClass5YH;
import X.C159917mg;
import X.C178908iI;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

public class SnackbarContentLayout extends LinearLayout implements C178908iI {
    public int A00;
    public Button A01;
    public TextView A02;
    public final TimeInterpolator A03;

    public SnackbarContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public Button getActionView() {
        return this.A01;
    }

    public TextView getMessageView() {
        return this.A02;
    }

    public final boolean A00(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.A02.getPaddingTop() == i2 && this.A02.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.A02;
        if (AnonymousClass0YH.A09(textView)) {
            AnonymousClass0YH.A07(textView, AnonymousClass0YH.A03(textView), i2, AnonymousClass0YH.A02(textView), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.A02 = AnonymousClass002.A09(this, R.id.snackbar_text);
        this.A01 = (Button) findViewById(R.id.snackbar_action);
    }

    public void onMeasure(int i, int i2) {
        boolean A002;
        super.onMeasure(i, i2);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            Layout layout = this.A02.getLayout();
            if (layout == null || layout.getLineCount() <= 1) {
                dimensionPixelSize = dimensionPixelSize2;
                A002 = A00(0, dimensionPixelSize, dimensionPixelSize);
            } else {
                if (this.A00 > 0 && this.A01.getMeasuredWidth() > this.A00) {
                    A002 = A00(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2);
                }
                A002 = A00(0, dimensionPixelSize, dimensionPixelSize);
            }
            if (A002) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.A00 = i;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = AnonymousClass5YH.A01(C159917mg.A02, context, R.attr.f3nameremoved);
    }
}
