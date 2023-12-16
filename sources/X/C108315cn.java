package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.5cn  reason: invalid class name and case insensitive filesystem */
public final class C108315cn implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0I;
        ArrayList A0I2;
        Object createFromParcel;
        int i = 0;
        Object obj = null;
        if (C18310x6.A04(parcel) == 0) {
            A0I = null;
        } else {
            int readInt = parcel.readInt();
            A0I = AnonymousClass002.A0I(readInt);
            for (int i2 = 0; i2 != readInt; i2++) {
                A0I.add(C18280x3.A0C(parcel, C108755dV.class));
            }
        }
        if (parcel.readInt() == 0) {
            A0I2 = null;
        } else {
            int readInt2 = parcel.readInt();
            A0I2 = AnonymousClass002.A0I(readInt2);
            while (i != readInt2) {
                i = C86644Kx.A02(parcel, C165977xw.CREATOR, A0I2, i);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C108695dP.CREATOR.createFromParcel(parcel);
        }
        C108695dP r1 = (C108695dP) createFromParcel;
        if (parcel.readInt() != 0) {
            obj = C108665dM.CREATOR.createFromParcel(parcel);
        }
        return new C108755dV((C108665dM) obj, r1, A0I, A0I2);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108755dV[i];
    }
}
