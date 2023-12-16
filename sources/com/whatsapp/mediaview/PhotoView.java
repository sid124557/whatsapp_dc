package com.whatsapp.mediaview;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0N1;
import X.AnonymousClass4L0;
import X.AnonymousClass4SW;
import X.AnonymousClass6ET;
import X.C08090dJ;
import X.C100645Bs;
import X.C105445Uy;
import X.C117415rt;
import X.C117585sA;
import X.C117605sC;
import X.C135756lC;
import X.C166767zE;
import X.C18290x4;
import X.C70013Zn;
import X.C71383c1;
import X.C86654Ky;
import X.C86664Kz;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.InteractiveAnnotation;

public class PhotoView extends AnonymousClass4SW implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public Matrix A0A;
    public Matrix A0B;
    public Matrix A0C;
    public Paint A0D;
    public PointF A0E;
    public Rect A0F;
    public RectF A0G;
    public RectF A0H;
    public RectF A0I;
    public BitmapDrawable A0J;
    public Drawable A0K;
    public ScaleGestureDetector A0L;
    public View.OnClickListener A0M;
    public AnonymousClass0N1 A0N;
    public C71383c1 A0O;
    public C117415rt A0P;
    public C117415rt A0Q;
    public C117585sA A0R;
    public C117605sC A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public final Runnable A0Z = new C70013Zn(this, 17);

    public void A02() {
        this.A0N = null;
        this.A0L = null;
        this.A0J = null;
        setImageDrawable((Drawable) null);
        C117605sC r1 = this.A0S;
        if (r1 != null) {
            r1.A06 = false;
            r1.A07 = true;
        }
        this.A0S = null;
        C117415rt r0 = this.A0Q;
        if (r0 != null) {
            C117415rt.A00(r0);
        }
        this.A0Q = null;
        C117415rt r02 = this.A0P;
        if (r02 != null) {
            C117415rt.A00(r02);
        }
        this.A0P = null;
        C117585sA r03 = this.A0R;
        if (r03 != null) {
            r03.A02 = true;
            PhotoView photoView = r03.A03;
            photoView.A07 = (float) Math.round(photoView.A07);
            photoView.A09(true);
            photoView.requestLayout();
            photoView.invalidate();
        }
        this.A0R = null;
        C71383c1 r12 = this.A0O;
        if (r12 != null) {
            r12.A02 = true;
        }
        this.A0O = null;
        this.A0M = null;
        this.A0M = null;
    }

    public final void A05(float f, float f2, float f3) {
        float min = Math.min(Math.max(f, this.A04 * this.A08), this.A03);
        float f4 = min / this.A00;
        Matrix matrix = this.A0B;
        matrix.postRotate(-this.A07, (float) C86664Kz.A0B(this), (float) C86654Ky.A04(this));
        matrix.postScale(f4, f4, f2, f3);
        this.A00 = min;
        matrix.postRotate(this.A07, (float) C86664Kz.A0B(this), (float) C86654Ky.A04(this));
        A0A(true);
        setImageMatrix(matrix);
    }

    public static void A01(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                A01(viewGroup.getChildAt(i));
            }
        } else if (view instanceof PhotoView) {
            ((PhotoView) view).A02();
        }
    }

    public final void A04(float f, float f2) {
        View.OnClickListener onClickListener = this.A0M;
        if (onClickListener == null) {
            return;
        }
        if (onClickListener instanceof C166767zE) {
            C135756lC r8 = (C135756lC) ((C166767zE) onClickListener);
            C100645Bs r6 = r8.A00;
            PhotoView photoView = (PhotoView) r6.A01;
            Bitmap photo = photoView.getPhoto();
            if (photo != null) {
                Matrix A052 = AnonymousClass002.A05();
                photoView.getImageMatrix().invert(A052);
                float[] fArr = {f, f2};
                float[] fArr2 = {(float) photo.getWidth(), (float) photo.getHeight()};
                A052.mapPoints(fArr);
                MediaViewFragment mediaViewFragment = (MediaViewFragment) r6.A00;
                InteractiveAnnotation A012 = C105445Uy.A01(mediaViewFragment.A0z, r8.A01, fArr, fArr2, false);
                if (A012 != null) {
                    MediaViewFragment.A04(A012, mediaViewFragment, photoView);
                    return;
                }
            }
            MediaViewBaseFragment mediaViewBaseFragment = (MediaViewBaseFragment) r6.A00;
            mediaViewBaseFragment.A1W(!mediaViewBaseFragment.A0J, true);
            return;
        }
        onClickListener.onClick(this);
    }

    public void A06(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable;
        if (bitmap == null) {
            bitmapDrawable = null;
        } else {
            bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
        }
        A07(bitmapDrawable);
    }

    public void A07(BitmapDrawable bitmapDrawable) {
        BitmapDrawable bitmapDrawable2 = this.A0J;
        if (bitmapDrawable != bitmapDrawable2) {
            boolean z = false;
            if (bitmapDrawable2 != null) {
                if (!(bitmapDrawable != null && bitmapDrawable2.getIntrinsicWidth() == bitmapDrawable.getIntrinsicWidth() && this.A0J.getIntrinsicHeight() == bitmapDrawable.getIntrinsicHeight())) {
                    z = true;
                }
                this.A04 = 0.0f;
            }
            this.A0J = bitmapDrawable;
            setImageDrawable(bitmapDrawable);
            A09(z);
            invalidate();
        }
    }

    public void A08(boolean z) {
        this.A0Y = z;
        if (!z) {
            Matrix matrix = this.A0B;
            matrix.set(this.A0C);
            this.A00 = this.A06;
            setImageMatrix(matrix);
        }
    }

    public final void A09(boolean z) {
        float f;
        float f2;
        float min;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        BitmapDrawable bitmapDrawable = this.A0J;
        if (bitmapDrawable != null && this.A0W) {
            this.A0J.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), this.A0J.getIntrinsicHeight());
            if (z || (this.A04 == 0.0f && this.A0J != null && this.A0W)) {
                float intrinsicWidth = (float) this.A0J.getIntrinsicWidth();
                float intrinsicHeight = (float) this.A0J.getIntrinsicHeight();
                float A062 = (float) AnonymousClass000.A06(this, getWidth());
                float A052 = (float) AnonymousClass000.A05(this, getHeight());
                this.A05 = 0.0f;
                Matrix matrix = this.A0B;
                matrix.reset();
                this.A0H.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
                this.A0G.set(0.0f, 0.0f, A062, A052);
                float f9 = intrinsicWidth / 2.0f;
                float f10 = intrinsicHeight / 2.0f;
                matrix.setTranslate((A062 / 2.0f) - f9, (A052 / 2.0f) - f10);
                boolean z2 = this.A0T;
                float abs = Math.abs(this.A07 % 180.0f);
                int i = (abs > 90.0f ? 1 : (abs == 90.0f ? 0 : -1));
                if (z2) {
                    if (i == 0) {
                        f7 = A062 / intrinsicHeight;
                        f8 = A052 / intrinsicWidth;
                    } else {
                        f7 = A062 / intrinsicWidth;
                        f8 = A052 / intrinsicHeight;
                    }
                    min = Math.max(f7, f8);
                } else {
                    if (i == 0) {
                        f = A062 / intrinsicHeight;
                        f2 = A052 / intrinsicWidth;
                    } else {
                        f = A062 / intrinsicWidth;
                        f2 = A052 / intrinsicHeight;
                    }
                    min = Math.min(f, f2);
                }
                this.A04 = min;
                float f11 = this.A02;
                float min2 = Math.min(min, f11);
                this.A04 = min2;
                int i2 = this.A09;
                if (i2 == 3) {
                    if (abs == 90.0f) {
                        f5 = A062 / intrinsicHeight;
                        f6 = A052 / intrinsicWidth;
                    } else {
                        f5 = A062 / intrinsicWidth;
                        f6 = A052 / intrinsicHeight;
                    }
                    min2 = Math.max(f5, f6);
                } else if (i2 == 1) {
                    if (abs == 90.0f) {
                        min2 = A062 / intrinsicHeight;
                    } else {
                        min2 = A062 / intrinsicWidth;
                    }
                } else if (i2 == 2) {
                    if (abs == 90.0f) {
                        min2 = A052 / intrinsicWidth;
                    } else {
                        min2 = A052 / intrinsicHeight;
                    }
                }
                if (abs == 90.0f) {
                    f3 = A062 / intrinsicHeight;
                    f4 = A052 / intrinsicWidth;
                } else {
                    f3 = A062 / intrinsicWidth;
                    f4 = A052 / intrinsicHeight;
                }
                if (AnonymousClass002.A00(f3 / f4, 1.0f) < this.A01) {
                    min2 = Math.max(f3, f4);
                    this.A05 = min2;
                }
                float min3 = Math.min(min2, f11);
                this.A00 = min3;
                this.A05 = Math.min(this.A05, f11);
                matrix.preScale(min3, min3, f9, f10);
                this.A03 = Math.max(this.A04 * 8.0f, 8.0f);
                matrix.postRotate(this.A07, (float) C86664Kz.A0E(this, 2), (float) (getHeight() / 2));
                this.A06 = this.A00;
                this.A0C.set(matrix);
            }
            Matrix matrix2 = this.A0B;
            this.A0A = matrix2;
            setImageMatrix(matrix2);
        }
    }

    public final void A0A(boolean z) {
        float f;
        RectF rectF = this.A0I;
        rectF.set(this.A0H);
        Matrix matrix = this.A0B;
        matrix.mapRect(rectF);
        float A002 = AnonymousClass4L0.A00(this);
        float f2 = rectF.left;
        float f3 = rectF.right;
        float f4 = 0.0f;
        float f5 = A002 - 0.0f;
        if (f3 - f2 < f5) {
            f = ((f5 - (f3 + f2)) / 2.0f) + 0.0f;
        } else if (f2 > 0.0f) {
            f = 0.0f - f2;
        } else if (f3 < A002) {
            f = A002 - f3;
        } else {
            f = 0.0f;
        }
        float A022 = C86664Kz.A02(this);
        float f6 = rectF.top;
        float f7 = rectF.bottom;
        float f8 = A022 - 0.0f;
        if (f7 - f6 < f8) {
            f4 = 0.0f + ((f8 - (f7 + f6)) / 2.0f);
        } else if (f6 > 0.0f) {
            f4 = 0.0f - f6;
        } else if (f7 < A022) {
            f4 = A022 - f7;
        }
        if ((Math.abs(f) > 20.0f || Math.abs(f4) > 20.0f) && !z) {
            C117415rt r3 = this.A0P;
            if (r3 != null && !r3.A04) {
                r3.A02 = -1;
                r3.A00 = f;
                r3.A01 = f4;
                r3.A05 = false;
                r3.A04 = true;
                ((View) r3.A03).postDelayed(r3, 250);
                return;
            }
            return;
        }
        matrix.postTranslate(f, f4);
        setImageMatrix(matrix);
    }

    public boolean A0B() {
        if (this.A0Y) {
            C117415rt r0 = this.A0Q;
            if (r0 != null && r0.A04) {
                return true;
            }
            float f = this.A05;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            float f2 = this.A00;
            if (i == 0) {
                if (f2 != this.A04) {
                    return true;
                }
            } else if (f2 > f) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0C(float f, float f2) {
        float A012;
        float A013;
        RectF rectF = this.A0I;
        rectF.set(this.A0H);
        Matrix matrix = this.A0B;
        matrix.mapRect(rectF);
        float A002 = AnonymousClass4L0.A00(this);
        float f3 = rectF.left;
        float f4 = rectF.right;
        float f5 = A002 - 0.0f;
        if (f4 - f3 < f5) {
            A012 = ((f5 - (f4 + f3)) / 2.0f) + 0.0f;
        } else {
            A012 = AnonymousClass001.A01(0.0f - f3, f, A002 - f4);
        }
        float A022 = C86664Kz.A02(this);
        float f6 = rectF.top;
        float f7 = rectF.bottom;
        float f8 = A022 - 0.0f;
        if (f7 - f6 < f8) {
            A013 = ((f8 - (f7 + f6)) / 2.0f) + 0.0f;
        } else {
            A013 = AnonymousClass001.A01(0.0f - f6, f2, A022 - f7);
        }
        matrix.postTranslate(A012, A013);
        setImageMatrix(matrix);
        if (A012 == f && A013 == f2) {
            return true;
        }
        return false;
    }

    public Bitmap getFullViewCroppedBitmap() {
        if (!this.A0T) {
            return null;
        }
        Bitmap A0Y2 = C86664Kz.A0Y(getWidth(), getHeight());
        Canvas A062 = AnonymousClass4L0.A06(A0Y2);
        Matrix matrix = new Matrix(this.A0A);
        if (this.A0J == null) {
            return A0Y2;
        }
        A062.concat(matrix);
        this.A0J.draw(A062);
        return A0Y2;
    }

    public float getMinScale() {
        return this.A04;
    }

    public float getOriginalScale() {
        return this.A06;
    }

    public Bitmap getPhoto() {
        BitmapDrawable bitmapDrawable = this.A0J;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getBitmap();
        }
        return null;
    }

    public float getScale() {
        return this.A00;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        float x;
        float y;
        if (!this.A0V || !this.A0Y) {
            return false;
        }
        if (!this.A0U) {
            float f = this.A00;
            float f2 = this.A04;
            float f3 = f2 * 2.0f;
            if (f == f3) {
                f3 = f2;
            }
            float min = Math.min(this.A03, Math.max(f2, f3));
            C117605sC r4 = this.A0S;
            if (r4 != null) {
                if (min == f2) {
                    x = (float) C86664Kz.A0B(this);
                    y = (float) C86654Ky.A04(this);
                } else {
                    x = motionEvent.getX();
                    y = motionEvent.getY();
                }
                r4.A00(f, min, x, y, 200);
            }
        }
        this.A0U = false;
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (!this.A0Y) {
            return true;
        }
        C117415rt r0 = this.A0Q;
        if (r0 != null) {
            C117415rt.A00(r0);
        }
        C117415rt r02 = this.A0P;
        if (r02 == null) {
            return true;
        }
        C117415rt.A00(r02);
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C117415rt r2;
        if (!this.A0Y || (r2 = this.A0Q) == null || r2.A04) {
            return true;
        }
        r2.A02 = -1;
        r2.A00 = f;
        r2.A01 = f2;
        r2.A05 = false;
        r2.A04 = true;
        ((View) r2.A03).post(r2);
        return true;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0Y) {
            this.A0X = false;
            A05(this.A00 * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.A0Y) {
            return false;
        }
        C117605sC r1 = this.A0S;
        if (r1 != null) {
            r1.A06 = false;
            r1.A07 = true;
        }
        this.A0X = true;
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C117605sC r1;
        if (this.A0Y && this.A0X) {
            this.A0U = true;
            Matrix matrix = this.A0B;
            matrix.set(this.A0C);
            this.A00 = this.A06;
            setImageMatrix(matrix);
        }
        float f = this.A00;
        float f2 = this.A04;
        if (f < f2 && (r1 = this.A0S) != null) {
            r1.A00(f, f2, (float) C86664Kz.A0B(this), (float) C86654Ky.A04(this), 100);
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.A0Y) {
            return true;
        }
        A0C(-f, -f2);
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.A0M != null && !this.A0X && this.A0V) {
            A04(motionEvent.getX(), motionEvent.getY());
        }
        this.A0X = false;
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!(this.A0L == null || this.A0N == null)) {
            if (!isEnabled()) {
                return false;
            }
            this.A0L.onTouchEvent(motionEvent);
            this.A0N.A00(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int pointerCount = motionEvent.getPointerCount();
            if (actionMasked != 1) {
                if (actionMasked != 3) {
                    return true;
                }
            } else if (this.A0M != null && !this.A0X && pointerCount == 1 && !this.A0V) {
                this.A0E.set(motionEvent.getX(), motionEvent.getY());
                post(this.A0Z);
            }
            C117415rt r0 = this.A0Q;
            if (r0 != null && !r0.A04) {
                A0A(false);
            }
        }
        return true;
    }

    public void setAllowFullViewCrop(boolean z) {
        if (z != this.A0T) {
            this.A0T = z;
            requestLayout();
            invalidate();
        }
    }

    public void setIsLongpressEnabled(boolean z) {
        ((C08090dJ) this.A0N.A00).A00.setIsLongpressEnabled(z);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass4SW.A00(this);
        A03();
    }

    private int getScaledMinScalingSpan() {
        Resources A0G2 = C18290x4.A0G(this);
        try {
            return A0G2.getDimensionPixelSize(A0G2.getIdentifier("config_minScalingSpan", "dimen", "android"));
        } catch (Resources.NotFoundException unused) {
            return (int) TypedValue.applyDimension(5, 27.0f, A0G2.getDisplayMetrics());
        }
    }

    public final void A03() {
        Context context = getContext();
        this.A0N = new AnonymousClass0N1(context, this);
        AnonymousClass6ET r1 = new AnonymousClass6ET(context, this, this, getScaledMinScalingSpan());
        this.A0L = r1;
        r1.setQuickScaleEnabled(false);
        this.A0S = new C117605sC(this);
        this.A0Q = new C117415rt(this, 1);
        this.A0P = new C117415rt(this, 0);
        this.A0R = new C117585sA(this);
        this.A0O = new C71383c1(this);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A0J != null && this.A0K != null) {
            int width = (getWidth() - this.A0K.getIntrinsicWidth()) / 2;
            int A022 = AnonymousClass4L0.A02(this.A0K, getHeight()) / 2;
            Drawable drawable = this.A0K;
            drawable.setBounds(width, A022, drawable.getIntrinsicWidth() + width, this.A0K.getIntrinsicHeight() + A022);
            this.A0K.draw(canvas);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A0W = true;
        Matrix matrix = this.A0A;
        if (matrix == null || matrix.equals(getImageMatrix())) {
            A09(z);
        }
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.A0V = z;
    }

    public void setInitialFitTolerance(float f) {
        this.A01 = f;
    }

    public void setInitialScaleType(int i) {
        this.A09 = i;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A0M = onClickListener;
    }

    public void setOverlay(Drawable drawable) {
        this.A0K = drawable;
    }

    public void setUnderscaleAmount(float f) {
        this.A08 = f;
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass4SW.A00(this);
        A03();
    }

    public PhotoView(Context context) {
        super(context);
        AnonymousClass4SW.A00(this);
        A03();
    }
}
