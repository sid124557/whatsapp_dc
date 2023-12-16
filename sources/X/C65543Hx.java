package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3Hx  reason: invalid class name and case insensitive filesystem */
public final class C65543Hx implements AnonymousClass4ED {
    /* JADX WARNING: type inference failed for: r1v0, types: [boolean] */
    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A01 = C54912pU.A01(r8);
        C59422wt[] r3 = new C59422wt[3];
        A01.A02 = "message_add_on_row_id";
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        ? A0n = C54912pU.A0n(A01, r2, r3);
        r3[A0n] = C54912pU.A04(A01, r2, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, 0);
        C54912pU.A0W(A01, r2, "sender_timestamp", r3, A0n);
        r8.A0E("message_add_on_event_response", r3);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C162457s7.A0J(r6, 0);
        C56622sI.A05(r6, "message_add_on", "message_add_on_event_response", "message_add_on_row_id=old._id");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
