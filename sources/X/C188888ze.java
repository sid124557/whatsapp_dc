package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.8ze  reason: invalid class name and case insensitive filesystem */
public class C188888ze extends AnonymousClass7XV {
    public Object A00;
    public Object A01;
    public final int A02;

    public C188888ze(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void A03(View view, int i) {
        if (this.A02 != 0) {
            if (i == 1 && !AnonymousClass001.A1Z(((C139816sf) this.A01).A00.invoke())) {
                ((BottomSheetBehavior) this.A00).A0S(3);
            }
        } else if (i != 3) {
            ((BottomSheetBehavior) this.A01).A0S(3);
        }
    }

    public void A02(View view, float f) {
    }
}
