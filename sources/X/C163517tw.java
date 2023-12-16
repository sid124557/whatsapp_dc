package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7tw  reason: invalid class name and case insensitive filesystem */
public final class C163517tw implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6ST[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        long j = 0;
        long j2 = 0;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C162447s6.A03(parcel, readInt);
                    break;
                case 2:
                    i2 = C162447s6.A03(parcel, readInt);
                    break;
                case 3:
                    i3 = C162447s6.A03(parcel, readInt);
                    break;
                case 4:
                    j = C162447s6.A07(parcel, readInt);
                    break;
                case 5:
                    j2 = C162447s6.A07(parcel, readInt);
                    break;
                case 6:
                    str = C162447s6.A0D(parcel, readInt);
                    break;
                case 7:
                    str2 = C162447s6.A0D(parcel, readInt);
                    break;
                case 8:
                    i4 = C162447s6.A03(parcel, readInt);
                    break;
                case 9:
                    i5 = C162447s6.A03(parcel, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6ST(str, str2, i, i2, i3, i4, i5, j, j2);
    }
}
