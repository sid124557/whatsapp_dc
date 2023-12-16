package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7tY  reason: invalid class name and case insensitive filesystem */
public final class C163277tY implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6T3[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        C127456Sa r6 = null;
        AnonymousClass6T2 r3 = null;
        String str = null;
        C127636Ss r5 = null;
        C127576Sm r4 = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    r6 = (C127456Sa) C162447s6.A0A(parcel, C127456Sa.CREATOR, readInt);
                    break;
                case 2:
                    r3 = (AnonymousClass6T2) C162447s6.A0A(parcel, AnonymousClass6T2.CREATOR, readInt);
                    break;
                case 3:
                    str = C162447s6.A0D(parcel, readInt);
                    break;
                case 4:
                    z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 5:
                    i = C162447s6.A03(parcel, readInt);
                    break;
                case 6:
                    r5 = (C127636Ss) C162447s6.A0A(parcel, C127636Ss.CREATOR, readInt);
                    break;
                case 7:
                    r4 = (C127576Sm) C162447s6.A0A(parcel, C127576Sm.CREATOR, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6T3(r3, r4, r5, r6, str, i, z);
    }
}
