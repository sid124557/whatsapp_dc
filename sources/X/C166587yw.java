package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.7yw  reason: invalid class name and case insensitive filesystem */
public abstract class C166587yw implements Parcelable {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04;
    public long A05;
    public long A06;
    public C161357pU A07 = C161357pU.A0G;
    public C133796hx A08;
    public C166557yt A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public byte[] A0D;

    public static C166587yw A05(C161357pU r12, String str, String str2, String str3, int i) {
        C161357pU r5 = r12;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i2 = i;
        if (i2 != 1) {
            if (i2 == 2) {
                C133686hm r9 = new C133686hm(r12, 0, 0, -1, -1);
                r9.A0A = str5;
                r9.A0D(str6);
                r9.A0B = str4;
                return r9;
            } else if (i2 == 3) {
                BigDecimal bigDecimal = BigDecimal.ZERO;
                C133716hp r4 = new C133716hp(r12, r12.A05, 0, 0);
                r4.A0A = str2;
                r4.A0D(str3);
                r4.A0E(r12, bigDecimal);
                r4.A08 = null;
                return r4;
            } else if (!(i2 == 4 || i2 == 6 || i2 == 8)) {
                return null;
            }
        }
        return new C133736hr(r5, str5, str4, str6, i2, 0, 0, 0, 0, C133736hr.A01(str));
    }

    public void A0A(int i) {
        int A082;
        if (i != 1 || this.A07.A01 == (A082 = A08())) {
            this.A00 = i;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PAY: ");
        A0o.append(A082);
        throw AnonymousClass000.A0F(" in country cannot be legacy primary account type", A0o);
    }

    public void A0B(int i) {
        int A082;
        if (i != 1 || this.A07.A00 == (A082 = A08())) {
            this.A01 = i;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PAY: ");
        A0o.append(A082);
        throw AnonymousClass000.A0F(" in country cannot be legacy primary account type", A0o);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r1 = ((X.C166587yw) r4).A0A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 1
            if (r3 == r4) goto L_0x0019
            boolean r1 = r4 instanceof X.C166587yw
            r0 = 0
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            X.7yw r4 = (X.C166587yw) r4
            java.lang.String r1 = r4.A0A
            if (r1 == 0) goto L_0x0018
            java.lang.String r0 = r3.A0A
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            return r2
        L_0x0018:
            r2 = 0
        L_0x0019:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166587yw.equals(java.lang.Object):boolean");
    }

    public int A08() {
        if (this instanceof C133716hp) {
            return 3;
        }
        if (this instanceof C133726hq) {
            return 9;
        }
        if (this instanceof C133706ho) {
            return 5;
        }
        if (this instanceof C133736hr) {
            return ((C133736hr) this).A00;
        }
        if (this instanceof C133686hm) {
            return 2;
        }
        return 0;
    }

    public Bitmap A09() {
        byte[] bArr;
        int A082;
        if (((this instanceof C133696hn) || (A082 = A08()) == 1 || A082 == 2 || A082 == 3 || A082 == 4 || A082 == 6 || A082 == 7) && (bArr = this.A0D) != null) {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    public int hashCode() {
        String str = this.A0A;
        if (str == null) {
            return super.hashCode();
        }
        return str.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int length;
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07.A03);
        parcel.writeParcelable(this.A09, i);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A04);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A06);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        byte[] bArr = this.A0D;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        parcel.writeInt(length);
        byte[] bArr2 = this.A0D;
        if (bArr2 != null) {
            parcel.writeByteArray(bArr2);
        }
        parcel.writeByte(AnonymousClass000.A1W(this.A08) ? (byte) 1 : 0);
        C133796hx r0 = this.A08;
        if (r0 != null) {
            parcel.writeParcelable(r0, 0);
        }
    }

    public static int A04(String str) {
        if (!TextUtils.isEmpty(str)) {
            switch (str.hashCode()) {
                case -1211756856:
                    if (str.equals("VERIFIED")) {
                        return 3;
                    }
                    break;
                case 35394935:
                    if (str.equals("PENDING")) {
                        return 1;
                    }
                    break;
                case 2066319421:
                    if (str.equals("FAILED")) {
                        return 2;
                    }
                    break;
            }
        }
        return 0;
    }

    public static String A06(int i) {
        switch (i) {
            case 1:
                return "Debit";
            case 2:
                return "Bank Account";
            case 3:
                return "PaymentWallet";
            case 4:
                return "Credit";
            case 5:
                return "Business Account";
            case 6:
                return "Combo";
            case 8:
                return "Prepaid";
            default:
                return null;
        }
    }

    public static List A07(C161357pU r5, List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C166587yw r2 = (C166587yw) it.next();
            if (AnonymousClass367.A05(r5.A09, r2.A08())) {
                if (r2.A01 == 2) {
                    A0s.add(0, r2);
                } else {
                    A0s.add(r2);
                }
            }
        }
        return A0s;
    }

    public void A0C(Parcel parcel) {
        this.A0A = parcel.readString();
        this.A07 = C161357pU.A00(parcel.readString().trim().toUpperCase(Locale.US));
        this.A09 = (C166557yt) C18280x3.A0C(parcel, C166557yt.class);
        this.A0B = parcel.readString();
        this.A0C = parcel.readString();
        this.A04 = parcel.readInt();
        this.A05 = parcel.readLong();
        this.A06 = parcel.readLong();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        int readInt = parcel.readInt();
        this.A0D = null;
        if (readInt != 0) {
            byte[] bArr = new byte[readInt];
            this.A0D = bArr;
            parcel.readByteArray(bArr);
        }
        this.A08 = null;
        if (parcel.readByte() == 1) {
            this.A08 = (C133796hx) C18280x3.A0C(parcel, AnonymousClass38U.class);
        }
    }

    public void A0D(String str) {
        this.A09 = new C166557yt(AnonymousClass3QD.A00(), String.class, str, "bankName");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("credential-id: ");
        A0o.append(this.A0A);
        A0o.append(" country: ");
        A0o.append(this.A07.A03);
        A0o.append(" issuerName: ");
        A0o.append(this.A0B);
        A0o.append(" payment-mode: ");
        A0o.append(this.A01);
        A0o.append(" payout-mode: ");
        A0o.append(this.A00);
        A0o.append(" merchant-credential-id: ");
        A0o.append(this.A0C);
        A0o.append(" payout-verification-status: ");
        A0o.append(this.A04);
        A0o.append(" countrydata: ");
        return AnonymousClass000.A0R(this.A08, A0o);
    }
}
