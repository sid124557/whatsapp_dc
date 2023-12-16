package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7u5  reason: invalid class name and case insensitive filesystem */
public final class C163607u5 implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127856To[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        String str2 = null;
        AnonymousClass6TK r3 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
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
                    z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 4:
                    i3 = C162447s6.A03(parcel, readInt);
                    break;
                case 5:
                    z2 = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 6:
                    str = C162447s6.A0D(parcel, readInt);
                    break;
                case 7:
                    i4 = C162447s6.A03(parcel, readInt);
                    break;
                case 8:
                    str2 = C162447s6.A0D(parcel, readInt);
                    break;
                case 9:
                    r3 = (AnonymousClass6TK) C162447s6.A0A(parcel, AnonymousClass6TK.CREATOR, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127856To(r3, str, str2, i, i2, i3, i4, z, z2);
    }
}
