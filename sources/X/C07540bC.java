package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: X.0bC  reason: invalid class name and case insensitive filesystem */
public class C07540bC implements C16920uF {
    public static Method A0P;
    public static Method A0Q;
    public static Method A0R;
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03 = -2;
    public Context A04;
    public DataSetObserver A05;
    public Rect A06;
    public View A07;
    public AdapterView.OnItemClickListener A08;
    public AdapterView.OnItemSelectedListener A09;
    public ListAdapter A0A;
    public PopupWindow A0B;
    public C002803e A0C;
    public Runnable A0D;
    public boolean A0E;
    public boolean A0F = false;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final Rect A0J = AnonymousClass001.A0N();
    public final Handler A0K;
    public final C10760iT A0L = new C10760iT(this);
    public final C07320ag A0M = new C07320ag(this);
    public final C07150aP A0N = new C07150aP(this);
    public final C10770iU A0O = new C10770iU(this);

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                A0Q = AnonymousClass002.A0H(cls, Boolean.TYPE, "setClipToScreenEnabled", new Class[1], 0);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                A0R = AnonymousClass002.A0H(PopupWindow.class, Rect.class, "setEpicenterBounds", new Class[1], 0);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                Class[] clsArr = new Class[3];
                clsArr[0] = View.class;
                clsArr[1] = Integer.TYPE;
                A0P = AnonymousClass002.A0H(cls2, Boolean.TYPE, "getMaxAvailableHeight", clsArr, 2);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C002803e A01(Context context, boolean z) {
        return new C002803e(context, z);
    }

    public void A02(int i) {
        Drawable background = this.A0B.getBackground();
        if (background != null) {
            Rect rect = this.A0J;
            background.getPadding(rect);
            this.A03 = rect.left + rect.right + i;
            return;
        }
        this.A03 = i;
    }

    public Drawable B4b() {
        return this.A0B.getBackground();
    }

    public int B8A() {
        return this.A01;
    }

    public int BEF() {
        if (!this.A0E) {
            return 0;
        }
        return this.A02;
    }

    public boolean BIy() {
        return this.A0B.isShowing();
    }

    public void Ble(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.A05;
        if (dataSetObserver == null) {
            this.A05 = new AnonymousClass00o(this);
        } else {
            ListAdapter listAdapter2 = this.A0A;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.A0A = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.A05);
        }
        C002803e r1 = this.A0C;
        if (r1 != null) {
            r1.setAdapter(this.A0A);
        }
    }

    public void Bln(Drawable drawable) {
        this.A0B.setBackgroundDrawable(drawable);
    }

    public void Bnk(int i) {
        this.A02 = i;
        this.A0E = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bod() {
        /*
            r17 = this;
            r3 = r17
            X.03e r0 = r3.A0C
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r9 = 1
            if (r0 != 0) goto L_0x0089
            android.content.Context r1 = r3.A04
            X.0iS r0 = new X.0iS
            r0.<init>(r3)
            r3.A0D = r0
            boolean r0 = r3.A0G
            r0 = r0 ^ 1
            X.03e r1 = r3.A01(r1, r0)
            r3.A0C = r1
            android.widget.ListAdapter r0 = r3.A0A
            r1.setAdapter(r0)
            X.03e r1 = r3.A0C
            android.widget.AdapterView$OnItemClickListener r0 = r3.A08
            r1.setOnItemClickListener(r0)
            X.03e r0 = r3.A0C
            r0.setFocusable(r9)
            X.03e r0 = r3.A0C
            r0.setFocusableInTouchMode(r9)
            X.03e r4 = r3.A0C
            r1 = 0
            X.0MU r0 = new X.0MU
            r0.<init>(r3, r1)
            r4.setOnItemSelectedListener(r0)
            X.03e r1 = r3.A0C
            X.0ag r0 = r3.A0M
            r1.setOnScrollListener(r0)
            android.widget.AdapterView$OnItemSelectedListener r1 = r3.A09
            if (r1 == 0) goto L_0x004e
            X.03e r0 = r3.A0C
            r0.setOnItemSelectedListener(r1)
        L_0x004e:
            X.03e r0 = r3.A0C
            r10 = 0
            android.widget.PopupWindow r11 = r3.A0B
            r11.setContentView(r0)
        L_0x0056:
            android.graphics.drawable.Drawable r0 = r11.getBackground()
            android.graphics.Rect r7 = r3.A0J
            if (r0 == 0) goto L_0x0084
            r0.getPadding(r7)
            int r1 = r7.top
            int r4 = r7.bottom
            int r4 = r4 + r1
            boolean r0 = r3.A0E
            if (r0 != 0) goto L_0x006d
            int r0 = -r1
            r3.A02 = r0
        L_0x006d:
            int r1 = r11.getInputMethodMode()
            r0 = 2
            if (r1 == r0) goto L_0x0075
            r9 = 0
        L_0x0075:
            android.view.View r8 = r3.A07
            int r5 = r3.A02
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 > r0) goto L_0x00b2
            java.lang.reflect.Method r1 = A0P
            if (r1 == 0) goto L_0x00ad
            goto L_0x0090
        L_0x0084:
            r7.setEmpty()
            r4 = 0
            goto L_0x006d
        L_0x0089:
            android.widget.PopupWindow r11 = r3.A0B
            r11.getContentView()
            r10 = 0
            goto L_0x0056
        L_0x0090:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00a6 }
            r0[r10] = r8     // Catch:{ Exception -> 0x00a6 }
            X.AnonymousClass000.A1M(r0, r5)     // Catch:{ Exception -> 0x00a6 }
            X.AnonymousClass001.A1S(r0, r9)     // Catch:{ Exception -> 0x00a6 }
            java.lang.Object r0 = r1.invoke(r11, r0)     // Catch:{ Exception -> 0x00a6 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x00a6 }
            int r5 = r0.intValue()     // Catch:{ Exception -> 0x00a6 }
            goto L_0x00b6
        L_0x00a6:
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r0 = "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version."
            android.util.Log.i(r1, r0)
        L_0x00ad:
            int r5 = r11.getMaxAvailableHeight(r8, r5)
            goto L_0x00b6
        L_0x00b2:
            int r5 = r11.getMaxAvailableHeight(r8, r5, r9)
        L_0x00b6:
            int r1 = r3.A03
            r0 = -2
            if (r1 == r0) goto L_0x01be
            r6 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L_0x01be
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
        L_0x00c3:
            X.03e r0 = r3.A0C
            r6 = -1
            int r1 = r0.A00(r1, r5)
            if (r1 <= 0) goto L_0x00db
            X.03e r0 = r3.A0C
            int r2 = r0.getPaddingTop()
            X.03e r0 = r3.A0C
            int r0 = r0.getPaddingBottom()
            int r2 = r2 + r0
            int r4 = r4 + r2
            int r10 = r10 + r4
        L_0x00db:
            int r1 = r1 + r10
            r11.getInputMethodMode()
            r0 = 1002(0x3ea, float:1.404E-42)
            X.C05230Sn.A00(r11, r0)
            boolean r0 = r11.isShowing()
            r4 = 1
            r2 = -2
            r7 = 0
            if (r0 == 0) goto L_0x011d
            android.view.View r0 = r3.A07
            boolean r0 = X.C06360Xi.A04(r0)
            if (r0 == 0) goto L_0x0113
            int r15 = r3.A03
            if (r15 != r6) goto L_0x0114
            r15 = -1
        L_0x00fa:
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x00ff
            r4 = 0
        L_0x00ff:
            r11.setOutsideTouchable(r4)
            android.view.View r12 = r3.A07
            int r13 = r3.A01
            int r14 = r3.A02
            if (r15 >= 0) goto L_0x010b
            r15 = -1
        L_0x010b:
            if (r1 >= 0) goto L_0x010e
            r1 = -1
        L_0x010e:
            r16 = r1
            r11.update(r12, r13, r14, r15, r16)
        L_0x0113:
            return
        L_0x0114:
            if (r15 != r2) goto L_0x00fa
            android.view.View r0 = r3.A07
            int r15 = r0.getWidth()
            goto L_0x00fa
        L_0x011d:
            int r0 = r3.A03
            if (r0 != r6) goto L_0x0134
            r0 = -1
        L_0x0122:
            r11.setWidth(r0)
            r11.setHeight(r1)
            r5 = 1
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 > r0) goto L_0x0151
            java.lang.reflect.Method r2 = A0Q
            if (r2 == 0) goto L_0x0154
            goto L_0x013d
        L_0x0134:
            if (r0 != r2) goto L_0x0122
            android.view.View r0 = r3.A07
            int r0 = r0.getWidth()
            goto L_0x0122
        L_0x013d:
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0149 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x0149 }
            r1[r7] = r0     // Catch:{ Exception -> 0x0149 }
            r2.invoke(r11, r1)     // Catch:{ Exception -> 0x0149 }
            goto L_0x0154
        L_0x0149:
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r0 = "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r1, r0)
            goto L_0x0154
        L_0x0151:
            r11.setIsClippedToScreen(r4)
        L_0x0154:
            boolean r0 = r3.A0F
            boolean r0 = X.AnonymousClass000.A1T(r0)
            r11.setOutsideTouchable(r0)
            X.0aP r0 = r3.A0N
            r11.setTouchInterceptor(r0)
            boolean r0 = r3.A0I
            if (r0 == 0) goto L_0x016b
            boolean r0 = r3.A0H
            X.C05230Sn.A01(r11, r0)
        L_0x016b:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 > r0) goto L_0x0188
            java.lang.reflect.Method r2 = A0R
            if (r2 == 0) goto L_0x018d
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x017f }
            android.graphics.Rect r0 = r3.A06     // Catch:{ Exception -> 0x017f }
            r1[r7] = r0     // Catch:{ Exception -> 0x017f }
            r2.invoke(r11, r1)     // Catch:{ Exception -> 0x017f }
            goto L_0x018d
        L_0x017f:
            r2 = move-exception
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r0 = "Could not invoke setEpicenterBounds on PopupWindow"
            android.util.Log.e(r1, r0, r2)
            goto L_0x018d
        L_0x0188:
            android.graphics.Rect r0 = r3.A06
            r11.setEpicenterBounds(r0)
        L_0x018d:
            android.view.View r4 = r3.A07
            int r2 = r3.A01
            int r1 = r3.A02
            int r0 = r3.A00
            X.AnonymousClass0IL.A00(r4, r11, r2, r1, r0)
            X.03e r0 = r3.A0C
            r0.setSelection(r6)
            boolean r0 = r3.A0G
            if (r0 == 0) goto L_0x01a9
            X.03e r0 = r3.A0C
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L_0x01b2
        L_0x01a9:
            X.03e r0 = r3.A0C
            if (r0 == 0) goto L_0x01b2
            r0.A0B = r5
            r0.requestLayout()
        L_0x01b2:
            boolean r0 = r3.A0G
            if (r0 != 0) goto L_0x0113
            android.os.Handler r1 = r3.A0K
            X.0iT r0 = r3.A0L
            r1.post(r0)
            return
        L_0x01be:
            android.content.Context r0 = r3.A04
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r0)
            int r2 = r0.widthPixels
            int r1 = r7.left
            int r0 = r7.right
            int r1 = r1 + r0
            int r2 = r2 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r6)
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07540bC.Bod():void");
    }

    public void dismiss() {
        PopupWindow popupWindow = this.A0B;
        popupWindow.dismiss();
        popupWindow.setContentView((View) null);
        this.A0C = null;
        this.A0K.removeCallbacks(this.A0O);
    }

    public ListView getListView() {
        return this.A0C;
    }

    public C07540bC(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A04 = context;
        this.A0K = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0KC.A0D, i, i2);
        this.A01 = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.A02 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.A0E = true;
        }
        obtainStyledAttributes.recycle();
        C003003h r0 = new C003003h(context, attributeSet, i, i2);
        this.A0B = r0;
        r0.setInputMethodMode(1);
    }

    public void BmN(int i) {
        this.A01 = i;
    }
}
