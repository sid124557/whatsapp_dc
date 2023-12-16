package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vS  reason: invalid class name and case insensitive filesystem */
public final class C164437vS implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127756Te[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = C162447s6.A03(parcel, readInt);
                    break;
                case 3:
                    i2 = C162447s6.A03(parcel, readInt);
                    break;
                case 4:
                    i3 = C162447s6.A03(parcel, readInt);
                    break;
                case 5:
                    i4 = C162447s6.A03(parcel, readInt);
                    break;
                case 6:
                    i5 = C162447s6.A03(parcel, readInt);
                    break;
                case 7:
                    i6 = C162447s6.A03(parcel, readInt);
                    break;
                case 8:
                    z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 9:
                    str = C162447s6.A0D(parcel, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127756Te(str, i, i2, i3, i4, i5, i6, z);
    }
}
