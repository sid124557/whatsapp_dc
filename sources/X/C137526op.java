package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6op  reason: invalid class name and case insensitive filesystem */
public final class C137526op extends C165807xf {
    public static final Parcelable.Creator CREATOR = new C165707xV();
    public int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C137526op) && this.A00 == ((C137526op) obj).A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeInt(this.A00);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return this.A00;
    }

    public C137526op(int i) {
        super(Integer.valueOf(i));
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Stars(value=");
        return C18260x0.A09(A0o, this.A00);
    }

    public C137526op() {
        this(0);
    }
}
