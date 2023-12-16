package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3Hi  reason: invalid class name and case insensitive filesystem */
public class C65393Hi implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("jid_key_new_index", "CREATE UNIQUE INDEX IF NOT EXISTS jid_key_new_index ON jid (user, server, agent, device, type)");
        r5.A0B("jid_raw_string_index", "CREATE UNIQUE INDEX IF NOT EXISTS jid_raw_string_index ON jid (raw_string)");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r4 = new C59422wt[7];
        AnonymousClass220 A01 = AnonymousClass220.A01(A00);
        boolean A0m = C54912pU.A0m(A00, A01, r4);
        A00.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0c(A00, r1, r4, A0m);
        C54912pU.A0W(A00, r1, "server", r4, A0m);
        C54912pU.A0B(A00, A01, "agent", r4);
        C54912pU.A0C(A00, A01, "device", r4);
        C54912pU.A0D(A00, A01, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r4);
        C54912pU.A0E(A00, r1, "raw_string", r4);
        r8.A0E("jid", r4);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
