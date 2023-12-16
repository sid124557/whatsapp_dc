package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6Sz  reason: invalid class name and case insensitive filesystem */
public final class C127706Sz extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164007uj();
    public final long A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;

    public final int hashCode() {
        Object[] objArr = new Object[4];
        C18280x3.A1S(objArr, this.A00);
        objArr[1] = this.A01;
        objArr[2] = this.A02;
        return C18310x6.A08(this.A03, objArr, 3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C127706Sz) {
            C127706Sz r7 = (C127706Sz) obj;
            if (this.A00 != r7.A00 || !Arrays.equals(this.A01, r7.A01) || !Arrays.equals(this.A02, r7.A02) || !Arrays.equals(this.A03, r7.A03)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C127706Sz(byte[] bArr, byte[] bArr2, byte[] bArr3, long j) {
        this.A00 = j;
        C162177rO.A02(bArr);
        this.A01 = bArr;
        C162177rO.A02(bArr2);
        this.A02 = bArr2;
        C162177rO.A02(bArr3);
        this.A03 = bArr3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A08(parcel, 1, this.A00);
        C162417s1.A0E(parcel, this.A01, 2, false);
        C162417s1.A0E(parcel, this.A02, 3, false);
        C162417s1.A0E(parcel, this.A03, 4, false);
        C162417s1.A06(parcel, A002);
    }
}
