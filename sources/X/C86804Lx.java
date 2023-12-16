package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.whatsapp.R;

/* renamed from: X.4Lx  reason: invalid class name and case insensitive filesystem */
public class C86804Lx extends Drawable {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public Bitmap A05;
    public Bitmap A06;
    public Bitmap A07;
    public BitmapShader A08;
    public String A09;
    public boolean A0A;
    public boolean A0B = true;
    public final float A0C;
    public final float A0D;
    public final float A0E;
    public final Context A0F;
    public final Bitmap A0G;
    public final Matrix A0H;
    public final Paint A0I;
    public final Paint A0J;
    public final Paint A0K;
    public final Paint A0L;
    public final Paint A0M;
    public final Paint A0N;
    public final Paint A0O;
    public final Paint A0P;
    public final Path A0Q;
    public final RectF A0R = AnonymousClass002.A07();
    public final RectF A0S;
    public final RectF A0T;
    public final TextPaint A0U;

    public C86804Lx(Context context, Bitmap bitmap, int i) {
        this.A04 = i;
        this.A0F = context;
        this.A0C = 1.0f;
        this.A0G = bitmap;
        TextPaint textPaint = new TextPaint();
        this.A0U = textPaint;
        textPaint.setARGB(255, 0, 0, 0);
        Paint.Align align = Paint.Align.LEFT;
        textPaint.setTextAlign(align);
        textPaint.setTextSize(32.0f);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textPaint.setTypeface(typeface);
        Paint A0Z = C86664Kz.A0Z();
        this.A0P = A0Z;
        A0Z.setARGB(255, 255, 255, 255);
        A0Z.setTextAlign(align);
        A0Z.setTextSize(32.0f);
        A0Z.setTypeface(typeface);
        C86634Kw.A17(A0Z);
        A0Z.setStrokeWidth(8.0f);
        Paint A0a = C86664Kz.A0a(1);
        this.A0I = A0a;
        C86604Kt.A0u(-1, A0a);
        A0a.setShadowLayer(AnonymousClass5YI.A00(context), 0.0f, 0.0f, context.getResources().getColor(R.color.f5nameremoved));
        Paint A0a2 = C86664Kz.A0a(1);
        this.A0L = A0a2;
        AnonymousClass001.A10(A0a2);
        Paint A0Z2 = C86664Kz.A0Z();
        this.A0M = A0Z2;
        A0Z2.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A0S = AnonymousClass002.A07();
        this.A0T = AnonymousClass002.A07();
        this.A0H = AnonymousClass002.A05();
        float A012 = AnonymousClass5YI.A01(context, 2.0f);
        this.A0D = A012;
        float A013 = AnonymousClass5YI.A01(context, 8.0f);
        this.A0E = A013;
        this.A02 = Math.round(AnonymousClass5YI.A01(context, 6.0f));
        float f = (float) i;
        float f2 = A013 * 2.0f;
        this.A01 = f2 + f + A00() + AnonymousClass5YI.A01(this.A0F, 18.0f) + AnonymousClass5YI.A01(context, 2.0f);
        float f3 = A012 * 2.0f;
        this.A00 = ((f - f3) / 1.0f) + ((float) this.A02) + f3 + f2;
        Path A062 = AnonymousClass002.A06();
        this.A0Q = A062;
        A062.setFillType(Path.FillType.WINDING);
        Paint A0a3 = C86664Kz.A0a(3);
        this.A0N = A0a3;
        AnonymousClass001.A10(A0a3);
        C86614Ku.A10(context, A0a3, R.color.f5nameremoved);
        Paint A0a4 = C86664Kz.A0a(1);
        this.A0J = A0a4;
        Paint.Style style = Paint.Style.FILL;
        A0a4.setStyle(style);
        Paint A0a5 = C86664Kz.A0a(3);
        this.A0K = A0a5;
        A0a5.setStrokeWidth(A012);
        C86614Ku.A10(context, A0a5, R.color.f5nameremoved);
        C86634Kw.A17(A0a5);
        int A042 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        Paint A0a6 = C86664Kz.A0a(1);
        this.A0O = A0a6;
        A0a6.setColor(A042);
        A0a6.setStyle(style);
        A0a6.setShadowLayer(A013, 0.0f, 0.0f, A042);
    }

    public void A01() {
        float f = this.A0E * 2.0f;
        Context context = this.A0F;
        float A002 = ((float) this.A04) + f + A00() + AnonymousClass5YI.A01(context, 18.0f) + AnonymousClass5YI.A00(context);
        this.A01 = A002;
        int round = Math.round(AnonymousClass5YI.A01(context, 6.0f));
        this.A02 = round;
        float f2 = this.A0D * 2.0f;
        float A003 = ((((((A002 - A00()) - AnonymousClass5YI.A01(context, 18.0f)) - AnonymousClass5YI.A00(context)) - f) - f2) / this.A0C) + ((float) round) + f2 + f;
        this.A00 = A003;
        setBounds(0, 0, Math.round(this.A01), Math.round(A003));
    }

    public void A02(Bitmap bitmap) {
        this.A06 = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.A08 = bitmapShader;
        this.A0N.setShader(bitmapShader);
    }

    public void draw(Canvas canvas) {
        CharSequence charSequence;
        if (this.A06 != null) {
            Paint paint = this.A0J;
            paint.setColor(-1);
            Paint paint2 = this.A0K;
            paint2.setColor(-1);
            Paint paint3 = this.A0N;
            paint3.setColor(-1);
            Rect bounds = getBounds();
            RectF rectF = this.A0T;
            float width = rectF.width();
            float height = rectF.height();
            float max = Math.max(width / ((float) this.A06.getWidth()), height / ((float) this.A06.getHeight()));
            Matrix matrix = this.A0H;
            matrix.setScale(max, max);
            matrix.postTranslate((width - (((float) this.A06.getWidth()) * max)) / 2.0f, (height - (((float) this.A06.getHeight()) * max)) / 2.0f);
            this.A08.setLocalMatrix(matrix);
            Rect bounds2 = getBounds();
            if (this.A07 == null) {
                Bitmap createBitmap = Bitmap.createBitmap(bounds2.width(), bounds2.height(), Bitmap.Config.ARGB_4444);
                this.A07 = createBitmap;
                AnonymousClass4L0.A06(createBitmap).drawPath(this.A0Q, this.A0O);
            }
            float f = this.A0E;
            float f2 = f * 2.0f;
            float width2 = (((float) bounds.width()) - f2) / (((float) this.A07.getWidth()) - f2);
            Canvas canvas2 = canvas;
            canvas2.save();
            canvas2.scale(width2, width2, rectF.left, rectF.top);
            if (this.A0A) {
                canvas2.drawBitmap(this.A07, 0.0f, 0.0f, paint);
            }
            canvas2.restore();
            canvas2.drawPath(this.A0Q, paint);
            canvas2.save();
            float f3 = rectF.left;
            float f4 = rectF.top;
            rectF.offsetTo(0.0f, 0.0f);
            canvas2.translate(f3, f4);
            canvas2.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint2);
            if (this.A0B) {
                canvas2.drawCircle(rectF.centerX(), rectF.bottom + ((float) (this.A02 / 2)), AnonymousClass5YI.A01(this.A0F, 2.5f), this.A0I);
            }
            canvas2.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - this.A0D, paint3);
            TextPaint textPaint = this.A0U;
            textPaint.setARGB(255, 0, 0, 0);
            if (!TextUtils.isEmpty(this.A09)) {
                Context context = this.A0F;
                float A022 = (float) AnonymousClass5YI.A02(context);
                if (A00() >= A022) {
                    charSequence = TextUtils.ellipsize(this.A09, textPaint, A022, TextUtils.TruncateAt.END);
                } else {
                    charSequence = this.A09;
                }
                Rect A0N2 = AnonymousClass001.A0N();
                String str = this.A09;
                if (str == null) {
                    str = "";
                }
                Paint paint4 = this.A0P;
                paint4.getTextBounds(str, 0, str.length(), A0N2);
                float height2 = (float) A0N2.height();
                float centerY = rectF.centerY() - ((AnonymousClass5YI.A01(context, 18.0f) - height2) / 2.0f);
                float A012 = rectF.right + f + AnonymousClass5YI.A01(context, 18.0f) + AnonymousClass5YI.A00(context);
                canvas2.drawText(charSequence, 0, charSequence.length(), A012, centerY, paint4);
                canvas2.drawText(charSequence, 0, charSequence.length(), A012, centerY, textPaint);
                RectF A092 = AnonymousClass4L0.A09(rectF.right + f, rectF.centerY() - AnonymousClass5YI.A01(context, 18.0f), rectF.right + f + AnonymousClass5YI.A01(context, 18.0f), rectF.centerY());
                canvas2.save();
                canvas2.clipRect(A092);
                canvas2.drawCircle(A092.centerX(), A092.centerY(), A092.width() / 2.0f, this.A0L);
                Rect clipBounds = canvas2.getClipBounds();
                int A042 = AnonymousClass5YI.A04(context, 4.0f);
                clipBounds.left += A042;
                clipBounds.right -= A042;
                clipBounds.bottom -= A042;
                clipBounds.top += A042;
                Bitmap bitmap = this.A05;
                if (bitmap != null) {
                    canvas2.drawBitmap(bitmap, (Rect) null, clipBounds, this.A0M);
                }
                canvas2.restore();
                String A023 = AnonymousClass5ZZ.A02(context, this.A03);
                if (A023 != null) {
                    int i = this.A03;
                    int i2 = R.color.f5nameremoved;
                    if (i != 0) {
                        i2 = R.color.f5nameremoved;
                        if (i != 1) {
                            i2 = R.color.f5nameremoved;
                        }
                    }
                    C86614Ku.A10(context, textPaint, i2);
                    float f5 = rectF.right + f;
                    float centerY2 = rectF.centerY() + height2;
                    canvas2.drawText(A023, f5, centerY2, paint4);
                    canvas2.drawText(A023, f5, centerY2, textPaint);
                }
            }
            rectF.offsetTo(f3, f4);
            canvas2.restore();
        }
    }

    public int getIntrinsicHeight() {
        return Math.round(this.A00);
    }

    public int getIntrinsicWidth() {
        return Math.round(this.A01);
    }

    public int getOpacity() {
        return -1;
    }

    public void onBoundsChange(Rect rect) {
        RectF rectF = this.A0S;
        rectF.set(rect);
        float f = this.A0E;
        rectF.inset(f, f);
        RectF rectF2 = this.A0T;
        rectF2.set(rectF);
        float f2 = rectF2.right;
        float A002 = A00();
        Context context = this.A0F;
        rectF2.right = f2 - ((A002 + AnonymousClass5YI.A01(context, 18.0f)) + AnonymousClass5YI.A00(context));
        rectF2.set(rectF2);
        float f3 = (float) this.A02;
        float width = (rectF2.width() / 2.0f) - (f3 / 2.0f);
        float height = rectF2.height();
        this.A0R.set(width, height, f3 + width, ((float) this.A02) + height);
        Path path = this.A0Q;
        path.reset();
        path.addCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, Path.Direction.CW);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A0N.setColorFilter(colorFilter);
        this.A0J.setColorFilter(colorFilter);
    }

    public float A00() {
        Rect A0N2 = AnonymousClass001.A0N();
        Rect A0N3 = AnonymousClass001.A0N();
        String str = this.A09;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        Paint paint = this.A0P;
        paint.getTextBounds(str, 0, str.length(), A0N2);
        int i = this.A03;
        Context context = this.A0F;
        String A022 = AnonymousClass5ZZ.A02(context, i);
        if (A022 != null) {
            str2 = A022;
        }
        paint.getTextBounds(str2, 0, str2.length(), A0N3);
        return (float) Math.min(Math.max(A0N2.width(), A0N3.width()), AnonymousClass5YI.A02(context));
    }

    public void setAlpha(int i) {
    }
}
