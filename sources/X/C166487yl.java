package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: X.7yl  reason: invalid class name and case insensitive filesystem */
public final class C166487yl implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(2);
    public int A00;
    public final String A01;
    public final String A02;
    public final UUID A03;
    public final byte[] A04;

    public C166487yl(String str, UUID uuid, byte[] bArr) {
        this.A03 = uuid;
        this.A01 = str;
        this.A02 = "video/mp4";
        this.A04 = bArr;
    }

    public boolean A00(UUID uuid) {
        UUID uuid2 = C155567f7.A03;
        UUID uuid3 = this.A03;
        if (uuid2.equals(uuid3) || uuid.equals(uuid3)) {
            return true;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C166487yl)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C166487yl r4 = (C166487yl) obj;
        if (!Util.A0D(this.A01, r4.A01) || !Util.A0D(this.A02, r4.A02) || !Util.A0D(this.A03, r4.A03) || !Arrays.equals(this.A04, r4.A04)) {
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

    public C166487yl(Parcel parcel) {
        this.A03 = new UUID(parcel.readLong(), parcel.readLong());
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.createByteArray();
    }
}
