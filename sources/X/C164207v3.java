package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.7v3  reason: invalid class name and case insensitive filesystem */
public final class C164207v3 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C127906Tu[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        Status status = null;
        AnonymousClass6SS r2 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                status = (Status) C162447s6.A0A(parcel, Status.CREATOR, readInt);
            } else if (c != 2) {
                C162447s6.A0I(parcel, readInt);
            } else {
                r2 = (AnonymousClass6SS) C162447s6.A0A(parcel, AnonymousClass6SS.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127906Tu(status, r2);
    }
}
