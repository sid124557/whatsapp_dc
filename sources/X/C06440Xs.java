package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.ArrayList;

/* renamed from: X.0Xs  reason: invalid class name and case insensitive filesystem */
public abstract class C06440Xs {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public AnonymousClass0R0 A05;
    public C04690Qg A06;
    public RecyclerView A07;
    public AnonymousClass0OO A08;
    public AnonymousClass0OO A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C;
    public boolean A0D = false;
    public final C16970uK A0E;
    public final C16970uK A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r0 == 1073741824) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r5 == 1073741824) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r0 = 0
            int r4 = java.lang.Math.max(r0, r4)
            r3 = -2
            r2 = -1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x001f
            if (r7 >= 0) goto L_0x002f
            if (r7 != r2) goto L_0x0018
            if (r5 == r0) goto L_0x002d
            if (r5 == 0) goto L_0x0018
            if (r5 == r1) goto L_0x002d
        L_0x0018:
            r5 = 0
            r7 = 0
        L_0x001a:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r0
        L_0x001f:
            if (r7 >= 0) goto L_0x002f
            if (r7 == r2) goto L_0x002d
            if (r7 != r3) goto L_0x0018
            if (r5 == r0) goto L_0x002b
            r0 = r5
            r5 = 0
            if (r0 != r1) goto L_0x002d
        L_0x002b:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x002d:
            r7 = r4
            goto L_0x001a
        L_0x002f:
            r5 = 1073741824(0x40000000, float:2.0)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06440Xs.A02(int, int, int, int, boolean):int");
    }

    public abstract C002102g A0S();

    public void A0f(View view) {
        C002102g A0Y = AnonymousClass001.A0Y(view);
        Rect A0C2 = this.A07.A0C(view);
        int i = 0 + A0C2.left + A0C2.right;
        int i2 = 0 + A0C2.top + A0C2.bottom;
        int A022 = A02(this.A03, this.A04, A0B() + A0C() + A0Y.leftMargin + A0Y.rightMargin + i, A0Y.width, A17());
        int A023 = A02(this.A00, this.A01, A0D() + A0A() + A0Y.topMargin + A0Y.bottomMargin + i2, A0Y.height, A18());
        if (A1E(view, A0Y, A022, A023)) {
            view.measure(A022, A023);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a3, code lost:
        if ((r1.bottom - r5) > r6) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1C(android.graphics.Rect r12, android.view.View r13, androidx.recyclerview.widget.RecyclerView r14, boolean r15, boolean r16) {
        /*
            r11 = this;
            r0 = 2
            int[] r8 = new int[r0]
            int r4 = r11.A0B()
            int r3 = r11.A0D()
            int r2 = r11.A03
            int r0 = r11.A0C()
            int r2 = r2 - r0
            int r1 = r11.A00
            int r0 = r11.A0A()
            int r1 = r1 - r0
            int r9 = r13.getLeft()
            int r0 = r12.left
            int r9 = r9 + r0
            int r0 = r13.getScrollX()
            int r9 = r9 - r0
            int r7 = r13.getTop()
            int r0 = r12.top
            int r7 = r7 + r0
            int r0 = r13.getScrollY()
            int r7 = r7 - r0
            int r6 = r12.width()
            int r6 = r6 + r9
            int r0 = r12.height()
            int r0 = r0 + r7
            int r9 = r9 - r4
            r4 = 0
            int r10 = java.lang.Math.min(r4, r9)
            int r7 = r7 - r3
            int r5 = java.lang.Math.min(r4, r7)
            int r6 = r6 - r2
            int r3 = java.lang.Math.max(r4, r6)
            int r2 = X.AnonymousClass001.A0C(r0, r1, r4)
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            int r1 = X.AnonymousClass0YH.A01(r0)
            r0 = 1
            if (r1 != r0) goto L_0x00b0
            if (r3 != 0) goto L_0x005e
            int r3 = java.lang.Math.max(r10, r6)
        L_0x005e:
            if (r5 != 0) goto L_0x0064
            int r5 = java.lang.Math.min(r7, r2)
        L_0x0064:
            r8[r4] = r3
            r8[r0] = r5
            r10 = 0
            r4 = r8[r4]
            r9 = 1
            if (r16 == 0) goto L_0x00a6
            android.view.View r8 = r14.getFocusedChild()
            if (r8 == 0) goto L_0x00a5
            int r7 = r11.A0B()
            int r6 = r11.A0D()
            int r3 = r11.A03
            int r0 = r11.A0C()
            int r3 = r3 - r0
            int r2 = r11.A00
            int r0 = r11.A0A()
            int r2 = r2 - r0
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            android.graphics.Rect r1 = r0.A0s
            androidx.recyclerview.widget.RecyclerView.A05(r8, r1)
            int r0 = r1.left
            int r0 = r0 - r4
            if (r0 >= r3) goto L_0x00a5
            int r0 = r1.right
            int r0 = r0 - r4
            if (r0 <= r7) goto L_0x00a5
            int r0 = r1.top
            int r0 = r0 - r5
            if (r0 >= r2) goto L_0x00a5
            int r0 = r1.bottom
            int r0 = r0 - r5
            if (r0 > r6) goto L_0x00a6
        L_0x00a5:
            return r10
        L_0x00a6:
            if (r4 != 0) goto L_0x00aa
            if (r5 == 0) goto L_0x00a5
        L_0x00aa:
            if (r15 == 0) goto L_0x00b8
            r14.scrollBy(r4, r5)
            return r9
        L_0x00b0:
            if (r10 != 0) goto L_0x00b6
            int r10 = java.lang.Math.min(r9, r3)
        L_0x00b6:
            r3 = r10
            goto L_0x005e
        L_0x00b8:
            r14.A0f(r4, r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06440Xs.A1C(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, boolean, boolean):boolean");
    }

    public static void A06(GridLayoutManager gridLayoutManager) {
        gridLayoutManager.A01.A01.clear();
        gridLayoutManager.A01.A00.clear();
    }

    public int A08() {
        AnonymousClass0R0 r0 = this.A05;
        if (r0 != null) {
            return r0.A01();
        }
        return 0;
    }

    public int A09() {
        AnonymousClass0R6 r0;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (r0 = recyclerView.A0N) == null) {
            return 0;
        }
        return r0.A0G();
    }

    public int A0A() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int A0B() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int A0C() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int A0D() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int A0E(C04870Qz r4, AnonymousClass0Q1 r5) {
        AnonymousClass0R6 r1;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (r1 = recyclerView.A0N) == null || !A17()) {
            return 1;
        }
        return r1.A0G();
    }

    public int A0F(C04870Qz r4, AnonymousClass0Q1 r5) {
        AnonymousClass0R6 r1;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (r1 = recyclerView.A0N) == null || !A18()) {
            return 1;
        }
        return r1.A0G();
    }

    public Parcelable A0O() {
        return null;
    }

    public View A0Q(int i) {
        AnonymousClass0R0 r0 = this.A05;
        if (r0 != null) {
            return r0.A05(i);
        }
        return null;
    }

    public C002102g A0T(Context context, AttributeSet attributeSet) {
        return new C002102g(context, attributeSet);
    }

    public C002102g A0U(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C002102g) {
            return new C002102g((C002102g) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C002102g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C002102g(layoutParams);
    }

    public void A0V() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void A0W(int i) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            int A012 = recyclerView.A0K.A01();
            for (int i2 = 0; i2 < A012; i2++) {
                recyclerView.A0K.A05(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void A0X(int i) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            int A012 = recyclerView.A0K.A01();
            for (int i2 = 0; i2 < A012; i2++) {
                recyclerView.A0K.A05(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void A0g(View view) {
        AnonymousClass0R0 r3 = this.A05;
        RecyclerView recyclerView = ((C08480eY) r3.A01).A00;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (r3.A00.A07(indexOfChild)) {
                r3.A09(view);
            }
            View childAt = recyclerView.getChildAt(indexOfChild);
            if (childAt != null) {
                recyclerView.A0k(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeViewAt(indexOfChild);
        }
    }

    public void A0j(View view, Rect rect) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.A0C(view));
        }
    }

    public void A0m(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.A07.canScrollVertically(-1) && !this.A07.canScrollHorizontally(-1) && !this.A07.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AnonymousClass0R6 r0 = this.A07.A0N;
            if (r0 != null) {
                accessibilityEvent.setItemCount(r0.A0G());
            }
        }
    }

    public void A0n(C05650Ui r4, C04870Qz r5, AnonymousClass0Q1 r6) {
        if (this.A07.canScrollVertically(-1) || this.A07.canScrollHorizontally(-1)) {
            AccessibilityNodeInfo accessibilityNodeInfo = r4.A01;
            accessibilityNodeInfo.addAction(DefaultCrypto.BUFFER_SIZE);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.A07.canScrollVertically(1) || this.A07.canScrollHorizontally(1)) {
            AccessibilityNodeInfo accessibilityNodeInfo2 = r4.A01;
            accessibilityNodeInfo2.addAction(ZipDecompressor.UNZIP_BUFFER_SIZE);
            accessibilityNodeInfo2.setScrollable(true);
        }
        r4.A0F(new AnonymousClass0KO(AccessibilityNodeInfo.CollectionInfo.obtain(A0F(r5, r6), A0E(r5, r6), false, 0)));
    }

    public void A0t(C04870Qz r8) {
        ArrayList arrayList = r8.A05;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = AnonymousClass001.A0Z(arrayList, i).A0H;
            C05570Ua A022 = RecyclerView.A02(view);
            if (!AnonymousClass000.A1S(A022.A00 & 128)) {
                A022.A05(false);
                if ((A022.A00 & 256) != 0) {
                    this.A07.removeDetachedView(view, false);
                }
                AnonymousClass0UY r0 = this.A07.A0R;
                if (r0 != null) {
                    r0.A09(A022);
                }
                A022.A05(true);
                C05570Ua A023 = RecyclerView.A02(view);
                A023.A09 = null;
                A023.A0G = false;
                A023.A00 &= -33;
                r8.A08(A023);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = r8.A04;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.A07.invalidate();
        }
    }

    public void A0v(C04870Qz r3, AnonymousClass0Q1 r4) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public void A0x(C04690Qg r5) {
        C04690Qg r1 = this.A06;
        if (!(r1 == null || r5 == r1 || !r1.A05)) {
            r1.A01();
        }
        this.A06 = r5;
        RecyclerView recyclerView = this.A07;
        C13230mq r12 = recyclerView.A0z;
        r12.A06.removeCallbacks(r12);
        r12.A03.abortAnimation();
        if (r5.A06) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("An instance of ");
            String simpleName = r5.getClass().getSimpleName();
            A0o.append(simpleName);
            A0o.append(" was started more than once. Each instance of");
            A0o.append(simpleName);
            Log.w("RecyclerView", AnonymousClass000.A0X(" is intended to only be used once. You should create a new instance for each use.", A0o));
        }
        r5.A03 = recyclerView;
        r5.A02 = this;
        int i = r5.A00;
        if (i != -1) {
            recyclerView.A0y.A06 = i;
            r5.A05 = true;
            r5.A04 = true;
            r5.A01 = recyclerView.A0S.A0P(i);
            r5.A02();
            r5.A03.A0z.A00();
            r5.A06 = true;
            return;
        }
        throw AnonymousClass001.A0c("Invalid target position");
    }

    public void A0z(AnonymousClass0Q1 r3, RecyclerView recyclerView, int i) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public void A16(String str) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.A0t(str);
        }
    }

    public boolean A17() {
        return false;
    }

    public boolean A18() {
        return false;
    }

    public boolean A19() {
        return this.A0A;
    }

    public boolean A1A() {
        return false;
    }

    public boolean A1B() {
        return false;
    }

    public boolean A1D(Bundle bundle, C04870Qz r8, AnonymousClass0Q1 r9, int i) {
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            if (i == 4096) {
                if (recyclerView.canScrollVertically(1)) {
                    i4 = (this.A00 - A0D()) - A0A();
                } else {
                    i4 = 0;
                }
                if (this.A07.canScrollHorizontally(1)) {
                    i3 = (this.A03 - A0B()) - A0C();
                }
                i3 = 0;
            } else if (i == 8192) {
                if (recyclerView.canScrollVertically(-1)) {
                    i2 = -((this.A00 - A0D()) - A0A());
                } else {
                    i2 = 0;
                }
                if (this.A07.canScrollHorizontally(-1)) {
                    i3 = -((this.A03 - A0B()) - A0C());
                }
                i3 = 0;
            }
            if (!(i2 == 0 && i3 == 0)) {
                this.A07.A0h(i3, i2, true);
                return true;
            }
        }
        return false;
    }

    public C06440Xs() {
        C17920wS r2 = new C17920wS(this, 0);
        this.A0E = r2;
        C17920wS r1 = new C17920wS(this, 1);
        this.A0F = r1;
        this.A08 = new AnonymousClass0OO(r2);
        this.A09 = new AnonymousClass0OO(r1);
    }

    public static int A01(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(size, Math.max(i2, i3));
        }
        if (mode != 1073741824) {
            return Math.max(i2, i3);
        }
        return size;
    }

    public static int A03(View view) {
        return AnonymousClass001.A0J(AnonymousClass001.A0Y(view).A00);
    }

    public static int A04(C06440Xs r0, int i) {
        return A03(r0.A0Q(i));
    }

    public static void A05(View view, int i, int i2, int i3, int i4) {
        C002102g A0Y = AnonymousClass001.A0Y(view);
        Rect rect = A0Y.A03;
        view.layout(i + rect.left + A0Y.leftMargin, i2 + rect.top + A0Y.topMargin, (i3 - rect.right) - A0Y.rightMargin, (i4 - rect.bottom) - A0Y.bottomMargin);
    }

    public static boolean A07(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 <= 0 || i == i3) {
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode == 1073741824 && size == i) {
                    return true;
                }
                return false;
            } else if (size >= i) {
                return true;
            }
        }
        return false;
    }

    public View A0P(int i) {
        int A082 = A08();
        for (int i2 = 0; i2 < A082; i2++) {
            View A0Q = A0Q(i2);
            C05570Ua A022 = RecyclerView.A02(A0Q);
            if (A022 != null && AnonymousClass001.A0J(A022) == i && !AnonymousClass000.A1S(A022.A00 & 128) && (this.A07.A0y.A08 || !AnonymousClass000.A1S(A022.A00 & 8))) {
                return A0Q;
            }
        }
        return null;
    }

    public void A0a(int i, int i2) {
        this.A03 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.A04 = mode;
        if (mode == 0 && !RecyclerView.A1B) {
            this.A03 = 0;
        }
        this.A00 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.A01 = mode2;
        if (mode2 == 0 && !RecyclerView.A1B) {
            this.A00 = 0;
        }
    }

    public void A0b(int i, int i2) {
        int A082 = A08();
        if (A082 == 0) {
            this.A07.A0d(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < A082; i7++) {
            View A0Q = A0Q(i7);
            Rect rect = this.A07.A0s;
            RecyclerView.A05(A0Q, rect);
            int i8 = rect.left;
            if (i8 < i5) {
                i5 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i6) {
                i6 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i4) {
                i4 = i11;
            }
        }
        this.A07.A0s.set(i5, i6, i3, i4);
        A0c(this.A07.A0s, i, i2);
    }

    public void A0c(Rect rect, int i, int i2) {
        int width = rect.width() + A0B() + A0C();
        int height = rect.height() + A0D() + A0A();
        this.A07.setMeasuredDimension(A01(i, width, AnonymousClass0YY.A02(this.A07)), A01(i2, height, AnonymousClass0YY.A01(this.A07)));
    }

    public void A0d(Rect rect, View view) {
        Matrix matrix;
        Rect A002 = C002102g.A00(view);
        rect.set(-A002.left, -A002.top, view.getWidth() + A002.right, view.getHeight() + A002.bottom);
        if (!(this.A07 == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.A07.A0u;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public void A0h(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C05570Ua r3 = AnonymousClass001.A0Y(view).A00;
        boolean A1S = AnonymousClass000.A1S(r3.A00 & 8);
        C04660Qd r0 = this.A07.A11;
        if (A1S) {
            C06290Wz r02 = r0.A01;
            AnonymousClass0TA r1 = (AnonymousClass0TA) r02.get(r3);
            if (r1 == null) {
                r1 = AnonymousClass0TA.A00();
                r02.put(r3, r1);
            }
            r1.A00 |= 1;
        } else {
            r0.A01(r3);
        }
        this.A05.A0B(view, layoutParams, i, AnonymousClass000.A1S(r3.A00 & 8));
    }

    public final void A0i(View view, int i, boolean z) {
        C05570Ua A022 = RecyclerView.A02(view);
        if (z || AnonymousClass000.A1S(A022.A00 & 8)) {
            C06290Wz r0 = this.A07.A11.A01;
            AnonymousClass0TA r1 = (AnonymousClass0TA) r0.get(A022);
            if (r1 == null) {
                r1 = AnonymousClass0TA.A00();
                r0.put(A022, r1);
            }
            r1.A00 |= 1;
        } else {
            this.A07.A11.A01(A022);
        }
        C002102g A0Y = AnonymousClass001.A0Y(view);
        int i2 = A022.A00;
        if (AnonymousClass000.A1S(i2 & 32) || A022.A09 != null) {
            C04870Qz r02 = A022.A09;
            if (r02 != null) {
                r02.A09(A022);
            } else {
                A022.A00 = i2 & -33;
            }
            this.A05.A0B(view, view.getLayoutParams(), i, false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.A07;
            AnonymousClass0R0 r03 = this.A05;
            if (parent == recyclerView) {
                int A042 = r03.A04(view);
                if (i == -1) {
                    i = this.A05.A01();
                }
                if (A042 == -1) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    A0o.append(this.A07.indexOfChild(view));
                    throw AnonymousClass000.A0I(this.A07.A0I(), A0o);
                } else if (A042 != i) {
                    C06440Xs r2 = this.A07.A0S;
                    View A0Q = r2.A0Q(A042);
                    if (A0Q != null) {
                        r2.A0Q(A042);
                        r2.A05.A06(A042);
                        r2.A0h(A0Q, i);
                    } else {
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("Cannot move a child from non-existing index:");
                        A0o2.append(A042);
                        throw AnonymousClass000.A0F(r2.A07.toString(), A0o2);
                    }
                }
            } else {
                r03.A0A(view, i, false);
                A0Y.A01 = true;
                C04690Qg r22 = this.A06;
                if (r22 != null && r22.A05 && RecyclerView.A01(view) == r22.A00) {
                    r22.A01 = view;
                }
            }
        }
        if (A0Y.A02) {
            A022.A0H.invalidate();
            A0Y.A02 = false;
        }
    }

    public void A0k(View view, C05650Ui r4) {
        C05570Ua A022 = RecyclerView.A02(view);
        if (A022 != null && !AnonymousClass000.A1S(A022.A00 & 8)) {
            AnonymousClass0R0 r0 = this.A05;
            if (!r0.A02.contains(A022.A0H)) {
                RecyclerView recyclerView = this.A07;
                A0l(view, r4, recyclerView.A0w, recyclerView.A0y);
            }
        }
    }

    public void A0l(View view, C05650Ui r9, C04870Qz r10, AnonymousClass0Q1 r11) {
        int i;
        int i2;
        if (A18()) {
            i = A03(view);
        } else {
            i = 0;
        }
        if (A17()) {
            i2 = A03(view);
        } else {
            i2 = 0;
        }
        r9.A0G(new AnonymousClass0KP(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, 1, i2, 1, false, false)));
    }

    public void A0o(AnonymousClass0R6 r1, AnonymousClass0R6 r2) {
    }

    public void A0p(C16020sL r1, int i) {
    }

    public void A0r(C04870Qz r5) {
        int A082 = A08();
        while (true) {
            A082--;
            if (A082 >= 0) {
                View A0Q = A0Q(A082);
                C05570Ua A022 = RecyclerView.A02(A0Q);
                if (!AnonymousClass000.A1S(A022.A00 & 128)) {
                    if ((A022.A00 & 4) == 0 || AnonymousClass000.A1S(A022.A00 & 8) || this.A07.A0N.A00) {
                        A0Q(A082);
                        this.A05.A06(A082);
                        r5.A07(A0Q);
                        this.A07.A11.A01(A022);
                    } else {
                        if (A0Q(A082) != null) {
                            this.A05.A07(A082);
                        }
                        r5.A08(A022);
                    }
                }
            } else {
                return;
            }
        }
    }

    public void A0s(C04870Qz r3) {
        int A082 = A08();
        while (true) {
            A082--;
            if (A082 < 0) {
                return;
            }
            if (!AnonymousClass000.A1S(RecyclerView.A02(A0Q(A082)).A00 & 128)) {
                A0u(r3, A082);
            }
        }
    }

    public void A0u(C04870Qz r3, int i) {
        View A0Q = A0Q(i);
        if (A0Q(i) != null) {
            this.A05.A07(i);
        }
        r3.A06(A0Q);
    }

    public void A0w(C04870Qz r1, RecyclerView recyclerView) {
    }

    public boolean A1E(View view, C002102g r4, int i, int i2) {
        if (view.isLayoutRequested() || !A07(view.getWidth(), i, r4.width) || !A07(view.getHeight(), i2, r4.height)) {
            return true;
        }
        return false;
    }

    public boolean A1F(C002102g r2) {
        return AnonymousClass000.A1W(r2);
    }

    public int A0I(AnonymousClass0Q1 r2) {
        return 0;
    }

    public int A0J(AnonymousClass0Q1 r2) {
        return 0;
    }

    public int A0K(AnonymousClass0Q1 r2) {
        return 0;
    }

    public int A0L(AnonymousClass0Q1 r2) {
        return 0;
    }

    public int A0M(AnonymousClass0Q1 r2) {
        return 0;
    }

    public int A0N(AnonymousClass0Q1 r2) {
        return 0;
    }

    public void A0Y(int i) {
    }

    public void A0Z(int i) {
    }

    public void A0e(Parcelable parcelable) {
    }

    public void A0y(AnonymousClass0Q1 r1) {
    }

    public void A10(RecyclerView recyclerView) {
    }

    public void A11(RecyclerView recyclerView) {
    }

    public int A0G(C04870Qz r2, AnonymousClass0Q1 r3, int i) {
        return 0;
    }

    public int A0H(C04870Qz r2, AnonymousClass0Q1 r3, int i) {
        return 0;
    }

    public void A12(RecyclerView recyclerView, int i, int i2) {
    }

    public void A13(RecyclerView recyclerView, int i, int i2) {
    }

    public View A0R(View view, C04870Qz r3, AnonymousClass0Q1 r4, int i) {
        return null;
    }

    public void A0q(C16020sL r1, AnonymousClass0Q1 r2, int i, int i2) {
    }

    public void A14(RecyclerView recyclerView, int i, int i2, int i3) {
    }

    public void A15(RecyclerView recyclerView, Object obj, int i, int i2) {
    }
}
