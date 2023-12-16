package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vF  reason: invalid class name and case insensitive filesystem */
public final class C164307vF implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127876Tq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C162447s6.A0D(parcel, readInt);
                    break;
                case 3:
                    bArr = C162447s6.A0O(parcel, readInt);
                    break;
                case 4:
                    bArr2 = C162447s6.A0T(parcel, readInt);
                    break;
                case 5:
                    bArr3 = C162447s6.A0T(parcel, readInt);
                    break;
                case 6:
                    bArr4 = C162447s6.A0T(parcel, readInt);
                    break;
                case 7:
                    bArr5 = C162447s6.A0T(parcel, readInt);
                    break;
                case 8:
                    iArr = C162447s6.A0Q(parcel, readInt);
                    break;
                case 9:
                    bArr6 = C162447s6.A0T(parcel, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127876Tq(str, bArr, iArr, bArr2, bArr3, bArr4, bArr5, bArr6);
    }
}
