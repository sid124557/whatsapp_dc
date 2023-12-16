package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yD  reason: invalid class name and case insensitive filesystem */
public final class C166147yD implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165417x2();
    public final byte A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166147yD) {
                C166147yD r8 = (C166147yD) obj;
                if (!C162457s7.A0P(this.A03, r8.A03) || this.A00 != r8.A00 || !C162457s7.A0P(this.A02, r8.A02) || this.A01 != r8.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeByte(this.A00);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A01);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass0x2.A07(this.A02, (C18310x6.A09(this.A03) + this.A00) * 31), this.A01);
    }

    public C166147yD(String str, String str2, byte b, long j) {
        C18260x0.A0R(str, str2);
        this.A03 = str;
        this.A00 = b;
        this.A02 = str2;
        this.A01 = j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TempFMessageMediaInfo(text=");
        A0o.append(this.A03);
        A0o.append(", mediaType=");
        A0o.append(this.A00);
        A0o.append(", mediaUri=");
        A0o.append(this.A02);
        A0o.append(", timestamp=");
        return C18270x1.A0U(A0o, this.A01);
    }
}
