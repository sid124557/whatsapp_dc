package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.0Zh  reason: invalid class name and case insensitive filesystem */
public class C06810Zh implements Parcelable {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(29);
    public int A00;
    public int A01;
    public boolean A02;
    public int[] A03;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int length;
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        int[] iArr = this.A03;
        if (iArr == null || (length = iArr.length) <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(length);
        parcel.writeIntArray(this.A03);
    }

    public C06810Zh(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = AnonymousClass001.A1T(parcel.readInt());
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.A03 = iArr;
            parcel.readIntArray(iArr);
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FullSpanItem{mPosition=");
        A0o.append(this.A01);
        A0o.append(", mGapDir=");
        A0o.append(this.A00);
        A0o.append(", mHasUnwantedGapAfter=");
        A0o.append(this.A02);
        A0o.append(", mGapPerSpan=");
        A0o.append(Arrays.toString(this.A03));
        return AnonymousClass000.A0d(A0o);
    }

    public C06810Zh() {
    }
}
