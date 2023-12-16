package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7v1  reason: invalid class name and case insensitive filesystem */
public final class C164187v1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6SD[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = "";
        String str2 = str;
        String str3 = str;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str2 = C162447s6.A0D(parcel, readInt);
            } else if (c != 2) {
                str = C162447s6.A0E(parcel, str, c, 5, readInt);
            } else {
                str3 = C162447s6.A0D(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6SD(str, str2, str3);
    }
}
