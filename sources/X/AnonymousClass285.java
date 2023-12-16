package X;

import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;

/* renamed from: X.285  reason: invalid class name */
public final class AnonymousClass285 {
    public static final IndiaUpiDobPickerBottomSheet A00(C166557yt r4, String str, boolean z, boolean z2) {
        IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet = new IndiaUpiDobPickerBottomSheet();
        AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[4];
        AnonymousClass3Z6.A04("BUNDLE_KEY_SHOW_TOOLBAR", Boolean.valueOf(z), r2);
        AnonymousClass3Z6.A05("BUNDLE_KEY_SHOW_HANDLE", Boolean.valueOf(z2), r2);
        AnonymousClass3Z6.A06("BUNDLE_KEY_CREDENTIAL", str, r2);
        AnonymousClass3Z6.A07("BUNDLE_BANK_ACCOUNT", r4, r2);
        indiaUpiDobPickerBottomSheet.A0u(C02820Hs.A00(r2));
        return indiaUpiDobPickerBottomSheet;
    }
}
