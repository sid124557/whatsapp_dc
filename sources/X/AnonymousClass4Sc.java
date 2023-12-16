package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.R;

/* renamed from: X.4Sc  reason: invalid class name */
public class AnonymousClass4Sc extends AppCompatRadioButton {
    public static final int[][] A02 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public ColorStateList A00;
    public boolean A01;

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.A00;
        if (colorStateList != null) {
            return colorStateList;
        }
        int A022 = AnonymousClass5ZV.A02(this, R.attr.f3nameremoved);
        int A023 = AnonymousClass5ZV.A02(this, R.attr.f3nameremoved);
        int A024 = AnonymousClass5ZV.A02(this, R.attr.f3nameremoved);
        int[][] iArr = A02;
        int[] iArr2 = new int[iArr.length];
        iArr2[0] = AnonymousClass5ZV.A00(1.0f, A024, A022);
        iArr2[1] = AnonymousClass5ZV.A00(0.54f, A024, A023);
        iArr2[2] = AnonymousClass5ZV.A00(0.38f, A024, A023);
        ColorStateList A0W = C86664Kz.A0W(iArr2, iArr, AnonymousClass5ZV.A00(0.38f, A024, A023), 3);
        this.A00 = A0W;
        return A0W;
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList colorStateList;
        this.A01 = z;
        if (z) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        C06070Wc.A02(colorStateList, this);
    }

    public AnonymousClass4Sc(Context context, AttributeSet attributeSet) {
        super(C105515Vh.A00(context, attributeSet, R.attr.f3nameremoved, R.style.f12nameremoved), attributeSet, R.attr.f3nameremoved);
        Context context2 = getContext();
        TypedArray A002 = C161837qd.A00(context2, attributeSet, C1463179t.A0O, new int[0], R.attr.f3nameremoved, R.style.f12nameremoved);
        if (A002.hasValue(0)) {
            C06070Wc.A02(C160917of.A00(context2, A002, 0), this);
        }
        this.A01 = A002.getBoolean(1, false);
        A002.recycle();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A01 && C06070Wc.A00(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }
}
