package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.39S  reason: invalid class name */
public class AnonymousClass39S implements Parcelable {
    public static final Map A0N;
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(9);
    public long A00;
    public AnonymousClass39L A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final C85204Fi A06;
    public final AnonymousClass39H A07;
    public final AnonymousClass390 A08;
    public final AnonymousClass39G A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final List A0H;
    public final List A0I;
    public final List A0J;
    public final List A0K;
    public final boolean A0L;
    public final byte[] A0M;

    public static void A01(Object obj, Object obj2, AbstractMap abstractMap, Object[] objArr, int i) {
        objArr[i] = obj;
        abstractMap.put(obj2, new HashSet(Arrays.asList(objArr)));
    }

    public int A02() {
        String str = this.A0G;
        if ("digital-goods".equals(str)) {
            return 1;
        }
        return C18310x6.A02("physical-goods".equals(str) ? 1 : 0);
    }

    public AnonymousClass39L A03(AnonymousClass39G r4) {
        C60042xu r2 = new C60042xu();
        r2.A01 = Math.abs(r4.A01);
        r2.A00 = r4.A00;
        r2.A02 = this.A06;
        return r2.A01();
    }

    public String A04() {
        List<AnonymousClass394> list;
        String str = this.A0C;
        if (TextUtils.isEmpty(str) && (list = this.A0K) != null && list.size() > 0) {
            for (AnonymousClass394 r0 : list) {
                C85184Fg r2 = r0.A00;
                if (r2 != null && r0.A01.equals("upi_merchant_configuration")) {
                    return ((AnonymousClass3SQ) r2).A01;
                }
            }
        }
        return str;
    }

    public String A05(C620733j r3) {
        String A062 = A06(r3, this.A09);
        if (A062 != null) {
            return A062;
        }
        C85204Fi r1 = this.A06;
        C626936e.A06(r1);
        return r1.B3W(r3, BigDecimal.ZERO);
    }

    public String A06(C620733j r6, AnonymousClass39G r7) {
        if (r7 == null || r7.A01 == 0) {
            return null;
        }
        AnonymousClass39L A032 = A03(r7);
        C85204Fi r1 = this.A06;
        C626936e.A06(r1);
        return r1.B3W(r6, A032.A02.A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.A0M);
        parcel.writeString(this.A0F);
        parcel.writeParcelable(this.A09, i);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0G);
        this.A06.writeToParcel(parcel, i);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeParcelable(this.A07, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeList(this.A0H);
        parcel.writeList(this.A0I);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeList(this.A0K);
        parcel.writeParcelable(this.A08, i);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A01, i);
        parcel.writeList(this.A0J);
    }

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A0N = A0t;
        Integer[] numArr = new Integer[8];
        numArr[0] = 2;
        numArr[1] = 7;
        numArr[2] = 8;
        numArr[3] = 5;
        numArr[4] = 6;
        numArr[5] = 3;
        Integer A0Y = C18300x5.A0Y();
        numArr[6] = A0Y;
        A01(4, 1, A0t, numArr, 7);
        Integer[] numArr2 = new Integer[7];
        numArr2[0] = 7;
        numArr2[1] = 8;
        numArr2[2] = 5;
        C18280x3.A1A(6, 3, numArr2);
        numArr2[5] = A0Y;
        A01(4, 2, A0t, numArr2, 6);
        Integer[] numArr3 = new Integer[7];
        numArr3[0] = 2;
        numArr3[1] = 8;
        numArr3[2] = 5;
        C18280x3.A1A(6, 3, numArr3);
        numArr3[5] = A0Y;
        A01(4, 7, A0t, numArr3, 6);
        Integer[] numArr4 = new Integer[7];
        numArr4[0] = 2;
        numArr4[1] = 7;
        numArr4[2] = 8;
        C18280x3.A1A(6, A0Y, numArr4);
        numArr4[5] = 3;
        A01(4, 5, A0t, numArr4, 6);
        Integer[] numArr5 = new Integer[7];
        numArr5[0] = 2;
        numArr5[1] = 7;
        numArr5[2] = 8;
        C18280x3.A1A(5, 3, numArr5);
        numArr5[5] = A0Y;
        A01(4, 6, A0t, numArr5, 6);
        Integer[] numArr6 = new Integer[5];
        numArr6[0] = 7;
        numArr6[1] = 6;
        numArr6[2] = 5;
        numArr6[3] = A0Y;
        A01(4, 8, A0t, numArr6, 4);
        Integer[] numArr7 = new Integer[5];
        numArr7[0] = 7;
        numArr7[1] = 8;
        numArr7[2] = 6;
        numArr7[3] = 5;
        A01(4, A0Y, A0t, numArr7, 4);
    }

    public AnonymousClass39S(Parcel parcel) {
        this.A0M = parcel.createByteArray();
        this.A0F = C18310x6.A0l(parcel);
        Parcelable A0C2 = C18280x3.A0C(parcel, AnonymousClass39G.class);
        C626936e.A06(A0C2);
        this.A09 = (AnonymousClass39G) A0C2;
        this.A0E = C18310x6.A0l(parcel);
        this.A0B = parcel.readString();
        this.A0G = parcel.readString();
        this.A06 = C617332a.A00(parcel);
        this.A0C = parcel.readString();
        this.A0D = parcel.readString();
        Parcelable A0C3 = C18280x3.A0C(parcel, AnonymousClass39H.class);
        C626936e.A06(A0C3);
        this.A07 = (AnonymousClass39H) A0C3;
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = parcel.readLong();
        boolean z = false;
        this.A0L = AnonymousClass000.A1U(parcel.readInt(), 1);
        ArrayList A0s = AnonymousClass001.A0s();
        this.A0H = A0s;
        C18320x8.A12(parcel, AnonymousClass38Y.class, A0s);
        ArrayList A0s2 = AnonymousClass001.A0s();
        this.A0I = A0s2;
        C18320x8.A12(parcel, AnonymousClass399.class, A0s2);
        this.A05 = parcel.readInt() == 1 ? true : z;
        ArrayList A0s3 = AnonymousClass001.A0s();
        this.A0K = A0s3;
        C18320x8.A12(parcel, AnonymousClass394.class, A0s3);
        Parcelable A0C4 = C18280x3.A0C(parcel, AnonymousClass390.class);
        C626936e.A06(A0C4);
        this.A08 = (AnonymousClass390) A0C4;
        this.A0A = parcel.readString();
        this.A01 = (AnonymousClass39L) C18280x3.A0C(parcel, AnonymousClass39L.class);
        ArrayList A0s4 = AnonymousClass001.A0s();
        this.A0J = A0s4;
        C18320x8.A12(parcel, String.class, A0s4);
    }

    public static int A00(String str) {
        if ("pending".equals(str)) {
            return 1;
        }
        if ("processing".equals(str)) {
            return 2;
        }
        if ("payment_requested".equals(str)) {
            return 7;
        }
        if ("completed".equals(str)) {
            return 3;
        }
        if ("delivered".equals(str)) {
            return 9;
        }
        if ("canceled".equals(str)) {
            return 4;
        }
        if ("partially_shipped".equals(str)) {
            return 5;
        }
        if ("shipped".equals(str)) {
            return 6;
        }
        if ("preparing_to_ship".equals(str)) {
            return 8;
        }
        C18260x0.A0t("CheckoutInfoContent/getOrderStatus can not recognise order status: ", str, AnonymousClass001.A0o());
        return 0;
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass39S(C85204Fi r3, AnonymousClass39L r4, AnonymousClass39H r5, AnonymousClass390 r6, AnonymousClass39G r7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, List list2, List list3, List list4, byte[] bArr, long j, boolean z, boolean z2) {
        this.A0M = bArr;
        this.A0F = str;
        this.A09 = r7;
        this.A0E = str2;
        this.A0B = str3;
        this.A0G = str4;
        this.A06 = r3;
        this.A0C = str5;
        this.A0D = str6;
        this.A07 = r5;
        this.A04 = str7;
        this.A03 = str8;
        this.A02 = str9;
        this.A00 = j;
        this.A0L = z;
        this.A0H = list;
        this.A0I = list2;
        this.A05 = z2;
        this.A0K = list3;
        this.A08 = r6;
        this.A0A = str10;
        this.A01 = r4;
        this.A0J = list4;
    }
}
