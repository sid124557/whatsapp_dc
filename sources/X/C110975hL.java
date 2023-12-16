package X;

import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;

/* renamed from: X.5hL  reason: invalid class name and case insensitive filesystem */
public class C110975hL implements C183968qx {
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A00;

    public C110975hL(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.A00 = groupChatLiveLocationsActivity2;
    }

    public void BOO() {
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        groupChatLiveLocationsActivity2.A0X = false;
        C626936e.A06(groupChatLiveLocationsActivity2.A06);
    }

    public void BTW() {
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        groupChatLiveLocationsActivity2.A0X = false;
        C626936e.A06(groupChatLiveLocationsActivity2.A06);
        groupChatLiveLocationsActivity2.A06.A04();
        C111445i6 r2 = groupChatLiveLocationsActivity2.A0O;
        if (r2.A0j != null) {
            r2.A0W(Float.valueOf(groupChatLiveLocationsActivity2.A06.A02().A02));
            return;
        }
        C105735We r0 = r2.A0l;
        if (r0 != null) {
            LatLng A002 = r0.A00();
            if (!groupChatLiveLocationsActivity2.A06.A00().A02().A04.A00(A002) && !groupChatLiveLocationsActivity2.A0O.A0t) {
                groupChatLiveLocationsActivity2.A0X = true;
                groupChatLiveLocationsActivity2.A06.A0B(C106555Zl.A02(A002, Math.min(groupChatLiveLocationsActivity2.A00 * 2.0f, 16.0f)), this);
            }
        } else if (!r2.A0u && groupChatLiveLocationsActivity2.A0Y) {
            groupChatLiveLocationsActivity2.A0Y = false;
            groupChatLiveLocationsActivity2.A79(true);
        }
    }
}
