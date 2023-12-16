package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.02X  reason: invalid class name */
public abstract class AnonymousClass02X extends View {
    public int A00;
    public Context A01;
    public C15690rm A02;
    public String A03;
    public HashMap A04 = AnonymousClass001.A0t();
    public int[] A05 = new int[32];

    public final int A00(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (!(str == null || (resources = this.A01.getResources()) == null)) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        str2 = null;
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setReferencedIds(int[] iArr) {
        this.A03 = null;
        this.A00 = 0;
        for (int A032 : iArr) {
            A03(A032);
        }
    }

    public void A02() {
        if (this.A02 != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C001702c) {
                ((C001702c) layoutParams).A0r = (AnonymousClass0R7) this.A02;
            }
        }
    }

    public void A04(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0K9.A01);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.A03 = string;
                    setIds(string);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        if (r2 != 0) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        if (r2 == 0) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        if (r4 != null) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(java.lang.String r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x009d
            int r0 = r8.length()
            if (r0 == 0) goto L_0x009d
            android.content.Context r6 = r7.A01
            if (r6 == 0) goto L_0x009d
            java.lang.String r3 = r8.trim()
            android.view.ViewParent r0 = r7.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L_0x001b
            r7.getParent()
        L_0x001b:
            android.view.ViewParent r0 = r7.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r5 = 0
            if (r0 == 0) goto L_0x005b
            android.view.ViewParent r4 = r7.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
        L_0x002a:
            boolean r0 = r7.isInEditMode()
            r2 = 0
            if (r0 == 0) goto L_0x0058
            if (r4 == 0) goto L_0x005d
            if (r3 == 0) goto L_0x0056
            java.util.HashMap r0 = r4.A0E
            if (r0 == 0) goto L_0x0056
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0056
            java.util.HashMap r0 = r4.A0E
            java.lang.Object r1 = r0.get(r3)
        L_0x0045:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x004f
            int r2 = X.AnonymousClass001.A0K(r1)
            if (r2 != 0) goto L_0x0091
        L_0x004f:
            int r2 = r7.A00(r4, r3)
            if (r2 != 0) goto L_0x0091
            goto L_0x005d
        L_0x0056:
            r1 = 0
            goto L_0x0045
        L_0x0058:
            if (r4 == 0) goto L_0x005d
            goto L_0x004f
        L_0x005b:
            r4 = r5
            goto L_0x002a
        L_0x005d:
            java.lang.Class<X.0H8> r0 = X.AnonymousClass0H8.class
            java.lang.reflect.Field r0 = r0.getField(r3)     // Catch:{ Exception -> 0x0067 }
            int r2 = r0.getInt(r5)     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            if (r2 != 0) goto L_0x0091
            android.content.res.Resources r2 = r6.getResources()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "id"
            int r2 = r2.getIdentifier(r3, r0, r1)
            if (r2 != 0) goto L_0x0091
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Could not find id of \""
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "\""
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r1)
            return
        L_0x0091:
            java.util.HashMap r1 = r7.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r3)
            r7.A03(r2)
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02X.A08(java.lang.String):void");
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.A05, this.A00);
    }

    public void setIds(String str) {
        this.A03 = str;
        if (str != null) {
            int i = 0;
            this.A00 = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    A08(str.substring(i));
                    return;
                } else {
                    A08(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public AnonymousClass02X(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = context;
        A04(attributeSet);
    }

    public void A01() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            A06((ConstraintLayout) parent);
        }
    }

    public final void A03(int i) {
        if (i != getId()) {
            int i2 = this.A00 + 1;
            int[] iArr = this.A05;
            int length = iArr.length;
            if (i2 > length) {
                iArr = Arrays.copyOf(iArr, length * 2);
                this.A05 = iArr;
            }
            int i3 = this.A00;
            iArr[i3] = i;
            this.A00 = i3 + 1;
        }
    }

    public void A05(AnonymousClass0R7 r1, boolean z) {
    }

    public void A06(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.A00; i++) {
            View view = (View) constraintLayout.A06.get(this.A05[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.A03;
        if (str != null) {
            setIds(str);
        }
    }

    public void A07(ConstraintLayout constraintLayout) {
    }

    public void onDraw(Canvas canvas) {
    }

    public AnonymousClass02X(Context context) {
        super(context);
        this.A01 = context;
        A04((AttributeSet) null);
    }

    public AnonymousClass02X(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = context;
        A04(attributeSet);
    }
}
