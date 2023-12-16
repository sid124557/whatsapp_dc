package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: X.5dz  reason: invalid class name and case insensitive filesystem */
public final class C109045dz implements Parcelable, C1223664c {
    public static final Parcelable.Creator CREATOR = new C165257wm();
    public long A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (obj == null || !C162457s7.A0P(obj.getClass(), C109045dz.class)) {
            return false;
        }
        C109045dz r4 = (C109045dz) obj;
        return this == r4 || (C162457s7.A0P(this.A02, r4.A02) && C162457s7.A0P(this.A01, r4.A01));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A00);
    }

    public long BDf() {
        return this.A00;
    }

    public int describeContents() {
        return 0;
    }

    public C109045dz(long j, String str, String str2, String str3) {
        C18260x0.A0Q(str, str2);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = j;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A01;
        A0M[1] = this.A02;
        return Objects.hash(A0M);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DirectoryRecentCategorySearch(categoryName=");
        A0o.append(this.A02);
        A0o.append(", categoryId=");
        A0o.append(this.A01);
        A0o.append(", parentCategory=");
        A0o.append(this.A03);
        A0o.append(", timeAdded=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
