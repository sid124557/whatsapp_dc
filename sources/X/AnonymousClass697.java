package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.community.CommunityHomeActivity;
import com.whatsapp.community.CommunityMembersViewModel;
import com.whatsapp.community.CommunityNavigationActivity;
import com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet;
import com.whatsapp.contact.picker.AddGroupParticipantsSelector;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.quickcontact.QuickContactActivity;

/* renamed from: X.697  reason: invalid class name */
public class AnonymousClass697 implements AnonymousClass4AQ {
    public Object A00;
    public final int A01;

    public AnonymousClass697(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BLi(C95814uZ r5) {
        TextEmojiLabel A0z;
        View view;
        switch (this.A01) {
            case 0:
                CommunityHomeActivity communityHomeActivity = (CommunityHomeActivity) this.A00;
                if (communityHomeActivity.A0p.equals(r5)) {
                    communityHomeActivity.invalidateOptionsMenu();
                    communityHomeActivity.A74();
                    return;
                }
                return;
            case 1:
                CommunityMembersViewModel communityMembersViewModel = (CommunityMembersViewModel) this.A00;
                if (C73723fy.A0U(communityMembersViewModel.A07.B5g(communityMembersViewModel.A0K), AnonymousClass34R.A01(r5))) {
                    communityMembersViewModel.A0E();
                    return;
                }
                return;
            case 2:
                if (r5 != null) {
                    CommunityNavigationActivity communityNavigationActivity = (CommunityNavigationActivity) this.A00;
                    if (r5.equals(communityNavigationActivity.A0b)) {
                        communityNavigationActivity.A74();
                        communityNavigationActivity.invalidateOptionsMenu();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                CommunityNewSubgroupSwitcherBottomSheet communityNewSubgroupSwitcherBottomSheet = (CommunityNewSubgroupSwitcherBottomSheet) this.A00;
                if (C162457s7.A0P(r5, communityNewSubgroupSwitcherBottomSheet.A0O.getValue()) && (view = communityNewSubgroupSwitcherBottomSheet.A0B) != null) {
                    communityNewSubgroupSwitcherBottomSheet.A1a(view);
                    return;
                }
                return;
            case 4:
                AddGroupParticipantsSelector addGroupParticipantsSelector = (AddGroupParticipantsSelector) this.A00;
                C27991fJ r2 = (C27991fJ) addGroupParticipantsSelector.A0N.getValue();
                if (r2 != null && r2.equals(r5) && (A0z = C86664Kz.A0z(addGroupParticipantsSelector, R.id.disclaimer_warning_text)) != null && addGroupParticipantsSelector.A7e()) {
                    addGroupParticipantsSelector.A7c(A0z, r2);
                    return;
                }
                return;
            case 5:
                C89884fR r1 = (C89884fR) this.A00;
                if (r1.A0r.equals(r5)) {
                    r1.A09();
                    return;
                }
                return;
            case 6:
                AnonymousClass4VF r12 = (AnonymousClass4VF) this.A00;
                C626936e.A06(r5);
                if (r5.equals(r12.A01)) {
                    r12.A0D();
                    return;
                }
                return;
            case 7:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                if (groupChatInfoActivity.A1h.equals(r5)) {
                    groupChatInfoActivity.A7I();
                    return;
                }
                return;
            default:
                AnonymousClass4SG.A3n((QuickContactActivity) this.A00);
                return;
        }
    }
}
