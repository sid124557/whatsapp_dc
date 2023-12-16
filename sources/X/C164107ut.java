package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.7ut  reason: invalid class name and case insensitive filesystem */
public final class C164107ut implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C127896Tt[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        Status status = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C162447s6.A0I(parcel, readInt);
            } else {
                status = (Status) C162447s6.A0A(parcel, Status.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127896Tt(status);
    }
}
