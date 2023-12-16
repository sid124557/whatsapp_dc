package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vU  reason: invalid class name and case insensitive filesystem */
public final class C164457vU implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127726Tb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        C127756Te r3 = null;
        C127756Te r4 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C162447s6.A0D(parcel, readInt);
                    break;
                case 3:
                    str2 = C162447s6.A0D(parcel, readInt);
                    break;
                case 4:
                    str3 = C162447s6.A0D(parcel, readInt);
                    break;
                case 5:
                    str4 = C162447s6.A0D(parcel, readInt);
                    break;
                case 6:
                    str5 = C162447s6.A0D(parcel, readInt);
                    break;
                case 7:
                    r3 = (C127756Te) C162447s6.A0A(parcel, C127756Te.CREATOR, readInt);
                    break;
                case 8:
                    r4 = (C127756Te) C162447s6.A0A(parcel, C127756Te.CREATOR, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127726Tb(r3, r4, str, str2, str3, str4, str5);
    }
}
