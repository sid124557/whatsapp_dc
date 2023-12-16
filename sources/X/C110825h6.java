package X;

import android.graphics.Point;
import com.whatsapp.location.GroupChatLiveLocationsActivity;

/* renamed from: X.5h6  reason: invalid class name and case insensitive filesystem */
public class C110825h6 implements C183698qT {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    public C110825h6(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.A00 = groupChatLiveLocationsActivity;
    }

    public void BOO() {
        this.A00.A0W = false;
    }

    public void BTW() {
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A00;
        groupChatLiveLocationsActivity.A0W = false;
        C626936e.A06(groupChatLiveLocationsActivity.A05);
        C111445i6 r1 = groupChatLiveLocationsActivity.A0N;
        C54942pX r0 = r1.A0o;
        if (r0 != null) {
            C108975ds A002 = C108975ds.A00(r0.A00, r0.A01);
            Point A04 = groupChatLiveLocationsActivity.A05.A0S.A04(A002);
            int i = A04.x;
            if (i <= 0 || A04.y <= 0 || i >= groupChatLiveLocationsActivity.A0M.getWidth() || A04.y >= groupChatLiveLocationsActivity.A0M.getHeight()) {
                groupChatLiveLocationsActivity.A0W = true;
                groupChatLiveLocationsActivity.A05.A0B(C153847c7.A01(A002, groupChatLiveLocationsActivity.A00 * 2.0f), this, 1500);
            }
        } else if (!r1.A0u && groupChatLiveLocationsActivity.A0X) {
            groupChatLiveLocationsActivity.A0X = false;
            groupChatLiveLocationsActivity.A79(true);
        }
    }
}
