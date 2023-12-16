package X;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vz  reason: invalid class name and case insensitive filesystem */
public final class C164767vz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6TY[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        IBinder iBinder = null;
        IntentFilter[] intentFilterArr = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                iBinder = C162447s6.A09(parcel, readInt);
            } else if (c == 3) {
                intentFilterArr = (IntentFilter[]) C162447s6.A0R(parcel, IntentFilter.CREATOR, readInt);
            } else if (c != 4) {
                str2 = C162447s6.A0E(parcel, str2, c, 5, readInt);
            } else {
                str = C162447s6.A0D(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6TY(iBinder, str, str2, intentFilterArr);
    }
}
