package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6eu  reason: invalid class name and case insensitive filesystem */
public final class C132226eu extends C165827xh {
    public static final Parcelable.Creator CREATOR = new C165157wc();
    public final String A00;

    public C132226eu(String str) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C132226eu) && C162457s7.A0P(this.A00, ((C132226eu) obj).A00));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TextOption(value=");
        return C18260x0.A07(this.A00, A0o);
    }
}
