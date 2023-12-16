package X;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.5ZV  reason: invalid class name */
public class AnonymousClass5ZV {
    public static boolean A03(int i) {
        if (i == 0 || AnonymousClass0YI.A00(i) <= 0.5d) {
            return false;
        }
        return true;
    }

    public static int A00(float f, int i, int i2) {
        return AnonymousClass0YI.A05(AnonymousClass0YI.A06(i2, AnonymousClass001.A07((float) Color.alpha(i2), f)), i);
    }

    public static int A01(Context context, int i, int i2) {
        TypedValue A01 = C160907oe.A01(context, i);
        if (A01 == null) {
            return i2;
        }
        int i3 = A01.resourceId;
        if (i3 != 0) {
            return AnonymousClass0Y8.A04(context, i3);
        }
        return A01.data;
    }

    public static int A02(View view, int i) {
        Context context = view.getContext();
        TypedValue A02 = C160907oe.A02(view.getContext(), view.getClass().getCanonicalName(), i);
        int i2 = A02.resourceId;
        if (i2 != 0) {
            return AnonymousClass0Y8.A04(context, i2);
        }
        return A02.data;
    }
}
