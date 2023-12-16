package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.PlaceInfo;

/* renamed from: X.824  reason: invalid class name */
public class AnonymousClass824 implements C180248kj {
    public final View A00;
    public final /* synthetic */ LocationPicker A01;

    public AnonymousClass824(LocationPicker locationPicker) {
        this.A01 = locationPicker;
        this.A00 = AnonymousClass001.A0R(locationPicker.getLayoutInflater(), (ViewGroup) null, R.layout.f8nameremoved);
    }

    public View B8K(C88534Zc r6) {
        View view = this.A00;
        TextView A09 = AnonymousClass002.A09(view, R.id.place_name);
        TextView A092 = AnonymousClass002.A09(view, R.id.place_address);
        Object obj = r6.A0K;
        if (obj instanceof PlaceInfo) {
            PlaceInfo placeInfo = (PlaceInfo) obj;
            A09.setText(placeInfo.A06);
            A092.setText(placeInfo.A0B);
        }
        return view;
    }
}
