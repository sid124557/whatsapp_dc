package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.7wQ  reason: invalid class name and case insensitive filesystem */
public final class C165037wQ implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C131986eV[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A04 = C18310x6.A04(parcel);
        ArrayList A0I = AnonymousClass002.A0I(A04);
        for (int i = 0; i != A04; i++) {
            A0I.add(C18280x3.A0C(parcel, C131986eV.class));
        }
        return new C131986eV(AnonymousClass59G.valueOf(parcel.readString()), A0I, parcel.readInt());
    }
}
