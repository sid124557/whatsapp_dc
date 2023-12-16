package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.6Tu  reason: invalid class name and case insensitive filesystem */
public final class C127906Tu extends C1695389r implements C180828lh {
    public static final Parcelable.Creator CREATOR = new C164207v3();
    public final Status A00;
    public final AnonymousClass6SS A01;

    public Status BDK() {
        return this.A00;
    }

    public C127906Tu(Status status, AnonymousClass6SS r2) {
        this.A00 = status;
        this.A01 = r2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0A(parcel, this.A00, 1, i, false);
        C162417s1.A0A(parcel, this.A01, 2, i, false);
        C162417s1.A06(parcel, A002);
    }
}
