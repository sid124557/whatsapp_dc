package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.7yz  reason: invalid class name and case insensitive filesystem */
public final class C166617yz implements Parcelable, C177618gA {
    public static final C177608g9 CREATOR = new AnonymousClass91W(1);
    public int A00;
    public final int A01;
    public final int A02;
    public final C166637z1[] A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && C166617yz.class == obj.getClass() && Arrays.equals(this.A03, ((C166617yz) obj).A03);
        }
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = 16337 + Arrays.hashCode(this.A03);
        this.A00 = hashCode;
        return hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A01;
        parcel.writeInt(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            parcel.writeParcelable(this.A03[i3], 0);
        }
    }

    public C166617yz(C166637z1... r4) {
        int length = r4.length;
        C159197lM.A01(AnonymousClass001.A1W(length));
        this.A03 = r4;
        this.A01 = length;
        int A012 = C162097rD.A01(r4[0].A0S);
        this.A02 = A012 == -1 ? C162097rD.A01(r4[0].A0P) : A012;
    }
}
