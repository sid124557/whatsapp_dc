package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6TH  reason: invalid class name */
public final class AnonymousClass6TH extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164957wI();
    public final byte A00;
    public final byte A01;
    public final byte A02;
    public final byte A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass6TH.class != obj.getClass()) {
                return false;
            }
            AnonymousClass6TH r5 = (AnonymousClass6TH) obj;
            if (this.A04 != r5.A04 || this.A00 != r5.A00 || this.A01 != r5.A01 || this.A02 != r5.A02 || this.A03 != r5.A03 || !this.A05.equals(r5.A05)) {
                return false;
            }
            String str = this.A06;
            String str2 = r5.A06;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            if (!this.A07.equals(r5.A07) || !this.A08.equals(r5.A08) || !this.A09.equals(r5.A09)) {
                return false;
            }
            String str3 = this.A0A;
            String str4 = r5.A0A;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return false;
                }
            } else if (str4 != null) {
                return false;
            }
            String str5 = this.A0B;
            String str6 = r5.A0B;
            if (str5 != null) {
                return str5.equals(str6);
            }
            if (str6 != null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = (this.A04 + 31) * 31;
        return ((((((((((AnonymousClass0x2.A07(this.A09, AnonymousClass0x2.A07(this.A08, AnonymousClass0x2.A07(this.A07, (AnonymousClass0x2.A07(this.A05, i) + C86624Kv.A04(this.A06)) * 31))) + C86624Kv.A04(this.A0A)) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + AnonymousClass6CA.A06(this.A0B);
    }

    public final String toString() {
        int i = this.A04;
        String str = this.A05;
        String str2 = this.A06;
        String str3 = this.A07;
        String str4 = this.A08;
        String str5 = this.A09;
        String str6 = this.A0A;
        byte b = this.A00;
        byte b2 = this.A01;
        byte b3 = this.A02;
        byte b4 = this.A03;
        String str7 = this.A0B;
        int A062 = AnonymousClass6C7.A06(str);
        int A063 = AnonymousClass6C7.A06(str2);
        int A064 = AnonymousClass6C7.A06(str3);
        int A065 = AnonymousClass6C7.A06(str4);
        int A066 = AnonymousClass6C7.A06(str5);
        StringBuilder A0Y = AnonymousClass6CA.A0Y(A062 + 211 + A063 + A064 + A065 + A066 + AnonymousClass6C7.A06(str6) + AnonymousClass6C7.A06(str7));
        A0Y.append("AncsNotificationParcelable{, id=");
        A0Y.append(i);
        A0Y.append(", appId='");
        A0Y.append(str);
        A0Y.append("', dateTime='");
        A0Y.append(str2);
        A0Y.append("', notificationText='");
        A0Y.append(str3);
        A0Y.append("', title='");
        A0Y.append(str4);
        A0Y.append("', subtitle='");
        A0Y.append(str5);
        A0Y.append("', displayName='");
        A0Y.append(str6);
        A0Y.append("', eventId=");
        A0Y.append(b);
        A0Y.append(", eventFlags=");
        A0Y.append(b2);
        A0Y.append(", categoryId=");
        A0Y.append(b3);
        A0Y.append(", categoryCount=");
        A0Y.append(b4);
        A0Y.append(", packageName='");
        A0Y.append(str7);
        return AnonymousClass000.A0X("'}", A0Y);
    }

    public AnonymousClass6TH(String str, String str2, String str3, String str4, String str5, String str6, String str7, byte b, byte b2, byte b3, byte b4, int i) {
        this.A04 = i;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A0A = str6;
        this.A00 = b;
        this.A01 = b2;
        this.A02 = b3;
        this.A03 = b4;
        this.A0B = str7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A04);
        String str = this.A05;
        C162417s1.A0B(parcel, str, 3, false);
        C162417s1.A0B(parcel, this.A06, 4, false);
        C162417s1.A0B(parcel, this.A07, 5, false);
        C162417s1.A0B(parcel, this.A08, 6, false);
        C162417s1.A0B(parcel, this.A09, 7, false);
        String str2 = this.A0A;
        if (str2 == null) {
            str2 = str;
        }
        C162417s1.A0B(parcel, str2, 8, false);
        C162417s1.A04(parcel, this.A00, 9);
        C162417s1.A04(parcel, this.A01, 10);
        C162417s1.A04(parcel, this.A02, 11);
        C162417s1.A04(parcel, this.A03, 12);
        C162417s1.A0B(parcel, this.A0B, 13, false);
        C162417s1.A06(parcel, A002);
    }
}
