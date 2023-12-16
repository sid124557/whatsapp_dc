package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uf  reason: invalid class name and case insensitive filesystem */
public final class C163967uf implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6UV[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        String[] strArr = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                bArr = C162447s6.A0O(parcel, readInt);
            } else if (c == 3) {
                bArr2 = C162447s6.A0O(parcel, readInt);
            } else if (c == 4) {
                bArr3 = C162447s6.A0O(parcel, readInt);
            } else if (c != 5) {
                C162447s6.A0I(parcel, readInt);
            } else {
                strArr = C162447s6.A0S(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6UV(bArr, bArr2, bArr3, strArr);
    }
}
