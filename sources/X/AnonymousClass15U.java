package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.privacy.disclosure.ui.fragment.PrivacyDisclosureBottomSheetFragment;

/* renamed from: X.15U  reason: invalid class name */
public final class AnonymousClass15U extends AnonymousClass7XV {
    public final /* synthetic */ BottomSheetBehavior A00;
    public final /* synthetic */ PrivacyDisclosureBottomSheetFragment A01;
    public final /* synthetic */ boolean A02;

    public void A03(View view, int i) {
        if (i == 4 || i == 5) {
            C003203q A0Q = this.A01.A0Q();
            if (A0Q != null) {
                AnonymousClass5BZ.A00(A0Q.getSupportFragmentManager(), AnonymousClass58Y.RESULT_BACK);
            }
        } else if (this.A02) {
            this.A00.A0S(3);
        }
    }

    public AnonymousClass15U(BottomSheetBehavior bottomSheetBehavior, PrivacyDisclosureBottomSheetFragment privacyDisclosureBottomSheetFragment, boolean z) {
        this.A01 = privacyDisclosureBottomSheetFragment;
        this.A02 = z;
        this.A00 = bottomSheetBehavior;
    }

    public void A02(View view, float f) {
    }
}
