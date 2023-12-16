package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import java.util.ArrayList;

/* renamed from: X.7to  reason: invalid class name and case insensitive filesystem */
public final class C163437to implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        Long l = null;
        ArrayList arrayList = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C162447s6.A03(parcel, readInt);
                    break;
                case 2:
                    str = C162447s6.A0D(parcel, readInt);
                    break;
                case 3:
                    int A04 = C162447s6.A04(parcel, readInt);
                    if (A04 != 0) {
                        C162447s6.A0J(parcel, A04, 8);
                        l = Long.valueOf(parcel.readLong());
                        break;
                    } else {
                        l = null;
                        break;
                    }
                case 4:
                    z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 5:
                    z2 = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
                    break;
                case 6:
                    arrayList = C162447s6.A0F(parcel, readInt);
                    break;
                case 7:
                    str2 = C162447s6.A0D(parcel, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new TokenData(l, str, str2, arrayList, i, z, z2);
    }
}
