package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.7ta  reason: invalid class name and case insensitive filesystem */
public final class C163297ta implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6T2[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 2:
                    str = C162447s6.A0D(parcel, readInt);
                    break;
                case 3:
                    str2 = C162447s6.A0D(parcel, readInt);
                    break;
                case 4:
                    z2 = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 5:
                    str3 = C162447s6.A0D(parcel, readInt);
                    break;
                case 6:
                    arrayList = C162447s6.A0F(parcel, readInt);
                    break;
                case 7:
                    z3 = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6T2(str, str2, str3, arrayList, z, z2, z3);
    }
}
