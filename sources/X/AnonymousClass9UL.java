package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.PaymentsWarmWelcomeBottomSheet;

/* renamed from: X.9UL  reason: invalid class name */
public final class AnonymousClass9UL {
    public static final PaymentsWarmWelcomeBottomSheet A00(String str) {
        C162457s7.A0J(str, 2);
        PaymentsWarmWelcomeBottomSheet paymentsWarmWelcomeBottomSheet = new PaymentsWarmWelcomeBottomSheet((C378924l) null);
        AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[4];
        r2[0] = AnonymousClass3Z6.A01("bundle_key_headline", R.string.f11nameremoved);
        r2[1] = AnonymousClass3Z6.A01("bundle_key_body", R.string.f11nameremoved);
        AnonymousClass3Z6.A09("referral_screen", str, r2, 2);
        AnonymousClass3Z6.A09("bundle_screen_name", "more_verification_needed_prompt", r2, 3);
        paymentsWarmWelcomeBottomSheet.A0u(C02820Hs.A00(r2));
        return paymentsWarmWelcomeBottomSheet;
    }

    public static final PaymentsWarmWelcomeBottomSheet A01(String str) {
        C162457s7.A0J(str, 4);
        PaymentsWarmWelcomeBottomSheet paymentsWarmWelcomeBottomSheet = new PaymentsWarmWelcomeBottomSheet((C378924l) null);
        AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[6];
        r2[0] = AnonymousClass3Z6.A01("bundle_key_title", R.string.f11nameremoved);
        r2[1] = AnonymousClass3Z6.A01("bundle_key_image", R.drawable.payments_ts_half_sheet_hero_image);
        r2[2] = AnonymousClass3Z6.A01("bundle_key_headline", R.string.f11nameremoved);
        r2[3] = AnonymousClass3Z6.A01("bundle_key_body", R.string.f11nameremoved);
        AnonymousClass3Z6.A09("referral_screen", str, r2, 4);
        AnonymousClass3Z6.A09("bundle_screen_name", "get_started", r2, 5);
        paymentsWarmWelcomeBottomSheet.A0u(C02820Hs.A00(r2));
        return paymentsWarmWelcomeBottomSheet;
    }
}
