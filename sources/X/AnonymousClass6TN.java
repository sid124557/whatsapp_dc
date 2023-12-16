package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6TN  reason: invalid class name */
public class AnonymousClass6TN extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164417vQ();
    public int A00;
    public String[] A01;

    public AnonymousClass6TN(String[] strArr, int i) {
        this.A00 = i;
        this.A01 = strArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A00);
        C162417s1.A0G(parcel, this.A01, 3);
        C162417s1.A06(parcel, A002);
    }

    public AnonymousClass6TN() {
    }
}
