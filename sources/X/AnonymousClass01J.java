package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.01J  reason: invalid class name */
public class AnonymousClass01J extends Drawable implements Drawable.Callback, C15750rs, C14920qU {
    public static Method A06;
    public static final PorterDuff.Mode A07 = PorterDuff.Mode.SRC_IN;
    public int A00;
    public PorterDuff.Mode A01;
    public Drawable A02;
    public C001200x A03;
    public boolean A04;
    public boolean A05;

    public static final void A00() {
        if (A06 == null) {
            try {
                A06 = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    public boolean A01() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.A02;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public final void Bns(Drawable drawable) {
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.A02 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C001200x r1 = this.A03;
            if (r1 != null) {
                r1.A03 = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.A02.draw(canvas);
    }

    public Drawable.ConstantState getConstantState() {
        C001200x r1 = this.A03;
        if (r1 == null || r1.A03 == null) {
            return null;
        }
        r1.A00 = getChangingConfigurations();
        return this.A03;
    }

    public Drawable getCurrent() {
        return this.A02.getCurrent();
    }

    public Rect getDirtyBounds() {
        return this.A02.getDirtyBounds();
    }

    public int getIntrinsicHeight() {
        return this.A02.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.A02.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return C06130Wj.A00(this.A02);
    }

    public int getMinimumHeight() {
        return this.A02.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.A02.getMinimumWidth();
    }

    public int getOpacity() {
        return this.A02.getOpacity();
    }

    public void getOutline(Outline outline) {
        this.A02.getOutline(outline);
    }

    public boolean getPadding(Rect rect) {
        return this.A02.getPadding(rect);
    }

    public int[] getState() {
        return this.A02.getState();
    }

    public Region getTransparentRegion() {
        return this.A02.getTransparentRegion();
    }

    public boolean isAutoMirrored() {
        return AnonymousClass0X1.A04(this.A02);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.A02;
        if (!(drawable == null || (method = A06) == null)) {
            try {
                return AnonymousClass000.A1Z(drawable, method, new Object[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    public void jumpToCurrentState() {
        this.A02.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.A05 && super.mutate() == this) {
            this.A03 = new C001200x(this.A03);
            Drawable drawable = this.A02;
            if (drawable != null) {
                drawable.mutate();
            }
            C001200x r1 = this.A03;
            if (r1 != null) {
                Drawable drawable2 = this.A02;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                r1.A03 = constantState;
            }
            this.A05 = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return C06130Wj.A03(i, this.A02);
    }

    public boolean onLevelChange(int i) {
        return this.A02.setLevel(i);
    }

    public void setAlpha(int i) {
        this.A02.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        AnonymousClass0X1.A03(this.A02, z);
    }

    public void setChangingConfigurations(int i) {
        this.A02.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.A02.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.A02.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        this.A02.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.A02.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        boolean state = this.A02.setState(iArr);
        if (!A02(iArr) && !state) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public AnonymousClass01J(Resources resources, C001200x r3) {
        this.A03 = r3;
        Drawable.ConstantState constantState = r3.A03;
        if (constantState != null) {
            Bns(constantState.newDrawable(resources));
        }
        A00();
    }

    public final boolean A02(int[] iArr) {
        if (A01()) {
            C001200x r0 = this.A03;
            ColorStateList colorStateList = r0.A01;
            PorterDuff.Mode mode = r0.A02;
            if (colorStateList == null || mode == null) {
                this.A04 = false;
                clearColorFilter();
            } else {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!(this.A04 && colorForState == this.A00 && mode == this.A01)) {
                    setColorFilter(colorForState, mode);
                    this.A00 = colorForState;
                    this.A01 = mode;
                    this.A04 = true;
                    return true;
                }
            }
        }
        return false;
    }

    public int getChangingConfigurations() {
        int i;
        int changingConfigurations = super.getChangingConfigurations();
        C001200x r0 = this.A03;
        if (r0 != null) {
            i = r0.getChangingConfigurations();
        } else {
            i = 0;
        }
        return changingConfigurations | i | this.A02.getChangingConfigurations();
    }

    public boolean isStateful() {
        C001200x r0;
        ColorStateList colorStateList;
        if ((!A01() || (r0 = this.A03) == null || (colorStateList = r0.A01) == null || !colorStateList.isStateful()) && !this.A02.isStateful()) {
            return false;
        }
        return true;
    }

    public void setTint(int i) {
        if (A01()) {
            setTintList(ColorStateList.valueOf(i));
        } else {
            this.A02.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (A01()) {
            this.A03.A01 = colorStateList;
            A02(this.A02.getState());
            return;
        }
        this.A02.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (A01()) {
            this.A03.A02 = mode;
            A02(this.A02.getState());
            return;
        }
        this.A02.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (super.setVisible(z, z2) || this.A02.setVisible(z, z2)) {
            return true;
        }
        return false;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public AnonymousClass01J(Drawable drawable) {
        this.A03 = new C001200x(this.A03);
        Bns(drawable);
        A00();
    }
}
