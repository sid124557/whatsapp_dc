package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uA  reason: invalid class name and case insensitive filesystem */
public final class C163657uA implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127866Tp[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c == 2) {
                i2 = C162447s6.A03(parcel, readInt);
            } else if (c != 3) {
                str = C162447s6.A0E(parcel, str, c, 4, readInt);
            } else {
                pendingIntent = (PendingIntent) C162447s6.A0A(parcel, PendingIntent.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127866Tp(pendingIntent, str, i, i2);
    }
}
