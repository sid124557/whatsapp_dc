package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.7wG  reason: invalid class name and case insensitive filesystem */
public final class C164937wG implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6SJ[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        long j = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c == 3) {
                j = C162447s6.A07(parcel, readInt);
            } else if (c != 4) {
                C162447s6.A0I(parcel, readInt);
            } else {
                arrayList = C162447s6.A0G(parcel, AnonymousClass6SH.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6SJ(arrayList, i, j);
    }
}
