package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5da  reason: invalid class name and case insensitive filesystem */
public final class C108805da implements Parcelable {
    public static final C108805da A04 = new C108805da(C108615dH.A04, (String) null, (String) null, (String) null);
    public static final Parcelable.Creator CREATOR = new AnonymousClass91V(96);
    public final C108615dH A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C108805da(C108615dH r2, String str, String str2, String str3) {
        C162457s7.A0J(r2, 4);
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = r2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AnonymousClass001.A1a(obj, C108805da.class)) {
            return false;
        }
        C108805da r4 = (C108805da) obj;
        if (!C162457s7.A0P(this.A01, r4.A01) || !C162457s7.A0P(this.A03, r4.A03) || !C162457s7.A0P(this.A02, r4.A02)) {
            return false;
        }
        return this.A00.equals(r4.A00);
    }

    public int hashCode() {
        int i = 0;
        int A042 = ((C86624Kv.A04(this.A01) * 31) + C86624Kv.A04(this.A03)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return AnonymousClass002.A02(this.A00, (A042 + i) * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A03);
        A0o.append(' ');
        A0o.append(this.A02);
        A0o.append(' ');
        return AnonymousClass000.A0R(this.A00, A0o);
    }
}
