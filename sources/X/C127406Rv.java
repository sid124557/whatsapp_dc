package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: X.6Rv  reason: invalid class name and case insensitive filesystem */
public final class C127406Rv extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164697vs();
    public final int A00;
    public final ParcelFileDescriptor A01;

    public C127406Rv(ParcelFileDescriptor parcelFileDescriptor, int i) {
        this.A00 = i;
        this.A01 = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A00);
        C1695389r.A03(parcel, this.A01, i, A002);
    }
}
