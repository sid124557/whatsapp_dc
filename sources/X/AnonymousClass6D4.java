package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.drawee.drawable.DrawableProperties;

/* renamed from: X.6D4  reason: invalid class name */
public class AnonymousClass6D4 extends Drawable implements Animatable {
    public static final AnonymousClass71I A0G = new AnonymousClass71I();
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public DrawableProperties A08;
    public C187518xL A09;
    public C152157Xt A0A;
    public final AnonymousClass7AM A0B;
    public final Runnable A0C;
    public volatile C177778gR A0D;
    public volatile AnonymousClass71I A0E;
    public volatile boolean A0F;

    public void draw(Canvas canvas) {
        C152157Xt r6;
        long max;
        C187518xL r4 = this.A09;
        if (r4 != null && (r6 = this.A0A) != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.A0F) {
                max = (uptimeMillis - this.A07) + 0;
            } else {
                max = Math.max(this.A04, 0);
            }
            int A002 = r6.A00(max);
            if (A002 == -1) {
                A002 = r4.getFrameCount() - 1;
                this.A0F = false;
            }
            if (r4.B2D(canvas, this, A002)) {
                this.A01 = A002;
            } else {
                int i = this.A00 + 1;
                this.A00 = i;
                if (C161577py.A00.BI0(2)) {
                    C161577py.A02(AnonymousClass6D4.class, Integer.valueOf(i), "Dropped a frame. Count: %s");
                }
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            if (this.A0F) {
                long A022 = r6.A02(uptimeMillis2 - this.A07);
                if (A022 != -1) {
                    scheduleSelf(this.A0C, this.A07 + this.A03 + A022);
                } else {
                    this.A0F = false;
                }
            }
            this.A04 = max;
        }
    }

    public int getIntrinsicHeight() {
        C187518xL r0 = this.A09;
        if (r0 == null) {
            return super.getIntrinsicHeight();
        }
        return r0.B8R();
    }

    public int getIntrinsicWidth() {
        C187518xL r0 = this.A09;
        if (r0 == null) {
            return super.getIntrinsicWidth();
        }
        return r0.B8S();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.A0F;
    }

    public boolean onLevelChange(int i) {
        if (!this.A0F) {
            long j = (long) i;
            if (this.A04 != j) {
                this.A04 = j;
                invalidateSelf();
                return true;
            }
        }
        return false;
    }

    public void setAlpha(int i) {
        DrawableProperties drawableProperties = this.A08;
        if (drawableProperties == null) {
            drawableProperties = new DrawableProperties();
            this.A08 = drawableProperties;
        }
        drawableProperties.setAlpha(i);
        C187518xL r0 = this.A09;
        if (r0 != null) {
            r0.Blf(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        DrawableProperties drawableProperties = this.A08;
        if (drawableProperties == null) {
            drawableProperties = new DrawableProperties();
            this.A08 = drawableProperties;
        }
        drawableProperties.setColorFilter(colorFilter);
        C187518xL r0 = this.A09;
        if (r0 != null) {
            r0.Bly(colorFilter);
        }
    }

    public void start() {
        C187518xL r0;
        if (!this.A0F && (r0 = this.A09) != null && r0.getFrameCount() > 1) {
            this.A0F = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.A07 = uptimeMillis - this.A06;
            this.A04 = uptimeMillis - this.A05;
            this.A01 = this.A02;
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.A0F) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.A06 = uptimeMillis - this.A07;
            this.A05 = uptimeMillis - this.A04;
            this.A02 = this.A01;
            this.A0F = false;
            this.A07 = 0;
            this.A04 = -1;
            this.A01 = -1;
            unscheduleSelf(this.A0C);
        }
    }

    public AnonymousClass6D4(C187518xL r4) {
        C152157Xt r0;
        this.A03 = 8;
        this.A0E = A0G;
        AnonymousClass7AM r2 = new AnonymousClass7AM(this);
        this.A0B = r2;
        this.A0C = new C172668Mf(this, 7);
        this.A09 = r4;
        if (r4 == null) {
            r0 = null;
        } else {
            r0 = new C152157Xt(r4);
        }
        this.A0A = r0;
        if (r4 != null) {
            r4.Blg(r2);
        }
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        C187518xL r0 = this.A09;
        if (r0 != null) {
            r0.Blp(rect);
        }
    }

    public AnonymousClass6D4() {
        this((C187518xL) null);
    }
}
