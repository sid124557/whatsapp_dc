package X;

import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import java.util.List;

/* renamed from: X.5hP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C111015hP implements C181108mA {
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A00;

    public final void BW0(LatLng latLng) {
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        C111445i6 r1 = groupChatLiveLocationsActivity2.A0O;
        if (r1.A0l != null) {
            r1.A0C();
            return;
        }
        C105735We A08 = r1.A08(latLng);
        if (A08 != null) {
            List list = A08.A04;
            if (list.size() == 1) {
                groupChatLiveLocationsActivity2.A0O.A0S(A08, true);
                ((C105345Uo) groupChatLiveLocationsActivity2.A0T.get(A08.A03)).A04();
            } else if (groupChatLiveLocationsActivity2.A06.A02().A02 >= 16.0f) {
                groupChatLiveLocationsActivity2.A0O.A0S(A08, true);
            } else {
                groupChatLiveLocationsActivity2.A78(list, true);
                groupChatLiveLocationsActivity2.A0O.A0j = new C148197Hj(list, groupChatLiveLocationsActivity2.A06.A02().A02);
            }
        }
    }

    public /* synthetic */ C111015hP(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.A00 = groupChatLiveLocationsActivity2;
    }
}
