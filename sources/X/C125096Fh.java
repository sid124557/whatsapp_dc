package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: X.6Fh  reason: invalid class name and case insensitive filesystem */
public abstract class C125096Fh extends LinearLayout {
    public boolean A00;

    public abstract View getPrimaryNameView();

    public abstract View getSecondaryNameView();

    public abstract void setShouldTruncateNameViewWhenNeeded(boolean z);

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        View childAt = getChildAt(0);
        View secondaryNameView = getSecondaryNameView();
        if (childAt == null || secondaryNameView == null) {
            C626936e.A0D(false, "ConversationRowParticipantHeaderBaseView should have both primary and secondary name views.");
        } else if (!this.A00) {
        } else {
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                int A02 = AnonymousClass000.A02(this);
                int A03 = AnonymousClass000.A03(this);
                int i3 = 0;
                if (secondaryNameView.getVisibility() != 8) {
                    AnonymousClass001.A19(secondaryNameView, measuredHeight - A03, Integer.MIN_VALUE, View.MeasureSpec.makeMeasureSpec(measuredWidth - A02, Integer.MIN_VALUE));
                    i3 = secondaryNameView.getMeasuredWidth();
                }
                AnonymousClass001.A19(childAt, measuredHeight - A03, Integer.MIN_VALUE, View.MeasureSpec.makeMeasureSpec(Math.max((measuredWidth - i3) - A02, 0), Integer.MIN_VALUE));
            }
        }
    }

    public C125096Fh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C125096Fh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C125096Fh(Context context) {
        super(context);
    }
}
