package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wD  reason: invalid class name and case insensitive filesystem */
public final class C164907wD implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C127296Rk[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            i = C162447s6.A06(parcel, (char) readInt, 2, readInt, i);
        }
        C162447s6.A0H(parcel, A02);
        return new C127296Rk(i);
    }
}
