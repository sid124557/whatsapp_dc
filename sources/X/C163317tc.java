package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7tc  reason: invalid class name and case insensitive filesystem */
public final class C163317tc implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127636Ss[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        byte[] bArr = null;
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
            } else if (c != 2) {
                str = C162447s6.A0E(parcel, str, c, 3, readInt);
            } else {
                bArr = C162447s6.A0O(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127636Ss(bArr, str, z);
    }
}
