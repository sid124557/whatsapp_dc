package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.38i  reason: invalid class name and case insensitive filesystem */
public final class C632038i implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass389();
    public final String A00;
    public final String[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C632038i) {
                C632038i r5 = (C632038i) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeStringArray(this.A01);
    }

    public int hashCode() {
        return C18310x6.A09(this.A00) + Arrays.hashCode(this.A01);
    }

    public C632038i(String str, String[] strArr) {
        C18260x0.A0Q(str, strArr);
        this.A00 = str;
        this.A01 = strArr;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PaymentPredefinedFilter(query=");
        A0o.append(this.A00);
        A0o.append(", params=");
        return C18260x0.A07(Arrays.toString(this.A01), A0o);
    }
}
