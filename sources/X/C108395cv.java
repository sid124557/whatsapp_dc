package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.5cv  reason: invalid class name and case insensitive filesystem */
public final class C108395cv implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A04 = C18310x6.A04(parcel);
        int readInt = parcel.readInt();
        ArrayList A0I = AnonymousClass002.A0I(readInt);
        for (int i = 0; i != readInt; i++) {
            A0I.add(C18280x3.A0C(parcel, C108845de.class));
        }
        int readInt2 = parcel.readInt();
        ArrayList A0I2 = AnonymousClass002.A0I(readInt2);
        for (int i2 = 0; i2 != readInt2; i2++) {
            A0I2.add(C18280x3.A0C(parcel, C108845de.class));
        }
        return new C108845de(A0I, A0I2, A04, AnonymousClass000.A1S(parcel.readInt()), AnonymousClass000.A1S(parcel.readInt()));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108845de[i];
    }
}
