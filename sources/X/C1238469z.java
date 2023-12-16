package X;

import android.widget.FrameLayout;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.profile.ProfileInfoActivity;

/* renamed from: X.69z  reason: invalid class name and case insensitive filesystem */
public class C1238469z implements AnonymousClass64M {
    public Object A00;
    public final int A01;

    public C1238469z(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BQY(AnonymousClass5K6 r6) {
        FrameLayout frameLayout;
        int i;
        switch (this.A01) {
            case 0:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
                C003203q A0Q = conversationsFragment.A0Q();
                if (A0Q != null && !A0Q.isFinishing()) {
                    if (conversationsFragment.A0h.A03(r6)) {
                        conversationsFragment.A0h.A02(r6);
                        conversationsFragment.A0C.setVisibility(0);
                        conversationsFragment.A1l(true);
                        C116985rC r1 = conversationsFragment.A0h.A02;
                        if (r1.A07()) {
                            r1.A04();
                            throw AnonymousClass001.A0g("getSmbBannerType");
                        }
                        return;
                    }
                    conversationsFragment.A0C.setVisibility(8);
                    conversationsFragment.A1l(false);
                    return;
                }
                return;
            case 1:
                ConversationsFragment conversationsFragment2 = (ConversationsFragment) this.A00;
                C003203q A0Q2 = conversationsFragment2.A0Q();
                if (A0Q2 != null && !A0Q2.isFinishing()) {
                    conversationsFragment2.A0g.A02(r6);
                    C116985rC r12 = conversationsFragment2.A0g.A02;
                    if (r12.A07()) {
                        r12.A04();
                        throw AnonymousClass001.A0g("getSmbBannerType");
                    }
                    return;
                }
                return;
            case 2:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                if (groupChatInfoActivity.isFinishing()) {
                    return;
                }
                if (groupChatInfoActivity.A0c.A02()) {
                    if (groupChatInfoActivity.A0W == null) {
                        C87364Py r13 = new C87364Py(groupChatInfoActivity);
                        groupChatInfoActivity.A0W = r13;
                        groupChatInfoActivity.A0C.addView(r13);
                    }
                    groupChatInfoActivity.A0W.A06.A01(r6);
                    groupChatInfoActivity.A27.A06(8);
                    groupChatInfoActivity.A0D.setVisibility(0);
                    return;
                }
                groupChatInfoActivity.A27.A06(0);
                groupChatInfoActivity.A0D.setVisibility(8);
                return;
            default:
                ProfileInfoActivity profileInfoActivity = (ProfileInfoActivity) this.A00;
                if (!profileInfoActivity.isFinishing() && profileInfoActivity.A05 != null) {
                    if (profileInfoActivity.A0D.A02()) {
                        if (profileInfoActivity.A0B == null) {
                            AnonymousClass4Pz r14 = new AnonymousClass4Pz(profileInfoActivity);
                            profileInfoActivity.A0B = r14;
                            profileInfoActivity.A05.addView(r14);
                        }
                        profileInfoActivity.A0B.A06.A01(r6);
                        frameLayout = profileInfoActivity.A05;
                        i = 0;
                    } else {
                        frameLayout = profileInfoActivity.A05;
                        i = 8;
                    }
                    frameLayout.setVisibility(i);
                    return;
                }
                return;
        }
    }
}
