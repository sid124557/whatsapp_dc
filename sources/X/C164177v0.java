package X;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import java.util.List;

/* renamed from: X.7v0  reason: invalid class name and case insensitive filesystem */
public final class C164177v0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        List list = LocationResult.A01;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C162447s6.A0I(parcel, readInt);
            } else {
                list = C162447s6.A0G(parcel, Location.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new LocationResult(list);
    }
}
