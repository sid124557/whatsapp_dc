package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6SI  reason: invalid class name */
public final class AnonymousClass6SI extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164917wE();
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public AnonymousClass6SI(byte[] bArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        C162417s1.A07(parcel, 2, this.A01);
        C162417s1.A0E(parcel, this.A02, 3, false);
        C162417s1.A06(parcel, A002);
    }
}
