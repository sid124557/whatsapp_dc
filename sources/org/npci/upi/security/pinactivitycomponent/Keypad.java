package org.npci.upi.security.pinactivitycomponent;

import X.AnonymousClass0Y8;
import X.AnonymousClass4L0;
import X.C100875Cp;
import X.C109695f2;
import X.C1227965t;
import X.C18320x8;
import X.C86604Kt;
import X.C86614Ku;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.whatsapp.R;

public class Keypad extends TableLayout {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public C1227965t A04;

    public Keypad(Context context) {
        this(context, (AttributeSet) null);
    }

    private TableRow.LayoutParams getItemParams() {
        return new TableRow.LayoutParams(0, C86604Kt.A04(this, (float) this.A01), 1.0f);
    }

    private void setClickFeedback(View view) {
        TypedValue A0B = AnonymousClass4L0.A0B();
        C86614Ku.A0C(this).resolveAttribute(R.attr.f3nameremoved, A0B, true);
        view.setBackgroundResource(A0B.resourceId);
    }

    public void setOnKeyPressCallback(C1227965t r1) {
        this.A04 = r1;
    }

    public Keypad(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = 61;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C100875Cp.A02, 0, 0);
        this.A02 = obtainStyledAttributes.getColor(3, AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved));
        this.A03 = obtainStyledAttributes.getColor(0, AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved));
        this.A00 = (float) obtainStyledAttributes.getDimensionPixelSize(2, 33);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(1, this.A01);
        obtainStyledAttributes.recycle();
        setBackgroundColor(this.A02);
        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(-1, 0, 1.0f);
        int i = 1;
        for (int i2 = 0; i2 < 3; i2++) {
            TableRow tableRow = new TableRow(getContext());
            tableRow.setLayoutParams(layoutParams);
            tableRow.setWeightSum(3.0f);
            int i3 = 0;
            do {
                TextView textView = new TextView(getContext());
                textView.setGravity(17);
                textView.setLayoutParams(getItemParams());
                textView.setTextColor(this.A03);
                textView.setTextSize(2, this.A00);
                textView.setText(String.valueOf(i));
                textView.setClickable(true);
                setClickFeedback(textView);
                C109695f2.A00(textView, this, i, 23);
                tableRow.addView(textView);
                i++;
                i3++;
            } while (i3 < 3);
            addView(tableRow);
        }
        ImageView A0H = C86614Ku.A0H(this);
        A0H.setImageResource(R.drawable.ic_action_backspace);
        A0H.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        A0H.setAdjustViewBounds(true);
        TableRow.LayoutParams itemParams = getItemParams();
        itemParams.height = (int) (((float) C86604Kt.A04(this, (float) this.A01)) * 1.2f);
        A0H.setLayoutParams(itemParams);
        A0H.setClickable(true);
        setClickFeedback(A0H);
        C18320x8.A14(A0H, this, 33);
        TextView textView2 = new TextView(getContext());
        textView2.setLayoutParams(getItemParams());
        textView2.setGravity(17);
        textView2.setText(String.valueOf(0));
        textView2.setTextColor(this.A03);
        textView2.setTextSize(2, this.A00);
        textView2.setClickable(true);
        setClickFeedback(textView2);
        C18320x8.A14(textView2, this, 34);
        ImageView A0H2 = C86614Ku.A0H(this);
        A0H2.setImageResource(R.drawable.ic_action_submit);
        A0H2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        A0H2.setAdjustViewBounds(true);
        TableRow.LayoutParams itemParams2 = getItemParams();
        itemParams2.height = (int) (((float) C86604Kt.A04(this, (float) this.A01)) * 1.1f);
        A0H2.setLayoutParams(itemParams2);
        A0H2.setClickable(true);
        setClickFeedback(A0H2);
        C18320x8.A14(A0H2, this, 35);
        TableRow tableRow2 = new TableRow(getContext());
        tableRow2.setLayoutParams(layoutParams);
        tableRow2.setWeightSum(3.0f);
        tableRow2.addView(A0H);
        tableRow2.addView(textView2);
        tableRow2.addView(A0H2);
        addView(tableRow2);
    }
}
