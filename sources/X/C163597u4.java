package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7u4  reason: invalid class name and case insensitive filesystem */
public final class C163597u4 implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6TS[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c != 2) {
                i2 = C162447s6.A06(parcel, c, 3, readInt, i2);
            } else {
                str = C162447s6.A0D(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6TS(i, str, i2);
    }
}
