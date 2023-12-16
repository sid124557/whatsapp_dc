package X;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.3Ir  reason: invalid class name and case insensitive filesystem */
public class C65743Ir implements AnonymousClass4ED {
    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0w = C54912pU.A0w(A00);
        AnonymousClass220 r3 = AnonymousClass220.INTEGER;
        A00.A00 = r3;
        C54912pU.A0j(A00, A0w, true);
        A00.A02 = "subgroup_raw_jid";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0c(A00, r1, A0w, true);
        C54912pU.A0W(A00, r1, "subgroup_subject", A0w, true);
        C54912pU.A0B(A00, r3, "parent_group_jid_row_id", A0w);
        r8.A0D("message_system_sibling_group_link_change", Arrays.asList(A0w), Collections.singletonList("PRIMARY KEY (message_row_id, subgroup_raw_jid)"));
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A02(r4, "message_system_sibling_group_link_change");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
