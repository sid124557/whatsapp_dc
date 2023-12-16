package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: X.6S1  reason: invalid class name */
public final class AnonymousClass6S1 extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164777w0();
    public final int A00;
    public final ConnectionConfiguration[] A01;

    public AnonymousClass6S1(ConnectionConfiguration[] connectionConfigurationArr, int i) {
        this.A00 = i;
        this.A01 = connectionConfigurationArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A00);
        C162417s1.A0F(parcel, this.A01, 3, i);
        C162417s1.A06(parcel, A002);
    }
}
