package X;

import android.os.Bundle;
import com.whatsapp.chatinfo.view.custom.PhoneNumberSharedBottomSheet;

/* renamed from: X.25J  reason: invalid class name */
public final class AnonymousClass25J {
    public static final PhoneNumberSharedBottomSheet A00(String str, boolean z) {
        PhoneNumberSharedBottomSheet phoneNumberSharedBottomSheet = new PhoneNumberSharedBottomSheet();
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("arg_my_phone_number", str);
        A08.putBoolean("arg_is_business", z);
        phoneNumberSharedBottomSheet.A0u(A08);
        return phoneNumberSharedBottomSheet;
    }
}
