package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vg  reason: invalid class name and case insensitive filesystem */
public final class C164577vg implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6SO[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c == 2) {
                f = C162447s6.A01(parcel, readInt);
            } else if (c != 3) {
                i2 = C162447s6.A05(parcel, c, readInt, i2);
            } else {
                f2 = C162447s6.A01(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6SO(f, f2, i, i2);
    }
}
