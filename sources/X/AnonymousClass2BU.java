package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.2BU  reason: invalid class name */
public final class AnonymousClass2BU {
    public static final String A00;

    static {
        StringBuilder A0h = AnonymousClass0x2.A0h();
        C57212tH.A03("wa_biz_profiles_price_tiers", A0h, new String[]{"_id", PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "symbol"});
        A00 = AnonymousClass000.A0X(" FROM wa_biz_profiles_price_tiers INNER JOIN wa_biz_profiles ON wa_biz_profiles._id = ? AND wa_biz_profiles.price_tier_id = wa_biz_profiles_price_tiers._id", A0h);
    }
}
