package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.5ci  reason: invalid class name and case insensitive filesystem */
public final class C108265ci implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0I;
        String A0a = AnonymousClass0x2.A0a(parcel);
        int readInt = parcel.readInt();
        ArrayList arrayList = null;
        int i = 0;
        if (parcel.readInt() == 0) {
            A0I = null;
        } else {
            int readInt2 = parcel.readInt();
            A0I = AnonymousClass002.A0I(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = C86644Kx.A02(parcel, C108585dE.CREATOR, A0I, i2);
            }
        }
        if (parcel.readInt() != 0) {
            int readInt3 = parcel.readInt();
            arrayList = AnonymousClass002.A0I(readInt3);
            while (i != readInt3) {
                i = C86644Kx.A02(parcel, C108505d6.CREATOR, arrayList, i);
            }
        }
        return new C108535d9(A0a, A0I, arrayList, readInt);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108535d9[i];
    }
}
