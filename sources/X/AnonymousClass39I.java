package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.39I  reason: invalid class name */
public final class AnonymousClass39I implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass38A();
    public final int A00;
    public final int A01;
    public final AnonymousClass212 A02;

    public AnonymousClass39I(AnonymousClass212 r2, int i, int i2) {
        C162457s7.A0J(r2, 1);
        this.A02 = r2;
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass39I) {
                AnonymousClass39I r5 = (AnonymousClass39I) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        C18290x4.A1D(parcel, this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        return ((C18300x5.A04(this.A02) + this.A01) * 31) + this.A00;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CheckoutErrorContent(code=");
        A0o.append(this.A02);
        A0o.append(", titleRes=");
        A0o.append(this.A01);
        A0o.append(", descriptionRes=");
        return C18260x0.A09(A0o, this.A00);
    }

    public AnonymousClass39I() {
        this(AnonymousClass212.NONE, -1, -1);
    }
}
