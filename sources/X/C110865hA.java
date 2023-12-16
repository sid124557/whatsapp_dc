package X;

import com.whatsapp.location.GroupChatLiveLocationsActivity;
import java.util.List;

/* renamed from: X.5hA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C110865hA implements C180278km {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    public final void BVz(C108975ds r7) {
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A00;
        C111445i6 r1 = groupChatLiveLocationsActivity.A0N;
        if (r1.A0l != null) {
            r1.A0C();
            return;
        }
        C105735We A08 = r1.A08(C108975ds.A04(r7));
        if (A08 != null) {
            List list = A08.A04;
            if (list.size() == 1) {
                groupChatLiveLocationsActivity.A0N.A0S(A08, true);
                ((C88534Zc) groupChatLiveLocationsActivity.A0S.get(A08.A03)).A0D();
            } else if (groupChatLiveLocationsActivity.A05.A02().A02 >= 16.0f) {
                groupChatLiveLocationsActivity.A0N.A0S(A08, true);
            } else {
                groupChatLiveLocationsActivity.A78(list, true);
                groupChatLiveLocationsActivity.A0N.A0j = new C148197Hj(list, groupChatLiveLocationsActivity.A05.A02().A02);
            }
        }
    }

    public /* synthetic */ C110865hA(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.A00 = groupChatLiveLocationsActivity;
    }
}
