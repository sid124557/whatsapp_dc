package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7tp  reason: invalid class name and case insensitive filesystem */
public final class C163447tp implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6TA[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
            } else if (c == 2) {
                j2 = C162447s6.A07(parcel, readInt);
            } else if (c != 3) {
                C162447s6.A0I(parcel, readInt);
            } else {
                j = C162447s6.A07(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6TA(j, j2, z);
    }
}
