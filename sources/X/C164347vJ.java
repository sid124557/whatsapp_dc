package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vJ  reason: invalid class name and case insensitive filesystem */
public final class C164347vJ implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C127246Rf[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            str = C162447s6.A0E(parcel, str, (char) readInt, 2, readInt);
        }
        C162447s6.A0H(parcel, A02);
        return new C127246Rf(str);
    }
}
