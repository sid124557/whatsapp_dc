package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.7z0  reason: invalid class name and case insensitive filesystem */
public final class C166627z0 implements Parcelable, C177618gA {
    public static final C177608g9 CREATOR = new AnonymousClass91W(5);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C166627z0.class != obj.getClass()) {
                return false;
            }
            C166627z0 r5 = (C166627z0) obj;
            if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A03 == r5.A03 && Arrays.equals(this.A04, r5.A04))) {
                return false;
            }
        }
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A09 = AnonymousClass6CA.A09(this.A04, (((((527 + this.A02) * 31) + this.A01) * 31) + this.A03) * 31);
        this.A00 = A09;
        return A09;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        byte[] bArr = this.A04;
        parcel.writeInt(AnonymousClass000.A1W(bArr) ? 1 : 0);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public C166627z0(int i, byte[] bArr, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = bArr;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ColorInfo(");
        A0o.append(this.A02);
        A0o.append(", ");
        A0o.append(this.A01);
        A0o.append(", ");
        A0o.append(this.A03);
        A0o.append(", ");
        A0o.append(AnonymousClass000.A1W(this.A04));
        return AnonymousClass000.A0e(A0o);
    }
}
