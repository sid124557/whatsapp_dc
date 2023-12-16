package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38n  reason: invalid class name and case insensitive filesystem */
public final class C632538n implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass38B();
    public final int A00;
    public final AnonymousClass39L A01;
    public final AnonymousClass39L A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C632538n) {
                C632538n r5 = (C632538n) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
    }

    public int hashCode() {
        return (((this.A00 * 31) + AnonymousClass000.A07(this.A01)) * 31) + C18310x6.A07(this.A02);
    }

    public C632538n(AnonymousClass39L r1, AnonymousClass39L r2, int i) {
        this.A00 = i;
        this.A01 = r1;
        this.A02 = r2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Installment(count=");
        A0o.append(this.A00);
        A0o.append(", dueAmount=");
        A0o.append(this.A01);
        A0o.append(", interest=");
        return C18260x0.A04(this.A02, A0o);
    }
}
