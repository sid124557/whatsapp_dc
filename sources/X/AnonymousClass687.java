package X;

import android.widget.BaseAdapter;
import com.whatsapp.blocklist.BlockList;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.community.CommunityMembersViewModel;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.687  reason: invalid class name */
public class AnonymousClass687 extends C55702qm {
    public Object A00;
    public final int A01;

    public AnonymousClass687(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00(C620833k r3, C28011fL r4) {
        if (13 - this.A01 != 0) {
            super.A00(r3, r4);
            return;
        }
        C162457s7.A0J(r4, 0);
        if (r4 instanceof C27991fJ) {
            C86644Kx.A1S(((AnonymousClass5WJ) this.A00).A0D, C18290x4.A13(r4), (AnonymousClass5WJ) this.A00, 33);
        }
    }

    public void A01(C27991fJ r2) {
        switch (this.A01) {
            case 5:
            case 18:
                ((C89634eX) this.A00).A7H();
                return;
            default:
                super.A01(r2);
                return;
        }
    }

    public void A02(C27991fJ r3) {
        if (13 - this.A01 != 0) {
            super.A02(r3);
            return;
        }
        C162457s7.A0J(r3, 0);
        C86644Kx.A1S(((AnonymousClass5WJ) this.A00).A0D, C18290x4.A13(r3), (AnonymousClass5WJ) this.A00, 33);
    }

    public void A03(C27991fJ r2) {
        switch (this.A01) {
            case 5:
            case 18:
                ((C89634eX) this.A00).A7H();
                return;
            default:
                super.A03(r2);
                return;
        }
    }

    public void A04(C27991fJ r3) {
        if (13 - this.A01 != 0) {
            super.A04(r3);
            return;
        }
        C162457s7.A0J(r3, 0);
        C86644Kx.A1S(((AnonymousClass5WJ) this.A00).A0D, C18290x4.A13(r3), (AnonymousClass5WJ) this.A00, 33);
    }

    public void A05(Set set) {
        BaseAdapter baseAdapter;
        switch (this.A01) {
            case 0:
                BlockList blockList = (BlockList) this.A00;
                C117115rP.A01(blockList.A04, blockList, 48);
                return;
            case 1:
                ((CallLogActivity) this.A00).A75();
                return;
            case 2:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                contactInfoActivity.A0x.A0F();
                contactInfoActivity.A5T();
                return;
            case 3:
                ListChatInfoActivity.A0C((ListChatInfoActivity) this.A00);
                return;
            case 4:
                C162457s7.A0J(set, 0);
                HashSet A15 = AnonymousClass0x9.A15(set);
                CommunityMembersViewModel communityMembersViewModel = (CommunityMembersViewModel) this.A00;
                A15.retainAll(communityMembersViewModel.A07.B5g(communityMembersViewModel.A0K));
                if (AnonymousClass0x7.A1S(A15)) {
                    communityMembersViewModel.A0E();
                    return;
                }
                return;
            case 7:
                ((C89904fT) this.A00).A00 = ((C89904fT) this.A00).A0P.A01(((C89904fT) this.A00).A0V);
                return;
            case 8:
                baseAdapter = ((MediaAlbumActivity) this.A00).A0B;
                break;
            case 9:
                baseAdapter = ((MessageDetailsActivity) this.A00).A01;
                break;
            case 10:
                ((C93544ok) this.A00).A05.notifyDataSetChanged();
                return;
            case 11:
                AnonymousClass4VF r0 = (AnonymousClass4VF) this.A00;
                r0.A0D();
                C86654Ky.A1H(r0.A0X);
                return;
            case 12:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                if (set.contains(groupChatInfoActivity.A1h)) {
                    GroupChatInfoActivity.A0C(groupChatInfoActivity);
                    return;
                }
                return;
            case 13:
                C162457s7.A0J(set, 0);
                C86644Kx.A1S(((AnonymousClass5WJ) this.A00).A0D, set, (AnonymousClass5WJ) this.A00, 33);
                return;
            case 14:
                PopupNotification.A0C((PopupNotification) this.A00);
                return;
            case 15:
                AnonymousClass4XH r3 = ((SearchFragment) this.A00).A1b;
                if (r3 != null) {
                    int i = 0;
                    while (true) {
                        C118295tJ r1 = r3.A0z;
                        if (i < r1.size()) {
                            if (set.contains(((C156137g5) r1.get(i)).A01)) {
                                r3.A06(i);
                            }
                            i++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 16:
                ((StatusPlaybackContactFragment) this.A00).A1U();
                return;
            case 17:
                ((AnonymousClass5TV) this.A00).A0L.A05();
                return;
            default:
                ((C89634eX) this.A00).A7H();
                return;
        }
        baseAdapter.notifyDataSetChanged();
    }
}
