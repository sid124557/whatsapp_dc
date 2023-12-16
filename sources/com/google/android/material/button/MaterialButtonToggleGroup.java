package com.google.android.material.button;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0KO;
import X.AnonymousClass0YH;
import X.AnonymousClass0YY;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass91R;
import X.C05650Ui;
import X.C06060Wb;
import X.C06560Yg;
import X.C105515Vh;
import X.C1463179t;
import X.C156667h0;
import X.C161837qd;
import X.C161877ql;
import X.C169988Bk;
import X.C181198mM;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C188778zT;
import X.C86664Kz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class MaterialButtonToggleGroup extends LinearLayout {
    public Set A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public Integer[] A04;
    public final int A05;
    public final C169988Bk A06;
    public final Comparator A07;
    public final LinkedHashSet A08;
    public final List A09;

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        C86664Kz.A1S(materialButton);
        materialButton.setCheckable(true);
        materialButton.A08 = this.A06;
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void A02(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", AnonymousClass000.A0Y("Button ID is not valid: ", AnonymousClass001.A0o(), i));
            return;
        }
        HashSet A15 = AnonymousClass0x9.A15(this.A00);
        if (z) {
            Integer valueOf = Integer.valueOf(i);
            if (!A15.contains(valueOf)) {
                if (this.A02 && !A15.isEmpty()) {
                    A15.clear();
                }
                A15.add(valueOf);
            } else {
                return;
            }
        } else {
            Integer valueOf2 = Integer.valueOf(i);
            if (!A15.contains(valueOf2)) {
                return;
            }
            if (!this.A01 || A15.size() > 1) {
                A15.remove(valueOf2);
            }
        }
        A03(A15);
    }

    public final void A03(Set set) {
        Set set2 = this.A00;
        this.A00 = AnonymousClass0x9.A15(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = getChildAt(i).getId();
            Integer valueOf = Integer.valueOf(id);
            boolean contains = set.contains(valueOf);
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.A03 = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.A03 = false;
            }
            if (set2.contains(valueOf) != set.contains(valueOf)) {
                boolean A1X = C18300x5.A1X(set, id);
                Iterator it = this.A08.iterator();
                while (it.hasNext()) {
                    ((C181198mM) it.next()).BNx(this, id, A1X);
                }
            }
        }
        invalidate();
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        A02(materialButton.getId(), materialButton.isChecked());
        C161877ql shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.A09.add(new C156667h0(shapeAppearanceModel.A02, shapeAppearanceModel.A00, shapeAppearanceModel.A03, shapeAppearanceModel.A01));
        materialButton.setEnabled(isEnabled());
        C06560Yg.A0O(materialButton, new C188778zT(this, 3));
    }

    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.A07);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            AnonymousClass0x2.A1I(getChildAt(i), treeMap, i);
        }
        this.A04 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public int getCheckedButtonId() {
        if (!this.A02 || this.A00.isEmpty()) {
            return -1;
        }
        return C18280x3.A05(this.A00.iterator());
    }

    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.A04;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    public void setSingleSelection(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            A03(AnonymousClass002.A0K());
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        super(C105515Vh.A00(context, attributeSet, i, R.style.f12nameremoved), attributeSet, i);
        this.A09 = AnonymousClass001.A0s();
        this.A06 = new C169988Bk(this);
        this.A08 = AnonymousClass0x9.A17();
        this.A07 = new AnonymousClass91R(this, 7);
        this.A03 = false;
        this.A00 = AnonymousClass002.A0K();
        TypedArray A002 = C161837qd.A00(getContext(), attributeSet, C1463179t.A0J, new int[0], i, R.style.f12nameremoved);
        setSingleSelection(A002.getBoolean(3, false));
        this.A05 = A002.getResourceId(1, -1);
        this.A01 = A002.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(A002.getBoolean(0, true));
        A002.recycle();
        AnonymousClass0YY.A06(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).getVisibility() != 8) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        int childCount = getChildCount();
        do {
            childCount--;
            if (childCount < 0) {
                return -1;
            }
        } while (getChildAt(childCount).getVisibility() == 8);
        return childCount;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(AnonymousClass0YH.A00());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (X.AnonymousClass0YH.A01(r10) == 1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (X.AnonymousClass0YH.A01(r10) == 1) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        r2 = r3.A02;
        r1 = r3.A00;
        r0 = X.C156667h0.A04;
        r3 = new X.C156667h0(r2, r1, r0, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        if (r3 == null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r10 = this;
            int r9 = r10.getChildCount()
            int r8 = r10.getFirstVisibleChildIndex()
            int r7 = r10.getLastVisibleChildIndex()
            r6 = 0
        L_0x000d:
            if (r6 >= r9) goto L_0x009f
            android.view.View r5 = r10.getChildAt(r6)
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            int r1 = r5.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x003e
            X.7ql r0 = r5.getShapeAppearanceModel()
            X.7jd r4 = new X.7jd
            r4.<init>(r0)
            java.util.List r0 = r10.A09
            java.lang.Object r3 = r0.get(r6)
            X.7h0 r3 = (X.C156667h0) r3
            if (r8 != r7) goto L_0x0041
            if (r3 != 0) goto L_0x005f
        L_0x0032:
            r0 = 0
            r4.A01(r0)
        L_0x0036:
            X.7ql r0 = new X.7ql
            r0.<init>(r4)
            r5.setShapeAppearanceModel(r0)
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x000d
        L_0x0041:
            int r0 = r10.getOrientation()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r6 != r8) goto L_0x007c
            if (r0 == 0) goto L_0x0070
            int r1 = X.AnonymousClass0YH.A01(r10)
            r0 = 1
            if (r1 != r0) goto L_0x0087
        L_0x0054:
            X.8mP r2 = X.C156667h0.A04
            X.8mP r1 = r3.A03
            X.8mP r0 = r3.A01
            X.7h0 r3 = new X.7h0
            r3.<init>(r2, r2, r1, r0)
        L_0x005f:
            X.8mP r0 = r3.A02
            r4.A02 = r0
            X.8mP r0 = r3.A00
            r4.A00 = r0
            X.8mP r0 = r3.A03
            r4.A03 = r0
            X.8mP r0 = r3.A01
            r4.A01 = r0
            goto L_0x0036
        L_0x0070:
            X.8mP r2 = r3.A02
            X.8mP r1 = X.C156667h0.A04
            X.8mP r0 = r3.A03
            X.7h0 r3 = new X.7h0
            r3.<init>(r2, r1, r0, r1)
            goto L_0x005f
        L_0x007c:
            if (r6 != r7) goto L_0x0032
            if (r0 == 0) goto L_0x0093
            int r1 = X.AnonymousClass0YH.A01(r10)
            r0 = 1
            if (r1 != r0) goto L_0x0054
        L_0x0087:
            X.8mP r2 = r3.A02
            X.8mP r1 = r3.A00
            X.8mP r0 = X.C156667h0.A04
            X.7h0 r3 = new X.7h0
            r3.<init>(r2, r1, r0, r0)
            goto L_0x005f
        L_0x0093:
            X.8mP r2 = X.C156667h0.A04
            X.8mP r1 = r3.A00
            X.8mP r0 = r3.A01
            X.7h0 r3 = new X.7h0
            r3.<init>(r2, r1, r2, r0)
            goto L_0x005f
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.A00():void");
    }

    public final void A01() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i);
                int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    C06060Wb.A03(layoutParams, 0);
                    C06060Wb.A04(layoutParams, -min);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                    C06060Wb.A04(layoutParams, 0);
                }
                materialButton.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams A0U = AnonymousClass001.A0U(getChildAt(firstVisibleChildIndex));
                if (getOrientation() == 1) {
                    A0U.topMargin = 0;
                    A0U.bottomMargin = 0;
                    return;
                }
                C06060Wb.A03(A0U, 0);
                C06060Wb.A04(A0U, 0);
                A0U.leftMargin = 0;
                A0U.rightMargin = 0;
            }
        }
    }

    public List getCheckedButtonIds() {
        ArrayList A0s = AnonymousClass001.A0s();
        for (int i = 0; i < getChildCount(); i++) {
            int id = getChildAt(i).getId();
            if (C18300x5.A1X(this.A00, id)) {
                C18270x1.A1K(A0s, id);
            }
        }
        return A0s;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.A05;
        if (i != -1) {
            A03(Collections.singleton(Integer.valueOf(i)));
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new C05650Ui(accessibilityNodeInfo).A0F(new AnonymousClass0KO(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, C18280x3.A01(this.A02 ? 1 : 0))));
    }

    public void onMeasure(int i, int i2) {
        A00();
        A01();
        super.onMeasure(i, i2);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).A08 = null;
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.A09.remove(indexOfChild);
        }
        A00();
        A01();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.A01 = z;
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, (AttributeSet) null);
    }
}
