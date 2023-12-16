package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7y4  reason: invalid class name and case insensitive filesystem */
public final class C166057y4 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165297wq();
    public final String A00;
    public final String A01;
    public final String A02;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        Object obj2 = null;
        if (obj instanceof C166057y4) {
            obj2 = obj;
        }
        if (obj2 == null) {
            return false;
        }
        C166057y4 r4 = (C166057y4) obj;
        if (!C107575bX.A0G(this.A00, r4.A00) || !C107575bX.A0G(this.A01, r4.A01) || !C162457s7.A0P(this.A02, r4.A02)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C86624Kv.A04(this.A00) * 31) + AnonymousClass6CA.A06(this.A01);
    }

    public C166057y4(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BizDirectConnectionPostcode(code=");
        A0o.append(this.A00);
        A0o.append(", locationName=");
        A0o.append(this.A01);
        A0o.append(", postcodeType=");
        return C18260x0.A07(this.A02, A0o);
    }
}
