package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vW  reason: invalid class name and case insensitive filesystem */
public final class C164477vW implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C162447s6.A02(parcel2);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (parcel2.dataPosition() < A02) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C162447s6.A0D(parcel2, readInt);
                    break;
                case 3:
                    str2 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 4:
                    str3 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 5:
                    str4 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 6:
                    str5 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 7:
                    str6 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 8:
                    str7 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 9:
                    str8 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 10:
                    str9 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 11:
                    str10 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 12:
                    str11 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 13:
                    str12 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 14:
                    str13 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 15:
                    str14 = C162447s6.A0D(parcel2, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel2, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel2, A02);
        return new C127786Th(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C127786Th[i];
    }
}
