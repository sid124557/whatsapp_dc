package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yC  reason: invalid class name and case insensitive filesystem */
public final class C166137yC implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165327wt();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C166137yC(String str, String str2, String str3, String str4) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A03 = str4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C166137yC)) {
            return false;
        }
        C166137yC r4 = (C166137yC) obj;
        if (!AnonymousClass75J.A00(this.A00, r4.A00) || !AnonymousClass75J.A00(this.A02, r4.A02) || !AnonymousClass75J.A00(this.A01, r4.A01) || !AnonymousClass75J.A00(this.A03, r4.A03)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C18310x6.A09(this.A00) + C86624Kv.A04(this.A02)) * 31) + C86624Kv.A04(this.A01)) * 31) + AnonymousClass6CA.A06(this.A03);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CoverPhoto:{'id'='");
        A0o.append(this.A00);
        A0o.append("', 'ts'='");
        A0o.append(this.A02);
        A0o.append("', 'token'='");
        A0o.append(this.A01);
        A0o.append("', 'url'='");
        A0o.append(this.A03);
        return AnonymousClass000.A0X("'}", A0o);
    }
}
