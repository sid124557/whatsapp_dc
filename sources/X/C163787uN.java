package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uN  reason: invalid class name and case insensitive filesystem */
public final class C163787uN implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127596So[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        Integer num = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C162447s6.A0D(parcel, readInt);
            } else if (c != 3) {
                C162447s6.A0I(parcel, readInt);
            } else {
                int A04 = C162447s6.A04(parcel, readInt);
                if (A04 == 0) {
                    num = null;
                } else {
                    C162447s6.A0J(parcel, A04, 4);
                    num = AnonymousClass6CA.A0P(parcel);
                }
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127596So(str, num.intValue());
    }
}
