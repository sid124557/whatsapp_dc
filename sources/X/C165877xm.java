package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* renamed from: X.7xm  reason: invalid class name and case insensitive filesystem */
public final class C165877xm implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165387wz();
    public final byte A00;
    public final int A01;
    public final File A02;
    public final boolean A03;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeByte(this.A00);
        parcel.writeString(this.A02.getAbsolutePath());
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeInt(this.A01);
    }

    public int describeContents() {
        return 0;
    }

    public C165877xm(File file, byte b, int i, boolean z) {
        this.A00 = b;
        this.A02 = file;
        this.A03 = z;
        this.A01 = i;
    }
}
