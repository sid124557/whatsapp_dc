package X;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.09U  reason: invalid class name */
public class AnonymousClass09U extends C04580Ov implements AnonymousClass0u9 {
    public static final int[] A0T = new int[0];
    public static final int[] A0U = {16842919};
    public float A00;
    public float A01;
    public int A02;
    public int A03 = 0;
    public int A04;
    public int A05;
    public int A06 = 0;
    public int A07 = 0;
    public int A08 = 0;
    public int A09;
    public int A0A;
    public RecyclerView A0B;
    public boolean A0C = false;
    public boolean A0D = false;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final ValueAnimator A0K;
    public final Drawable A0L;
    public final Drawable A0M;
    public final StateListDrawable A0N;
    public final StateListDrawable A0O;
    public final AnonymousClass0O5 A0P;
    public final Runnable A0Q;
    public final int[] A0R = new int[2];
    public final int[] A0S = new int[2];

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(int r5) {
        /*
            r4 = this;
            r2 = 2
            if (r5 != r2) goto L_0x003b
            int r0 = r4.A08
            if (r0 == r2) goto L_0x0015
            android.graphics.drawable.StateListDrawable r1 = r4.A0O
            int[] r0 = A0U
            r1.setState(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r4.A0B
            java.lang.Runnable r0 = r4.A0Q
            r1.removeCallbacks(r0)
        L_0x0015:
            r4.A04()
        L_0x0018:
            int r0 = r4.A08
            if (r0 != r2) goto L_0x0035
            if (r5 == r2) goto L_0x0032
            android.graphics.drawable.StateListDrawable r1 = r4.A0O
            int[] r0 = A0T
            r1.setState(r0)
            r0 = 1200(0x4b0, float:1.682E-42)
        L_0x0027:
            androidx.recyclerview.widget.RecyclerView r3 = r4.A0B
            java.lang.Runnable r2 = r4.A0Q
            r3.removeCallbacks(r2)
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
        L_0x0032:
            r4.A08 = r5
            return
        L_0x0035:
            r0 = 1
            if (r5 != r0) goto L_0x0032
            r0 = 1500(0x5dc, float:2.102E-42)
            goto L_0x0027
        L_0x003b:
            if (r5 != 0) goto L_0x0015
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0B
            r0.invalidate()
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09U.A05(int):void");
    }

    public void A02(Canvas canvas, AnonymousClass0Q1 r11, RecyclerView recyclerView) {
        int i;
        int i2 = this.A07;
        RecyclerView recyclerView2 = this.A0B;
        if (i2 != recyclerView2.getWidth() || this.A06 != recyclerView2.getHeight()) {
            this.A07 = recyclerView2.getWidth();
            this.A06 = recyclerView2.getHeight();
            A05(0);
        } else if (this.A02 != 0) {
            if (this.A0D) {
                int i3 = this.A07;
                int i4 = this.A0I;
                int i5 = i3 - i4;
                int i6 = this.A09;
                int i7 = this.A0A;
                int i8 = i6 - (i7 / 2);
                StateListDrawable stateListDrawable = this.A0O;
                stateListDrawable.setBounds(0, 0, i4, i7);
                Drawable drawable = this.A0M;
                drawable.setBounds(0, 0, this.A0J, this.A06);
                if (AnonymousClass0YH.A01(recyclerView2) == 1) {
                    drawable.draw(canvas);
                    canvas.translate((float) i4, (float) i8);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    i = -i4;
                } else {
                    canvas.translate((float) i5, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, (float) i8);
                    stateListDrawable.draw(canvas);
                    i = -i5;
                }
                canvas.translate((float) i, (float) (-i8));
            }
            if (this.A0C) {
                int i9 = this.A06;
                int i10 = this.A0E;
                int i11 = i9 - i10;
                int i12 = this.A04;
                int i13 = this.A05;
                int i14 = i12 - (i13 / 2);
                StateListDrawable stateListDrawable2 = this.A0N;
                stateListDrawable2.setBounds(0, 0, i13, i10);
                Drawable drawable2 = this.A0L;
                drawable2.setBounds(0, 0, this.A07, this.A0F);
                canvas.translate(0.0f, (float) i11);
                drawable2.draw(canvas);
                canvas.translate((float) i14, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate((float) (-i14), (float) (-i11));
            }
        }
    }

    public void A04() {
        int i = this.A02;
        if (i != 0) {
            if (i == 3) {
                this.A0K.cancel();
            } else {
                return;
            }
        }
        this.A02 = 1;
        ValueAnimator valueAnimator = this.A0K;
        valueAnimator.setFloatValues(new float[]{AnonymousClass001.A03(valueAnimator), 1.0f});
        valueAnimator.setDuration(500);
        valueAnimator.setStartDelay(0);
        valueAnimator.start();
    }

    public boolean A06(float f, float f2) {
        if (AnonymousClass0YH.A01(this.A0B) != 1 ? f >= ((float) (this.A07 - this.A0I)) : f <= ((float) (this.A0I / 2))) {
            int i = this.A09;
            int i2 = this.A0A / 2;
            if (f2 < ((float) (i - i2)) || f2 > ((float) (i + i2))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        if (r0 > 0) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BUh(android.view.MotionEvent r9, androidx.recyclerview.widget.RecyclerView r10) {
        /*
            r8 = this;
            int r0 = r8.A08
            r7 = 0
            r2 = 2
            r4 = 1
            if (r0 != r4) goto L_0x0060
            float r1 = r9.getX()
            float r0 = r9.getY()
            boolean r6 = r8.A06(r1, r0)
            float r5 = r9.getX()
            float r3 = r9.getY()
            int r1 = r8.A06
            int r0 = r8.A0E
            int r1 = r1 - r0
            float r0 = (float) r1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0039
            int r3 = r8.A04
            int r0 = r8.A05
            int r1 = r0 / 2
            int r0 = r3 - r1
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0039
            int r3 = r3 + r1
            float r0 = (float) r3
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            int r0 = r9.getAction()
            if (r0 != 0) goto L_0x0052
            if (r6 != 0) goto L_0x0053
            if (r1 == 0) goto L_0x0052
        L_0x0044:
            r8.A03 = r4
            float r0 = r9.getX()
            int r0 = (int) r0
            float r0 = (float) r0
            r8.A00 = r0
        L_0x004e:
            r8.A05(r2)
        L_0x0051:
            r7 = 1
        L_0x0052:
            return r7
        L_0x0053:
            if (r1 != 0) goto L_0x0044
            r8.A03 = r2
            float r0 = r9.getY()
            int r0 = (int) r0
            float r0 = (float) r0
            r8.A01 = r0
            goto L_0x004e
        L_0x0060:
            if (r0 != r2) goto L_0x0052
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09U.BUh(android.view.MotionEvent, androidx.recyclerview.widget.RecyclerView):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (r3 > ((float) (r2 + r1))) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BeG(android.view.MotionEvent r13, androidx.recyclerview.widget.RecyclerView r14) {
        /*
            r12 = this;
            int r0 = r12.A08
            if (r0 == 0) goto L_0x0050
            int r0 = r13.getAction()
            r7 = 1
            r9 = 2
            if (r0 != 0) goto L_0x005e
            float r1 = r13.getX()
            float r0 = r13.getY()
            boolean r4 = r12.A06(r1, r0)
            float r3 = r13.getX()
            float r2 = r13.getY()
            int r1 = r12.A06
            int r0 = r12.A0E
            int r1 = r1 - r0
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x003e
            int r2 = r12.A04
            int r0 = r12.A05
            int r1 = r0 / 2
            int r0 = r2 - r1
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x003e
            int r2 = r2 + r1
            float r0 = (float) r2
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r4 != 0) goto L_0x0051
            if (r0 == 0) goto L_0x0050
        L_0x0043:
            r12.A03 = r7
            float r0 = r13.getX()
            int r0 = (int) r0
            float r0 = (float) r0
            r12.A00 = r0
        L_0x004d:
            r12.A05(r9)
        L_0x0050:
            return
        L_0x0051:
            if (r0 != 0) goto L_0x0043
            r12.A03 = r9
            float r0 = r13.getY()
            int r0 = (int) r0
            float r0 = (float) r0
            r12.A01 = r0
            goto L_0x004d
        L_0x005e:
            int r0 = r13.getAction()
            if (r0 != r7) goto L_0x0074
            int r0 = r12.A08
            if (r0 != r9) goto L_0x0074
            r0 = 0
            r12.A01 = r0
            r12.A00 = r0
            r12.A05(r7)
            r0 = 0
            r12.A03 = r0
            return
        L_0x0074:
            int r0 = r13.getAction()
            if (r0 != r9) goto L_0x0050
            int r0 = r12.A08
            if (r0 != r9) goto L_0x0050
            r12.A04()
            int r0 = r12.A03
            if (r0 != r7) goto L_0x00d4
            float r3 = r13.getX()
            int[] r11 = r12.A0R
            int r1 = r12.A0G
            r0 = 0
            r11[r0] = r1
            int r2 = r12.A07
            int r2 = r2 - r1
            r11[r7] = r2
            r10 = 0
            r0 = r11[r0]
            float r1 = (float) r0
            float r0 = (float) r2
            float r8 = X.AnonymousClass001.A01(r0, r3, r1)
            int r0 = r12.A04
            float r0 = (float) r0
            float r1 = X.AnonymousClass002.A00(r0, r8)
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00d4
            float r1 = r12.A00
            androidx.recyclerview.widget.RecyclerView r6 = r12.A0B
            int r5 = r6.computeHorizontalScrollRange()
            int r4 = r6.computeHorizontalScrollOffset()
            int r3 = r12.A07
            r2 = r11[r7]
            r0 = r11[r10]
            int r2 = r2 - r0
            if (r2 == 0) goto L_0x00d2
            float r1 = r8 - r1
            float r0 = (float) r2
            float r1 = r1 / r0
            int r5 = r5 - r3
            float r0 = (float) r5
            float r1 = r1 * r0
            int r0 = (int) r1
            int r4 = r4 + r0
            if (r4 >= r5) goto L_0x00d2
            if (r4 < 0) goto L_0x00d2
            if (r0 == 0) goto L_0x00d2
            r6.scrollBy(r0, r10)
        L_0x00d2:
            r12.A00 = r8
        L_0x00d4:
            int r0 = r12.A03
            if (r0 != r9) goto L_0x0050
            float r3 = r13.getY()
            int[] r10 = r12.A0S
            int r1 = r12.A0G
            r0 = 0
            r10[r0] = r1
            int r2 = r12.A06
            int r2 = r2 - r1
            r10[r7] = r2
            r9 = 0
            r0 = r10[r0]
            float r1 = (float) r0
            float r0 = (float) r2
            float r8 = X.AnonymousClass001.A01(r0, r3, r1)
            int r0 = r12.A09
            float r0 = (float) r0
            float r1 = X.AnonymousClass002.A00(r0, r8)
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0050
            float r1 = r12.A01
            androidx.recyclerview.widget.RecyclerView r6 = r12.A0B
            int r5 = r6.computeVerticalScrollRange()
            int r4 = r6.computeVerticalScrollOffset()
            int r3 = r12.A06
            r2 = r10[r7]
            r0 = r10[r9]
            int r2 = r2 - r0
            if (r2 == 0) goto L_0x0125
            float r1 = r8 - r1
            float r0 = (float) r2
            float r1 = r1 / r0
            int r5 = r5 - r3
            float r0 = (float) r5
            float r1 = r1 * r0
            int r0 = (int) r1
            int r4 = r4 + r0
            if (r4 >= r5) goto L_0x0125
            if (r4 < 0) goto L_0x0125
            if (r0 == 0) goto L_0x0125
            r6.scrollBy(r9, r0)
        L_0x0125:
            r12.A01 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09U.BeG(android.view.MotionEvent, androidx.recyclerview.widget.RecyclerView):void");
    }

    public AnonymousClass09U(Drawable drawable, Drawable drawable2, StateListDrawable stateListDrawable, StateListDrawable stateListDrawable2, RecyclerView recyclerView, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A0K = ofFloat;
        this.A02 = 0;
        this.A0Q = new C11040j0(this);
        this.A0P = new C17610vr(this, 0);
        this.A0O = stateListDrawable;
        this.A0M = drawable;
        this.A0N = stateListDrawable2;
        this.A0L = drawable2;
        this.A0I = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.A0J = Math.max(i, drawable.getIntrinsicWidth());
        this.A0E = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.A0F = Math.max(i, drawable2.getIntrinsicWidth());
        this.A0H = i2;
        this.A0G = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new AnonymousClass007(this));
        ofFloat.addUpdateListener(new C06650Yq(this));
        RecyclerView recyclerView2 = this.A0B;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A0p(this);
                RecyclerView recyclerView3 = this.A0B;
                recyclerView3.A14.remove(this);
                if (recyclerView3.A0U == this) {
                    recyclerView3.A0U = null;
                }
                this.A0B.A0r(this.A0P);
                this.A0B.removeCallbacks(this.A0Q);
            }
            this.A0B = recyclerView;
            recyclerView.A0o(this);
            RecyclerView recyclerView4 = this.A0B;
            recyclerView4.A14.add(this);
            recyclerView4.A0q(this.A0P);
        }
    }

    public void Ba3(boolean z) {
    }
}
