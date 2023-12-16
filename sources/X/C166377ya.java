package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.7ya  reason: invalid class name and case insensitive filesystem */
public final class C166377ya implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(63);
    public int A00;
    public final int A01;
    public final C166527yp[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C166377ya.class != obj.getClass()) {
                return false;
            }
            C166377ya r5 = (C166377ya) obj;
            if (this.A01 != r5.A01 || !Arrays.equals(this.A02, r5.A02)) {
                return false;
            }
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
        int hashCode = 527 + Arrays.hashCode(this.A02);
        this.A00 = hashCode;
        return hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A01;
        parcel.writeInt(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            parcel.writeParcelable(this.A02[i3], 0);
        }
    }

    public C166377ya(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A01 = readInt;
        this.A02 = new C166527yp[readInt];
        for (int i = 0; i < this.A01; i++) {
            this.A02[i] = C18280x3.A0C(parcel, C166527yp.class);
        }
    }

    public C166377ya(C166527yp... r3) {
        int length = r3.length;
        C161487pm.A04(AnonymousClass001.A1W(length));
        this.A02 = r3;
        this.A01 = length;
    }
}
