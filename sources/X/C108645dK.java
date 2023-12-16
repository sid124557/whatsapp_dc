package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: X.5dK  reason: invalid class name and case insensitive filesystem */
public class C108645dK implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass6A9(0);
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public List A0C = Collections.EMPTY_LIST;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C108645dK)) {
            return false;
        }
        C108645dK r4 = (C108645dK) obj;
        return Objects.equals(this.A04, r4.A04) && Objects.equals(this.A08, r4.A08) && Objects.equals(this.A0B, r4.A0B) && Objects.equals(this.A02, r4.A02) && Objects.equals(this.A0A, r4.A0A) && Objects.equals(this.A03, r4.A03) && Objects.equals(this.A05, r4.A05) && Objects.equals(this.A06, r4.A06) && Objects.equals(this.A07, r4.A07) && this.A00 == r4.A00 && this.A01 == r4.A01 && this.A0C.equals(r4.A0C) && Objects.equals(this.A09, r4.A09);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((527 + C18270x1.A00(this.A04)) * 31) + C18270x1.A00(this.A08)) * 31) + C18270x1.A00(this.A0B)) * 31) + C18270x1.A00(this.A02)) * 31) + C18270x1.A00(this.A0A)) * 31) + C18270x1.A00(this.A03)) * 31) + C18270x1.A00(this.A05)) * 31) + C18270x1.A00(this.A06)) * 31) + C18270x1.A00(this.A07)) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A01)) * 31) + this.A0C.hashCode()) * 31) + AnonymousClass0x7.A07(this.A09);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A08);
        parcel.writeString(this.A04);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A02);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeStringList(this.A0C);
        parcel.writeString(this.A09);
    }

    public C108645dK(String str) {
        this.A08 = str;
    }
}
