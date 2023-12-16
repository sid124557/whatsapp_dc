package X;

import com.whatsapp.biz.BusinessProfileExtraFieldsActivity;
import com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1;
import com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$refreshSendPermission$1$1;
import com.whatsapp.group.HistorySettingViewModel;
import com.whatsapp.group.HistorySettingViewModel$updateEnabled$1;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.4HI  reason: invalid class name */
public class AnonymousClass4HI extends C55702qm {
    public Object A00;
    public final int A01;

    public AnonymousClass4HI(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A01(C27991fJ r5) {
        switch (this.A01) {
            case 4:
                A06(r5);
                return;
            case 6:
                HistorySettingViewModel historySettingViewModel = (HistorySettingViewModel) this.A00;
                C616131n.A02((C85494Gl) null, new HistorySettingViewModel$updateEnabled$1(historySettingViewModel, (C84814Du) null), AnonymousClass0IV.A00(historySettingViewModel), (AnonymousClass20D) null, 3);
                return;
            default:
                return;
        }
    }

    public void A02(C27991fJ r15) {
        switch (this.A01) {
            case 1:
                ((UpcomingActivityViewModel) this.A00).A0B.BkP(new C117695sL((Object) this, 25));
                return;
            case 2:
                AnonymousClass11H r5 = (AnonymousClass11H) this.A00;
                Iterator A0q = C18320x8.A0q(r5.A0y.A07());
                while (A0q.hasNext()) {
                    if (AnonymousClass0x7.A0O(A0q).A02.equals(r15)) {
                        C27991fJ r4 = r5.A0s;
                        C55682qk r3 = r5.A0J;
                        AnonymousClass4FS r2 = r5.A17;
                        AnonymousClass31C r7 = r5.A0t;
                        C66493Lq r1 = r5.A0h;
                        C56942so r0 = r5.A0O;
                        String A03 = r7.A03();
                        r7.A0D(new C68343Su(r3, r1, r4, r2), C385228a.A00(r0.A00(r4), r4, A03), A03, 297, 32000);
                    }
                }
                return;
            case 3:
                ((AnonymousClass11B) this.A00).A0N.execute(new C70193a6(this, 0, r15));
                return;
            default:
                return;
        }
    }

    public void A03(C27991fJ r5) {
        switch (this.A01) {
            case 4:
                A06(r5);
                return;
            case 6:
                HistorySettingViewModel historySettingViewModel = (HistorySettingViewModel) this.A00;
                C616131n.A02((C85494Gl) null, new HistorySettingViewModel$updateEnabled$1(historySettingViewModel, (C84814Du) null), AnonymousClass0IV.A00(historySettingViewModel), (AnonymousClass20D) null, 3);
                return;
            default:
                return;
        }
    }

    public void A04(C27991fJ r7) {
        switch (this.A01) {
            case 1:
                ((UpcomingActivityViewModel) this.A00).A0B.BkP(new C117695sL((Object) this, 24));
                return;
            case 2:
                AnonymousClass11H r5 = (AnonymousClass11H) this.A00;
                C56942so r1 = r5.A0O;
                C27991fJ A012 = r1.A01(r7);
                C27991fJ r4 = r5.A0s;
                if (r4.equals(A012)) {
                    AnonymousClass2L1 r3 = r1.A0I;
                    if (r3.A01.A02(new AnonymousClass4KD(r3, 6), r4).size() <= 0) {
                        C06270Wx.A04(r5.A14, 403);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                AnonymousClass11B r42 = (AnonymousClass11B) this.A00;
                if (r42.A0T.get(r7) != null) {
                    AnonymousClass2L1 r32 = r42.A03.A0I;
                    C162457s7.A0J(r7, 0);
                    if (r32.A01.A02(new AnonymousClass4KD(r32, 6), r7).size() <= 0 && r42.A0G(r7)) {
                        r42.A0N.execute(C71313bu.A00(this, 4));
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void A05(Set set) {
        switch (this.A01) {
            case 0:
                ((BusinessProfileExtraFieldsActivity) this.A00).A74();
                return;
            case 5:
                C194510y r5 = (C194510y) this.A00;
                AnonymousClass3ZH r0 = ((C60932zP) r5.A0W.getValue()).A02;
                if (r0 != null) {
                    C616131n.A02(r5.A0L, new CommentsBottomSheetViewModel$refreshSendPermission$1$1(r5, r0, (C84814Du) null), AnonymousClass0IV.A00(r5), (AnonymousClass20D) null, 2);
                    return;
                }
                return;
            case 7:
                ((AnonymousClass35T) this.A00).A0B();
                return;
            default:
                return;
        }
    }

    public final void A06(C27991fJ r6) {
        MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel = (MemberSuggestedGroupsManagementViewModel) this.A00;
        if (C162457s7.A0P(r6, memberSuggestedGroupsManagementViewModel.A0D)) {
            C616131n.A02((C85494Gl) null, new MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1(memberSuggestedGroupsManagementViewModel, (C84814Du) null), AnonymousClass0IV.A00(memberSuggestedGroupsManagementViewModel), (AnonymousClass20D) null, 3);
        }
    }
}
