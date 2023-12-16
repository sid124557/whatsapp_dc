package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7w7  reason: invalid class name and case insensitive filesystem */
public final class C164847w7 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6TE[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C162447s6.A0D(parcel, readInt);
            } else if (c == 3) {
                str2 = C162447s6.A0D(parcel, readInt);
            } else if (c != 4) {
                z = C162447s6.A0M(parcel, c, 5, readInt, z);
            } else {
                C162447s6.A0K(parcel, readInt, 4);
                i = parcel.readInt();
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6TE(str, str2, i, z);
    }
}
