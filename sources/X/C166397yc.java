package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: X.7yc  reason: invalid class name and case insensitive filesystem */
public final class C166397yc implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(36);
    public int A00;
    public final String A01;
    public final String A02;
    public final UUID A03;
    public final byte[] A04;

    public C166397yc(String str, UUID uuid, byte[] bArr) {
        this.A03 = uuid;
        this.A01 = null;
        str.getClass();
        this.A02 = str;
        this.A04 = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C166397yc)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C166397yc r4 = (C166397yc) obj;
        if (!C162387ry.A0D(this.A01, r4.A01) || !C162387ry.A0D(this.A02, r4.A02) || !C162387ry.A0D(this.A03, r4.A03) || !Arrays.equals(this.A04, r4.A04)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A09 = AnonymousClass6CA.A09(this.A04, AnonymousClass0x2.A07(this.A02, (C18300x5.A04(this.A03) + C18270x1.A00(this.A01)) * 31));
        this.A00 = A09;
        return A09;
    }

    public void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.A03;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeByteArray(this.A04);
    }

    public C166397yc(Parcel parcel) {
        this.A03 = new UUID(parcel.readLong(), parcel.readLong());
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.createByteArray();
    }
}
