package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vT  reason: invalid class name and case insensitive filesystem */
public final class C164447vT implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127736Tc[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        C127746Td r3 = null;
        String str = null;
        String str2 = null;
        AnonymousClass6TP[] r8 = null;
        AnonymousClass6TX[] r7 = null;
        String[] strArr = null;
        AnonymousClass6TN[] r6 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    r3 = (C127746Td) C162447s6.A0A(parcel, C127746Td.CREATOR, readInt);
                    break;
                case 3:
                    str = C162447s6.A0D(parcel, readInt);
                    break;
                case 4:
                    str2 = C162447s6.A0D(parcel, readInt);
                    break;
                case 5:
                    r8 = (AnonymousClass6TP[]) C162447s6.A0R(parcel, AnonymousClass6TP.CREATOR, readInt);
                    break;
                case 6:
                    r7 = (AnonymousClass6TX[]) C162447s6.A0R(parcel, AnonymousClass6TX.CREATOR, readInt);
                    break;
                case 7:
                    strArr = C162447s6.A0S(parcel, readInt);
                    break;
                case 8:
                    r6 = (AnonymousClass6TN[]) C162447s6.A0R(parcel, AnonymousClass6TN.CREATOR, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127736Tc(r3, str, str2, r6, r7, r8, strArr);
    }
}
