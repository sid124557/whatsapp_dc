package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6TP  reason: invalid class name */
public class AnonymousClass6TP extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164517va();
    public int A00;
    public String A01;

    public AnonymousClass6TP(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A00);
        C162417s1.A0B(parcel, this.A01, 3, false);
        C162417s1.A06(parcel, A002);
    }

    public AnonymousClass6TP() {
    }
}
