package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7w8  reason: invalid class name and case insensitive filesystem */
public final class C164857w8 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6S7[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        C127886Tr r1 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c != 3) {
                C162447s6.A0I(parcel, readInt);
            } else {
                r1 = (C127886Tr) C162447s6.A0A(parcel, C127886Tr.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6S7(r1, i);
    }
}
