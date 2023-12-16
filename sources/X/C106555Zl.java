package X;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.5Zl  reason: invalid class name and case insensitive filesystem */
public final class C106555Zl {
    public static ICameraUpdateFactoryDelegate A00;

    public static AnonymousClass7BU A00(CameraPosition cameraPosition) {
        C162177rO.A03(cameraPosition, "cameraPosition must not be null");
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A00;
            C162177rO.A03(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            C163177tO r2 = (C163177tO) iCameraUpdateFactoryDelegate;
            Parcel A002 = r2.A00();
            C161087oy.A01(A002, cameraPosition);
            return new AnonymousClass7BU(C86604Kt.A0M(A002, r2, 7));
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public static AnonymousClass7BU A01(LatLng latLng) {
        C162177rO.A03(latLng, "latLng must not be null");
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A00;
            C162177rO.A03(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            C163177tO r2 = (C163177tO) iCameraUpdateFactoryDelegate;
            Parcel A002 = r2.A00();
            C161087oy.A01(A002, latLng);
            return new AnonymousClass7BU(C86604Kt.A0M(A002, r2, 8));
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public static AnonymousClass7BU A02(LatLng latLng, float f) {
        C162177rO.A03(latLng, "latLng must not be null");
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A00;
            C162177rO.A03(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            C163177tO r2 = (C163177tO) iCameraUpdateFactoryDelegate;
            Parcel A002 = r2.A00();
            C161087oy.A01(A002, latLng);
            A002.writeFloat(f);
            return new AnonymousClass7BU(C86604Kt.A0M(A002, r2, 9));
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public static AnonymousClass7BU A03(LatLngBounds latLngBounds, int i) {
        C162177rO.A03(latLngBounds, "bounds must not be null");
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A00;
            C162177rO.A03(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            C163177tO r2 = (C163177tO) iCameraUpdateFactoryDelegate;
            Parcel A002 = r2.A00();
            C161087oy.A01(A002, latLngBounds);
            A002.writeInt(i);
            return new AnonymousClass7BU(C86604Kt.A0M(A002, r2, 10));
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }
}
