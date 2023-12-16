package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3KB  reason: invalid class name */
public final class AnonymousClass3KB implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0B("biz_profile_id_price_tier_index", "CREATE INDEX IF NOT EXISTS biz_profile_id_price_tier_index ON wa_biz_profiles_price_tiers(_id);");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A01 = C54912pU.A01(r7);
        C59422wt[] A0r = C54912pU.A0r(A01);
        AnonymousClass220 r2 = AnonymousClass220.TEXT;
        C54912pU.A0U(A01, r2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A0r, C54912pU.A0n(A01, r2, A0r) ? 1 : 0);
        C54912pU.A0A(A01, r2, "symbol", A0r);
        r7.A0E("wa_biz_profiles_price_tiers", A0r);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
