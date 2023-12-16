package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uJ  reason: invalid class name and case insensitive filesystem */
public final class C163747uJ implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127536Si[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        byte[][] bArr = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C162447s6.A0I(parcel, readInt);
            } else {
                bArr = C162447s6.A0T(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127536Si(bArr);
    }
}
