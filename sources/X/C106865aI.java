package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.location.PlaceInfo;

/* renamed from: X.5aI  reason: invalid class name and case insensitive filesystem */
public class C106865aI implements AnonymousClass8m8 {
    public Object A00;
    public final int A01;

    public C106865aI(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BOM(int i) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) obj;
            if (i == 1) {
                C108145cU r1 = locationPicker2.A0X;
                if (r1.A0t) {
                    r1.A0S.setImageResource(R.drawable.btn_myl);
                    locationPicker2.A0X.A0s = false;
                } else {
                    PlaceInfo placeInfo = r1.A0f;
                    if (placeInfo != null) {
                        Object obj2 = placeInfo.A0D;
                        if (obj2 != null) {
                            C105345Uo r12 = (C105345Uo) obj2;
                            r12.A05(locationPicker2.A04);
                            r12.A03();
                        }
                        C108145cU r13 = locationPicker2.A0X;
                        r13.A0f = null;
                        r13.A0B();
                    }
                    C108145cU r14 = locationPicker2.A0X;
                    if (r14.A0p) {
                        r14.A0C.setVisibility(0);
                        locationPicker2.A0X.A0D.startAnimation(C86604Kt.A0I(locationPicker2.A0X.A0C.getHeight()));
                        locationPicker2.A0X.A0E.setVisibility(0);
                        locationPicker2.A0X.A0B.setVisibility(8);
                    }
                }
            }
            C108145cU r15 = locationPicker2.A0X;
            if (r15.A0s) {
                r15.A0B.setVisibility(8);
            }
            View findViewById = locationPicker2.findViewById(R.id.map_center_address);
            View findViewById2 = locationPicker2.findViewById(R.id.location_description);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            if (findViewById2 != null && locationPicker2.A0X.A0p) {
                findViewById2.setVisibility(8);
                return;
            }
            return;
        }
        DirectorySetLocationMapActivity directorySetLocationMapActivity = (DirectorySetLocationMapActivity) obj;
        if (i == 1) {
            directorySetLocationMapActivity.A0B.A01.setVisibility(0);
            directorySetLocationMapActivity.A0B.A02.startAnimation(C86604Kt.A0I(directorySetLocationMapActivity.A0B.A01.getHeight()));
            directorySetLocationMapActivity.A0B.A03.setVisibility(0);
        }
    }
}
