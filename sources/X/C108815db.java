package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5db  reason: invalid class name and case insensitive filesystem */
public final class C108815db implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165077wU();
    public String A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public C108815db(String str, String str2, String str3, int i, int i2) {
        C162457s7.A0J(str, 1);
        this.A04 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = i;
        this.A02 = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C108815db)) {
            return false;
        }
        return C162457s7.A0P(this.A04, ((C108815db) obj).A04);
    }

    public int hashCode() {
        return this.A04.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ProductImage(imageId=");
        A0o.append(this.A04);
        A0o.append(", originalImageUrl=");
        A0o.append(this.A00);
        A0o.append(", scaledImageUrl=");
        A0o.append(this.A01);
        A0o.append(", width=");
        A0o.append(this.A03);
        A0o.append(", height=");
        return C18260x0.A09(A0o, this.A02);
    }
}
