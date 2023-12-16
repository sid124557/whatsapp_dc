package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.7vD  reason: invalid class name and case insensitive filesystem */
public final class C164287vD implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6TF[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        LatLngBounds latLngBounds = null;
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                latLng = C162447s6.A0B(parcel, readInt);
            } else if (c == 3) {
                latLng2 = C162447s6.A0B(parcel, readInt);
            } else if (c == 4) {
                latLng3 = C162447s6.A0B(parcel, readInt);
            } else if (c == 5) {
                latLng4 = C162447s6.A0B(parcel, readInt);
            } else if (c != 6) {
                C162447s6.A0I(parcel, readInt);
            } else {
                latLngBounds = (LatLngBounds) C162447s6.A0A(parcel, LatLngBounds.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6TF(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }
}
