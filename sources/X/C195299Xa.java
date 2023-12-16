package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9Xa  reason: invalid class name and case insensitive filesystem */
public final class C195299Xa implements Parcelable {
    public static final C194889Uw A01 = new C194889Uw();
    public static final Parcelable.Creator CREATOR = new AnonymousClass9XV();
    public final String A00;

    public C195299Xa(String str) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C195299Xa) && C162457s7.A0P(this.A00, ((C195299Xa) obj).A00));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("IndiaUpiTransactionOfferData(id=");
        A0o.append(this.A00);
        return AnonymousClass000.A0c(A0o);
    }

    public int describeContents() {
        return 0;
    }
}
