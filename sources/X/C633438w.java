package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38w  reason: invalid class name and case insensitive filesystem */
public final class C633438w implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass38K();
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C633438w) {
                C633438w r5 = (C633438w) obj;
                if (!C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A03, r5.A03) || this.A00 != r5.A00 || !C162457s7.A0P(this.A05, r5.A05) || this.A01 != r5.A01 || this.A02 != r5.A02 || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A06, r5.A06) || this.A08 != r5.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A08 ? 1 : 0);
    }

    public int hashCode() {
        int A09 = C18310x6.A09(this.A07);
        String str = this.A05;
        return AnonymousClass0x7.A00(AnonymousClass0x2.A07(this.A06, AnonymousClass0x2.A07(this.A04, (((AnonymousClass0x2.A07(str, (AnonymousClass0x2.A07(this.A03, A09) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31)), this.A08);
    }

    public C633438w(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, boolean z) {
        C18260x0.A0Q(str, str2);
        C162457s7.A0J(str3, 4);
        AnonymousClass0x2.A1B(str4, str5);
        this.A07 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A05 = str3;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = str4;
        this.A06 = str5;
        this.A08 = z;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AvatarSticker(url=");
        A0o.append(this.A07);
        A0o.append(", emojis=");
        A0o.append(this.A03);
        A0o.append(", fileSize=");
        A0o.append(this.A00);
        A0o.append(", mimeType=");
        A0o.append(this.A05);
        A0o.append(", height=");
        A0o.append(this.A01);
        A0o.append(", width=");
        A0o.append(this.A02);
        A0o.append(", fileHash=");
        A0o.append(this.A04);
        A0o.append(", stableId=");
        A0o.append(this.A06);
        A0o.append(", isCountrySticker=");
        return C18260x0.A0A(A0o, this.A08);
    }
}
