package X;

import android.view.View;

/* renamed from: X.0OO  reason: invalid class name */
public class AnonymousClass0OO {
    public C04210Ng A00 = new C04210Ng();
    public final C16970uK A01;

    public View A00(int i, int i2, int i3, int i4) {
        int A0B;
        int i5;
        int A0C;
        C16970uK r7 = this.A01;
        C17920wS r6 = (C17920wS) r7;
        int i6 = r6.A01;
        C06440Xs r0 = (C06440Xs) r6.A00;
        if (i6 != 0) {
            A0B = r0.A0D();
        } else {
            A0B = r0.A0B();
        }
        C06440Xs r02 = (C06440Xs) r6.A00;
        if (i6 != 0) {
            i5 = r02.A00;
            A0C = r02.A0A();
        } else {
            i5 = r02.A03;
            A0C = r02.A0C();
        }
        int i7 = i5 - A0C;
        int i8 = -1;
        if (i2 > i) {
            i8 = 1;
        }
        View view = null;
        while (i != i2) {
            View A0Q = ((C06440Xs) r6.A00).A0Q(i);
            int B5T = r7.B5T(A0Q);
            int B5S = r7.B5S(A0Q);
            C04210Ng r2 = this.A00;
            r2.A04 = A0B;
            r2.A03 = i7;
            r2.A02 = B5T;
            r2.A01 = B5S;
            r2.A00 = 0;
            r2.A00 = i3;
            if (r2.A00()) {
                return A0Q;
            }
            if (i4 != 0) {
                r2.A00 = 0;
                r2.A00 = i4;
                if (r2.A00()) {
                    view = A0Q;
                }
            }
            i += i8;
        }
        return view;
    }

    public boolean A01(View view) {
        int A0B;
        int i;
        int A0C;
        C04210Ng r5 = this.A00;
        C16970uK r4 = this.A01;
        C17920wS r2 = (C17920wS) r4;
        int i2 = r2.A01;
        C06440Xs r0 = (C06440Xs) r2.A00;
        if (i2 != 0) {
            A0B = r0.A0D();
        } else {
            A0B = r0.A0B();
        }
        C06440Xs r02 = (C06440Xs) r2.A00;
        if (i2 != 0) {
            i = r02.A00;
            A0C = r02.A0A();
        } else {
            i = r02.A03;
            A0C = r02.A0C();
        }
        int i3 = i - A0C;
        int B5T = r4.B5T(view);
        int B5S = r4.B5S(view);
        r5.A04 = A0B;
        r5.A03 = i3;
        r5.A02 = B5T;
        r5.A01 = B5S;
        r5.A00 = 0;
        r5.A00 = 24579;
        return r5.A00();
    }

    public AnonymousClass0OO(C16970uK r2) {
        this.A01 = r2;
    }
}
