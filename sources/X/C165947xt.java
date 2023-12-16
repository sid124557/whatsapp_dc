package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xt  reason: invalid class name and case insensitive filesystem */
public final class C165947xt implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(89);
    public String A00;

    public C165947xt(String str) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C165947xt) && C162457s7.A0P(((C165947xt) obj).A00, this.A00);
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
        return this.A00;
    }
}
