package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@Deprecated
/* renamed from: X.6Ss  reason: invalid class name and case insensitive filesystem */
public final class C127636Ss extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163317tc();
    public final String A00;
    public final boolean A01;
    public final byte[] A02;

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (this != obj) {
            if (obj instanceof C127636Ss) {
                C127636Ss r5 = (C127636Ss) obj;
                if (this.A01 != r5.A01 || !Arrays.equals(this.A02, r5.A02) || ((str = this.A00) != (str2 = r5.A00) && (str == null || !str.equals(str2)))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C127636Ss(byte[] bArr, String str, boolean z) {
        if (z) {
            C162177rO.A02(bArr);
            C162177rO.A02(str);
        }
        this.A01 = z;
        this.A02 = bArr;
        this.A00 = str;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass001.A1R(A0M, this.A01);
        return AnonymousClass6CA.A09(this.A02, C18310x6.A08(this.A00, A0M, 1) * 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A09(parcel, 1, this.A01);
        C162417s1.A0E(parcel, this.A02, 2, false);
        C162417s1.A0B(parcel, this.A00, 3, false);
        C162417s1.A06(parcel, A002);
    }
}
