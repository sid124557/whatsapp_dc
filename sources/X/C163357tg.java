package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7tg  reason: invalid class name and case insensitive filesystem */
public final class C163357tg implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6TI[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        C127836Tm r4 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C162447s6.A0D(parcel, readInt);
                    break;
                case 2:
                    str2 = C162447s6.A0D(parcel, readInt);
                    break;
                case 3:
                    str3 = C162447s6.A0D(parcel, readInt);
                    break;
                case 4:
                    str4 = C162447s6.A0D(parcel, readInt);
                    break;
                case 5:
                    uri = (Uri) C162447s6.A0A(parcel, Uri.CREATOR, readInt);
                    break;
                case 6:
                    str5 = C162447s6.A0D(parcel, readInt);
                    break;
                case 7:
                    str6 = C162447s6.A0D(parcel, readInt);
                    break;
                case 8:
                    str7 = C162447s6.A0D(parcel, readInt);
                    break;
                case 9:
                    r4 = (C127836Tm) C162447s6.A0A(parcel, C127836Tm.CREATOR, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6TI(uri, r4, str, str2, str3, str4, str5, str6, str7);
    }
}
