package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vx  reason: invalid class name and case insensitive filesystem */
public final class C164747vx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C127446Rz[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                str = C162447s6.A0E(parcel, str, c, 3, readInt);
            } else {
                i = C162447s6.A03(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127446Rz(i, str);
    }
}
