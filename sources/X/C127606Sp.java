package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6Sp  reason: invalid class name and case insensitive filesystem */
public final class C127606Sp extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163937uc();
    public final byte[] A00;
    public final byte[] A01;

    public final boolean equals(Object obj) {
        if (obj instanceof C127606Sp) {
            C127606Sp r4 = (C127606Sp) obj;
            if (!Arrays.equals(this.A00, r4.A00) || !Arrays.equals(this.A01, r4.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C127606Sp(byte[] bArr, byte[] bArr2) {
        this.A00 = bArr;
        this.A01 = bArr2;
    }

    public final int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A00;
        return C18310x6.A08(this.A01, A0M, 1);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0E(parcel, this.A00, 1, false);
        C162417s1.A0E(parcel, this.A01, 2, false);
        C162417s1.A06(parcel, A002);
    }
}
