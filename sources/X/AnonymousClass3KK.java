package X;

/* renamed from: X.3KK  reason: invalid class name */
public class AnonymousClass3KK implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("wa_group_descriptions_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS wa_group_descriptions_jid_index ON wa_group_descriptions(jid)");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r4 = new C59422wt[6];
        A00.A02 = "jid";
        AnonymousClass220 r3 = AnonymousClass220.TEXT;
        A00.A00 = r3;
        C54912pU.A0j(A00, r4, true);
        C54912pU.A0V(A00, r3, "description", r4, true);
        A00.A02 = "description_id";
        AnonymousClass220 r1 = AnonymousClass220.INTEGER;
        C54912pU.A0Y(A00, r1, r4);
        C54912pU.A0B(A00, r1, "description_time", r4);
        A00.A02 = "description_setter_jid";
        C54912pU.A0g(A00, r3, r4, true);
        C54912pU.A09(A00, r3, "description_id_string", true);
        A00.A01 = "''";
        r4[5] = A00.A0x();
        r8.A0E("wa_group_descriptions", r4);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
