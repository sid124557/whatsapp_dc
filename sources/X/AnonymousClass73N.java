package X;

import android.view.View;

/* renamed from: X.73N  reason: invalid class name */
public class AnonymousClass73N {
    public static int A00(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return size;
        }
        return i2;
    }
}
