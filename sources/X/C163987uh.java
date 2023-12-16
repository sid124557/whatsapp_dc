package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uh  reason: invalid class name and case insensitive filesystem */
public final class C163987uh implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127686Sx[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C162447s6.A0D(parcel, readInt);
            } else if (c == 3) {
                int A04 = C162447s6.A04(parcel, readInt);
                if (A04 == 0) {
                    bool = null;
                } else {
                    C162447s6.A0J(parcel, A04, 4);
                    bool = Boolean.valueOf(AnonymousClass6C7.A1W(parcel));
                }
            } else if (c != 4) {
                str3 = C162447s6.A0E(parcel, str3, c, 5, readInt);
            } else {
                str2 = C162447s6.A0D(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127686Sx(bool, str, str2, str3);
    }
}
