package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: X.6Fa  reason: invalid class name and case insensitive filesystem */
public class C125066Fa extends ImageButton {
    public int A00 = getVisibility();

    public final int getUserSetVisibility() {
        return this.A00;
    }

    public C125066Fa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void A01(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.A00 = i;
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        this.A00 = i;
    }
}
