package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7w6  reason: invalid class name and case insensitive filesystem */
public final class C164837w6 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6SZ[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c == 3) {
                str = C162447s6.A0D(parcel, readInt);
            } else if (c != 4) {
                str2 = C162447s6.A0E(parcel, str2, c, 5, readInt);
            } else {
                bArr = C162447s6.A0O(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6SZ(str, str2, bArr, i);
    }
}
