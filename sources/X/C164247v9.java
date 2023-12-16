package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.7v9  reason: invalid class name and case insensitive filesystem */
public final class C164247v9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LatLng[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                d = C162447s6.A00(parcel, readInt);
            } else if (c != 3) {
                C162447s6.A0I(parcel, readInt);
            } else {
                d2 = C162447s6.A00(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new LatLng(d, d2);
    }
}
