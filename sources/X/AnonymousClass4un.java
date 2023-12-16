package X;

import android.content.Context;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.WaMapView;

/* renamed from: X.4un  reason: invalid class name */
public class AnonymousClass4un extends WaMapView {
    public AnonymousClass5PJ A00;
    public Integer A01;

    public void A01(LatLng latLng, AnonymousClass6TJ r3, C28071fd r4) {
        this.A01 = null;
        super.A01(latLng, r3, r4);
    }

    public void A02(C28071fd r2, C30801n8 r3, boolean z) {
        this.A01 = null;
        super.A02(r2, r3, z);
    }

    public void A03(C28071fd r2, AnonymousClass1n9 r3) {
        this.A01 = null;
        super.A03(r2, r3);
    }

    public void A04(LatLng latLng, C28071fd r3, Integer num) {
        this.A01 = num;
        super.A01(latLng, (AnonymousClass6TJ) null, r3);
    }

    public void setupGoogleMap(AnonymousClass6FD r7, LatLng latLng, AnonymousClass6TJ r9) {
        r7.A08(new C107585bY(r7, latLng, r9, this, 1));
    }

    public AnonymousClass4un(Context context) {
        super(context);
    }
}
