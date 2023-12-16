package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.whatsapp.R;

/* renamed from: X.4NZ  reason: invalid class name */
public class AnonymousClass4NZ extends View implements AnonymousClass4GJ {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public AnimatorSet A0Q;
    public Bitmap A0R;
    public Bitmap A0S;
    public Bitmap A0T;
    public Matrix A0U;
    public Paint A0V;
    public Paint A0W;
    public Paint A0X;
    public Paint A0Y;
    public RectF A0Z;
    public RectF A0a;
    public C620733j A0b;
    public C116855qy A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;

    public AnonymousClass4NZ(Context context, C620733j r7, int i) {
        super(context, (AttributeSet) null, 0);
        if (!this.A0d) {
            this.A0d = true;
            generatedComponent();
        }
        this.A0e = false;
        this.A0M = i;
        this.A0b = r7;
        this.A0I = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A0N = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A0H = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A0F = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A0J = this.A0I / 2;
        this.A0P = AnonymousClass5Yj.A03(getContext(), getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        this.A0O = AnonymousClass5Yj.A03(getContext(), getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        this.A0G = AnonymousClass5Yj.A03(getContext(), getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        this.A0Z = AnonymousClass002.A07();
        int A032 = AnonymousClass5Yj.A03(getContext(), getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        Paint A0a2 = C86664Kz.A0a(1);
        this.A0W = A0a2;
        AnonymousClass001.A10(A0a2);
        this.A0W.setColor(A032);
        this.A0a = AnonymousClass002.A07();
        int A042 = AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved);
        Paint A0a3 = C86664Kz.A0a(1);
        this.A0X = A0a3;
        A0a3.setColor(A042);
        C86634Kw.A17(this.A0X);
        this.A0X.setStrokeWidth((float) this.A0H);
        Paint A0a4 = C86664Kz.A0a(1);
        this.A0Y = A0a4;
        A0a4.setFilterBitmap(true);
        Paint A0a5 = C86664Kz.A0a(1);
        this.A0V = A0a5;
        A0a5.setFilterBitmap(true);
        this.A0V.setColorFilter(new PorterDuffColorFilter(this.A0G, PorterDuff.Mode.SRC_IN));
        this.A0T = BitmapFactory.decodeResource(getResources(), R.drawable.ic_ptt_lock_shackle);
        this.A0S = BitmapFactory.decodeResource(getResources(), R.drawable.ic_ptt_lock_body);
        this.A0R = BitmapFactory.decodeResource(getResources(), R.drawable.ic_ptt_lock_arrow);
        float height = ((float) this.A0T.getHeight()) * 0.39f;
        this.A05 = height;
        this.A0B = height;
        float height2 = (float) ((this.A0I / 2) - (this.A0T.getHeight() / 2));
        this.A0D = height2;
        float height3 = height2 + (((float) this.A0T.getHeight()) * 0.9f);
        this.A0C = height3;
        this.A0A = height3 + ((float) this.A0S.getHeight()) + C86664Kz.A01(getResources(), R.dimen.f6nameremoved);
        this.A01 = this.A0B;
        this.A03 = -2.5f;
        this.A06 = (float) (this.A0N + this.A0R.getHeight());
        float height4 = (float) (this.A0N + this.A0T.getHeight());
        this.A08 = height4;
        this.A07 = height4 + (((float) this.A0T.getHeight()) * 0.9f);
        this.A0U = AnonymousClass002.A05();
        A02();
        setElevation(C86664Kz.A01(getResources(), R.dimen.f6nameremoved));
        setClipToOutline(false);
        setOutlineProvider(new C124996Et(this));
    }

    public void setPercentageLocked(float f) {
        C626936e.A0E(AnonymousClass001.A1U((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))), "Percentage must be >= 0.0");
        float min = Math.min(1.0f, f);
        if (this.A09 != min) {
            this.A09 = min;
            int i = this.A0N;
            int i2 = this.A0I;
            float f2 = (float) (i - i2);
            float height = ((float) this.A0T.getHeight()) * 0.39f;
            this.A0E = 255 - ((int) (C86664Kz.A00(min, 0.65f, 1.0f) * 255.0f));
            this.A0L = Math.min(i, Math.max((int) (((float) i) - (f2 * min)), i2));
            setTranslationY((-f2) * Math.min(min, 1.0f));
            if (min >= 0.15f) {
                if (this.A0e) {
                    A01();
                    this.A01 = this.A0B;
                    this.A00 = this.A0A;
                }
                float min2 = Math.min(1.0f, min);
                this.A03 = (min2 * 2.5f) - 1.75f;
                this.A02 = this.A0C - (height * min2);
                postInvalidate();
                invalidateOutline();
            } else if (this.A0f && !this.A0e) {
                A03();
            }
        }
    }

    public void A00() {
        if (this.A0f) {
            A01();
            int alpha = (int) ((getAlpha() / 1.0f) * 200.0f);
            animate().setListener((Animator.AnimatorListener) null).cancel();
            C86624Kv.A0A(this).setDuration((long) alpha).setListener(new C188668zI(this, 27)).start();
        }
    }

    public void A01() {
        if (this.A0e) {
            AnimatorSet animatorSet = this.A0Q;
            if (animatorSet != null) {
                animatorSet.end();
                this.A0Q.removeAllListeners();
            }
            this.A0Q = null;
        }
    }

    public final void A02() {
        this.A01 = this.A0B;
        this.A00 = this.A06;
        this.A04 = this.A08;
        this.A02 = this.A07;
        this.A0K = 0;
        this.A0L = this.A0N;
        this.A0E = 255;
        this.A09 = 0.0f;
        setTranslationY(0.0f);
        setScaleX(1.0f);
        setScaleY(1.0f);
        int i = 1;
        if (this.A0M == 1) {
            if (C102805Ki.A00(this.A0b)) {
                i = -1;
            }
            setTranslationX((float) (i * -175));
        }
        this.A0Y.setColorFilter(new PorterDuffColorFilter(this.A0P, PorterDuff.Mode.SRC_IN));
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            setPivotY((float) (getMeasuredHeight() / 2));
            setPivotX((float) (getMeasuredWidth() / 2));
        }
    }

    public final void A03() {
        if (!this.A0e) {
            this.A0Q = C86664Kz.A0O();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setDuration(800);
            ofFloat.setRepeatMode(2);
            ofFloat.setRepeatCount(-1);
            C86614Ku.A0y(ofFloat);
            C86604Kt.A0w(ofFloat, this, 35);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat2.setDuration(400);
            ofFloat2.setRepeatMode(2);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setInterpolator(new AccelerateInterpolator());
            C86604Kt.A0w(ofFloat2, this, 36);
            AnimatorSet animatorSet = this.A0Q;
            Animator[] animatorArr = new Animator[2];
            AnonymousClass000.A16(ofFloat, ofFloat2, animatorArr);
            animatorSet.playTogether(animatorArr);
            C86614Ku.A0z(this.A0Q, this, 26);
            this.A0Q.start();
        }
    }

    public final void A04(Runnable runnable, long j) {
        if (!this.A0f) {
            float[] A0T2 = AnonymousClass4L0.A0T();
            // fill-array-data instruction
            A0T2[0] = 0;
            A0T2[1] = 1065353216;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A0T2);
            ofFloat.setDuration(j);
            C86614Ku.A0y(ofFloat);
            C100295Aj.A03(ofFloat, this, 28);
            ofFloat.addListener(new C188658zH(runnable, 3, this));
            ofFloat.start();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0c;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0c = r0;
        }
        return r0.generatedComponent();
    }

    public int getCollapsedHeightPx() {
        return this.A0I;
    }

    public int getExpandedHeightPx() {
        return this.A0N;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.A0I, (int) (((float) this.A0N) + this.A05));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A01();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.A0W;
        paint.setAlpha(this.A0K);
        RectF rectF = this.A0Z;
        rectF.left = 0.0f;
        float f = (float) ((int) this.A01);
        rectF.top = f;
        rectF.right = 0.0f + ((float) this.A0I);
        rectF.bottom = f + ((float) this.A0L);
        float f2 = (float) this.A0J;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        float A0B2 = (float) C86664Kz.A0B(this);
        Matrix matrix = this.A0U;
        Bitmap bitmap = this.A0T;
        matrix.setTranslate(A0B2 - ((float) (bitmap.getWidth() / 2)), this.A04);
        matrix.postRotate(this.A03, (float) (bitmap.getWidth() / 2), (float) bitmap.getHeight());
        Paint paint2 = this.A0Y;
        canvas.drawBitmap(bitmap, matrix, paint2);
        Bitmap bitmap2 = this.A0S;
        canvas.drawBitmap(bitmap2, A0B2 - ((float) (bitmap2.getWidth() / 2)), this.A02, paint2);
        Paint paint3 = this.A0V;
        paint3.setAlpha(this.A0E);
        Bitmap bitmap3 = this.A0R;
        canvas.drawBitmap(bitmap3, A0B2 - ((float) (bitmap3.getWidth() / 2)), this.A00, paint3);
    }
}
