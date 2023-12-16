package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5dx  reason: invalid class name and case insensitive filesystem */
public final class C109025dx implements Parcelable, C1223664c {
    public static final Parcelable.Creator CREATOR = new C165267wn();
    public long A00;
    public final String A01;

    public C109025dx(String str, long j) {
        C162457s7.A0J(str, 1);
        this.A01 = str;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (obj == null || !C162457s7.A0P(obj.getClass(), C109025dx.class)) {
            return false;
        }
        C109025dx r4 = (C109025dx) obj;
        return this == r4 || C162457s7.A0P(this.A01, r4.A01);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeLong(this.A00);
    }

    public long BDf() {
        return this.A00;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DirectoryRecentSearchQuery(searchQuery=");
        A0o.append(this.A01);
        A0o.append(", timeAdded=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
