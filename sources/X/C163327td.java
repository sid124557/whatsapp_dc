package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7td  reason: invalid class name and case insensitive filesystem */
public final class C163327td implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127456Sa[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            z = C162447s6.A0N(parcel, z);
        }
        C162447s6.A0H(parcel, A02);
        return new C127456Sa(z);
    }
}
