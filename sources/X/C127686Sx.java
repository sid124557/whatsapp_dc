package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Sx  reason: invalid class name and case insensitive filesystem */
public class C127686Sx extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163987uh();
    public final C142966y6 A00;
    public final C142996y9 A01;
    public final C142926y2 A02;
    public final Boolean A03;

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A00;
        objArr[1] = this.A03;
        objArr[2] = this.A02;
        return C18310x6.A08(this.A01, objArr, 3);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C127686Sx) {
            C127686Sx r4 = (C127686Sx) obj;
            if (!AnonymousClass72K.A00(this.A00, r4.A00) || !AnonymousClass72K.A00(this.A03, r4.A03) || !AnonymousClass72K.A00(this.A02, r4.A02) || !AnonymousClass72K.A00(this.A01, r4.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C127686Sx(Boolean bool, String str, String str2, String str3) {
        C142966y6 r0;
        C142926y2 r4;
        C142996y9 r5 = null;
        if (str == null) {
            r0 = null;
        } else {
            try {
                r0 = C142966y6.A00(str);
            } catch (C143196yU | C143246yZ | C143266yb e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.A00 = r0;
        this.A03 = bool;
        if (str2 == null) {
            r4 = null;
        } else {
            C142926y2[] values = C142926y2.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                r4 = values[i];
                if (!str2.equals(r4.zze)) {
                    i++;
                }
            }
            throw new C143266yb(str2);
        }
        this.A02 = r4;
        this.A01 = str3 != null ? C142996y9.A00(str3) : r5;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        boolean A07 = C1695389r.A07(parcel, C18270x1.A0T(this.A00));
        Boolean bool = this.A03;
        if (bool != null) {
            parcel.writeInt(262147);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        C162417s1.A0B(parcel, C18270x1.A0T(this.A02), 4, A07);
        C162417s1.A0B(parcel, C18270x1.A0T(this.A01), 5, A07);
        C162417s1.A06(parcel, A002);
    }
}
