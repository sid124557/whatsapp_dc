package X;

import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.4HJ  reason: invalid class name */
public class AnonymousClass4HJ extends C56252rg {
    public Object A00;
    public final int A01;

    public AnonymousClass4HJ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00(GroupJid groupJid) {
        C72173dI r3;
        Runnable runnable;
        switch (this.A01) {
            case 0:
                AnonymousClass11H r1 = (AnonymousClass11H) this.A00;
                if (groupJid.equals(r1.A0s)) {
                    r3 = r1.A12;
                    C71553cI.A00(r3, r1, 48);
                    runnable = new C71553cI((Object) r1, 45);
                    break;
                } else {
                    return;
                }
            case 1:
                r3 = ((AnonymousClass11B) this.A00).A0N;
                runnable = new C71653cS(this, 49, groupJid);
                break;
            default:
                C162457s7.A0J(groupJid, 0);
                MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel = (MemberSuggestedGroupsManagementViewModel) this.A00;
                if (groupJid.equals(memberSuggestedGroupsManagementViewModel.A0D)) {
                    MemberSuggestedGroupsManagementViewModel.A00(memberSuggestedGroupsManagementViewModel);
                    return;
                }
                return;
        }
        r3.execute(runnable);
    }

    public void A02(GroupJid groupJid, GroupJid groupJid2) {
        if (this.A01 == 0) {
            AnonymousClass11H r3 = (AnonymousClass11H) this.A00;
            r3.A12.execute(new C71653cS(r3, 45, groupJid2));
        }
    }
}
