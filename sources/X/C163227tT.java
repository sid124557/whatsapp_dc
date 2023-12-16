package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.7tT  reason: invalid class name and case insensitive filesystem */
public final class C163227tT implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C128086Us[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        HashSet A0K = AnonymousClass002.A0K();
        ArrayList arrayList = null;
        C128096Ut r4 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            int i3 = 1;
            if (c != 1) {
                i3 = 2;
                if (c != 2) {
                    i3 = 3;
                    if (c != 3) {
                        i3 = 4;
                        if (c != 4) {
                            C162447s6.A0I(parcel, readInt);
                        } else {
                            r4 = (C128096Ut) C162447s6.A0A(parcel, C128096Ut.CREATOR, readInt);
                        }
                    } else {
                        i2 = C162447s6.A03(parcel, readInt);
                    }
                } else {
                    arrayList = C162447s6.A0G(parcel, C128106Uu.CREATOR, readInt);
                }
            } else {
                i = C162447s6.A03(parcel, readInt);
            }
            C18270x1.A1K(A0K, i3);
        }
        if (parcel.dataPosition() == A02) {
            return new C128086Us(r4, arrayList, A0K, i, i2);
        }
        throw new AnonymousClass8RI(parcel, AnonymousClass000.A0Y("Overread allowed size end=", AnonymousClass001.A0o(), A02));
    }
}
