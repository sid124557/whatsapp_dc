package X;

import com.whatsapp.group.GroupMembershipApprovalRequestsFragment;
import com.whatsapp.group.GroupPendingRequestsViewModel$sendAction$1;
import java.util.List;

/* renamed from: X.61S  reason: invalid class name */
public final class AnonymousClass61S extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ GroupMembershipApprovalRequestsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61S(GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        super(1);
        this.this$0 = groupMembershipApprovalRequestsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C179358j1 r1;
        int A0K = AnonymousClass001.A0K(obj);
        C69263Wi r0 = this.this$0.A01;
        if (r0 != null) {
            if (r0.A0Y()) {
                AnonymousClass4V4 r5 = this.this$0.A05;
                if (r5 == null) {
                    throw C86604Kt.A0j();
                }
                List A0h = C86644Kx.A0h(r5.A02);
                if (A0h != null) {
                    r1 = (C179358j1) A0h.get(A0K);
                } else {
                    r1 = null;
                }
                if (r1 instanceof C171398Gx) {
                    C171398Gx r4 = (C171398Gx) r1;
                    C142636xW r3 = C142636xW.A03;
                    r4.A04 = r3;
                    r5.A04.A0G(r1);
                    C616131n.A02((C85494Gl) null, new GroupPendingRequestsViewModel$sendAction$1(r3, r4, r5, (C84814Du) null, A0K), AnonymousClass0IV.A00(r5), (AnonymousClass20D) null, 3);
                }
            }
            return C59022wD.A00;
        }
        throw C18270x1.A0S("globalUi");
    }
}
