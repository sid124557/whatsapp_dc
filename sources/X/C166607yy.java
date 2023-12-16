package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yy  reason: invalid class name and case insensitive filesystem */
public final class C166607yy implements Parcelable, C177618gA {
    public static final C166607yy A03 = new C166607yy(new C166617yz[0]);
    public static final C177608g9 CREATOR = new AnonymousClass91W(2);
    public int A00;
    public final int A01;
    public final C129586aY A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C166607yy.class != obj.getClass()) {
                return false;
            }
            C166607yy r5 = (C166607yy) obj;
            if (this.A01 != r5.A01 || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = this.A02.hashCode();
        this.A00 = hashCode;
        return hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A01;
        parcel.writeInt(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            parcel.writeParcelable((Parcelable) this.A02.get(i3), 0);
        }
    }

    public C166607yy(C166617yz... r2) {
        this.A02 = C129586aY.copyOf((Object[]) r2);
        this.A01 = r2.length;
    }
}
