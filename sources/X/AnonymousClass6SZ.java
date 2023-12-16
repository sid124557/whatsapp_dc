package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6SZ  reason: invalid class name */
public final class AnonymousClass6SZ extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164837w6();
    public final int A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public final String toString() {
        Object valueOf;
        int i = this.A00;
        String str = this.A01;
        byte[] bArr = this.A03;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String valueOf2 = String.valueOf(valueOf);
        StringBuilder A0Y = AnonymousClass6CA.A0Y(AnonymousClass6C7.A06(str) + 43 + valueOf2.length());
        A0Y.append("MessageEventParcelable[");
        A0Y.append(i);
        C18320x8.A1K(A0Y);
        A0Y.append(str);
        A0Y.append(", size=");
        return AnonymousClass000.A0W(valueOf2, A0Y);
    }

    public AnonymousClass6SZ(String str, String str2, byte[] bArr, int i) {
        this.A00 = i;
        this.A01 = str;
        this.A03 = bArr;
        this.A02 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A00);
        C162417s1.A0B(parcel, this.A01, 3, false);
        C162417s1.A0E(parcel, this.A03, 4, false);
        C162417s1.A0B(parcel, this.A02, 5, false);
        C162417s1.A06(parcel, A002);
    }
}
