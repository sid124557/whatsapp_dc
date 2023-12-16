package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.87c  reason: invalid class name and case insensitive filesystem */
public final class C1688787c implements C187368x6 {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(55);
    public final int A00;
    public final int A01;
    public final String A02;
    public final byte[] A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C1688787c.class != obj.getClass()) {
                return false;
            }
            C1688787c r5 = (C1688787c) obj;
            if (!this.A02.equals(r5.A02) || !Arrays.equals(this.A03, r5.A03) || this.A00 != r5.A00 || this.A01 != r5.A01) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ byte[] BEa() {
        return null;
    }

    public /* synthetic */ C166527yp BEb() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (((AnonymousClass6CA.A09(this.A03, AnonymousClass6C8.A04(this.A02.hashCode())) * 31) + this.A00) * 31) + this.A01;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeByteArray(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public C1688787c(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.createByteArray();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("mdta: key=");
        return AnonymousClass000.A0X(this.A02, A0o);
    }

    public C1688787c(byte[] bArr, int i, int i2, String str) {
        this.A02 = str;
        this.A03 = bArr;
        this.A00 = i;
        this.A01 = i2;
    }
}
