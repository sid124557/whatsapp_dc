package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.6UX  reason: invalid class name */
public class AnonymousClass6UX extends C127216Rc {
    public static final Parcelable.Creator CREATOR = new C163757uK();
    public final C142976y7 A00;
    public final AnonymousClass6T4 A01;
    public final C127686Sx A02;
    public final C127656Su A03;
    public final C127696Sy A04;
    public final C127626Sr A05;
    public final Double A06;
    public final Integer A07;
    public final List A08;
    public final List A09;
    public final byte[] A0A;

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass6UX) {
            AnonymousClass6UX r5 = (AnonymousClass6UX) obj;
            if (AnonymousClass72K.A00(this.A03, r5.A03) && AnonymousClass72K.A00(this.A04, r5.A04) && Arrays.equals(this.A0A, r5.A0A) && AnonymousClass72K.A00(this.A06, r5.A06)) {
                List list = this.A08;
                List list2 = r5.A08;
                if (list.containsAll(list2) && list2.containsAll(list)) {
                    List list3 = this.A09;
                    List list4 = r5.A09;
                    if (list3 != null ? !(list4 == null || !list3.containsAll(list4) || !list4.containsAll(list3)) : list4 == null) {
                        if (!AnonymousClass72K.A00(this.A02, r5.A02) || !AnonymousClass72K.A00(this.A07, r5.A07) || !AnonymousClass72K.A00(this.A05, r5.A05) || !AnonymousClass72K.A00(this.A00, r5.A00) || !AnonymousClass72K.A00(this.A01, r5.A01)) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[11];
        objArr[0] = this.A03;
        objArr[1] = this.A04;
        AnonymousClass000.A1N(objArr, Arrays.hashCode(this.A0A));
        objArr[3] = this.A08;
        objArr[4] = this.A06;
        objArr[5] = this.A09;
        objArr[6] = this.A02;
        objArr[7] = this.A07;
        objArr[8] = this.A05;
        objArr[9] = this.A00;
        return C18310x6.A08(this.A01, objArr, 10);
    }

    public AnonymousClass6UX(AnonymousClass6T4 r3, C127686Sx r4, C127656Su r5, C127696Sy r6, C127626Sr r7, Double d, Integer num, String str, List list, List list2, byte[] bArr) {
        C162177rO.A02(r5);
        this.A03 = r5;
        C162177rO.A02(r6);
        this.A04 = r6;
        C162177rO.A02(bArr);
        this.A0A = bArr;
        C162177rO.A02(list);
        this.A08 = list;
        this.A06 = d;
        this.A09 = list2;
        this.A02 = r4;
        this.A07 = num;
        this.A05 = r7;
        if (str != null) {
            try {
                this.A00 = C142976y7.A00(str);
            } catch (C143206yV e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.A01 = r3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        boolean A062 = C1695389r.A06(parcel, this.A03, i);
        C162417s1.A0A(parcel, this.A04, 3, i, A062);
        C162417s1.A0E(parcel, this.A0A, 4, A062);
        C162417s1.A0D(parcel, this.A08, 5, A062);
        Double d = this.A06;
        if (d != null) {
            parcel.writeInt(524294);
            parcel.writeDouble(d.doubleValue());
        }
        C162417s1.A0D(parcel, this.A09, 7, A062);
        C162417s1.A0A(parcel, this.A02, 8, i, A062);
        Integer num = this.A07;
        if (num != null) {
            parcel.writeInt(262153);
            parcel.writeInt(num.intValue());
        }
        C162417s1.A0A(parcel, this.A05, 10, i, A062);
        C162417s1.A0B(parcel, C18270x1.A0T(this.A00), 11, A062);
        C162417s1.A0A(parcel, this.A01, 12, i, A062);
        C162417s1.A06(parcel, A002);
    }
}
