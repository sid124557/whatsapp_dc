package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3JA  reason: invalid class name */
public final class AnonymousClass3JA implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0B("newsletter_membership_index", "CREATE INDEX IF NOT EXISTS newsletter_membership_index ON newsletter (membership)");
        r5.A0B("newsletter_code_index", "CREATE INDEX IF NOT EXISTS newsletter_code_index ON newsletter (invite_code)");
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C162457s7.A0J(r6, 0);
        C56622sI.A04(r6, "chat", "newsletter", "chat_row_id=old._id");
    }

    public void B3j(C41492Kl r8, C56622sI r9) {
        C54912pU A01 = C54912pU.A01(r9);
        C59422wt[] r3 = new C59422wt[23];
        A01.A02 = "chat_row_id";
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0n = C54912pU.A0n(A01, r2, r3);
        A01.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        AnonymousClass220 r6 = AnonymousClass220.TEXT;
        C54912pU.A0c(A01, r6, r3, A0n);
        C54912pU.A0W(A01, r2, "name_id", r3, A0n);
        C54912pU.A0X(A01, r6, "description", r3, A0n);
        A01.A02 = "description_id";
        C54912pU.A0g(A01, r2, r3, A0n);
        C54912pU.A0D(A01, r6, "picture_url", r3);
        C54912pU.A09(A01, r2, "picture_id", A0n);
        A01.A04 = A0n;
        r3[6] = A01.A0x();
        C54912pU.A0F(A01, r6, "preview_url", r3);
        r3[8] = C54912pU.A07(A01, r2, "preview_id", A0n);
        C54912pU.A0H(A01, r6, "invite_code", r3);
        C54912pU.A0I(A01, r6, "handle", r3);
        r3[11] = C54912pU.A07(A01, r2, "subscribers_count", A0n);
        r3[12] = C54912pU.A07(A01, r2, "membership", A0n);
        r3[13] = C54912pU.A07(A01, r2, "privacy", A0n);
        r3[14] = C54912pU.A07(A01, r2, "verified", A0n);
        r3[15] = C54912pU.A07(A01, r2, "muted", A0n);
        r3[16] = C54912pU.A07(A01, r2, "oldest_message_retrieved", A0n);
        C54912pU.A09(A01, r2, "suspended", A0n);
        A01.A01 = "0";
        r3[17] = A01.A0x();
        r3[18] = C54912pU.A08(A01, r2, "deleted", A0n);
        C54912pU.A0R(A01, r2, "show_enforced_update_banner", r3);
        r3[20] = C54912pU.A03(A01, r2, "reaction_setting");
        A01.A02 = "reaction_setting_blocklist";
        r3[21] = C54912pU.A02(A01, AnonymousClass220.STRING);
        C54912pU.A0T(A01, r2, "reaction_setting_update_ts", r3);
        r9.A0E("newsletter", r3);
    }
}
