package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yj  reason: invalid class name and case insensitive filesystem */
public final class C166467yj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165607xL();
    public final String A00;
    public final String A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166467yj) {
                C166467yj r5 = (C166467yj) obj;
                if (this.A02 != r5.A02 || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A01, AnonymousClass0x2.A07(this.A00, AnonymousClass0x9.A04(this.A02)));
    }

    public C166467yj(String str, boolean z, String str2) {
        C18260x0.A0S(str, str2);
        this.A02 = z;
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PaymentMethodDetailsInternationalViewState(isShimmering=");
        A0o.append(this.A02);
        A0o.append(", descriptionText=");
        A0o.append(this.A00);
        A0o.append(", showDialog=");
        return C18260x0.A07(this.A01, A0o);
    }

    public C166467yj() {
        this("", false, "");
    }
}
