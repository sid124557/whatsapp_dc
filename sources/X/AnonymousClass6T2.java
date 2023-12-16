package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6T2  reason: invalid class name */
public final class AnonymousClass6T2 extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163297ta();
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public int hashCode() {
        Object[] objArr = new Object[7];
        AnonymousClass001.A1R(objArr, this.A04);
        objArr[1] = this.A00;
        objArr[2] = this.A01;
        objArr[3] = Boolean.valueOf(this.A05);
        objArr[4] = this.A02;
        objArr[5] = this.A03;
        return C18310x6.A08(Boolean.valueOf(this.A06), objArr, 6);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass6T2) {
            AnonymousClass6T2 r4 = (AnonymousClass6T2) obj;
            if (this.A04 != r4.A04 || !AnonymousClass72K.A00(this.A00, r4.A00) || !AnonymousClass72K.A00(this.A01, r4.A01) || this.A05 != r4.A05 || !AnonymousClass72K.A00(this.A02, r4.A02) || !AnonymousClass72K.A00(this.A03, r4.A03) || this.A06 != r4.A06) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass6T2(String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (z2 && z3) {
            z4 = false;
        }
        if (z4) {
            this.A04 = z;
            if (z) {
                C162177rO.A03(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.A00 = str;
            this.A01 = str2;
            this.A05 = z2;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = AnonymousClass002.A0J(list);
                Collections.sort(arrayList);
            }
            this.A03 = arrayList;
            this.A02 = str3;
            this.A06 = z3;
            return;
        }
        throw AnonymousClass6C7.A0U("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A09(parcel, 1, this.A04);
        boolean A07 = C1695389r.A07(parcel, this.A00);
        C162417s1.A0B(parcel, this.A01, 3, A07);
        C162417s1.A09(parcel, 4, this.A05);
        C162417s1.A0B(parcel, this.A02, 5, A07);
        C162417s1.A0C(parcel, this.A03, 6);
        C162417s1.A09(parcel, 7, this.A06);
        C162417s1.A06(parcel, A002);
    }
}
