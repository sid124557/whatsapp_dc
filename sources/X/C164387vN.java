package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.7vN  reason: invalid class name and case insensitive filesystem */
public final class C164387vN implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127916Tv[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                str = C162447s6.A0E(parcel, str, c, 2, readInt);
            } else {
                arrayList = C162447s6.A0F(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127916Tv(str, arrayList);
    }
}
