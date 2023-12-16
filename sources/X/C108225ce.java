package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.5ce  reason: invalid class name and case insensitive filesystem */
public final class C108225ce implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0I;
        C162457s7.A0J(parcel, 0);
        int[] createIntArray = parcel.createIntArray();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        ArrayList arrayList = null;
        int i = 0;
        if (parcel.readInt() == 0) {
            A0I = null;
        } else {
            int readInt = parcel.readInt();
            A0I = AnonymousClass002.A0I(readInt);
            int i2 = 0;
            while (i2 != readInt) {
                i2 = C86644Kx.A02(parcel, C108555dB.CREATOR, A0I, i2);
            }
        }
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            arrayList = AnonymousClass002.A0I(readInt2);
            while (i != readInt2) {
                i = C86644Kx.A02(parcel, C108525d8.CREATOR, arrayList, i);
            }
        }
        return new C108575dD(parcel.readString(), parcel.readString(), createStringArrayList, A0I, arrayList, parcel.createStringArrayList(), createIntArray);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108575dD[i];
    }
}
