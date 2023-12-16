package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wI  reason: invalid class name and case insensitive filesystem */
public final class C164957wI implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C162447s6.A02(parcel2);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        while (parcel2.dataPosition() < A02) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 2:
                    i = C162447s6.A03(parcel2, readInt);
                    break;
                case 3:
                    str = C162447s6.A0D(parcel2, readInt);
                    break;
                case 4:
                    str2 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 5:
                    str3 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 6:
                    str4 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 7:
                    str5 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 8:
                    str6 = C162447s6.A0D(parcel2, readInt);
                    break;
                case 9:
                    b = (byte) C162447s6.A03(parcel2, readInt);
                    break;
                case 10:
                    b2 = (byte) C162447s6.A03(parcel2, readInt);
                    break;
                case 11:
                    b3 = (byte) C162447s6.A03(parcel2, readInt);
                    break;
                case 12:
                    b4 = (byte) C162447s6.A03(parcel2, readInt);
                    break;
                case 13:
                    str7 = C162447s6.A0D(parcel2, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel2, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel2, A02);
        return new AnonymousClass6TH(str, str2, str3, str4, str5, str6, str7, b, b2, b3, b4, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6TH[i];
    }
}
