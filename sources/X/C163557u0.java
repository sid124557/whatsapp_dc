package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7u0  reason: invalid class name and case insensitive filesystem */
public final class C163557u0 implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6TW[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        Bundle bundle = null;
        C127806Tj[] r1 = null;
        AnonymousClass6SQ r2 = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bundle = C162447s6.A08(parcel, readInt);
            } else if (c == 2) {
                r1 = (C127806Tj[]) C162447s6.A0R(parcel, C127806Tj.CREATOR, readInt);
            } else if (c == 3) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c != 4) {
                C162447s6.A0I(parcel, readInt);
            } else {
                r2 = (AnonymousClass6SQ) C162447s6.A0A(parcel, AnonymousClass6SQ.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6TW(bundle, r2, r1, i);
    }
}
