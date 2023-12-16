package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.7ts  reason: invalid class name and case insensitive filesystem */
public final class C163477ts implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        C127866Tp r5 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i2 = C162447s6.A03(parcel, readInt);
            } else if (c == 2) {
                str = C162447s6.A0D(parcel, readInt);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) C162447s6.A0A(parcel, PendingIntent.CREATOR, readInt);
            } else if (c != 4) {
                i = C162447s6.A06(parcel, c, 1000, readInt, i);
            } else {
                r5 = (C127866Tp) C162447s6.A0A(parcel, C127866Tp.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new Status(pendingIntent, r5, str, i, i2);
    }
}
