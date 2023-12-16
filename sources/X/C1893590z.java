package X;

import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.location.PlaceInfo;

/* renamed from: X.90z  reason: invalid class name and case insensitive filesystem */
public class C1893590z implements C181108mA {
    public Object A00;
    public final int A01;

    public C1893590z(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BW0(LatLng latLng) {
        View view;
        int i;
        if (this.A01 != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) this.A00;
            PlaceInfo placeInfo = locationPicker2.A0X.A0f;
            if (placeInfo != null) {
                Object obj = placeInfo.A0D;
                if (obj != null) {
                    ((C105345Uo) obj).A05(locationPicker2.A04);
                }
                C108145cU r1 = locationPicker2.A0X;
                r1.A0f = null;
                r1.A0B();
            }
            C108145cU r12 = locationPicker2.A0X;
            if (r12.A0p) {
                r12.A0E.setVisibility(0);
            }
            view = locationPicker2.A0X.A0B;
            i = 8;
        } else {
            view = ((DirectorySetLocationMapActivity) this.A00).A0B.A03;
            i = 0;
        }
        view.setVisibility(i);
    }
}
