package androidx.coordinatorlayout.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass05z;
import X.AnonymousClass0I2;
import X.AnonymousClass0L7;
import X.AnonymousClass0RP;
import X.AnonymousClass0V0;
import X.AnonymousClass0VR;
import X.AnonymousClass0XY;
import X.AnonymousClass0YH;
import X.AnonymousClass0YY;
import X.AnonymousClass0YZ;
import X.C002002f;
import X.C008707a;
import X.C04160Nb;
import X.C05630Ug;
import X.C06130Wj;
import X.C06290Wz;
import X.C07250aZ;
import X.C13400n7;
import X.C15720rp;
import X.C15830s0;
import X.C16600tf;
import X.C17260vE;
import X.C17270vF;
import X.C18140wo;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CoordinatorLayout extends ViewGroup implements C17270vF, C17260vE {
    public static final C16600tf A0J = new AnonymousClass05z(12);
    public static final String A0K;
    public static final ThreadLocal A0L = new ThreadLocal();
    public static final Comparator A0M = new C13400n7();
    public static final Class[] A0N = {Context.class, AttributeSet.class};
    public Drawable A00;
    public View A01;
    public View A02;
    public ViewGroup.OnHierarchyChangeListener A03;
    public C07250aZ A04;
    public C15830s0 A05;
    public AnonymousClass0XY A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public int[] A0B;
    public final C04160Nb A0C;
    public final AnonymousClass0L7 A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final int[] A0H;
    public final int[] A0I;

    @Deprecated
    public @interface DefaultBehavior {
        Class value();
    }

    public void A0C(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    public void BWv(View view, int i, int i2, int i3, int i4, int i5) {
        BWw(view, this.A0I, i, i2, i3, i4, 0);
    }

    public boolean BcD(View view, View view2, int i, int i2) {
        boolean z;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C002002f A0W = AnonymousClass001.A0W(childAt);
                C05630Ug r5 = A0W.A0A;
                int i4 = i2;
                if (r5 != null) {
                    z = r5.A0G(childAt, view, view2, this, i, i4);
                    z2 |= z;
                } else {
                    z = false;
                }
                if (i2 != 0) {
                    A0W.A0C = z;
                } else {
                    A0W.A0D = z;
                }
            }
        }
        return z2;
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C002002f(-2, -2);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C05630Ug r5;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C002002f A0W = AnonymousClass001.A0W(childAt);
                if (A0W.A0D && (r5 = A0W.A0A) != null) {
                    z |= r5.A0H(childAt, view, this, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        BWu(view, iArr, i, i2, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        BWv(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        BWx(view, view2, i, 0);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return BcD(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        Bcp(view, 0);
    }

    static {
        String str;
        Package packageR = CoordinatorLayout.class.getPackage();
        if (packageR != null) {
            str = packageR.getName();
        } else {
            str = null;
        }
        A0K = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CoordinatorLayout(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r4 = r17
            r5 = r18
            r7 = r19
            r2 = r20
            r4.<init>(r5, r7, r2)
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r4.A0E = r0
            X.0Nb r0 = new X.0Nb
            r0.<init>()
            r4.A0C = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r4.A0G = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r4.A0F = r0
            r1 = 2
            int[] r0 = new int[r1]
            r4.A0H = r0
            int[] r0 = new int[r1]
            r4.A0I = r0
            X.0L7 r0 = new X.0L7
            r0.<init>()
            r4.A0D = r0
            r9 = 0
            int[] r6 = X.C03350Ju.A00
            if (r20 != 0) goto L_0x007f
            r0 = 2132084625(0x7f150791, float:1.9809426E38)
            android.content.res.TypedArray r8 = r5.obtainStyledAttributes(r7, r6, r9, r0)
        L_0x0040:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x004e
            if (r20 != 0) goto L_0x0073
            r10 = 2132084625(0x7f150791, float:1.9809426E38)
            r4.saveAttributeDataForStyleable(r5, r6, r7, r8, r9, r10)
        L_0x004e:
            int r0 = r8.getResourceId(r9, r9)
            if (r0 == 0) goto L_0x0084
            android.content.res.Resources r1 = r5.getResources()
            int[] r0 = r1.getIntArray(r0)
            r4.A0B = r0
            android.util.DisplayMetrics r0 = r1.getDisplayMetrics()
            float r3 = r0.density
            int[] r2 = r4.A0B
            int r1 = r2.length
        L_0x0067:
            if (r9 >= r1) goto L_0x0084
            r0 = r2[r9]
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            r2[r9] = r0
            int r9 = r9 + 1
            goto L_0x0067
        L_0x0073:
            r10 = r4
            r11 = r5
            r12 = r6
            r13 = r7
            r14 = r8
            r15 = r2
            r16 = r9
            r10.saveAttributeDataForStyleable(r11, r12, r13, r14, r15, r16)
            goto L_0x004e
        L_0x007f:
            android.content.res.TypedArray r8 = r5.obtainStyledAttributes(r7, r6, r2, r9)
            goto L_0x0040
        L_0x0084:
            r0 = 1
            android.graphics.drawable.Drawable r0 = r8.getDrawable(r0)
            r4.A00 = r0
            r8.recycle()
            r4.A07()
            X.0aU r0 = new X.0aU
            r0.<init>(r4)
            super.setOnHierarchyChangeListener(r0)
            int r0 = X.AnonymousClass0YY.A00(r4)
            if (r0 != 0) goto L_0x00a3
            r0 = 1
            X.AnonymousClass0YY.A06(r4, r0)
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static Rect A00() {
        Rect rect = (Rect) A0J.AwG();
        if (rect == null) {
            return AnonymousClass001.A0N();
        }
        return rect;
    }

    public static final void A03(Rect rect, Rect rect2, C002002f r11, int i, int i2, int i3) {
        int width;
        int height;
        int i4 = r11.A02;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = r11.A00;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i9 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public final int A04(int i) {
        StringBuilder A0o;
        int[] iArr = this.A0B;
        if (iArr == null) {
            A0o = AnonymousClass001.A0o();
            A0o.append("No keylines defined for ");
            A0o.append(this);
            A0o.append(" - attempted index lookup ");
            A0o.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            A0o = AnonymousClass001.A0o();
            A0o.append("Keyline index ");
            A0o.append(i);
            A0o.append(" out of range for ");
            A0o.append(this);
        }
        Log.e("CoordinatorLayout", A0o.toString());
        return 0;
    }

    public List A05(View view) {
        C06290Wz r5 = this.A0C.A00;
        int size = r5.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            AbstractCollection abstractCollection = (AbstractCollection) C06290Wz.A00(r5, i);
            if (abstractCollection != null && abstractCollection.contains(view)) {
                if (arrayList == null) {
                    arrayList = AnonymousClass001.A0s();
                }
                arrayList.add(r5.A02[i << 1]);
            }
        }
        List list = this.A0F;
        list.clear();
        if (arrayList != null) {
            list.addAll(arrayList);
        }
        return list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        r11 = X.AnonymousClass0YH.A01(r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06() {
        /*
            r12 = this;
            java.util.List r8 = r12.A0E
            r8.clear()
            X.0Nb r7 = r12.A0C
            X.0Wz r6 = r7.A00
            int r3 = r6.size()
            r2 = 0
        L_0x000e:
            if (r2 >= r3) goto L_0x0023
            java.lang.Object r1 = X.C06290Wz.A00(r6, r2)
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            if (r1 == 0) goto L_0x0020
            r1.clear()
            X.0tf r0 = r7.A01
            r0.Bio(r1)
        L_0x0020:
            int r2 = r2 + 1
            goto L_0x000e
        L_0x0023:
            r6.clear()
            int r9 = r12.getChildCount()
            r5 = 0
        L_0x002b:
            if (r5 >= r9) goto L_0x0155
            android.view.View r3 = r12.getChildAt(r5)
            X.02f r4 = A01(r3)
            int r1 = r4.A05
            r0 = -1
            if (r1 != r0) goto L_0x00b9
            r0 = 0
            r4.A08 = r0
            r4.A09 = r0
        L_0x003f:
            boolean r0 = r6.containsKey(r3)
            if (r0 != 0) goto L_0x0049
            r0 = 0
            r6.put(r3, r0)
        L_0x0049:
            r2 = 0
        L_0x004a:
            if (r2 >= r9) goto L_0x00b5
            if (r2 == r5) goto L_0x00a7
            android.view.View r1 = r12.getChildAt(r2)
            android.view.View r0 = r4.A08
            if (r1 == r0) goto L_0x006f
            int r11 = X.AnonymousClass0YH.A01(r12)
            X.02f r0 = X.AnonymousClass001.A0W(r1)
            int r0 = r0.A03
            int r10 = android.view.Gravity.getAbsoluteGravity(r0, r11)
            if (r10 == 0) goto L_0x00aa
            int r0 = r4.A01
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r11)
            r0 = r0 & r10
            if (r0 != r10) goto L_0x00aa
        L_0x006f:
            boolean r0 = r6.containsKey(r1)
            if (r0 != 0) goto L_0x007f
            boolean r0 = r6.containsKey(r1)
            if (r0 != 0) goto L_0x007f
            r0 = 0
            r6.put(r1, r0)
        L_0x007f:
            boolean r0 = r6.containsKey(r1)
            if (r0 == 0) goto L_0x014e
            boolean r0 = r6.containsKey(r3)
            if (r0 == 0) goto L_0x014e
            java.lang.Object r0 = r6.get(r1)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 != 0) goto L_0x00a4
            X.0tf r0 = r7.A01
            java.lang.Object r0 = r0.AwG()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 != 0) goto L_0x00a1
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
        L_0x00a1:
            r6.put(r1, r0)
        L_0x00a4:
            r0.add(r3)
        L_0x00a7:
            int r2 = r2 + 1
            goto L_0x004a
        L_0x00aa:
            X.0Ug r0 = r4.A0A
            if (r0 == 0) goto L_0x00a7
            boolean r0 = r0.A05(r3, r1, r12)
            if (r0 == 0) goto L_0x00a7
            goto L_0x006f
        L_0x00b5:
            int r5 = r5 + 1
            goto L_0x002b
        L_0x00b9:
            android.view.View r0 = r4.A09
            if (r0 == 0) goto L_0x00e6
            int r1 = r0.getId()
            int r0 = r4.A05
            if (r1 != r0) goto L_0x00e6
            android.view.View r2 = r4.A09
            android.view.ViewParent r1 = r2.getParent()
        L_0x00cb:
            if (r1 == r12) goto L_0x00dd
            if (r1 == 0) goto L_0x00e1
            if (r1 == r3) goto L_0x00e1
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x00d8
            r2 = r1
            android.view.View r2 = (android.view.View) r2
        L_0x00d8:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x00cb
        L_0x00dd:
            r4.A08 = r2
            goto L_0x003f
        L_0x00e1:
            r0 = 0
            r4.A08 = r0
            r4.A09 = r0
        L_0x00e6:
            int r11 = r4.A05
            android.view.View r10 = r12.findViewById(r11)
            r4.A09 = r10
            r2 = 0
            if (r10 == 0) goto L_0x0127
            if (r10 != r12) goto L_0x0100
            boolean r0 = r12.isInEditMode()
            if (r0 != 0) goto L_0x0148
            java.lang.String r0 = "View can not be anchored to the the parent CoordinatorLayout"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0100:
            android.view.ViewParent r1 = r10.getParent()
        L_0x0104:
            if (r1 == r12) goto L_0x0123
            if (r1 == 0) goto L_0x0123
            if (r1 != r3) goto L_0x0117
            boolean r0 = r12.isInEditMode()
            if (r0 != 0) goto L_0x0148
            java.lang.String r0 = "Anchor must not be a descendant of the anchored view"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0117:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x011e
            r10 = r1
            android.view.View r10 = (android.view.View) r10
        L_0x011e:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x0104
        L_0x0123:
            r4.A08 = r10
            goto L_0x003f
        L_0x0127:
            boolean r0 = r12.isInEditMode()
            if (r0 != 0) goto L_0x0148
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Could not find CoordinatorLayout descendant view with id "
            r1.append(r0)
            android.content.res.Resources r0 = r12.getResources()
            java.lang.String r0 = r0.getResourceName(r11)
            r1.append(r0)
            java.lang.String r0 = " to anchor view "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0H(r3, r0, r1)
            throw r0
        L_0x0148:
            r4.A08 = r2
            r4.A09 = r2
            goto L_0x003f
        L_0x014e:
            java.lang.String r0 = "All nodes must be present in the graph before being added as an edge"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0155:
            java.util.ArrayList r5 = r7.A02
            r5.clear()
            java.util.HashSet r4 = r7.A03
            r4.clear()
            int r3 = r6.size()
            r2 = 0
        L_0x0164:
            if (r2 >= r3) goto L_0x0172
            java.lang.Object[] r1 = r6.A02
            int r0 = r2 << 1
            r0 = r1[r0]
            r7.A00(r0, r5, r4)
            int r2 = r2 + 1
            goto L_0x0164
        L_0x0172:
            r8.addAll(r5)
            java.util.Collections.reverse(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.A06():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0277 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(int r28) {
        /*
            r27 = this;
            r9 = r27
            int r20 = X.AnonymousClass0YH.A01(r9)
            java.util.List r8 = r9.A0E
            int r19 = r8.size()
            android.graphics.Rect r7 = A00()
            android.graphics.Rect r6 = A00()
            android.graphics.Rect r5 = A00()
            r4 = 0
        L_0x0019:
            r0 = r19
            if (r4 >= r0) goto L_0x02a8
            java.lang.Object r3 = r8.get(r4)
            android.view.View r3 = (android.view.View) r3
            X.02f r12 = X.AnonymousClass001.A0W(r3)
            r10 = r28
            if (r28 != 0) goto L_0x0036
            int r1 = r3.getVisibility()
            r0 = 8
            if (r1 != r0) goto L_0x0036
        L_0x0033:
            int r4 = r4 + 1
            goto L_0x0019
        L_0x0036:
            r13 = 0
        L_0x0037:
            if (r13 >= r4) goto L_0x00c9
            java.lang.Object r1 = r8.get(r13)
            android.view.View r0 = r12.A08
            if (r0 != r1) goto L_0x00c1
            X.02f r11 = X.AnonymousClass001.A0W(r3)
            android.view.View r0 = r11.A09
            if (r0 == 0) goto L_0x00c1
            android.graphics.Rect r18 = A00()
            android.graphics.Rect r2 = A00()
            android.graphics.Rect r1 = A00()
            android.view.View r14 = r11.A09
            r0 = r18
            X.AnonymousClass0VR.A01(r0, r14, r9)
            r17 = 0
            boolean r0 = r3.isLayoutRequested()
            if (r0 != 0) goto L_0x00c5
            int r14 = r3.getVisibility()
            r0 = 8
            if (r14 == r0) goto L_0x00c5
            X.AnonymousClass000.A0x(r3, r2)
        L_0x006f:
            int r16 = r3.getMeasuredWidth()
            int r15 = r3.getMeasuredHeight()
            r22 = r1
            r23 = r11
            r24 = r20
            r25 = r16
            r26 = r15
            r21 = r18
            A03(r21, r22, r23, r24, r25, r26)
            int r14 = r1.left
            int r0 = r2.left
            if (r14 != r0) goto L_0x0092
            int r14 = r1.top
            int r0 = r2.top
            if (r14 == r0) goto L_0x0094
        L_0x0092:
            r17 = 1
        L_0x0094:
            r14 = r16
            r9.A09(r1, r11, r14, r15)
            int r15 = r1.left
            int r0 = r2.left
            int r15 = r15 - r0
            int r14 = r1.top
            int r0 = r2.top
            int r14 = r14 - r0
            if (r15 == 0) goto L_0x00a8
            X.C06560Yg.A0I(r3, r15)
        L_0x00a8:
            if (r14 == 0) goto L_0x00ad
            X.C06560Yg.A0J(r3, r14)
        L_0x00ad:
            if (r17 == 0) goto L_0x00b8
            X.0Ug r14 = r11.A0A
            if (r14 == 0) goto L_0x00b8
            android.view.View r0 = r11.A09
            r14.A06(r3, r0, r9)
        L_0x00b8:
            A02(r18)
            A02(r2)
            A02(r1)
        L_0x00c1:
            int r13 = r13 + 1
            goto L_0x0037
        L_0x00c5:
            r2.setEmpty()
            goto L_0x006f
        L_0x00c9:
            r1 = 1
            boolean r0 = r3.isLayoutRequested()
            if (r0 != 0) goto L_0x018b
            int r2 = r3.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x018b
            X.AnonymousClass0VR.A01(r6, r3, r9)
        L_0x00db:
            int r0 = r12.A03
            if (r0 == 0) goto L_0x011b
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x011b
            int r2 = r12.A03
            r0 = r20
            int r13 = android.view.Gravity.getAbsoluteGravity(r2, r0)
            r2 = r13 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r2 == r0) goto L_0x017f
            r0 = 80
            if (r2 != r0) goto L_0x0105
            int r11 = r7.bottom
            int r2 = r9.getHeight()
            int r0 = r6.top
            int r0 = X.AnonymousClass001.A0C(r2, r0, r11)
            r7.bottom = r0
        L_0x0105:
            r2 = r13 & 7
            r0 = 3
            if (r2 == r0) goto L_0x0174
            r0 = 5
            if (r2 != r0) goto L_0x011b
            int r11 = r7.right
            int r2 = r9.getWidth()
            int r0 = r6.left
            int r0 = X.AnonymousClass001.A0C(r2, r0, r11)
            r7.right = r0
        L_0x011b:
            int r0 = r12.A01
            if (r0 == 0) goto L_0x0239
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x0239
            boolean r0 = X.C06360Xi.A05(r3)
            if (r0 == 0) goto L_0x0239
            int r0 = r3.getWidth()
            if (r0 <= 0) goto L_0x0239
            int r0 = r3.getHeight()
            if (r0 <= 0) goto L_0x0239
            X.02f r11 = X.AnonymousClass001.A0W(r3)
            X.0Ug r0 = r11.A0A
            android.graphics.Rect r2 = A00()
            android.graphics.Rect r12 = A00()
            X.AnonymousClass000.A0x(r3, r12)
            if (r0 == 0) goto L_0x0190
            boolean r0 = r0.A03(r2, r3, r9)
            if (r0 == 0) goto L_0x0190
            boolean r0 = r12.contains(r2)
            if (r0 != 0) goto L_0x0193
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Rect should be within the child's bounds. Rect:"
            r1.append(r0)
            java.lang.String r0 = r2.toShortString()
            r1.append(r0)
            java.lang.String r0 = " | Bounds:"
            r1.append(r0)
            java.lang.String r0 = r12.toShortString()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)
            throw r0
        L_0x0174:
            int r2 = r7.left
            int r0 = r6.right
            int r0 = java.lang.Math.max(r2, r0)
            r7.left = r0
            goto L_0x011b
        L_0x017f:
            int r2 = r7.top
            int r0 = r6.bottom
            int r0 = java.lang.Math.max(r2, r0)
            r7.top = r0
            goto L_0x0105
        L_0x018b:
            r6.setEmpty()
            goto L_0x00db
        L_0x0190:
            r2.set(r12)
        L_0x0193:
            A02(r12)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0236
            int r12 = r11.A01
            r0 = r20
            int r15 = android.view.Gravity.getAbsoluteGravity(r12, r0)
            r12 = r15 & 48
            r0 = 48
            if (r12 != r0) goto L_0x02a5
            int r12 = r2.top
            int r0 = r11.topMargin
            int r12 = r12 - r0
            int r0 = r11.A07
            int r12 = r12 - r0
            int r13 = r7.top
            if (r12 >= r13) goto L_0x02a5
            int r13 = r13 - r12
            X.02f r12 = X.AnonymousClass001.A0W(r3)
            int r0 = r12.A07
            if (r0 == r13) goto L_0x01c6
            int r0 = r13 - r0
            X.C06560Yg.A0J(r3, r0)
            r12.A07 = r13
        L_0x01c6:
            r14 = 1
        L_0x01c7:
            r12 = r15 & 80
            r0 = 80
            if (r12 != r0) goto L_0x0297
            int r13 = r9.getHeight()
            int r0 = r2.bottom
            int r13 = r13 - r0
            int r0 = r11.bottomMargin
            int r13 = r13 - r0
            int r0 = r11.A07
            int r13 = r13 + r0
            int r0 = r7.bottom
            if (r13 >= r0) goto L_0x0297
            int r13 = r13 - r0
            X.02f r12 = X.AnonymousClass001.A0W(r3)
            int r0 = r12.A07
            if (r0 == r13) goto L_0x01ee
            int r0 = r13 - r0
        L_0x01e9:
            X.C06560Yg.A0J(r3, r0)
            r12.A07 = r13
        L_0x01ee:
            r12 = r15 & 3
            r0 = 3
            if (r12 != r0) goto L_0x0294
            int r12 = r2.left
            int r0 = r11.leftMargin
            int r12 = r12 - r0
            int r0 = r11.A06
            int r12 = r12 - r0
            int r13 = r7.left
            if (r12 >= r13) goto L_0x0294
            int r13 = r13 - r12
            X.02f r12 = X.AnonymousClass001.A0W(r3)
            int r0 = r12.A06
            if (r0 == r13) goto L_0x020f
            int r0 = r13 - r0
            X.C06560Yg.A0I(r3, r0)
            r12.A06 = r13
        L_0x020f:
            r13 = 1
        L_0x0210:
            r12 = 5
            r0 = r15 & 5
            if (r0 != r12) goto L_0x0287
            int r12 = r9.getWidth()
            int r0 = r2.right
            int r12 = r12 - r0
            int r0 = r11.rightMargin
            int r12 = r12 - r0
            int r0 = r11.A06
            int r12 = r12 + r0
            int r0 = r7.right
            if (r12 >= r0) goto L_0x0287
            int r12 = r12 - r0
            X.02f r11 = X.AnonymousClass001.A0W(r3)
            int r0 = r11.A06
            if (r0 == r12) goto L_0x0236
            int r0 = r12 - r0
        L_0x0231:
            X.C06560Yg.A0I(r3, r0)
            r11.A06 = r12
        L_0x0236:
            A02(r2)
        L_0x0239:
            r12 = 2
            if (r10 == r12) goto L_0x0254
            X.02f r0 = X.AnonymousClass001.A0W(r3)
            android.graphics.Rect r0 = r0.A0F
            r5.set(r0)
            boolean r0 = r5.equals(r6)
            if (r0 != 0) goto L_0x0033
            X.02f r0 = X.AnonymousClass001.A0W(r3)
            android.graphics.Rect r0 = r0.A0F
            r0.set(r6)
        L_0x0254:
            int r11 = r4 + 1
        L_0x0256:
            r0 = r19
            if (r11 >= r0) goto L_0x0033
            java.lang.Object r14 = r8.get(r11)
            android.view.View r14 = (android.view.View) r14
            X.02f r13 = X.AnonymousClass001.A0W(r14)
            X.0Ug r2 = r13.A0A
            if (r2 == 0) goto L_0x0277
            boolean r0 = r2.A05(r14, r3, r9)
            if (r0 == 0) goto L_0x0277
            if (r28 != 0) goto L_0x027a
            boolean r0 = r13.A0E
            if (r0 == 0) goto L_0x0280
            r0 = 0
        L_0x0275:
            r13.A0E = r0
        L_0x0277:
            int r11 = r11 + 1
            goto L_0x0256
        L_0x027a:
            if (r10 != r12) goto L_0x0280
            r2.A02(r14, r3, r9)
            goto L_0x0277
        L_0x0280:
            boolean r0 = r2.A06(r14, r3, r9)
            if (r10 != r1) goto L_0x0277
            goto L_0x0275
        L_0x0287:
            if (r13 != 0) goto L_0x0236
            r12 = 0
            X.02f r11 = X.AnonymousClass001.A0W(r3)
            int r0 = r11.A06
            if (r0 == r12) goto L_0x0236
            int r0 = -r0
            goto L_0x0231
        L_0x0294:
            r13 = 0
            goto L_0x0210
        L_0x0297:
            if (r14 != 0) goto L_0x01ee
            r13 = 0
            X.02f r12 = X.AnonymousClass001.A0W(r3)
            int r0 = r12.A07
            if (r0 == r13) goto L_0x01ee
            int r0 = -r0
            goto L_0x01e9
        L_0x02a5:
            r14 = 0
            goto L_0x01c7
        L_0x02a8:
            A02(r7)
            A02(r6)
            A02(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.A08(int):void");
    }

    public void A0A(View view) {
        List list = (List) this.A0C.A00.get(view);
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                C05630Ug r0 = AnonymousClass001.A0W(view2).A0A;
                if (r0 != null) {
                    r0.A06(view2, view, this);
                }
            }
        }
    }

    public final boolean A0E(MotionEvent motionEvent, int i) {
        int i2;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent2.getActionMasked();
        List list = this.A0G;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i3);
            } else {
                i2 = i3;
            }
            list.add(getChildAt(i2));
        }
        Collections.sort(list, A0M);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            C05630Ug r0 = AnonymousClass001.A0W(view).A0A;
            if (!z) {
                if (r0 != null) {
                    if (i != 0) {
                        z = r0.A0F(motionEvent2, view, this);
                    } else {
                        z = r0.A0E(motionEvent2, view, this);
                    }
                    if (z) {
                        this.A01 = view;
                    }
                }
            } else if (!(actionMasked == 0 || r0 == null)) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i != 0) {
                    r0.A0F(motionEvent3, view, this);
                } else {
                    r0.A0E(motionEvent3, view, this);
                }
            }
        }
        list.clear();
        return z;
    }

    public void BWu(View view, int[] iArr, int i, int i2, int i3) {
        boolean z;
        C05630Ug r9;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C002002f A0W = AnonymousClass001.A0W(childAt);
                int i7 = i3;
                if (i3 != 0) {
                    z = A0W.A0C;
                } else {
                    z = A0W.A0D;
                }
                if (z && (r9 = A0W.A0A) != null) {
                    int[] iArr2 = this.A0H;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    r9.A0B(childAt, view, this, iArr2, i, i2, i7);
                    int i8 = iArr2[0];
                    if (i > 0) {
                        i4 = Math.max(i4, i8);
                    } else {
                        i4 = Math.min(i4, i8);
                    }
                    int i9 = iArr2[1];
                    if (i2 > 0) {
                        i5 = Math.max(i5, i9);
                    } else {
                        i5 = Math.min(i5, i9);
                    }
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            A08(1);
        }
    }

    public void BWw(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        C05630Ug r9;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C002002f A0W = AnonymousClass001.A0W(childAt);
                int i9 = i5;
                if (i5 != 0) {
                    z = A0W.A0C;
                } else {
                    z = A0W.A0D;
                }
                if (z && (r9 = A0W.A0A) != null) {
                    int[] iArr2 = this.A0H;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    r9.A0C(childAt, view, this, iArr2, i, i2, i3, i4, i9);
                    int i10 = iArr2[0];
                    if (i3 > 0) {
                        i6 = Math.max(i6, i10);
                    } else {
                        i6 = Math.min(i6, i10);
                    }
                    int i11 = iArr2[1];
                    if (i4 > 0) {
                        i7 = Math.max(i7, i11);
                    } else {
                        i7 = Math.min(i7, i11);
                    }
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z2) {
            A08(1);
        }
    }

    public void BWx(View view, View view2, int i, int i2) {
        AnonymousClass0L7 r1 = this.A0D;
        if (i2 == 1) {
            r1.A00 = i;
        } else {
            r1.A01 = i;
        }
        this.A02 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getLayoutParams();
        }
    }

    public void Bcp(View view, int i) {
        boolean z;
        AnonymousClass0L7 r1 = this.A0D;
        if (i == 1) {
            r1.A00 = 0;
        } else {
            r1.A01 = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C002002f A0W = AnonymousClass001.A0W(childAt);
            if (i != 0) {
                z = A0W.A0C;
            } else {
                z = A0W.A0D;
            }
            if (z) {
                C05630Ug r0 = A0W.A0A;
                if (r0 != null) {
                    r0.A0A(childAt, view, this, i);
                }
                if (i != 0) {
                    A0W.A0C = false;
                } else {
                    A0W.A0D = false;
                }
                A0W.A0E = false;
            }
        }
        this.A02 = null;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C002002f) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C002002f) {
            return new C002002f((C002002f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C002002f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C002002f(layoutParams);
    }

    public final AnonymousClass0XY getLastWindowInsets() {
        return this.A06;
    }

    public int getNestedScrollAxes() {
        AnonymousClass0L7 r0 = this.A0D;
        return r0.A01 | r0.A00;
    }

    public Drawable getStatusBarBackground() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008f, code lost:
        if (X.AnonymousClass0YY.A0B(r14) == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c9, code lost:
        if (r20 != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0149, code lost:
        if (r20 != false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014b, code lost:
        r3 = java.lang.Math.max(0, (r19 - r21) - r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r34, int r35) {
        /*
            r33 = this;
            r14 = r33
            r14.A06()
            int r7 = r14.getChildCount()
            r6 = 0
            r5 = 0
        L_0x000b:
            if (r5 >= r7) goto L_0x002b
            android.view.View r4 = r14.getChildAt(r5)
            X.0Nb r0 = r14.A0C
            X.0Wz r3 = r0.A00
            int r2 = r3.size()
            r1 = 0
        L_0x001a:
            if (r1 >= r2) goto L_0x0179
            java.lang.Object r0 = X.C06290Wz.A00(r3, r1)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 == 0) goto L_0x0175
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x0175
            r6 = 1
        L_0x002b:
            boolean r0 = r14.A0A
            if (r6 == r0) goto L_0x004c
            boolean r0 = r14.A09
            if (r6 == 0) goto L_0x0163
            if (r0 == 0) goto L_0x0049
            X.0aZ r0 = r14.A04
            if (r0 != 0) goto L_0x0040
            X.0aZ r0 = new X.0aZ
            r0.<init>(r14)
            r14.A04 = r0
        L_0x0040:
            android.view.ViewTreeObserver r1 = r14.getViewTreeObserver()
            X.0aZ r0 = r14.A04
            r1.addOnPreDrawListener(r0)
        L_0x0049:
            r0 = 1
        L_0x004a:
            r14.A0A = r0
        L_0x004c:
            int r23 = r14.getPaddingLeft()
            int r22 = r14.getPaddingTop()
            int r21 = r14.getPaddingRight()
            int r1 = r14.getPaddingBottom()
            int r13 = X.AnonymousClass0YH.A01(r14)
            r0 = 1
            boolean r20 = X.AnonymousClass000.A1U(r13, r0)
            r32 = r34
            int r12 = android.view.View.MeasureSpec.getMode(r32)
            int r19 = android.view.View.MeasureSpec.getSize(r32)
            r31 = r35
            int r15 = android.view.View.MeasureSpec.getMode(r31)
            int r18 = android.view.View.MeasureSpec.getSize(r31)
            int r17 = r23 + r21
            int r22 = r22 + r1
            int r11 = r14.getSuggestedMinimumWidth()
            int r10 = r14.getSuggestedMinimumHeight()
            X.0XY r0 = r14.A06
            if (r0 == 0) goto L_0x0091
            boolean r0 = X.AnonymousClass0YY.A0B(r14)
            r16 = 1
            if (r0 != 0) goto L_0x0093
        L_0x0091:
            r16 = 0
        L_0x0093:
            java.util.List r9 = r14.A0E
            int r8 = r9.size()
            r7 = 0
            r6 = 0
        L_0x009b:
            if (r6 >= r8) goto L_0x017d
            java.lang.Object r5 = r9.get(r6)
            android.view.View r5 = (android.view.View) r5
            int r1 = r5.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x013d
            X.02f r4 = X.AnonymousClass001.A0W(r5)
            int r0 = r4.A04
            if (r0 < 0) goto L_0x0159
            if (r12 == 0) goto L_0x0159
            int r2 = r14.A04(r0)
            int r0 = r4.A02
            if (r0 != 0) goto L_0x00c0
            r0 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00c0:
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r13)
            r1 = r0 & 7
            r0 = 3
            if (r1 != r0) goto L_0x0146
            if (r20 == 0) goto L_0x014b
        L_0x00cb:
            int r2 = r2 - r23
            r0 = 0
            int r3 = java.lang.Math.max(r0, r2)
        L_0x00d2:
            if (r16 == 0) goto L_0x0141
            boolean r0 = X.AnonymousClass0YY.A0B(r5)
            if (r0 != 0) goto L_0x0141
            X.0XY r0 = r14.A06
            int r2 = r0.A03()
            X.0XY r0 = r14.A06
            int r0 = r0.A04()
            int r2 = r2 + r0
            X.0XY r0 = r14.A06
            int r1 = r0.A05()
            X.0XY r0 = r14.A06
            int r0 = r0.A02()
            int r1 = r1 + r0
            int r0 = r19 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r12)
            int r0 = r18 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r15)
        L_0x0100:
            X.0Ug r0 = r4.A0A
            if (r0 == 0) goto L_0x0118
            r30 = 0
            r24 = r0
            r25 = r5
            r26 = r14
            r27 = r2
            r28 = r3
            r29 = r1
            boolean r0 = r24.A0J(r25, r26, r27, r28, r29, r30)
            if (r0 != 0) goto L_0x011b
        L_0x0118:
            r14.A0C(r5, r2, r3, r1)
        L_0x011b:
            int r0 = r5.getMeasuredWidth()
            int r1 = r17 + r0
            int r0 = r4.leftMargin
            int r1 = r1 + r0
            int r0 = r4.rightMargin
            int r11 = X.AnonymousClass001.A0B(r1, r0, r11)
            int r0 = r5.getMeasuredHeight()
            int r1 = r22 + r0
            int r0 = r4.topMargin
            int r1 = r1 + r0
            int r0 = r4.bottomMargin
            int r10 = X.AnonymousClass001.A0B(r1, r0, r10)
            int r7 = X.AnonymousClass000.A04(r5, r7)
        L_0x013d:
            int r6 = r6 + 1
            goto L_0x009b
        L_0x0141:
            r2 = r32
            r1 = r31
            goto L_0x0100
        L_0x0146:
            r0 = 5
            if (r1 != r0) goto L_0x0155
            if (r20 == 0) goto L_0x00cb
        L_0x014b:
            int r1 = r19 - r21
            int r1 = r1 - r2
            r0 = 0
            int r3 = java.lang.Math.max(r0, r1)
            goto L_0x00d2
        L_0x0155:
            if (r1 != r0) goto L_0x015c
            if (r20 == 0) goto L_0x00cb
        L_0x0159:
            r3 = 0
            goto L_0x00d2
        L_0x015c:
            r0 = 3
            if (r1 != r0) goto L_0x0159
            if (r20 == 0) goto L_0x0159
            goto L_0x00cb
        L_0x0163:
            if (r0 == 0) goto L_0x0172
            X.0aZ r0 = r14.A04
            if (r0 == 0) goto L_0x0172
            android.view.ViewTreeObserver r1 = r14.getViewTreeObserver()
            X.0aZ r0 = r14.A04
            r1.removeOnPreDrawListener(r0)
        L_0x0172:
            r0 = 0
            goto L_0x004a
        L_0x0175:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x0179:
            int r5 = r5 + 1
            goto L_0x000b
        L_0x017d:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r7
            r0 = r32
            int r2 = android.view.View.resolveSizeAndState(r11, r0, r1)
            int r1 = r7 << 16
            r0 = r31
            int r0 = android.view.View.resolveSizeAndState(r10, r0, r1)
            r14.setMeasuredDimension(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C008707a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C008707a r8 = (C008707a) parcelable;
        super.onRestoreInstanceState(r8.A00);
        SparseArray sparseArray = r8.A00;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C05630Ug r1 = A01(childAt).A0A;
            if (!(id == -1 || r1 == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                r1.A09(parcelable2, childAt, this);
            }
        }
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.A00;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A00 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    AnonymousClass001.A13(this.A00, this);
                }
                C06130Wj.A03(AnonymousClass0YH.A01(this), this.A00);
                this.A00.setVisible(AnonymousClass000.A1T(getVisibility()), false);
                this.A00.setCallback(this);
            }
            AnonymousClass0YY.A05(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass0RP.A00(getContext(), i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public static C002002f A01(View view) {
        C002002f A0W = AnonymousClass001.A0W(view);
        if (!A0W.A0B) {
            if (view instanceof C15720rp) {
                A0W.A01(((C15720rp) view).getBehavior());
            } else {
                Class cls = view.getClass();
                while (true) {
                    if (cls == null) {
                        break;
                    }
                    DefaultBehavior defaultBehavior = (DefaultBehavior) cls.getAnnotation(DefaultBehavior.class);
                    if (defaultBehavior == null) {
                        cls = cls.getSuperclass();
                    } else {
                        try {
                            A0W.A01((C05630Ug) AnonymousClass001.A0h(defaultBehavior.value()));
                            break;
                        } catch (Exception e) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("Default behavior class ");
                            A0o.append(defaultBehavior.value().getName());
                            Log.e("CoordinatorLayout", AnonymousClass000.A0X(" could not be instantiated. Did you forget a default constructor?", A0o), e);
                        }
                    }
                }
            }
            A0W.A0B = true;
        }
        return A0W;
    }

    public static void A02(Rect rect) {
        rect.setEmpty();
        A0J.Bio(rect);
    }

    public final void A07() {
        if (AnonymousClass0YY.A0B(this)) {
            C15830s0 r1 = this.A05;
            if (r1 == null) {
                r1 = new C18140wo(this, 1);
                this.A05 = r1;
            }
            AnonymousClass0YZ.A0E(this, r1);
            setSystemUiVisibility(1280);
            return;
        }
        AnonymousClass0YZ.A0E(this, (C15830s0) null);
    }

    public final void A09(Rect rect, C002002f r7, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int A0D2 = AnonymousClass001.A0D(rect.left, ((width - getPaddingRight()) - i) - r7.rightMargin, getPaddingLeft() + r7.leftMargin);
        int A0D3 = AnonymousClass001.A0D(rect.top, ((height - getPaddingBottom()) - i2) - r7.bottomMargin, getPaddingTop() + r7.topMargin);
        rect.set(A0D2, A0D3, i + A0D2, i2 + A0D3);
    }

    public void A0B(View view, int i) {
        C002002f A0W = AnonymousClass001.A0W(view);
        View view2 = A0W.A09;
        int i2 = i;
        if (view2 != null) {
            Rect A002 = A00();
            Rect A003 = A00();
            try {
                AnonymousClass0VR.A01(A002, view2, this);
                C002002f A0W2 = AnonymousClass001.A0W(view);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                A03(A002, A003, A0W2, i2, measuredWidth, measuredHeight);
                A09(A003, A0W2, measuredWidth, measuredHeight);
                view.layout(A003.left, A003.top, A003.right, A003.bottom);
            } finally {
                A02(A002);
                A02(A003);
            }
        } else if (A0W.A05 != -1) {
            throw AnonymousClass001.A0e("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else {
            int i3 = A0W.A04;
            if (i3 >= 0) {
                C002002f A0W3 = AnonymousClass001.A0W(view);
                int i4 = A0W3.A02;
                if (i4 == 0) {
                    i4 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
                int i5 = absoluteGravity & 7;
                int i6 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i3 = width - i3;
                }
                int A042 = A04(i3) - measuredWidth2;
                if (i5 == 1) {
                    A042 += measuredWidth2 / 2;
                } else if (i5 == 5) {
                    A042 += measuredWidth2;
                }
                int i7 = 0;
                if (i6 == 16) {
                    i7 = 0 + (measuredHeight2 / 2);
                } else if (i6 == 80) {
                    i7 = measuredHeight2;
                }
                int A0D2 = AnonymousClass001.A0D(A042, ((width - getPaddingRight()) - measuredWidth2) - A0W3.rightMargin, getPaddingLeft() + A0W3.leftMargin);
                int A0D3 = AnonymousClass001.A0D(i7, ((height - getPaddingBottom()) - measuredHeight2) - A0W3.bottomMargin, getPaddingTop() + A0W3.topMargin);
                view.layout(A0D2, A0D3, measuredWidth2 + A0D2, measuredHeight2 + A0D3);
                return;
            }
            C002002f A0W4 = AnonymousClass001.A0W(view);
            Rect A004 = A00();
            A004.set(getPaddingLeft() + A0W4.leftMargin, getPaddingTop() + A0W4.topMargin, AnonymousClass001.A0I(this) - A0W4.rightMargin, AnonymousClass001.A0H(this) - A0W4.bottomMargin);
            if (this.A06 != null && AnonymousClass0YY.A0B(this) && !AnonymousClass0YY.A0B(view)) {
                A004.left += this.A06.A03();
                A004.top += this.A06.A05();
                A004.right -= this.A06.A04();
                A004.bottom -= this.A06.A02();
            }
            Rect A005 = A00();
            int i8 = A0W4.A02;
            if ((i8 & 7) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            AnonymousClass0I2.A00(i8, view.getMeasuredWidth(), view.getMeasuredHeight(), A004, A005, i2);
            view.layout(A005.left, A005.top, A005.right, A005.bottom);
            A02(A004);
            A02(A005);
        }
    }

    public final void A0D(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C05630Ug r1 = AnonymousClass001.A0W(childAt).A0A;
            if (r1 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    r1.A0E(obtain, childAt, this);
                } else {
                    r1.A0F(obtain, childAt, this);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).getLayoutParams();
        }
        this.A01 = null;
        this.A07 = false;
    }

    public boolean A0F(View view, int i, int i2) {
        Rect A002 = A00();
        AnonymousClass0VR.A01(A002, view, this);
        try {
            return A002.contains(i, i2);
        } finally {
            A02(A002);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A00;
        if (drawable != null && drawable.isStateful() && (false || drawable.setState(drawableState))) {
            invalidate();
        }
    }

    public final List getDependencySortedChildren() {
        A06();
        return Collections.unmodifiableList(this.A0E);
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), AnonymousClass000.A03(this));
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), AnonymousClass000.A02(this));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A0D(false);
        if (this.A0A) {
            if (this.A04 == null) {
                this.A04 = new C07250aZ(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.A04);
        }
        if (this.A06 == null && AnonymousClass0YY.A0B(this)) {
            AnonymousClass0V0.A02(this);
        }
        this.A09 = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A0D(false);
        if (this.A0A && this.A04 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.A04);
        }
        View view = this.A02;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.A09 = false;
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass0XY r0;
        int A052;
        super.onDraw(canvas);
        if (this.A08 && this.A00 != null && (r0 = this.A06) != null && (A052 = r0.A05()) > 0) {
            this.A00.setBounds(0, 0, getWidth(), A052);
            this.A00.draw(canvas);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            A0D(true);
        }
        boolean A0E2 = A0E(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            A0D(true);
        }
        return A0E2;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C05630Ug r0;
        int A012 = AnonymousClass0YH.A01(this);
        List list = this.A0E;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) list.get(i5);
            if (view.getVisibility() != 8 && ((r0 = AnonymousClass001.A0W(view).A0A) == null || !r0.A0I(view, this, A012))) {
                A0B(view, A012);
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
        return false;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable A072;
        C008707a r7 = new C008707a(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C05630Ug r1 = AnonymousClass001.A0W(childAt).A0A;
            if (!(id == -1 || r1 == null || (A072 = r1.A07(childAt, this)) == null)) {
                sparseArray.append(id, A072);
            }
        }
        r7.A00 = sparseArray;
        return r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r4 != false) goto L_0x0010;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r2 = r13.getActionMasked()
            android.view.View r0 = r12.A01
            r3 = 1
            r11 = 0
            if (r0 != 0) goto L_0x004b
            boolean r4 = r12.A0E(r13, r3)
            if (r4 == 0) goto L_0x0049
        L_0x0010:
            android.view.View r0 = r12.A01
            X.02f r0 = X.AnonymousClass001.A0W(r0)
            X.0Ug r1 = r0.A0A
            if (r1 == 0) goto L_0x0049
            android.view.View r0 = r12.A01
            boolean r1 = r1.A0F(r13, r0, r12)
        L_0x0020:
            android.view.View r0 = r12.A01
            if (r0 != 0) goto L_0x0032
            boolean r0 = super.onTouchEvent(r13)
            r1 = r1 | r0
        L_0x0029:
            if (r2 == r3) goto L_0x002e
            r0 = 3
            if (r2 != r0) goto L_0x0031
        L_0x002e:
            r12.A0D(r11)
        L_0x0031:
            return r1
        L_0x0032:
            if (r4 == 0) goto L_0x0029
            long r4 = android.os.SystemClock.uptimeMillis()
            r8 = 3
            r9 = 0
            r6 = r4
            r10 = r9
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            super.onTouchEvent(r0)
            if (r0 == 0) goto L_0x0029
            r0.recycle()
            goto L_0x0029
        L_0x0049:
            r1 = 0
            goto L_0x0020
        L_0x004b:
            r4 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C05630Ug r0 = AnonymousClass001.A0W(view).A0A;
        if (r0 == null || !r0.A04(rect, view, this, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.A07) {
            A0D(false);
            this.A07 = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        A07();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean A1T = AnonymousClass000.A1T(i);
        Drawable drawable = this.A00;
        if (drawable != null && drawable.isVisible() != A1T) {
            this.A00.setVisible(A1T, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A00) {
            return true;
        }
        return false;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A03 = onHierarchyChangeListener;
    }

    public CoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C002002f(getContext(), attributeSet);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }
}
