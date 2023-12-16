package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.location.PlaceInfo;

/* renamed from: X.5hN  reason: invalid class name and case insensitive filesystem */
public class C110995hN implements C181078m6 {
    public final View A00;
    public final /* synthetic */ LocationPicker2 A01;

    public C110995hN(LocationPicker2 locationPicker2) {
        this.A01 = locationPicker2;
        this.A00 = C86604Kt.A0F(locationPicker2.getLayoutInflater(), R.layout.f8nameremoved);
    }

    public View B8L(C105345Uo r6) {
        View view = this.A00;
        TextView A09 = AnonymousClass002.A09(view, R.id.place_name);
        TextView A092 = AnonymousClass002.A09(view, R.id.place_address);
        if (r6.A01() instanceof PlaceInfo) {
            PlaceInfo placeInfo = (PlaceInfo) r6.A01();
            A09.setText(placeInfo.A06);
            A092.setText(placeInfo.A0B);
        }
        return view;
    }
}
