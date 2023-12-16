package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7tq  reason: invalid class name and case insensitive filesystem */
public final class C163457tq implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127816Tk[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        C127826Tl r3 = null;
        byte[] bArr = null;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[][] bArr2 = null;
        C127876Tq[] r7 = null;
        boolean z = true;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    r3 = (C127826Tl) C162447s6.A0A(parcel, C127826Tl.CREATOR, readInt);
                    break;
                case 3:
                    bArr = C162447s6.A0O(parcel, readInt);
                    break;
                case 4:
                    iArr = C162447s6.A0Q(parcel, readInt);
                    break;
                case 5:
                    strArr = C162447s6.A0S(parcel, readInt);
                    break;
                case 6:
                    iArr2 = C162447s6.A0Q(parcel, readInt);
                    break;
                case 7:
                    bArr2 = C162447s6.A0T(parcel, readInt);
                    break;
                case 8:
                    z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 9:
                    r7 = (C127876Tq[]) C162447s6.A0R(parcel, C127876Tq.CREATOR, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127816Tk(r3, bArr, iArr, iArr2, r7, strArr, bArr2, z);
    }
}
