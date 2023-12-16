package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7u9  reason: invalid class name and case insensitive filesystem */
public final class C163647u9 implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6UL[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        Parcel parcel2 = null;
        AnonymousClass6SX r2 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c == 2) {
                int A04 = C162447s6.A04(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (A04 == 0) {
                    parcel2 = null;
                } else {
                    parcel2 = Parcel.obtain();
                    parcel2.appendFrom(parcel, dataPosition, A04);
                    parcel.setDataPosition(dataPosition + A04);
                }
            } else if (c != 3) {
                C162447s6.A0I(parcel, readInt);
            } else {
                r2 = (AnonymousClass6SX) C162447s6.A0A(parcel, AnonymousClass6SX.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6UL(parcel2, r2, i);
    }
}
