package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38h  reason: invalid class name and case insensitive filesystem */
public final class C631938h implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C630037o();
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C631938h) {
                C631938h r5 = (C631938h) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public int hashCode() {
        return (C18270x1.A00(this.A01) * 31) + AnonymousClass0x7.A07(this.A00);
    }

    public C631938h(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SupportUserContext(entrypoint=");
        A0o.append(this.A01);
        A0o.append(", articles=");
        return C18260x0.A07(this.A00, A0o);
    }
}
