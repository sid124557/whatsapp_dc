package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Ta  reason: invalid class name and case insensitive filesystem */
public final class C127716Ta extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164567vf();
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public boolean A05;

    public C127716Ta(float f, int i, int i2, int i3, boolean z, boolean z2) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A04 = z;
        this.A05 = z2;
        this.A00 = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A01);
        C162417s1.A07(parcel, 3, this.A02);
        C162417s1.A07(parcel, 4, this.A03);
        C162417s1.A09(parcel, 5, this.A04);
        C162417s1.A09(parcel, 6, this.A05);
        C162417s1.A05(parcel, this.A00, 7);
        C162417s1.A06(parcel, A002);
    }

    public C127716Ta() {
    }
}
