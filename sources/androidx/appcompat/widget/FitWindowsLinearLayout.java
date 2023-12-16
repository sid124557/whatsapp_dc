package androidx.appcompat.widget;

import X.C14520pp;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout {
    public C14520pp A00;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C14520pp r1) {
        this.A00 = r1;
    }

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }
}
