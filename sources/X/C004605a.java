package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.05a  reason: invalid class name and case insensitive filesystem */
public abstract class C004605a extends AnonymousClass02X {
    public boolean A00;
    public boolean A01;

    public abstract void A09(AnonymousClass05M r1, int i, int i2);

    public void A04(AttributeSet attributeSet) {
        super.A04(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0K9.A01);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.A01 = true;
                } else if (index == 13) {
                    this.A00 = true;
                }
            }
        }
    }

    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.A01 || this.A00) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.A00; i++) {
                View view = (View) constraintLayout.A06.get(this.A05[i]);
                if (view != null) {
                    if (this.A01) {
                        view.setVisibility(visibility);
                    }
                    if (this.A00 && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        A01();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        A01();
    }

    public C004605a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C004605a(Context context) {
        super(context);
    }

    public C004605a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
