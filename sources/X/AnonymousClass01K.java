package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: X.01K  reason: invalid class name */
public abstract class AnonymousClass01K extends Drawable implements C14920qU {
    public Drawable A00;

    public static StringBuilder A00(TypedArray typedArray) {
        StringBuilder sb = new StringBuilder();
        sb.append(typedArray.getPositionDescription());
        return sb;
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            AnonymousClass0YG.A03(theme, drawable);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public int[] getState() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return super.onLevelChange(i);
    }

    public void setChangingConfigurations(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setFilterBitmap(boolean z) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            AnonymousClass0YG.A05(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            AnonymousClass0YG.A07(drawable, i, i2, i3, i4);
        }
    }

    public boolean setState(int[] iArr) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return super.setState(iArr);
    }

    public void onBoundsChange(Rect rect) {
        throw null;
    }
}
