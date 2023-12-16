package X;

import android.view.View;

/* renamed from: X.0V8  reason: invalid class name */
public class AnonymousClass0V8 {
    public static int A00(View view, View view2, C05590Uc r4, C06440Xs r5, AnonymousClass0Q1 r6, boolean z) {
        if (r5.A08() == 0 || r6.A00() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return AnonymousClass001.A0A(C06440Xs.A03(view), C06440Xs.A03(view2)) + 1;
        }
        return Math.min(r4.A05(), r4.A06(view2) - r4.A09(view));
    }

    public static int A01(View view, View view2, C05590Uc r5, C06440Xs r6, AnonymousClass0Q1 r7, boolean z) {
        int A00;
        if (r6.A08() == 0 || (A00 = r7.A00()) == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return A00;
        }
        return (int) ((((float) (r5.A06(view2) - r5.A09(view))) / ((float) (AnonymousClass001.A0A(C06440Xs.A03(view), C06440Xs.A03(view2)) + 1))) * ((float) r7.A00()));
    }

    public static int A02(View view, View view2, C05590Uc r6, C06440Xs r7, AnonymousClass0Q1 r8, boolean z, boolean z2) {
        int max;
        if (r7.A08() == 0 || r8.A00() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(C06440Xs.A03(view), C06440Xs.A03(view2));
        int max2 = Math.max(C06440Xs.A03(view), C06440Xs.A03(view2));
        if (z2) {
            max = Math.max(0, (r8.A00() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) AnonymousClass001.A0A(r6.A06(view2), r6.A09(view))) / ((float) (AnonymousClass001.A0A(C06440Xs.A03(view), C06440Xs.A03(view2)) + 1)))) + ((float) (r6.A04() - r6.A09(view))));
    }
}
