package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: X.39W  reason: invalid class name */
public class AnonymousClass39W implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(21);
    public int A00;
    public AnonymousClass39S A01;
    public AnonymousClass39A A02;
    public AnonymousClass39P A03;
    public AnonymousClass39E A04;
    public C631638e A05;
    public C632938r A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public List A0B;

    public AnonymousClass39W(AnonymousClass39A r4, C632938r r5, String str) {
        this.A0B = AnonymousClass001.A0s();
        this.A02 = r4;
        this.A09 = null;
        this.A08 = str;
        this.A06 = r5;
        this.A00 = 4;
    }

    public String A01() {
        AnonymousClass39P r0 = this.A03;
        if (r0 == null || r0.A03.size() != 1) {
            return null;
        }
        return ((AnonymousClass395) C18290x4.A0k(this.A03.A03)).A01.A00;
    }

    public String A02() {
        AnonymousClass39P r0 = this.A03;
        if (r0 == null || r0.A03.size() != 1) {
            return null;
        }
        return ((AnonymousClass395) C18290x4.A0k(this.A03.A03)).A01.A01;
    }

    public boolean A03() {
        if (this.A01 == null || this.A00 != 3) {
            return false;
        }
        if (A00(this, "review_and_pay") || !A00(this, "review_order") || !A00(this, "payment_method") || !A00(this, "payment_status")) {
            return true;
        }
        return false;
    }

    public boolean A04() {
        if (this.A00 != 5 || this.A03 == null) {
            return false;
        }
        return true;
    }

    public byte[] A05() {
        byte[] bArr;
        int i;
        AnonymousClass39E r2 = this.A04;
        if (r2 != null && ((i = this.A00) == 2 || i == 6)) {
            return r2.A01.A02;
        }
        AnonymousClass39S r22 = this.A01;
        if (r22 != null && this.A00 == 3) {
            return r22.A0M;
        }
        AnonymousClass39A r0 = this.A02;
        if (r0 == null || (bArr = r0.A02) == null) {
            return null;
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass39W r4 = (AnonymousClass39W) obj;
            if (this.A00 == r4.A00 && Objects.equals(this.A02, r4.A02) && Objects.equals(this.A08, r4.A08) && Objects.equals(this.A07, r4.A07) && Objects.equals(this.A09, r4.A09) && Objects.equals(this.A0A, r4.A0A) && this.A0B.equals(r4.A0B) && Objects.equals(this.A04, r4.A04) && Objects.equals(this.A01, r4.A01) && Objects.equals(this.A06, r4.A06) && Objects.equals(this.A03, r4.A03)) {
                return Objects.equals(this.A05, r4.A05);
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int A042 = C18280x3.A04(this.A02) * 31;
        String str = this.A08;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = (A042 + i) * 31;
        String str2 = this.A07;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.A09;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str4 = this.A0A;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode = (((((((((((((i8 + i4) * 31) + this.A0B.hashCode()) * 31) + C18280x3.A04(this.A04)) * 31) + C18280x3.A04(this.A01)) * 31) + C18280x3.A04(this.A06)) * 31) + C18280x3.A04(this.A03)) * 31) + this.A00) * 31;
        C631638e r0 = this.A05;
        if (r0 != null) {
            i5 = r0.hashCode();
        }
        return hashCode + i5;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0A);
        parcel.writeList(this.A0B);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A05, i);
    }

    public static boolean A00(AnonymousClass39W r0, String str) {
        return str.equals(r0.A01());
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass39W(AnonymousClass39A r2, AnonymousClass39P r3, String str, String str2, String str3) {
        this.A0B = AnonymousClass001.A0s();
        this.A02 = r2;
        this.A08 = str;
        this.A09 = str2;
        this.A07 = str3;
        this.A03 = r3;
        this.A00 = 5;
    }

    public AnonymousClass39W(Parcel parcel) {
        this.A0B = AnonymousClass001.A0s();
        this.A02 = (AnonymousClass39A) C18280x3.A0C(parcel, AnonymousClass39A.class);
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A07 = parcel.readString();
        this.A0A = parcel.readString();
        ArrayList A0s = AnonymousClass001.A0s();
        this.A0B = A0s;
        C18320x8.A12(parcel, C108725dS.class, A0s);
        this.A00 = parcel.readInt();
        this.A01 = (AnonymousClass39S) C18280x3.A0C(parcel, AnonymousClass39S.class);
        this.A06 = (C632938r) C18280x3.A0C(parcel, C632938r.class);
        this.A03 = (AnonymousClass39P) C18280x3.A0C(parcel, AnonymousClass39P.class);
        this.A05 = (C631638e) C18280x3.A0C(parcel, C631638e.class);
    }

    public AnonymousClass39W(AnonymousClass39A r2, C631638e r3, String str, String str2) {
        this.A0B = AnonymousClass001.A0s();
        this.A00 = 7;
        this.A02 = r2;
        this.A09 = str2;
        this.A08 = str;
        this.A05 = r3;
    }

    @Deprecated
    public AnonymousClass39W(AnonymousClass39S r1, AnonymousClass39A r2, AnonymousClass39E r3, String str, String str2, String str3, List list, int i) {
        this.A02 = r2;
        this.A08 = str;
        this.A09 = str2;
        this.A07 = str3;
        this.A0B = list;
        this.A04 = r3;
        this.A01 = r1;
        this.A00 = i;
    }

    public AnonymousClass39W(AnonymousClass39S r2, AnonymousClass39A r3, AnonymousClass39P r4, String str, String str2) {
        this.A0B = AnonymousClass001.A0s();
        this.A00 = 3;
        this.A02 = r3;
        this.A09 = str2;
        this.A08 = str;
        this.A01 = r2;
        this.A03 = r4;
    }

    public AnonymousClass39W() {
        this.A0B = AnonymousClass001.A0s();
        this.A00 = 8;
    }
}
