package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.87f  reason: invalid class name and case insensitive filesystem */
public final class C1689087f implements C187368x6 {
    public static final C166527yp A06;
    public static final C166527yp A07;
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(39);
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final byte[] A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C1689087f.class != obj.getClass()) {
                return false;
            }
            C1689087f r7 = (C1689087f) obj;
            if (this.A01 != r7.A01 || this.A02 != r7.A02 || !C162387ry.A0D(this.A03, r7.A03) || !C162387ry.A0D(this.A04, r7.A04) || !Arrays.equals(this.A05, r7.A05)) {
                return false;
            }
        }
        return true;
    }

    public C166527yp BEb() {
        String str;
        String str2 = this.A03;
        switch (str2.hashCode()) {
            case -1468477611:
                if (str2.equals("urn:scte:scte35:2014:bin")) {
                    return A07;
                }
                return null;
            case -795945609:
                str = "https://aomedia.org/emsg/ID3";
                break;
            case 1303648457:
                str = "https://developer.apple.com/streaming/emsg-id3";
                break;
            default:
                return null;
        }
        if (str2.equals(str)) {
            return A06;
        }
        return null;
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

    static {
        C157057he A002 = C157057he.A00();
        A002.A0R = "application/id3";
        A06 = C166527yp.A00(A002);
        C157057he A003 = C157057he.A00();
        A003.A0R = "application/x-scte35";
        A07 = C166527yp.A00(A003);
    }

    public C1689087f(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A05 = parcel.createByteArray();
    }

    public byte[] BEa() {
        if (BEb() != null) {
            return this.A05;
        }
        return null;
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

    public C1689087f(String str, String str2, byte[] bArr, long j, long j2) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = j;
        this.A02 = j2;
        this.A05 = bArr;
    }
}
