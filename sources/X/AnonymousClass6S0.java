package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

@Deprecated
/* renamed from: X.6S0  reason: invalid class name */
public final class AnonymousClass6S0 extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164757vy();
    public final int A00;
    public final ConnectionConfiguration A01;

    public AnonymousClass6S0(ConnectionConfiguration connectionConfiguration, int i) {
        this.A00 = i;
        this.A01 = connectionConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A00);
        C1695389r.A03(parcel, this.A01, i, A002);
    }
}
