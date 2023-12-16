package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38v  reason: invalid class name and case insensitive filesystem */
public final class C633338v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165637xO();
    public final C142396x8 A00;
    public final C142406x9 A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C633338v) {
                C633338v r5 = (C633338v) obj;
                if (!C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A04, r5.A04) || this.A00 != r5.A00 || this.A01 != r5.A01) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        C142396x8 r0 = this.A00;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C18290x4.A1D(parcel, r0);
        }
        C142406x9 r02 = this.A01;
        if (r02 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        C18290x4.A1D(parcel, r02);
    }

    public int hashCode() {
        return ((AnonymousClass0x2.A07(this.A04, (C18310x6.A09(this.A03) + C18270x1.A00(this.A02)) * 31) + AnonymousClass000.A07(this.A00)) * 31) + C18310x6.A07(this.A01);
    }

    public C633338v(C142396x8 r1, C142406x9 r2, String str, String str2, String str3) {
        C18260x0.A0R(str, str3);
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PrivacyDisclosureIcon(lightUrl=");
        A0o.append(this.A03);
        A0o.append(", darkUrl=");
        A0o.append(this.A02);
        A0o.append(", type=");
        A0o.append(this.A04);
        A0o.append(", role=");
        A0o.append(this.A00);
        A0o.append(", style=");
        return C18260x0.A04(this.A01, A0o);
    }
}
