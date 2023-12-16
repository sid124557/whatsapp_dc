package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uc  reason: invalid class name and case insensitive filesystem */
public final class C163937uc implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127606Sp[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                bArr2 = C162447s6.A0P(parcel, bArr2, c, 2, readInt);
            } else {
                bArr = C162447s6.A0O(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127606Sp(bArr, bArr2);
    }
}
