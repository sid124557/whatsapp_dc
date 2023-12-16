package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.9XW  reason: invalid class name */
public final class AnonymousClass9XW implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0I;
        C162457s7.A0J(parcel, 0);
        boolean booleanValue = AnonymousClass29S.A00(parcel).booleanValue();
        int readInt = parcel.readInt();
        if (parcel.readInt() == 0) {
            A0I = null;
        } else {
            int readInt2 = parcel.readInt();
            A0I = AnonymousClass002.A0I(readInt2);
            for (int i = 0; i != readInt2; i++) {
                A0I.add(C632638o.CREATOR.createFromParcel(parcel));
            }
        }
        return new AnonymousClass9XZ(A0I, readInt, booleanValue);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass9XZ[i];
    }
}
