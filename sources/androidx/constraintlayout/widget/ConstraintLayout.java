package androidx.constraintlayout.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass02X;
import X.AnonymousClass05J;
import X.AnonymousClass05K;
import X.AnonymousClass05P;
import X.AnonymousClass0GU;
import X.AnonymousClass0K9;
import X.AnonymousClass0M3;
import X.AnonymousClass0R7;
import X.AnonymousClass0XZ;
import X.C001702c;
import X.C04430Oe;
import X.C05620Uf;
import X.C07810cr;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintLayout extends ViewGroup {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public SparseArray A06;
    public SparseArray A07;
    public AnonymousClass05P A08;
    public C07810cr A09;
    public AnonymousClass0M3 A0A;
    public AnonymousClass0XZ A0B;
    public AnonymousClass0GU A0C;
    public ArrayList A0D;
    public HashMap A0E;
    public boolean A0F;

    public void forceLayout() {
        this.A0F = true;
        super.forceLayout();
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C001702c(-2, -2);
    }

    public void requestLayout() {
        this.A0F = true;
        super.requestLayout();
    }

    public final AnonymousClass0R7 A03(View view) {
        if (view == this) {
            return this.A08;
        }
        if (view == null) {
            return null;
        }
        return ((C001702c) view.getLayoutParams()).A0r;
    }

    public final void A04(AttributeSet attributeSet, int i, int i2) {
        AnonymousClass05P r7 = this.A08;
        r7.A0e = this;
        C07810cr r1 = this.A09;
        r7.A06 = r1;
        r7.A08.A03 = r1;
        this.A06.put(getId(), this);
        this.A0B = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0K9.A01, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 9) {
                    this.A04 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A04);
                } else if (index == 10) {
                    this.A03 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A03);
                } else if (index == 7) {
                    this.A02 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A02);
                } else if (index == 8) {
                    this.A01 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A01);
                } else if (index == 89) {
                    this.A05 = obtainStyledAttributes.getInt(index, this.A05);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.A0A = new AnonymousClass0M3(getContext(), this, resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.A0A = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        AnonymousClass0XZ r11 = new AnonymousClass0XZ();
                        this.A0B = r11;
                        Context context = getContext();
                        XmlResourceParser xml = context.getResources().getXml(resourceId2);
                        try {
                            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                if (eventType == 0) {
                                    xml.getName();
                                } else if (eventType == 2) {
                                    String name = xml.getName();
                                    C04430Oe A052 = r11.A05(context, Xml.asAttributeSet(xml));
                                    if (name.equalsIgnoreCase("Guideline")) {
                                        A052.A02.A0y = true;
                                    }
                                    r11.A00.put(Integer.valueOf(A052.A00), A052);
                                }
                            }
                        } catch (XmlPullParserException e) {
                            e.printStackTrace();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    } catch (Resources.NotFoundException unused2) {
                        this.A0B = null;
                    }
                    this.A00 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        int i4 = this.A05;
        r7.A01 = i4;
        C05620Uf.A0F = AnonymousClass000.A1U(i4 & 256, 256);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r23) {
        /*
            r22 = this;
            r8 = r22
            java.util.ArrayList r2 = r8.A0D
            r12 = 0
            if (r2 == 0) goto L_0x0016
            int r1 = r2.size()
            if (r1 <= 0) goto L_0x0016
            r0 = 0
        L_0x000e:
            r2.get(r0)
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x0016
            goto L_0x000e
        L_0x0016:
            r13 = r23
            super.dispatchDraw(r13)
            boolean r0 = r8.isInEditMode()
            if (r0 == 0) goto L_0x00d7
            int r7 = r8.getChildCount()
            int r0 = r8.getWidth()
            float r6 = (float) r0
            int r0 = r8.getHeight()
            float r5 = (float) r0
            r4 = 0
        L_0x0030:
            if (r4 >= r7) goto L_0x00d7
            android.view.View r2 = r8.getChildAt(r4)
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x00d3
            java.lang.Object r1 = r2.getTag()
            if (r1 == 0) goto L_0x00d3
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x00d3
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = ","
            java.lang.String[] r3 = r1.split(r0)
            int r1 = r3.length
            r0 = 4
            if (r1 != r0) goto L_0x00d3
            r0 = r3[r12]
            int r2 = java.lang.Integer.parseInt(r0)
            r0 = 1
            r0 = r3[r0]
            int r1 = java.lang.Integer.parseInt(r0)
            r0 = 2
            r0 = r3[r0]
            int r11 = java.lang.Integer.parseInt(r0)
            r0 = 3
            r0 = r3[r0]
            int r3 = java.lang.Integer.parseInt(r0)
            float r0 = (float) r2
            r2 = 1149698048(0x44870000, float:1080.0)
            float r0 = r0 / r2
            float r0 = r0 * r6
            int r10 = (int) r0
            float r0 = (float) r1
            r1 = 1156579328(0x44f00000, float:1920.0)
            float r0 = r0 / r1
            float r0 = r0 * r5
            int r9 = (int) r0
            float r0 = (float) r11
            float r0 = r0 / r2
            float r0 = r0 * r6
            int r2 = (int) r0
            float r0 = (float) r3
            float r0 = r0 / r1
            float r0 = r0 * r5
            int r1 = (int) r0
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r3.setColor(r0)
            float r14 = (float) r10
            float r15 = (float) r9
            int r10 = r10 + r2
            float r2 = (float) r10
            r16 = r2
            r17 = r15
            r18 = r3
            r13.drawLine(r14, r15, r16, r17, r18)
            int r9 = r9 + r1
            float r1 = (float) r9
            r19 = r2
            r16 = r13
            r17 = r2
            r18 = r15
            r20 = r1
            r21 = r3
            r16.drawLine(r17, r18, r19, r20, r21)
            r18 = r1
            r19 = r14
            r16.drawLine(r17, r18, r19, r20, r21)
            r17 = r14
            r20 = r15
            r16.drawLine(r17, r18, r19, r20, r21)
            r0 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r3.setColor(r0)
            r16 = r2
            r17 = r1
            r18 = r3
            r13.drawLine(r14, r15, r16, r17, r18)
            r16 = r13
            r17 = r14
            r18 = r1
            r19 = r2
            r16.drawLine(r17, r18, r19, r20, r21)
        L_0x00d3:
            int r4 = r4 + 1
            goto L_0x0030
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public int getMaxHeight() {
        return this.A01;
    }

    public int getMaxWidth() {
        return this.A02;
    }

    public int getMinHeight() {
        return this.A03;
    }

    public int getMinWidth() {
        return this.A04;
    }

    public int getOptimizationLevel() {
        return this.A08.A01;
    }

    public void setId(int i) {
        SparseArray sparseArray = this.A06;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.A01) {
            this.A01 = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.A02) {
            this.A02 = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.A03) {
            this.A03 = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.A04) {
            this.A04 = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(AnonymousClass0GU r2) {
        this.A0C = r2;
        AnonymousClass0M3 r0 = this.A0A;
        if (r0 != null) {
            r0.A02 = r2;
        }
    }

    public void setOptimizationLevel(int i) {
        this.A05 = i;
        this.A08.A01 = i;
        C05620Uf.A0F = AnonymousClass000.A1U(i & 256, 256);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AnonymousClass05J.A00(this);
        C07810cr.A00(this);
        A04(attributeSet, i, i2);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C001702c(getContext(), attributeSet);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            C001702c r2 = (C001702c) childAt.getLayoutParams();
            AnonymousClass0R7 r4 = r2.A0r;
            if (childAt.getVisibility() != 8 || r2.A0x || r2.A0y || isInEditMode) {
                int A062 = r4.A06();
                int A072 = r4.A07();
                childAt.layout(A062, A072, r4.A05() + A062, r4.A04() + A072);
            }
        }
        ArrayList arrayList = this.A0D;
        int size = arrayList.size();
        if (size > 0) {
            do {
                ((AnonymousClass02X) arrayList.get(i5)).A07(this);
                i5++;
            } while (i5 < size);
        }
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        AnonymousClass0R7 A032 = A03(view);
        if ((view instanceof Guideline) && !(A032 instanceof AnonymousClass05K)) {
            C001702c r0 = (C001702c) view.getLayoutParams();
            AnonymousClass05K r1 = new AnonymousClass05K();
            r0.A0r = r1;
            r0.A0x = true;
            r1.A0N(r0.A0b);
        }
        if (view instanceof AnonymousClass02X) {
            AnonymousClass02X r2 = (AnonymousClass02X) view;
            r2.A02();
            ((C001702c) view.getLayoutParams()).A0y = true;
            ArrayList arrayList = this.A0D;
            if (!arrayList.contains(r2)) {
                arrayList.add(r2);
            }
        }
        this.A06.put(view.getId(), view);
        this.A0F = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.A06.remove(view.getId());
        AnonymousClass0R7 A032 = A03(view);
        this.A08.A00.remove(A032);
        A032.A0Z = null;
        this.A0D.remove(view);
        this.A0F = true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C001702c;
    }

    public void setConstraintSet(AnonymousClass0XZ r1) {
        this.A0B = r1;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 687 */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0666, code lost:
        if (r14.A01 <= 0.0f) goto L_0x0668;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x067a, code lost:
        if (r1 != false) goto L_0x067c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x06fa, code lost:
        if (r17 == 0) goto L_0x0704;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0702, code lost:
        if (r17 == 0) goto L_0x0704;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0704, code lost:
        r10 = java.lang.Math.max(0, r7.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0719, code lost:
        if (r17 == 0) goto L_0x0720;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x071e, code lost:
        if (r17 == 0) goto L_0x0720;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0720, code lost:
        r14 = java.lang.Math.max(0, r7.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x08e7, code lost:
        if (r2 != 2) goto L_0x08e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0453 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0948  */
    /* JADX WARNING: Removed duplicated region for block: B:608:0x08d4 A[EDGE_INSN: B:608:0x08d4->B:437:0x08d4 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            X.05P r9 = r7.A08
            android.content.Context r0 = r7.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r3 = r0.flags
            r0 = 4194304(0x400000, float:5.877472E-39)
            r3 = r3 & r0
            r2 = 0
            r1 = 1
            if (r3 == 0) goto L_0x001c
            int r0 = r7.getLayoutDirection()
            if (r1 != r0) goto L_0x001c
            r2 = 1
        L_0x001c:
            r9.A0A = r2
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x054a
            r11 = 0
            r7.A0F = r11
            int r2 = r7.getChildCount()
            r1 = 0
        L_0x002a:
            if (r1 >= r2) goto L_0x054a
            android.view.View r0 = r7.getChildAt(r1)
            boolean r0 = r0.isLayoutRequested()
            if (r0 == 0) goto L_0x0052
            r10 = 1
            boolean r16 = r7.isInEditMode()
            int r8 = r7.getChildCount()
            r1 = 0
        L_0x0040:
            if (r1 >= r8) goto L_0x0055
            android.view.View r0 = r7.getChildAt(r1)
            X.0R7 r0 = r7.A03(r0)
            if (r0 == 0) goto L_0x004f
            r0.A09()
        L_0x004f:
            int r1 = r1 + 1
            goto L_0x0040
        L_0x0052:
            int r1 = r1 + 1
            goto L_0x002a
        L_0x0055:
            r4 = -1
            if (r16 == 0) goto L_0x00d7
            r5 = 0
        L_0x0059:
            if (r5 >= r8) goto L_0x00d7
            android.view.View r6 = r7.getChildAt(r5)
            android.content.res.Resources r1 = r7.getResources()     // Catch:{ NotFoundException -> 0x00d4 }
            int r0 = r6.getId()     // Catch:{ NotFoundException -> 0x00d4 }
            java.lang.String r3 = r1.getResourceName(r0)     // Catch:{ NotFoundException -> 0x00d4 }
            int r0 = r6.getId()     // Catch:{ NotFoundException -> 0x00d4 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x00d4 }
            if (r3 == 0) goto L_0x0093
            java.util.HashMap r0 = r7.A0E     // Catch:{ NotFoundException -> 0x00d4 }
            if (r0 != 0) goto L_0x007f
            java.util.HashMap r0 = X.AnonymousClass001.A0t()     // Catch:{ NotFoundException -> 0x00d4 }
            r7.A0E = r0     // Catch:{ NotFoundException -> 0x00d4 }
        L_0x007f:
            r1 = r3
            java.lang.String r0 = "/"
            int r0 = r3.indexOf(r0)     // Catch:{ NotFoundException -> 0x00d4 }
            if (r0 == r4) goto L_0x008e
            int r0 = r0 + 1
            java.lang.String r1 = r3.substring(r0)     // Catch:{ NotFoundException -> 0x00d4 }
        L_0x008e:
            java.util.HashMap r0 = r7.A0E     // Catch:{ NotFoundException -> 0x00d4 }
            r0.put(r1, r2)     // Catch:{ NotFoundException -> 0x00d4 }
        L_0x0093:
            r0 = 47
            int r0 = r3.indexOf(r0)     // Catch:{ NotFoundException -> 0x00d4 }
            if (r0 == r4) goto L_0x00a1
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)     // Catch:{ NotFoundException -> 0x00d4 }
        L_0x00a1:
            int r2 = r6.getId()     // Catch:{ NotFoundException -> 0x00d4 }
            if (r2 == 0) goto L_0x00c8
            android.util.SparseArray r0 = r7.A06     // Catch:{ NotFoundException -> 0x00d4 }
            java.lang.Object r1 = r0.get(r2)     // Catch:{ NotFoundException -> 0x00d4 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ NotFoundException -> 0x00d4 }
            if (r1 != 0) goto L_0x00c5
            android.view.View r1 = r7.findViewById(r2)     // Catch:{ NotFoundException -> 0x00d4 }
            if (r1 == 0) goto L_0x00c3
            if (r1 == r7) goto L_0x00c5
            android.view.ViewParent r0 = r1.getParent()     // Catch:{ NotFoundException -> 0x00d4 }
            if (r0 != r7) goto L_0x00c5
            r7.onViewAdded(r1)     // Catch:{ NotFoundException -> 0x00d4 }
            goto L_0x00c5
        L_0x00c3:
            r0 = 0
            goto L_0x00d2
        L_0x00c5:
            if (r1 == r7) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            r0 = r9
            goto L_0x00d2
        L_0x00ca:
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()     // Catch:{ NotFoundException -> 0x00d4 }
            X.02c r0 = (X.C001702c) r0     // Catch:{ NotFoundException -> 0x00d4 }
            X.0R7 r0 = r0.A0r     // Catch:{ NotFoundException -> 0x00d4 }
        L_0x00d2:
            r0.A0f = r3     // Catch:{ NotFoundException -> 0x00d4 }
        L_0x00d4:
            int r5 = r5 + 1
            goto L_0x0059
        L_0x00d7:
            int r0 = r7.A00
            if (r0 == r4) goto L_0x00e8
            r1 = 0
        L_0x00dc:
            if (r1 >= r8) goto L_0x00e8
            android.view.View r0 = r7.getChildAt(r1)
            r0.getId()
            int r1 = r1 + 1
            goto L_0x00dc
        L_0x00e8:
            X.0XZ r0 = r7.A0B
            if (r0 == 0) goto L_0x00ef
            r0.A0A(r7)
        L_0x00ef:
            java.util.ArrayList r0 = r9.A00
            r0.clear()
            java.util.ArrayList r12 = r7.A0D
            int r6 = r12.size()
            if (r6 <= 0) goto L_0x0184
            r5 = 0
        L_0x00fd:
            java.lang.Object r4 = r12.get(r5)
            X.02X r4 = (X.AnonymousClass02X) r4
            boolean r0 = r4.isInEditMode()
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = r4.A03
            r4.setIds(r0)
        L_0x010e:
            X.0rm r0 = r4.A02
            if (r0 == 0) goto L_0x017e
            X.05O r0 = (X.AnonymousClass05O) r0
            r0.A00 = r11
            X.0R7[] r1 = r0.A01
            r0 = 0
            java.util.Arrays.fill(r1, r0)
            r3 = 0
        L_0x011d:
            int r0 = r4.A00
            if (r3 >= r0) goto L_0x017e
            int[] r0 = r4.A05
            r1 = r0[r3]
            android.util.SparseArray r14 = r7.A06
            java.lang.Object r0 = r14.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L_0x0154
            java.util.HashMap r13 = r4.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r13.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            int r1 = r4.A00(r7, r2)
            if (r1 == 0) goto L_0x017b
            int[] r0 = r4.A05
            r0[r3] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r13.put(r0, r2)
            java.lang.Object r0 = r14.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x017b
        L_0x0154:
            X.0rm r2 = r4.A02
            X.0R7 r13 = r7.A03(r0)
            X.05O r2 = (X.AnonymousClass05O) r2
            if (r13 == r2) goto L_0x017b
            if (r13 == 0) goto L_0x017b
            int r0 = r2.A00
            int r14 = r0 + 1
            X.0R7[] r1 = r2.A01
            int r0 = r1.length
            if (r14 <= r0) goto L_0x0173
            int r0 = r0 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            X.0R7[] r1 = (X.AnonymousClass0R7[]) r1
            r2.A01 = r1
        L_0x0173:
            int r0 = r2.A00
            r1[r0] = r13
            int r0 = r0 + 1
            r2.A00 = r0
        L_0x017b:
            int r3 = r3 + 1
            goto L_0x011d
        L_0x017e:
            int r5 = r5 + 1
            if (r5 >= r6) goto L_0x0184
            goto L_0x00fd
        L_0x0184:
            r0 = 0
        L_0x0185:
            if (r0 >= r8) goto L_0x018d
            r7.getChildAt(r0)
            int r0 = r0 + 1
            goto L_0x0185
        L_0x018d:
            android.util.SparseArray r6 = r7.A07
            r6.clear()
            r6.put(r11, r9)
            int r0 = r7.getId()
            r6.put(r0, r9)
            r2 = 0
        L_0x019d:
            if (r2 >= r8) goto L_0x01b1
            android.view.View r0 = r7.getChildAt(r2)
            X.0R7 r1 = r7.A03(r0)
            int r0 = r0.getId()
            r6.put(r0, r1)
            int r2 = r2 + 1
            goto L_0x019d
        L_0x01b1:
            r5 = 0
        L_0x01b2:
            if (r5 >= r8) goto L_0x050c
            android.view.View r1 = r7.getChildAt(r5)
            X.0R7 r4 = r7.A03(r1)
            if (r4 == 0) goto L_0x020e
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            X.02c r3 = (X.C001702c) r3
            java.util.ArrayList r0 = r9.A00
            r0.add(r4)
            X.0R7 r0 = r4.A0Z
            if (r0 == 0) goto L_0x01d7
            X.05J r0 = (X.AnonymousClass05J) r0
            java.util.ArrayList r0 = r0.A00
            r0.remove(r4)
            r0 = 0
            r4.A0Z = r0
        L_0x01d7:
            r4.A0Z = r9
            r3.A03()
            int r0 = r1.getVisibility()
            r4.A0N = r0
            r4.A0e = r1
            boolean r0 = r1 instanceof X.AnonymousClass02X
            if (r0 == 0) goto L_0x01ef
            X.02X r1 = (X.AnonymousClass02X) r1
            boolean r0 = r9.A0A
            r1.A05(r4, r0)
        L_0x01ef:
            boolean r0 = r3.A0x
            r2 = -1
            if (r0 == 0) goto L_0x0229
            X.05K r4 = (X.AnonymousClass05K) r4
            int r13 = r3.A0e
            int r12 = r3.A0f
            float r1 = r3.A06
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0211
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x020e
            r4.A00 = r1
            r4.A02 = r2
        L_0x020c:
            r4.A03 = r2
        L_0x020e:
            int r5 = r5 + 1
            goto L_0x01b2
        L_0x0211:
            if (r13 == r2) goto L_0x021c
            if (r13 <= r2) goto L_0x020e
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.A00 = r0
            r4.A02 = r13
            goto L_0x020c
        L_0x021c:
            if (r12 == r2) goto L_0x020e
            if (r12 <= r2) goto L_0x020e
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.A00 = r0
            r4.A02 = r2
            r4.A03 = r12
            goto L_0x020e
        L_0x0229:
            int r13 = r3.A0g
            int r1 = r3.A0h
            int r0 = r3.A0i
            r19 = r0
            int r14 = r3.A0j
            int r0 = r3.A0c
            r18 = r0
            int r0 = r3.A0d
            r17 = r0
            float r12 = r3.A07
            int r0 = r3.A0D
            if (r0 == r2) goto L_0x0353
            java.lang.Object r14 = r6.get(r0)
            X.0R7 r14 = (X.AnonymousClass0R7) r14
            if (r14 == 0) goto L_0x025c
            float r13 = r3.A00
            int r12 = r3.A0E
            X.0G0 r0 = X.AnonymousClass0G0.CENTER
            X.0Qs r1 = r4.A08(r0)
            X.0Qs r0 = r14.A08(r0)
            r1.A05(r0, r12, r11, r10)
            r4.A00 = r13
        L_0x025c:
            if (r16 == 0) goto L_0x026c
            int r1 = r3.A0G
            if (r1 != r2) goto L_0x0266
            int r0 = r3.A0H
            if (r0 == r2) goto L_0x026c
        L_0x0266:
            int r0 = r3.A0H
            r4.A0P = r1
            r4.A0Q = r0
        L_0x026c:
            boolean r0 = r3.A0w
            r12 = -2
            if (r0 != 0) goto L_0x033e
            int r0 = r3.width
            if (r0 != r2) goto L_0x0333
            boolean r0 = r3.A0v
            if (r0 == 0) goto L_0x032f
            X.0Fr r1 = X.C02310Fr.MATCH_CONSTRAINT
        L_0x027b:
            X.0Fr[] r0 = r4.A0o
            r0[r11] = r1
            X.0G0 r0 = X.AnonymousClass0G0.LEFT
            X.0Qs r1 = r4.A08(r0)
            int r0 = r3.leftMargin
            r1.A01 = r0
            X.0G0 r0 = X.AnonymousClass0G0.RIGHT
            X.0Qs r1 = r4.A08(r0)
            int r0 = r3.rightMargin
            r1.A01 = r0
        L_0x0293:
            boolean r0 = r3.A10
            if (r0 != 0) goto L_0x031b
            int r0 = r3.height
            if (r0 != r2) goto L_0x0311
            boolean r0 = r3.A0u
            if (r0 == 0) goto L_0x030e
            X.0Fr r1 = X.C02310Fr.MATCH_CONSTRAINT
        L_0x02a1:
            X.0Fr[] r0 = r4.A0o
            r0[r10] = r1
            X.0G0 r0 = X.AnonymousClass0G0.TOP
            X.0Qs r1 = r4.A08(r0)
            int r0 = r3.topMargin
            r1.A01 = r0
            X.0G0 r0 = X.AnonymousClass0G0.BOTTOM
            X.0Qs r1 = r4.A08(r0)
            int r0 = r3.bottomMargin
            r1.A01 = r0
        L_0x02b9:
            java.lang.String r1 = r3.A0t
            r12 = 0
            if (r1 == 0) goto L_0x04a3
            int r14 = r1.length()
            if (r14 == 0) goto L_0x04a3
            r0 = 44
            int r13 = r1.indexOf(r0)
            r15 = 0
            if (r13 <= 0) goto L_0x02eb
            int r0 = r14 + -1
            if (r13 >= r0) goto L_0x02eb
            java.lang.String r2 = r1.substring(r11, r13)
            java.lang.String r0 = "W"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x02e7
            java.lang.String r0 = "H"
            boolean r0 = r2.equalsIgnoreCase(r0)
            r15 = -1
            if (r0 == 0) goto L_0x02e7
            r15 = 1
        L_0x02e7:
            int r0 = r13 + 1
            r2 = r15
            r15 = r0
        L_0x02eb:
            r0 = 58
            int r0 = r1.indexOf(r0)
            if (r0 < 0) goto L_0x0494
            int r14 = r14 - r10
            if (r0 >= r14) goto L_0x0494
            java.lang.String r13 = r1.substring(r15, r0)
            int r0 = r0 + 1
            java.lang.String r1 = r1.substring(r0)
            int r0 = r13.length()
            if (r0 <= 0) goto L_0x04ae
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x04ae
            goto L_0x0476
        L_0x030e:
            X.0Fr r1 = X.C02310Fr.MATCH_PARENT
            goto L_0x02a1
        L_0x0311:
            X.0Fr r1 = X.C02310Fr.MATCH_CONSTRAINT
            X.0Fr[] r0 = r4.A0o
            r0[r10] = r1
            r4.A0A(r11)
            goto L_0x02b9
        L_0x031b:
            X.0Fr r1 = X.C02310Fr.FIXED
            X.0Fr[] r0 = r4.A0o
            r0[r10] = r1
            int r0 = r3.height
            r4.A0A(r0)
            if (r0 != r12) goto L_0x02b9
            X.0Fr r1 = X.C02310Fr.WRAP_CONTENT
            X.0Fr[] r0 = r4.A0o
            r0[r10] = r1
            goto L_0x02b9
        L_0x032f:
            X.0Fr r1 = X.C02310Fr.MATCH_PARENT
            goto L_0x027b
        L_0x0333:
            X.0Fr r1 = X.C02310Fr.MATCH_CONSTRAINT
            X.0Fr[] r0 = r4.A0o
            r0[r11] = r1
            r4.A0B(r11)
            goto L_0x0293
        L_0x033e:
            X.0Fr r1 = X.C02310Fr.FIXED
            X.0Fr[] r0 = r4.A0o
            r0[r11] = r1
            int r0 = r3.width
            r4.A0B(r0)
            if (r0 != r12) goto L_0x0293
            X.0Fr r1 = X.C02310Fr.WRAP_CONTENT
            X.0Fr[] r0 = r4.A0o
            r0[r11] = r1
            goto L_0x0293
        L_0x0353:
            if (r13 == r2) goto L_0x0464
            java.lang.Object r13 = r6.get(r13)
            X.0R7 r13 = (X.AnonymousClass0R7) r13
            if (r13 == 0) goto L_0x036f
            X.0G0 r1 = X.AnonymousClass0G0.LEFT
            int r15 = r3.leftMargin
            r0 = r1
        L_0x0362:
            X.0Qs r1 = r4.A08(r1)
            X.0Qs r0 = r13.A08(r0)
            r13 = r18
            r1.A05(r0, r15, r13, r10)
        L_0x036f:
            r0 = r19
            if (r0 == r2) goto L_0x0453
            java.lang.Object r15 = r6.get(r0)
            X.0R7 r15 = (X.AnonymousClass0R7) r15
            if (r15 == 0) goto L_0x038e
            X.0G0 r1 = X.AnonymousClass0G0.RIGHT
            X.0G0 r0 = X.AnonymousClass0G0.LEFT
            int r14 = r3.rightMargin
        L_0x0381:
            X.0Qs r13 = r4.A08(r1)
            X.0Qs r1 = r15.A08(r0)
            r0 = r17
            r13.A05(r1, r14, r0, r10)
        L_0x038e:
            int r0 = r3.A0p
            if (r0 == r2) goto L_0x043d
            java.lang.Object r15 = r6.get(r0)
            X.0R7 r15 = (X.AnonymousClass0R7) r15
            if (r15 == 0) goto L_0x03ac
            X.0G0 r1 = X.AnonymousClass0G0.TOP
            int r14 = r3.topMargin
            int r13 = r3.A0P
            r0 = r1
        L_0x03a1:
            X.0Qs r1 = r4.A08(r1)
            X.0Qs r0 = r15.A08(r0)
            r1.A05(r0, r14, r13, r10)
        L_0x03ac:
            int r0 = r3.A0C
            if (r0 == r2) goto L_0x0429
            java.lang.Object r15 = r6.get(r0)
            X.0R7 r15 = (X.AnonymousClass0R7) r15
            if (r15 == 0) goto L_0x03cb
            X.0G0 r1 = X.AnonymousClass0G0.BOTTOM
            X.0G0 r0 = X.AnonymousClass0G0.TOP
            int r14 = r3.bottomMargin
            int r13 = r3.A0K
        L_0x03c0:
            X.0Qs r1 = r4.A08(r1)
            X.0Qs r0 = r15.A08(r0)
            r1.A05(r0, r14, r13, r10)
        L_0x03cb:
            int r13 = r3.A0A
            if (r13 == r2) goto L_0x0418
            android.util.SparseArray r0 = r7.A06
            java.lang.Object r1 = r0.get(r13)
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r14 = r6.get(r13)
            X.0R7 r14 = (X.AnonymousClass0R7) r14
            if (r14 == 0) goto L_0x0418
            if (r1 == 0) goto L_0x0418
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            boolean r0 = r0 instanceof X.C001702c
            if (r0 == 0) goto L_0x0418
            android.view.ViewGroup$LayoutParams r13 = r1.getLayoutParams()
            X.02c r13 = (X.C001702c) r13
            r3.A0z = r10
            r13.A0z = r10
            X.0G0 r0 = X.AnonymousClass0G0.BASELINE
            X.0Qs r1 = r4.A08(r0)
            X.0Qs r0 = r14.A08(r0)
            r1.A05(r0, r11, r2, r10)
            r4.A0h = r10
            X.0R7 r0 = r13.A0r
            r0.A0h = r10
            X.0G0 r0 = X.AnonymousClass0G0.TOP
            X.0Qs r0 = r4.A08(r0)
            r0.A02()
            X.0G0 r0 = X.AnonymousClass0G0.BOTTOM
            X.0Qs r0 = r4.A08(r0)
            r0.A02()
        L_0x0418:
            r13 = 0
            int r0 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x041f
            r4.A02 = r12
        L_0x041f:
            float r1 = r3.A08
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x025c
            r4.A06 = r1
            goto L_0x025c
        L_0x0429:
            int r0 = r3.A0B
            if (r0 == r2) goto L_0x03cb
            java.lang.Object r15 = r6.get(r0)
            X.0R7 r15 = (X.AnonymousClass0R7) r15
            if (r15 == 0) goto L_0x03cb
            X.0G0 r1 = X.AnonymousClass0G0.BOTTOM
            int r14 = r3.bottomMargin
            int r13 = r3.A0K
            r0 = r1
            goto L_0x03c0
        L_0x043d:
            int r0 = r3.A0o
            if (r0 == r2) goto L_0x03ac
            java.lang.Object r15 = r6.get(r0)
            X.0R7 r15 = (X.AnonymousClass0R7) r15
            if (r15 == 0) goto L_0x03ac
            X.0G0 r1 = X.AnonymousClass0G0.TOP
            X.0G0 r0 = X.AnonymousClass0G0.BOTTOM
            int r14 = r3.topMargin
            int r13 = r3.A0P
            goto L_0x03a1
        L_0x0453:
            if (r14 == r2) goto L_0x038e
            java.lang.Object r15 = r6.get(r14)
            X.0R7 r15 = (X.AnonymousClass0R7) r15
            if (r15 == 0) goto L_0x038e
            X.0G0 r1 = X.AnonymousClass0G0.RIGHT
            int r14 = r3.rightMargin
            r0 = r1
            goto L_0x0381
        L_0x0464:
            if (r1 == r2) goto L_0x036f
            java.lang.Object r13 = r6.get(r1)
            X.0R7 r13 = (X.AnonymousClass0R7) r13
            if (r13 == 0) goto L_0x036f
            X.0G0 r1 = X.AnonymousClass0G0.LEFT
            X.0G0 r0 = X.AnonymousClass0G0.RIGHT
            int r15 = r3.leftMargin
            goto L_0x0362
        L_0x0476:
            float r13 = java.lang.Float.parseFloat(r13)     // Catch:{ NumberFormatException -> 0x04ae }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x04ae }
            int r0 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x04ae
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x04ae
            if (r2 != r10) goto L_0x048e
            float r1 = r1 / r13
            float r1 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x04ae }
            goto L_0x04a6
        L_0x048e:
            float r13 = r13 / r1
            float r1 = java.lang.Math.abs(r13)     // Catch:{ NumberFormatException -> 0x04ae }
            goto L_0x04a6
        L_0x0494:
            java.lang.String r1 = r1.substring(r15)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x04ae
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x04ae }
            goto L_0x04a6
        L_0x04a3:
            r4.A01 = r12
            goto L_0x04ae
        L_0x04a6:
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x04ae
            r4.A01 = r1
            r4.A08 = r2
        L_0x04ae:
            float r0 = r3.A03
            float[] r1 = r4.A0j
            r1[r11] = r0
            float r0 = r3.A09
            r1[r10] = r0
            int r0 = r3.A0S
            r4.A0A = r0
            int r0 = r3.A0q
            r4.A0L = r0
            int r2 = r3.A0W
            int r0 = r3.A0a
            int r13 = r3.A0Y
            float r1 = r3.A05
            r4.A0D = r2
            r4.A0H = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r13 != r0) goto L_0x04d2
            r13 = 0
        L_0x04d2:
            r4.A0F = r13
            r4.A04 = r1
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x04e5
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x04e5
            if (r2 != 0) goto L_0x04e5
            r0 = 2
            r4.A0D = r0
        L_0x04e5:
            int r2 = r3.A0V
            int r0 = r3.A0Z
            int r13 = r3.A0X
            float r1 = r3.A04
            r4.A0C = r2
            r4.A0G = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r13 != r0) goto L_0x04f7
            r13 = 0
        L_0x04f7:
            r4.A0E = r13
            r4.A03 = r1
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x020e
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x020e
            if (r2 != 0) goto L_0x020e
            r0 = 2
            r4.A0C = r0
            goto L_0x020e
        L_0x050c:
            X.0NP r0 = r9.A07
            java.util.ArrayList r8 = r0.A02
            r8.clear()
            java.util.ArrayList r6 = r9.A00
            int r5 = r6.size()
            r4 = 0
        L_0x051a:
            if (r4 >= r5) goto L_0x0545
            java.lang.Object r3 = r6.get(r4)
            X.0R7 r3 = (X.AnonymousClass0R7) r3
            X.0Fr[] r0 = r3.A0o
            r0 = r0[r11]
            X.0Fr r10 = X.C02310Fr.MATCH_CONSTRAINT
            if (r0 == r10) goto L_0x053f
            X.0Fr[] r0 = r3.A0o
            r0 = r0[r11]
            X.0Fr r2 = X.C02310Fr.MATCH_PARENT
            if (r0 == r2) goto L_0x053f
            X.0Fr[] r0 = r3.A0o
            r1 = 1
            r0 = r0[r1]
            if (r0 == r10) goto L_0x053f
            X.0Fr[] r0 = r3.A0o
            r0 = r0[r1]
            if (r0 != r2) goto L_0x0542
        L_0x053f:
            r8.add(r3)
        L_0x0542:
            int r4 = r4 + 1
            goto L_0x051a
        L_0x0545:
            X.0Qm r1 = r9.A08
            r0 = 1
            r1.A07 = r0
        L_0x054a:
            int r0 = r7.A05
            r19 = r0
            r29 = r31
            int r13 = android.view.View.MeasureSpec.getMode(r29)
            int r3 = android.view.View.MeasureSpec.getSize(r29)
            r28 = r32
            int r12 = android.view.View.MeasureSpec.getMode(r28)
            int r2 = android.view.View.MeasureSpec.getSize(r28)
            int r0 = r7.getPaddingTop()
            r1 = 0
            int r8 = java.lang.Math.max(r1, r0)
            int r0 = r7.getPaddingBottom()
            int r0 = java.lang.Math.max(r1, r0)
            int r5 = r8 + r0
            int r4 = r7.getPaddingWidth()
            X.0cr r11 = r7.A09
            r11.A04 = r8
            r11.A02 = r0
            r11.A05 = r4
            r11.A03 = r5
            r0 = r29
            r11.A01 = r0
            r0 = r28
            r11.A00 = r0
            int r0 = r7.getPaddingStart()
            int r10 = java.lang.Math.max(r1, r0)
            int r0 = r7.getPaddingEnd()
            int r15 = java.lang.Math.max(r1, r0)
            if (r10 > 0) goto L_0x0728
            if (r15 > 0) goto L_0x0728
            int r0 = r7.getPaddingLeft()
            int r15 = java.lang.Math.max(r1, r0)
        L_0x05a7:
            int r3 = r3 - r4
            int r2 = r2 - r5
            r14 = r3
            r10 = r2
            int r6 = r11.A03
            int r1 = r11.A05
            X.0Fr r18 = X.C02310Fr.FIXED
            r25 = r18
            int r17 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            if (r13 == r0) goto L_0x071c
            if (r13 == 0) goto L_0x0717
            if (r13 == r4) goto L_0x070c
            r16 = r18
        L_0x05c4:
            r14 = 0
        L_0x05c5:
            if (r12 == r0) goto L_0x0700
            if (r12 == 0) goto L_0x06f8
            if (r12 != r4) goto L_0x06fd
            int r0 = r7.A01
            int r0 = r0 - r6
            int r10 = java.lang.Math.min(r0, r2)
        L_0x05d2:
            int r0 = r9.A05()
            if (r14 != r0) goto L_0x05de
            int r0 = r9.A04()
            if (r10 == r0) goto L_0x05e3
        L_0x05de:
            X.0Qm r4 = r9.A08
            r0 = 1
            r4.A08 = r0
        L_0x05e3:
            r9.A0P = r5
            r9.A0Q = r5
            int r0 = r7.A02
            int r0 = r0 - r1
            int[] r4 = r9.A0k
            r4[r5] = r0
            int r0 = r7.A01
            int r0 = r0 - r6
            r17 = 1
            r4[r17] = r0
            r9.A0J = r5
            r9.A0I = r5
            X.0Fr[] r0 = r9.A0o
            r24 = r0
            r0[r5] = r16
            r9.A0B(r14)
            r0[r17] = r18
            r9.A0A(r10)
            int r0 = r7.A04
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x060d
            r0 = 0
        L_0x060d:
            r9.A0J = r0
            int r0 = r7.A03
            int r0 = r0 - r6
            if (r0 >= 0) goto L_0x0615
            r0 = 0
        L_0x0615:
            r9.A0I = r0
            r9.A02 = r15
            r9.A03 = r8
            X.0NP r10 = r9.A07
            X.0rn r0 = r9.A06
            r27 = r0
            java.util.ArrayList r6 = r9.A00
            int r23 = r6.size()
            int r22 = r9.A05()
            int r21 = r9.A04()
            r1 = 128(0x80, float:1.794E-43)
            r0 = r19 & r1
            boolean r1 = X.AnonymousClass000.A1U(r0, r1)
            r8 = 0
            if (r1 != 0) goto L_0x0640
            r14 = 64
            r0 = r19 & 64
            if (r0 != r14) goto L_0x0671
        L_0x0640:
            r0 = r23
            if (r5 >= r0) goto L_0x0673
            java.lang.Object r14 = r6.get(r5)
            X.0R7 r14 = (X.AnonymousClass0R7) r14
            X.0Fr[] r0 = r14.A0o
            r0 = r0[r8]
            X.0Fr r15 = X.C02310Fr.MATCH_CONSTRAINT
            boolean r16 = X.AnonymousClass000.A1Y(r0, r15)
            X.0Fr[] r0 = r14.A0o
            r0 = r0[r17]
            boolean r0 = X.AnonymousClass000.A1Y(r0, r15)
            if (r16 == 0) goto L_0x0668
            if (r0 == 0) goto L_0x0668
            float r0 = r14.A01
            r15 = 0
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            r15 = 1
            if (r0 > 0) goto L_0x0669
        L_0x0668:
            r15 = 0
        L_0x0669:
            boolean r0 = r14.A0L()
            if (r0 == 0) goto L_0x06db
            if (r15 == 0) goto L_0x06db
        L_0x0671:
            r17 = 0
        L_0x0673:
            r6 = 1073741824(0x40000000, float:2.0)
            if (r13 != r6) goto L_0x0679
            if (r12 == r6) goto L_0x067c
        L_0x0679:
            r0 = 0
            if (r1 == 0) goto L_0x067d
        L_0x067c:
            r0 = 1
        L_0x067d:
            r17 = r17 & r0
            if (r17 == 0) goto L_0x08e9
            r0 = r4[r8]
            int r3 = java.lang.Math.min(r0, r3)
            r5 = 1
            r0 = r4[r5]
            int r2 = java.lang.Math.min(r0, r2)
            if (r13 != r6) goto L_0x069b
            r0 = r22
            if (r0 == r3) goto L_0x069b
            r9.A0B(r3)
            X.0Qm r0 = r9.A08
            r0.A07 = r5
        L_0x069b:
            if (r12 != r6) goto L_0x06a8
            r0 = r21
            if (r0 == r2) goto L_0x06a8
            r9.A0A(r2)
            X.0Qm r0 = r9.A08
            r0.A07 = r5
        L_0x06a8:
            if (r13 != r6) goto L_0x0841
            if (r12 != r6) goto L_0x0841
            X.0Qm r4 = r9.A08
            r16 = 1
            r15 = r1 & 1
            boolean r0 = r4.A07
            if (r0 != 0) goto L_0x06ba
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0751
        L_0x06ba:
            X.05P r1 = r4.A00
            java.util.ArrayList r0 = r1.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x06c2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0743
            java.lang.Object r2 = r3.next()
            X.0R7 r2 = (X.AnonymousClass0R7) r2
            r2.A0i = r8
            X.05W r0 = r2.A0c
            r0.A0G()
            X.05V r0 = r2.A0d
            r0.A0G()
            goto L_0x06c2
        L_0x06db:
            boolean r0 = r14.A0M()
            if (r0 == 0) goto L_0x06e4
            if (r15 == 0) goto L_0x06e4
            goto L_0x0671
        L_0x06e4:
            boolean r0 = r14 instanceof X.AnonymousClass05M
            if (r0 != 0) goto L_0x0671
            boolean r0 = r14.A0L()
            if (r0 != 0) goto L_0x0671
            boolean r0 = r14.A0M()
            if (r0 != 0) goto L_0x0671
            int r5 = r5 + 1
            goto L_0x0640
        L_0x06f8:
            X.0Fr r18 = X.C02310Fr.WRAP_CONTENT
            if (r17 != 0) goto L_0x06fd
            goto L_0x0704
        L_0x06fd:
            r10 = 0
            goto L_0x05d2
        L_0x0700:
            X.0Fr r18 = X.C02310Fr.WRAP_CONTENT
            if (r17 != 0) goto L_0x05d2
        L_0x0704:
            int r0 = r7.A03
            int r10 = java.lang.Math.max(r5, r0)
            goto L_0x05d2
        L_0x070c:
            int r14 = r7.A02
            int r14 = r14 - r1
            int r14 = java.lang.Math.min(r14, r3)
            r16 = r18
            goto L_0x05c5
        L_0x0717:
            X.0Fr r16 = X.C02310Fr.WRAP_CONTENT
            if (r17 != 0) goto L_0x05c4
            goto L_0x0720
        L_0x071c:
            X.0Fr r16 = X.C02310Fr.WRAP_CONTENT
            if (r17 != 0) goto L_0x05c5
        L_0x0720:
            int r14 = r7.A04
            int r14 = java.lang.Math.max(r5, r14)
            goto L_0x05c5
        L_0x0728:
            android.content.Context r0 = r7.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r6 = r0.flags
            r0 = 4194304(0x400000, float:5.877472E-39)
            r6 = r6 & r0
            r1 = 1
            if (r6 == 0) goto L_0x0740
            int r0 = r7.getLayoutDirection()
            if (r1 != r0) goto L_0x0740
            goto L_0x05a7
        L_0x0740:
            r15 = r10
            goto L_0x05a7
        L_0x0743:
            r1.A0i = r8
            X.05W r0 = r1.A0c
            r0.A0G()
            X.05V r0 = r1.A0d
            r0.A0G()
            r4.A08 = r8
        L_0x0751:
            X.05P r0 = r4.A01
            r4.A04(r0)
            X.05P r3 = r4.A00
            r3.A0P = r8
            r3.A0Q = r8
            X.0Fr[] r2 = r3.A0o
            r20 = r2[r8]
            r19 = r2[r5]
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0769
            r4.A01()
        L_0x0769:
            int r18 = r3.A06()
            int r17 = r3.A07()
            X.05W r0 = r3.A0c
            r26 = r0
            X.0cs r1 = r0.A05
            r0 = r18
            r1.A02(r0)
            X.05V r1 = r3.A0d
            X.0cs r14 = r1.A05
            r0 = r17
            r14.A02(r0)
            r4.A02()
            X.0Fr r14 = X.C02310Fr.WRAP_CONTENT
            r0 = r20
            if (r0 == r14) goto L_0x0792
            r0 = r19
            if (r0 != r14) goto L_0x07ac
        L_0x0792:
            if (r15 == 0) goto L_0x07ac
            java.util.ArrayList r0 = r4.A05
            java.util.Iterator r15 = r0.iterator()
        L_0x079a:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0810
            java.lang.Object r0 = r15.next()
            X.0ct r0 = (X.C07830ct) r0
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x079a
        L_0x07ac:
            r14 = r2[r8]
            r0 = r25
            if (r14 == r0) goto L_0x07d6
            X.0Fr r0 = X.C02310Fr.MATCH_PARENT
            if (r14 == r0) goto L_0x07d6
            r15 = 0
        L_0x07b7:
            java.util.ArrayList r4 = r4.A05
            java.util.Iterator r14 = r4.iterator()
        L_0x07bd:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x093e
            java.lang.Object r1 = r14.next()
            X.0ct r1 = (X.C07830ct) r1
            X.0R7 r0 = r1.A03
            if (r0 != r3) goto L_0x07d2
            boolean r0 = r1.A09
            if (r0 != 0) goto L_0x07d2
            goto L_0x07bd
        L_0x07d2:
            r1.A0B()
            goto L_0x07bd
        L_0x07d6:
            int r14 = r3.A05()
            int r14 = r14 + r18
            r0 = r26
            X.0cs r0 = r0.A04
            r0.A02(r14)
            r0 = r26
            X.05R r0 = r0.A06
            int r14 = r14 - r18
            r0.A02(r14)
            r4.A02()
            r14 = r2[r5]
            r0 = r25
            if (r14 == r0) goto L_0x07f9
            X.0Fr r0 = X.C02310Fr.MATCH_PARENT
            if (r14 != r0) goto L_0x080b
        L_0x07f9:
            int r14 = r3.A04()
            int r14 = r14 + r17
            X.0cs r0 = r1.A04
            r0.A02(r14)
            X.05R r0 = r1.A06
            int r14 = r14 - r17
            r0.A02(r14)
        L_0x080b:
            r4.A02()
            r15 = 1
            goto L_0x07b7
        L_0x0810:
            r0 = r20
            if (r0 != r14) goto L_0x0829
            r2[r8] = r25
            int r0 = r4.A00(r3, r8)
            r3.A0B(r0)
            r0 = r26
            X.05R r0 = r0.A06
            r15 = r0
            int r0 = r3.A05()
            r15.A02(r0)
        L_0x0829:
            r0 = r19
            if (r0 != r14) goto L_0x07ac
            r2[r5] = r25
            int r0 = r4.A00(r3, r5)
            r3.A0A(r0)
            X.05R r0 = r1.A06
            int r14 = r3.A04()
            r0.A02(r14)
            goto L_0x07ac
        L_0x0841:
            X.0Qm r3 = r9.A08
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x088f
            X.05P r4 = r3.A00
            java.util.ArrayList r0 = r4.A00
            java.util.Iterator r15 = r0.iterator()
        L_0x084f:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0874
            java.lang.Object r14 = r15.next()
            X.0R7 r14 = (X.AnonymousClass0R7) r14
            r14.A0i = r8
            X.05W r2 = r14.A0c
            X.05R r0 = r2.A06
            r0.A0B = r8
            r2.A09 = r8
            r2.A0G()
            X.05V r2 = r14.A0d
            X.05R r0 = r2.A06
            r0.A0B = r8
            r2.A09 = r8
            r2.A0G()
            goto L_0x084f
        L_0x0874:
            r4.A0i = r8
            X.05W r2 = r4.A0c
            X.05R r0 = r2.A06
            r0.A0B = r8
            r2.A09 = r8
            r2.A0G()
            X.05V r2 = r4.A0d
            X.05R r0 = r2.A06
            r0.A0B = r8
            r2.A09 = r8
            r2.A0G()
            r3.A01()
        L_0x088f:
            X.05P r0 = r3.A01
            r3.A04(r0)
            X.05P r2 = r3.A00
            r2.A0P = r8
            r2.A0Q = r8
            X.05W r0 = r2.A0c
            X.0cs r0 = r0.A05
            r0.A02(r8)
            X.05V r0 = r2.A0d
            X.0cs r0 = r0.A05
            r0.A02(r8)
            r0 = 1
            if (r13 != r6) goto L_0x08bd
            boolean r0 = r9.A0O(r8, r1)
            r0 = r0 & 1
            r2 = 1
        L_0x08b2:
            if (r12 != r6) goto L_0x08bf
            boolean r16 = r9.A0O(r5, r1)
            r16 = r16 & r0
            int r2 = r2 + 1
            goto L_0x08d9
        L_0x08bd:
            r2 = 0
            goto L_0x08b2
        L_0x08bf:
            r16 = r0
            goto L_0x08d9
        L_0x08c2:
            X.0cs r0 = r1.A05
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x08d2
            X.0cs r0 = r1.A04
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x092f
            boolean r0 = r1 instanceof X.AnonymousClass05S
            if (r0 != 0) goto L_0x092f
        L_0x08d2:
            r16 = 0
        L_0x08d4:
            r2[r8] = r20
            r2[r5] = r19
            r2 = 2
        L_0x08d9:
            if (r16 == 0) goto L_0x08e9
            boolean r1 = X.AnonymousClass000.A1U(r13, r6)
            boolean r0 = X.AnonymousClass000.A1U(r12, r6)
            r9.A0J(r1, r0)
            r0 = 2
            if (r2 == r0) goto L_0x0b1d
        L_0x08e9:
            if (r23 <= 0) goto L_0x0977
            java.util.ArrayList r0 = r9.A00
            int r12 = r0.size()
            X.0rn r6 = r9.A06
            r5 = 0
        L_0x08f4:
            if (r5 >= r12) goto L_0x0955
            java.util.ArrayList r0 = r9.A00
            java.lang.Object r4 = r0.get(r5)
            X.0R7 r4 = (X.AnonymousClass0R7) r4
            boolean r0 = r4 instanceof X.AnonymousClass05K
            if (r0 != 0) goto L_0x0912
            X.05W r0 = r4.A0c
            X.05R r0 = r0.A06
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0915
            X.05V r0 = r4.A0d
            X.05R r0 = r0.A06
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0915
        L_0x0912:
            int r5 = r5 + 1
            goto L_0x08f4
        L_0x0915:
            X.0Fr[] r1 = r4.A0o
            r0 = r1[r8]
            r3 = 1
            r2 = r1[r3]
            X.0Fr r1 = X.C02310Fr.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x092b
            int r0 = r4.A0D
            if (r0 == r3) goto L_0x092b
            if (r2 != r1) goto L_0x092b
            int r0 = r4.A0C
            if (r0 == r3) goto L_0x092b
            goto L_0x0912
        L_0x092b:
            r10.A00(r4, r6, r8)
            goto L_0x0912
        L_0x092f:
            X.05R r0 = r1.A06
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0942
            boolean r0 = r1 instanceof X.AnonymousClass05U
            if (r0 != 0) goto L_0x0942
            boolean r0 = r1 instanceof X.AnonymousClass05S
            if (r0 != 0) goto L_0x0942
            goto L_0x08d2
        L_0x093e:
            java.util.Iterator r4 = r4.iterator()
        L_0x0942:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x08d4
            java.lang.Object r1 = r4.next()
            X.0ct r1 = (X.C07830ct) r1
            if (r15 != 0) goto L_0x08c2
            X.0R7 r0 = r1.A03
            if (r0 != r3) goto L_0x08c2
            goto L_0x0942
        L_0x0955:
            X.0cr r6 = (X.C07810cr) r6
            androidx.constraintlayout.widget.ConstraintLayout r3 = r6.A06
            int r1 = r3.getChildCount()
            r2 = 0
            r0 = 0
        L_0x095f:
            if (r0 >= r1) goto L_0x0967
            r3.getChildAt(r0)
            int r0 = r0 + 1
            goto L_0x095f
        L_0x0967:
            java.util.ArrayList r1 = r3.A0D
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0977
        L_0x096f:
            r1.get(r2)
            int r2 = r2 + 1
            if (r2 >= r0) goto L_0x0977
            goto L_0x096f
        L_0x0977:
            int r6 = r9.A01
            java.util.ArrayList r5 = r10.A02
            int r4 = r5.size()
            if (r23 <= 0) goto L_0x099c
            int r2 = r9.A0J
            int r1 = r9.A0I
            r9.A0J = r8
            r9.A0I = r8
            r0 = r22
            r9.A0B(r0)
            r0 = r21
            r9.A0A(r0)
            r9.A0J = r2
            r9.A0I = r1
            X.05P r0 = r10.A00
            r0.A0N()
        L_0x099c:
            if (r4 <= 0) goto L_0x0b12
            r0 = r24[r8]
            X.0Fr r1 = X.C02310Fr.WRAP_CONTENT
            boolean r19 = X.AnonymousClass000.A1Y(r0, r1)
            r0 = 1
            r0 = r24[r0]
            boolean r18 = X.AnonymousClass000.A1Y(r0, r1)
            int r1 = r9.A05()
            X.05P r8 = r10.A00
            int r0 = r8.A0J
            int r3 = java.lang.Math.max(r1, r0)
            int r1 = r9.A04()
            int r0 = r8.A0I
            int r2 = java.lang.Math.max(r1, r0)
            r1 = 0
            r17 = 0
        L_0x09c6:
            java.lang.Object r12 = r5.get(r1)
            X.0R7 r12 = (X.AnonymousClass0R7) r12
            boolean r0 = r12 instanceof X.AnonymousClass05M
            if (r0 == 0) goto L_0x0a3d
            int r13 = r12.A05()
            int r14 = r12.A04()
            r15 = 1
            r0 = r27
            boolean r0 = r10.A00(r12, r0, r15)
            r17 = r17 | r0
            int r0 = r12.A05()
            int r15 = r12.A04()
            if (r0 == r13) goto L_0x0a10
            r12.A0B(r0)
            if (r19 == 0) goto L_0x0a0e
            int r13 = r12.A06()
            int r0 = r12.A0O
            int r13 = r13 + r0
            if (r13 <= r3) goto L_0x0a0e
            int r13 = r12.A06()
            int r0 = r12.A0O
            int r13 = r13 + r0
            X.0G0 r0 = X.AnonymousClass0G0.RIGHT
            X.0Qs r0 = r12.A08(r0)
            int r0 = r0.A00()
            int r3 = X.AnonymousClass001.A0B(r13, r0, r3)
        L_0x0a0e:
            r17 = 1
        L_0x0a10:
            if (r15 == r14) goto L_0x0a37
            r12.A0A(r15)
            if (r18 == 0) goto L_0x0a35
            int r13 = r12.A07()
            int r0 = r12.A09
            int r13 = r13 + r0
            if (r13 <= r2) goto L_0x0a35
            int r13 = r12.A07()
            int r0 = r12.A09
            int r13 = r13 + r0
            X.0G0 r0 = X.AnonymousClass0G0.BOTTOM
            X.0Qs r0 = r12.A08(r0)
            int r0 = r0.A00()
            int r2 = X.AnonymousClass001.A0B(r13, r0, r2)
        L_0x0a35:
            r17 = 1
        L_0x0a37:
            X.05M r12 = (X.AnonymousClass05M) r12
            boolean r0 = r12.A0A
            r17 = r17 | r0
        L_0x0a3d:
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x09c6
            r1 = 0
        L_0x0a42:
            r12 = 0
        L_0x0a43:
            java.lang.Object r13 = r5.get(r12)
            X.0R7 r13 = (X.AnonymousClass0R7) r13
            boolean r0 = r13 instanceof X.C15690rm
            if (r0 == 0) goto L_0x0a51
            boolean r0 = r13 instanceof X.AnonymousClass05M
            if (r0 == 0) goto L_0x0a6b
        L_0x0a51:
            boolean r0 = r13 instanceof X.AnonymousClass05K
            if (r0 != 0) goto L_0x0a6b
            int r14 = r13.A0N
            r0 = 8
            if (r14 == r0) goto L_0x0a6b
            X.05W r0 = r13.A0c
            X.05R r0 = r0.A06
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0a93
            X.05V r0 = r13.A0d
            X.05R r0 = r0.A06
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0a93
        L_0x0a6b:
            int r12 = r12 + 1
            if (r12 < r4) goto L_0x0a43
            if (r17 == 0) goto L_0x0a8d
            int r13 = r9.A0J
            int r12 = r9.A0I
            r0 = 0
            r9.A0J = r0
            r9.A0I = r0
            r0 = r22
            r9.A0B(r0)
            r0 = r21
            r9.A0A(r0)
            r9.A0J = r13
            r9.A0I = r12
            r8.A0N()
            r17 = 0
        L_0x0a8d:
            int r1 = r1 + 1
            r0 = 2
            if (r1 >= r0) goto L_0x0b12
            goto L_0x0a42
        L_0x0a93:
            boolean r0 = r13 instanceof X.AnonymousClass05M
            if (r0 != 0) goto L_0x0a6b
            int r14 = r13.A05()
            int r16 = r13.A04()
            int r0 = r13.A07
            r20 = r0
            r15 = 1
            r0 = r27
            boolean r0 = r10.A00(r13, r0, r15)
            r17 = r17 | r0
            int r0 = r13.A05()
            int r15 = r13.A04()
            if (r0 == r14) goto L_0x0adb
            r13.A0B(r0)
            if (r19 == 0) goto L_0x0ad9
            int r14 = r13.A06()
            int r0 = r13.A0O
            int r14 = r14 + r0
            if (r14 <= r3) goto L_0x0ad9
            int r14 = r13.A06()
            int r0 = r13.A0O
            int r14 = r14 + r0
            X.0G0 r0 = X.AnonymousClass0G0.RIGHT
            X.0Qs r0 = r13.A08(r0)
            int r0 = r0.A00()
            int r3 = X.AnonymousClass001.A0B(r14, r0, r3)
        L_0x0ad9:
            r17 = 1
        L_0x0adb:
            r0 = r16
            if (r15 == r0) goto L_0x0b04
            r13.A0A(r15)
            if (r18 == 0) goto L_0x0b02
            int r14 = r13.A07()
            int r0 = r13.A09
            int r14 = r14 + r0
            if (r14 <= r2) goto L_0x0b02
            int r14 = r13.A07()
            int r0 = r13.A09
            int r14 = r14 + r0
            X.0G0 r0 = X.AnonymousClass0G0.BOTTOM
            X.0Qs r0 = r13.A08(r0)
            int r0 = r0.A00()
            int r2 = X.AnonymousClass001.A0B(r14, r0, r2)
        L_0x0b02:
            r17 = 1
        L_0x0b04:
            boolean r0 = r13.A0h
            if (r0 == 0) goto L_0x0a6b
            int r13 = r13.A07
            r0 = r20
            if (r0 == r13) goto L_0x0a6b
            r17 = 1
            goto L_0x0a6b
        L_0x0b12:
            r9.A01 = r6
            r0 = 256(0x100, float:3.59E-43)
            r6 = r6 & r0
            boolean r0 = X.AnonymousClass000.A1U(r6, r0)
            X.C05620Uf.A0F = r0
        L_0x0b1d:
            int r2 = r9.A05()
            int r5 = r9.A04()
            boolean r3 = r9.A0B
            boolean r4 = r9.A09
            int r1 = r11.A03
            int r0 = r11.A05
            int r2 = r2 + r0
            int r5 = r5 + r1
            r1 = 0
            r0 = r29
            int r2 = android.view.View.resolveSizeAndState(r2, r0, r1)
            r0 = r28
            int r1 = android.view.View.resolveSizeAndState(r5, r0, r1)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            r1 = r1 & r0
            int r0 = r7.A02
            int r2 = java.lang.Math.min(r0, r2)
            int r0 = r7.A01
            int r1 = java.lang.Math.min(r0, r1)
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r3 == 0) goto L_0x0b52
            r2 = r2 | r0
        L_0x0b52:
            if (r4 == 0) goto L_0x0b55
            r1 = r1 | r0
        L_0x0b55:
            r7.setMeasuredDimension(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public ConstraintLayout(Context context) {
        super(context);
        AnonymousClass05J.A00(this);
        this.A04 = 0;
        this.A03 = 0;
        this.A02 = Integer.MAX_VALUE;
        this.A01 = Integer.MAX_VALUE;
        this.A0F = true;
        this.A05 = 263;
        this.A0B = null;
        this.A0A = null;
        this.A00 = -1;
        this.A0E = AnonymousClass001.A0t();
        this.A07 = new SparseArray();
        this.A09 = new C07810cr(this, this);
        A04((AttributeSet) null, 0, 0);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C001702c(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass05J.A00(this);
        C07810cr.A00(this);
        A04(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass05J.A00(this);
        C07810cr.A00(this);
        A04(attributeSet, 0, 0);
    }
}
