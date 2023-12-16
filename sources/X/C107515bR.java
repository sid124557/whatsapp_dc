package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.LocationPicker;

/* renamed from: X.5bR  reason: invalid class name and case insensitive filesystem */
public class C107515bR implements C180298ko {
    public Object A00;
    public final int A01;

    public C107515bR(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BW1(C110885hC r10) {
        C110885hC r2;
        AnonymousClass7UM r0;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            LocationPicker locationPicker = (LocationPicker) obj;
            if (locationPicker.A03 == null) {
                locationPicker.A03 = r10;
                if (r10 != null) {
                    C626936e.A06(r10);
                    if (locationPicker.A0H.A05() && !locationPicker.A0P.A0t) {
                        locationPicker.A03.A0E(true);
                    }
                    C110885hC r22 = locationPicker.A03;
                    C108145cU r02 = locationPicker.A0P;
                    r22.A08(0, 0, Math.max(r02.A00, r02.A02));
                    AnonymousClass7TJ r03 = locationPicker.A03.A0T;
                    r03.A01 = false;
                    r03.A00();
                    locationPicker.A03.A08 = new AnonymousClass824(locationPicker);
                    C110885hC r23 = locationPicker.A03;
                    r23.A0C = new AnonymousClass69V(locationPicker, 2);
                    r23.A0A = new AnonymousClass826(locationPicker);
                    r23.A0B = new C1892990t(locationPicker, 3);
                    r23.A09 = new C1893390x(locationPicker, 2);
                    locationPicker.A0P.A0O((Float) null, false);
                    C109005dv r04 = locationPicker.A0P.A0g;
                    if (r04 != null && !r04.A0F.isEmpty()) {
                        locationPicker.A0P.A0D();
                    }
                    Bundle bundle = locationPicker.A02;
                    if (bundle != null) {
                        locationPicker.A0O.setLocationMode(bundle.getInt("map_location_mode", 2));
                        if (locationPicker.A02.containsKey("camera_zoom")) {
                            locationPicker.A03.A0A(C153847c7.A01(C108975ds.A00(locationPicker.A02.getDouble("camera_lat"), locationPicker.A02.getDouble("camera_lng")), locationPicker.A02.getFloat("camera_zoom")));
                        }
                        locationPicker.A02 = null;
                        return;
                    }
                    SharedPreferences A03 = locationPicker.A0T.A03(C58152un.A0A);
                    C108975ds A002 = C108975ds.A00((double) A03.getFloat("share_location_lat", 37.389805f), (double) A03.getFloat("share_location_lon", -122.08141f));
                    r2 = locationPicker.A03;
                    r0 = C153847c7.A01(A002, A03.getFloat("share_location_zoom", 15.0f) - 0.2f);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) obj;
            if (groupChatLiveLocationsActivity.A05 == null) {
                groupChatLiveLocationsActivity.A05 = r10;
                if (r10 != null) {
                    r10.A08(0, 0, groupChatLiveLocationsActivity.A01);
                    groupChatLiveLocationsActivity.A01 = 0;
                    C626936e.A06(groupChatLiveLocationsActivity.A05);
                    C110885hC r1 = groupChatLiveLocationsActivity.A05.A0T.A00;
                    if (r1.A0E == null) {
                        AnonymousClass4Ze r05 = new AnonymousClass4Ze(r1);
                        r1.A0E = r05;
                        r1.A0C(r05);
                    }
                    AnonymousClass7TJ r06 = groupChatLiveLocationsActivity.A05.A0T;
                    r06.A01 = false;
                    r06.A00();
                    groupChatLiveLocationsActivity.A05.A08 = new C110835h7(groupChatLiveLocationsActivity);
                    C110885hC r24 = groupChatLiveLocationsActivity.A05;
                    r24.A0C = new AnonymousClass69V(groupChatLiveLocationsActivity, 1);
                    r24.A09 = new C1893390x(groupChatLiveLocationsActivity, 1);
                    r24.A0B = new C110865hA(groupChatLiveLocationsActivity);
                    r24.A0A = new C110855h9(groupChatLiveLocationsActivity);
                    groupChatLiveLocationsActivity.A76();
                    Bundle bundle2 = groupChatLiveLocationsActivity.A02;
                    if (bundle2 != null) {
                        groupChatLiveLocationsActivity.A0M.setLocationMode(bundle2.getInt("map_location_mode", 2));
                        if (groupChatLiveLocationsActivity.A02.containsKey("camera_zoom")) {
                            groupChatLiveLocationsActivity.A05.A0A(C153847c7.A01(C108975ds.A00(groupChatLiveLocationsActivity.A02.getDouble("camera_lat"), groupChatLiveLocationsActivity.A02.getDouble("camera_lng")), groupChatLiveLocationsActivity.A02.getFloat("camera_zoom")));
                        }
                        groupChatLiveLocationsActivity.A02 = null;
                        return;
                    } else if (groupChatLiveLocationsActivity.A0T.isEmpty()) {
                        SharedPreferences A032 = groupChatLiveLocationsActivity.A0R.A03(C58152un.A0A);
                        C108975ds A003 = C108975ds.A00((double) A032.getFloat("live_location_lat", 37.389805f), (double) A032.getFloat("live_location_lng", -122.08141f));
                        C110885hC r12 = groupChatLiveLocationsActivity.A05;
                        AnonymousClass7UM r07 = new AnonymousClass7UM();
                        r07.A06 = A003;
                        r12.A0A(r07);
                        r2 = groupChatLiveLocationsActivity.A05;
                        r0 = new AnonymousClass7UM();
                        r0.A01 = A032.getFloat("live_location_zoom", 16.0f) - 0.2f;
                    } else {
                        groupChatLiveLocationsActivity.A79(false);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        r2.A0A(r0);
    }
}
