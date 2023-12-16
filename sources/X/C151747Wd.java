package X;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.7Wd  reason: invalid class name and case insensitive filesystem */
public final class C151747Wd {
    public float A00;
    public float A01;
    public float A02;
    public LatLng A03;

    public CameraPosition A00() {
        return new CameraPosition(this.A03, this.A00, this.A01, this.A02);
    }

    public void A01(LatLng latLng) {
        C162177rO.A03(latLng, "location must not be null.");
        this.A03 = latLng;
    }
}
