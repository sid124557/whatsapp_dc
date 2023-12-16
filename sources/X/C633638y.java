package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.38y  reason: invalid class name and case insensitive filesystem */
public final class C633638y implements Parcelable {
    public static final C141826wC A0B = C141826wC.LARGE;
    public static final Parcelable.Creator CREATOR = new AnonymousClass38F();
    public final C166007xz A00;
    public final C166007xz A01;
    public final C633338v A02;
    public final C165957xu A03;
    public final C141826wC A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final C632838q[] A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C633638y) {
                C633638y r5 = (C633638y) obj;
                if (!C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A08, r5.A08) || this.A04 != r5.A04 || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A09, r5.A09) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A0A, r5.A0A) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
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
        parcel.writeString(this.A08);
        C18290x4.A1D(parcel, this.A04);
        C633338v r0 = this.A02;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r0.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A09);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        C632838q[] r3 = this.A0A;
        int length = r3.length;
        parcel.writeInt(length);
        for (int i2 = 0; i2 != length; i2++) {
            r3[i2].writeToParcel(parcel, i);
        }
        C165957xu r02 = this.A03;
        if (r02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r02.writeToParcel(parcel, i);
        }
        this.A00.writeToParcel(parcel, i);
        C166007xz r03 = this.A01;
        if (r03 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r03.writeToParcel(parcel, i);
    }

    public int hashCode() {
        int A072 = AnonymousClass0x2.A07(this.A08, C18310x6.A09(this.A07));
        return AnonymousClass000.A08(this.A00, (((((((((((AnonymousClass000.A08(this.A04, A072) + AnonymousClass000.A07(this.A02)) * 31) + C18270x1.A00(this.A09)) * 31) + C18270x1.A00(this.A05)) * 31) + C18270x1.A00(this.A06)) * 31) + Arrays.hashCode(this.A0A)) * 31) + AnonymousClass000.A07(this.A03)) * 31) + C18310x6.A07(this.A01);
    }

    public C633638y(C166007xz r2, C166007xz r3, C633338v r4, C165957xu r5, C141826wC r6, String str, String str2, String str3, String str4, String str5, C632838q[] r12) {
        C18260x0.A0V(str, str2, r6);
        C162457s7.A0J(r12, 8);
        C162457s7.A0J(r2, 10);
        this.A07 = str;
        this.A08 = str2;
        this.A04 = r6;
        this.A02 = r4;
        this.A09 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A0A = r12;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PrivacyDisclosurePrompt(name=");
        A0o.append(this.A07);
        A0o.append(", template=");
        A0o.append(this.A08);
        A0o.append(", height=");
        A0o.append(this.A04);
        A0o.append(", headIcon=");
        A0o.append(this.A02);
        A0o.append(", title=");
        A0o.append(this.A09);
        A0o.append(", body=");
        A0o.append(this.A05);
        A0o.append(", footer=");
        A0o.append(this.A06);
        A0o.append(", bullets=");
        C18320x8.A1P(A0o, this.A0A);
        A0o.append(", navBar=");
        A0o.append(this.A03);
        A0o.append(", primaryButton=");
        A0o.append(this.A00);
        A0o.append(", secondaryButton=");
        return C18260x0.A04(this.A01, A0o);
    }
}
