package X;

import com.whatsapp.group.GroupChatInfoActivity;

/* renamed from: X.69i  reason: invalid class name and case insensitive filesystem */
public class C1236769i implements C183168pb {
    public Object A00;
    public final int A01;

    public C1236769i(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean BP3() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) obj;
            groupChatInfoActivity.A14.A03(groupChatInfoActivity.A1h);
            return false;
        }
        C92114m7 r0 = (C92114m7) obj;
        AnonymousClass67A r4 = r0.A01;
        r4.getActivity().startActivity(C627736r.A0g(r4.getActivity(), r0.A00.A0H, false, true, true));
        return true;
    }
}
