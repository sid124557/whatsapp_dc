package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.whatsapp.R;

/* renamed from: X.4Sf  reason: invalid class name */
public class AnonymousClass4Sf extends AnonymousClass03n {
    public static int A02(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue A0B = AnonymousClass4L0.A0B();
            if (!typedArray.getValue(i3, A0B) || A0B.type != 2) {
                i = typedArray.getDimensionPixelSize(i3, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{A0B.data});
                i = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
            }
        }
        return i;
    }

    public final void A03(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C1463179t.A0Q);
        Context context = getContext();
        int[] A1Z = C86664Kz.A1Z();
        A1Z[0] = 1;
        A1Z[1] = 2;
        int A02 = A02(context, obtainStyledAttributes, A1Z);
        obtainStyledAttributes.recycle();
        if (A02 >= 0) {
            setLineHeight(A02);
        }
    }

    public AnonymousClass4Sf(Context context, AttributeSet attributeSet) {
        super(C105515Vh.A00(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        if (C160907oe.A03(context2, R.attr.f3nameremoved, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = C1463179t.A0R;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int A02 = A02(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (A02 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    A03(theme, resourceId);
                }
            }
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (C160907oe.A03(context, R.attr.f3nameremoved, true)) {
            A03(context.getTheme(), i);
        }
    }
}
