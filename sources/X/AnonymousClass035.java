package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.whatsapp.R;

/* renamed from: X.035  reason: invalid class name */
public class AnonymousClass035 extends Button implements C17170ug, C16620th, C15000qc {
    public final C04780Qq A00;
    public final AnonymousClass0WJ A01;

    public int getAutoSizeMaxTextSize() {
        if (C17170ug.A00) {
            return super.getAutoSizeMaxTextSize();
        }
        AnonymousClass0WJ r0 = this.A01;
        if (r0 != null) {
            return Math.round(r0.A0C.A00);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C17170ug.A00) {
            return super.getAutoSizeMinTextSize();
        }
        AnonymousClass0WJ r0 = this.A01;
        if (r0 != null) {
            return Math.round(r0.A0C.A01);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C17170ug.A00) {
            return super.getAutoSizeStepGranularity();
        }
        AnonymousClass0WJ r0 = this.A01;
        if (r0 != null) {
            return Math.round(r0.A0C.A02);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C17170ug.A00) {
            return super.getAutoSizeTextAvailableSizes();
        }
        AnonymousClass0WJ r0 = this.A01;
        if (r0 != null) {
            return r0.A0C.A07;
        }
        return new int[0];
    }

    public int getAutoSizeTextType() {
        if (!C17170ug.A00) {
            AnonymousClass0WJ r0 = this.A01;
            if (r0 != null) {
                return r0.A0C.A03;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            return C04780Qq.A00(r0);
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            return C04780Qq.A01(r0);
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C03900Lz r0 = this.A01.A08;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C03900Lz r0 = this.A01.A08;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C17170ug.A00) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        AnonymousClass0WJ r0 = this.A01;
        if (r0 != null) {
            r0.A05(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C17170ug.A00) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        AnonymousClass0WJ r0 = this.A01;
        if (r0 != null) {
            r0.A0C(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C17170ug.A00) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        AnonymousClass0WJ r0 = this.A01;
        if (r0 != null) {
            r0.A04(i);
        }
    }

    public void setSupportAllCaps(boolean z) {
        AnonymousClass0WJ r0 = this.A01;
        if (r0 != null) {
            r0.A0B.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            r0.A05(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            r0.A06(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        AnonymousClass0WJ r0 = this.A01;
        r0.A08(colorStateList);
        r0.A03();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        AnonymousClass0WJ r0 = this.A01;
        r0.A09(mode);
        r0.A03();
    }

    public void setTextSize(int i, float f) {
        if (C17170ug.A00) {
            super.setTextSize(i, f);
            return;
        }
        AnonymousClass0WJ r0 = this.A01;
        if (r0 != null) {
            AnonymousClass0XX r1 = r0.A0C;
            if (!(!(r1.A09 instanceof AnonymousClass03A)) || r1.A03 == 0) {
                r1.A06(i, f);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass035(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        AnonymousClass0XB.A04(this);
        C04780Qq r0 = new C04780Qq(this);
        this.A00 = r0;
        r0.A07(attributeSet, i);
        AnonymousClass0WJ r02 = new AnonymousClass0WJ(this);
        this.A01 = r02;
        r02.A0B(attributeSet, i);
        r02.A03();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            r0.A02();
        }
        AnonymousClass0WJ r02 = this.A01;
        if (r02 != null) {
            r02.A03();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AnonymousClass0WJ r1 = this.A01;
        if (r1 != null && !C17170ug.A00) {
            r1.A0C.A04();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        AnonymousClass0WJ r1 = this.A01;
        if (r1 != null && !C17170ug.A00) {
            AnonymousClass0XX r12 = r1.A0C;
            if ((!(r12.A09 instanceof AnonymousClass03A)) && r12.A03 != 0) {
                r12.A04();
            }
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C04780Qq r0 = this.A00;
        if (r0 != null) {
            r0.A04(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass0Y9.A00(callback, this));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AnonymousClass0WJ r0 = this.A01;
        if (r0 != null) {
            r0.A06(context, i);
        }
    }

    public AnonymousClass035(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }
}
