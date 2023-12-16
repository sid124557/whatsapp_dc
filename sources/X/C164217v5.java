package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7v5  reason: invalid class name and case insensitive filesystem */
public final class C164217v5 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6TD[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        long j = -1;
        long j2 = -1;
        int i = 1;
        int i2 = 1;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c == 2) {
                i2 = C162447s6.A03(parcel, readInt);
            } else if (c == 3) {
                j = C162447s6.A07(parcel, readInt);
            } else if (c != 4) {
                C162447s6.A0I(parcel, readInt);
            } else {
                j2 = C162447s6.A07(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6TD(i, i2, j, j2);
    }
}
