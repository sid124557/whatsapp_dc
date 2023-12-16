package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3J5  reason: invalid class name */
public final class AnonymousClass3J5 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0B("newsletter_linked_account_chat_index", "CREATE INDEX IF NOT EXISTS newsletter_linked_account_chat_index ON newsletter_linked_account (chat_row_id)");
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C162457s7.A0J(r6, 0);
        C56622sI.A04(r6, "chat", "newsletter_linked_account", "chat_row_id=old._id");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A01 = C54912pU.A01(r7);
        C59422wt[] A0s = C54912pU.A0s(A01);
        AnonymousClass220 r1 = AnonymousClass220.INTEGER;
        boolean A0l = C54912pU.A0l(A01, r1, A0s);
        C54912pU.A0V(A01, r1, "chat_row_id", A0s, A0l);
        A01.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        AnonymousClass220 r12 = AnonymousClass220.TEXT;
        C54912pU.A0e(A01, r12, A0s, A0l);
        C54912pU.A0X(A01, r12, "link", A0s, A0l);
        r7.A0E("newsletter_linked_account", A0s);
    }
}
