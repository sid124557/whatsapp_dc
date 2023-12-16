package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Tc  reason: invalid class name and case insensitive filesystem */
public class C127736Tc extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164447vT();
    public C127746Td A00;
    public String A01;
    public String A02;
    public AnonymousClass6TN[] A03;
    public AnonymousClass6TX[] A04;
    public AnonymousClass6TP[] A05;
    public String[] A06;

    public C127736Tc(C127746Td r1, String str, String str2, AnonymousClass6TN[] r4, AnonymousClass6TX[] r5, AnonymousClass6TP[] r6, String[] strArr) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
        this.A05 = r6;
        this.A04 = r5;
        this.A06 = strArr;
        this.A03 = r4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        boolean A062 = C1695389r.A06(parcel, this.A00, i);
        C162417s1.A0B(parcel, this.A01, 3, A062);
        C162417s1.A0B(parcel, this.A02, 4, A062);
        C162417s1.A0F(parcel, this.A05, 5, i);
        C162417s1.A0F(parcel, this.A04, 6, i);
        C162417s1.A0G(parcel, this.A06, 7);
        C162417s1.A0F(parcel, this.A03, 8, i);
        C162417s1.A06(parcel, A002);
    }

    public C127736Tc() {
    }
}
