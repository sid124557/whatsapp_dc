package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uo  reason: invalid class name and case insensitive filesystem */
public final class C164057uo implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127326Rn[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                C162447s6.A0K(parcel, readInt, 4);
                parcel.readInt();
            } else if (c != 2) {
                i = C162447s6.A06(parcel, c, 3, readInt, i);
            } else {
                str = C162447s6.A0D(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127326Rn(str, i);
    }
}
