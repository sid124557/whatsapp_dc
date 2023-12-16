package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.7xr  reason: invalid class name and case insensitive filesystem */
public final class C165927xr implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(12);
    public final int A00;
    public final int A01;
    public final int[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C165927xr.class != obj.getClass()) {
                return false;
            }
            C165927xr r5 = (C165927xr) obj;
            if (this.A00 != r5.A00 || !Arrays.equals(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A02);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        int[] iArr = this.A02;
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(iArr);
    }

    public C165927xr(Parcel parcel) {
        this.A00 = parcel.readInt();
        int readByte = parcel.readByte();
        this.A01 = readByte;
        int[] iArr = new int[readByte];
        this.A02 = iArr;
        parcel.readIntArray(iArr);
    }
}
