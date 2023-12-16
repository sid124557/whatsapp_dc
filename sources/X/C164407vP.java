package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vP  reason: invalid class name and case insensitive filesystem */
public final class C164407vP implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6SF[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        C127866Tp r1 = null;
        AnonymousClass6T1 r2 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c == 2) {
                r1 = (C127866Tp) C162447s6.A0A(parcel, C127866Tp.CREATOR, readInt);
            } else if (c != 3) {
                C162447s6.A0I(parcel, readInt);
            } else {
                r2 = (AnonymousClass6T1) C162447s6.A0A(parcel, AnonymousClass6T1.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6SF(r1, r2, i);
    }
}
