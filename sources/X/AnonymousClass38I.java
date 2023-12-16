package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.38I  reason: invalid class name */
public final class AnonymousClass38I implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C631538d[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0I;
        if (C18310x6.A04(parcel) == 0) {
            A0I = null;
        } else {
            int readInt = parcel.readInt();
            A0I = AnonymousClass002.A0I(readInt);
            for (int i = 0; i != readInt; i++) {
                A0I.add(C632138j.CREATOR.createFromParcel(parcel));
            }
        }
        return new C631538d(A0I);
    }
}
