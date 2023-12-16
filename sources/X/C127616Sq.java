package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6Sq  reason: invalid class name and case insensitive filesystem */
public final class C127616Sq extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163947ud();
    public final boolean A00;
    public final byte[] A01;

    public final boolean equals(Object obj) {
        if (obj instanceof C127616Sq) {
            C127616Sq r4 = (C127616Sq) obj;
            if (this.A00 != r4.A00 || !Arrays.equals(this.A01, r4.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C127616Sq(byte[] bArr, boolean z) {
        this.A00 = z;
        this.A01 = bArr;
    }

    public final int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass001.A1R(A0M, this.A00);
        return C18310x6.A08(this.A01, A0M, 1);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A09(parcel, 1, this.A00);
        C162417s1.A0E(parcel, this.A01, 2, false);
        C162417s1.A06(parcel, A002);
    }
}
