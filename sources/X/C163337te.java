package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7te  reason: invalid class name and case insensitive filesystem */
public final class C163337te implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127646St[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        C127586Sn r1 = null;
        String str = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                r1 = (C127586Sn) C162447s6.A0A(parcel, C127586Sn.CREATOR, readInt);
            } else if (c != 2) {
                i = C162447s6.A06(parcel, c, 3, readInt, i);
            } else {
                str = C162447s6.A0D(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127646St(r1, str, i);
    }
}
