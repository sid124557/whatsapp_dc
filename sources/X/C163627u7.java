package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.7u7  reason: invalid class name and case insensitive filesystem */
public final class C163627u7 implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6SX[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c != 2) {
                str = C162447s6.A0E(parcel, str, c, 3, readInt);
            } else {
                arrayList = C162447s6.A0G(parcel, AnonymousClass6TT.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6SX(arrayList, i, str);
    }
}
