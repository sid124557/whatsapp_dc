package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: X.015  reason: invalid class name */
public class AnonymousClass015 extends Drawable {
    public final ActionBarContainer A00;

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.A00;
        if (actionBarContainer.A07) {
            Drawable drawable = actionBarContainer.A02;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.A01;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.A03;
        if (drawable3 != null && actionBarContainer.A08) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.A00;
        if (actionBarContainer.A07) {
            drawable = actionBarContainer.A02;
        } else {
            drawable = actionBarContainer.A01;
        }
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public AnonymousClass015(ActionBarContainer actionBarContainer) {
        this.A00 = actionBarContainer;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
