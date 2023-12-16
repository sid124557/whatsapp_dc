package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import java.util.Locale;

/* renamed from: X.6Fx  reason: invalid class name and case insensitive filesystem */
public class C125156Fx extends AnonymousClass031 {
    public int A00;
    public ColorStateList A01;
    public final float A02;
    public final int A03;
    public final Rect A04 = AnonymousClass001.A0N();
    public final AccessibilityManager A05;
    public final C07540bC A06;

    public void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.A05;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.dismissDropDown();
        } else {
            this.A06.dismiss();
        }
    }

    public float getPopupElevation() {
        return this.A02;
    }

    public int getSimpleItemSelectedColor() {
        return this.A00;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.A01;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int selectedItemPosition;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout A012 = A01();
            int i4 = 0;
            if (adapter == null || A012 == null) {
                i3 = 0;
            } else {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C07540bC r1 = this.A06;
                PopupWindow popupWindow = r1.A0B;
                if (!popupWindow.isShowing()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = r1.A0C.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i5 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i4) {
                        view = null;
                        i4 = itemViewType;
                    }
                    view = adapter.getView(max, view, A012);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i5 = Math.max(i5, view.getMeasuredWidth());
                }
                Drawable background = popupWindow.getBackground();
                if (background != null) {
                    Rect rect = this.A04;
                    background.getPadding(rect);
                    i5 += rect.left + rect.right;
                }
                i3 = i5 + A012.A17.A0H.getMeasuredWidth();
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onWindowFocusChanged(boolean z) {
        AccessibilityManager accessibilityManager = this.A05;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.onWindowFocusChanged(z);
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.A00 = i;
        if (getAdapter() instanceof AnonymousClass6F8) {
            ((AnonymousClass6F8) getAdapter()).A00();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.A01 = colorStateList;
        if (getAdapter() instanceof AnonymousClass6F8) {
            ((AnonymousClass6F8) getAdapter()).A00();
        }
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.A05;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.A06.Bod();
        }
    }

    public C125156Fx(Context context, AttributeSet attributeSet) {
        super(C105515Vh.A00(context, attributeSet, R.attr.f3nameremoved, 0), attributeSet, R.attr.f3nameremoved);
        Context context2 = getContext();
        TypedArray A002 = C161837qd.A00(context2, attributeSet, C1463179t.A0H, new int[0], R.attr.f3nameremoved, R.style.f12nameremoved);
        if (A002.hasValue(0) && A002.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.A03 = A002.getResourceId(2, R.layout.f8nameremoved);
        this.A02 = (float) A002.getDimensionPixelOffset(1, R.dimen.f6nameremoved);
        this.A00 = A002.getColor(3, 0);
        this.A01 = C160917of.A00(context2, A002, 4);
        this.A05 = (AccessibilityManager) context2.getSystemService("accessibility");
        C07540bC r3 = new C07540bC(context2, (AttributeSet) null, R.attr.f3nameremoved, 0);
        this.A06 = r3;
        r3.A0G = true;
        PopupWindow popupWindow = r3.A0B;
        popupWindow.setFocusable(true);
        r3.A07 = this;
        popupWindow.setInputMethodMode(2);
        r3.Ble(getAdapter());
        r3.A08 = new C1892190l(this, 0);
        if (A002.hasValue(5)) {
            setSimpleItems(A002.getResourceId(5, 0));
        }
        A002.recycle();
    }

    public final TextInputLayout A01() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public CharSequence getHint() {
        TextInputLayout A012 = A01();
        if (A012 == null || !A012.A0y) {
            return super.getHint();
        }
        return A012.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout A012 = A01();
        if (A012 != null && A012.A0y && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A06.dismiss();
    }

    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.A06.Ble(getAdapter());
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C07540bC r0 = this.A06;
        if (r0 != null) {
            r0.Bln(drawable);
        }
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.A06.A09 = getOnItemSelectedListener();
    }

    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout A012 = A01();
        if (A012 != null) {
            A012.A05();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new AnonymousClass6F8(getContext(), this, strArr, this.A03));
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }
}
