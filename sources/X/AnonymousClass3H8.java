package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3H8  reason: invalid class name */
public class AnonymousClass3H8 implements AnonymousClass4ED {
    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r2 = new C59422wt[12];
        A00.A02 = "jid";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        A00.A00 = r1;
        A00.A04 = true;
        boolean A0p = C54912pU.A0p(A00, r2);
        A00.A02 = "tag";
        A00.A00 = AnonymousClass220.INTEGER;
        A00.A01 = Integer.toString(A0p ? 1 : 0);
        C54912pU.A0i(A00, r2, 1);
        C54912pU.A0A(A00, r1, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r2);
        A00.A02 = "is_default";
        C54912pU.A0Z(A00, AnonymousClass220.BOOLEAN, r2);
        C54912pU.A0C(A00, r1, "attributes", r2);
        C54912pU.A0D(A00, r1, "description", r2);
        C54912pU.A0E(A00, r1, "category", r2);
        C54912pU.A0F(A00, r1, "prompts", r2);
        C54912pU.A0G(A00, r1, "behavior_graph", r2);
        C54912pU.A0H(A00, r1, "persona_id", r2);
        C54912pU.A0I(A00, r1, "commands_description", r2);
        C54912pU.A0J(A00, r1, "commands", r2);
        r8.A0E("wa_bot_profiles", r2);
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
