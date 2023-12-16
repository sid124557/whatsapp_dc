package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5dX  reason: invalid class name and case insensitive filesystem */
public final class C108775dX implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165337wu();
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108775dX) {
                C108775dX r5 = (C108775dX) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00 || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00((AnonymousClass0x2.A07(this.A01, C18310x6.A09(this.A02)) + this.A00) * 31, this.A03);
    }

    public C108775dX(String str, String str2, int i, boolean z) {
        C18260x0.A0Q(str, str2);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ConnectedAccount:{'id'='");
        A0o.append(this.A02);
        A0o.append("', 'name'='");
        A0o.append(this.A01);
        A0o.append("', 'likes'='");
        A0o.append(this.A00);
        A0o.append("', 'hasMediaPost'='");
        A0o.append(this.A03);
        return AnonymousClass000.A0X("'}", A0o);
    }
}
