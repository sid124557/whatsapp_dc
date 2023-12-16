package X;

import com.whatsapp.conversationslist.LeaveGroupsDialogFragment;
import java.util.List;

/* renamed from: X.4u7  reason: invalid class name */
public class AnonymousClass4u7 extends AnonymousClass1FE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ LeaveGroupsDialogFragment A01;
    public final /* synthetic */ C27991fJ A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4u7(LeaveGroupsDialogFragment leaveGroupsDialogFragment, C28891hw r9, C66493Lq r10, C27991fJ r11, C27991fJ r12, int i) {
        super(r9, r10, r11, (String) null, (List) null, 16);
        this.A01 = leaveGroupsDialogFragment;
        this.A00 = i;
        this.A02 = r12;
    }

    public void A00(Integer num) {
        LeaveGroupsDialogFragment leaveGroupsDialogFragment = this.A01;
        C69263Wi r2 = leaveGroupsDialogFragment.A00;
        if (this.A00 != 1) {
            r2.A0D();
        }
        if (AnonymousClass0x2.A0F(leaveGroupsDialogFragment.A05).getInt("privacy_groupadd", 0) == 0 && AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(leaveGroupsDialogFragment.A05), "privacy_tip_exit_group_timestamp") == -1 && leaveGroupsDialogFragment.A02.A0X(3995)) {
            AnonymousClass33p r1 = leaveGroupsDialogFragment.A05;
            C18270x1.A0j(C18270x1.A03(r1), "privacy_tip_exit_group_jid", this.A02.user);
            leaveGroupsDialogFragment.A05.A1Y("privacy_tip_exit_group_timestamp");
        }
    }
}
