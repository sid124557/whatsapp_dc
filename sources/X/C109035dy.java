package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5dy  reason: invalid class name and case insensitive filesystem */
public final class C109035dy implements Parcelable, C1223664c {
    public static final Parcelable.Creator CREATOR = new C165247wl();
    public long A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C109035dy(long j, String str, String str2, String str3) {
        C18260x0.A0a(str, str2, str3, 2);
        this.A00 = j;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public boolean equals(Object obj) {
        if (obj == null || !C162457s7.A0P(obj.getClass(), C109035dy.class)) {
            return false;
        }
        C109035dy r4 = (C109035dy) obj;
        return this == r4 || C162457s7.A0P(this.A03, r4.A03);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public long BDf() {
        return this.A00;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return this.A03.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DirectoryBusinessProfileRecentSearch(timeAdded=");
        A0o.append(this.A00);
        A0o.append(", businessName=");
        A0o.append(this.A01);
        A0o.append(", categories=");
        A0o.append(this.A02);
        A0o.append(", jid=");
        return C18260x0.A07(this.A03, A0o);
    }
}
