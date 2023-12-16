package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.6Cx  reason: invalid class name */
public final class AnonymousClass6Cx extends Drawable {
    public int A00 = 16842921;

    public boolean setState(int[] iArr) {
        C162457s7.A0J(iArr, 0);
        int i = this.A00;
        this.A00 = 16842921;
        int i2 = 16842921;
        int length = iArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            int i4 = iArr[i3];
            if (i4 == 16842908) {
                this.A00 = 16842908;
                i2 = 16842908;
            } else if (i4 == 16842919) {
                this.A00 = 16842919;
                i2 = 16842919;
                break;
            }
            i3++;
        }
        if (i == i2) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void draw(Canvas canvas) {
    }

    public int getOpacity() {
        return 0;
    }

    public boolean isStateful() {
        return true;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
