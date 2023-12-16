package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6hr  reason: invalid class name and case insensitive filesystem */
public final class C133736hr extends C166587yw {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(100);
    public int A00;
    public int A01;

    public static String A02(int i) {
        if (i == 1) {
            return "visa";
        }
        if (i == 2) {
            return "mastercard";
        }
        if (i == 3) {
            return "amex";
        }
        if (i == 4) {
            return "discover";
        }
        if (i != 5) {
            return "unknown";
        }
        return "elo";
    }

    public static String A03(int i) {
        if (i == 1) {
            return "Visa";
        }
        if (i == 2) {
            return "MasterCard";
        }
        if (i == 3) {
            return "American Express";
        }
        if (i == 4) {
            return "Discover";
        }
        if (i != 5) {
            return null;
        }
        return "Elo";
    }

    public static int A00(String str) {
        if ("debit".equals(str)) {
            return 1;
        }
        if ("credit".equals(str)) {
            return 4;
        }
        if ("combo".equals(str)) {
            return 6;
        }
        if ("prepaid".equals(str)) {
            return 8;
        }
        if ("UNKNOWN".equals(str)) {
            return 7;
        }
        return 0;
    }

    public static int A01(String str) {
        if ("visa".equalsIgnoreCase(str)) {
            return 1;
        }
        if ("mastercard".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("amex".equalsIgnoreCase(str)) {
            return 3;
        }
        if ("discover".equalsIgnoreCase(str)) {
            return 4;
        }
        if ("elo".equalsIgnoreCase(str)) {
            return 5;
        }
        return 0;
    }

    public int describeContents() {
        return 0;
    }

    public C133736hr(Parcel parcel) {
        A0C(parcel);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ CARD: ");
        A0o.append(super.toString());
        return AnonymousClass000.A0X(" ]", A0o);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public C133736hr(C161357pU r4, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        this.A00 = i;
        this.A01 = i6;
        this.A0B = str2;
        C626936e.A06(r4);
        this.A07 = r4;
        A0B(i2);
        A0A(i3);
        if (i4 != 1 || this.A07.A00 == (i8 = this.A00)) {
            this.A03 = i4;
            if (i5 != 1 || this.A07.A01 == (i7 = this.A00)) {
                this.A02 = i5;
                this.A0A = str;
                if (str3 != null) {
                    A0D(str3);
                    return;
                }
                return;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("PAY: ");
            A0o.append(i7);
            throw AnonymousClass000.A0F(" in country cannot be primary account type", A0o);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("PAY: ");
        A0o2.append(i8);
        throw AnonymousClass000.A0F(" in country cannot be primary account type", A0o2);
    }
}
