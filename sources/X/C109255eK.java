package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.5eK  reason: invalid class name and case insensitive filesystem */
public class C109255eK implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public Matrix A05;
    public Matrix A06 = AnonymousClass002.A05();
    public Matrix A07 = AnonymousClass002.A05();
    public RectF A08 = AnonymousClass002.A07();
    public RectF A09 = AnonymousClass002.A07();
    public RectF A0A = AnonymousClass002.A07();
    public View.OnClickListener A0B;
    public View A0C;
    public C71413c4 A0D;
    public AnonymousClass8MU A0E;
    public AnonymousClass8MU A0F;
    public AnonymousClass5PQ A0G;
    public C172638Mc A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;

    public final void A01(float f, float f2, float f3) {
        float min = Math.min(Math.max(f, this.A02 * 0.8f), this.A01);
        float f4 = min / this.A00;
        Matrix matrix = this.A06;
        matrix.postScale(f4, f4, f2, f3);
        this.A00 = min;
        A02(true);
        this.A0G.A00(matrix);
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        float x;
        float y;
        boolean z = false;
        if (!this.A0L) {
            return false;
        }
        if (!this.A0I) {
            float f = this.A00;
            float f2 = this.A02;
            float f3 = f2;
            if (f == f2) {
                f3 = 2.0f * f2;
            }
            float min = Math.min(this.A01, Math.max(f2, f3));
            C172638Mc r5 = this.A0H;
            if (r5 != null) {
                if (min == f2) {
                    View view = this.A0C;
                    x = (float) C86664Kz.A0B(view);
                    y = (float) C86654Ky.A04(view);
                } else {
                    x = motionEvent.getX();
                    y = motionEvent.getY();
                }
                r5.A00(f, min, x, y, 200);
            }
        }
        this.A0I = false;
        AnonymousClass5PQ r3 = this.A0G;
        if (this.A00 != this.A02) {
            z = true;
        }
        r3.A01(z);
        return true;
    }

    public final void A00() {
        if (this.A0J) {
            RectF rectF = this.A08;
            float width = rectF.width();
            float height = rectF.height();
            View view = this.A0C;
            float A062 = (float) AnonymousClass000.A06(view, view.getWidth());
            float A052 = (float) AnonymousClass000.A05(view, view.getHeight());
            this.A03 = 0.0f;
            Matrix matrix = this.A06;
            matrix.reset();
            this.A09.set(0.0f, 0.0f, A062, A052);
            float f = A062 / width;
            float f2 = A052 / height;
            float min = Math.min(f, f2);
            this.A02 = min;
            float min2 = Math.min(min, Float.MAX_VALUE);
            this.A02 = min2;
            float f3 = min2;
            if (AnonymousClass002.A00(f / f2, 1.0f) < 0.0f) {
                min2 = Math.max(f, f2);
                this.A03 = min2;
            }
            this.A00 = Math.min(min2, Float.MAX_VALUE);
            this.A03 = Math.min(this.A03, Float.MAX_VALUE);
            this.A01 = Math.max(f3 * 8.0f, 8.0f);
            float f4 = width / 2.0f;
            float f5 = height / 2.0f;
            matrix.setTranslate((A062 / 2.0f) - f4, (A052 / 2.0f) - f5);
            float f6 = this.A00;
            matrix.preScale(f6, f6, f4, f5);
            this.A04 = this.A00;
            this.A07.set(matrix);
            this.A05 = matrix;
            this.A0G.A00(matrix);
        }
    }

    public final void A02(boolean z) {
        float f;
        RectF rectF = this.A0A;
        rectF.set(this.A08);
        Matrix matrix = this.A06;
        matrix.mapRect(rectF);
        View view = this.A0C;
        float A002 = AnonymousClass4L0.A00(view);
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
        float A022 = C86664Kz.A02(view);
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
            AnonymousClass8MU r3 = this.A0E;
            if (r3 != null && !r3.A05) {
                r3.A02 = -1;
                r3.A00 = f;
                r3.A01 = f4;
                r3.A06 = false;
                r3.A05 = true;
                ((View) r3.A04).postDelayed(r3, 250);
                return;
            }
            return;
        }
        matrix.postTranslate(f, f4);
        this.A0G.A00(matrix);
    }

    public final boolean A03(float f, float f2) {
        float A012;
        float A013;
        RectF rectF = this.A0A;
        rectF.set(this.A08);
        Matrix matrix = this.A06;
        matrix.mapRect(rectF);
        View view = this.A0C;
        float A002 = AnonymousClass4L0.A00(view);
        float f3 = rectF.left;
        float f4 = rectF.right;
        float f5 = A002 - 0.0f;
        if (f4 - f3 < f5) {
            A012 = ((f5 - (f4 + f3)) / 2.0f) + 0.0f;
        } else {
            A012 = AnonymousClass001.A01(0.0f - f3, f, A002 - f4);
        }
        float A022 = C86664Kz.A02(view);
        float f6 = rectF.top;
        float f7 = rectF.bottom;
        float f8 = A022 - 0.0f;
        if (f7 - f6 < f8) {
            A013 = ((f8 - (f7 + f6)) / 2.0f) + 0.0f;
        } else {
            A013 = AnonymousClass001.A01(0.0f - f6, f2, A022 - f7);
        }
        matrix.postTranslate(A012, A013);
        this.A0G.A00(matrix);
        if (A012 == f && A013 == f2) {
            return true;
        }
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (!this.A0L) {
            return true;
        }
        AnonymousClass8MU r1 = this.A0F;
        if (r1 != null) {
            r1.A05 = false;
            r1.A06 = true;
        }
        AnonymousClass8MU r12 = this.A0E;
        if (r12 == null) {
            return true;
        }
        r12.A05 = false;
        r12.A06 = true;
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AnonymousClass8MU r3;
        if (!this.A0L || (r3 = this.A0F) == null || r3.A05) {
            return true;
        }
        r3.A02 = -1;
        r3.A00 = f;
        r3.A01 = f2;
        r3.A06 = false;
        r3.A05 = true;
        ((View) r3.A04).post(r3);
        return true;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0L) {
            this.A0K = false;
            A01(this.A00 * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.A0L) {
            return false;
        }
        C172638Mc r1 = this.A0H;
        if (r1 != null) {
            r1.A06 = false;
            r1.A07 = true;
        }
        this.A0K = true;
        this.A0G.A01(AnonymousClass0x7.A1P((this.A00 > this.A02 ? 1 : (this.A00 == this.A02 ? 0 : -1))));
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C172638Mc r2;
        if (this.A0L && this.A0K) {
            this.A0I = true;
            Matrix matrix = this.A06;
            matrix.set(this.A07);
            this.A00 = this.A04;
            this.A0G.A00(matrix);
        }
        float f = this.A00;
        float f2 = this.A02;
        if (f < f2 && (r2 = this.A0H) != null) {
            View view = this.A0C;
            r2.A00(f, f2, AnonymousClass4L0.A00(view) / 2.0f, C86664Kz.A02(view) / 2.0f, 100);
        }
        this.A0G.A01(AnonymousClass0x7.A1P((this.A00 > this.A02 ? 1 : (this.A00 == this.A02 ? 0 : -1))));
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.A0L) {
            A03(-f, -f2);
        }
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        View.OnClickListener onClickListener = this.A0B;
        if (!(onClickListener == null || this.A0K || onClickListener == null)) {
            onClickListener.onClick(this.A0C);
        }
        this.A0K = false;
        return true;
    }

    public C109255eK(View view, AnonymousClass5PQ r4) {
        this.A0C = view;
        this.A0G = r4;
        this.A0H = new C172638Mc(view, this);
        this.A0F = new AnonymousClass8MU(view, this, 1);
        this.A0E = new AnonymousClass8MU(view, this, 0);
        this.A0D = new C71413c4(view, this);
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
