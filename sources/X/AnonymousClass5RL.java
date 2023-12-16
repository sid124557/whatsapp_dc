package X;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.5RL  reason: invalid class name */
public final class AnonymousClass5RL {
    public final IProjectionDelegate A00;

    public LatLng A01(Point point) {
        Parcelable parcelable;
        try {
            C163177tO r2 = (C163177tO) this.A00;
            Parcel A01 = r2.A01(1, C86644Kx.A0E(new AnonymousClass6UT(point), r2));
            Parcelable.Creator creator = LatLng.CREATOR;
            if (A01.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(A01);
            }
            LatLng latLng = (LatLng) parcelable;
            A01.recycle();
            return latLng;
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public AnonymousClass6TF A02() {
        Parcelable parcelable;
        try {
            Parcel A0e = C86664Kz.A0e((C163177tO) this.A00, 3);
            Parcelable.Creator creator = AnonymousClass6TF.CREATOR;
            if (A0e.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(A0e);
            }
            AnonymousClass6TF r0 = (AnonymousClass6TF) parcelable;
            A0e.recycle();
            return r0;
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }

    public AnonymousClass5RL(IProjectionDelegate iProjectionDelegate) {
        this.A00 = iProjectionDelegate;
    }

    public Point A00(LatLng latLng) {
        C162177rO.A02(latLng);
        try {
            C163177tO r2 = (C163177tO) this.A00;
            Parcel A002 = r2.A00();
            C161087oy.A01(A002, latLng);
            return (Point) AnonymousClass6UT.A01(C86604Kt.A0M(A002, r2, 2));
        } catch (RemoteException e) {
            throw AnonymousClass4L0.A0I(e);
        }
    }
}
