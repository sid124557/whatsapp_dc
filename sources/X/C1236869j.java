package X;

import android.view.View;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.location.PlaceInfo;
import java.util.List;

/* renamed from: X.69j  reason: invalid class name and case insensitive filesystem */
public class C1236869j implements C181118mB {
    public Object A00;
    public final int A01;

    public C1236869j(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean BW3(C105345Uo r7) {
        Object obj;
        if (this.A01 != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) this.A00;
            if (locationPicker2.A0X.A0t) {
                return true;
            }
            if (r7.A02() == null) {
                return false;
            }
            PlaceInfo placeInfo = locationPicker2.A0X.A0f;
            if (!(placeInfo == null || (obj = placeInfo.A0D) == null)) {
                C105345Uo r1 = (C105345Uo) obj;
                r1.A05(locationPicker2.A04);
                r1.A03();
            }
            r7.A05(locationPicker2.A05);
            locationPicker2.A0X.A0Q(r7);
            locationPicker2.A0X.A0B.setVisibility(8);
            locationPicker2.A0X.A0E.setVisibility(8);
            if (!locationPicker2.A0X.A0p && locationPicker2.A0N.A05()) {
                return true;
            }
        } else {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A00;
            C626936e.A06(groupChatLiveLocationsActivity2.A06);
            C111445i6 r0 = groupChatLiveLocationsActivity2.A0O;
            r0.A0u = true;
            r0.A0s = false;
            View view = r0.A0U;
            C54942pX r12 = r0.A0m;
            int i = 8;
            if (r12 == null) {
                i = 0;
            }
            view.setVisibility(i);
            if (r7.A01() instanceof C105735We) {
                C105735We r2 = (C105735We) r7.A01();
                if (!r7.A0A()) {
                    r2 = groupChatLiveLocationsActivity2.A0O.A09((C54942pX) r2.A04.get(0));
                    if (r2 != null) {
                        r7 = (C105345Uo) groupChatLiveLocationsActivity2.A0T.get(r2.A03);
                    }
                }
                if (r2.A00 != 1) {
                    List list = r2.A04;
                    if (list.size() == 1) {
                        groupChatLiveLocationsActivity2.A0O.A0S(r2, true);
                    } else if (groupChatLiveLocationsActivity2.A06.A02().A02 >= 16.0f) {
                        groupChatLiveLocationsActivity2.A0O.A0S(r2, true);
                        return true;
                    } else {
                        groupChatLiveLocationsActivity2.A78(list, true);
                        groupChatLiveLocationsActivity2.A0O.A0j = new C148197Hj(list, groupChatLiveLocationsActivity2.A06.A02().A02);
                        return true;
                    }
                }
            }
            groupChatLiveLocationsActivity2.A0O.A0C();
            return true;
        }
        r7.A04();
        return true;
    }
}
