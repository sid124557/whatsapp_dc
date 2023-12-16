package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.7xs  reason: invalid class name and case insensitive filesystem */
public final class C165937xs implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(66);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int[] A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C165937xs.class != obj.getClass()) {
                return false;
            }
            C165937xs r5 = (C165937xs) obj;
            if (!(this.A01 == r5.A01 && Arrays.equals(this.A03, r5.A03) && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + Arrays.hashCode(this.A03)) * 31) + this.A02) * 31) + this.A00;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        int[] iArr = this.A03;
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(iArr);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
    }

    public C165937xs(Parcel parcel) {
        this.A01 = parcel.readInt();
        int[] iArr = new int[parcel.readByte()];
        this.A03 = iArr;
        parcel.readIntArray(iArr);
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
    }
}
