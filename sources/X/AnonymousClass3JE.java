package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3JE  reason: invalid class name */
public class AnonymousClass3JE implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_payment_transaction_id_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_payment_transaction_id_index ON pay_transaction (id)");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r2 = new C59422wt[26];
        AnonymousClass220 A01 = AnonymousClass220.A01(A00);
        C54912pU.A0U(A00, A01, "message_row_id", r2, C54912pU.A0m(A00, A01, r2) ? 1 : 0);
        C54912pU.A0A(A00, A01, "remote_jid_row_id", r2);
        A00.A02 = "key_id";
        AnonymousClass220 r5 = AnonymousClass220.TEXT;
        C54912pU.A0Z(A00, r5, r2);
        C54912pU.A0C(A00, r5, "interop_id", r2);
        C54912pU.A0D(A00, r5, PublicKeyCredentialControllerUtility.JSON_KEY_ID, r2);
        C54912pU.A0E(A00, A01, "timestamp", r2);
        C54912pU.A0F(A00, A01, "status", r2);
        C54912pU.A0G(A00, r5, "error_code", r2);
        C54912pU.A0H(A00, A01, "sender_jid_row_id", r2);
        C54912pU.A0I(A00, A01, "receiver_jid_row_id", r2);
        C54912pU.A0J(A00, A01, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r2);
        C54912pU.A0K(A00, r5, "currency_code", r2);
        A00.A02 = "amount_1000";
        r2[13] = C54912pU.A02(A00, AnonymousClass220.UNSPECIFIED);
        C54912pU.A0M(A00, r5, "credential_id", r2);
        C54912pU.A0N(A00, r5, "methods", r2);
        C54912pU.A0O(A00, r5, "bank_transaction_id", r2);
        C54912pU.A0P(A00, r5, "metadata", r2);
        C54912pU.A0Q(A00, A01, "init_timestamp", r2);
        C54912pU.A0R(A00, r5, "request_key_id", r2);
        r2[20] = C54912pU.A03(A00, r5, "country");
        C54912pU.A0S(A00, A01, "version", r2);
        r2[22] = AnonymousClass220.A00(A00, "future_data");
        r2[23] = C54912pU.A03(A00, A01, "service_id");
        r2[24] = C54912pU.A03(A00, r5, "background_id");
        r2[25] = C54912pU.A03(A00, A01, "purchase_initiator");
        r8.A0E("pay_transaction", r2);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
