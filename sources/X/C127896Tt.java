package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.6Tt  reason: invalid class name and case insensitive filesystem */
public final class C127896Tt extends C1695389r implements C180828lh {
    public static final C127896Tt A01 = new C127896Tt(Status.A09);
    public static final Parcelable.Creator CREATOR = new C164107ut();
    public final Status A00;

    public final Status BDK() {
        return this.A00;
    }

    public C127896Tt(Status status) {
        this.A00 = status;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0A(parcel, this.A00, 1, i, false);
        C162417s1.A06(parcel, A002);
    }
}
