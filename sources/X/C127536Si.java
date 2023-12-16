package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.6Si  reason: invalid class name and case insensitive filesystem */
public final class C127536Si extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163747uJ();
    public final byte[][] A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C127536Si)) {
            return false;
        }
        return Arrays.deepEquals(this.A00, ((C127536Si) obj).A00);
    }

    public final int hashCode() {
        int i = 0;
        for (byte[] A08 : this.A00) {
            i ^= C18310x6.A08(A08, AnonymousClass002.A0L(), 0);
        }
        return i;
    }

    public C127536Si(byte[][] bArr) {
        if (AnonymousClass000.A1W(bArr)) {
            int length = bArr.length;
            if (1 != ((length & 1) ^ 1)) {
                throw AnonymousClass6CA.A0N();
            }
            int i = 0;
            while (i < length) {
                if (i == 0 || bArr[i] != null) {
                    int i2 = i + 1;
                    if (AnonymousClass000.A1W(bArr[i2])) {
                        int length2 = bArr[i2].length;
                        if (length2 == 32 || length2 == 64) {
                            i += 2;
                        } else {
                            throw AnonymousClass6CA.A0N();
                        }
                    } else {
                        throw AnonymousClass6CA.A0N();
                    }
                } else {
                    throw AnonymousClass6CA.A0N();
                }
            }
            this.A00 = bArr;
            return;
        }
        throw AnonymousClass6CA.A0N();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0H(parcel, this.A00, 1);
        C162417s1.A06(parcel, A002);
    }
}
