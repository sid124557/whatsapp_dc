package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6T4  reason: invalid class name */
public class AnonymousClass6T4 extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163917ua();
    public final C127466Sb A00;
    public final C127476Sc A01;
    public final C127486Sd A02;
    public final C127506Sf A03;
    public final C127516Sg A04;
    public final C127526Sh A05;
    public final C127536Si A06;
    public final C127546Sj A07;
    public final C127556Sk A08;
    public final C127566Sl A09;

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass6T4) {
            AnonymousClass6T4 r4 = (AnonymousClass6T4) obj;
            if (!AnonymousClass72K.A00(this.A00, r4.A00) || !AnonymousClass72K.A00(this.A07, r4.A07) || !AnonymousClass72K.A00(this.A02, r4.A02) || !AnonymousClass72K.A00(this.A09, r4.A09) || !AnonymousClass72K.A00(this.A03, r4.A03) || !AnonymousClass72K.A00(this.A04, r4.A04) || !AnonymousClass72K.A00(this.A08, r4.A08) || !AnonymousClass72K.A00(this.A05, r4.A05) || !AnonymousClass72K.A00(this.A01, r4.A01) || !AnonymousClass72K.A00(this.A06, r4.A06)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[10];
        objArr[0] = this.A00;
        objArr[1] = this.A07;
        objArr[2] = this.A02;
        objArr[3] = this.A09;
        objArr[4] = this.A03;
        objArr[5] = this.A04;
        objArr[6] = this.A08;
        objArr[7] = this.A05;
        objArr[8] = this.A01;
        return C18310x6.A08(this.A06, objArr, 9);
    }

    public AnonymousClass6T4(C127466Sb r1, C127476Sc r2, C127486Sd r3, C127506Sf r4, C127516Sg r5, C127526Sh r6, C127536Si r7, C127546Sj r8, C127556Sk r9, C127566Sl r10) {
        this.A00 = r1;
        this.A02 = r3;
        this.A07 = r8;
        this.A09 = r10;
        this.A03 = r4;
        this.A04 = r5;
        this.A08 = r9;
        this.A05 = r6;
        this.A01 = r2;
        this.A06 = r7;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        boolean A062 = C1695389r.A06(parcel, this.A00, i);
        C162417s1.A0A(parcel, this.A07, 3, i, A062);
        C162417s1.A0A(parcel, this.A02, 4, i, A062);
        C162417s1.A0A(parcel, this.A09, 5, i, A062);
        C162417s1.A0A(parcel, this.A03, 6, i, A062);
        C162417s1.A0A(parcel, this.A04, 7, i, A062);
        C162417s1.A0A(parcel, this.A08, 8, i, A062);
        C162417s1.A0A(parcel, this.A05, 9, i, A062);
        C162417s1.A0A(parcel, this.A01, 10, i, A062);
        C162417s1.A0A(parcel, this.A06, 11, i, A062);
        C162417s1.A06(parcel, A002);
    }
}
