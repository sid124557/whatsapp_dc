package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/* renamed from: X.5dw  reason: invalid class name and case insensitive filesystem */
public class C109015dw implements Parcelable, AnonymousClass49A {
    public static final Parcelable.Creator CREATOR = new AnonymousClass91V(79);
    public int A00;
    public C633238u A01;
    public C108745dU A02;
    public C631238a A03;
    public C160617ny A04;
    public String A05;
    public BigDecimal A06;
    public List A07;
    public boolean A08;
    public final long A09;
    public final C166017y0 A0A;
    public final C108755dV A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final boolean A0H;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C109015dw) {
                C109015dw r8 = (C109015dw) obj;
                if (C107575bX.A0G(this.A0F, r8.A0F) && C107575bX.A0G(this.A05, r8.A05) && C107575bX.A0G(this.A0C, r8.A0C) && AnonymousClass75J.A00(this.A04, r8.A04) && AnonymousClass75J.A00(this.A06, r8.A06) && this.A09 == r8.A09 && C107575bX.A0G(this.A0E, r8.A0E) && C107575bX.A0G(this.A0G, r8.A0G) && AnonymousClass75J.A00(this.A01, r8.A01) && AnonymousClass75J.A00(this.A02, r8.A02)) {
                    List list = this.A07;
                    int size = list.size();
                    List list2 = r8.A07;
                    if (size == list2.size()) {
                        if (list != list2) {
                            int i = 0;
                            while (true) {
                                if (i < list.size()) {
                                    if (!list.get(i).equals(list2.get(i))) {
                                        break;
                                    }
                                    i++;
                                } else {
                                    break;
                                }
                            }
                        }
                        if (this.A0H != r8.A0H || this.A08 != r8.A08 || this.A00 != r8.A00 || !AnonymousClass75J.A00(this.A0A, r8.A0A) || !AnonymousClass75J.A00(this.A0B, r8.A0B) || !AnonymousClass75J.A00(this.A03, r8.A03)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public void A00(C30771mz r4) {
        r4.A06 = this.A0F;
        r4.A09 = this.A05;
        r4.A04 = this.A0C;
        C160617ny r0 = this.A04;
        if (r0 != null) {
            r4.A03 = r0.A00;
            BigDecimal bigDecimal = this.A06;
            r4.A0A = bigDecimal;
            C108745dU r1 = this.A02;
            if (r1 != null) {
                Date date = new Date();
                if (bigDecimal == null) {
                    bigDecimal = null;
                } else if (r1.A00(date)) {
                    bigDecimal = r1.A01;
                }
                r4.A0B = bigDecimal;
            }
        }
        r4.A08 = this.A0G;
        r4.A07 = this.A0E;
        r4.A00 = this.A07.size();
    }

    public boolean A01() {
        C633238u r0 = this.A01;
        if ((r0 == null || r0.A00 == 0) && !A02() && !this.A08) {
            return true;
        }
        return false;
    }

    public boolean A02() {
        String str = this.A0D;
        if ("FETCH_FAILED".equals(str) || "PARTIAL_FETCH".equals(str)) {
            return true;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        Object[] objArr = new Object[16];
        objArr[0] = this.A0F;
        objArr[1] = this.A05;
        objArr[2] = this.A0C;
        objArr[3] = this.A06;
        objArr[4] = this.A04;
        objArr[5] = this.A0E;
        objArr[6] = this.A0G;
        objArr[7] = this.A07;
        objArr[8] = this.A01;
        objArr[9] = this.A02;
        objArr[10] = Long.valueOf(this.A09);
        objArr[11] = Boolean.valueOf(this.A08);
        objArr[12] = Integer.valueOf(this.A00);
        objArr[13] = this.A0A;
        objArr[14] = this.A0B;
        return C18310x6.A08(this.A03, objArr, 15);
    }

    public void writeToParcel(Parcel parcel, int i) {
        String obj;
        parcel.writeString(this.A0F);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0C);
        BigDecimal bigDecimal = this.A06;
        String str = null;
        if (bigDecimal == null) {
            obj = null;
        } else {
            obj = bigDecimal.toString();
        }
        parcel.writeString(obj);
        C160617ny r0 = this.A04;
        if (r0 != null) {
            str = r0.A00;
        }
        parcel.writeString(str);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0G);
        parcel.writeTypedList(this.A07);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0D);
        parcel.writeByte(this.A0H ? (byte) 1 : 0);
        parcel.writeByte(this.A08 ? (byte) 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A0A, i);
        parcel.writeLong(this.A09);
        parcel.writeParcelable(this.A0B, i);
        parcel.writeParcelable(this.A03, i);
    }

    public C109015dw(Parcel parcel) {
        BigDecimal bigDecimal;
        this.A0F = parcel.readString();
        this.A05 = parcel.readString();
        this.A0C = parcel.readString();
        String readString = parcel.readString();
        C160617ny r2 = null;
        if (TextUtils.isEmpty(readString)) {
            bigDecimal = null;
        } else {
            bigDecimal = new BigDecimal(readString);
        }
        this.A06 = bigDecimal;
        String readString2 = parcel.readString();
        this.A04 = !TextUtils.isEmpty(readString2) ? new C160617ny(readString2) : r2;
        this.A0E = parcel.readString();
        this.A0G = parcel.readString();
        this.A07 = parcel.createTypedArrayList(C108815db.CREATOR);
        this.A01 = (C633238u) C18280x3.A0C(parcel, C633238u.class);
        this.A02 = (C108745dU) C18280x3.A0C(parcel, C108745dU.class);
        this.A0D = parcel.readString();
        boolean z = true;
        this.A0H = AnonymousClass000.A1S(parcel.readByte());
        this.A08 = parcel.readByte() == 0 ? false : z;
        this.A00 = parcel.readInt();
        this.A0A = (C166017y0) C18280x3.A0C(parcel, C166017y0.class);
        this.A09 = parcel.readLong();
        this.A0B = (C108755dV) C18280x3.A0C(parcel, C108755dV.class);
        this.A03 = (C631238a) C18280x3.A0C(parcel, C631238a.class);
    }

    public void BmG(C631238a r1) {
        this.A03 = r1;
    }

    public C109015dw(C166017y0 r6, C633238u r7, C108745dU r8, C108755dV r9, C160617ny r10, String str, String str2, String str3, String str4, String str5, String str6, BigDecimal bigDecimal, List list, int i, long j, boolean z, boolean z2) {
        List list2 = list;
        this.A0F = str;
        this.A05 = str2;
        BigDecimal bigDecimal2 = bigDecimal;
        if (bigDecimal == null || r10 == null) {
            this.A06 = null;
            this.A04 = null;
        } else {
            this.A06 = bigDecimal2;
            this.A04 = r10;
        }
        this.A0E = str4;
        this.A0G = str5;
        this.A0C = str3;
        this.A0D = str6;
        this.A07 = A02() ? AnonymousClass001.A0s() : list2;
        this.A01 = r7;
        this.A02 = r8;
        this.A0H = z;
        this.A08 = z2;
        this.A00 = i;
        this.A0A = r6;
        long j2 = j;
        if (j < 0) {
            this.A09 = 99;
        } else {
            this.A09 = j2;
        }
        this.A0B = r9;
    }
}
