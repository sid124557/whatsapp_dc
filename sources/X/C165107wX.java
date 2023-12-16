package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.7wX  reason: invalid class name and case insensitive filesystem */
public final class C165107wX implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0I;
        C162457s7.A0J(parcel, 0);
        boolean booleanValue = AnonymousClass29S.A00(parcel).booleanValue();
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            A0I = null;
        } else {
            int readInt = parcel.readInt();
            A0I = AnonymousClass002.A0I(readInt);
            int i = 0;
            while (i != readInt) {
                i = C86644Kx.A02(parcel, C165977xw.CREATOR, A0I, i);
            }
        }
        return new C166027y1(readString, A0I, booleanValue);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C166027y1[i];
    }
}
