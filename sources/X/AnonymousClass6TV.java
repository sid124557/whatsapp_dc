package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6TV  reason: invalid class name */
public class AnonymousClass6TV extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164527vb();
    public int A00;
    public String A01;
    public String A02;

    public AnonymousClass6TV(String str, String str2, int i) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0B(parcel, this.A01, 3, C1695389r.A07(parcel, this.A02));
        C162417s1.A07(parcel, 4, this.A00);
        C162417s1.A06(parcel, A002);
    }

    public AnonymousClass6TV() {
    }
}
