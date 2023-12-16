package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.09T  reason: invalid class name */
public class AnonymousClass09T extends C04580Ov implements C16670tm {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08 = 0;
    public int A09 = -1;
    public int A0A;
    public int A0B;
    public long A0C;
    public Rect A0D;
    public VelocityTracker A0E;
    public View A0F = null;
    public AnonymousClass0N1 A0G;
    public AnonymousClass0WG A0H;
    public AnonymousClass02M A0I;
    public C05570Ua A0J = null;
    public RecyclerView A0K;
    public List A0L;
    public List A0M = AnonymousClass001.A0s();
    public List A0N;
    public final AnonymousClass0u9 A0O = new C08570eh(this);
    public final Runnable A0P = new C11050j1(this);
    public final List A0Q = AnonymousClass001.A0s();
    public final float[] A0R = new float[2];

    public void A01(Canvas canvas, AnonymousClass0Q1 r14, RecyclerView recyclerView) {
        float f;
        float f2;
        float A002;
        float A003;
        if (this.A0J != null) {
            float[] fArr = this.A0R;
            A0D(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C05570Ua r6 = this.A0J;
        List list = this.A0M;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C06580Yj r1 = (C06580Yj) list.get(i);
            float f3 = r1.A06;
            float f4 = r1.A08;
            if (f3 == f4) {
                A002 = r1.A0C.A0H.getTranslationX();
            } else {
                A002 = AnonymousClass001.A00(f4, f3, r1.A00);
            }
            r1.A01 = A002;
            float f5 = r1.A07;
            float f6 = r1.A09;
            if (f5 == f6) {
                A003 = r1.A0C.A0H.getTranslationY();
            } else {
                A003 = AnonymousClass001.A00(f6, f5, r1.A00);
            }
            r1.A02 = A003;
            int save = canvas.save();
            C05570Ua r0 = r1.A0C;
            float f7 = r1.A01;
            float f8 = r1.A02;
            View view = r0.A0H;
            view.setTranslationX(f7);
            view.setTranslationY(f8);
            canvas.restoreToCount(save);
        }
        if (r6 != null) {
            int save2 = canvas.save();
            View view2 = r6.A0H;
            if (view2.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                Float valueOf = Float.valueOf(AnonymousClass0YZ.A00(view2));
                int childCount = recyclerView.getChildCount();
                float f9 = 0.0f;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view2) {
                        float A004 = AnonymousClass0YZ.A00(childAt);
                        if (A004 > f9) {
                            f9 = A004;
                        }
                    }
                }
                AnonymousClass0YZ.A0B(view2, f9 + 1.0f);
                view2.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
            }
            view2.setTranslationX(f);
            view2.setTranslationY(f2);
            canvas.restoreToCount(save2);
        }
    }

    public void A02(Canvas canvas, AnonymousClass0Q1 r8, RecyclerView recyclerView) {
        if (this.A0J != null) {
            A0D(this.A0R);
        }
        C05570Ua r5 = this.A0J;
        List list = this.A0M;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            list.get(i);
            canvas.restoreToCount(canvas.save());
        }
        if (r5 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C06580Yj r1 = (C06580Yj) list.get(i2);
            if (!r1.A03) {
                z = true;
            } else if (!r1.A04) {
                list.remove(i2);
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final int A04(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = 8;
        int i3 = 4;
        if (this.A00 > 0.0f) {
            i3 = 8;
        }
        VelocityTracker velocityTracker = this.A0E;
        if (velocityTracker != null && this.A09 > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.A04);
            float xVelocity = this.A0E.getXVelocity(this.A09);
            float yVelocity = this.A0E.getYVelocity(this.A09);
            if (xVelocity <= 0.0f) {
                i2 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i2 & i) != 0 && i3 == i2 && abs >= this.A07 && abs > Math.abs(yVelocity)) {
                return i2;
            }
        }
        float width = ((float) this.A0K.getWidth()) * 0.5f;
        if ((i & i3) == 0 || Math.abs(this.A00) <= width) {
            return 0;
        }
        return i3;
    }

    public final int A05(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = 2;
        int i3 = 1;
        if (this.A01 > 0.0f) {
            i3 = 2;
        }
        VelocityTracker velocityTracker = this.A0E;
        if (velocityTracker != null && this.A09 > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.A04);
            float xVelocity = this.A0E.getXVelocity(this.A09);
            float yVelocity = this.A0E.getYVelocity(this.A09);
            if (yVelocity <= 0.0f) {
                i2 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i2 & i) != 0 && i2 == i3 && abs >= this.A07 && abs > Math.abs(xVelocity)) {
                return i2;
            }
        }
        float height = ((float) this.A0K.getHeight()) * 0.5f;
        if ((i & i3) == 0 || Math.abs(this.A01) <= height) {
            return 0;
        }
        return i3;
    }

    public void A07(MotionEvent motionEvent, int i, int i2) {
        View A062;
        C05570Ua A0H2;
        int A012;
        int i3;
        if (this.A0J == null && i == 2 && this.A08 != 2) {
            AnonymousClass0WG r4 = this.A0H;
            if (r4.A05()) {
                RecyclerView recyclerView = this.A0K;
                if (recyclerView.getScrollState() != 1) {
                    C06440Xs layoutManager = recyclerView.getLayoutManager();
                    int i4 = this.A09;
                    if (i4 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i4);
                        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.A02);
                        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.A03);
                        float f = (float) this.A0B;
                        if (abs < f && abs2 < f) {
                            return;
                        }
                        if (abs > abs2 && layoutManager.A17()) {
                            return;
                        }
                        if ((abs2 <= abs || !layoutManager.A18()) && (A062 = A06(motionEvent)) != null && (A0H2 = this.A0K.A0H(A062)) != null && (A012 = (r4.A01(A0H2, this.A0K) & 65280) >> 8) != 0) {
                            float x = motionEvent.getX(i2);
                            float y = motionEvent.getY(i2);
                            float f2 = x - this.A02;
                            float f3 = y - this.A03;
                            float abs3 = Math.abs(f2);
                            float abs4 = Math.abs(f3);
                            float f4 = (float) this.A0B;
                            if (abs3 >= f4 || abs4 >= f4) {
                                if (abs3 > abs4) {
                                    if (f2 >= 0.0f || (A012 & 4) != 0) {
                                        if (f2 > 0.0f) {
                                            i3 = A012 & 8;
                                        }
                                        this.A01 = 0.0f;
                                        this.A00 = 0.0f;
                                        this.A09 = motionEvent.getPointerId(0);
                                        A0A(A0H2, 1);
                                    }
                                    return;
                                } else if (f3 >= 0.0f || (A012 & 1) != 0) {
                                    if (f3 > 0.0f) {
                                        i3 = A012 & 2;
                                    }
                                    this.A01 = 0.0f;
                                    this.A00 = 0.0f;
                                    this.A09 = motionEvent.getPointerId(0);
                                    A0A(A0H2, 1);
                                } else {
                                    return;
                                }
                                if (i3 == 0) {
                                    return;
                                }
                                this.A01 = 0.0f;
                                this.A00 = 0.0f;
                                this.A09 = motionEvent.getPointerId(0);
                                A0A(A0H2, 1);
                            }
                        }
                    }
                }
            }
        }
    }

    public void A09(C05570Ua r21) {
        int i;
        int i2;
        int i3;
        int left;
        int bottom;
        if (!this.A0K.isLayoutRequested() && this.A08 == 2) {
            int i4 = (int) (this.A05 + this.A00);
            int i5 = (int) (this.A06 + this.A01);
            C05570Ua r19 = r21;
            View view = r19.A0H;
            if (((float) AnonymousClass001.A0A(i5, view.getTop())) >= ((float) view.getHeight()) * 0.5f || ((float) AnonymousClass001.A0A(i4, view.getLeft())) >= ((float) view.getWidth()) * 0.5f) {
                List list = this.A0N;
                if (list == null) {
                    this.A0N = AnonymousClass001.A0s();
                    this.A0L = AnonymousClass001.A0s();
                } else {
                    list.clear();
                    this.A0L.clear();
                }
                int round = Math.round(this.A05 + this.A00);
                int round2 = Math.round(this.A06 + this.A01);
                int width = view.getWidth() + round;
                int height = view.getHeight() + round2;
                int i6 = (round + width) / 2;
                int i7 = (round2 + height) / 2;
                C06440Xs layoutManager = this.A0K.getLayoutManager();
                int A082 = layoutManager.A08();
                for (int i8 = 0; i8 < A082; i8++) {
                    View A0Q2 = layoutManager.A0Q(i8);
                    if (A0Q2 != view && A0Q2.getBottom() >= round2 && A0Q2.getTop() <= height && A0Q2.getRight() >= round && A0Q2.getLeft() <= width) {
                        C05570Ua A0H2 = this.A0K.A0H(A0Q2);
                        if (this.A0H.A07(this.A0J, A0H2, this.A0K)) {
                            int A0A2 = AnonymousClass001.A0A(i6, (A0Q2.getLeft() + A0Q2.getRight()) / 2);
                            int A0A3 = AnonymousClass001.A0A(i7, (A0Q2.getTop() + A0Q2.getBottom()) / 2);
                            int i9 = (A0A2 * A0A2) + (A0A3 * A0A3);
                            int size = this.A0N.size();
                            int i10 = 0;
                            int i11 = 0;
                            while (i10 < size && i9 > AnonymousClass000.A09(this.A0L, i10)) {
                                i11++;
                                i10++;
                            }
                            this.A0N.add(i11, A0H2);
                            this.A0L.add(i11, Integer.valueOf(i9));
                        }
                    }
                }
                List list2 = this.A0N;
                if (list2.size() != 0) {
                    int width2 = i4 + view.getWidth();
                    int height2 = i5 + view.getHeight();
                    int left2 = i4 - view.getLeft();
                    int top = i5 - view.getTop();
                    int size2 = list2.size();
                    C05570Ua r6 = null;
                    int i12 = -1;
                    for (int i13 = 0; i13 < size2; i13++) {
                        C05570Ua r7 = (C05570Ua) list2.get(i13);
                        if (left2 <= 0 ? !(left2 >= 0 || (left = r7.A0H.getLeft() - i4) <= 0 || r7.A0H.getLeft() >= view.getLeft()) : !((left = r7.A0H.getRight() - width2) >= 0 || r7.A0H.getRight() <= view.getRight())) {
                            int abs = Math.abs(left);
                            if (abs > i12) {
                                r6 = r7;
                                i12 = abs;
                            }
                        }
                        if (top >= 0 ? !(top <= 0 || (bottom = r7.A0H.getBottom() - height2) >= 0 || r7.A0H.getBottom() <= view.getBottom()) : !((bottom = r7.A0H.getTop() - i5) <= 0 || r7.A0H.getTop() >= view.getTop())) {
                            int abs2 = Math.abs(bottom);
                            if (abs2 > i12) {
                                r6 = r7;
                                i12 = abs2;
                            }
                        }
                    }
                    if (r6 == null) {
                        this.A0N.clear();
                        this.A0L.clear();
                        return;
                    }
                    int A012 = r6.A01();
                    r19.A01();
                    if (this.A0H.A08(r19, r6, this.A0K)) {
                        RecyclerView recyclerView = this.A0K;
                        C06440Xs layoutManager2 = recyclerView.getLayoutManager();
                        if (layoutManager2 instanceof C15190qv) {
                            View view2 = r6.A0H;
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((C15190qv) layoutManager2);
                            linearLayoutManager.A16("Cannot drop a view during a scroll or layout calculation");
                            linearLayoutManager.A1V();
                            linearLayoutManager.A1W();
                            int A032 = C06440Xs.A03(view);
                            int A033 = C06440Xs.A03(view2);
                            char c = 65535;
                            if (A032 < A033) {
                                c = 1;
                            }
                            boolean z = linearLayoutManager.A0A;
                            C05590Uc r0 = linearLayoutManager.A06;
                            if (z) {
                                if (c == 1) {
                                    linearLayoutManager.A1Y(A033, r0.A02() - (linearLayoutManager.A06.A09(view2) + linearLayoutManager.A06.A07(view)));
                                    return;
                                } else {
                                    i2 = r0.A02();
                                    i3 = linearLayoutManager.A06.A06(view2);
                                }
                            } else if (c == 65535) {
                                i = r0.A09(view2);
                                linearLayoutManager.A1Y(A033, i);
                                return;
                            } else {
                                i2 = r0.A06(view2);
                                i3 = linearLayoutManager.A06.A07(view);
                            }
                            i = i2 - i3;
                            linearLayoutManager.A1Y(A033, i);
                            return;
                        }
                        if (layoutManager2.A17()) {
                            View view3 = r6.A0H;
                            if (view3.getLeft() - C002102g.A00(view3).left <= recyclerView.getPaddingLeft()) {
                                recyclerView.A0Z(A012);
                            }
                            if (view3.getRight() + C002102g.A00(view3).right >= AnonymousClass001.A0I(recyclerView)) {
                                recyclerView.A0Z(A012);
                            }
                        }
                        if (layoutManager2.A18()) {
                            View view4 = r6.A0H;
                            if (view4.getTop() - C002102g.A00(view4).top <= recyclerView.getPaddingTop()) {
                                recyclerView.A0Z(A012);
                            }
                            if (view4.getBottom() + C002102g.A00(view4).bottom >= AnonymousClass001.A0H(recyclerView)) {
                                recyclerView.A0Z(A012);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        if (r1 > 0) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0182, code lost:
        if (r1 > 0) goto L_0x0184;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.C05570Ua r27, int r28) {
        /*
            r26 = this;
            r5 = r26
            X.0Ua r0 = r5.A0J
            r7 = r27
            r6 = r28
            if (r7 != r0) goto L_0x000f
            int r0 = r5.A08
            if (r6 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r5.A0C = r0
            int r11 = r5.A08
            r4 = 1
            r5.A0B(r7, r4)
            r5.A08 = r6
            r3 = 2
            if (r6 != r3) goto L_0x0024
            if (r27 == 0) goto L_0x01b6
            android.view.View r0 = r7.A0H
            r5.A0F = r0
        L_0x0024:
            int r0 = r28 * 8
            r10 = 8
            int r0 = r0 + 8
            int r0 = r4 << r0
            int r15 = r0 + -1
            X.0Ua r9 = r5.A0J
            r2 = 0
            if (r9 == 0) goto L_0x00eb
            android.view.View r0 = r9.A0H
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x01a8
            if (r11 == r3) goto L_0x01a5
            int r0 = r5.A08
            if (r0 == r3) goto L_0x01a5
            X.0WG r1 = r5.A0H
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0K
            int r14 = r1.A02(r9, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0K
            int r13 = X.AnonymousClass0YH.A01(r0)
            r12 = r14
            r8 = 3158064(0x303030, float:4.42539E-39)
            r1 = r14 & r8
            if (r1 == 0) goto L_0x0067
            int r0 = ~r1
            r12 = r14 & r0
            if (r13 == 0) goto L_0x0064
            int r1 = r1 >> 1
            r0 = -3158065(0xffffffffffcfcfcf, float:NaN)
            r0 = r0 & r1
            r12 = r12 | r0
            r1 = r1 & r8
        L_0x0064:
            int r0 = r1 >> 2
            r12 = r12 | r0
        L_0x0067:
            r0 = 65280(0xff00, float:9.1477E-41)
            r12 = r12 & r0
            int r8 = r12 >> 8
            if (r8 == 0) goto L_0x01a5
            r14 = r14 & r0
            int r12 = r14 >> 8
            float r0 = r5.A00
            float r1 = java.lang.Math.abs(r0)
            float r0 = r5.A01
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0178
            int r1 = r5.A04(r8)
            if (r1 > 0) goto L_0x0184
            int r1 = r5.A05(r8)
            if (r1 <= 0) goto L_0x01a5
        L_0x008e:
            android.view.VelocityTracker r0 = r5.A0E
            if (r0 == 0) goto L_0x0098
            r0.recycle()
            r0 = 0
            r5.A0E = r0
        L_0x0098:
            r0 = 4
            if (r1 == r4) goto L_0x0165
            if (r1 == r3) goto L_0x0165
            if (r1 == r0) goto L_0x0154
            if (r1 == r10) goto L_0x0154
            r0 = 16
            if (r1 == r0) goto L_0x0154
            r0 = 32
            if (r1 == r0) goto L_0x0154
            r22 = 0
        L_0x00ab:
            r23 = 0
        L_0x00ad:
            if (r11 != r3) goto L_0x014e
            r0 = 8
        L_0x00b1:
            float[] r8 = r5.A0R
            r5.A0D(r8)
            r20 = r8[r2]
            r21 = r8[r4]
            X.09A r8 = new X.09A
            r18 = r9
            r24 = r11
            r25 = r1
            r19 = r9
            r17 = r5
            r16 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            androidx.recyclerview.widget.RecyclerView r1 = r5.A0K
            X.0UY r1 = r1.A0R
            if (r1 != 0) goto L_0x0142
            if (r0 != r10) goto L_0x013f
            r0 = 200(0xc8, double:9.9E-322)
        L_0x00d5:
            android.animation.ValueAnimator r9 = r8.A0B
            r9.setDuration(r0)
            java.util.List r0 = r5.A0M
            r0.add(r8)
            X.0Ua r0 = r8.A0C
            r0.A05(r2)
            r9.start()
            r2 = 1
        L_0x00e8:
            r0 = 0
            r5.A0J = r0
        L_0x00eb:
            if (r27 == 0) goto L_0x0115
            X.0WG r1 = r5.A0H
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0K
            int r1 = r1.A01(r7, r0)
            r1 = r1 & r15
            int r0 = r5.A08
            int r0 = r0 * 8
            int r1 = r1 >> r0
            r5.A0A = r1
            android.view.View r1 = r7.A0H
            int r0 = r1.getLeft()
            float r0 = (float) r0
            r5.A05 = r0
            int r0 = r1.getTop()
            float r0 = (float) r0
            r5.A06 = r0
            r5.A0J = r7
            if (r6 != r3) goto L_0x0115
            r0 = 0
            r1.performHapticFeedback(r0)
        L_0x0115:
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0K
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x0126
            X.0Ua r0 = r5.A0J
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r1.requestDisallowInterceptTouchEvent(r0)
        L_0x0126:
            if (r2 != 0) goto L_0x0130
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0K
            X.0Xs r0 = r0.getLayoutManager()
            r0.A0D = r4
        L_0x0130:
            X.0WG r2 = r5.A0H
            X.0Ua r1 = r5.A0J
            int r0 = r5.A08
            r2.A04(r1, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0K
            r0.invalidate()
            return
        L_0x013f:
            r0 = 250(0xfa, double:1.235E-321)
            goto L_0x00d5
        L_0x0142:
            if (r0 != r10) goto L_0x0149
            long r0 = r1.A05()
            goto L_0x00d5
        L_0x0149:
            long r0 = r1.A06()
            goto L_0x00d5
        L_0x014e:
            r0 = 4
            if (r1 <= 0) goto L_0x00b1
            r0 = 2
            goto L_0x00b1
        L_0x0154:
            float r0 = r5.A00
            float r22 = java.lang.Math.signum(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0K
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r22 = r22 * r0
            goto L_0x00ab
        L_0x0165:
            float r0 = r5.A01
            float r23 = java.lang.Math.signum(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0K
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r23 = r23 * r0
            r22 = 0
            goto L_0x00ad
        L_0x0178:
            int r1 = r5.A05(r8)
            if (r1 > 0) goto L_0x008e
            int r1 = r5.A04(r8)
            if (r1 <= 0) goto L_0x01a5
        L_0x0184:
            r12 = r12 & r1
            if (r12 != 0) goto L_0x008e
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0K
            int r13 = X.AnonymousClass0YH.A01(r0)
            r12 = 789516(0xc0c0c, float:1.106348E-39)
            r8 = r1 & r12
            if (r8 == 0) goto L_0x008e
            int r0 = ~r8
            r1 = r1 & r0
            if (r13 == 0) goto L_0x01a0
            int r8 = r8 << 1
            r0 = -789517(0xfffffffffff3f3f3, float:NaN)
            r0 = r0 & r8
            r1 = r1 | r0
            r8 = r8 & r12
        L_0x01a0:
            int r0 = r8 << 2
            r1 = r1 | r0
            goto L_0x008e
        L_0x01a5:
            r1 = 0
            goto L_0x008e
        L_0x01a8:
            android.view.View r1 = r9.A0H
            android.view.View r0 = r5.A0F
            if (r1 != r0) goto L_0x01b1
            r0 = 0
            r5.A0F = r0
        L_0x01b1:
            X.AnonymousClass0WG.A00(r9)
            goto L_0x00e8
        L_0x01b6:
            java.lang.String r0 = "Must pass a ViewHolder when dragging"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09T.A0A(X.0Ua, int):void");
    }

    public void A0B(C05570Ua r5, boolean z) {
        C06580Yj r1;
        List list = this.A0M;
        int size = list.size();
        do {
            size--;
            if (size >= 0) {
                r1 = (C06580Yj) list.get(size);
            } else {
                return;
            }
        } while (r1.A0C != r5);
        r1.A05 |= z;
        if (!r1.A03) {
            r1.A0B.cancel();
        }
        list.remove(size);
    }

    public void A0C(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.A0K;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A0p(this);
                RecyclerView recyclerView3 = this.A0K;
                AnonymousClass0u9 r1 = this.A0O;
                recyclerView3.A14.remove(r1);
                if (recyclerView3.A0U == r1) {
                    recyclerView3.A0U = null;
                }
                List list = this.A0K.A0a;
                if (list != null) {
                    list.remove(this);
                }
                List list2 = this.A0M;
                int size = list2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    AnonymousClass0WG.A00(((C06580Yj) list2.get(0)).A0C);
                }
                list2.clear();
                this.A0F = null;
                VelocityTracker velocityTracker = this.A0E;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.A0E = null;
                }
                AnonymousClass02M r2 = this.A0I;
                if (r2 != null) {
                    r2.A00 = false;
                    this.A0I = null;
                }
                if (this.A0G != null) {
                    this.A0G = null;
                }
            }
            this.A0K = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.A07 = resources.getDimension(R.dimen.f6nameremoved);
                this.A04 = resources.getDimension(R.dimen.f6nameremoved);
                this.A0B = ViewConfiguration.get(this.A0K.getContext()).getScaledTouchSlop();
                this.A0K.A0o(this);
                RecyclerView recyclerView4 = this.A0K;
                recyclerView4.A14.add(this.A0O);
                List list3 = recyclerView4.A0a;
                if (list3 == null) {
                    list3 = AnonymousClass001.A0s();
                    recyclerView4.A0a = list3;
                }
                list3.add(this);
                this.A0I = new AnonymousClass02M(this);
                this.A0G = new AnonymousClass0N1(this.A0K.getContext(), this.A0I);
            }
        }
    }

    public final void A0D(float[] fArr) {
        float translationX;
        float translationY;
        if ((this.A0A & 12) != 0) {
            translationX = (this.A05 + this.A00) - ((float) this.A0J.A0H.getLeft());
        } else {
            translationX = this.A0J.A0H.getTranslationX();
        }
        fArr[0] = translationX;
        if ((this.A0A & 3) != 0) {
            translationY = (this.A06 + this.A01) - ((float) this.A0J.A0H.getTop());
        } else {
            translationY = this.A0J.A0H.getTranslationY();
        }
        fArr[1] = translationY;
    }

    public void BOu(View view) {
        if (view == this.A0F) {
            this.A0F = null;
        }
        C05570Ua A0H2 = this.A0K.A0H(view);
        if (A0H2 != null) {
            C05570Ua r0 = this.A0J;
            if (r0 == null || A0H2 != r0) {
                A0B(A0H2, false);
                if (this.A0Q.remove(A0H2.A0H)) {
                    AnonymousClass0WG.A00(A0H2);
                    return;
                }
                return;
            }
            A0A((C05570Ua) null, 0);
        }
    }

    public AnonymousClass09T(AnonymousClass0WG r3) {
        this.A0H = r3;
    }

    public View A06(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C05570Ua r0 = this.A0J;
        if (r0 != null) {
            View view = r0.A0H;
            float f = this.A05 + this.A00;
            float f2 = this.A06 + this.A01;
            if (x >= f && x <= f + ((float) view.getWidth()) && y >= f2 && y <= f2 + ((float) view.getHeight())) {
                return view;
            }
        }
        List list = this.A0M;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.A0K.A0D(x, y);
            }
            C06580Yj r1 = (C06580Yj) list.get(size);
            View view2 = r1.A0C.A0H;
            float f3 = r1.A01;
            float f4 = r1.A02;
            if (x >= f3 && x <= f3 + ((float) view2.getWidth()) && y >= f4 && y <= f4 + ((float) view2.getHeight())) {
                return view2;
            }
        }
    }

    public void A08(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.A02;
        this.A00 = f;
        float f2 = y - this.A03;
        this.A01 = f2;
        if ((i & 4) == 0) {
            f = Math.max(0.0f, f);
            this.A00 = f;
        }
        if ((i & 8) == 0) {
            this.A00 = Math.min(0.0f, f);
        }
        if ((i & 1) == 0) {
            f2 = Math.max(0.0f, f2);
            this.A01 = f2;
        }
        if ((i & 2) == 0) {
            this.A01 = Math.min(0.0f, f2);
        }
    }

    public void BOt(View view) {
    }

    public void A03(Rect rect, View view, AnonymousClass0Q1 r3, RecyclerView recyclerView) {
        rect.setEmpty();
    }
}
