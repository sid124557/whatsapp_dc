package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: X.81P  reason: invalid class name */
public final class AnonymousClass81P implements C187338x1 {
    public static final C166637z1 A06 = C166637z1.A00("application/id3");
    public static final C166637z1 A07 = C166637z1.A00("application/x-scte35");
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(5);
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final byte[] A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass81P.class != obj.getClass()) {
                return false;
            }
            AnonymousClass81P r7 = (AnonymousClass81P) obj;
            if (this.A01 != r7.A01 || this.A02 != r7.A02 || !Util.A0D(this.A03, r7.A03) || !Util.A0D(this.A04, r7.A04) || !Arrays.equals(this.A05, r7.A05)) {
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
        int A09 = AnonymousClass6CA.A09(this.A05, AnonymousClass6C7.A03(AnonymousClass6C7.A03((AnonymousClass6C8.A04(C86624Kv.A04(this.A03)) + AnonymousClass6CA.A06(this.A04)) * 31, this.A01), this.A02));
        this.A00 = A09;
        return A09;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeByteArray(this.A05);
    }

    public AnonymousClass81P(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A05 = parcel.createByteArray();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EMSG: scheme=");
        A0o.append(this.A03);
        A0o.append(", id=");
        A0o.append(this.A02);
        A0o.append(", durationMs=");
        A0o.append(this.A01);
        A0o.append(", value=");
        return AnonymousClass000.A0X(this.A04, A0o);
    }

    public AnonymousClass81P(String str, String str2, byte[] bArr, long j, long j2) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = j;
        this.A02 = j2;
        this.A05 = bArr;
    }
}
