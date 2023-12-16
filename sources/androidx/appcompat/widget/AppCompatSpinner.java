package androidx.appcompat.widget;

import X.AnonymousClass001;
import X.AnonymousClass02R;
import X.AnonymousClass0XW;
import X.C04780Qq;
import X.C07190aT;
import X.C07390an;
import X.C15000qc;
import X.C17080uX;
import X.C18180ws;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.whatsapp.R;

public class AppCompatSpinner extends Spinner implements C15000qc {
    public static final int[] A08 = {16843505};
    public int A00;
    public SpinnerAdapter A01;
    public C17080uX A02;
    public C07190aT A03;
    public final Context A04;
    public final Rect A05;
    public final C04780Qq A06;
    public final boolean A07;

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    public int A00(Drawable drawable, SpinnerAdapter spinnerAdapter) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int A0C = AnonymousClass001.A0C(max, 15 - (min - max), 0); A0C < min; A0C++) {
            int itemViewType = spinnerAdapter.getItemViewType(A0C);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(A0C, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        Rect rect = this.A05;
        drawable.getPadding(rect);
        return i2 + rect.left + rect.right;
    }

    public int getDropDownHorizontalOffset() {
        C17080uX r0 = this.A02;
        if (r0 != null) {
            return r0.B8A();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        C17080uX r0 = this.A02;
        if (r0 != null) {
            return r0.BEF();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.A02 != null) {
            return this.A00;
        }
        return super.getDropDownWidth();
    }

    public final C17080uX getInternalPopup() {
        return this.A02;
    }

    public Drawable getPopupBackground() {
        C17080uX r0 = this.A02;
        if (r0 != null) {
            return r0.B4b();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.A04;
    }

    public CharSequence getPrompt() {
        C17080uX r0 = this.A02;
        if (r0 != null) {
            return r0.B87();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C04780Qq r0 = this.A06;
        if (r0 != null) {
            return C04780Qq.A00(r0);
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C04780Qq r0 = this.A06;
        if (r0 != null) {
            return C04780Qq.A01(r0);
        }
        return null;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AnonymousClass02R r4 = (AnonymousClass02R) parcelable;
        super.onRestoreInstanceState(r4.getSuperState());
        if (r4.A00 && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C18180ws(this, 2));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C07190aT r0 = this.A03;
        if (r0 == null || !r0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C17080uX r2 = this.A02;
        if (r2 == null) {
            return super.performClick();
        }
        if (r2.BIy()) {
            return true;
        }
        r2.Boe(getTextDirection(), getTextAlignment());
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.A07) {
            this.A01 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        C17080uX r2 = this.A02;
        if (r2 != null) {
            Context context = this.A04;
            if (context == null) {
                context = getContext();
            }
            r2.Ble(new C07390an(context.getTheme(), spinnerAdapter));
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C17080uX r0 = this.A02;
        if (r0 != null) {
            r0.BmO(i);
            r0.BmN(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        C17080uX r0 = this.A02;
        if (r0 != null) {
            r0.Bnk(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.A02 != null) {
            this.A00 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C17080uX r0 = this.A02;
        if (r0 != null) {
            r0.Bln(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AnonymousClass0XW.A01(this.A04, i));
    }

    public void setPrompt(CharSequence charSequence) {
        C17080uX r0 = this.A02;
        if (r0 != null) {
            r0.Bn7(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C04780Qq r0 = this.A06;
        if (r0 != null) {
            r0.A05(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C04780Qq r0 = this.A06;
        if (r0 != null) {
            r0.A06(mode);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C04780Qq r0 = this.A06;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C17080uX r1 = this.A02;
        if (r1 != null && r1.BIy()) {
            r1.dismiss();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A02 != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), A00(getBackground(), getAdapter())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r1 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            X.02R r2 = new X.02R
            r2.<init>((android.os.Parcelable) r0)
            X.0uX r0 = r3.A02
            if (r0 == 0) goto L_0x0014
            boolean r1 = r0.BIy()
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r2.A00 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.onSaveInstanceState():android.os.Parcelable");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C04780Qq r0 = this.A06;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C04780Qq r0 = this.A06;
        if (r0 != null) {
            r0.A04(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r6 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12, android.content.res.Resources.Theme r13) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()
            r8.A05 = r0
            X.AnonymousClass0XB.A04(r8)
            int[] r7 = X.AnonymousClass0KC.A0K
            r2 = 0
            X.0UD r4 = X.AnonymousClass0UD.A00(r9, r10, r7, r11, r2)
            X.0Qq r0 = new X.0Qq
            r0.<init>(r8)
            r8.A06 = r0
            if (r13 == 0) goto L_0x0028
            X.00m r1 = new X.00m
            r1.<init>((android.content.Context) r9, (android.content.res.Resources.Theme) r13)
        L_0x0021:
            r8.A04 = r1
        L_0x0023:
            r0 = -1
            r5 = 0
            if (r12 != r0) goto L_0x0065
            goto L_0x003a
        L_0x0028:
            r1 = 4
            android.content.res.TypedArray r0 = r4.A02
            int r0 = r0.getResourceId(r1, r2)
            if (r0 == 0) goto L_0x0037
            X.00m r1 = new X.00m
            r1.<init>((android.content.Context) r9, (int) r0)
            goto L_0x0021
        L_0x0037:
            r8.A04 = r9
            goto L_0x0023
        L_0x003a:
            int[] r0 = A08     // Catch:{ Exception -> 0x004f, all -> 0x004d }
            android.content.res.TypedArray r6 = r9.obtainStyledAttributes(r10, r0, r11, r2)     // Catch:{ Exception -> 0x004f, all -> 0x004d }
            boolean r0 = r6.hasValue(r2)     // Catch:{ Exception -> 0x004b }
            if (r0 == 0) goto L_0x0062
            int r12 = r6.getInt(r2, r2)     // Catch:{ Exception -> 0x004b }
            goto L_0x0062
        L_0x004b:
            r3 = move-exception
            goto L_0x0051
        L_0x004d:
            r0 = move-exception
            throw r0
        L_0x004f:
            r3 = move-exception
            r6 = r5
        L_0x0051:
            java.lang.String r1 = "AppCompatSpinner"
            java.lang.String r0 = "Could not read android:spinnerMode"
            android.util.Log.i(r1, r0, r3)     // Catch:{ all -> 0x0059 }
            goto L_0x0060
        L_0x0059:
            r0 = move-exception
            if (r6 == 0) goto L_0x005f
            r6.recycle()
        L_0x005f:
            throw r0
        L_0x0060:
            if (r6 == 0) goto L_0x0065
        L_0x0062:
            r6.recycle()
        L_0x0065:
            r3 = 1
            if (r12 == 0) goto L_0x00cb
            if (r12 != r3) goto L_0x009d
            android.content.Context r0 = r8.A04
            X.04e r6 = new X.04e
            r6.<init>(r0, r10, r8, r11)
            android.content.Context r0 = r8.A04
            X.0UD r7 = X.AnonymousClass0UD.A00(r0, r10, r7, r11, r2)
            r1 = 3
            r0 = -2
            android.content.res.TypedArray r2 = r7.A02
            int r0 = r2.getLayoutDimension(r1, r0)
            r8.A00 = r0
            android.graphics.drawable.Drawable r0 = r7.A02(r3)
            r6.Bln(r0)
            r1 = 2
            android.content.res.TypedArray r0 = r4.A02
            java.lang.String r0 = r0.getString(r1)
            r6.A02 = r0
            r2.recycle()
            r8.A02 = r6
            X.0vj r0 = new X.0vj
            r0.<init>(r8, r8, r6, r3)
            r8.A03 = r0
        L_0x009d:
            r0 = 0
            android.content.res.TypedArray r4 = r4.A02
            java.lang.CharSequence[] r2 = r4.getTextArray(r0)
            if (r2 == 0) goto L_0x00b7
            r0 = 17367048(0x1090008, float:2.5162948E-38)
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r1.<init>(r9, r0, r2)
            r0 = 2131626161(0x7f0e08b1, float:1.887955E38)
            r1.setDropDownViewResource(r0)
            r8.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00b7:
            r4.recycle()
            r8.A07 = r3
            android.widget.SpinnerAdapter r0 = r8.A01
            if (r0 == 0) goto L_0x00c5
            r8.setAdapter((android.widget.SpinnerAdapter) r0)
            r8.A01 = r5
        L_0x00c5:
            X.0Qq r0 = r8.A06
            r0.A07(r10, r11)
            return
        L_0x00cb:
            X.0bE r2 = new X.0bE
            r2.<init>(r8)
            r8.A02 = r2
            r1 = 2
            android.content.res.TypedArray r0 = r4.A02
            java.lang.String r0 = r0.getString(r1)
            r2.A02 = r0
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, (AttributeSet) null, R.attr.f3nameremoved, i);
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }
}
