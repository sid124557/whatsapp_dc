package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38f  reason: invalid class name and case insensitive filesystem */
public final class C631738f implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C629137f();
    public final String A00;
    public final String A01;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AnonymousClass001.A1a(obj, C631738f.class)) {
            return false;
        }
        return C162457s7.A0P(this.A01, ((C631738f) obj).A01);
    }

    public C631738f(String str, String str2) {
        C18260x0.A0Q(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return C18310x6.A08(this.A01, AnonymousClass002.A0L(), 0);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("{'type'='");
        A0o.append(this.A01);
        A0o.append("', 'level'='");
        A0o.append(this.A00);
        return AnonymousClass000.A0X("'}", A0o);
    }
}
