package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6TX  reason: invalid class name */
public class AnonymousClass6TX extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164467vV();
    public int A00;
    public String A01;
    public String A02;
    public String A03;

    public AnonymousClass6TX(String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A00);
        C162417s1.A0B(parcel, this.A01, 3, false);
        C162417s1.A0B(parcel, this.A03, 4, false);
        C162417s1.A0B(parcel, this.A02, 5, false);
        C162417s1.A06(parcel, A002);
    }

    public AnonymousClass6TX() {
    }
}
