package X;

import android.os.Bundle;
import com.whatsapp.group.GroupPermissionsActivity;
import com.whatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog;

/* renamed from: X.61V  reason: invalid class name */
public final class AnonymousClass61V extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ GroupPermissionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61V(GroupPermissionsActivity groupPermissionsActivity) {
        super(1);
        this.this$0 = groupPermissionsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C41622Ky r6 = (C41622Ky) obj;
        C162457s7.A0J(r6, 0);
        int i = r6.A01;
        int i2 = r6.A00;
        GroupRequireMembershipApprovalTooManyParticipantsDialog groupRequireMembershipApprovalTooManyParticipantsDialog = new GroupRequireMembershipApprovalTooManyParticipantsDialog();
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("remaining_capacity", i);
        A08.putInt("pending_request_count", i2);
        groupRequireMembershipApprovalTooManyParticipantsDialog.A0u(A08);
        this.this$0.Bon(groupRequireMembershipApprovalTooManyParticipantsDialog, "group_join_request_group_too_full");
        return C59022wD.A00;
    }
}
