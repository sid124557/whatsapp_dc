package androidx.constraintlayout.widget;

import X.C001702c;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class Guideline extends View {
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public void setGuidelineBegin(int i) {
        C001702c r0 = (C001702c) getLayoutParams();
        r0.A0Q = i;
        setLayoutParams(r0);
    }

    public void setGuidelineEnd(int i) {
        C001702c r0 = (C001702c) getLayoutParams();
        r0.A0R = i;
        setLayoutParams(r0);
    }

    public void setGuidelinePercent(float f) {
        C001702c r0 = (C001702c) getLayoutParams();
        r0.A01 = f;
        setLayoutParams(r0);
    }

    public void draw(Canvas canvas) {
    }

    public void setVisibility(int i) {
    }

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
