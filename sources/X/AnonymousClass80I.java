package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.group.GroupMembershipApprovalRequestsFragment;
import java.util.List;

/* renamed from: X.80I  reason: invalid class name */
public final /* synthetic */ class AnonymousClass80I implements C15930sC {
    public final /* synthetic */ View A00;
    public final /* synthetic */ RecyclerView A01;
    public final /* synthetic */ GroupMembershipApprovalRequestsFragment A02;

    public final void BOf(Object obj) {
        View view = this.A00;
        GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment = this.A02;
        RecyclerView recyclerView = this.A01;
        List list = (List) obj;
        view.setVisibility(8);
        groupMembershipApprovalRequestsFragment.A13(true);
        recyclerView.setVisibility(0);
        AnonymousClass4X7 A1I = groupMembershipApprovalRequestsFragment.A1I();
        C162457s7.A0H(list);
        C162457s7.A0J(list, 0);
        A1I.A01 = list;
        groupMembershipApprovalRequestsFragment.A1I().A05();
    }

    public /* synthetic */ AnonymousClass80I(View view, RecyclerView recyclerView, GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        this.A00 = view;
        this.A02 = groupMembershipApprovalRequestsFragment;
        this.A01 = recyclerView;
    }
}
