package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: X.6Tv  reason: invalid class name and case insensitive filesystem */
public final class C127916Tv extends C1695389r implements C180828lh {
    public static final Parcelable.Creator CREATOR = new C164387vN();
    public final String A00;
    public final List A01;

    public final Status BDK() {
        if (this.A00 != null) {
            return Status.A09;
        }
        return Status.A05;
    }

    public C127916Tv(String str, List list) {
        this.A01 = list;
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0C(parcel, this.A01, 1);
        C162417s1.A0B(parcel, this.A00, 2, false);
        C162417s1.A06(parcel, A002);
    }
}
