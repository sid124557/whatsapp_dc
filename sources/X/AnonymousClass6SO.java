package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6SO  reason: invalid class name */
public final class AnonymousClass6SO extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164577vg();
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public AnonymousClass6SO(float f, float f2, int i, int i2) {
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A03);
        C162417s1.A05(parcel, this.A00, 2);
        C162417s1.A05(parcel, this.A01, 3);
        C162417s1.A07(parcel, 4, this.A02);
        C162417s1.A06(parcel, A002);
    }
}
