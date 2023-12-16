package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.whatsapp.R;

/* renamed from: X.7qd  reason: invalid class name and case insensitive filesystem */
public final class C161837qd {
    public static final int[] A00 = {R.attr.f3nameremoved};
    public static final int[] A01 = {R.attr.f3nameremoved};

    public static void A02(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1463179t.A0g, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.f3nameremoved, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                A04(context, "Theme.MaterialComponents", A01);
            }
        }
        A04(context, "Theme.AppCompat", A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r6.getResourceId(0, -1) != -1) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(android.content.Context r7, android.util.AttributeSet r8, int[] r9, int[] r10, int r11, int r12) {
        /*
            int[] r0 = X.C1463179t.A0g
            android.content.res.TypedArray r6 = r7.obtainStyledAttributes(r8, r0, r11, r12)
            r0 = 2
            r5 = 0
            boolean r0 = r6.getBoolean(r0, r5)
            if (r0 != 0) goto L_0x0012
            r6.recycle()
        L_0x0011:
            return
        L_0x0012:
            int r4 = r10.length
            if (r4 != 0) goto L_0x0029
            r1 = -1
            int r0 = r6.getResourceId(r5, r1)
            if (r0 == r1) goto L_0x001d
        L_0x001c:
            r5 = 1
        L_0x001d:
            r6.recycle()
            if (r5 != 0) goto L_0x0011
            java.lang.String r0 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0029:
            android.content.res.TypedArray r3 = r7.obtainStyledAttributes(r8, r9, r11, r12)
            r2 = 0
        L_0x002e:
            r0 = r10[r2]
            r1 = -1
            int r0 = r3.getResourceId(r0, r1)
            if (r0 != r1) goto L_0x003b
            r3.recycle()
            goto L_0x001d
        L_0x003b:
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x002e
            r3.recycle()
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161837qd.A03(android.content.Context, android.util.AttributeSet, int[], int[], int, int):void");
    }

    public static TypedArray A00(Context context, AttributeSet attributeSet, int[] iArr, int[] iArr2, int i, int i2) {
        A02(context, attributeSet, i, i2);
        A03(context, attributeSet, iArr, iArr2, i, i2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static AnonymousClass0UD A01(Context context, AttributeSet attributeSet, int[] iArr, int[] iArr2, int i, int i2) {
        A02(context, attributeSet, i, i2);
        A03(context, attributeSet, iArr, iArr2, i, i2);
        return AnonymousClass0UD.A00(context, attributeSet, iArr, i, i2);
    }

    public static void A04(Context context, String str, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("The style on this component requires your app theme to be ");
                A0o.append(str);
                throw AnonymousClass000.A0F(" (or a descendant).", A0o);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
