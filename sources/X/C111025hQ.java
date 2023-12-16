package X;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.R;
import com.whatsapp.location.WaMapView;

/* renamed from: X.5hQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C111025hQ implements C181128mC {
    public final /* synthetic */ LatLng A00;
    public final /* synthetic */ String A01;

    public final void BW2(C105415Uv r6) {
        LatLng latLng = this.A00;
        String str = this.A01;
        AnonymousClass7BV r1 = WaMapView.A03;
        if (r1 == null) {
            try {
                C187128wY r2 = AnonymousClass5CV.A00;
                C162177rO.A03(r2, "IBitmapDescriptorFactory is not initialized");
                C163177tO r22 = (C163177tO) r2;
                Parcel A002 = r22.A00();
                A002.writeInt(R.drawable.ic_map_pin);
                r1 = new AnonymousClass7BV(C86604Kt.A0M(A002, r22, 1));
                WaMapView.A03 = r1;
            } catch (RemoteException e) {
                throw AnonymousClass4L0.A0I(e);
            }
        }
        C127776Tg r0 = new C127776Tg();
        r0.A08 = latLng;
        r0.A07 = r1;
        r0.A09 = str;
        r6.A06();
        r6.A03(r0);
    }

    public /* synthetic */ C111025hQ(LatLng latLng, String str) {
        this.A00 = latLng;
        this.A01 = str;
    }
}
