package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7u1  reason: invalid class name and case insensitive filesystem */
public final class C163567u1 implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6SQ[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        AnonymousClass6SP r3 = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    r3 = (AnonymousClass6SP) C162447s6.A0A(parcel, AnonymousClass6SP.CREATOR, readInt);
                    break;
                case 2:
                    z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 3:
                    z2 = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 4:
                    iArr = C162447s6.A0Q(parcel, readInt);
                    break;
                case 5:
                    i = C162447s6.A03(parcel, readInt);
                    break;
                case 6:
                    iArr2 = C162447s6.A0Q(parcel, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6SQ(r3, iArr, iArr2, i, z, z2);
    }
}
