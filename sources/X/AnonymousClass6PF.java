package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6PF  reason: invalid class name */
public final class AnonymousClass6PF extends AnonymousClass87W {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(62);
    public final long A00;
    public final long A01;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public AnonymousClass6PF(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public static long A00(C161467pi r8, long j) {
        long A0C = (long) r8.A0C();
        if ((128 & A0C) != 0) {
            return 8589934591L & ((((A0C & 1) << 32) | r8.A0I()) + j);
        }
        return -9223372036854775807L;
    }
}
