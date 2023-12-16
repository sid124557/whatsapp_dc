package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.81O  reason: invalid class name */
public final class AnonymousClass81O implements C187338x1 {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(3);
    public final int A00;
    public final int A01;
    public final String A02;
    public final byte[] A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass81O.class != obj.getClass()) {
                return false;
            }
            AnonymousClass81O r5 = (AnonymousClass81O) obj;
            if (!this.A02.equals(r5.A02) || !Arrays.equals(this.A03, r5.A03) || this.A00 != r5.A00 || this.A01 != r5.A01) {
                return false;
            }
        }
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (((AnonymousClass6CA.A09(this.A03, AnonymousClass6C8.A04(this.A02.hashCode())) * 31) + this.A00) * 31) + this.A01;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        byte[] bArr = this.A03;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public AnonymousClass81O(Parcel parcel) {
        this.A02 = parcel.readString();
        byte[] bArr = new byte[parcel.readInt()];
        this.A03 = bArr;
        parcel.readByteArray(bArr);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("mdta: key=");
        return AnonymousClass000.A0X(this.A02, A0o);
    }

    public AnonymousClass81O(byte[] bArr, int i, int i2, String str) {
        this.A02 = str;
        this.A03 = bArr;
        this.A00 = i;
        this.A01 = i2;
    }
}
