package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6oq  reason: invalid class name and case insensitive filesystem */
public final class C137536oq extends C165807xf {
    public static final Parcelable.Creator CREATOR = new C165717xW();
    public String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137536oq(String str) {
        super(str);
        C162457s7.A0J(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C137536oq) && C162457s7.A0P(this.A00, ((C137536oq) obj).A00));
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
        A0o.append("Thumbs(value=");
        return C18260x0.A07(this.A00, A0o);
    }

    public C137536oq() {
        this("");
    }
}
