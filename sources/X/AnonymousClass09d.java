package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.09d  reason: invalid class name */
public final class AnonymousClass09d extends AnonymousClass0O5 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C03760Ll A04 = new C03760Ll();
    public C04590Ow A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final LinearLayoutManager A09;
    public final RecyclerView A0A;
    public final ViewPager2 A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r8.A01 != r1) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r2 == r0) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(androidx.recyclerview.widget.RecyclerView r9, int r10, int r11) {
        /*
            r8 = this;
            r6 = 1
            r8.A08 = r6
            r8.A07()
            boolean r0 = r8.A07
            r7 = -1
            r5 = 0
            if (r0 == 0) goto L_0x006b
            r8.A07 = r5
            if (r11 > 0) goto L_0x0026
            if (r11 != 0) goto L_0x0066
            boolean r2 = X.AnonymousClass001.A1V(r10)
            androidx.viewpager2.widget.ViewPager2 r0 = r8.A0B
            androidx.recyclerview.widget.LinearLayoutManager r0 = r0.A04
            androidx.recyclerview.widget.RecyclerView r0 = r0.A07
            int r1 = X.AnonymousClass0YH.A01(r0)
            r0 = 1
            if (r1 == r6) goto L_0x0024
            r0 = 0
        L_0x0024:
            if (r2 != r0) goto L_0x0066
        L_0x0026:
            X.0Ll r1 = r8.A04
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0066
            int r0 = r1.A02
            int r1 = r0 + 1
        L_0x0030:
            r8.A03 = r1
            int r0 = r8.A01
            if (r0 == r1) goto L_0x003d
        L_0x0036:
            X.0Ow r0 = r8.A05
            if (r0 == 0) goto L_0x003d
            r0.A01(r1)
        L_0x003d:
            X.0Ll r4 = r8.A04
            int r3 = r4.A02
            if (r3 != r7) goto L_0x0044
            r3 = 0
        L_0x0044:
            float r2 = r4.A00
            int r1 = r4.A01
            X.0Ow r0 = r8.A05
            if (r0 == 0) goto L_0x004f
            r0.A02(r3, r2, r1)
        L_0x004f:
            int r1 = r4.A02
            int r0 = r8.A03
            if (r1 == r0) goto L_0x0057
            if (r0 != r7) goto L_0x0065
        L_0x0057:
            int r0 = r4.A01
            if (r0 != 0) goto L_0x0065
            int r0 = r8.A02
            if (r0 == r6) goto L_0x0065
            r8.A08(r5)
            r8.A06()
        L_0x0065:
            return
        L_0x0066:
            X.0Ll r0 = r8.A04
            int r1 = r0.A02
            goto L_0x0030
        L_0x006b:
            int r0 = r8.A00
            if (r0 != 0) goto L_0x003d
            X.0Ll r0 = r8.A04
            int r1 = r0.A02
            if (r1 != r7) goto L_0x0036
            r1 = 0
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09d.A04(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void A06() {
        this.A00 = 0;
        this.A02 = 0;
        C03760Ll r1 = this.A04;
        r1.A02 = -1;
        r1.A00 = 0.0f;
        r1.A01 = 0;
        this.A01 = -1;
        this.A03 = -1;
        this.A07 = false;
        this.A08 = false;
        this.A06 = false;
    }

    public void A05(RecyclerView recyclerView, int i) {
        C04590Ow r0;
        C04590Ow r02;
        int i2 = this.A00;
        if (!(i2 == 1 && this.A02 == 1) && i == 1) {
            this.A00 = 1;
            int i3 = this.A03;
            if (i3 != -1) {
                this.A01 = i3;
                this.A03 = -1;
            } else if (this.A01 == -1) {
                this.A01 = this.A09.A1H();
            }
            A08(1);
            return;
        }
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        if (!z || i != 2) {
            if (z && i == 0) {
                A07();
                boolean z2 = this.A08;
                C03760Ll r1 = this.A04;
                if (!z2) {
                    int i4 = r1.A02;
                    if (!(i4 == -1 || (r02 = this.A05) == null)) {
                        r02.A02(i4, 0.0f, 0);
                    }
                } else if (r1.A01 == 0) {
                    int i5 = this.A01;
                    int i6 = r1.A02;
                    if (!(i5 == i6 || (r0 = this.A05) == null)) {
                        r0.A01(i6);
                    }
                }
                A08(0);
                A06();
            }
            if (this.A00 == 2 && i == 0 && this.A06) {
                A07();
                C03760Ll r12 = this.A04;
                if (r12.A01 == 0) {
                    int i7 = this.A03;
                    int i8 = r12.A02;
                    if (i7 != i8) {
                        if (i8 == -1) {
                            i8 = 0;
                        }
                        C04590Ow r03 = this.A05;
                        if (r03 != null) {
                            r03.A01(i8);
                        }
                    }
                    A08(0);
                    A06();
                }
            }
        } else if (this.A08) {
            A08(2);
            this.A07 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        if (r6.A08() <= 1) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0118, code lost:
        if (r7[r8 - 1][1] >= r1) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07() {
        /*
            r14 = this;
            X.0Ll r3 = r14.A04
            androidx.recyclerview.widget.LinearLayoutManager r2 = r14.A09
            int r1 = r2.A1H()
            r3.A02 = r1
            r0 = -1
            if (r1 == r0) goto L_0x0152
            android.view.View r10 = r2.A0P(r1)
            if (r10 == 0) goto L_0x0152
            android.graphics.Rect r0 = X.C002102g.A00(r10)
            int r9 = r0.left
            android.graphics.Rect r0 = X.C002102g.A00(r10)
            int r5 = r0.right
            android.graphics.Rect r0 = X.C002102g.A00(r10)
            int r8 = r0.top
            android.graphics.Rect r0 = X.C002102g.A00(r10)
            int r4 = r0.bottom
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0041
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.leftMargin
            int r9 = r9 + r0
            int r0 = r1.rightMargin
            int r5 = r5 + r0
            int r0 = r1.topMargin
            int r8 = r8 + r0
            int r0 = r1.bottomMargin
            int r4 = r4 + r0
        L_0x0041:
            int r7 = r10.getHeight()
            int r7 = r7 + r8
            int r7 = r7 + r4
            int r6 = r10.getWidth()
            int r6 = r6 + r9
            int r6 = r6 + r5
            int r0 = r2.A01
            r5 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00d5
            int r1 = r10.getLeft()
            int r1 = r1 - r9
            androidx.recyclerview.widget.RecyclerView r0 = r14.A0A
            int r0 = r0.getPaddingLeft()
            int r1 = r1 - r0
            androidx.viewpager2.widget.ViewPager2 r0 = r14.A0B
            androidx.recyclerview.widget.LinearLayoutManager r0 = r0.A04
            androidx.recyclerview.widget.RecyclerView r0 = r0.A07
            int r0 = X.AnonymousClass0YH.A01(r0)
            if (r0 != r5) goto L_0x006c
            int r1 = -r1
        L_0x006c:
            r7 = r6
        L_0x006d:
            int r0 = -r1
            r3.A01 = r0
            if (r0 >= 0) goto L_0x0149
            X.0Vd r9 = new X.0Vd
            r9.<init>(r2)
            androidx.recyclerview.widget.LinearLayoutManager r6 = r9.A00
            int r8 = r6.A08()
            if (r8 == 0) goto L_0x0103
            int r0 = r6.A01
            boolean r13 = X.AnonymousClass000.A1T(r0)
            r0 = 2
            int[] r1 = new int[r0]
            r1[r5] = r0
            r1[r4] = r8
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r0, r1)
            int[][] r7 = (int[][]) r7
            r10 = 0
        L_0x0095:
            if (r10 >= r8) goto L_0x00e9
            android.view.View r12 = r6.A0Q(r10)
            if (r12 == 0) goto L_0x00e2
            android.view.ViewGroup$LayoutParams r11 = r12.getLayoutParams()
            boolean r0 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00d2
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
        L_0x00a7:
            r2 = r7[r10]
            if (r13 == 0) goto L_0x00cb
            int r1 = r12.getLeft()
            int r0 = r11.leftMargin
        L_0x00b1:
            int r1 = r1 - r0
            r2[r4] = r1
            r2 = r7[r10]
            if (r13 == 0) goto L_0x00c4
            int r1 = r12.getRight()
            int r0 = r11.rightMargin
        L_0x00be:
            int r1 = r1 + r0
            r2[r5] = r1
            int r10 = r10 + 1
            goto L_0x0095
        L_0x00c4:
            int r1 = r12.getBottom()
            int r0 = r11.bottomMargin
            goto L_0x00be
        L_0x00cb:
            int r1 = r12.getTop()
            int r0 = r11.topMargin
            goto L_0x00b1
        L_0x00d2:
            android.view.ViewGroup$MarginLayoutParams r11 = X.C05830Vd.A01
            goto L_0x00a7
        L_0x00d5:
            int r1 = r10.getTop()
            int r1 = r1 - r8
            androidx.recyclerview.widget.RecyclerView r0 = r14.A0A
            int r0 = r0.getPaddingTop()
            int r1 = r1 - r0
            goto L_0x006d
        L_0x00e2:
            java.lang.String r0 = "null view contained in the view hierarchy"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x00e9:
            X.0wT r0 = new X.0wT
            r0.<init>(r9, r5)
            java.util.Arrays.sort(r7, r0)
            r2 = 1
        L_0x00f2:
            if (r2 >= r8) goto L_0x010a
            int r0 = r2 + -1
            r0 = r7[r0]
            r1 = r0[r5]
            r0 = r7[r2]
            r0 = r0[r4]
            if (r1 != r0) goto L_0x011a
            int r2 = r2 + 1
            goto L_0x00f2
        L_0x0103:
            int r0 = r6.A08()
            if (r0 > r5) goto L_0x0135
            goto L_0x011a
        L_0x010a:
            r0 = r7[r4]
            r1 = r0[r5]
            r0 = r0[r4]
            int r1 = r1 - r0
            if (r0 > 0) goto L_0x011a
            int r8 = r8 - r5
            r0 = r7[r8]
            r0 = r0[r5]
            if (r0 >= r1) goto L_0x0103
        L_0x011a:
            int r2 = r6.A08()
            r1 = 0
        L_0x011f:
            if (r1 >= r2) goto L_0x0135
            android.view.View r0 = r6.A0Q(r1)
            boolean r0 = X.C05830Vd.A00(r0)
            if (r0 == 0) goto L_0x0132
            java.lang.String r0 = "Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0132:
            int r1 = r1 + 1
            goto L_0x011f
        L_0x0135:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r1 = new java.lang.Object[r5]
            int r0 = r3.A01
            X.AnonymousClass000.A1P(r1, r0, r4)
            java.lang.String r0 = "Page can only be offset by a positive amount, not by %d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0149:
            r1 = 0
            if (r7 == 0) goto L_0x014f
            float r1 = (float) r0
            float r0 = (float) r7
            float r1 = r1 / r0
        L_0x014f:
            r3.A00 = r1
            return
        L_0x0152:
            r3.A02 = r0
            r0 = 0
            r3.A00 = r0
            r0 = 0
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09d.A07():void");
    }

    public final void A08(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            C04590Ow r0 = this.A05;
            if (r0 != null) {
                r0.A00(i);
            }
        }
    }

    public AnonymousClass09d(ViewPager2 viewPager2) {
        this.A0B = viewPager2;
        RecyclerView recyclerView = viewPager2.A08;
        this.A0A = recyclerView;
        this.A09 = (LinearLayoutManager) recyclerView.getLayoutManager();
        A06();
    }
}
