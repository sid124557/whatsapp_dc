package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6PG  reason: invalid class name */
public final class AnonymousClass6PG extends AnonymousClass87W {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(58);
    public final long A00;
    public final long A01;
    public final byte[] A02;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeByteArray(this.A02);
    }

    public AnonymousClass6PG(byte[] bArr, long j, long j2) {
        this.A01 = j2;
        this.A00 = j;
        this.A02 = bArr;
    }

    public AnonymousClass6PG(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A02 = parcel.createByteArray();
    }
}
