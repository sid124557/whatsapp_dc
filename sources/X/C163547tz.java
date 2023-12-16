package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7tz  reason: invalid class name and case insensitive filesystem */
public final class C163547tz implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6SP[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c == 2) {
                z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
            } else if (c == 3) {
                z2 = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
            } else if (c != 4) {
                i3 = C162447s6.A06(parcel, c, 5, readInt, i3);
            } else {
                C162447s6.A0K(parcel, readInt, 4);
                i2 = parcel.readInt();
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6SP(i, i2, i3, z, z2);
    }
}
