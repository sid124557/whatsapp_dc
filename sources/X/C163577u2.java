package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7u2  reason: invalid class name and case insensitive filesystem */
public final class C163577u2 implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6TK[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        AnonymousClass6UC r1 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c != 2) {
                C162447s6.A0I(parcel, readInt);
            } else {
                r1 = (AnonymousClass6UC) C162447s6.A0A(parcel, AnonymousClass6UC.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6TK(r1, i);
    }
}
