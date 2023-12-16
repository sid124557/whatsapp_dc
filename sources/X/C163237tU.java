package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.7tU  reason: invalid class name and case insensitive filesystem */
public final class C163237tU implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C128096Ut[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C162447s6.A03(parcel, readInt);
                    break;
                case 2:
                    arrayList = C162447s6.A0F(parcel, readInt);
                    break;
                case 3:
                    arrayList2 = C162447s6.A0F(parcel, readInt);
                    break;
                case 4:
                    arrayList3 = C162447s6.A0F(parcel, readInt);
                    break;
                case 5:
                    arrayList4 = C162447s6.A0F(parcel, readInt);
                    break;
                case 6:
                    arrayList5 = C162447s6.A0F(parcel, readInt);
                    break;
                default:
                    C162447s6.A0I(parcel, readInt);
                    break;
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C128096Ut(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, i);
    }
}
