package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.01A  reason: invalid class name */
public class AnonymousClass01A extends Drawable {
    public float A00;
    public float A01;
    public ColorStateList A02;
    public ColorStateList A03;
    public PorterDuff.Mode A04 = PorterDuff.Mode.SRC_IN;
    public PorterDuffColorFilter A05;
    public boolean A06 = false;
    public boolean A07 = true;
    public final Paint A08;
    public final Rect A09;
    public final RectF A0A;

    public final void A00(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.A0A;
        rectF.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        Rect rect2 = this.A09;
        rect2.set(rect);
        if (this.A06) {
            float f = this.A00;
            float f2 = this.A01;
            float f3 = f * 1.5f;
            if (this.A07) {
                double d = (1.0d - AnonymousClass014.A00) * ((double) f2);
                f3 = (float) (((double) f3) + d);
                f = (float) (((double) f) + d);
            }
            rect2.inset((int) Math.ceil((double) f), (int) Math.ceil((double) f3));
            rectF.set(rect2);
        }
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.A08;
        if (this.A05 == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.A05);
            z = true;
        }
        RectF rectF = this.A0A;
        float f = this.A01;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.A09, this.A01);
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.A03;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && (((colorStateList = this.A02) == null || !colorStateList.isStateful()) && !super.isStateful())) {
            return false;
        }
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.A02;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.A08;
        boolean z = false;
        if (colorForState != paint.getColor()) {
            z = true;
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.A03;
        if (colorStateList2 == null || (mode = this.A04) == null) {
            return z;
        }
        this.A05 = new PorterDuffColorFilter(colorStateList2.getColorForState(getState(), 0), mode);
        return true;
    }

    public void setAlpha(int i) {
        this.A08.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        PorterDuffColorFilter porterDuffColorFilter;
        this.A03 = colorStateList;
        PorterDuff.Mode mode = this.A04;
        if (colorStateList == null || mode == null) {
            porterDuffColorFilter = null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        this.A05 = porterDuffColorFilter;
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        this.A04 = mode;
        ColorStateList colorStateList = this.A03;
        if (colorStateList == null || mode == null) {
            porterDuffColorFilter = null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        this.A05 = porterDuffColorFilter;
        invalidateSelf();
    }

    public AnonymousClass01A(ColorStateList colorStateList, float f) {
        this.A01 = f;
        this.A08 = new Paint(5);
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.A02 = colorStateList;
        this.A08.setColor(colorStateList.getColorForState(getState(), this.A02.getDefaultColor()));
        this.A0A = AnonymousClass002.A07();
        this.A09 = AnonymousClass001.A0N();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A00(rect);
    }
}
