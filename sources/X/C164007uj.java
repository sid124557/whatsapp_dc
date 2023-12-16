package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uj  reason: invalid class name and case insensitive filesystem */
public final class C164007uj implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127706Sz[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        long j = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                j = C162447s6.A07(parcel, readInt);
            } else if (c == 2) {
                bArr = C162447s6.A0O(parcel, readInt);
            } else if (c != 3) {
                bArr3 = C162447s6.A0P(parcel, bArr3, c, 4, readInt);
            } else {
                bArr2 = C162447s6.A0O(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127706Sz(bArr, bArr2, bArr3, j);
    }
}
