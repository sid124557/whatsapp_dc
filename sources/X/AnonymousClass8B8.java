package X;

import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.WaMapView;

/* renamed from: X.8B8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8B8 implements C181128mC {
    public final /* synthetic */ LatLng A00;
    public final /* synthetic */ AnonymousClass6TJ A01;
    public final /* synthetic */ WaMapView A02;

    public final void BW2(C105415Uv r5) {
        WaMapView waMapView = this.A02;
        waMapView.setupGoogleMap(waMapView.A01, this.A00, this.A01);
    }

    public /* synthetic */ AnonymousClass8B8(LatLng latLng, AnonymousClass6TJ r2, WaMapView waMapView) {
        this.A02 = waMapView;
        this.A00 = latLng;
        this.A01 = r2;
    }
}
