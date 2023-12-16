package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.whatsapp.R;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.LocationPicker2;

/* renamed from: X.5bP  reason: invalid class name and case insensitive filesystem */
public class C107495bP implements C181128mC {
    public Object A00;
    public final int A01;

    public C107495bP(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BW2(C105415Uv r10) {
        C105415Uv r1;
        AnonymousClass6TJ A002;
        if (this.A01 != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) this.A00;
            if (locationPicker2.A02 == null) {
                locationPicker2.A02 = r10;
                C626936e.A06(r10);
                C105415Uv r12 = locationPicker2.A02;
                locationPicker2.A0V = new AnonymousClass7E1(r12);
                r12.A0M(false);
                locationPicker2.A02.A0K(true);
                if (locationPicker2.A0N.A05() && !locationPicker2.A0X.A0t) {
                    locationPicker2.A02.A0L(true);
                }
                C105415Uv r2 = locationPicker2.A02;
                C108145cU r0 = locationPicker2.A0X;
                r2.A08(0, 0, 0, Math.max(r0.A00, r0.A02));
                locationPicker2.A02.A01().A00();
                locationPicker2.A02.A0D(new C110995hN(locationPicker2));
                locationPicker2.A02.A0I(new C1236869j(locationPicker2, 1));
                locationPicker2.A02.A0G(new AnonymousClass8B6(locationPicker2));
                locationPicker2.A02.A0H(new C1893590z(locationPicker2, 1));
                locationPicker2.A02.A0F(new C106865aI(locationPicker2, 1));
                locationPicker2.A02.A0E(new AnonymousClass6B9(locationPicker2, 2));
                locationPicker2.A0X.A0O((Float) null, false);
                C109005dv r02 = locationPicker2.A0X.A0g;
                if (r02 != null && !r02.A0F.isEmpty()) {
                    locationPicker2.A0X.A0D();
                }
                Bundle bundle = locationPicker2.A00;
                if (bundle != null) {
                    locationPicker2.A0W.setLocationMode(bundle.getInt("map_location_mode", 2));
                    if (locationPicker2.A00.containsKey("camera_zoom")) {
                        locationPicker2.A02.A0A(C106555Zl.A02(AnonymousClass4L0.A0H(locationPicker2.A00.getDouble("camera_lat"), locationPicker2.A00.getDouble("camera_lng")), locationPicker2.A00.getFloat("camera_zoom")));
                    }
                    locationPicker2.A00 = null;
                } else {
                    SharedPreferences A03 = locationPicker2.A0b.A03(C58152un.A0A);
                    locationPicker2.A02.A0A(C106555Zl.A02(AnonymousClass4L0.A0H((double) A03.getFloat("share_location_lat", 37.389805f), (double) A03.getFloat("share_location_lon", -122.08141f)), A03.getFloat("share_location_zoom", 15.0f) - 0.2f));
                }
                if (C107405bG.A0D(locationPicker2)) {
                    r1 = locationPicker2.A02;
                    A002 = AnonymousClass6TJ.A00(locationPicker2, R.raw.night_map_style_json);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A00;
            if (groupChatLiveLocationsActivity2.A06 == null) {
                groupChatLiveLocationsActivity2.A06 = r10;
                r10.A08(0, 0, 0, groupChatLiveLocationsActivity2.A01);
                groupChatLiveLocationsActivity2.A01 = 0;
                C626936e.A06(groupChatLiveLocationsActivity2.A06);
                C60152y5 r03 = groupChatLiveLocationsActivity2.A0S;
                String str = C58152un.A0A;
                int i = 0;
                boolean z = r03.A03(str).getBoolean("live_location_show_traffic", false);
                groupChatLiveLocationsActivity2.A06.A0M(z);
                MenuItem menuItem = groupChatLiveLocationsActivity2.A03;
                if (menuItem != null) {
                    menuItem.setChecked(z);
                }
                groupChatLiveLocationsActivity2.A06.A07(groupChatLiveLocationsActivity2.A0S.A03(str).getInt("live_location_map_type", 1));
                groupChatLiveLocationsActivity2.A06.A0K(true);
                try {
                    C163177tO r7 = (C163177tO) groupChatLiveLocationsActivity2.A06.A01().A00;
                    Parcel A003 = r7.A00();
                    A003.writeInt(1);
                    r7.A02(2, A003);
                    try {
                        C163177tO r13 = (C163177tO) groupChatLiveLocationsActivity2.A06.A01().A00;
                        Parcel A004 = r13.A00();
                        A004.writeInt(0);
                        r13.A02(1, A004);
                        groupChatLiveLocationsActivity2.A06.A01().A00();
                        groupChatLiveLocationsActivity2.A06.A0D(new C110985hM(groupChatLiveLocationsActivity2));
                        groupChatLiveLocationsActivity2.A06.A0I(new C1236869j(groupChatLiveLocationsActivity2, 0));
                        groupChatLiveLocationsActivity2.A06.A0F(new AnonymousClass8B5(groupChatLiveLocationsActivity2));
                        groupChatLiveLocationsActivity2.A06.A0E(new AnonymousClass6B9(groupChatLiveLocationsActivity2, 1));
                        groupChatLiveLocationsActivity2.A06.A0H(new C111015hP(groupChatLiveLocationsActivity2));
                        groupChatLiveLocationsActivity2.A06.A0G(new C111005hO(groupChatLiveLocationsActivity2));
                        groupChatLiveLocationsActivity2.A76();
                        if (groupChatLiveLocationsActivity2.A02 != null) {
                            C111445i6 r22 = groupChatLiveLocationsActivity2.A0O;
                            View view = r22.A0U;
                            if (!r22.A0u || r22.A0m != null) {
                                i = 8;
                            }
                            view.setVisibility(i);
                            groupChatLiveLocationsActivity2.A0N.setLocationMode(groupChatLiveLocationsActivity2.A02.getInt("map_location_mode", 2));
                            if (groupChatLiveLocationsActivity2.A02.containsKey("camera_zoom")) {
                                groupChatLiveLocationsActivity2.A06.A0A(C106555Zl.A02(AnonymousClass4L0.A0H(groupChatLiveLocationsActivity2.A02.getDouble("camera_lat"), groupChatLiveLocationsActivity2.A02.getDouble("camera_lng")), groupChatLiveLocationsActivity2.A02.getFloat("camera_zoom")));
                            }
                            groupChatLiveLocationsActivity2.A02 = null;
                        } else if (groupChatLiveLocationsActivity2.A0U.isEmpty()) {
                            SharedPreferences A032 = groupChatLiveLocationsActivity2.A0S.A03(str);
                            groupChatLiveLocationsActivity2.A06.A0A(C106555Zl.A01(AnonymousClass4L0.A0H((double) A032.getFloat("live_location_lat", 37.389805f), (double) A032.getFloat("live_location_lng", -122.08141f))));
                            C105415Uv r4 = groupChatLiveLocationsActivity2.A06;
                            float f = A032.getFloat("live_location_zoom", 16.0f) - 0.2f;
                            try {
                                ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = C106555Zl.A00;
                                C162177rO.A03(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
                                C163177tO r23 = (C163177tO) iCameraUpdateFactoryDelegate;
                                Parcel A005 = r23.A00();
                                A005.writeFloat(f);
                                r4.A0A(new AnonymousClass7BU(C86604Kt.A0M(A005, r23, 4)));
                            } catch (RemoteException e) {
                                throw AnonymousClass4L0.A0I(e);
                            }
                        } else {
                            groupChatLiveLocationsActivity2.A79(false);
                        }
                        if (C107405bG.A0D(groupChatLiveLocationsActivity2)) {
                            r1 = groupChatLiveLocationsActivity2.A06;
                            A002 = AnonymousClass6TJ.A00(groupChatLiveLocationsActivity2, R.raw.night_map_style_json);
                        } else {
                            return;
                        }
                    } catch (RemoteException e2) {
                        throw AnonymousClass4L0.A0I(e2);
                    }
                } catch (RemoteException e3) {
                    throw AnonymousClass4L0.A0I(e3);
                }
            } else {
                return;
            }
        }
        r1.A0J(A002);
    }
}
