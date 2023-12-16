package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* renamed from: X.03h  reason: invalid class name and case insensitive filesystem */
public class C003003h extends PopupWindow {
    public C003003h(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AnonymousClass0UD A00 = AnonymousClass0UD.A00(context, attributeSet, AnonymousClass0KC.A0H, i, i2);
        TypedArray typedArray = A00.A02;
        if (typedArray.hasValue(2)) {
            C05230Sn.A01(this, typedArray.getBoolean(2, false));
        }
        setBackgroundDrawable(A00.A02(0));
        typedArray.recycle();
    }
}
