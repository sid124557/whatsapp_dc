package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.AbstractMap;

/* renamed from: X.7xw  reason: invalid class name and case insensitive filesystem */
public final class C165977xw implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165127wZ();
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C165977xw) {
                C165977xw r5 = (C165977xw) obj;
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
        parcel.writeString(this.A01);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A01, C18310x6.A09(this.A00));
    }

    public C165977xw(String str, String str2) {
        C18260x0.A0Q(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    public static Number A00(C165977xw r4, AbstractMap abstractMap) {
        Number number = (Number) abstractMap.get(new AnonymousClass3Z6(r4.A00, r4.A01));
        if (number == null) {
            return Integer.MAX_VALUE;
        }
        return number;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ProductVariantProperty(name=");
        A0o.append(this.A00);
        A0o.append(", value=");
        return C18260x0.A07(this.A01, A0o);
    }
}
