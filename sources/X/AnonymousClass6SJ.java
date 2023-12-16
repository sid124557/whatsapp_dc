package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.6SJ  reason: invalid class name */
public final class AnonymousClass6SJ extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164937wG();
    public final int A00;
    public final long A01;
    public final List A02;

    public AnonymousClass6SJ(List list, int i, long j) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A00);
        C162417s1.A08(parcel, 3, this.A01);
        C162417s1.A0D(parcel, this.A02, 4, false);
        C162417s1.A06(parcel, A002);
    }
}
