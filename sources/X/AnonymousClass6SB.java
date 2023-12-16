package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* renamed from: X.6SB  reason: invalid class name */
public final class AnonymousClass6SB extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164987wL();
    public Bundle A00;
    public Map A01;

    public AnonymousClass6SB(Bundle bundle) {
        this.A00 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A02(this.A00, parcel, 2);
        C162417s1.A06(parcel, A002);
    }
}
