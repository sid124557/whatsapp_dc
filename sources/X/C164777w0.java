package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: X.7w0  reason: invalid class name and case insensitive filesystem */
public final class C164777w0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6S1[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        ConnectionConfiguration[] connectionConfigurationArr = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c != 3) {
                C162447s6.A0I(parcel, readInt);
            } else {
                connectionConfigurationArr = (ConnectionConfiguration[]) C162447s6.A0R(parcel, ConnectionConfiguration.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6S1(connectionConfigurationArr, i);
    }
}
