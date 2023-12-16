package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7tX  reason: invalid class name and case insensitive filesystem */
public final class C163267tX implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6SK[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        long j = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c == 2) {
                z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
            } else if (c != 3) {
                z2 = C162447s6.A0M(parcel, c, 4, readInt, z2);
            } else {
                j = C162447s6.A07(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6SK(i, j, z, z2);
    }
}
