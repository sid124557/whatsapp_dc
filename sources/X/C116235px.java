package X;

import com.whatsapp.R;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.util.Log;

/* renamed from: X.5px  reason: invalid class name and case insensitive filesystem */
public class C116235px implements AnonymousClass66K {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GroupChatInfoActivity A01;

    public C116235px(GroupChatInfoActivity groupChatInfoActivity, int i) {
        this.A01 = groupChatInfoActivity;
        this.A00 = i;
    }

    public void BWt() {
        C621433s.A00(this.A01, 1);
    }

    public void BYT(boolean z) {
        Runnable r6;
        Log.i("group_info/onclick_deleteGroup");
        int i = this.A00;
        GroupChatInfoActivity groupChatInfoActivity = this.A01;
        if (i == 8) {
            r6 = new C71703cX(39, (Object) groupChatInfoActivity, z);
        } else if (!AnonymousClass4SG.A49(groupChatInfoActivity)) {
            C18270x1.A0w(new C33801ti(groupChatInfoActivity, groupChatInfoActivity.A03, groupChatInfoActivity.A1h, z), groupChatInfoActivity.A04);
            return;
        } else {
            r6 = new C172578Lw(19);
        }
        if (AnonymousClass4SG.A40(groupChatInfoActivity)) {
            groupChatInfoActivity.BpA(R.string.f11nameremoved, R.string.f11nameremoved);
            groupChatInfoActivity.A1Y.A09(new AnonymousClass4u6(groupChatInfoActivity.A0M, groupChatInfoActivity, groupChatInfoActivity.A1T, groupChatInfoActivity.A1h, r6));
            return;
        }
        groupChatInfoActivity.A05.A0H(R.string.f11nameremoved, 0);
    }
}
