package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.7v6  reason: invalid class name */
public final class AnonymousClass7v6 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CameraPosition[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        LatLng latLng = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                latLng = C162447s6.A0B(parcel, readInt);
            } else if (c == 3) {
                f = C162447s6.A01(parcel, readInt);
            } else if (c == 4) {
                C162447s6.A0K(parcel, readInt, 4);
                f2 = parcel.readFloat();
            } else if (c != 5) {
                C162447s6.A0I(parcel, readInt);
            } else {
                f3 = C162447s6.A01(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new CameraPosition(latLng, f, f2, f3);
    }
}
