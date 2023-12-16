package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Rl  reason: invalid class name and case insensitive filesystem */
public class C127306Rl extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163427tn();
    public final boolean A00;
    public final byte[] A01;

    public C127306Rl(byte[] bArr, boolean z) {
        this.A01 = bArr;
        this.A00 = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0E(parcel, this.A01, 1, false);
        C162417s1.A09(parcel, 2, this.A00);
        C162417s1.A06(parcel, A002);
    }
}
