package X;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.3Iu  reason: invalid class name and case insensitive filesystem */
public class C65773Iu implements AnonymousClass4ED {
    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0w = C54912pU.A0w(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        A00.A00 = r2;
        C54912pU.A0j(A00, A0w, true);
        C54912pU.A0V(A00, r2, "group_jid_row_id", A0w, true);
        C54912pU.A0W(A00, r2, "group_node_type", A0w, true);
        A00.A02 = "group_subject";
        C54912pU.A0Z(A00, AnonymousClass220.TEXT, A0w);
        r7.A0D("message_system_with_group_nodes", Arrays.asList(A0w), Collections.singletonList("PRIMARY KEY (message_row_id, group_jid_row_id, group_node_type)"));
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A02(r4, "message_system_with_group_nodes");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
