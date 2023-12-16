package X;

import android.content.Context;

/* renamed from: X.8A1  reason: invalid class name */
public final class AnonymousClass8A1 implements C180928lr {
    public final C148807Ju BlA(Context context, C183928qt r5, String str) {
        C148807Ju r2 = new C148807Ju();
        int BtW = r5.BtW(context, str, true);
        r2.A01 = BtW;
        if (BtW != 0) {
            r2.A02 = 1;
        } else {
            int BtD = r5.BtD(context, str);
            r2.A00 = BtD;
            if (BtD != 0) {
                r2.A02 = -1;
                return r2;
            }
        }
        return r2;
    }
}
