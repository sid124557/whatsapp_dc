package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uY  reason: invalid class name and case insensitive filesystem */
public final class C163897uY implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127666Sv[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        short s = 0;
        short s2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c == 2) {
                s = (short) C162447s6.A03(parcel, readInt);
            } else if (c != 3) {
                C162447s6.A0I(parcel, readInt);
            } else {
                s2 = (short) C162447s6.A03(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127666Sv(i, s, s2);
    }
}
