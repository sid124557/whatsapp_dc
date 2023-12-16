package androidx.appcompat.widget;

import X.C14520pp;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class FitWindowsFrameLayout extends FrameLayout {
    public C14520pp A00;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C14520pp r1) {
        this.A00 = r1;
    }

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }
}
