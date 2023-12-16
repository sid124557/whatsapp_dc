package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vj  reason: invalid class name and case insensitive filesystem */
public final class C164607vj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C127886Tr[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C162447s6.A0D(parcel, readInt);
            } else if (c != 3) {
                str3 = C162447s6.A0E(parcel, str3, c, 4, readInt);
            } else {
                str2 = C162447s6.A0D(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127886Tr(str, str2, str3);
    }
}
