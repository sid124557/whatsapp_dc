package androidx.appcompat.widget;

import X.AnonymousClass0UD;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ActivityChooserView$InnerLayout extends LinearLayout {
    public static final int[] A00 = {16842964};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass0UD r1 = new AnonymousClass0UD(context, context.obtainStyledAttributes(attributeSet, A00));
        setBackgroundDrawable(r1.A02(0));
        r1.A02.recycle();
    }
}
