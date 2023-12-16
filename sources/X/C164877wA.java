package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wA  reason: invalid class name and case insensitive filesystem */
public final class C164877wA implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6SH[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        long j = 0;
        String str2 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C162447s6.A0D(parcel, readInt);
            } else if (c == 3) {
                str2 = C162447s6.A0D(parcel, readInt);
            } else if (c != 4) {
                C162447s6.A0I(parcel, readInt);
            } else {
                j = C162447s6.A07(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6SH(j, str, str2);
    }
}
