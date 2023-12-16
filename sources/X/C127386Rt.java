package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.6Rt  reason: invalid class name and case insensitive filesystem */
public final class C127386Rt extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164677vq();
    public final int A00;
    public final List A01;

    public C127386Rt(List list, int i) {
        this.A00 = i;
        this.A01 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A00);
        C162417s1.A0D(parcel, this.A01, 3, false);
        C162417s1.A06(parcel, A002);
    }
}
