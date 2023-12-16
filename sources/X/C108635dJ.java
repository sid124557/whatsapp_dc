package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;

/* renamed from: X.5dJ  reason: invalid class name and case insensitive filesystem */
public class C108635dJ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108325co();
    public int A00;
    public C160617ny A01;
    public BigDecimal A02;
    public final int A03;
    public final C108755dV A04;
    public final C166357yY A05;
    public final String A06;
    public final String A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C162457s7.A0P(getClass(), obj.getClass())) {
                return false;
            }
            C108635dJ r5 = (C108635dJ) obj;
            if (this.A00 != r5.A00 || this.A03 != r5.A03 || !C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A06, r5.A06) || !AnonymousClass75J.A00(this.A02, r5.A02) || !AnonymousClass75J.A00(this.A01, r5.A01) || !AnonymousClass75J.A00(this.A05, r5.A05) || !AnonymousClass75J.A00(this.A04, r5.A04)) {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeSerializable(this.A02);
        C160617ny r0 = this.A01;
        if (r0 != null) {
            str = r0.A00;
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.A05, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        C108755dV r1 = this.A04;
        if (r1 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r1.writeToParcel(parcel, i);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = this.A07;
        objArr[1] = this.A06;
        objArr[2] = this.A02;
        objArr[3] = this.A01;
        objArr[4] = this.A05;
        C18310x6.A1U(objArr, this.A00);
        C18290x4.A1U(objArr, this.A03);
        return C18310x6.A08(this.A04, objArr, 7);
    }

    public C108635dJ(C108755dV r1, C166357yY r2, C160617ny r3, String str, String str2, BigDecimal bigDecimal, int i, int i2) {
        C18260x0.A0Q(str, str2);
        this.A07 = str;
        this.A06 = str2;
        this.A02 = bigDecimal;
        this.A01 = r3;
        this.A05 = r2;
        this.A00 = i;
        this.A03 = i2;
        this.A04 = r1;
    }
}
