package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7tb  reason: invalid class name and case insensitive filesystem */
public final class C163307tb implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127576Sm[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                str = C162447s6.A0E(parcel, str, c, 2, readInt);
            } else {
                z = AnonymousClass000.A1S(C162447s6.A03(parcel, readInt));
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127576Sm(z, str);
    }
}
