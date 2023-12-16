package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7y6  reason: invalid class name and case insensitive filesystem */
public final class C166077y6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(95);
    public final String A00;
    public final String A01;
    public final String A02;

    public C166077y6(String str, String str2, String str3) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

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
        if (this == obj) {
            return true;
        }
        if (obj == null || !AnonymousClass001.A1a(obj, C166077y6.class)) {
            return false;
        }
        return C162457s7.A0P(this.A00, ((C166077y6) obj).A00);
    }

    public int hashCode() {
        return C18310x6.A08(this.A00, AnonymousClass002.A0L(), 0);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PriceTier:{'id'='");
        A0o.append(this.A00);
        A0o.append("', 'symbol'='");
        A0o.append(this.A02);
        A0o.append("', 'name'='");
        A0o.append(this.A01);
        return AnonymousClass000.A0X("'}", A0o);
    }
}
