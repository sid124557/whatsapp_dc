package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7us  reason: invalid class name and case insensitive filesystem */
public final class C164097us implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127826Tl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        boolean z = true;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C162447s6.A0D(parcel, readInt);
                    break;
                case 3:
                    i = C162447s6.A03(parcel, readInt);
                    break;
                case 4:
                    i2 = C162447s6.A03(parcel, readInt);
                    break;
                case 5:
                    str2 = C162447s6.A0D(parcel, readInt);
                    break;
                case 6:
                    str3 = C162447s6.A0D(parcel, readInt);
                    break;
                case 7:
                    z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 8:
                    str4 = C162447s6.A0D(parcel, readInt);
                    break;
                case 9:
                    z2 = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 10:
                    i3 = C162447s6.A03(parcel, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127826Tl(str, str2, str3, str4, i, i2, i3, z, z2);
    }
}
