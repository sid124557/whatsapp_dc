package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6Sy  reason: invalid class name and case insensitive filesystem */
public class C127696Sy extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163817uQ();
    public final String A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A03;
        objArr[1] = this.A00;
        objArr[2] = this.A01;
        return C18310x6.A08(this.A02, objArr, 3);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C127696Sy) {
            C127696Sy r4 = (C127696Sy) obj;
            if (!Arrays.equals(this.A03, r4.A03) || !AnonymousClass72K.A00(this.A00, r4.A00) || !AnonymousClass72K.A00(this.A01, r4.A01) || !AnonymousClass72K.A00(this.A02, r4.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C127696Sy(String str, String str2, String str3, byte[] bArr) {
        C162177rO.A02(bArr);
        this.A03 = bArr;
        C162177rO.A02(str);
        this.A00 = str;
        this.A01 = str2;
        C162177rO.A02(str3);
        this.A02 = str3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0E(parcel, this.A03, 2, false);
        C162417s1.A0B(parcel, this.A00, 3, false);
        C162417s1.A0B(parcel, this.A01, 4, false);
        C162417s1.A0B(parcel, this.A02, 5, false);
        C162417s1.A06(parcel, A002);
    }
}
