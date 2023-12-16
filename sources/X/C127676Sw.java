package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.6Sw  reason: invalid class name and case insensitive filesystem */
public class C127676Sw extends C1695389r {
    public static final AnonymousClass6WV A03;
    public static final Parcelable.Creator CREATOR = new C163777uM();
    public final C142986y8 A00;
    public final List A01;
    public final byte[] A02;

    static {
        Object[] objArr = new Object[2];
        AnonymousClass000.A16(AnonymousClass78Y.A00, AnonymousClass78Y.A01, objArr);
        A03 = AnonymousClass6WV.A01(objArr, 2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C127676Sw) {
            C127676Sw r6 = (C127676Sw) obj;
            if (this.A00.equals(r6.A00) && Arrays.equals(this.A02, r6.A02)) {
                List list = this.A01;
                List list2 = r6.A01;
                if (list != null ? list2 == null || !list.containsAll(list2) || !list2.containsAll(list) : list2 != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public C127676Sw(String str, List list, byte[] bArr) {
        C162177rO.A02(str);
        try {
            this.A00 = C142986y8.A00(str);
            C162177rO.A02(bArr);
            this.A02 = bArr;
            this.A01 = list;
        } catch (C143236yY e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A00;
        AnonymousClass000.A1M(A1X, Arrays.hashCode(this.A02));
        return C18310x6.A08(this.A01, A1X, 2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        boolean A07 = C1695389r.A07(parcel, this.A00.toString());
        C162417s1.A0E(parcel, this.A02, 3, A07);
        C162417s1.A0D(parcel, this.A01, 4, A07);
        C162417s1.A06(parcel, A002);
    }
}
