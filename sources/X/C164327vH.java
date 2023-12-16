package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vH  reason: invalid class name and case insensitive filesystem */
public final class C164327vH implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6SE[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        byte[] bArr = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C162447s6.A0D(parcel, readInt);
            } else if (c != 3) {
                i = C162447s6.A05(parcel, c, readInt, i);
            } else {
                bArr = C162447s6.A0O(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6SE(str, bArr, i);
    }
}
