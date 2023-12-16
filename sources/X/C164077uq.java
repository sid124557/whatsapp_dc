package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uq  reason: invalid class name and case insensitive filesystem */
public final class C164077uq implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127336Ro[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                C162447s6.A0K(parcel, readInt, 4);
                parcel.readInt();
            } else if (c != 2) {
                bArr = C162447s6.A0P(parcel, bArr, c, 3, readInt);
            } else {
                str = C162447s6.A0D(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127336Ro(str, bArr);
    }
}
