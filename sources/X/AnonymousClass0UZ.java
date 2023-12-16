package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Scroller;
import com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback;
import java.util.Arrays;

/* renamed from: X.0UZ  reason: invalid class name */
public class AnonymousClass0UZ {
    public float A00;
    public float A01;
    public int A02 = -1;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public VelocityTracker A07;
    public View A08;
    public Scroller A09;
    public Scroller A0A;
    public boolean A0B;
    public float[] A0C;
    public float[] A0D;
    public float[] A0E;
    public float[] A0F;
    public final ViewGroup A0G;
    public final ViewDragHelper$Callback A0H;
    public final Runnable A0I = new C11230jJ(this);

    public void A01() {
        this.A02 = -1;
        float[] fArr = this.A0C;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.A0D, 0.0f);
            Arrays.fill(this.A0E, 0.0f);
            Arrays.fill(this.A0F, 0.0f);
            this.A05 = 0;
        }
        VelocityTracker velocityTracker = this.A07;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A07 = null;
        }
    }

    public final void A03(float f, float f2) {
        this.A0B = true;
        this.A0H.A04(this.A08, f, f2);
        this.A0B = false;
        if (this.A03 == 1) {
            A04(0);
        }
    }

    public View A00(int i, int i2) {
        ViewGroup viewGroup = this.A0G;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    public void A02() {
        Scroller scroller = this.A0A;
        Scroller scroller2 = this.A09;
        if (scroller != scroller2) {
            A01();
            if (this.A03 == 2) {
                int currX = this.A0A.getCurrX();
                int currY = this.A0A.getCurrY();
                this.A0A.abortAnimation();
                int currX2 = this.A0A.getCurrX();
                int currY2 = this.A0A.getCurrY();
                this.A0H.A05(this.A08, currX2, currY2, currX2 - currX, currY2 - currY);
            }
            A04(0);
            this.A0A = scroller2;
        }
    }

    public void A04(int i) {
        if (this.A03 != i) {
            this.A03 = i;
            this.A0H.A03(i);
            if (i == 0) {
                this.A08 = null;
            }
        }
    }

    public final void A05(int i) {
        float[] fArr = this.A0C;
        if (fArr != null && fArr.length > i) {
            fArr[i] = 0.0f;
            this.A0D[i] = 0.0f;
            this.A0E[i] = 0.0f;
            this.A0F[i] = 0.0f;
            this.A05 = (~(1 << i)) & this.A05;
        }
    }

    public final void A06(int i, float f, float f2) {
        float[] fArr = this.A0C;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.A0D;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.A0E;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.A0F;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
            }
            this.A0C = fArr2;
            fArr = fArr2;
            this.A0D = fArr3;
            this.A0E = fArr4;
            this.A0F = fArr5;
        }
        this.A0E[i] = f;
        fArr[i] = f;
        float[] fArr9 = this.A0D;
        this.A0F[i] = f2;
        fArr9[i] = f2;
        this.A05 |= 1 << i;
    }

    public final void A07(int i, int i2) {
        int left = this.A08.getLeft();
        int top = this.A08.getTop();
        ViewDragHelper$Callback viewDragHelper$Callback = this.A0H;
        View view = this.A08;
        int A012 = viewDragHelper$Callback.A01(view, top, i2);
        int i3 = left + i;
        int i4 = top + A012;
        if (i != 0) {
            i3 = 0;
            view.offsetLeftAndRight(-left);
        }
        if (A012 != 0) {
            i4 = viewDragHelper$Callback.A02(this.A08, i4, A012);
            this.A08.offsetTopAndBottom(i4 - top);
        }
        if (i != 0 || A012 != 0) {
            viewDragHelper$Callback.A05(this.A08, i3, i4, i3 - left, i4 - top);
        }
    }

    public final boolean A09(int i, int i2, int i3) {
        int i4;
        int min;
        int i5 = i3;
        int left = this.A08.getLeft();
        int top = this.A08.getTop();
        int i6 = -left;
        int i7 = i - top;
        if (i6 == 0 && i7 == 0) {
            this.A0A.abortAnimation();
            A04(0);
            return false;
        }
        if (i3 < 0) {
            View view = this.A08;
            int i8 = (int) this.A01;
            int i9 = (int) this.A00;
            int abs = Math.abs(i2);
            if (abs < i8) {
                i2 = 0;
            } else if (abs > i9) {
                if (i2 <= 0) {
                    i9 = -i9;
                }
                i2 = i9;
            }
            int abs2 = Math.abs(i6);
            int abs3 = Math.abs(i7);
            int i10 = abs2 + abs3;
            float f = 1.0f;
            if (i2 == 0) {
                f = ((float) abs3) / ((float) i10);
            }
            int A002 = this.A0H.A00(view);
            int width = this.A0G.getWidth();
            if (i7 == 0) {
                min = 0;
            } else {
                float f2 = (float) abs3;
                float f3 = (float) (width / 2);
                float sin = f3 + (((float) Math.sin((double) ((float) (((double) (Math.min(1.0f, f2 / ((float) width)) - 0.5f)) * 0.4712389167638204d)))) * f3);
                int abs4 = Math.abs(i2);
                if (abs4 > 0) {
                    i4 = AnonymousClass001.A09(abs4, sin);
                } else {
                    i4 = (int) (((f2 / ((float) A002)) + 1.0f) * 256.0f);
                }
                min = Math.min(i4, 600);
            }
            i5 = (int) (((float) min) * f);
        }
        this.A0A.startScroll(left, top, i6, i7, i5);
        this.A04 = top + i7;
        A04(2);
        return true;
    }

    public boolean A0A(View view, int i) {
        if (view == this.A08 && this.A02 == i) {
            return true;
        }
        if (view == null) {
            return false;
        }
        this.A02 = i;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.A0G;
        if (parent == viewGroup) {
            this.A08 = view;
            this.A02 = i;
            A04(1);
            return true;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        A0o.append(viewGroup);
        throw AnonymousClass000.A0F(")", A0o);
    }

    public AnonymousClass0UZ(Context context, ViewGroup viewGroup, ViewDragHelper$Callback viewDragHelper$Callback) {
        this.A0G = viewGroup;
        this.A0H = viewDragHelper$Callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        context.getResources().getDisplayMetrics();
        this.A06 = viewConfiguration.getScaledTouchSlop();
        this.A00 = (float) viewConfiguration.getScaledMaximumFlingVelocity();
        this.A01 = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        Scroller scroller = new Scroller(context);
        this.A0A = scroller;
        this.A09 = scroller;
    }

    public final void A08(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (((1 << pointerId) & this.A05) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.A0E[pointerId] = x;
                this.A0F[pointerId] = y;
            }
        }
    }
}
