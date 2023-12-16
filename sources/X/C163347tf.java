package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7tf  reason: invalid class name and case insensitive filesystem */
public final class C163347tf implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6T5[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C162447s6.A0I(parcel, readInt);
            } else {
                pendingIntent = (PendingIntent) C162447s6.A0A(parcel, PendingIntent.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6T5(pendingIntent);
    }
}
