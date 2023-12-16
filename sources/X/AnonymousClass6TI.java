package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6TI  reason: invalid class name */
public final class AnonymousClass6TI extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163357tg();
    public final Uri A00;
    public final C127836Tm A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public Uri A00() {
        return this.A00;
    }

    public C127836Tm A01() {
        return this.A01;
    }

    public String A02() {
        return this.A03;
    }

    public String A03() {
        return this.A05;
    }

    public String A04() {
        return this.A04;
    }

    public String A05() {
        return this.A07;
    }

    public String A06() {
        return this.A02;
    }

    public String A07() {
        return this.A06;
    }

    public String A08() {
        return this.A08;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass6TI) {
            AnonymousClass6TI r4 = (AnonymousClass6TI) obj;
            if (!AnonymousClass72K.A00(this.A02, r4.A02) || !AnonymousClass72K.A00(this.A03, r4.A03) || !AnonymousClass72K.A00(this.A04, r4.A04) || !AnonymousClass72K.A00(this.A05, r4.A05) || !AnonymousClass72K.A00(this.A00, r4.A00) || !AnonymousClass72K.A00(this.A06, r4.A06) || !AnonymousClass72K.A00(this.A07, r4.A07) || !AnonymousClass72K.A00(this.A08, r4.A08) || !AnonymousClass72K.A00(this.A01, r4.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        objArr[0] = this.A02;
        objArr[1] = this.A03;
        objArr[2] = this.A04;
        objArr[3] = this.A05;
        objArr[4] = this.A00;
        objArr[5] = this.A06;
        objArr[6] = this.A07;
        objArr[7] = this.A08;
        return C18310x6.A08(this.A01, objArr, 8);
    }

    public AnonymousClass6TI(Uri uri, C127836Tm r2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C162177rO.A05(str);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A00 = uri;
        this.A06 = str5;
        this.A07 = str6;
        this.A08 = str7;
        this.A01 = r2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0B(parcel, this.A02, 1, false);
        C162417s1.A0B(parcel, this.A03, 2, false);
        C162417s1.A0B(parcel, this.A04, 3, false);
        C162417s1.A0B(parcel, this.A05, 4, false);
        C162417s1.A0A(parcel, this.A00, 5, i, false);
        C162417s1.A0B(parcel, this.A06, 6, false);
        C162417s1.A0B(parcel, this.A07, 7, false);
        C162417s1.A0B(parcel, this.A08, 8, false);
        C162417s1.A0A(parcel, this.A01, 9, i, false);
        C162417s1.A06(parcel, A002);
    }
}
