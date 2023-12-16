package X;

import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.R;
import com.whatsapp.location.WaMapView;

/* renamed from: X.5hB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C110875hB implements C180298ko {
    public final /* synthetic */ LatLng A00;
    public final /* synthetic */ String A01;

    public final void BW1(C110885hC r6) {
        AnonymousClass7AD A02;
        LatLng latLng = this.A00;
        String str = this.A01;
        if (WaMapView.A02 == null) {
            if (C106915aN.A02 == null) {
                A02 = null;
            } else {
                A02 = C106915aN.A02(new AnonymousClass82A(), AnonymousClass000.A0Y("resource_", AnonymousClass001.A0o(), R.drawable.ic_map_pin));
            }
            WaMapView.A02 = A02;
        }
        C156967hV r1 = new C156967hV();
        r1.A01 = C108975ds.A02(latLng);
        r1.A00 = WaMapView.A02;
        r1.A03 = str;
        r6.A06();
        C88534Zc r0 = new C88534Zc(r6, r1);
        r6.A0C(r0);
        r0.A0H = r6;
    }

    public /* synthetic */ C110875hB(LatLng latLng, String str) {
        this.A00 = latLng;
        this.A01 = str;
    }
}
