package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6SE  reason: invalid class name */
public class AnonymousClass6SE extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164327vH();
    public final int A00;
    public final String A01;
    public final byte[] A02;

    public AnonymousClass6SE(String str, byte[] bArr, int i) {
        this.A01 = str;
        this.A02 = bArr;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0E(parcel, this.A02, 3, C1695389r.A07(parcel, this.A01));
        C162417s1.A07(parcel, 4, this.A00);
        C162417s1.A06(parcel, A002);
    }
}
