package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.7uK  reason: invalid class name and case insensitive filesystem */
public final class C163757uK implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6UX[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        C127656Su r5 = null;
        C127696Sy r6 = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        Double d = null;
        ArrayList arrayList2 = null;
        C127686Sx r4 = null;
        Integer num = null;
        C127626Sr r7 = null;
        String str = null;
        AnonymousClass6T4 r3 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    r5 = (C127656Su) C162447s6.A0A(parcel, C127656Su.CREATOR, readInt);
                    break;
                case 3:
                    r6 = (C127696Sy) C162447s6.A0A(parcel, C127696Sy.CREATOR, readInt);
                    break;
                case 4:
                    bArr = C162447s6.A0O(parcel, readInt);
                    break;
                case 5:
                    arrayList = C162447s6.A0G(parcel, C127596So.CREATOR, readInt);
                    break;
                case 6:
                    int A04 = C162447s6.A04(parcel, readInt);
                    if (A04 != 0) {
                        C162447s6.A0J(parcel, A04, 8);
                        d = Double.valueOf(parcel.readDouble());
                        break;
                    } else {
                        d = null;
                        break;
                    }
                case 7:
                    arrayList2 = C162447s6.A0G(parcel, C127676Sw.CREATOR, readInt);
                    break;
                case 8:
                    r4 = (C127686Sx) C162447s6.A0A(parcel, C127686Sx.CREATOR, readInt);
                    break;
                case 9:
                    int A042 = C162447s6.A04(parcel, readInt);
                    if (A042 != 0) {
                        C162447s6.A0J(parcel, A042, 4);
                        num = AnonymousClass6CA.A0P(parcel);
                        break;
                    } else {
                        num = null;
                        break;
                    }
                case 10:
                    r7 = (C127626Sr) C162447s6.A0A(parcel, C127626Sr.CREATOR, readInt);
                    break;
                case 11:
                    str = C162447s6.A0D(parcel, readInt);
                    break;
                case 12:
                    r3 = (AnonymousClass6T4) C162447s6.A0A(parcel, AnonymousClass6T4.CREATOR, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6UX(r3, r4, r5, r6, r7, d, num, str, arrayList, arrayList2, bArr);
    }
}
