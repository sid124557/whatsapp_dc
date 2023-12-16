package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.6D0  reason: invalid class name */
public class AnonymousClass6D0 extends Drawable {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ColorStateList A06;
    public C161877ql A07;
    public boolean A08 = true;
    public final Paint A09;
    public final Path A0A = AnonymousClass002.A06();
    public final Rect A0B = AnonymousClass001.A0N();
    public final RectF A0C = AnonymousClass002.A07();
    public final RectF A0D = AnonymousClass002.A07();
    public final AnonymousClass6Cr A0E = new AnonymousClass6Cr(this);
    public final AnonymousClass7XF A0F = AnonymousClass772.A00;

    public void onBoundsChange(Rect rect) {
        this.A08 = true;
    }

    public void draw(Canvas canvas) {
        if (this.A08) {
            Paint paint = this.A09;
            Rect rect = this.A0B;
            copyBounds(rect);
            float height = this.A00 / ((float) rect.height());
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{AnonymousClass0YI.A05(this.A05, this.A03), AnonymousClass0YI.A05(this.A04, this.A03), AnonymousClass0YI.A05(this.A04 & 16777215, this.A03), AnonymousClass0YI.A05(this.A01 & 16777215, this.A03), AnonymousClass0YI.A05(this.A01, this.A03), AnonymousClass0YI.A05(this.A02, this.A03)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.A08 = false;
        }
        Paint paint2 = this.A09;
        float strokeWidth = paint2.getStrokeWidth() / 2.0f;
        Rect rect2 = this.A0B;
        copyBounds(rect2);
        RectF rectF = this.A0D;
        rectF.set(rect2);
        C181228mP r0 = this.A07.A02;
        RectF rectF2 = this.A0C;
        AnonymousClass6C8.A0v(rectF2, this);
        float min = Math.min(r0.B60(rectF2), rectF.width() / 2.0f);
        C161877ql r02 = this.A07;
        AnonymousClass6C8.A0v(rectF2, this);
        if (r02.A03(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint2);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.A0E;
    }

    public int getOpacity() {
        if (this.A00 > 0.0f) {
            return -3;
        }
        return -2;
    }

    public void getOutline(Outline outline) {
        C161877ql r0 = this.A07;
        RectF rectF = this.A0C;
        AnonymousClass6C8.A0v(rectF, this);
        if (r0.A03(rectF)) {
            C181228mP r02 = this.A07.A02;
            AnonymousClass6C8.A0v(rectF, this);
            outline.setRoundRect(getBounds(), r02.B60(rectF));
            return;
        }
        Rect rect = this.A0B;
        copyBounds(rect);
        RectF rectF2 = this.A0D;
        rectF2.set(rect);
        AnonymousClass7XF r03 = this.A0F;
        C161877ql r3 = this.A07;
        Path path = this.A0A;
        r03.A00(path, rectF2, r3, (C178898iH) null, 1.0f);
        C1446372i.A00(outline, path);
    }

    public boolean getPadding(Rect rect) {
        C161877ql r1 = this.A07;
        RectF rectF = this.A0C;
        AnonymousClass6C8.A0v(rectF, this);
        if (!r1.A03(rectF)) {
            return true;
        }
        int round = Math.round(this.A00);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.A06;
        if ((colorStateList == null || !colorStateList.isStateful()) && !super.isStateful()) {
            return false;
        }
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.A06;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.A03)) == this.A03)) {
            this.A08 = true;
            this.A03 = colorForState;
        }
        if (this.A08) {
            invalidateSelf();
        }
        return this.A08;
    }

    public void setAlpha(int i) {
        this.A09.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A09.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public AnonymousClass6D0(C161877ql r3) {
        this.A07 = r3;
        Paint paint = new Paint(1);
        this.A09 = paint;
        paint.setStyle(Paint.Style.STROKE);
    }
}
