package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3HZ  reason: invalid class name */
public class AnonymousClass3HZ implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("frequent_index", "CREATE UNIQUE INDEX IF NOT EXISTS frequent_index ON frequent (jid_row_id, type)");
    }

    public void B3j(C41492Kl r13, C56622sI r14) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r1 = new C59422wt[4];
        A00.A02 = "_id";
        AnonymousClass220 r8 = AnonymousClass220.INTEGER;
        A00.A00 = r8;
        boolean A0q = C54912pU.A0q(A00, r1);
        A00.A02 = "jid";
        C54912pU.A0c(A00, AnonymousClass220.TEXT, r1, true);
        r1[2] = C54912pU.A07(A00, r8, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, true);
        r1[3] = C54912pU.A07(A00, r8, "message_count", true);
        r14.A0E("frequents", r1);
        C59422wt[] r12 = new C59422wt[4];
        A00.A02 = "_id";
        A00.A00 = r8;
        A00.A05 = true;
        A00.A03 = true;
        C54912pU.A0i(A00, r12, A0q ? 1 : 0);
        C54912pU.A0V(A00, r8, "jid_row_id", r12, true);
        r12[2] = C54912pU.A07(A00, r8, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, true);
        r12[3] = C54912pU.A07(A00, r8, "message_count", true);
        r14.A0E("frequent", r12);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
