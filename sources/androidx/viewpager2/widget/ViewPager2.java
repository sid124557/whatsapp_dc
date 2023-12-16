package androidx.viewpager2.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass02U;
import X.AnonymousClass09F;
import X.AnonymousClass09I;
import X.AnonymousClass09J;
import X.AnonymousClass09d;
import X.AnonymousClass0KO;
import X.AnonymousClass0Q1;
import X.AnonymousClass0R6;
import X.AnonymousClass0UY;
import X.AnonymousClass0YH;
import X.AnonymousClass0YY;
import X.AnonymousClass35S;
import X.C011509j;
import X.C011909n;
import X.C01290Aa;
import X.C01300Ab;
import X.C03160Jb;
import X.C03750Lk;
import X.C03760Ll;
import X.C04230Ni;
import X.C04590Ow;
import X.C04640Qa;
import X.C04870Qz;
import X.C05650Ui;
import X.C06440Xs;
import X.C08310eF;
import X.C08550ef;
import X.C10550i7;
import X.C11100j6;
import X.C11970kl;
import X.C15270r4;
import X.C15280r5;
import X.C17680vy;
import X.C17690vz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter$5;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.Iterator;
import java.util.List;

public final class ViewPager2 extends ViewGroup {
    public int A00;
    public int A01;
    public int A02;
    public Parcelable A03;
    public LinearLayoutManager A04;
    public C011909n A05;
    public C04640Qa A06;
    public AnonymousClass0UY A07;
    public RecyclerView A08;
    public C01290Aa A09;
    public C01290Aa A0A;
    public C03750Lk A0B;
    public C01300Ab A0C;
    public AnonymousClass09d A0D;
    public C04230Ni A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final Rect A0I;
    public final Rect A0J;

    public class LinearLayoutManagerImpl extends LinearLayoutManager {
        public LinearLayoutManagerImpl() {
            super(1);
        }

        public void A1g(AnonymousClass0Q1 r4, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = viewPager2.A01;
            if (i == -1) {
                super.A1g(r4, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * i;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        public boolean A1D(Bundle bundle, C04870Qz r3, AnonymousClass0Q1 r4, int i) {
            return super.A1D(bundle, r3, r4, i);
        }

        public void A0n(C05650Ui r1, C04870Qz r2, AnonymousClass0Q1 r3) {
            super.A0n(r1, r2, r3);
        }

        public boolean A1C(Rect rect, View view, RecyclerView recyclerView, boolean z, boolean z2) {
            return false;
        }
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.A01 = i;
            this.A08.requestLayout();
            return;
        }
        throw AnonymousClass001.A0c("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setPageTransformer(C15280r5 r4) {
        boolean z = this.A0G;
        if (r4 != null) {
            if (!z) {
                this.A07 = this.A08.A0R;
                this.A0G = true;
            }
            this.A08.setItemAnimator((AnonymousClass0UY) null);
        } else if (z) {
            this.A08.setItemAnimator(this.A07);
            this.A07 = null;
            this.A0G = false;
        }
        C01300Ab r0 = this.A0C;
        if (r4 != null) {
            r0.A00 = r4;
        }
    }

    public void A00() {
        C011909n r1 = this.A05;
        if (r1 != null) {
            View A032 = r1.A03(this.A04);
            if (A032 != null) {
                int A033 = C06440Xs.A03(A032);
                if (A033 != this.A00 && this.A0D.A02 == 0) {
                    this.A0A.A01(A033);
                }
                this.A0F = false;
                return;
            }
            return;
        }
        throw AnonymousClass001.A0e("Design assumption violated.");
    }

    public final void A01() {
        AnonymousClass0R6 r5;
        int length;
        int length2;
        if (this.A02 != -1 && (r5 = this.A08.A0N) != null) {
            Parcelable parcelable = this.A03;
            if (parcelable != null) {
                if (r5 instanceof C15270r4) {
                    AnonymousClass09I r6 = (AnonymousClass09I) ((C15270r4) r5);
                    C10550i7 r8 = r6.A05;
                    if (r8.A01() == 0) {
                        C10550i7 r7 = r6.A03;
                        if (r7.A01() == 0) {
                            Bundle bundle = (Bundle) parcelable;
                            if (bundle.getClassLoader() == null) {
                                bundle.setClassLoader(r6.getClass().getClassLoader());
                            }
                            Iterator<String> it = bundle.keySet().iterator();
                            while (it.hasNext()) {
                                String A0m = AnonymousClass001.A0m(it);
                                if (A0m.startsWith("f#") && A0m.length() > (length2 = "f#".length())) {
                                    r7.A0A(Long.parseLong(A0m.substring(length2)), r6.A06.A0C(bundle, A0m));
                                } else if (!A0m.startsWith("s#") || A0m.length() <= (length = "s#".length())) {
                                    StringBuilder A0o = AnonymousClass001.A0o();
                                    A0o.append("Unexpected key in savedState: ");
                                    throw AnonymousClass000.A0F(A0m, A0o);
                                } else {
                                    long parseLong = Long.parseLong(A0m.substring(length));
                                    Parcelable parcelable2 = bundle.getParcelable(A0m);
                                    if (r6.A0P(parseLong)) {
                                        r8.A0A(parseLong, parcelable2);
                                    }
                                }
                            }
                            if (r7.A01() != 0) {
                                r6.A01 = true;
                                r6.A02 = true;
                                r6.A0M();
                                Handler A0A2 = AnonymousClass000.A0A();
                                C11100j6 r2 = new C11100j6(r6);
                                r6.A07.A00(new FragmentStateAdapter$5(A0A2, r6, r2));
                                A0A2.postDelayed(r2, 10000);
                            }
                        }
                    }
                    throw AnonymousClass001.A0e("Expected the adapter to be 'fresh' while restoring state.");
                }
                this.A03 = null;
            }
            int max = Math.max(0, Math.min(this.A02, r5.A0G() - 1));
            this.A00 = max;
            this.A02 = -1;
            this.A08.A0Z(max);
            this.A0E.A00();
        }
    }

    public void A02(int i) {
        C04590Ow r0;
        AnonymousClass0R6 r3 = this.A08.A0N;
        if (r3 == null) {
            if (this.A02 != -1) {
                this.A02 = Math.max(i, 0);
            }
        } else if (r3.A0G() > 0) {
            int min = Math.min(Math.max(i, 0), r3.A0G() - 1);
            int i2 = this.A00;
            if ((min != i2 || this.A0D.A02 != 0) && min != i2) {
                double d = (double) i2;
                this.A00 = min;
                this.A0E.A00();
                AnonymousClass09d r1 = this.A0D;
                if (r1.A02 != 0) {
                    r1.A07();
                    C03760Ll r12 = r1.A04;
                    d = ((double) r12.A02) + ((double) r12.A00);
                }
                AnonymousClass09d r5 = this.A0D;
                r5.A00 = 2;
                boolean z = false;
                if (r5.A03 != min) {
                    z = true;
                }
                r5.A03 = min;
                r5.A08(2);
                if (z && (r0 = r5.A05) != null) {
                    r0.A01(min);
                }
                double d2 = (double) min;
                int i3 = (Math.abs(d2 - d) > 3.0d ? 1 : (Math.abs(d2 - d) == 3.0d ? 0 : -1));
                RecyclerView recyclerView = this.A08;
                if (i3 > 0) {
                    int i4 = min + 3;
                    if (d2 > d) {
                        i4 = min - 3;
                    }
                    recyclerView.A0Z(i4);
                    RecyclerView recyclerView2 = this.A08;
                    recyclerView2.post(new C11970kl(recyclerView2, min));
                    return;
                }
                recyclerView.A0a(min);
            }
        }
    }

    public final void A03(Context context, AttributeSet attributeSet) {
        this.A0E = new C04230Ni(this);
        C011509j r1 = new C011509j(context, this);
        this.A08 = r1;
        r1.setId(AnonymousClass0YH.A00());
        this.A08.setDescendantFocusability(AnonymousClass35S.A0F);
        LinearLayoutManagerImpl linearLayoutManagerImpl = new LinearLayoutManagerImpl();
        this.A04 = linearLayoutManagerImpl;
        this.A08.setLayoutManager(linearLayoutManagerImpl);
        this.A08.setScrollingTouchSlop(1);
        setOrientation(context, attributeSet);
        this.A08.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        RecyclerView recyclerView = this.A08;
        C08550ef r12 = new C08550ef(this);
        List list = recyclerView.A0a;
        if (list == null) {
            list = AnonymousClass001.A0s();
            recyclerView.A0a = list;
        }
        list.add(r12);
        AnonymousClass09d r2 = new AnonymousClass09d(this);
        this.A0D = r2;
        RecyclerView recyclerView2 = this.A08;
        this.A0B = new C03750Lk(recyclerView2, r2, this);
        AnonymousClass09F r0 = new AnonymousClass09F(this);
        this.A05 = r0;
        r0.A06(recyclerView2);
        this.A08.A0q(this.A0D);
        C01290Aa r5 = new C01290Aa();
        this.A0A = r5;
        this.A0D.A05 = r5;
        C17690vz r3 = new C17690vz(this, 1);
        C17690vz r13 = new C17690vz(this, 2);
        r5.A00.add(r3);
        this.A0A.A00.add(r13);
        C04230Ni r14 = this.A0E;
        AnonymousClass0YY.A06(this.A08, 2);
        r14.A00 = new C17680vy(r14, 1);
        ViewPager2 viewPager2 = r14.A04;
        if (AnonymousClass0YY.A00(viewPager2) == 0) {
            AnonymousClass0YY.A06(viewPager2, 1);
        }
        C01290Aa r02 = this.A0A;
        r02.A00.add(this.A09);
        C01300Ab r15 = new C01300Ab(this.A04);
        this.A0C = r15;
        this.A0A.A00.add(r15);
        RecyclerView recyclerView3 = this.A08;
        attachViewToParent(recyclerView3, 0, recyclerView3.getLayoutParams());
    }

    public boolean canScrollHorizontally(int i) {
        return this.A08.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i) {
        return this.A08.canScrollVertically(i);
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.viewpager.widget.ViewPager";
    }

    public AnonymousClass0R6 getAdapter() {
        return this.A08.A0N;
    }

    public int getCurrentItem() {
        return this.A00;
    }

    public int getItemDecorationCount() {
        return this.A08.A13.size();
    }

    public int getOffscreenPageLimit() {
        return this.A01;
    }

    public int getOrientation() {
        return this.A04.A01;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.A08;
        if (this.A04.A01 == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.A0D.A02;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.A08.getMeasuredWidth();
        int measuredHeight = this.A08.getMeasuredHeight();
        Rect rect = this.A0J;
        rect.left = getPaddingLeft();
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.A0I;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.A08.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.A0F) {
            A00();
        }
    }

    public void onMeasure(int i, int i2) {
        measureChild(this.A08, i, i2);
        int measuredWidth = this.A08.getMeasuredWidth();
        int measuredHeight = this.A08.getMeasuredHeight();
        int measuredState = this.A08.getMeasuredState();
        int A022 = measuredWidth + AnonymousClass000.A02(this);
        int A032 = measuredHeight + AnonymousClass000.A03(this);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(A022, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(A032, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AnonymousClass02U)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass02U r2 = (AnonymousClass02U) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.A02 = r2.A00;
        this.A03 = r2.A02;
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        int i2;
        C04230Ni r1 = this.A0E;
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        ViewPager2 viewPager2 = r1.A04;
        int i3 = viewPager2.A00;
        if (i == 8192) {
            i2 = i3 - 1;
        } else {
            i2 = i3 + 1;
        }
        if (!viewPager2.A0H) {
            return true;
        }
        viewPager2.A02(i2);
        return true;
    }

    public void setAdapter(AnonymousClass0R6 r4) {
        AnonymousClass0R6 r2 = this.A08.A0N;
        C04230Ni r0 = this.A0E;
        if (r2 != null) {
            r2.A01.unregisterObserver(r0.A00);
            r2.A01.unregisterObserver(this.A06);
        }
        this.A08.setAdapter(r4);
        this.A00 = 0;
        A01();
        C04230Ni r02 = this.A0E;
        r02.A00();
        if (r4 != null) {
            r4.BiZ(r02.A00);
            r4.BiZ(this.A06);
        }
    }

    public final void setOrientation(Context context, AttributeSet attributeSet) {
        int[] iArr = C03160Jb.A00;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context2, iArr, attributeSet2, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setUserInputEnabled(boolean z) {
        this.A0H = z;
        this.A0E.A00();
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A0J = AnonymousClass001.A0N();
        this.A0I = AnonymousClass001.A0N();
        AnonymousClass09J.A00(context, attributeSet, this);
    }

    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof AnonymousClass02U) {
            int i = ((AnonymousClass02U) parcelable).A01;
            sparseArray.put(this.A08.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        A01();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int A0G2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = this.A0E.A04;
        AnonymousClass0R6 r2 = viewPager2.A08.A0N;
        if (r2 != null) {
            int i3 = viewPager2.A04.A01;
            i = r2.A0G();
            if (i3 != 1) {
                i2 = i;
                i = 0;
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        new C05650Ui(accessibilityNodeInfo).A0F(new AnonymousClass0KO(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, 0)));
        AnonymousClass0R6 r0 = viewPager2.A08.A0N;
        if (r0 != null && (A0G2 = r0.A0G()) != 0 && viewPager2.A0H) {
            if (viewPager2.A00 > 0) {
                accessibilityNodeInfo.addAction(DefaultCrypto.BUFFER_SIZE);
            }
            if (viewPager2.A00 < A0G2 - 1) {
                accessibilityNodeInfo.addAction(ZipDecompressor.UNZIP_BUFFER_SIZE);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    public Parcelable onSaveInstanceState() {
        AnonymousClass02U r8 = new AnonymousClass02U(super.onSaveInstanceState());
        r8.A01 = this.A08.getId();
        int i = this.A02;
        if (i == -1) {
            i = this.A00;
        }
        r8.A00 = i;
        Parcelable parcelable = this.A03;
        Bundle bundle = parcelable;
        if (parcelable == null) {
            AnonymousClass0R6 r6 = this.A08.A0N;
            if (r6 instanceof C15270r4) {
                AnonymousClass09I r62 = (AnonymousClass09I) ((C15270r4) r6);
                C10550i7 r11 = r62.A03;
                int A012 = r11.A01();
                C10550i7 r5 = r62.A05;
                Bundle bundle2 = new Bundle(A012 + r5.A01());
                for (int i2 = 0; i2 < r11.A01(); i2++) {
                    long A022 = r11.A02(i2);
                    C08310eF r9 = (C08310eF) C10550i7.A00(r11, A022);
                    if (r9 != null && r9.A16()) {
                        r62.A06.A0U(bundle2, r9, AnonymousClass000.A0Z("f#", AnonymousClass001.A0o(), A022));
                    }
                }
                for (int i3 = 0; i3 < r5.A01(); i3++) {
                    long A023 = r5.A02(i3);
                    if (r62.A0P(A023)) {
                        bundle2.putParcelable(AnonymousClass000.A0Z("s#", AnonymousClass001.A0o(), A023), (Parcelable) C10550i7.A00(r5, A023));
                    }
                }
                bundle = bundle2;
            }
            return r8;
        }
        r8.A02 = bundle;
        return r8;
    }

    public void onViewAdded(View view) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(ViewPager2.class.getSimpleName());
        throw AnonymousClass000.A0I(" does not support direct child views", A0o);
    }

    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.A0E.A00();
    }

    public void setCurrentItem(int i) {
        A02(i);
    }

    public ViewPager2(Context context) {
        super(context);
        this.A0J = AnonymousClass001.A0N();
        this.A0I = AnonymousClass001.A0N();
        this.A09 = new C01290Aa();
        this.A0F = false;
        this.A06 = new C17680vy(this, 0);
        this.A02 = -1;
        this.A07 = null;
        this.A0G = false;
        this.A0H = true;
        this.A01 = -1;
        A03(context, (AttributeSet) null);
    }

    public void setOrientation(int i) {
        this.A04.A1X(i);
        this.A0E.A00();
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0J = AnonymousClass001.A0N();
        this.A0I = AnonymousClass001.A0N();
        AnonymousClass09J.A00(context, attributeSet, this);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0J = AnonymousClass001.A0N();
        this.A0I = AnonymousClass001.A0N();
        AnonymousClass09J.A00(context, attributeSet, this);
    }
}
