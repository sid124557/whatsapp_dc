package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.4Lr  reason: invalid class name and case insensitive filesystem */
public class C86764Lr extends Drawable {
    public final /* synthetic */ C93314oJ A00;

    public C86764Lr(C93314oJ r1) {
        this.A00 = r1;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return true;
    }

    public void draw(Canvas canvas) {
    }

    public boolean onLevelChange(int i) {
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        return true;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public boolean setState(int[] iArr) {
        invalidateSelf();
        return true;
    }
}
