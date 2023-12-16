package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.4SN  reason: invalid class name */
public class AnonymousClass4SN extends AppCompatCheckBox {
    public static final int A0K = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public static final int[] A0L = {R.attr.f3nameremoved};
    public static final int[] A0M = {R.attr.f3nameremoved};
    public static final int[][] A0N = {new int[]{16842910, R.attr.f3nameremoved}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public int A00;
    public ColorStateList A01;
    public ColorStateList A02;
    public ColorStateList A03;
    public PorterDuff.Mode A04;
    public Drawable A05;
    public Drawable A06;
    public CompoundButton.OnCheckedChangeListener A07;
    public CharSequence A08;
    public CharSequence A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public int[] A0F;
    public final AnonymousClass0P5 A0G = new C188868zc(this, 0);
    public final AnonymousClass0AR A0H = AnonymousClass0AR.A04(getContext(), R.drawable.mtrl_checkbox_button_checked_unchecked);
    public final LinkedHashSet A0I = AnonymousClass0x9.A17();
    public final LinkedHashSet A0J = AnonymousClass0x9.A17();

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.A00 == 2) {
            View.mergeDrawableStates(onCreateDrawableState, A0M);
        }
        if (this.A0C) {
            View.mergeDrawableStates(onCreateDrawableState, A0L);
        }
        int[] iArr = onCreateDrawableState;
        int i2 = 0;
        while (true) {
            int length = onCreateDrawableState.length;
            if (i2 >= length) {
                iArr = Arrays.copyOf(onCreateDrawableState, length + 1);
                iArr[length] = 16842912;
                break;
            }
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842912) {
                break;
            } else if (i3 == 0) {
                iArr = (int[]) onCreateDrawableState.clone();
                iArr[i2] = 16842912;
                break;
            } else {
                i2++;
            }
        }
        this.A0F = iArr;
        return onCreateDrawableState;
    }

    private String getButtonStateDescription() {
        int i;
        int i2 = this.A00;
        Resources resources = getResources();
        if (i2 == 1) {
            i = R.string.f11nameremoved;
        } else {
            i = R.string.f11nameremoved;
            if (i2 == 0) {
                i = R.string.f11nameremoved;
            }
        }
        return resources.getString(i);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.A03;
        if (colorStateList != null) {
            return colorStateList;
        }
        int[][] iArr = A0N;
        int[] iArr2 = new int[iArr.length];
        int A022 = AnonymousClass5ZV.A02(this, R.attr.f3nameremoved);
        int A023 = AnonymousClass5ZV.A02(this, R.attr.f3nameremoved);
        int A024 = AnonymousClass5ZV.A02(this, R.attr.f3nameremoved);
        int A025 = AnonymousClass5ZV.A02(this, R.attr.f3nameremoved);
        iArr2[0] = AnonymousClass5ZV.A00(1.0f, A024, A023);
        iArr2[1] = AnonymousClass5ZV.A00(1.0f, A024, A022);
        iArr2[2] = AnonymousClass5ZV.A00(0.54f, A024, A025);
        iArr2[3] = AnonymousClass5ZV.A00(0.38f, A024, A025);
        ColorStateList A0W = C86664Kz.A0W(iArr2, iArr, AnonymousClass5ZV.A00(0.38f, A024, A025), 4);
        this.A03 = A0W;
        return A0W;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.A02;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void A00() {
        int intrinsicWidth;
        int intrinsicHeight;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.A05;
        ColorStateList colorStateList3 = this.A02;
        PorterDuff.Mode A012 = C06070Wc.A01(this);
        int i = Build.VERSION.SDK_INT;
        boolean A1Y = AnonymousClass001.A1Y(i, 23);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = C86634Kw.A0G(drawable);
            if (A012 != null) {
                AnonymousClass0YG.A04(A012, drawable);
            }
        } else if (A1Y) {
            drawable.mutate();
        }
        this.A05 = drawable;
        Drawable drawable2 = this.A06;
        ColorStateList colorStateList4 = this.A01;
        PorterDuff.Mode mode = this.A04;
        boolean A1Y2 = AnonymousClass001.A1Y(i, 23);
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = C86634Kw.A0G(drawable2);
            if (mode != null) {
                AnonymousClass0YG.A04(mode, drawable2);
            }
        } else if (A1Y2) {
            drawable2.mutate();
        }
        this.A06 = drawable2;
        if (this.A0E) {
            AnonymousClass0AR r4 = this.A0H;
            if (r4 != null) {
                AnonymousClass0P5 r0 = this.A0G;
                r4.A0A(r0);
                r4.A09(r0);
            }
            if (i >= 24) {
                Drawable drawable3 = this.A05;
                if ((drawable3 instanceof AnimatedStateListDrawable) && r4 != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, r4, false);
                    ((AnimatedStateListDrawable) this.A05).addTransition(R.id.indeterminate, R.id.unchecked, r4, false);
                }
            }
        }
        Drawable drawable4 = this.A05;
        if (!(drawable4 == null || (colorStateList2 = this.A02) == null)) {
            AnonymousClass0YG.A01(colorStateList2, drawable4);
        }
        Drawable drawable5 = this.A06;
        if (!(drawable5 == null || (colorStateList = this.A01) == null)) {
            AnonymousClass0YG.A01(colorStateList, drawable5);
        }
        Drawable drawable6 = this.A05;
        Drawable drawable7 = this.A06;
        if (drawable6 != null) {
            if (drawable7 == null) {
                drawable7 = drawable6;
            } else {
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                if (drawable7.getIntrinsicWidth() == -1 || drawable7.getIntrinsicHeight() == -1) {
                    intrinsicWidth = drawable6.getIntrinsicWidth();
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                } else if (drawable7.getIntrinsicWidth() > drawable6.getIntrinsicWidth() || drawable7.getIntrinsicHeight() > drawable6.getIntrinsicHeight()) {
                    float intrinsicWidth2 = ((float) drawable7.getIntrinsicWidth()) / ((float) drawable7.getIntrinsicHeight());
                    if (intrinsicWidth2 >= ((float) drawable6.getIntrinsicWidth()) / ((float) drawable6.getIntrinsicHeight())) {
                        intrinsicWidth = drawable6.getIntrinsicWidth();
                        intrinsicHeight = (int) (((float) intrinsicWidth) / intrinsicWidth2);
                    } else {
                        intrinsicHeight = drawable6.getIntrinsicHeight();
                        intrinsicWidth = (int) (intrinsicWidth2 * ((float) intrinsicHeight));
                    }
                } else {
                    intrinsicWidth = drawable7.getIntrinsicWidth();
                    intrinsicHeight = drawable7.getIntrinsicHeight();
                }
                if (i >= 23) {
                    layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
                    layerDrawable.setLayerGravity(1, 17);
                } else {
                    int intrinsicWidth3 = (drawable6.getIntrinsicWidth() - intrinsicWidth) / 2;
                    int intrinsicHeight2 = (drawable6.getIntrinsicHeight() - intrinsicHeight) / 2;
                    layerDrawable.setLayerInset(1, intrinsicWidth3, intrinsicHeight2, intrinsicWidth3, intrinsicHeight2);
                }
                drawable7 = layerDrawable;
            }
        }
        super.setButtonDrawable(drawable7);
        refreshDrawableState();
    }

    public Drawable getButtonDrawable() {
        return this.A05;
    }

    public Drawable getButtonIconDrawable() {
        return this.A06;
    }

    public ColorStateList getButtonIconTintList() {
        return this.A01;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.A04;
    }

    public ColorStateList getButtonTintList() {
        return this.A02;
    }

    public int getCheckedState() {
        return this.A00;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.A09;
    }

    public boolean isChecked() {
        return AnonymousClass001.A1T(this.A00);
    }

    public void onDraw(Canvas canvas) {
        Drawable A002;
        if (!this.A0B || !C86664Kz.A1V(this) || (A002 = C03360Jv.A00(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int i = 1;
        if (AnonymousClass0YH.A01(this) == 1) {
            i = -1;
        }
        int width = ((getWidth() - A002.getIntrinsicWidth()) / 2) * i;
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = A002.getBounds();
            AnonymousClass0YG.A07(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C124876Ef)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C124876Ef r2 = (C124876Ef) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        setCheckedState(r2.A00);
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.A06 = drawable;
        A00();
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.A01 != colorStateList) {
            this.A01 = colorStateList;
            A00();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.A04 != mode) {
            this.A04 = mode;
            A00();
        }
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.A02 != colorStateList) {
            this.A02 = colorStateList;
            A00();
        }
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.A00 != i) {
            this.A00 = i;
            super.setChecked(AnonymousClass000.A1U(i, 1));
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.A08 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.A0A) {
                this.A0A = true;
                LinkedHashSet linkedHashSet = this.A0I;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw AnonymousClass001.A0g("onCheckedStateChangedListener");
                    }
                }
                if (!(this.A00 == 2 || (onCheckedChangeListener = this.A07) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.A0A = false;
            }
        }
    }

    public void setErrorAccessibilityLabelResource(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        this.A09 = charSequence;
    }

    public void setErrorShown(boolean z) {
        if (this.A0C != z) {
            this.A0C = z;
            refreshDrawableState();
            Iterator it = this.A0J.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0g("onErrorChanged");
            }
        }
    }

    public void setStateDescription(CharSequence charSequence) {
        this.A08 = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 30) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList colorStateList;
        this.A0D = z;
        if (z) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        C06070Wc.A02(colorStateList, this);
    }

    public AnonymousClass4SN(Context context, AttributeSet attributeSet) {
        super(C105515Vh.A00(context, attributeSet, R.attr.f3nameremoved, R.style.f12nameremoved), attributeSet, R.attr.f3nameremoved);
        Context context2 = getContext();
        this.A05 = C03360Jv.A00(this);
        this.A02 = getSuperButtonTintList();
        setSupportButtonTintList((ColorStateList) null);
        AnonymousClass0UD A012 = C161837qd.A01(context2, attributeSet, C1463179t.A0M, new int[0], R.attr.f3nameremoved, R.style.f12nameremoved);
        this.A06 = A012.A02(2);
        if (this.A05 != null && C160907oe.A03(context2, R.attr.f3nameremoved, false)) {
            TypedArray typedArray = A012.A02;
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == A0K && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.A05 = AnonymousClass0VX.A01(context2, R.drawable.mtrl_checkbox_button);
                this.A0E = true;
                if (this.A06 == null) {
                    this.A06 = AnonymousClass0VX.A01(context2, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.A01 = C160917of.A01(context2, A012, 3);
        TypedArray typedArray2 = A012.A02;
        this.A04 = C159337lf.A01(PorterDuff.Mode.SRC_IN, typedArray2.getInt(4, -1));
        this.A0D = typedArray2.getBoolean(10, false);
        this.A0B = typedArray2.getBoolean(6, true);
        this.A0C = typedArray2.getBoolean(9, false);
        this.A09 = typedArray2.getText(8);
        if (typedArray2.hasValue(7)) {
            setCheckedState(typedArray2.getInt(7, 0));
        }
        typedArray2.recycle();
        A00();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A0D && this.A02 == null && this.A01 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.A0C) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(accessibilityNodeInfo.getText());
            AnonymousClass001.A1M(A0o);
            accessibilityNodeInfo.setText(AnonymousClass000.A0R(this.A09, A0o));
        }
    }

    public Parcelable onSaveInstanceState() {
        C124876Ef r1 = new C124876Ef(super.onSaveInstanceState());
        r1.A00 = this.A00;
        return r1;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(AnonymousClass0VX.A01(getContext(), i));
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AnonymousClass0VX.A01(getContext(), i));
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        A00();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.A0B = z;
    }

    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.A09 = charSequence;
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A07 = onCheckedChangeListener;
    }

    public void toggle() {
        C86654Ky.A1C(this);
    }

    public void setButtonDrawable(Drawable drawable) {
        this.A05 = drawable;
        this.A0E = false;
        A00();
    }
}
