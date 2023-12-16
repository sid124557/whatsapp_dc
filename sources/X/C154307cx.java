package X;

import android.view.View;

/* renamed from: X.7cx  reason: invalid class name and case insensitive filesystem */
public final class C154307cx {
    public static final int A00(View[] viewArr, int i) {
        boolean z;
        int length = viewArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            z = true;
            if (i2 >= length) {
                break;
            }
            if (viewArr[i2] != null) {
                i3++;
            }
            i2++;
        }
        if (i3 <= 0) {
            z = false;
        }
        C626936e.A0D(z, "MessageBadgeDrawables/getNextAvailableViewIndex Require >1 non-null badgeViews");
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            if (viewArr[i5] != null) {
                i4++;
            }
        }
        return i4;
    }
}
