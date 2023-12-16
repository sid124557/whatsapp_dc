package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6TQ  reason: invalid class name */
public class AnonymousClass6TQ extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164507vZ();
    public String A00;
    public String A01;

    public AnonymousClass6TQ(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0B(parcel, this.A01, 3, C1695389r.A07(parcel, this.A00));
        C162417s1.A06(parcel, A002);
    }

    public AnonymousClass6TQ() {
    }
}
