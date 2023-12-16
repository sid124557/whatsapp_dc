package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.drawee.drawable.DrawableProperties;

/* renamed from: X.6D3  reason: invalid class name */
public final class AnonymousClass6D3 extends Drawable implements Animatable {
    public C187518xL A00;
    public final DrawableProperties A01;
    public final AnonymousClass7PL A02;
    public final C172668Mf A03 = new C172668Mf(this, 8);
    public volatile boolean A04;

    public void draw(Canvas canvas) {
        long max;
        C162457s7.A0J(canvas, 0);
        AnonymousClass7PL r4 = this.A02;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (r4.A06) {
            max = (uptimeMillis - r4.A05) + 0;
        } else {
            max = Math.max(r4.A03, 0);
        }
        C152157Xt r8 = r4.A07;
        int A002 = r8.A00(max);
        r4.A03 = max;
        if (A002 == -1) {
            A002 = this.A00.getFrameCount() - 1;
            r4.A06 = false;
        } else if (A002 == 0 && r4.A01 != -1) {
            SystemClock.uptimeMillis();
        }
        if (this.A00.B2D(canvas, this, A002)) {
            r4.A01 = A002;
        } else {
            r4.A00++;
        }
        if (r4.A06) {
            long A022 = r8.A02(SystemClock.uptimeMillis() - r4.A05);
            if (A022 != -1) {
                long j = A022 + 8;
                if (j != -1) {
                    scheduleSelf(this.A03, j);
                    return;
                }
            } else {
                r4.A06 = false;
            }
        }
        r4.A06 = false;
    }

    public void onBoundsChange(Rect rect) {
        C162457s7.A0J(rect, 0);
        this.A00.Blp(rect);
    }

    public int getIntrinsicHeight() {
        return this.A00.B8R();
    }

    public int getIntrinsicWidth() {
        return this.A00.B8S();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.A02.A06;
    }

    public void setAlpha(int i) {
        this.A01.setAlpha(i);
        this.A00.Blf(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        this.A00.Bly(colorFilter);
    }

    public void start() {
        if (this.A00.getFrameCount() > 0) {
            AnonymousClass7PL r6 = this.A02;
            if (!r6.A06) {
                long uptimeMillis = SystemClock.uptimeMillis();
                r6.A05 = uptimeMillis - r6.A04;
                r6.A03 = uptimeMillis - r6.A02;
                r6.A01 = -1;
                r6.A06 = true;
            }
            invalidateSelf();
        }
    }

    public void stop() {
        AnonymousClass7PL r6 = this.A02;
        if (r6.A06) {
            long uptimeMillis = SystemClock.uptimeMillis();
            r6.A04 = uptimeMillis - r6.A05;
            r6.A02 = uptimeMillis - r6.A03;
            r6.A05 = 0;
            r6.A03 = -1;
            r6.A01 = -1;
            r6.A06 = false;
        }
        unscheduleSelf(this.A03);
    }

    public AnonymousClass6D3(C187518xL r3) {
        this.A00 = r3;
        this.A02 = new AnonymousClass7PL(new C152157Xt(r3));
        DrawableProperties drawableProperties = new DrawableProperties();
        drawableProperties.applyTo(this);
        this.A01 = drawableProperties;
    }
}
