package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: X.7vt  reason: invalid class name and case insensitive filesystem */
public final class C164707vt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C127416Rw[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c != 3) {
                C162447s6.A0I(parcel, readInt);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) C162447s6.A0A(parcel, ParcelFileDescriptor.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127416Rw(parcelFileDescriptor, i);
    }
}
