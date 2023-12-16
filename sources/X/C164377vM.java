package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vM  reason: invalid class name and case insensitive filesystem */
public final class C164377vM implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127926Tw[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c == 2) {
                i2 = C162447s6.A03(parcel, readInt);
            } else if (c != 3) {
                C162447s6.A0I(parcel, readInt);
            } else {
                intent = (Intent) C162447s6.A0A(parcel, Intent.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127926Tw(i, i2, intent);
    }
}
