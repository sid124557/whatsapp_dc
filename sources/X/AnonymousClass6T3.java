package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6T3  reason: invalid class name */
public final class AnonymousClass6T3 extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163277tY();
    public final int A00;
    public final AnonymousClass6T2 A01;
    public final C127576Sm A02;
    public final C127636Ss A03;
    public final C127456Sa A04;
    public final String A05;
    public final boolean A06;

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A04;
        objArr[1] = this.A01;
        objArr[2] = this.A03;
        objArr[3] = this.A02;
        objArr[4] = this.A05;
        return C18310x6.A08(Boolean.valueOf(this.A06), objArr, 5);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass6T3) {
            AnonymousClass6T3 r4 = (AnonymousClass6T3) obj;
            if (!AnonymousClass72K.A00(this.A04, r4.A04) || !AnonymousClass72K.A00(this.A01, r4.A01) || !AnonymousClass72K.A00(this.A03, r4.A03) || !AnonymousClass72K.A00(this.A02, r4.A02) || !AnonymousClass72K.A00(this.A05, r4.A05) || this.A06 != r4.A06 || this.A00 != r4.A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass6T3(AnonymousClass6T2 r3, C127576Sm r4, C127636Ss r5, C127456Sa r6, String str, int i, boolean z) {
        C162177rO.A02(r6);
        this.A04 = r6;
        C162177rO.A02(r3);
        this.A01 = r3;
        this.A05 = str;
        this.A06 = z;
        this.A00 = i;
        if (r5 == null) {
            C152897aL r1 = new C152897aL();
            r1.A01 = false;
            r5 = r1.A00();
        }
        this.A03 = r5;
        if (r4 == null) {
            AnonymousClass7Xw r12 = new AnonymousClass7Xw();
            r12.A01 = false;
            r4 = r12.A00();
        }
        this.A02 = r4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0A(parcel, this.A04, 1, i, false);
        C162417s1.A0A(parcel, this.A01, 2, i, false);
        C162417s1.A0B(parcel, this.A05, 3, false);
        C162417s1.A09(parcel, 4, this.A06);
        C162417s1.A07(parcel, 5, this.A00);
        C162417s1.A0A(parcel, this.A03, 6, i, false);
        C162417s1.A0A(parcel, this.A02, 7, i, false);
        C162417s1.A06(parcel, A002);
    }
}
