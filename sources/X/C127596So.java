package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6So  reason: invalid class name and case insensitive filesystem */
public class C127596So extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163787uN();
    public final C166347yX A00;
    public final C142986y8 A01;

    public boolean equals(Object obj) {
        if (obj instanceof C127596So) {
            C127596So r4 = (C127596So) obj;
            if (!this.A01.equals(r4.A01) || !this.A00.equals(r4.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C127596So(String str, int i) {
        C162177rO.A02(str);
        try {
            this.A01 = C142986y8.A00(str);
            C162177rO.A02(Integer.valueOf(i));
            try {
                this.A00 = C166347yX.A00(i);
            } catch (C143216yW e) {
                throw new IllegalArgumentException(e);
            }
        } catch (C143236yY e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A01;
        return C18310x6.A08(this.A00, A0M, 1);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0B(parcel, this.A01.toString(), 2, false);
        int B4M = this.A00.A00.B4M();
        if (Integer.valueOf(B4M) != null) {
            parcel.writeInt(262147);
            parcel.writeInt(B4M);
        }
        C162417s1.A06(parcel, A002);
    }
}
