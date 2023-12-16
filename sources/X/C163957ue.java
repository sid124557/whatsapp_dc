package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7ue  reason: invalid class name and case insensitive filesystem */
public final class C163957ue implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6UW[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
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
                bArr5 = C162447s6.A0P(parcel, bArr5, c, 6, readInt);
            } else {
                bArr4 = C162447s6.A0O(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6UW(bArr, bArr2, bArr3, bArr4, bArr5);
    }
}
