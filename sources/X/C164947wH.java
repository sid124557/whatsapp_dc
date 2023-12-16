package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wH  reason: invalid class name and case insensitive filesystem */
public final class C164947wH implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6TB[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        byte b = 0;
        String str = null;
        byte b2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                b = (byte) C162447s6.A03(parcel, readInt);
            } else if (c != 3) {
                str = C162447s6.A0E(parcel, str, c, 4, readInt);
            } else {
                b2 = (byte) C162447s6.A03(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6TB(str, b, b2);
    }
}
