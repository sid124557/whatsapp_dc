package X;

import android.app.Activity;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;

/* renamed from: X.5XO  reason: invalid class name */
public class AnonymousClass5XO {
    public final AnonymousClass1VX A00;

    public void A02(View view, BottomSheetBehavior bottomSheetBehavior, C89654ea r5, C105895Wv r6) {
        bottomSheetBehavior.A0d(true);
        bottomSheetBehavior.A0S(4);
        bottomSheetBehavior.A0p = true;
        C86634Kw.A1C(view, bottomSheetBehavior);
        bottomSheetBehavior.A0a(new C88614aH(view, r5, r6, this));
    }

    public static void A00(Activity activity, AnonymousClass0R8 r3) {
        if (r3 != null) {
            r3.A0E(C107335b8.A07(activity, C18310x6.A0G(activity, R.drawable.ic_close), R.color.f5nameremoved));
        }
    }

    public void A01(Activity activity) {
        if (C154437dA.A00(this.A00)) {
            activity.overridePendingTransition(0, 0);
        }
    }

    public void A03(BottomSheetBehavior bottomSheetBehavior, C89654ea r5) {
        View view = r5.A00;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A0O == 4) {
            view.post(new C117095rN(bottomSheetBehavior, 28));
        }
    }

    public AnonymousClass5XO(AnonymousClass1VX r1) {
        this.A00 = r1;
    }
}
