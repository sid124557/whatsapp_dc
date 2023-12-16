package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.chatinfo.view.custom.CreatorPrivacyNewsletterBottomSheet;
import com.whatsapp.chatinfo.view.custom.PhoneNumberHiddenInNewsletterBottomSheet;

/* renamed from: X.5Yg  reason: invalid class name and case insensitive filesystem */
public final class C106265Yg {
    public static final /* synthetic */ C106265Yg A00 = new C106265Yg();

    public static final void A00(C89654ea r4, C48062eH r5, C95804uY r6, boolean z) {
        DialogFragment phoneNumberHiddenInNewsletterBottomSheet;
        C18260x0.A0O(r4, r5);
        C162457s7.A0J(r6, 3);
        r5.A02(C187998y9.class);
        if (z) {
            phoneNumberHiddenInNewsletterBottomSheet = new CreatorPrivacyNewsletterBottomSheet();
            String rawString = r6.getRawString();
            Bundle A08 = AnonymousClass002.A08();
            A08.putString("jid", rawString);
            phoneNumberHiddenInNewsletterBottomSheet.A0u(A08);
        } else {
            phoneNumberHiddenInNewsletterBottomSheet = new PhoneNumberHiddenInNewsletterBottomSheet();
        }
        r4.Bon(phoneNumberHiddenInNewsletterBottomSheet, "PhoneNumberHiddenInNewsletterSheet");
    }
}
