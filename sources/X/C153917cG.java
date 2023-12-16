package X;

import android.view.View;

/* renamed from: X.7cG  reason: invalid class name and case insensitive filesystem */
public final class C153917cG {
    public static final long A01(int i, int i2) {
        return C157087hi.A00.A00(i, i, i2, i2);
    }

    public static final long A00(int i, int i2) {
        C153227at r0;
        int i3;
        C153227at r02;
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            r0 = AnonymousClass6NH.A00;
        } else if (mode == 1073741824) {
            r0 = AnonymousClass6NF.A00;
        } else {
            throw AnonymousClass001.A0e("Unknown width spec mode.");
        }
        int i4 = r0.A01.A01;
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i5 = 0;
        int A00 = C175708Zk.A00(size, 0, i4);
        int i6 = Integer.MAX_VALUE;
        if (mode2 == Integer.MIN_VALUE) {
            i3 = A00;
            A00 = 0;
        } else if (mode2 == 0) {
            A00 = 0;
            i3 = Integer.MAX_VALUE;
        } else if (mode2 == 1073741824) {
            i3 = A00;
        } else {
            throw AnonymousClass001.A0e("Unknown width spec mode.");
        }
        int mode3 = View.MeasureSpec.getMode(i2);
        if (mode3 == Integer.MIN_VALUE || mode3 == 0) {
            r02 = AnonymousClass6NH.A00;
        } else if (mode3 == 1073741824) {
            r02 = AnonymousClass6NF.A00;
        } else {
            throw AnonymousClass001.A0e("Unknown width spec mode.");
        }
        int i7 = r02.A01.A01;
        int mode4 = View.MeasureSpec.getMode(i2);
        int A002 = C175708Zk.A00(View.MeasureSpec.getSize(i2), 0, i7);
        if (mode4 == Integer.MIN_VALUE) {
            i6 = A002;
        } else if (mode4 != 0) {
            if (mode4 == 1073741824) {
                i6 = A002;
                i5 = A002;
            } else {
                throw AnonymousClass001.A0e("Unknown height spec mode.");
            }
        }
        return C157087hi.A00.A00(A00, i3, i5, i6);
    }
}
