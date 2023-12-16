package X;

import android.os.Bundle;
import com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment;

/* renamed from: X.5C3  reason: invalid class name */
public final class AnonymousClass5C3 {
    public static final StatusPrivacyBottomSheetDialogFragment A00(boolean z) {
        StatusPrivacyBottomSheetDialogFragment statusPrivacyBottomSheetDialogFragment = new StatusPrivacyBottomSheetDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean("should_display_xo", z);
        statusPrivacyBottomSheetDialogFragment.A0u(A08);
        return statusPrivacyBottomSheetDialogFragment;
    }
}
