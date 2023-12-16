package com.google.android.material.tabs;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass05z;
import X.AnonymousClass0KO;
import X.AnonymousClass0R4;
import X.AnonymousClass0VX;
import X.AnonymousClass0YG;
import X.AnonymousClass0YY;
import X.AnonymousClass4QR;
import X.AnonymousClass4Qc;
import X.AnonymousClass5T2;
import X.AnonymousClass5WN;
import X.AnonymousClass6ZM;
import X.AnonymousClass80V;
import X.AnonymousClass8C0;
import X.C05650Ui;
import X.C06360Xi;
import X.C110765h0;
import X.C124486Cn;
import X.C159337lf;
import X.C160927og;
import X.C16600tf;
import X.C183978qy;
import X.C187908y0;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;
import X.C86664Kz;
import X.C88714ad;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.R;
import com.whatsapp.WaTabLayout;
import com.whatsapp.WaViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ViewPager.DecorView
public class TabLayout extends HorizontalScrollView {
    public static final C16600tf A0l = new AnonymousClass05z(16);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public ValueAnimator A0I;
    public ColorStateList A0J;
    public ColorStateList A0K;
    public ColorStateList A0L;
    public DataSetObserver A0M;
    public Drawable A0N;
    public AnonymousClass0R4 A0O;
    public ViewPager A0P;
    public AnonymousClass5WN A0Q;
    public AnonymousClass80V A0R;
    public C183978qy A0S;
    public C183978qy A0T;
    public AnonymousClass5T2 A0U;
    public C110765h0 A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public final int A0a;
    public final int A0b;
    public final int A0c;
    public final int A0d;
    public final int A0e;
    public final int A0f;
    public final TimeInterpolator A0g;
    public final C16600tf A0h;
    public final AnonymousClass4QR A0i;
    public final ArrayList A0j;
    public final ArrayList A0k;

    public static ColorStateList A00(int i, int i2) {
        int[] iArr = new int[2];
        iArr[0] = i2;
        return C86664Kz.A0W(iArr, new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, i, 1);
    }

    private void A01(int i) {
        if (i != -1) {
            if (getWindowToken() != null && C06360Xi.A05(this)) {
                AnonymousClass4QR r5 = this.A0i;
                int childCount = r5.getChildCount();
                int i2 = 0;
                while (i2 < childCount) {
                    if (r5.getChildAt(i2).getWidth() > 0) {
                        i2++;
                    }
                }
                int scrollX = getScrollX();
                int A032 = A03(i, 0.0f);
                if (scrollX != A032) {
                    A09();
                    ValueAnimator valueAnimator = this.A0I;
                    int[] A1Z = C86664Kz.A1Z();
                    A1Z[0] = scrollX;
                    A1Z[1] = A032;
                    valueAnimator.setIntValues(A1Z);
                    this.A0I.start();
                }
                int i3 = this.A07;
                ValueAnimator valueAnimator2 = r5.A01;
                if (!(valueAnimator2 == null || !valueAnimator2.isRunning() || r5.A02.A03 == i)) {
                    r5.A01.cancel();
                }
                r5.A01(i, i3, true);
                return;
            }
            A0A(0.0f, i, true, true);
        }
    }

    public void A0A(float f, int i, boolean z, boolean z2) {
        int A032;
        int round = Math.round(((float) i) + f);
        if (round >= 0) {
            AnonymousClass4QR r3 = this.A0i;
            if (round < r3.getChildCount()) {
                if (z2) {
                    r3.A02.A03 = round;
                    ValueAnimator valueAnimator = r3.A01;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        r3.A01.cancel();
                    }
                    r3.A02(r3.getChildAt(i), r3.getChildAt(i + 1), f);
                }
                ValueAnimator valueAnimator2 = this.A0I;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.A0I.cancel();
                }
                if (i < 0) {
                    A032 = 0;
                } else {
                    A032 = A03(i, f);
                }
                scrollTo(A032, 0);
                if (z) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public final void A0C(ViewPager viewPager, boolean z) {
        List list;
        List list2;
        ViewPager viewPager2 = this.A0P;
        if (viewPager2 != null) {
            C110765h0 r1 = this.A0V;
            if (!(r1 == null || (list2 = viewPager2.A0c) == null)) {
                list2.remove(r1);
            }
            AnonymousClass80V r12 = this.A0R;
            if (!(r12 == null || (list = this.A0P.A0b) == null)) {
                list.remove(r12);
            }
        }
        C183978qy r2 = this.A0S;
        if (r2 != null) {
            this.A0j.remove(r2);
            this.A0S = null;
        }
        if (viewPager != null) {
            this.A0P = viewPager;
            C110765h0 r13 = this.A0V;
            if (r13 == null) {
                r13 = new C110765h0(this);
                this.A0V = r13;
            }
            r13.A01 = 0;
            r13.A00 = 0;
            viewPager.A0G(r13);
            AnonymousClass8C0 r14 = new AnonymousClass8C0(viewPager);
            this.A0S = r14;
            C86614Ku.A1T(r14, this.A0j);
            AnonymousClass0R4 adapter = viewPager.getAdapter();
            if (adapter != null) {
                A0B(adapter, true);
            }
            AnonymousClass80V r15 = this.A0R;
            if (r15 == null) {
                r15 = new AnonymousClass80V(this);
                this.A0R = r15;
            }
            r15.A00 = true;
            List list3 = viewPager.A0b;
            if (list3 == null) {
                list3 = AnonymousClass001.A0s();
                viewPager.A0b = list3;
            }
            list3.add(r15);
            A0A(0.0f, viewPager.getCurrentItem(), true, true);
        } else {
            this.A0P = null;
            A0B((AnonymousClass0R4) null, false);
        }
        this.A0X = z;
    }

    public void A0H(boolean z) {
        float f;
        int i = 0;
        while (true) {
            AnonymousClass4QR r1 = this.A0i;
            if (i < r1.getChildCount()) {
                View childAt = r1.getChildAt(i);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams A0U2 = AnonymousClass001.A0U(childAt);
                if (this.A04 == 1 && this.A06 == 0) {
                    A0U2.width = 0;
                    f = 1.0f;
                } else {
                    A0U2.width = -2;
                    f = 0.0f;
                }
                A0U2.weight = f;
                if (z) {
                    childAt.requestLayout();
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r5 = (X.AnonymousClass4Qc) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r6 = 0
        L_0x0001:
            X.4QR r1 = r7.A0i
            int r0 = r1.getChildCount()
            if (r6 >= r0) goto L_0x0032
            android.view.View r5 = r1.getChildAt(r6)
            boolean r0 = r5 instanceof X.AnonymousClass4Qc
            if (r0 == 0) goto L_0x002f
            X.4Qc r5 = (X.AnonymousClass4Qc) r5
            android.graphics.drawable.Drawable r4 = r5.A01
            if (r4 == 0) goto L_0x002f
            int r3 = r5.getLeft()
            int r2 = r5.getTop()
            int r1 = r5.getRight()
            int r0 = r5.getBottom()
            r4.setBounds(r3, r2, r1, r0)
            android.graphics.drawable.Drawable r0 = r5.A01
            r0.draw(r8)
        L_0x002f:
            int r6 = r6 + 1
            goto L_0x0001
        L_0x0032:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onDraw(android.graphics.Canvas):void");
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AnonymousClass0R4 r2) {
        A0B(r2, false);
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.A0k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i);
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.A0c;
        if (i != -1) {
            return i;
        }
        int i2 = this.A04;
        if (i2 == 0 || i2 == 2) {
            return this.A0d;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, AnonymousClass000.A06(this, this.A0i.getWidth() - getWidth()));
    }

    private void setSelectedTabView(int i) {
        AnonymousClass4QR r5 = this.A0i;
        int childCount = r5.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = r5.getChildAt(i2);
                boolean z = true;
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(AnonymousClass000.A1U(i2, i));
                    if (i2 != i) {
                        z = false;
                    }
                    childAt.setActivated(z);
                } else {
                    childAt.setSelected(AnonymousClass000.A1U(i2, i));
                    if (i2 != i) {
                        z = false;
                    }
                    childAt.setActivated(z);
                    if (childAt instanceof AnonymousClass4Qc) {
                        ((AnonymousClass4Qc) childAt).A03();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = r6.A0i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A03(int r7, float r8) {
        /*
            r6 = this;
            int r0 = r6.A04
            r5 = 0
            r4 = 2
            if (r0 == 0) goto L_0x0008
            if (r0 != r4) goto L_0x0045
        L_0x0008:
            X.4QR r3 = r6.A0i
            android.view.View r2 = r3.getChildAt(r7)
            if (r2 == 0) goto L_0x0045
            int r1 = r7 + 1
            int r0 = r3.getChildCount()
            if (r1 >= r0) goto L_0x0041
            android.view.View r0 = r3.getChildAt(r1)
        L_0x001c:
            int r1 = r2.getWidth()
            if (r0 == 0) goto L_0x0026
            int r5 = r0.getWidth()
        L_0x0026:
            int r2 = r2.getLeft()
            int r0 = r1 / 2
            int r2 = r2 + r0
            int r0 = X.C86664Kz.A0E(r6, r4)
            int r2 = r2 - r0
            int r1 = r1 + r5
            float r1 = (float) r1
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            float r1 = r1 * r8
            int r1 = (int) r1
            int r0 = X.AnonymousClass0YH.A01(r6)
            if (r0 != 0) goto L_0x0043
            int r2 = r2 + r1
            return r2
        L_0x0041:
            r0 = 0
            goto L_0x001c
        L_0x0043:
            int r2 = r2 - r1
            return r2
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.A03(int, float):int");
    }

    public AnonymousClass5T2 A04() {
        AnonymousClass4Qc r1;
        CharSequence charSequence;
        AnonymousClass5T2 r2 = (AnonymousClass5T2) A0l.AwG();
        if (r2 == null) {
            r2 = new AnonymousClass5T2();
        }
        r2.A03 = this;
        C16600tf r0 = this.A0h;
        if (r0 == null || (r1 = (AnonymousClass4Qc) r0.AwG()) == null) {
            r1 = new AnonymousClass4Qc(getContext(), this);
        }
        r1.setTab(r2);
        r1.setFocusable(true);
        r1.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(r2.A04)) {
            charSequence = r2.A05;
        } else {
            charSequence = r2.A04;
        }
        r1.setContentDescription(charSequence);
        r2.A02 = r1;
        return r2;
    }

    public AnonymousClass5T2 A05(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.A0k;
        if (i < arrayList.size()) {
            return (AnonymousClass5T2) arrayList.get(i);
        }
        return null;
    }

    public void A07() {
        AnonymousClass4QR r3 = this.A0i;
        int childCount = r3.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            AnonymousClass4Qc r1 = (AnonymousClass4Qc) r3.getChildAt(childCount);
            r3.removeViewAt(childCount);
            if (r1 != null) {
                r1.setTab((AnonymousClass5T2) null);
                r1.setSelected(false);
                this.A0h.Bio(r1);
            }
            requestLayout();
        }
        Iterator it = this.A0k.iterator();
        while (it.hasNext()) {
            AnonymousClass5T2 r2 = (AnonymousClass5T2) it.next();
            it.remove();
            r2.A03 = null;
            r2.A02 = null;
            r2.A06 = null;
            r2.A05 = null;
            r2.A04 = null;
            r2.A00 = -1;
            r2.A01 = null;
            A0l.Bio(r2);
        }
        this.A0U = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r1 != 2) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08() {
        /*
            r5 = this;
            int r0 = r5.A04
            r4 = 2
            r2 = 0
            if (r0 == 0) goto L_0x0042
            if (r0 == r4) goto L_0x0042
            r0 = 0
        L_0x0009:
            X.4QR r3 = r5.A0i
            X.AnonymousClass0YH.A07(r3, r0, r2, r2, r2)
            int r0 = r5.A04
            r2 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 == r2) goto L_0x001b
            if (r0 == r4) goto L_0x001b
        L_0x0017:
            r5.A0H(r2)
            return
        L_0x001b:
            int r0 = r5.A06
            if (r0 != r4) goto L_0x0026
            java.lang.String r1 = "TabLayout"
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r1, r0)
        L_0x0026:
            r3.setGravity(r2)
            goto L_0x0017
        L_0x002a:
            int r1 = r5.A06
            if (r1 == 0) goto L_0x0034
            r0 = 1
            if (r1 == r2) goto L_0x003e
            if (r1 == r4) goto L_0x003b
            goto L_0x0017
        L_0x0034:
            java.lang.String r1 = "TabLayout"
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r1, r0)
        L_0x003b:
            r0 = 8388611(0x800003, float:1.1754948E-38)
        L_0x003e:
            r3.setGravity(r0)
            goto L_0x0017
        L_0x0042:
            int r1 = r5.A02
            int r0 = r5.A0E
            int r0 = X.AnonymousClass001.A0C(r1, r0, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.A08():void");
    }

    public final void A09() {
        if (this.A0I == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.A0I = valueAnimator;
            valueAnimator.setInterpolator(this.A0g);
            this.A0I.setDuration((long) this.A07);
            C86604Kt.A0w(this.A0I, this, 7);
        }
    }

    public void A0B(AnonymousClass0R4 r3, boolean z) {
        DataSetObserver dataSetObserver;
        AnonymousClass0R4 r1 = this.A0O;
        if (!(r1 == null || (dataSetObserver = this.A0M) == null)) {
            r1.A07(dataSetObserver);
        }
        this.A0O = r3;
        if (z && r3 != null) {
            DataSetObserver dataSetObserver2 = this.A0M;
            if (dataSetObserver2 == null) {
                dataSetObserver2 = new C124486Cn(this);
                this.A0M = dataSetObserver2;
            }
            r3.A06(dataSetObserver2);
        }
        A06();
    }

    public void A0D(C187908y0 r3) {
        ArrayList arrayList = this.A0j;
        if (!arrayList.contains(r3)) {
            arrayList.add(r3);
        }
    }

    public void A0E(AnonymousClass5T2 r3) {
        ArrayList arrayList = this.A0k;
        A0F(r3, arrayList.size(), arrayList.isEmpty());
    }

    public void A0F(AnonymousClass5T2 r8, int i, boolean z) {
        float f;
        if (r8.A03 == this) {
            r8.A00 = i;
            ArrayList arrayList = this.A0k;
            arrayList.add(i, r8);
            int size = arrayList.size();
            int i2 = -1;
            for (int i3 = i + 1; i3 < size; i3++) {
                if (((AnonymousClass5T2) arrayList.get(i3)).A00 == this.A03) {
                    i2 = i3;
                }
                ((AnonymousClass5T2) arrayList.get(i3)).A00 = i3;
            }
            this.A03 = i2;
            AnonymousClass4Qc r6 = r8.A02;
            r6.setSelected(false);
            r6.setActivated(false);
            AnonymousClass4QR r5 = this.A0i;
            int i4 = r8.A00;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.A04 == 1 && this.A06 == 0) {
                layoutParams.width = 0;
                f = 1.0f;
            } else {
                layoutParams.width = -2;
                f = 0.0f;
            }
            layoutParams.weight = f;
            r5.addView(r6, i4, layoutParams);
            if (z) {
                r8.A00();
                return;
            }
            return;
        }
        throw AnonymousClass001.A0c("Tab belongs to a different TabLayout.");
    }

    public void A0G(AnonymousClass5T2 r6, boolean z) {
        int i;
        AnonymousClass5T2 r4 = this.A0U;
        if (r4 != r6) {
            if (r6 != null) {
                i = r6.A00;
            } else {
                i = -1;
            }
            if (z) {
                if ((r4 == null || r4.A00 == -1) && i != -1) {
                    A0A(0.0f, i, true, true);
                } else {
                    A01(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.A0U = r6;
            if (r4 != null && r4.A03 != null) {
                ArrayList arrayList = this.A0j;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    arrayList.get(size);
                }
            }
            if (r6 != null) {
                ArrayList arrayList2 = this.A0j;
                int size2 = arrayList2.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        ((C183978qy) arrayList2.get(size2)).Bdv(r6);
                    } else {
                        return;
                    }
                }
            }
        } else if (r4 != null) {
            ArrayList arrayList3 = this.A0j;
            int size3 = arrayList3.size();
            while (true) {
                size3--;
                if (size3 >= 0) {
                    ((C183978qy) arrayList3.get(size3)).Bdu(r6);
                } else {
                    A01(r6.A00);
                    return;
                }
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw AnonymousClass001.A0c("Only TabItem instances can be added to TabLayout");
    }

    public int getSelectedTabPosition() {
        AnonymousClass5T2 r0 = this.A0U;
        if (r0 != null) {
            return r0.A00;
        }
        return -1;
    }

    public int getTabCount() {
        return this.A0k.size();
    }

    public int getTabGravity() {
        return this.A06;
    }

    public ColorStateList getTabIconTint() {
        return this.A0J;
    }

    public int getTabIndicatorAnimationMode() {
        return this.A08;
    }

    public int getTabIndicatorGravity() {
        return this.A09;
    }

    public int getTabMaxWidth() {
        return this.A0B;
    }

    public int getTabMode() {
        return this.A04;
    }

    public ColorStateList getTabRippleColor() {
        return this.A0K;
    }

    public Drawable getTabSelectedIndicator() {
        return this.A0N;
    }

    public ColorStateList getTabTextColors() {
        return this.A0L;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = this.A04;
        if ((i == 0 || i == 2) && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setInlineLabel(boolean z) {
        if (this.A0W != z) {
            this.A0W = z;
            int i = 0;
            while (true) {
                AnonymousClass4QR r1 = this.A0i;
                if (i < r1.getChildCount()) {
                    View childAt = r1.getChildAt(i);
                    if (childAt instanceof AnonymousClass4Qc) {
                        AnonymousClass4Qc r4 = (AnonymousClass4Qc) childAt;
                        r4.setOrientation(r4.A0A.A0W ^ true ? 1 : 0);
                        TextView textView = r4.A06;
                        if (textView == null && r4.A04 == null) {
                            r4.A05(r4.A05, r4.A07, true);
                        } else {
                            r4.A05(r4.A04, textView, false);
                        }
                    }
                    i++;
                } else {
                    A08();
                    return;
                }
            }
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(C183978qy r3) {
        C183978qy r1 = this.A0T;
        if (r1 != null) {
            this.A0j.remove(r1);
        }
        this.A0T = r3;
        if (r3 != null) {
            C86614Ku.A1T(r3, this.A0j);
        }
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable A0G2 = C86634Kw.A0G(drawable);
        this.A0N = A0G2;
        A02(A0G2, this.A0G);
        int i = this.A0A;
        if (i == -1) {
            i = this.A0N.getIntrinsicHeight();
        }
        this.A0i.setSelectedIndicatorHeight(i);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.A0G = i;
        A02(this.A0N, i);
        A0H(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.A09 != i) {
            this.A09 = i;
            AnonymousClass0YY.A05(this.A0i);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.A0A = i;
        this.A0i.setSelectedIndicatorHeight(i);
    }

    public void setTabGravity(int i) {
        if (this.A06 != i) {
            this.A06 = i;
            A08();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.A0J != colorStateList) {
            this.A0J = colorStateList;
            ArrayList arrayList = this.A0k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass4Qc r0 = ((AnonymousClass5T2) arrayList.get(i)).A02;
                if (r0 != null) {
                    r0.A02();
                }
            }
        }
    }

    public void setTabIndicatorAnimationMode(int i) {
        AnonymousClass5WN r0;
        this.A08 = i;
        if (i == 0) {
            r0 = new AnonymousClass5WN();
        } else if (i == 1) {
            r0 = new C88714ad();
        } else if (i == 2) {
            r0 = new AnonymousClass6ZM();
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(i);
            throw AnonymousClass000.A0F(" is not a valid TabIndicatorAnimationMode", A0o);
        }
        this.A0Q = r0;
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.A0Y = z;
        AnonymousClass4QR r1 = this.A0i;
        r1.A00(r1.A02.getSelectedTabPosition());
        AnonymousClass0YY.A05(r1);
    }

    public void setTabMode(int i) {
        if (i != this.A04) {
            this.A04 = i;
            A08();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.A0K != colorStateList) {
            this.A0K = colorStateList;
            int i = 0;
            while (true) {
                AnonymousClass4QR r1 = this.A0i;
                if (i < r1.getChildCount()) {
                    View childAt = r1.getChildAt(i);
                    if (childAt instanceof AnonymousClass4Qc) {
                        ((AnonymousClass4Qc) childAt).A04(getContext());
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.A0L != colorStateList) {
            this.A0L = colorStateList;
            ArrayList arrayList = this.A0k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass4Qc r0 = ((AnonymousClass5T2) arrayList.get(i)).A02;
                if (r0 != null) {
                    r0.A02();
                }
            }
        }
    }

    public void setUnboundedRipple(boolean z) {
        if (this.A0Z != z) {
            this.A0Z = z;
            int i = 0;
            while (true) {
                AnonymousClass4QR r1 = this.A0i;
                if (i < r1.getChildCount()) {
                    View childAt = r1.getChildAt(i);
                    if (childAt instanceof AnonymousClass4Qc) {
                        ((AnonymousClass4Qc) childAt).A04(getContext());
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        if (!(this instanceof WaTabLayout) || viewPager == null || (viewPager instanceof WaViewPager)) {
            A0C(viewPager, false);
            return;
        }
        throw AnonymousClass001.A0c("WaTabLayout should only be setup with WaViewPager");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r16, android.util.AttributeSet r17, int r18) {
        /*
            r15 = this;
            r14 = 2132084325(0x7f150665, float:1.9808817E38)
            r0 = r16
            r10 = r17
            r13 = r18
            android.content.Context r0 = X.C105515Vh.A00(r0, r10, r13, r14)
            r15.<init>(r0, r10, r13)
            r4 = -1
            r15.A03 = r4
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r15.A0k = r0
            r15.A05 = r4
            r1 = 0
            r15.A0G = r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            r15.A0B = r0
            r15.A0A = r4
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r15.A0j = r0
            r2 = 12
            X.0dD r0 = new X.0dD
            r0.<init>(r2)
            r15.A0h = r0
            android.content.Context r9 = r15.getContext()
            r15.setHorizontalScrollBarEnabled(r1)
            X.4QR r5 = new X.4QR
            r5.<init>(r9, r15)
            r15.A0i = r5
            r2 = -2
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r2, r4)
            super.addView(r5, r1, r0)
            int[] r11 = X.C1463179t.A0c
            r3 = 1
            int[] r12 = new int[r3]
            r6 = 24
            r12[r1] = r6
            android.content.res.TypedArray r2 = X.C161837qd.A00(r9, r10, r11, r12, r13, r14)
            android.graphics.drawable.Drawable r0 = r15.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x0083
            android.graphics.drawable.Drawable r0 = r15.getBackground()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            X.6D7 r7 = new X.6D7
            r7.<init>()
            int r0 = r0.getColor()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r7.A06(r0)
            r7.A05(r9)
            float r0 = X.AnonymousClass0YZ.A00(r15)
            r7.A04(r0)
            X.AnonymousClass0YY.A04(r7, r15)
        L_0x0083:
            r0 = 5
            android.graphics.drawable.Drawable r0 = X.C160917of.A02(r9, r2, r0)
            r15.setSelectedTabIndicator((android.graphics.drawable.Drawable) r0)
            r0 = 8
            int r0 = r2.getColor(r0, r1)
            r15.setSelectedTabIndicatorColor(r0)
            r0 = 11
            int r0 = r2.getDimensionPixelSize(r0, r4)
            r5.setSelectedIndicatorHeight(r0)
            r0 = 10
            int r0 = r2.getInt(r0, r1)
            r15.setSelectedTabIndicatorGravity(r0)
            r0 = 7
            int r0 = r2.getInt(r0, r1)
            r15.setTabIndicatorAnimationMode(r0)
            r0 = 9
            boolean r0 = r2.getBoolean(r0, r3)
            r15.setTabIndicatorFullWidth(r0)
            r0 = 16
            int r5 = r2.getDimensionPixelSize(r0, r1)
            r15.A0C = r5
            r15.A0D = r5
            r15.A0F = r5
            r15.A0E = r5
            r0 = 19
            int r0 = r2.getDimensionPixelSize(r0, r5)
            r15.A0E = r0
            r5 = 20
            int r0 = r15.A0F
            int r0 = r2.getDimensionPixelSize(r5, r0)
            r15.A0F = r0
            r5 = 18
            int r0 = r15.A0D
            int r0 = r2.getDimensionPixelSize(r5, r0)
            r15.A0D = r0
            r5 = 17
            int r0 = r15.A0C
            int r0 = r2.getDimensionPixelSize(r5, r0)
            r15.A0C = r0
            r0 = 2130969819(0x7f0404db, float:1.754833E38)
            boolean r5 = X.C160907oe.A03(r9, r0, r1)
            r0 = 2130970821(0x7f0408c5, float:1.7550363E38)
            if (r5 == 0) goto L_0x00fa
            r0 = 2130970852(0x7f0408e4, float:1.7550426E38)
        L_0x00fa:
            r15.A0a = r0
            r0 = 2132083689(0x7f1503e9, float:1.9807527E38)
            int r8 = r2.getResourceId(r6, r0)
            r15.A0f = r8
            int[] r7 = X.AnonymousClass0KC.A0M
            android.content.res.TypedArray r5 = r9.obtainStyledAttributes(r8, r7)
            int r0 = r5.getDimensionPixelSize(r1, r1)     // Catch:{ all -> 0x0207 }
            float r0 = (float) r0     // Catch:{ all -> 0x0207 }
            r15.A01 = r0     // Catch:{ all -> 0x0207 }
            r6 = 3
            android.content.res.ColorStateList r0 = X.C160917of.A00(r9, r5, r6)     // Catch:{ all -> 0x0207 }
            r15.A0L = r0     // Catch:{ all -> 0x0207 }
            r5.recycle()
            r5 = 22
            boolean r0 = r2.hasValue(r5)
            if (r0 == 0) goto L_0x012a
            int r0 = r2.getResourceId(r5, r8)
            r15.A05 = r0
        L_0x012a:
            int r0 = r15.A05
            if (r0 == r4) goto L_0x0162
            android.content.res.TypedArray r8 = r9.obtainStyledAttributes(r0, r7)
            float r0 = r15.A01     // Catch:{ all -> 0x015a }
            int r0 = (int) r0     // Catch:{ all -> 0x015a }
            r8.getDimensionPixelSize(r1, r0)     // Catch:{ all -> 0x015a }
            android.content.res.ColorStateList r7 = X.C160917of.A00(r9, r8, r6)     // Catch:{ all -> 0x015a }
            if (r7 == 0) goto L_0x015f
            android.content.res.ColorStateList r0 = r15.A0L     // Catch:{ all -> 0x015a }
            int r6 = r0.getDefaultColor()     // Catch:{ all -> 0x015a }
            int[] r5 = new int[r3]     // Catch:{ all -> 0x015a }
            r0 = 16842913(0x10100a1, float:2.369401E-38)
            r5[r1] = r0     // Catch:{ all -> 0x015a }
            int r0 = r7.getDefaultColor()     // Catch:{ all -> 0x015a }
            int r0 = r7.getColorForState(r5, r0)     // Catch:{ all -> 0x015a }
            android.content.res.ColorStateList r0 = A00(r6, r0)     // Catch:{ all -> 0x015a }
            r15.A0L = r0     // Catch:{ all -> 0x015a }
            goto L_0x015f
        L_0x015a:
            r0 = move-exception
            r8.recycle()
            throw r0
        L_0x015f:
            r8.recycle()
        L_0x0162:
            r5 = 25
            boolean r0 = r2.hasValue(r5)
            if (r0 == 0) goto L_0x0170
            android.content.res.ColorStateList r0 = X.C160917of.A00(r9, r2, r5)
            r15.A0L = r0
        L_0x0170:
            r5 = 23
            boolean r0 = r2.hasValue(r5)
            if (r0 == 0) goto L_0x0188
            int r5 = r2.getColor(r5, r1)
            android.content.res.ColorStateList r0 = r15.A0L
            int r0 = r0.getDefaultColor()
            android.content.res.ColorStateList r0 = A00(r0, r5)
            r15.A0L = r0
        L_0x0188:
            r0 = 3
            android.content.res.ColorStateList r0 = X.C160917of.A00(r9, r2, r0)
            r15.A0J = r0
            r0 = 4
            r2.getInt(r0, r4)
            r0 = 21
            android.content.res.ColorStateList r0 = X.C160917of.A00(r9, r2, r0)
            r15.A0K = r0
            r5 = 6
            r0 = 300(0x12c, float:4.2E-43)
            int r0 = r2.getInt(r5, r0)
            r15.A07 = r0
            r5 = 2130970156(0x7f04062c, float:1.7549014E38)
            android.animation.TimeInterpolator r0 = X.C159917mg.A02
            android.animation.TimeInterpolator r0 = X.AnonymousClass5YH.A01(r0, r9, r5)
            r15.A0g = r0
            r0 = 14
            int r0 = r2.getDimensionPixelSize(r0, r4)
            r15.A0c = r0
            r0 = 13
            int r0 = r2.getDimensionPixelSize(r0, r4)
            r15.A0b = r0
            int r0 = r2.getResourceId(r1, r1)
            r15.A0e = r0
            int r0 = r2.getDimensionPixelSize(r3, r1)
            r15.A02 = r0
            r0 = 15
            int r0 = r2.getInt(r0, r3)
            r15.A04 = r0
            r0 = 2
            int r0 = r2.getInt(r0, r1)
            r15.A06 = r0
            r0 = 12
            boolean r0 = r2.getBoolean(r0, r1)
            r15.A0W = r0
            r0 = 26
            boolean r0 = r2.getBoolean(r0, r1)
            r15.A0Z = r0
            r2.recycle()
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131166216(0x7f070408, float:1.7946671E38)
            float r0 = X.C86664Kz.A01(r1, r0)
            r15.A00 = r0
            r0 = 2131166214(0x7f070406, float:1.7946667E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r15.A0d = r0
            r15.A08()
            return
        L_0x0207:
            r0 = move-exception
            r5.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static void A02(Drawable drawable, int i) {
        boolean A1S = AnonymousClass000.A1S(i);
        if (Build.VERSION.SDK_INT == 21) {
            if (A1S) {
                drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            } else {
                drawable.setColorFilter((ColorFilter) null);
            }
        } else if (A1S) {
            AnonymousClass0YG.A06(drawable, i);
        } else {
            AnonymousClass0YG.A01((ColorStateList) null, drawable);
        }
    }

    public void A06() {
        int currentItem;
        A07();
        AnonymousClass0R4 r0 = this.A0O;
        if (r0 != null) {
            int A0C2 = r0.A0C();
            for (int i = 0; i < A0C2; i++) {
                AnonymousClass5T2 A042 = A04();
                A042.A02(this.A0O.A04(i));
                A0F(A042, this.A0k.size(), false);
            }
            ViewPager viewPager = this.A0P;
            if (viewPager != null && A0C2 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < this.A0k.size()) {
                A0G(A05(currentItem), true);
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C160927og.A01(this);
        if (this.A0P == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                A0C((ViewPager) parent, true);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.A0X) {
            setupWithViewPager((ViewPager) null);
            this.A0X = false;
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new C05650Ui(accessibilityNodeInfo).A0F(new AnonymousClass0KO(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.A0k.size(), false, 1)));
    }

    public void onMeasure(int i, int i2) {
        int round = Math.round(C159337lf.A00(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.A0b;
            if (i3 <= 0) {
                i3 = (int) (((float) size) - C159337lf.A00(getContext(), 56));
            }
            this.A0B = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.A04;
            if (i4 != 0) {
                if (i4 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    C86644Kx.A10(childAt, getMeasuredWidth(), 1073741824, ViewGroup.getChildMeasureSpec(i2, AnonymousClass000.A03(this), childAt.getLayoutParams().height));
                } else if (i4 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            C86644Kx.A10(childAt, getMeasuredWidth(), 1073741824, ViewGroup.getChildMeasureSpec(i2, AnonymousClass000.A03(this), childAt.getLayoutParams().height));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (motionEvent.getActionMasked() != 8 || (i = this.A04) == 0 || i == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C160927og.A02(this, f);
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        A09();
        this.A0I.addListener(animatorListener);
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(AnonymousClass0VX.A00(getContext(), i));
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(AnonymousClass0VX.A00(getContext(), i));
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public boolean shouldDelayChildPressedState() {
        return AnonymousClass001.A1W(getTabScrollRange());
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }

    public void addView(View view, int i) {
        throw AnonymousClass001.A0c("Only TabItem instances can be added to TabLayout");
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(C187908y0 r1) {
        setOnTabSelectedListener((C183978qy) r1);
    }

    public void setSelectedTabIndicator(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass0VX.A01(getContext(), i);
        } else {
            drawable = null;
        }
        setSelectedTabIndicator(drawable);
    }

    public TabLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw AnonymousClass001.A0c("Only TabItem instances can be added to TabLayout");
    }

    public void addView(View view) {
        throw AnonymousClass001.A0c("Only TabItem instances can be added to TabLayout");
    }
}
