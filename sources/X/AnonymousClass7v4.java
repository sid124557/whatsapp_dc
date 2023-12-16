package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7v4  reason: invalid class name */
public final class AnonymousClass7v4 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6SS[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 2:
                    z2 = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 3:
                    z3 = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 4:
                    z4 = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 5:
                    z5 = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 6:
                    z6 = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6SS(z, z2, z3, z4, z5, z6);
    }
}
