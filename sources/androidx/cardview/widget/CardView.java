package androidx.cardview.widget;

import X.AnonymousClass001;
import X.AnonymousClass01A;
import X.AnonymousClass0JR;
import X.C07750cl;
import X.C07760cm;
import X.C14850qN;
import X.C16520tX;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;

public class CardView extends FrameLayout {
    public static final C16520tX A05 = new C07760cm();
    public static final int[] A06 = {16842801};
    public boolean A00;
    public boolean A01;
    public final Rect A02;
    public final Rect A03;
    public final C14850qN A04;

    public ColorStateList getCardBackgroundColor() {
        return ((AnonymousClass01A) ((C07750cl) this.A04).A00).A02;
    }

    public float getCardElevation() {
        return ((C07750cl) this.A04).A01.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.A02.bottom;
    }

    public int getContentPaddingLeft() {
        return this.A02.left;
    }

    public int getContentPaddingRight() {
        return this.A02.right;
    }

    public int getContentPaddingTop() {
        return this.A02.top;
    }

    public float getMaxCardElevation() {
        return ((AnonymousClass01A) ((C07750cl) this.A04).A00).A00;
    }

    public boolean getPreventCornerOverlap() {
        return this.A01;
    }

    public float getRadius() {
        return ((AnonymousClass01A) ((C07750cl) this.A04).A00).A01;
    }

    public boolean getUseCompatPadding() {
        return this.A00;
    }

    public void onMeasure(int i, int i2) {
        if (!(A05 instanceof C07760cm)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) (((AnonymousClass01A) ((C07750cl) this.A04).A00).A01 * 2.0f)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) (((AnonymousClass01A) ((C07750cl) this.A04).A00).A01 * 2.0f)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        A05.Blm(ColorStateList.valueOf(i), this.A04);
    }

    public void setCardElevation(float f) {
        ((C07750cl) this.A04).A01.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        A05.BmY(this.A04, f);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.A01) {
            this.A01 = z;
            C16520tX r2 = A05;
            C14850qN r1 = this.A04;
            ((C07760cm) r2).BmY(r1, ((AnonymousClass01A) ((C07750cl) r1).A00).A00);
        }
    }

    public void setRadius(float f) {
        AnonymousClass01A r1 = (AnonymousClass01A) ((C07750cl) this.A04).A00;
        if (f != r1.A01) {
            r1.A01 = f;
            r1.A00((Rect) null);
            r1.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            C16520tX r2 = A05;
            C14850qN r1 = this.A04;
            ((C07760cm) r2).BmY(r1, ((AnonymousClass01A) ((C07750cl) r1).A00).A00);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList valueOf;
        Rect A0N = AnonymousClass001.A0N();
        this.A02 = A0N;
        this.A03 = AnonymousClass001.A0N();
        C07750cl r3 = new C07750cl(this);
        this.A04 = r3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0JR.A00, i, R.style.f12nameremoved);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(A06);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(getResources().getColor(fArr[2] > 0.5f ? R.color.f5nameremoved : R.color.f5nameremoved));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.A00 = obtainStyledAttributes.getBoolean(7, false);
        this.A01 = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        A0N.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        A0N.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        A0N.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        A0N.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        AnonymousClass01A r1 = new AnonymousClass01A(valueOf, dimension);
        r3.A00 = r1;
        CardView cardView = r3.A01;
        cardView.setBackgroundDrawable(r1);
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        ((C07760cm) A05).BmY(r3, dimension3);
    }

    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public CardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        A05.Blm(colorStateList, this.A04);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }
}
